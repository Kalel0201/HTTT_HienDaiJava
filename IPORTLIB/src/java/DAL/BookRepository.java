package DAL;
import DTO.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("bookRepository")
public class BookRepository extends Repository<Book> implements IBookRepository{
	@Override
    protected Book getFromResultSet(ResultSet rs) throws SQLException {
        return new Book(rs.getInt("BookId"), rs.getInt("PublicationId"), rs.getInt("StoreId"), rs.getString("NumberSpecific"), rs.getBoolean("Status"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetBookById(?)}");
        stmt.setInt("BookId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetBooks()}");
    }
    @Override
    protected void setAddParam(Book obj) throws SQLException{
        callableStatement("{call InsertBook(?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("BookId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Book obj) throws SQLException {
        obj.setBookId(stmt.getInt("BookId"));
    }
    @Override
    protected void setEditParam(Book obj) throws SQLException {
        callableStatement("{call UpdateBook(?, ?, ?, ?, ?)}");
        stmt.setInt("BookId", obj.getBookId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteBook(?)}");
        stmt.setInt("BookId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountBooks()}");
    }
	@Override
    protected void setParam(Book obj) throws SQLException {
		stmt.setInt("BookId", obj.getBookId());
		stmt.setInt("PublicationId", obj.getPublicationId());
		stmt.setInt("StoreId", obj.getStoreId());
		stmt.setString("NumberSpecific", obj.getNumberSpecific());
		stmt.setBoolean("Status", obj.getStatus());
	}
}
