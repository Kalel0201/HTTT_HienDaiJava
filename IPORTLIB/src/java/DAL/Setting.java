package DAL;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Setting {
    private static Setting singleton;
    private Properties prop;
    private Setting() {
        prop = new Properties();
        InputStream is = null;
        try {
            is = getClass().getResourceAsStream("config.properties");
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static Setting getInstance() {
        if (singleton == null) {
            singleton = new Setting();
        }
        return singleton;
    }

    String getDriver() {
        return prop.getProperty("driver");
    }

    String getUrl() {
        return prop.getProperty("url");
    }

    String getPassword() {
        return prop.getProperty("password");
    }

    String getUserName() {
        return prop.getProperty("username");
    }

    int getPageSize() {
        return Integer.parseInt(prop.getProperty("pageSize"));
    }
}
