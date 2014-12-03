package DAL;
import DTO.Store;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("storeRepository")
public class StoreRepository extends Repository<Store> implements IStoreRepository{
	@Override
    protected Store getFromResultSet(ResultSet rs) throws SQLException {
        return new Store(rs.getInt("StoreId"), rs.getString("StoreName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetStoreById(?)}");
        stmt.setInt("StoreId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetStores()}");
    }
    @Override
    protected void setAddParam(Store obj) throws SQLException{
        callableStatement("{call InsertStore(?, ?)}");
        stmt.registerOutParameter("StoreId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Store obj) throws SQLException {
        obj.setStoreId(stmt.getInt("StoreId"));
    }
    @Override
    protected void setEditParam(Store obj) throws SQLException {
        callableStatement("{call UpdateStore(?, ?)}");
        stmt.setInt("StoreId", obj.getStoreId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteStore(?)}");
        stmt.setInt("StoreId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountStores()}");
    }
	@Override
    protected void setParam(Store obj) throws SQLException {
		stmt.setInt("StoreId", obj.getStoreId());
		stmt.setString("StoreName", obj.getStoreName());
	}
}
