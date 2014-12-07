package DAL;
import DTO.Supplier;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("supplierRepository")
public class SupplierRepository extends Repository<Supplier> implements ISupplierRepository{
	@Override
    protected Supplier getFromResultSet(ResultSet rs) throws SQLException {
        return new Supplier(rs.getInt("SupplierId"), rs.getString("SupplierName"), rs.getString("Address"), rs.getInt("ProvinceId"), rs.getString("Email"), rs.getString("WebPage"), rs.getString("Phone"), rs.getString("AccountName"), rs.getString("BankName"), rs.getString("TaxCode"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetSupplierById(?)}");
        stmt.setInt("SupplierId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetSuppliers()}");
    }
    @Override
    protected void setAddParam(Supplier obj) throws SQLException{
        callableStatement("{call InsertSupplier(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("SupplierId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Supplier obj) throws SQLException {
        obj.setSupplierId(stmt.getInt("SupplierId"));
    }
    @Override
    protected void setEditParam(Supplier obj) throws SQLException {
        callableStatement("{call UpdateSupplier(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt("SupplierId", obj.getSupplierId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteSupplier(?)}");
        stmt.setInt("SupplierId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountSuppliers()}");
    }
	@Override
    protected void setParam(Supplier obj) throws SQLException {
		stmt.setInt("SupplierId", obj.getSupplierId());
		stmt.setString("SupplierName", obj.getSupplierName());
		stmt.setString("Address", obj.getAddress());
		stmt.setInt("ProvinceId", obj.getProvinceId());
		stmt.setString("Email", obj.getEmail());
		stmt.setString("WebPage", obj.getWebPage());
		stmt.setString("Phone", obj.getPhone());
		stmt.setString("AccountName", obj.getAccountName());
		stmt.setString("BankName", obj.getBankName());
		stmt.setString("TaxCode", obj.getTaxCode());
	}
}
