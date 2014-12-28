Create Database IPORTLIB2;
go
Use IPORTLIB2;
go
--Table Trang thai
Create Table Statuses
(
	StatusId int identity(1, 1) primary key,
	StatusName nvarchar(128) not null
)
go
Insert Statuses Values('delete')
Insert Statuses Values('activity')
Insert Statuses Values('disable')
go
--Table Cau hinh
Create Table Configs
(
	ConfigId int not null identity(1, 1) primary key,
	ConfigName nvarchar(128) not null,
	DataType varchar(8) not null,
	Value varchar(16) not null,
	StatusId int not null references Statuses(StatusId)
)
go
--Table Quoc gia
Create Table Countries
(
	CountryId int not null identity(1, 1) primary key,
	CountryName nvarchar(128)
)
go
--Tinh thanh
--Drop Table Provinces;
Create Table Provinces
(
	ProvinceId int not null identity(1, 1) primary key,
	CountryId int not null references Countries(CountryId),
	ProvinceNo varchar(8),
	ProvinceName nvarchar(128) not null
)
go
--Nha cung cap
Create Table Suppliers
(
	SupplierId int not null identity(1, 1) primary key,
	SupplierName nvarchar(256) not null,
	Address nvarchar(256),
	ProvinceId int not null references Provinces(ProvinceId),
	Email varchar(128),
	WebPage varchar(128),
	Phone varchar(16),
	AccountName nvarchar(128),
	BankName varchar(128),
	TaxCode varchar(16)
)
go
--Nha xuat ban
Create Table Publishers
(
	PublisherId int not null identity(1, 1) primary key,
	PublisherName nvarchar(256) not null,
	Note varchar(512)
)
go

--Tac gia hay nhom tac gia
Create Table Authors
(
	AuthorId int not null identity(1, 1) primary key,
	AuthorNo varchar(16) null,
	AuthorName nvarchar(256) not null,
	Note nvarchar(512)
)
go
--Table De muc
Create Table Topics
(
	TopicId int not null identity(1, 1) primary key,
	TopicName nvarchar(256) not null,
	Note nvarchar(512)
)
go
Create Table PublicationTypes
(
	PublicationTypeId int not null identity(1, 1) primary key,
	PublicationTypeName nvarchar(64) not null
)
go
--Don vi tinh
Create Table Units
(
	UnitId int not null identity(1, 1) primary key,
	UnitName nvarchar(128) not null
)
--Tien te
Create Table Currencies
(
	CurrencyId int not null identity(1, 1) primary key,
	CurrencyName nvarchar(64) not null
)
go
--Chuyen nghanh
Create Table Majors
(
	MajorId int not null identity(1, 1) primary key,
	MajorName nvarchar(128) not null
)
go
--Ngon ngu
Create Table Languages
(
	LanguageId int not null identity(1, 1) primary key,
	LanguageName nvarchar(128) not null
)
go
--An pham
Create Table Publications
(
	PublicationId int not null identity(1, 1) primary key,
	TopicId int not null references Topics(TopicId),
	AuthorId int not null references Authors(AuthorId),
	PublisherId int not null references Publishers(PublisherId),
	PublicationTypeId int not null references PublicationTypes(PublicationTypeId),
	MajorId int not null references Majors(MajorId),
	LanguageId int not null references Languages(LanguageId),
	Title nvarchar(256) not null,
	SubTitle nvarchar(256),
	PublisherYear int not null,
	Edition int,
	Copyright nvarchar(128),
	Description nvarchar(512),
	Size varchar(64),
	UnitId int not null references Units(UnitId),
	Price int not null,
	CurrencyId int not null references Currencies(CurrencyId),
	Quantity int not null,
	NumberDewey varchar(32),
	ISBN varchar(16),
	Note nvarchar(512),
)
go
--Kho luu tru
Create Table Stores
(
	StoreId int not null identity(1, 1) primary key,
	StoreName nvarchar(128) not null
)
go
--Sach
Create Table Books
(
	BookId int not null identity(1, 1) primary key,
	PublicationId int not null references Publications(PublicationId),
	StoreId int not null references Stores(StoreId),
	NumberSpecific varchar(16) not null,
	Status bit not null default 0
)
go

--Table Khoa
--Drop Table Departments;
Create Table Departments
(
	DepartmentId int not null primary key,
	DepartmentName nvarchar(128) not null
)
go
--Table Nhom
Create Table Groups
(
	GroupId int not null identity(1, 1) primary key,
	GroupName nvarchar(128) not null
)
go
--Loai tap tin dinh kem
Create Table AttachmentTypes
(
	AttachmentTypeId int not null identity(1, 1) primary key,
	AttachmentTypeName nvarchar(128)
)
go
--Table Tap tin dinh kem
Create Table Attachments
(
	AttachmentId int not null identity(1, 1) primary key,
	Url nvarchar(128) not null,
	AttachmentTypeId int not null references AttachmentTypes(AttachmentTypeId)
)
go
--Drop Table Users;
Create Table Users
(
	UserId int not null identity(1, 1) primary key,
	DepartmentId int not null references Departments(DepartmentId),
	ProvinceId int references Provinces(ProvinceId),
	GroupId int not null references Groups(GroupId),
	AttachmentId int references Attachments(AttachmentId),
	UserNo varchar(8) not null unique,--MSSV
	FirstName nvarchar(64) not null,
	LastName nvarchar(32) not null,
	Gender bit,
	BirthDay date,
	Address nvarchar(256),
	Phone varchar(16),
	IdentityCard varchar(16),
	Email varchar(128)
)
go


Create Table CardUsers
(
	CardUserId int not null identity(1, 1) primary key,
	UserId int not null references Users(UserId),
	CardUserNo varchar(16) not null,
	UserName nvarchar(16) not null,
	Password nvarchar(32) not null,
	Status bit not null default 0,
	DueDate date not null
)
go

--Phieu muon sach
Create Table Loans
(
	LoanId int not null identity(1, 1) primary key,
	DateCreated datetime not null,
	UserId int not null references Users(UserId)
)
go
--Chi tiet phieu muon sach
Create Table LoanDetails
(
	LoanDetailId int identity(1, 1) primary key,
	LoanId int not null references Loans(LoanId),
	BookId int not null references Books(BookId),
	DateLoan datetime not null,
	DatePay datetime,
	unique (LoanId, BookId)
)
go

----------------------------------------------------------------
--				Duy Tân				
----------------------------------------------------------------
-- An Pham Can Mua
Create Table PurchasePublications
(
	PurPubId int not null identity(1, 1) primary key,
	TopicId int not null references Topics(TopicId), -- Chu de
	AuthorId int not null references Authors(AuthorId), -- Tac gia
	PublisherId int not null references Publishers(PublisherId), -- Nha phat hanh
	PublicationTypeId int not null references PublicationTypes(PublicationTypeId), -- Xuat Ban
	MajorId int not null references Majors(MajorId), -- Chuyen nganh
	LanguageId int not null references Languages(LanguageId), -- Ngon ngu
	Title nvarchar(256) not null, -- Tieu de
	SubTitle nvarchar(256), -- Phu de 
	PublisherYear int not null, -- Nam xuat ban
	Description nvarchar(512), -- Mieu ta.
	Quantity int not null, -- So luong
	Note nvarchar(512), -- Ghi chu
	StatusId int not null references Statuses(StatusId) -- Trang thai // Da mua, Chua mua, Huy.
)

-- Lich Nguyen
GO

CREATE TABLE NotificationTypes
(
	NotiTypeID INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	Name VARCHAR(128) NOT NULL
)

GO

CREATE TABLE Notifications
(
	NoID INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	NotiTypeID INT NOT NULL REFERENCES NotificationTypes(NotiTypeID),
	LoanDetailsID INT NOT NULL REFERENCES LoanDetails(LoanDetailId),
	UserId INT NOT NULL REFERENCES Users(UserId),
	Title nvarchar(256) NOT NULL,
	Created DATETIME
)