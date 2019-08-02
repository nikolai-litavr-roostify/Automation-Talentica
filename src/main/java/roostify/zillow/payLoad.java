package roostify.zillow;

import resources.dataDriven;
import java.io.IOException;
import java.util.ArrayList;

public class payLoad {

    public static String getPostData(String Scenarioname) throws IOException {

        dataDriven d = new dataDriven();
        String Sheetname = "Zillow";
        ArrayList data = d.getData(Sheetname, Scenarioname);



        String b= "{\n" +
                "  \"account_id\": "+data.get(1)+",\n" +
                "  \"customer_id\": "+data.get(2)+",\n" +
                "  \"reference_id\": "+data.get(3)+",\n" +
                " \"verification_type\": "+data.get(4)+",\n" +
                "  \"borrower_info\": {\n" +
                "    \"address\": {\n" +
                "     \"address_line1\": "+data.get(5)+",\n" +
                "      \"address_line2\": "+data.get(6)+",\n" +
                "       \"city\": "+data.get(7)+",\n" +
                "     \"state\": "+data.get(8)+",\n" +
                "       \"zip_code\": "+data.get(9)+"\n" +
                "\n" +
                "}}\n" +
                "}";

        return b;

    }

    public static int getExpected(String Scenarioname) throws IOException {
        dataDriven d=new dataDriven();
        String Sheetname = "Zillow";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        Object expected = data.get(10);
        int exp = Integer.parseInt((String) expected);
        return exp;

    }

}