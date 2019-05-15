package roostify.plaid;
import resources.dataDriven;

import java.io.IOException;
import java.util.ArrayList;
public class payLoad {

    public static String getPostData() throws IOException {

        dataDriven d = new dataDriven();
        String Sheetname = "AccountCheck";
        //ArrayList data = d.getData(Sheetname, Scenarioname);


        String b= "{\n" +
                "  \"verification_type\": \"ASSET_VERIFICATION\",\n" +
                "  \"customer_id\": \"839e7e29-3d7f-4aa5-9ae7-94d6d4f1ec7d\",\n" +
                "  \"account_id\": \"PLAID\",\n" +
                "  \"reference_id\": \"10203040\",\n" +
                "  \"callback_url\": \"https://acme-lending.com/redirectHandler\",\n" +
                "  \"notification_url\": \"https://webhook.site/1fbd6c48-f1ee-4783-bbb2-20181fe71d47\",\n" +
                "  \"borrower_info\": {\n" +
                "    \"first_name\": \"Tester\",\n" +
                "    \"last_name\": \"Testing\",\n" +
                "    \"given_name\": \"string\",\n" +
                "    \"user_name\": \"string\",\n" +
                "    \"email\": \"test@test.com\",\n" +
                "    \"phone\": \"1415555555\",\n" +
                "    \"ssn\": 123456789,\n" +
                "    \"address\": {\n" +
                "      \"address_line1\": \"address 123\",\n" +
                "      \"address_line2\": null,\n" +
                "      \"city\": \"Salt Lake\",\n" +
                "      \"state\": \"UT\",\n" +
                "      \"zip_code\": \"84101\"\n" +
                "    },\n" +
                "    \"dob\":\"12/03/1994\"\n" +
                "  }\n" +
                "}";

        return b;

    }

}
