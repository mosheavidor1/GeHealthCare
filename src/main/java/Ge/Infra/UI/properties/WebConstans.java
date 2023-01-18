package Ge.Infra.UI.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebConstans {


        public static final String USERNAME_ID = "input[name='username']";
        public static final String PASSWORD_ID = "input[name='password']";
        public static final String LOGIN_BUTTON_ID = "//button[@type=\"submit\"]";
        public static final String CREDENTIALS_FILE = "credentials.properties";
        private static Properties prop = new Properties();
        static {
            try {
                prop.load(new FileInputStream(CREDENTIALS_FILE));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static String getUsername() {
            return prop.getProperty("username");
        }
        public static String getPassword() {
            return prop.getProperty("password");
        }
    }


