package DAL;
import DTO.Author;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("authorRepository")
public class AuthorRepository extends Repository<Author> implements IAuthorRepository{
	@Override
    protected Author getFromResultSet(ResultSet rs) throws SQLException {
        return new Author(rs.getInt("AuthorId"), rs.getString("AuthorNo"), rs.getString("AuthorName"), rs.getString("Note"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetAuthorById(?)}");
        stmt.setInt("AuthorId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        //callableStatement("{call GetAuthors()}");
        callableStatement("{call GetAuthors(?, ?)}");
        stmt.setInt("PageIndex", (int)obj);
        Setting setting = Setting.getInstance();
        stmt.setInt("PageSize", setting.getPageSize());
    }
    @Override
    protected void setAddParam(Author obj) throws SQLException{
        callableStatement("{call InsertAuthor(?, ?, ?, ?)}");
        stmt.registerOutParameter("AuthorId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Author obj) throws SQLException {
        obj.setAuthorId(stmt.getInt("AuthorId"));
    }
    @Override
    protected void setEditParam(Author obj) throws SQLException {
        callableStatement("{call UpdateAuthor(?, ?, ?, ?)}");
        stmt.setInt("AuthorId", obj.getAuthorId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteAuthor(?)}");
        stmt.setInt("AuthorId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountAuthors()}");
    }
	@Override
    protected void setParam(Author obj) throws SQLException {
		stmt.setInt("AuthorId", obj.getAuthorId());
		stmt.setString("AuthorNo", obj.getAuthorNo());
		stmt.setString("AuthorName", obj.getAuthorName());
		stmt.setString("Note", obj.getNote());
	}
}
