package roostify.plaid;
import resources.DataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class payLoad {

    public static String getPostData(String Scenarioname) throws IOException {

        DataDriven d = new DataDriven();
        String Sheetname = "Plaid";
        ArrayList data = d.getData(Sheetname, Scenarioname);


        String b= "{\n" +
                "  \"verification_type\": "+data.get(1)+",\n" +
                "  \"customer_id\": "+data.get(2)+",\n" +
                "  \"account_id\": "+data.get(3)+",\n" +
                "  \"reference_id\": "+data.get(4)+",\n" +
                "  \"callback_url\": "+data.get(5)+",\n" +
                "  \"notification_url\": "+data.get(6)+",\n" +
                "  \"borrower_info\": {\n" +
                "    \"first_name\": "+data.get(7)+",\n" +
                "    \"last_name\": "+data.get(8)+",\n" +
                "    \"given_name\": "+data.get(11)+",\n" +
                "    \"user_name\": "+data.get(12)+",\n" +
                "    \"email\": "+data.get(9)+",\n" +
                "    \"phone\": \"1415555555\",\n" +
                "    \"ssn\": "+data.get(10)+",\n" +
                "    \"address\": {\n" +
                "      \"address_line1\": "+data.get(13)+",\n" +
                "      \"address_line2\": null,\n" +
                "      \"city\": \"Salt Lake\",\n" +
                "      \"state\": \"UT\",\n" +
                "      \"zip_code\": "+data.get(14)+"\n" +
                "    },\n" +
                "    \"dob\":\"12/03/1994\"\n" +
                "  }\n" +
                "}";

        return b;

    }

    public static int getExpected(String Scenarioname) throws IOException {
        DataDriven d=new DataDriven();
        String Sheetname = "Plaid";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        Object expected = data.get(15);
        int exp = Integer.parseInt((String) expected);
        return exp;

    }

}
