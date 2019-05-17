package roostify.rCore.payLoad;

import java.io.IOException;

public class LoanCreation {

    public static String getLoancreationData() throws IOException {

        // DataDriven d = new DataDriven();
        // String Sheetname = "AccountCheck";
        //ArrayList data = d.getData(Sheetname, Scenarioname);


      /*  String b= "{\n" +
                "  \"reference_id\": \"uayst67qw54r67\",\n" +
                "  \"lender_email\": \"kasegaonkar+admin2@roostify.com\",\n" +
                "  \"loan_type\": \"Conventional\",\n" +
                "  \"loan_amount\": \"154660.00\",\n" +
                "  \"amortization_term\": \"30\",\n" +
                "  \"base_interest_rate\": \"3.125\",\n" +
                "  \"application_type\": \"Home_Purchase\",\n" +
                "  \"mortgage_type\": \"Fixed\",\n" +
                "  \"subject_property_address1\": \"571 Clay St\",\n" +
                "  \"subject_property_address2\": \"\",\n" +
                "  \"subject_property_city\": \"Benton Harbor\",\n" +
                "  \"subject_property_state\": \"MI\",\n" +
                "  \"subject_property_zip\": \"49022\",\n" +
                "  \"b_reference_id\": \"sdrrh36\",\n" +
                "  \"borrower_sso_reference_id\": \"xgh532\",\n" +
                "  \"b_first_name\": \"Borrower\",\n" +
                "  \"b_last_name\": \"Jointly\",\n" +
                "  \"b_middle_initial\": \"T\",\n" +
                "  \"b_email\": \"kasegaonkar+a8@roostify.com\",\n" +
                "  \"b_phone\": \"9876545678\",\n" +
                "  \"c_reference_id\": \"rtu257\",\n" +
                "  \"coborrower_sso_reference_id\": \"457sthy\",\n" +
                "  \"c_first_name\": \"Coborrower\",\n" +
                "  \"c_last_name\": \"jointly\",\n" +
                "  \"c_middle_initial\": \"\",\n" +
                "  \"c_email\": \"kasegaonkar+b8@roostify.com\",\n" +
                "  \"c_phone\": \"9876545678\",\n" +
                "  \"intent_to_proceed_granted_at\": \"2017-10-12 10:01:23\",\n" +
                "  \"itp_flag\": \"Y\",\n" +
                "  \"created_at\": \"2018-11-12T19:11:11Z\",\n" +
                "  \"started_at\": \"2018-11-13T19:11:11Z\",\n" +
                "  \"updated_at\": \"2018-11-14T19:11:11Z\",\n" +
                "  \"completed_at\": \"2018-02-12T19:11:11Z\",\n" +
                "  \"submitted_at\": \"2018-02-12T19:11:11Z\",\n" +
                "  \"b_owned_property_title\": 2\n" +
                "  \n" +
                "}";*/

      String b = "{\n" +
              "  \"reference_id\": \"824188418\",\n" +
              "  \"application_type\": \"purchase\",\n" +
              "  \"amortization_term\": \"30\",\n" +
              "  \"loan_amount\": 2000000,\n" +
              "  \"down_payment\": 40000\n" +
              "}";

        return b;

    }
}
