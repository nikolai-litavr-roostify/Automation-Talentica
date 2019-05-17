package roostify.accCheck;

import resources.DataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class PayLoad {


    public static String  getPostData(String Scenarioname) throws IOException {

        DataDriven d=new DataDriven();
        String Sheetname = "AccountCheck";
        ArrayList data=d.getData(Sheetname,Scenarioname);

      /*  HashMap<String, Object> mainmap = new HashMap<String, Object>();
        HashMap<String, Object> vrmap = new HashMap<String, Object>();
        HashMap<String, Object> vrmapsub = new HashMap<String, Object>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        HashMap<String, Object> map3 = new HashMap<String, Object>();




        map.put("verification_type",data.get(1));
        map.put("customer_id",data.get(2));
        map.put("account_id",data.get(3));
        map.put("reference_id",data.get(4));
        map.put("callback_url",data.get(5));
        map.put("notification_url",data.get(6));

        map2.put("first_name",data.get(7));
        map2.put("last_name",data.get(8));
        map2.put("given_name",data.get(9));
        map2.put("user_name",data.get(10));
        map2.put("email",data.get(11));
        map2.put("ssn",data.get(12));

        map3.put("address_line1",data.get(13));
        map3.put("address_line2",data.get(14));
        map3.put("city",data.get(15));
        map3.put("state",data.get(16));
        map3.put("zip_code",data.get(17));
        map2.put("address",map3);
        map.put("borrower_info",map2);

        vrmapsub.put("resource_location",data.get(18));
        vrmapsub.put("resource_type",data.get(19));
        vrmapsub.put("resource_method",data.get(20));
        vrmapsub.put("resource_data",data.get(21));
        vrmap.put("verification_resource",vrmapsub);


String a = "hello";
String v = "Krishna"+a;*/


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
