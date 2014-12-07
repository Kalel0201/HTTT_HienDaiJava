package DAL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T> implements IRepository<T>{
    protected Connection cn = null;
    protected CallableStatement stmt = null;
    protected ResultSet rs = null;
    protected  final static String EMPTY = "";
    protected  void open() throws ClassNotFoundException, SQLException{
        Setting setting = Setting.getInstance();
        Class.forName(setting.getDriver());
        cn = DriverManager.getConnection(setting.getUrl(), setting.getUserName(), setting.getPassword());
    }
    protected  void callableStatement(String sql) throws SQLException{
        stmt = cn.prepareCall(sql);
    }
    protected void resultSet() throws SQLException{
        rs = stmt.executeQuery();
    }
    protected int executeUpdate() throws SQLException{
        return stmt.executeUpdate();
    }
    protected void close() throws SQLException {
        if(rs != null){
            rs.close();
        }
        if(stmt != null){
            stmt.close();
        }
        if(cn != null){
            cn.close();
        }
    }    
    @Override
    public boolean add(T obj) {
        try{
            open();
            setAddParam(obj);
            setParam(obj);
            int ret = executeUpdate();
            if(ret > 0){
                setReturnParam(obj);
                return true;
            }            
        }catch(SQLException | ClassNotFoundException ex){ 
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return false;
    }
    protected  abstract void setParam(T obj) throws SQLException;
    protected abstract void setAddParam(T obj) throws SQLException;
    protected  abstract void setReturnParam(T obj) throws SQLException;
    @Override
    public boolean edit(T obj) {
        try{
            open();
            setEditParam(obj);
            setParam(obj);
            return  executeUpdate() > 0;            
        }catch(SQLException | ClassNotFoundException ex){ 
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return false;
    }
    protected abstract void setEditParam(T obj) throws SQLException;
    @Override
    public boolean delete(Object id) {
        try{
            open();
            setDeleteParam(id);
            return  executeUpdate() > 0;            
        }catch(SQLException | ClassNotFoundException ex){ 
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return false;
    }    
    protected abstract void setDeleteParam(Object id) throws SQLException;
    protected abstract T getFromResultSet(ResultSet rs) throws SQLException;
    protected List<T> getsFromResultSet(ResultSet rs) throws SQLException{
        List<T> list = new ArrayList<T>();
        while(rs.next())
            list.add(getFromResultSet(rs));
        return list;
    }
    @Override
    public T get(Object id) {
        try {
            open();
            setGetParam(id);
            resultSet();
            if(rs.next())
                return getFromResultSet(rs);
        } catch (ClassNotFoundException | SQLException ex) {
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return null;
    }

    @Override
    public int count(Object obj) {
        try{
            open();
            setCountParam(obj);
            resultSet();
            if(rs.next())
                return rs.getInt(1);
        }catch (ClassNotFoundException | SQLException ex) {
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return 0;
    }
    
    protected abstract void setGetParam(Object id) throws SQLException;
    @Override
    public List<T> gets(Object obj){
        try {
            open();
            setGetsParam(obj);
            resultSet();
            return getsFromResultSet(rs);
            
        } catch (ClassNotFoundException | SQLException ex) {
        }finally{
            try {
                close();
            } catch (SQLException ex) {
            }
        }
        return null;
    }
    protected abstract void setGetsParam(Object obj) throws SQLException;
    protected abstract void setCountParam(Object obj) throws SQLException; 

    @Override
    public int page(Object obj) {
        Setting setting = Setting.getInstance();
        return page(setting.getPageSize(), obj);
    }

    @Override
    public int page(int pageSize, Object obj) {
        int n = count(obj);
        int ret = n / pageSize;
        if(n % pageSize != 0)
            ret++;
        return ret;
    }
    
}
