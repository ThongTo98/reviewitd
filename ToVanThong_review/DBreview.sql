create database DbReview 
use DbReview
create table NhanVien (
maso char(10),
hoten nvarchar(30),
ngaysinh date,
taikhoan nvarchar(30),
matkhau  char(10),
chucvu nvarchar(30),
 id int 
)


insert  into NhanVien()
values ('001','To Van Thong','2000-07-20','quanLy','123','qL',1),
		('002','Tran Bao Nam','2000-07-20','nhanvientest','nv','321',2),
		('003','Ly Phi Hung','2000-07-20','nhanvientest','nv','132',2),
		('004','Thong To Van','2000-07-20','nhanvientest','nv','312',2)
select * 
from NhanVien

