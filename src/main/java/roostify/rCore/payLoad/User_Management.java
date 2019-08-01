package roostify.rCore.payLoad;

import resources.ReusableMethods;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class User_Management {


    private static Properties prop;
    private static  String AccountId;
    private static  String SecondaryAcc1;
    private static  String SecondaryAcc2;

    public User_Management() throws IOException {
         prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
        AccountId= prop.getProperty("RoostifyAccountId");
        SecondaryAcc1 = prop.getProperty("SecondaryAcc1");
        SecondaryAcc2 = prop.getProperty("SecondaryAcc2");

    }

    public static String getCreateUserData() throws IOException {

       Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
       String  AccountId= prop.getProperty("RoostifyAccountId");
       String sso_reference = ReusableMethods.getSaltString();
       Random r = new Random();
       int i= r.nextInt();


        String data = "{\n" +
                "  \"user_role\": \"lender\",\n" +
                "  \"job_title\": \"assistant\",\n" +
                "  \"admin\": true,\n" +
                "  \"first_name\": \"Test\",\n" +
                "  \"last_name\": \"Lender"+i+"\",\n" +
                "  \"email\": \"kasegaonkar+testlender"+i+"@roostify.com\",\n" +
                "  \"home_phone\": \"2125551234\",\n" +
                "  \"license_number\": \"123456789\",\n" +
                "  \"send_invite\": true,\n" +
                "  \"account_id\": \""+AccountId+"\",\n" +
                "  \"secondary_accounts\": [\n" +
                "    \"5092745785571348\"\n" +
                "  ],\n" +
                "  \"account_reference_id\": \"HIJKLMNO\",\n" +
                "  \"reference_id\": \"ABCDJFH\",\n" +
                "  \"sso_reference_id\": \""+sso_reference+"\",\n" +
                "  \"access_control_group\": {\n" +
                "    \"system_name\": \"test\"\n" +
                "  }\n" +
                "}";
        return data;
    }


    public static  String getUpdateUserData() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
        String  AccountId= prop.getProperty("RoostifyAccountId");
        Random r = new Random();
        int i= r.nextInt();
        String data ="{\n" +
                "  \"user_role\": \"lender\",\n" +
                "  \"job_title\": \"assistant\",\n" +
                "  \"admin\": true,\n" +
                "  \"first_name\": \"Updating User\",\n" +
                "  \"last_name\": \"Admin"+i+"\",\n" +
                "  \"email\": \"kasegaonkar+test"+i+"@roostify.com\",\n" +
                "  \"home_phone\": \"1234567890\",\n" +
                "  \"reference_id\":\"M09099394\",\n" +
                "  \"account_id\": \""+AccountId+"\"\n" +
                "}";

        return data;

    }

    public static String AddUsersSecondaryAccountData() throws IOException {
      /*  Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
        String AccountId= prop.getProperty("RoostifyAccountId");
        String SecondaryAcc1 = prop.getProperty("SecondaryAcc1");*/

        String data="{\n" +
                "  \"account_id\": \"9700136338681391\",\n" +
                "  \"secondary_accounts\": [\n" +
                "    \"5092745785571348\"\n" +
                "  ]\n" +
                "}";

        return data;

    }

    public static String getCreateLeadData(){

        String data ="{\n" +
                "  \"subject_property_zip\": \"111111\",\n" +
                "  \"first_time_home_buyer\": false,\n" +
                "  \"monthly_property_tax\": 500,\n" +
                "  \"homeowners_insurance\": 200,\n" +
                "  \"monthly_hoa\": 100,\n" +
                " \n" +
                "  \"desired_cashout_amount\": 200,\n" +
                "  \"down_payment\": 100,\n" +
                " \n" +
                "  \"product_name\": \"5/1 ARM\",\n" +
                "  \"product_property_tax\": 3.9375,\n" +
                "  \"product_principal_and_interest\": 13,\n" +
                "  \"product_home_insurance\": 1.3416,\n" +
                "  \"product_pmi\": 1.1666,\n" +
                "  \"product_rate\": 3.625,\n" +
                "  \"product_term\": 30,\n" +
                "  \n" +
                "  \"product_monthly_payment\": 19.445,\n" +
                "  \"product_code\": 18244614,\n" +
                "  \"product_closing_cost\": 2466,\n" +
                "  \"product_discount\": 0,\n" +
                "  \"product_apr\": 4.15,\n" +
                "  \"call_back_time\": \"11am-2pm\",\n" +
                "  \"call_back_date\": \"04/05/2018\",\n" +
                "  \"phone_type\": \"Mobile\",\n" +
                "  \"mlo_token\": \"42586379247562\"\n" +
                "}";
        return data;
    }
}