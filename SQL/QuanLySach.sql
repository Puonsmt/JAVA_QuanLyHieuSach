----Tao DATABASE-------
---buoc 1-------
CREATE DATABASE CUAHANGSACH COLLATE Latin1_General_100_CI_AS_SC_UTF8;
GO
USE CUAHANGSACH
GO

---buoc 2----------
--tao ham auto id
CREATE FUNCTION AUTO_ID (@prefix varchar(255), @NUM INT, @NUM2 INT)
RETURNS varchar(255)
AS
BEGIN
	DECLARE @ID varchar(255)
	SET @ID = @prefix + RIGHT('0000000' + CAST(@NUM AS VARCHAR(4)), @NUM2) 
	RETURN @ID
END


----bước 3---------------
--tao sequence id cho tung table -> de luu xem da luu den ma so bao nhieu roi
CREATE SEQUENCE SEQ_SACH
    START WITH 0
    INCREMENT BY 1;

CREATE SEQUENCE SEQ_NHANVIEN
    START WITH 0
    INCREMENT BY 1;

CREATE SEQUENCE SEQ_KHACHHANG
    START WITH 0
    INCREMENT BY 1;
CREATE SEQUENCE SEQ_HOADON
    START WITH 0
    INCREMENT BY 1;
CREATE SEQUENCE SEQ_TAIKHOAN
    START WITH 0
    INCREMENT BY 1;



--buoc 4--------
--tạo các bảng, đi kèm với auto id 
CREATE TABLE SACH
(	
	ID_Sach varchar(255) PRIMARY KEY DEFAULT DBO.AUTO_ID('S', NEXT VALUE FOR SEQ_SACH, 3),
	TenSach nvarchar(255) NOT NULL,
	SoLuong int DEFAULT 0,
	GiaBan int DEFAULT 0,
	TheLoai nvarchar(255) NOT NULL,
	TenTG nvarchar(255) NOT NULL,
	TenNXB nvarchar(255) NOT NULL,
)


CREATE TABLE KHACHHANG
(
	ID_KH varchar(255) PRIMARY KEY DEFAULT DBO.AUTO_ID('KH', NEXT VALUE FOR SEQ_KHACHHANG, 3),
	TenKH nvarchar(255) NOT NULL,
	GioiTinh nvarchar(255) NOT NULL,
	NgaySinh date NOT NULL,
	DiaChi nvarchar(255) NOT NULL,
	Email nvarchar(255) NOT NULL,
	SDT varchar(255) NOT NULL,
)

CREATE TABLE NHANVIEN
(
	ID_NV varchar(255) PRIMARY KEY DEFAULT DBO.AUTO_ID('NV', NEXT VALUE FOR SEQ_NHANVIEN, 2),
	TenNV nvarchar(255) NOT NULL,
	GioiTinh nvarchar(255) NOT NULL,
	NgaySinh date NOT NULL,
	DiaChi nvarchar(255) NOT NULL,
	SDT varchar(255) NOT NULL,
)

CREATE TABLE HOADON
(
	ID_HoaDon varchar(255) PRIMARY KEY DEFAULT DBO.AUTO_ID('HD', NEXT VALUE FOR SEQ_HOADON, 4),
	ID_KH varchar(255) FOREIGN KEY REFERENCES KHACHHANG(ID_KH),
	ID_NV varchar(255) FOREIGN KEY REFERENCES NHANVIEN(ID_NV),
	NgayXuat date NOT NULL,
)

CREATE TABLE CHI_TIET_HOA_DON
(
	ID_HoaDon varchar(255) FOREIGN KEY REFERENCES HOADON(ID_HoaDon),
	ID_Sach varchar(255) FOREIGN KEY REFERENCES SACH(ID_Sach),
	SoLuong int DEFAULT 0,
	PRIMARY KEY(ID_HoaDon, ID_Sach)
)

CREATE TABLE TAIKHOAN
(
	ID_TK varchar(255) PRIMARY KEY DEFAULT DBO.AUTO_ID('TK', NEXT VALUE FOR SEQ_TAIKHOAN, 2),
	LoaiTaiKhoan nvarchar(255) CHECK (LoaiTaiKhoan IN ('Admin', 'Staff')),
	ID_NV varchar(255) FOREIGN KEY REFERENCES NHANVIEN(ID_NV),
	TenDangNhap varchar(255),
	MatKhau varchar(255),
)

----buoc 5---------------------------
----tạo hàm để bulk insert--------------------------------------
CREATE PROCEDURE ImportDataFromCSV
    @FilePath nvarchar(255),
    @TableName nvarchar(255)
AS
BEGIN
    DECLARE @SqlCmd nvarchar(MAX);

    SET @SqlCmd = 'BULK INSERT ' + QUOTENAME(@TableName) + ' ' +
                  'FROM ''' + @FilePath + ''' ' +
                  'WITH (FORMAT = ''CSV'', FIELDTERMINATOR = '','', ROWTERMINATOR = ''\n'', FIRSTROW = 2, CODEPAGE = ''65001'')';

    EXEC sp_executesql @SqlCmd;
END;
--kiểu date trong sqlserver có form yyyy-mm-dd 
--nên data import vào cho định dạng thế luôn (thích nhập dd-mm-yyyy thì thêm 1 bước chuyển)
--data import vào phải thỏa mãn ràng buộc của foreign key

--csv file path copy từ trong máy
------GOI THEO CSV-FILEPATH, TABLE-NAME TUONG UNG-----
--bước 6----
--import data từ file csv
EXEC ImportDataFromCSV 'E:\DATA\NEW\SACH.csv', 'SACH';
EXEC ImportDataFromCSV 'E:\DATA\NEW\KHACHHANG.csv', 'KHACHHANG';
EXEC ImportDataFromCSV 'E:\DATA\NEW\NHANVIEN.csv', 'NHANVIEN';
EXEC ImportDataFromCSV 'E:\DATA\NEW\HOADON.csv', 'HOADON';
EXEC ImportDataFromCSV 'E:\DATA\NEW\CHI_TIET_HOA_DON.csv', 'CHI_TIET_HOA_DON';
EXEC ImportDataFromCSV 'E:\DATA\NEW\TAIKHOAN.csv', 'TAIKHOAN';

-----bước 7-----
---update seq theo data vua bulk insert
DECLARE @RestartValue INT;
DECLARE @SQL NVARCHAR(MAX);
------
SELECT @RestartValue = COUNT(*) FROM SACH;
SET @SQL = 'ALTER SEQUENCE SEQ_SACH RESTART WITH ' + CAST(@RestartValue + 1 AS NVARCHAR(20));
EXEC sp_executesql @SQL;
------
SELECT @RestartValue = COUNT(*) FROM KHACHHANG;
SET @SQL = 'ALTER SEQUENCE SEQ_KHACHHANG RESTART WITH ' + CAST(@RestartValue + 1 AS NVARCHAR(20));
EXEC sp_executesql @SQL;
------
SELECT @RestartValue = COUNT(*) FROM NHANVIEN;
SET @SQL = 'ALTER SEQUENCE SEQ_NHANVIEN RESTART WITH ' + CAST(@RestartValue + 1 AS NVARCHAR(20));
EXEC sp_executesql @SQL;
------
SELECT @RestartValue = COUNT(*) FROM HOADON;
SET @SQL = 'ALTER SEQUENCE SEQ_HOADON RESTART WITH ' + CAST(@RestartValue + 1 AS NVARCHAR(20));
EXEC sp_executesql @SQL;
------
SELECT @RestartValue = COUNT(*) FROM TAIKHOAN;
SET @SQL = 'ALTER SEQUENCE SEQ_TAIKHOAN RESTART WITH ' + CAST(@RestartValue + 1 AS NVARCHAR(20));
EXEC sp_executesql @SQL;


------Kiểm tra lại data ở các table-------------
SELECT * FROM SACH
SELECT * FROM KHACHHANG
SELECT * FROM NHANVIEN
SELECT * FROM HOADON
SELECT * FROM CHI_TIET_HOA_DON
SELECT * FROM TAIKHOAN

-------------LAM SAI THI DELETE LAM LAI-------------------
USE master
GO
DROP DATABASE CUAHANGSACH

------------------QUERY-----------------------------------------
---tinh tong hoa don theo ma hoa don--------------------------
CREATE FUNCTION TinhTongHoaDon(@ID_HoaDon varchar(255))
RETURNS int
AS
BEGIN
	DECLARE @sum INT
	SELECT @sum = SUM(cthd.SoLuong * s.GiaBan)
    FROM CHI_TIET_HOA_DON cthd
    INNER JOIN SACH s ON CTHD.ID_Sach = s.ID_Sach
    WHERE cthd.ID_HoaDon = @ID_HoaDon
	RETURN ISNULL(@sum, 0)
END

SELECT DBO.TinhTongHoaDon('HD0001')

-----xoa mot hoa don theo ma hoa don------------------------
CREATE PROCEDURE XoaHoaDon
    @ID_HoaDon varchar(255)
AS
BEGIN
    DELETE FROM CHI_TIET_HOA_DON
    WHERE ID_HoaDon = @ID_HoaDon;
	DELETE FROM HOADON
    WHERE ID_HoaDon = @ID_HoaDon;
END;

EXEC XoaHoaDon @ID_HoaDon = 'HD0005';

-------tao hoa don --------------
CREATE PROCEDURE TaoHoaDon
    @ID_KH varchar(255),
	@ID_NV varchar(255),
	@NgayTao date
AS
BEGIN
	DECLARE @ID int;
	INSERT INTO HOADON 
	VALUES (DEFAULT, @ID_KH, @ID_NV, @NgayTao)
END;

EXEC TaoHoaDon @ID_KH = 'KH002', @ID_NV = 'NV05', @NgayTao = '2023-11-27';

----------------tra ve id hoa don vua insert------------
CREATE FUNCTION LayID_HoaDonVuaTao()
RETURNS varchar(255)
AS
BEGIN
	DECLARE @ID int	;
	SELECT @ID = MAX(CAST (RIGHT(ID_HoaDon, 4) AS INT)) FROM HOADON;
	RETURN 'HD' + RIGHT('0000000' + CAST(@ID AS VARCHAR(255)), 4) 
END;

SELECT dbo.LayID_HoaDonVuaTao()


--------------------------------------ĐOẠN NÀY LÀ NHÁP, DÙNG ĐỂ CHẠY THỬ---------------------------------------------------
 --insert them 1 quyen sach
INSERT INTO SACH
VALUES (DEFAULT, N'Harry Potter', 10, 100000, N'Tiểu thuyết', N'J K Rowling', N'NXB Trẻ') 
INSERT INTO SACH
VALUES (DEFAULT, N'Harry Potter', 10, 100000, N'Tiểu thuyết', N'J K Rowling', N'NXB Trẻ') 
SELECT SCOPE_IDENTITY() 

INSERT INTO KHACHHANG
VALUES (DEFAULT, N'NGUYEN MAI PHUONG', N'Nữ', '1990-01-02', N'Hà Đông, Hà Nội', N'alo@gmail.com', N'030309499')

INSERT INTO HOADON
VALUES (DEFAULT, 'KH001', 'NV01', '2023-10-11')

TRUNCATE TABLE SACH
--thêm một loại sách mới hay thêm số lượng sách?(nhập về)

INSERT INTO CHI_TIET_HOA_DON
VALUES ('HD0010', 'S003', 3)

SELECT NEXT VALUE FOR SEQ_SACH
