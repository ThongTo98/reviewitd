create database DbReview
drop database DbReview
use DbReview
--drop table PhongBan
create table PhongBan(
mapb char(10),
tenpb nvarchar(30),
tentruongphong nvarchar(30)
primary key( mapb)
)
--drop table NhanVien
create table NhanVien (
manv char(10),
hoten nvarchar(30),
ngaysinh char(10),
taikhoan nvarchar(30),
matkhau  char(10),
chucvu nvarchar(30),
mapb char(10)
primary key (manv)
foreign key (mapb) references PhongBan (mapb)
)
 -- drop table Donxinnghi
create table Donxinnghi(
madon char(10),
ngaybatdau char(10),
ngayketthuc char(10),
manv char(10),
--mapb char(10)
--foreign key (mapb) references PhongBan (mapb)

foreign key (manv) references NhanVien (manv)
)

insert into  PhongBan 
values ('Pb01','Kinh Doanh','Thanh Huy'),
('Pb02','Phong Dev','Khac Tuong'),
('Pb03','Phong Test','Thanh Huy')

select *
from PhongBan


insert into NhanVien
values 	('NV02','Tien pham','20/06/1997','NV2','321','nhan vien','Pb01'),
		('NV03','Thanh Huy','03/07/2000','NV3','312','truong phong','Pb01'),
		('NV04','Khac Tuong','20/07/1996','NV4','213','truong phong','Pb02'),
		('NV05','Bao Huy','12/07/2001','NV5','456','nhan vien','Pb03')

select *
from NhanVien