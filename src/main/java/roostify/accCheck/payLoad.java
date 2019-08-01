package roostify.accCheck;

import resources.DataDriven;
import java.io.IOException;
import java.util.ArrayList;

public class payLoad {


    public static String  getPostData(String Scenarioname) throws IOException {

        DataDriven d=new DataDriven();
        String Sheetname = "AccountCheck";
        ArrayList data=d.getData(Sheetname,Scenarioname);

     String b= "{\n" +
             "  \"verification_type\": "+data.get(1)+",\n" +
             "  \"customer_id\": "+data.get(2)+",\n" +
             "  \"account_id\": "+data.get(3)+",\n" +
             "  \"reference_id\": "+data.get(4)+",\n" +
             "  \"callback_url\": \""+data.get(5)+"\",\n" +
             "  \"notification_url\": \""+data.get(6)+"\",\n" +
             "  \"borrower_info\": {\n" +
             "    \"first_name\": \""+data.get(7)+"\",\n" +
             "    \"last_name\": \""+data.get(8)+"\",\n" +
             "    \"given_name\": \""+data.get(9)+"\",\n" +
             "    \"user_name\": \""+data.get(10)+"\",\n" +
             "    \"email\": \""+data.get(11)+"\",\n" +
             "    \"ssn\": "+data.get(12)+",\n" +
             "    \"address\": {\n" +
             "      \"address_line1\": \""+data.get(13)+"\",\n" +
             "      \"address_line2\": "+data.get(14)+",\n" +
             "      \"city\": "+data.get(15)+",\n" +
             "      \"state\": "+data.get(16)+",\n" +
             "      \"zip_code\": "+data.get(17)+"\n" +
             "    }\n" +
             "  },\n" +
             "  \"verification_resource\": [\n" +
             "    {\n" +
             "      \"resource_location\": \"string\",\n" +
             "      \"resource_type\": \"WIDGET\",\n" +
             "      \"resource_method\": \"GET\",\n" +
             "      \"resource_data\": \"string\"\n" +
             "    }\n" +
             "]}";

       return b;

    }

    public static int getExpected(String Scenarioname) throws IOException {
        DataDriven d=new DataDriven();
        String Sheetname = "AccountCheck";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        Object expected = data.get(18);
        int exp = Integer.parseInt((String) expected);
        return exp;

    }

}
