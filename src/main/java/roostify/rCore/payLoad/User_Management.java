package roostify.rCore.payLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class User_Management {

    public static String getCreateUserData(String loanId) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);
       String AccountId= prop.getProperty("RoostifyAccountId");


        String data = "{\n" +
                "  \"user_role\": \"lender\",\n" +
                "  \"job_title\": \"assistant\",\n" +
                "  \"admin\": true,\n" +
                "  \"loan_application_id\": \"" + loanId + "\",\n" +
                "  \"first_name\": \"Test\",\n" +
                "  \"last_name\": \"Lender1\",\n" +
                "  \"email\": \"kasegaonkar+testlender1@roostify.com\",\n" +
                "  \"home_phone\": \"2125551234\",\n" +
                "  \"license_number\": \"123456789\",\n" +
                "  \"send_invite\": true,\n" +
                "  \"account_id\": \""+AccountId+"\",\n" +
                "  \"secondary_accounts\": [\n" +
                "    \"7197998263473245\",\n" +
                "    \"8044354616407856\"\n" +
                "  ],\n" +
                "  \"account_reference_id\": \"HIJKLMNO\",\n" +
                "  \"reference_id\": \"ABCDJFH\",\n" +
                "  \"sso_reference_id\": \"open-sez-a-me\",\n" +
                "  \"access_control_group\": {\n" +
                "    \"system_name\": \"test\"\n" +
                "  }\n" +
                "}";
        return data;
    }


    public static String getReplaceUsersSecondaryAccountData() {
        String data="{\n" +
                "  \"account_id\": \"6661045189006214\",\n" +
                "  \"secondary_accounts\": [\n" +
                "    \"978753875390502\",\n" +
                "    \"849306751784362\"\n" +
                "  ]\n" +
                "}";

        return data;

    }
}