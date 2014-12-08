Create Procedure GetConfigs 
as
	 Select ConfigId, ConfigName, DataType, Value, StatusId from Configs;
Go
Create Procedure GetConfigById
(
	@ConfigId int
)
as
	 Select ConfigId, ConfigName, DataType, Value, StatusId from Configs where ConfigId = @ConfigId;
Go
Create Procedure InsertConfig
(
	@ConfigId int output,
	@ConfigName nvarchar(128),
	@DataType varchar(8),
	@Value varchar(16),
	@StatusId int
)
as
	Insert into Configs (ConfigName, DataType, Value, StatusId) values(@ConfigName, @DataType, @Value, @StatusId);
	Set @ConfigId = SCOPE_IDENTITY();
Go
Create Procedure UpdateConfig
(
	@ConfigId int,
	@ConfigName nvarchar(128),
	@DataType varchar(8),
	@Value varchar(16),
	@StatusId int
)
as
	 Update Configs Set ConfigName = @ConfigName, DataType = @DataType, Value = @Value, StatusId = @StatusId where ConfigId = @ConfigId;
Go
Create Procedure DeleteConfig
(
	@ConfigId int
)
as
	Delete from Configs where ConfigId = @ConfigId;
Go
Create Procedure CountConfigs
as
	Select COUNT(*) from Configs;
go
Create Procedure GetCountries 
as
	 Select CountryId, CountryName from Countries;
Go
Create Procedure GetCountryById
(
	@CountryId int
)
as
	 Select CountryId, CountryName from Countries where CountryId = @CountryId;
Go
Create Procedure InsertCountry
(
	@CountryId int output,
	@CountryName nvarchar(128)
)
as
	Insert into Countries (CountryName) values(@CountryName);
	Set @CountryId = SCOPE_IDENTITY();
Go
Create Procedure UpdateCountry
(
	@CountryId int,
	@CountryName nvarchar(128)
)
as
	 Update Countries Set CountryName = @CountryName where CountryId = @CountryId;
Go
Create Procedure DeleteCountry
(
	@CountryId int
)
as
	Delete from Countries where CountryId = @CountryId;
Go
Create Procedure CountCountries
as
	Select COUNT(*) from Countries;
go
Create Procedure GetProvinces 
as
	 Select ProvinceId, CountryId, ProvinceNo, ProvinceName from Provinces;
Go
Create Procedure GetProvinceById
(
	@ProvinceId int
)
as
	 Select ProvinceId, CountryId, ProvinceNo, ProvinceName from Provinces where ProvinceId = @ProvinceId;
Go
Create Procedure InsertProvince
(
	@ProvinceId int output,
	@CountryId int,
	@ProvinceNo varchar(8),
	@ProvinceName nvarchar(128)
)
as
	Insert into Provinces (CountryId, ProvinceNo, ProvinceName) values(@CountryId, @ProvinceNo, @ProvinceName);
	Set @ProvinceId = SCOPE_IDENTITY();
Go
Create Procedure UpdateProvince
(
	@ProvinceId int,
	@CountryId int,
	@ProvinceNo varchar(8),
	@ProvinceName nvarchar(128)
)
as
	 Update Provinces Set CountryId = @CountryId, ProvinceNo = @ProvinceNo, ProvinceName = @ProvinceName where ProvinceId = @ProvinceId;
Go
Create Procedure DeleteProvince
(
	@ProvinceId int
)
as
	Delete from Provinces where ProvinceId = @ProvinceId;
Go
Create Procedure CountProvinces
as
	Select COUNT(*) from Provinces;
go
Create Procedure GetSuppliers 
as
	 Select SupplierId, SupplierName, Address, ProvinceId, Email, WebPage, Phone, AccountName, BankName, TaxCode from Suppliers;
Go
Create Procedure GetSupplierById
(
	@SupplierId int
)
as
	 Select SupplierId, SupplierName, Address, ProvinceId, Email, WebPage, Phone, AccountName, BankName, TaxCode from Suppliers where SupplierId = @SupplierId;
Go
Create Procedure InsertSupplier
(
	@SupplierId int output,
	@SupplierName nvarchar(256),
	@Address nvarchar(256),
	@ProvinceId int,
	@Email varchar(128),
	@WebPage varchar(128),
	@Phone varchar(16),
	@AccountName nvarchar(128),
	@BankName varchar(128),
	@TaxCode varchar(16)
)
as
	Insert into Suppliers (SupplierName, Address, ProvinceId, Email, WebPage, Phone, AccountName, BankName, TaxCode) values(@SupplierName, @Address, @ProvinceId, @Email, @WebPage, @Phone, @AccountName, @BankName, @TaxCode);
	Set @SupplierId = SCOPE_IDENTITY();
Go
Create Procedure UpdateSupplier
(
	@SupplierId int,
	@SupplierName nvarchar(256),
	@Address nvarchar(256),
	@ProvinceId int,
	@Email varchar(128),
	@WebPage varchar(128),
	@Phone varchar(16),
	@AccountName nvarchar(128),
	@BankName varchar(128),
	@TaxCode varchar(16)
)
as
	 Update Suppliers Set SupplierName = @SupplierName, Address = @Address, ProvinceId = @ProvinceId, Email = @Email, WebPage = @WebPage, Phone = @Phone, AccountName = @AccountName, BankName = @BankName, TaxCode = @TaxCode where SupplierId = @SupplierId;
Go
Create Procedure DeleteSupplier
(
	@SupplierId int
)
as
	Delete from Suppliers where SupplierId = @SupplierId;
Go
Create Procedure CountSuppliers
as
	Select COUNT(*) from Suppliers;
go
Create Procedure GetPublishers 
as
	 Select PublisherId, PublisherName, Note from Publishers;
Go
Create Procedure GetPublisherById
(
	@PublisherId int
)
as
	 Select PublisherId, PublisherName, Note from Publishers where PublisherId = @PublisherId;
Go
Create Procedure InsertPublisher
(
	@PublisherId int output,
	@PublisherName nvarchar(256),
	@Note varchar(512)
)
as
	Insert into Publishers (PublisherName, Note) values(@PublisherName, @Note);
	Set @PublisherId = SCOPE_IDENTITY();
Go
Create Procedure UpdatePublisher
(
	@PublisherId int,
	@PublisherName nvarchar(256),
	@Note varchar(512)
)
as
	 Update Publishers Set PublisherName = @PublisherName, Note = @Note where PublisherId = @PublisherId;
Go
Create Procedure DeletePublisher
(
	@PublisherId int
)
as
	Delete from Publishers where PublisherId = @PublisherId;
Go
Create Procedure CountPublishers
as
	Select COUNT(*) from Publishers;
go

Create Procedure GetAuthors
(
	@PageIndex int,
	@PageSize int
)
as
	 Select * from (Select ROW_NUMBER() over (order by AuthorId desc) as RowNumber, AuthorId, AuthorNo, AuthorName, Note from Authors) as Reader
	 where Reader.RowNumber between @PageIndex*@PageSize+ 1 and (@PageIndex + 1) * @PageSize; 
Go
Create Procedure GetAuthorById
(
	@AuthorId int
)
as
	 Select AuthorId, AuthorNo, AuthorName, Note from Authors where AuthorId = @AuthorId;
Go

Create Procedure InsertAuthor
(
	@AuthorId int output,
	@AuthorNo varchar(16),
	@AuthorName nvarchar(256),
	@Note nvarchar(512)
)
as
	Insert into Authors (AuthorNo, AuthorName, Note) values(@AuthorNo, @AuthorName, @Note);
	Set @AuthorId = SCOPE_IDENTITY();
Go
Create Procedure UpdateAuthor
(
	@AuthorId int,
	@AuthorNo varchar(16),
	@AuthorName nvarchar(256),
	@Note nvarchar(512)
)
as
	 Update Authors Set AuthorNo = @AuthorNo, AuthorName = @AuthorName, Note = @Note where AuthorId = @AuthorId;
Go
Create Procedure DeleteAuthor
(
	@AuthorId int
)
as
	Delete from Authors where AuthorId = @AuthorId;
Go
Create Procedure CountAuthors
as
	Select COUNT(*) from Authors;
go
--Exec CountAuthors

Create Procedure GetTopics 
as
	 Select TopicId, TopicName, Note from Topics;
Go
Create Procedure GetTopicById
(
	@TopicId int
)
as
	 Select TopicId, TopicName, Note from Topics where TopicId = @TopicId;
Go
Create Procedure InsertTopic
(
	@TopicId int output,
	@TopicName nvarchar(256),
	@Note nvarchar(512)
)
as
	Insert into Topics (TopicName, Note) values(@TopicName, @Note);
	Set @TopicId = SCOPE_IDENTITY();
Go
Create Procedure UpdateTopic
(
	@TopicId int,
	@TopicName nvarchar(256),
	@Note nvarchar(512)
)
as
	 Update Topics Set TopicName = @TopicName, Note = @Note where TopicId = @TopicId;
Go
Create Procedure DeleteTopic
(
	@TopicId int
)
as
	Delete from Topics where TopicId = @TopicId;
Go
Create Procedure CountTopics
as
	Select COUNT(*) from Topics;
go
Create Procedure GetPublicationTypes 
as
	 Select PublicationTypeId, PublicationTypeName from PublicationTypes;
Go
Create Procedure GetPublicationTypeById
(
	@PublicationTypeId int
)
as
	 Select PublicationTypeId, PublicationTypeName from PublicationTypes where PublicationTypeId = @PublicationTypeId;
Go
Create Procedure InsertPublicationType
(
	@PublicationTypeId int output,
	@PublicationTypeName nvarchar(64)
)
as
	Insert into PublicationTypes (PublicationTypeName) values(@PublicationTypeName);
	Set @PublicationTypeId = SCOPE_IDENTITY();
Go
Create Procedure UpdatePublicationType
(
	@PublicationTypeId int,
	@PublicationTypeName nvarchar(64)
)
as
	 Update PublicationTypes Set PublicationTypeName = @PublicationTypeName where PublicationTypeId = @PublicationTypeId;
Go
Create Procedure DeletePublicationType
(
	@PublicationTypeId int
)
as
	Delete from PublicationTypes where PublicationTypeId = @PublicationTypeId;
Go
Create Procedure CountPublicationTypes
as
	Select COUNT(*) from PublicationTypes;
go
Create Procedure GetUnits 
as
	 Select UnitId, UnitName from Units;
Go
Create Procedure GetUnitById
(
	@UnitId int
)
as
	 Select UnitId, UnitName from Units where UnitId = @UnitId;
Go
Create Procedure InsertUnit
(
	@UnitId int output,
	@UnitName nvarchar(128)
)
as
	Insert into Units (UnitName) values(@UnitName);
	Set @UnitId = SCOPE_IDENTITY();
Go
Create Procedure UpdateUnit
(
	@UnitId int,
	@UnitName nvarchar(128)
)
as
	 Update Units Set UnitName = @UnitName where UnitId = @UnitId;
Go
Create Procedure DeleteUnit
(
	@UnitId int
)
as
	Delete from Units where UnitId = @UnitId;
Go
Create Procedure CountUnits
as
	Select COUNT(*) from Units;
go
Create Procedure GetCurrencies 
as
	 Select CurrencyId, CurrencyName from Currencies;
Go
Create Procedure GetCurrencyById
(
	@CurrencyId int
)
as
	 Select CurrencyId, CurrencyName from Currencies where CurrencyId = @CurrencyId;
Go
Create Procedure InsertCurrency
(
	@CurrencyId int output,
	@CurrencyName nvarchar(64)
)
as
	Insert into Currencies (CurrencyName) values(@CurrencyName);
	Set @CurrencyId = SCOPE_IDENTITY();
Go
Create Procedure UpdateCurrency
(
	@CurrencyId int,
	@CurrencyName nvarchar(64)
)
as
	 Update Currencies Set CurrencyName = @CurrencyName where CurrencyId = @CurrencyId;
Go
Create Procedure DeleteCurrency
(
	@CurrencyId int
)
as
	Delete from Currencies where CurrencyId = @CurrencyId;
Go
Create Procedure CountCurrencies
as
	Select COUNT(*) from Currencies;
go
Create Procedure GetMajors 
as
	 Select MajorId, MajorName from Majors;
Go
Create Procedure GetMajorById
(
	@MajorId int
)
as
	 Select MajorId, MajorName from Majors where MajorId = @MajorId;
Go
Create Procedure InsertMajor
(
	@MajorId int output,
	@MajorName nvarchar(128)
)
as
	Insert into Majors (MajorName) values(@MajorName);
	Set @MajorId = SCOPE_IDENTITY();
Go
Create Procedure UpdateMajor
(
	@MajorId int,
	@MajorName nvarchar(128)
)
as
	 Update Majors Set MajorName = @MajorName where MajorId = @MajorId;
Go
Create Procedure DeleteMajor
(
	@MajorId int
)
as
	Delete from Majors where MajorId = @MajorId;
Go
Create Procedure CountMajors
as
	Select COUNT(*) from Majors;
go
Create Procedure GetLanguages 
as
	 Select LanguageId, LanguageName from Languages;
Go
Create Procedure GetLanguageById
(
	@LanguageId int
)
as
	 Select LanguageId, LanguageName from Languages where LanguageId = @LanguageId;
Go
Create Procedure InsertLanguage
(
	@LanguageId int output,
	@LanguageName nvarchar(128)
)
as
	Insert into Languages (LanguageName) values(@LanguageName);
	Set @LanguageId = SCOPE_IDENTITY();
Go
Create Procedure UpdateLanguage
(
	@LanguageId int,
	@LanguageName nvarchar(128)
)
as
	 Update Languages Set LanguageName = @LanguageName where LanguageId = @LanguageId;
Go
Create Procedure DeleteLanguage
(
	@LanguageId int
)
as
	Delete from Languages where LanguageId = @LanguageId;
Go
Create Procedure CountLanguages
as
	Select COUNT(*) from Languages;
go
Create Procedure GetPublications 
as
	 Select PublicationId, TopicId, AuthorId, PublisherId, PublicationTypeId, MajorId, LanguageId, Title, SubTitle, PublisherYear, Edition, Copyright, Description, Size, UnitId, Price, CurrencyId, Quantity, NumberDewey, ISBN, Note from Publications;
Go
Create Procedure GetPublicationById
(
	@PublicationId int
)
as
	 Select PublicationId, TopicId, AuthorId, PublisherId, PublicationTypeId, MajorId, LanguageId, Title, SubTitle, PublisherYear, Edition, Copyright, Description, Size, UnitId, Price, CurrencyId, Quantity, NumberDewey, ISBN, Note from Publications where PublicationId = @PublicationId;
Go
Create Procedure InsertPublication
(
	@PublicationId int output,
	@TopicId int,
	@AuthorId int,
	@PublisherId int,
	@PublicationTypeId int,
	@MajorId int,
	@LanguageId int,
	@Title nvarchar(256),
	@SubTitle nvarchar(256),
	@PublisherYear int,
	@Edition int,
	@Copyright nvarchar(128),
	@Description nvarchar(512),
	@Size varchar(64),
	@UnitId int,
	@Price int,
	@CurrencyId int,
	@Quantity int,
	@NumberDewey varchar(32),
	@ISBN varchar(16),
	@Note nvarchar(512)
)
as
	Insert into Publications (TopicId, AuthorId, PublisherId, PublicationTypeId, MajorId, LanguageId, Title, SubTitle, PublisherYear, Edition, Copyright, Description, Size, UnitId, Price, CurrencyId, Quantity, NumberDewey, ISBN, Note) values(@TopicId, @AuthorId, @PublisherId, @PublicationTypeId, @MajorId, @LanguageId, @Title, @SubTitle, @PublisherYear, @Edition, @Copyright, @Description, @Size, @UnitId, @Price, @CurrencyId, @Quantity, @NumberDewey, @ISBN, @Note);
	Set @PublicationId = SCOPE_IDENTITY();
Go
Create Procedure UpdatePublication
(
	@PublicationId int,
	@TopicId int,
	@AuthorId int,
	@PublisherId int,
	@PublicationTypeId int,
	@MajorId int,
	@LanguageId int,
	@Title nvarchar(256),
	@SubTitle nvarchar(256),
	@PublisherYear int,
	@Edition int,
	@Copyright nvarchar(128),
	@Description nvarchar(512),
	@Size varchar(64),
	@UnitId int,
	@Price int,
	@CurrencyId int,
	@Quantity int,
	@NumberDewey varchar(32),
	@ISBN varchar(16),
	@Note nvarchar(512)
)
as
	 Update Publications Set TopicId = @TopicId, AuthorId = @AuthorId, PublisherId = @PublisherId, PublicationTypeId = @PublicationTypeId, MajorId = @MajorId, LanguageId = @LanguageId, Title = @Title, SubTitle = @SubTitle, PublisherYear = @PublisherYear, Edition = @Edition, Copyright = @Copyright, Description = @Description, Size = @Size, UnitId = @UnitId, Price = @Price, CurrencyId = @CurrencyId, Quantity = @Quantity, NumberDewey = @NumberDewey, ISBN = @ISBN, Note = @Note where PublicationId = @PublicationId;
Go
Create Procedure DeletePublication
(
	@PublicationId int
)
as
	Delete from Publications where PublicationId = @PublicationId;
Go
Create Procedure CountPublications
as
	Select COUNT(*) from Publications;
go
Create Procedure GetStores 
as
	 Select StoreId, StoreName from Stores;
Go
Create Procedure GetStoreById
(
	@StoreId int
)
as
	 Select StoreId, StoreName from Stores where StoreId = @StoreId;
Go
Create Procedure InsertStore
(
	@StoreId int output,
	@StoreName nvarchar(128)
)
as
	Insert into Stores (StoreName) values(@StoreName);
	Set @StoreId = SCOPE_IDENTITY();
Go
Create Procedure UpdateStore
(
	@StoreId int,
	@StoreName nvarchar(128)
)
as
	 Update Stores Set StoreName = @StoreName where StoreId = @StoreId;
Go
Create Procedure DeleteStore
(
	@StoreId int
)
as
	Delete from Stores where StoreId = @StoreId;
Go
Create Procedure CountStores
as
	Select COUNT(*) from Stores;
go
Create Procedure GetBooks 
as
	 Select BookId, PublicationId, StoreId, NumberSpecific, Status from Books;
Go
Create Procedure GetBookById
(
	@BookId int
)
as
	 Select BookId, PublicationId, StoreId, NumberSpecific, Status from Books where BookId = @BookId;
Go
Create Procedure InsertBook
(
	@BookId int output,
	@PublicationId int,
	@StoreId int,
	@NumberSpecific varchar(16),
	@Status bit
)
as
	Insert into Books (PublicationId, StoreId, NumberSpecific, Status) values(@PublicationId, @StoreId, @NumberSpecific, @Status);
	Set @BookId = SCOPE_IDENTITY();
Go
Create Procedure UpdateBook
(
	@BookId int,
	@PublicationId int,
	@StoreId int,
	@NumberSpecific varchar(16),
	@Status bit
)
as
	 Update Books Set PublicationId = @PublicationId, StoreId = @StoreId, NumberSpecific = @NumberSpecific, Status = @Status where BookId = @BookId;
Go
Create Procedure DeleteBook
(
	@BookId int
)
as
	Delete from Books where BookId = @BookId;
Go
Create Procedure CountBooks
as
	Select COUNT(*) from Books;
go
Create Procedure GetDepartments 
as
	 Select DepartmentId, DepartmentName from Departments;
Go
Create Procedure GetDepartmentById
(
	@DepartmentId int
)
as
	 Select DepartmentId, DepartmentName from Departments where DepartmentId = @DepartmentId;
Go
Create Procedure InsertDepartment
(
	@DepartmentId int output,
	@DepartmentName nvarchar(128)
)
as
	Insert into Departments (DepartmentName) values(@DepartmentName);
	Set @DepartmentId = SCOPE_IDENTITY();
Go
Create Procedure UpdateDepartment
(
	@DepartmentId int,
	@DepartmentName nvarchar(128)
)
as
	 Update Departments Set DepartmentName = @DepartmentName where DepartmentId = @DepartmentId;
Go
Create Procedure DeleteDepartment
(
	@DepartmentId int
)
as
	Delete from Departments where DepartmentId = @DepartmentId;
Go
Create Procedure CountDepartments
as
	Select COUNT(*) from Departments;
go
Create Procedure GetGroups 
as
	 Select GroupId, GroupName from Groups;
Go
Create Procedure GetGroupById
(
	@GroupId int
)
as
	 Select GroupId, GroupName from Groups where GroupId = @GroupId;
Go
Create Procedure InsertGroup
(
	@GroupId int output,
	@GroupName nvarchar(128)
)
as
	Insert into Groups (GroupName) values(@GroupName);
	Set @GroupId = SCOPE_IDENTITY();
Go
Create Procedure UpdateGroup
(
	@GroupId int,
	@GroupName nvarchar(128)
)
as
	 Update Groups Set GroupName = @GroupName where GroupId = @GroupId;
Go
Create Procedure DeleteGroup
(
	@GroupId int
)
as
	Delete from Groups where GroupId = @GroupId;
Go
Create Procedure CountGroups
as
	Select COUNT(*) from Groups;
go
Create Procedure GetAttachmentTypes 
as
	 Select AttachmentTypeId, AttachmentTypeName from AttachmentTypes;
Go
Create Procedure GetAttachmentTypeById
(
	@AttachmentTypeId int
)
as
	 Select AttachmentTypeId, AttachmentTypeName from AttachmentTypes where AttachmentTypeId = @AttachmentTypeId;
Go
Create Procedure InsertAttachmentType
(
	@AttachmentTypeId int output,
	@AttachmentTypeName nvarchar(128)
)
as
	Insert into AttachmentTypes (AttachmentTypeName) values(@AttachmentTypeName);
	Set @AttachmentTypeId = SCOPE_IDENTITY();
Go
Create Procedure UpdateAttachmentType
(
	@AttachmentTypeId int,
	@AttachmentTypeName nvarchar(128)
)
as
	 Update AttachmentTypes Set AttachmentTypeName = @AttachmentTypeName where AttachmentTypeId = @AttachmentTypeId;
Go
Create Procedure DeleteAttachmentType
(
	@AttachmentTypeId int
)
as
	Delete from AttachmentTypes where AttachmentTypeId = @AttachmentTypeId;
Go
Create Procedure CountAttachmentTypes
as
	Select COUNT(*) from AttachmentTypes;
go
Create Procedure GetAttachments 
as
	 Select AttachmentId, Url, AttachmentTypeId from Attachments;
Go
Create Procedure GetAttachmentById
(
	@AttachmentId int
)
as
	 Select AttachmentId, Url, AttachmentTypeId from Attachments where AttachmentId = @AttachmentId;
Go
Create Procedure InsertAttachment
(
	@AttachmentId int output,
	@Url nvarchar(128),
	@AttachmentTypeId int
)
as
	Insert into Attachments (Url, AttachmentTypeId) values(@Url, @AttachmentTypeId);
	Set @AttachmentId = SCOPE_IDENTITY();
Go
Create Procedure UpdateAttachment
(
	@AttachmentId int,
	@Url nvarchar(128),
	@AttachmentTypeId int
)
as
	 Update Attachments Set Url = @Url, AttachmentTypeId = @AttachmentTypeId where AttachmentId = @AttachmentId;
Go
Create Procedure DeleteAttachment
(
	@AttachmentId int
)
as
	Delete from Attachments where AttachmentId = @AttachmentId;
Go
Create Procedure CountAttachments
as
	Select COUNT(*) from Attachments;
go
Create Procedure GetUsers 
as
	 Select UserId, DepartmentId, ProvinceId, GroupId, AttachmentId, UserNo, FirstName, LastName, Gender, BirthDay, Address, Phone, IdentityCard, Email from Users;
Go
Create Procedure GetUserById
(
	@UserId int
)
as
	 Select UserId, DepartmentId, ProvinceId, GroupId, AttachmentId, UserNo, FirstName, LastName, Gender, BirthDay, Address, Phone, IdentityCard, Email from Users where UserId = @UserId;
Go
Create Procedure InsertUser
(
	@UserId int output,
	@DepartmentId int,
	@ProvinceId int,
	@GroupId int,
	@AttachmentId int,
	@UserNo varchar(8),
	@FirstName nvarchar(64),
	@LastName nvarchar(32),
	@Gender bit,
	@BirthDay date,
	@Address nvarchar(256),
	@Phone varchar(16),
	@IdentityCard varchar(16),
	@Email varchar(128)
)
as
	Insert into Users (DepartmentId, ProvinceId, GroupId, AttachmentId, UserNo, FirstName, LastName, Gender, BirthDay, Address, Phone, IdentityCard, Email) values(@DepartmentId, @ProvinceId, @GroupId, @AttachmentId, @UserNo, @FirstName, @LastName, @Gender, @BirthDay, @Address, @Phone, @IdentityCard, @Email);
	Set @UserId = SCOPE_IDENTITY();
Go
Create Procedure UpdateUser
(
	@UserId int,
	@DepartmentId int,
	@ProvinceId int,
	@GroupId int,
	@AttachmentId int,
	@UserNo varchar(8),
	@FirstName nvarchar(64),
	@LastName nvarchar(32),
	@Gender bit,
	@BirthDay date,
	@Address nvarchar(256),
	@Phone varchar(16),
	@IdentityCard varchar(16),
	@Email varchar(128)
)
as
	 Update Users Set DepartmentId = @DepartmentId, ProvinceId = @ProvinceId, GroupId = @GroupId, AttachmentId = @AttachmentId, UserNo = @UserNo, FirstName = @FirstName, LastName = @LastName, Gender = @Gender, BirthDay = @BirthDay, Address = @Address, Phone = @Phone, IdentityCard = @IdentityCard, Email = @Email where UserId = @UserId;
Go
Create Procedure DeleteUser
(
	@UserId int
)
as
	Delete from Users where UserId = @UserId;
Go
Create Procedure CountUsers
as
	Select COUNT(*) from Users;
go
Create Procedure GetCardUsers 
as
	 Select CardUserId, UserId, CardUserNo, UserName, Password, Status, DueDate from CardUsers;
Go
Create Procedure GetCardUserById
(
	@CardUserId int
)
as
	 Select CardUserId, UserId, CardUserNo, UserName, Password, Status, DueDate from CardUsers where CardUserId = @CardUserId;
Go
Create Procedure InsertCardUser
(
	@CardUserId int output,
	@UserId int,
	@CardUserNo varchar(16),
	@UserName nvarchar(16),
	@Password nvarchar(32),
	@Status bit,
	@DueDate date
)
as
	Insert into CardUsers (UserId, CardUserNo, UserName, Password, Status, DueDate) values(@UserId, @CardUserNo, @UserName, @Password, @Status, @DueDate);
	Set @CardUserId = SCOPE_IDENTITY();
Go
Create Procedure UpdateCardUser
(
	@CardUserId int,
	@UserId int,
	@CardUserNo varchar(16),
	@UserName nvarchar(16),
	@Password nvarchar(32),
	@Status bit,
	@DueDate date
)
as
	 Update CardUsers Set UserId = @UserId, CardUserNo = @CardUserNo, UserName = @UserName, Password = @Password, Status = @Status, DueDate = @DueDate where CardUserId = @CardUserId;
Go
Create Procedure DeleteCardUser
(
	@CardUserId int
)
as
	Delete from CardUsers where CardUserId = @CardUserId;
Go
Create Procedure CountCardUsers
as
	Select COUNT(*) from CardUsers;
go
Create Procedure GetLoans 
as
	 Select LoanId, DateCreated, UserId from Loans;
Go
Create Procedure GetLoanById
(
	@LoanId int
)
as
	 Select LoanId, DateCreated, UserId from Loans where LoanId = @LoanId;
Go
Create Procedure InsertLoan
(
	@LoanId int output,
	@DateCreated datetime,
	@UserId int
)
as
	Insert into Loans (DateCreated, UserId) values(@DateCreated, @UserId);
	Set @LoanId = SCOPE_IDENTITY();
Go
Create Procedure UpdateLoan
(
	@LoanId int,
	@DateCreated datetime,
	@UserId int
)
as
	 Update Loans Set DateCreated = @DateCreated, UserId = @UserId where LoanId = @LoanId;
Go
Create Procedure DeleteLoan
(
	@LoanId int
)
as
	Delete from Loans where LoanId = @LoanId;
Go
Create Procedure CountLoans
as
	Select COUNT(*) from Loans;
go
Create Procedure GetLoanDetails 
as
	 Select LoanDetailId, LoanId, BookId, DateLoan, DatePay from LoanDetails;
Go
Create Procedure GetLoanDetailById
(
	@LoanDetailId int
)
as
	 Select LoanDetailId, LoanId, BookId, DateLoan, DatePay from LoanDetails where LoanDetailId = @LoanDetailId;
Go
Create Procedure InsertLoanDetail
(
	@LoanDetailId int output,
	@LoanId int,
	@BookId int,
	@DateLoan datetime,
	@DatePay datetime
)
as
	Insert into LoanDetails (LoanId, BookId, DateLoan, DatePay) values(@LoanId, @BookId, @DateLoan, @DatePay);
	Set @LoanDetailId = SCOPE_IDENTITY();
Go
Create Procedure UpdateLoanDetail
(
	@LoanDetailId int,
	@LoanId int,
	@BookId int,
	@DateLoan datetime,
	@DatePay datetime
)
as
	 Update LoanDetails Set LoanId = @LoanId, BookId = @BookId, DateLoan = @DateLoan, DatePay = @DatePay where LoanDetailId = @LoanDetailId;
Go
Create Procedure DeleteLoanDetail
(
	@LoanDetailId int
)
as
	Delete from LoanDetails where LoanDetailId = @LoanDetailId;
Go
Create Procedure CountLoanDetails
as
	Select COUNT(*) from LoanDetails;
go
Create Procedure GetStatuses 
as
	 Select StatusId, StatusName from Statuses;
Go
Create Procedure GetStatusById
(
	@StatusId int
)
as
	 Select StatusId, StatusName from Statuses where StatusId = @StatusId;
Go
Create Procedure InsertStatus
(
	@StatusId int output,
	@StatusName nvarchar(128)
)
as
	Insert into Statuses (StatusName) values(@StatusName);
	Set @StatusId = SCOPE_IDENTITY();
Go
Create Procedure UpdateStatus
(
	@StatusId int,
	@StatusName nvarchar(128)
)
as
	 Update Statuses Set StatusName = @StatusName where StatusId = @StatusId;
Go
Create Procedure DeleteStatus
(
	@StatusId int
)
as
	Delete from Statuses where StatusId = @StatusId;
Go
Create Procedure CountStatuses
as
	Select COUNT(*) from Statuses;
go

-- Lich Nguyen
CREATE PROCEDURE GetNotificationsByUserId
(
	@UserId INT 
)
AS
	SELECT NoID, Title, Created, Name
	FROM Notifications JOIN NotificationTypes ON Notifications.NotiTypeID = NotificationTypes.NotiTypeID
	WHERE UserId = @UserId
GO