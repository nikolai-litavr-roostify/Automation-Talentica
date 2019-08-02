package roostify.finicity;
import resources.dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class payLoad {

    public static String getPostData(String Scenarioname) throws IOException {

        dataDriven d = new dataDriven();
        String Sheetname = "Finicity";
        ArrayList data = d.getData(Sheetname, Scenarioname);

        String b= "{\n" +
                "  \"verification_type\": "+data.get(1)+",\n" +
                "  \"customer_id\": "+data.get(2)+",\n" +
                "  \"account_id\": "+data.get(3)+",\n" +
                "  \"reference_id\": "+data.get(4)+",\n" +
                "  \"callback_url\": \"https://acme-lending.com/redirectHandler\",\n" +
                "  \"notification_url\": \"https://webhook.site/0221d600-6d3c-49f3-828a-35b635624c1d\",\n" +
                "  \"borrower_info\": {\n" +
                "    \"first_name\": "+data.get(5)+",\n" +
                "    \"last_name\": "+data.get(6)+",\n" +
                "    \"given_name\": "+data.get(9)+",\n" +
                "    \"user_name\": "+data.get(10)+",\n" +
                "    \"email\": "+data.get(7)+",\n" +
                "    \"phone\": "+data.get(11)+",\n" +
                "    \"ssn\": "+data.get(8)+",\n" +
                "    \"address\": {\n" +
                "      \"address_line1\": "+data.get(12)+",\n" +
                "      \"address_line2\": "+data.get(13)+",\n" +
                "      \"city\": "+data.get(14)+",\n" +
                "      \"state\": "+data.get(15)+",\n" +
                "      \"zip_code\": "+data.get(16)+"\n" +
                "    },\n" +
                "    \"dob\":"+data.get(17)+"\n" +
                "  }\n" +
                "}";

        return b;

    }

    public static int getExpected(String Scenarioname) throws IOException {
        dataDriven d=new dataDriven();
        String Sheetname = "Finicity";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        Object expected = data.get(18);
        int exp = Integer.parseInt((String) expected);
        return exp;

    }

}
