--ANSII
--Select--> Bir veri kaynağındanki datayı çekmek için kullanılan yapıdır
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

--Where--> Koşul demek -- Metinler ANSII standartlarında tek tırnak ('') ile yazılır
Select * from Customers where City = 'Berlin'

--case insensitive--> büyük küçük harf duyarsız Select yada seLECt olabilir
select * from Products where categoryId=1 or categoryId=3

select * from Products where categoryId=1 and UnitPrice>=10

--order by--> sırala demek
select * from Products where categoryId=1 order by UnitPrice desc ---ascending->artan -- descending-> azalan

--Tüm satırları say demek
Select count(*) Adet from Products


select CategoryID,count(*) from products where UnitPrice>20 
group by CategoryID having count(*)<10


select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO Data Transformation Object

--- left join solda olup sağda olmayanları da getir demek
Select * from Products p inner join [Order Details] od   
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID


Select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

