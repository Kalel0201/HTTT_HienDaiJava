package DAL;
import DTO.Language;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("languageRepository")
public class LanguageRepository extends Repository<Language> implements ILanguageRepository{
	@Override
    protected Language getFromResultSet(ResultSet rs) throws SQLException {
        return new Language(rs.getInt("LanguageId"), rs.getString("LanguageName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetLanguageById(?)}");
        stmt.setInt("LanguageId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetLanguages()}");
    }
    @Override
    protected void setAddParam(Language obj) throws SQLException{
        callableStatement("{call InsertLanguage(?, ?)}");
        stmt.registerOutParameter("LanguageId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Language obj) throws SQLException {
        obj.setLanguageId(stmt.getInt("LanguageId"));
    }
    @Override
    protected void setEditParam(Language obj) throws SQLException {
        callableStatement("{call UpdateLanguage(?, ?)}");
        stmt.setInt("LanguageId", obj.getLanguageId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteLanguage(?)}");
        stmt.setInt("LanguageId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountLanguages()}");
    }
	@Override
    protected void setParam(Language obj) throws SQLException {
		stmt.setInt("LanguageId", obj.getLanguageId());
		stmt.setString("LanguageName", obj.getLanguageName());
	}
}
