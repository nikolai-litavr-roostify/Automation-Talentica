package roostify.rCore.payLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class messages {

    public static String getCreateMessageData(String loanId) throws IOException {
        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
        String adminid= prop.getProperty("adminid");


        String data="{\n" +
                "  \"loan_application_id\": \""+loanId+"\",\n" +
                "  \"content\": \"If it makes you happy, it can't be that bad.\",\n" +
                "  \"sender_email\": \""+adminid+"\",\n" +
                "  \"subject\": \"To the great unknown\"\n" +
                "}";

        return data;
    }

}
