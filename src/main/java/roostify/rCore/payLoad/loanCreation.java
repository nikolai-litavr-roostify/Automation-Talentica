package roostify.rCore.payLoad;

import utilities.ReadConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class loanCreation {

    public static String getLoancreationData() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);

        String lenderEmail= prop.getProperty("LenderId");
        Random r = new Random();
        int i= r.nextInt();


        String s="\"created_at\": \"2018-11-12T19:11:11Z\",\n" +
                "  \"started_at\": \"2018-11-13T19:11:11Z\",\n" +
                "  \"updated_at\": \"2018-11-14T19:11:11Z\",\n" +
                "  \"completed_at\": \"2018-02-12T19:11:11Z\",\n" +
                "  \"submitted_at\": \"2018-02-12T19:11:11Z\",";

       String b= "{\n" +
               "  \"lender_email\": \""+lenderEmail+"\",\n" +
               "  \"borrower_sso_reference_id\": \"546565\",\n" +
               "  \"application_type\": \"purchase\",\n" +
               "  \"b_first_name\": \"Borrower"+i+"\",\n" +
               "  \"b_last_name\": \"API\",\n" +
               "  \"b_email\": \"kasegaonkar+apitest"+i+"@roostify.com\",\n" +
               "  \"b_phone\": \"1234561898\",\n" +
               "  \"b_mailing_address1\": \"123 Main ST\",\n" +
               "  \"b_mailing_city\": \"Oakland\",\n" +
               "  \"b_mailing_state\": \"TX\",\n" +
               "  \"b_mailing_zip\": \"77303\",\n" +
               "  \"b_cell_phone\": \"9362249000\",\n" +
               "  \"b_ssn\": \"999405000\",\n" +
               "  \"c_ssn\":\"500222000\",\n" +
               "  \"c_first_name\": \"Coborrower"+i+"\",\n" +
               "  \"c_last_name\": \"API\",\n" +
               "  \"c_middle_initial\": \"\",\n" +
               "  \"c_email\": \"kasegaonkar+apitestcobo"+i+"@roostify.com\",\n" +
               "  \"c_phone\": \"9876545678\",\n" +
               "  \"cash_out_determination_type\" : 0,\n" +
               "  \"credit_reference_number\" : \"234244\",\n" +
               "  \"intent_to_proceed_granted_at\" : \"2017-10-06T17:57:16Z\",\n" +
               "  \"loan_number\" : \"234234234324\",\n" +
               "  \"payoff_amount\" : \"10000\",\n" +
               "  \"send_invite\" : \"true\",\n" +
               "  \"total_interest_rate\" : \"2\",\n" +
               "  \"customized_param1\" : \"3\",\n" +
               "  \"customized_param2\" : \"2\",\n" +
               "  \"joint\":\"true\",\n" +
               "  \"b_property1_address1\": \"3599 Pennsylvania Ave\",\n" +
               "  \"b_property1_city\": \"Fremont\",\n" +
               "  \"b_property1_state\": \"CA\",\n" +
               "  \"b_property1_zip\": \"94536\",\n" +
               "  \"b_property1_property_type\": \"2\",\n" +
               "  \"b_property1_property_use\": \"2\",\n" +
               "  \"b_property1_property_status \": \"2\",\n" +
               "  \"b_property1_title_status\": \"2\",\n" +
               "  \"b_property1_market_value\": \"140000\",\n" +
               "  \"b_property1_annual_tax\": \"500\",\n" +
               "  \"b_property1_monthly_hoa\": \"50\",\n" +
               "  \"b_property1_has_first_mortgage\": \"true\",\n" +
               "  \"b_property1_homeowners_insurance_provider\":\"GEICO\",\n" +
               "  \"b_property1_name_of_lender\": \"CHASE\",\n" +
               "  \"b_property1_monthly_mortgage\": \"1000\",\n" +
               "  \"b_property1_mortgage_loan_type\": \"1\",\n" +
               "  \"b_property1_mortgage_rate\": \"3.5\",\n" +
               "  \"b_property1_mortgage_balance\": \"5000\",\n" +
               "  \"b_property1_mortgage_term_remaining\": \"5\",\n" +
               "  \"b_property1_has_second_mortgage\": \"true\",\n" +
               "  \"b_property1_second_mortgage_term_remaining\":\"2\",\n" +
               "  \"b_property1_second_monthly_mortgage\":\"750\",\n" +
               "  \"b_property1_second_mortgage_loan_type\":\"1\",\n" +
               "  \"b_property1_second_mortgage_balance\":\"450000\",\n" +
               "  \"b_property1_has_third_mortgage\":\"true\",\n" +
               "  \"b_current_ownership\": \"true\",\n" +
               "  \"b_employer1_name\": \"Enterprise One\",\n" +
               "  \"b_employer1_payment_type\": \"salary\",\n" +
               "  \"b_employer1_current\": \"true\",\n" +
               "  \"b_employer1_position\": \"Test\",\n" +
               "  \"b_employer1_address1\": \"123 Test\",\n" +
               "  \"b_employer1_city\": \"Test\",\n" +
               "  \"b_employer1_state\": \"CA\",\n" +
               "  \"b_employer1_zip\": \"94928\",\n" +
               "  \"b_employer1_start_date\": \"05/04/1988\",\n" +
               "  \"c_employer1_name\": \"Enterprise One\",\n" +
               "  \"c_employer1_payment_type\": \"salary\",\n" +
               "  \"c_employer1_current\": \"true\",\n" +
               "  \"c_employer1_position\": \"Test\",\n" +
               "  \"c_employer1_address1\": \"123 Test\",\n" +
               "  \"c_employer1_city\": \"Test\",\n" +
               "  \"c_employer1_state\": \"CA\",\n" +
               "  \"c_employer1_zip\": \"94928\",\n" +
               "  \"c_employer1_start_date\": \"05/04/1988\",\n" +
               "  \"b_incomes2_amount\": \"1\",\n" +
               "  \"c_incomes2_amount\": \"2\",\n" +
               "  \"b_incomes2_source\": \"trust\",\n" +
               "  \"c_incomes2_source\": \"social_security\",\n" +
               "  \"b_incomes1_amount\": \"3\",\n" +
               "  \"c_incomes1_amount\": \"4\",\n" +
               "  \"b_incomes1_source\": \"capital_gains\",\n" +
               "  \"c_incomes1_source\": \"alimony\",\n" +
               "  \t\"b_dob\": \"1988-05-16\",\n" +
               "\t\"c_dob\": \"1989-12-05\",\n" +
               "\t\"b_years_schooling\": \"16\",\n" +
               "\t\"c_years_schooling\": \"12\",\n" +
               "\t\"b_dependents\": \"3,6\",\n" +
               "\t\"c_dependents\": \"6,9\",\n" +
               "\t\"b_marital_status\": \"2\",\n" +
               "\t\"c_marital_status\": \"2\",\n" +
               "\t\"b_allow_credit\": true,\n" +
               "\t\"c_allow_credit\": false,\n" +
               "\t\"b_current_address1\": \"123 The Street\",\n" +
               "\t\"c_current_address1\": \"123 The Street\",\n" +
               "\t\"b_current_address2\": \"\",\n" +
               "\t\"c_current_address2\": \"\",\n" +
               "\t\"b_current_city\": \"Discover Bay\",\n" +
               "\t\"c_current_city\": \"Discover Bay\",\n" +
               "\t\"b_current_state\": \"CA\",\n" +
               "\t\"c_current_state\": \"CA\",\n" +
               "\t\"b_current_zip\": \"94504\",\n" +
               "\t\"c_current_zip\": \"94504\",\n" +
               "\t\"c_mailing_address1\": \"123 The Street \",\n" +
               "\t\"b_mailing_address2\": \"\",\n" +
               "\t\"c_mailing_address2\": \"\",\n" +
               "\t\"c_mailing_city\": \"Discover Bay\",\n" +
               "\t\"c_mailing_state\": \"CA\",\n" +
               "\t\"c_mailing_zip\": \"94504\",\n" +
               "\t\"b_employer2_current\": false,\n" +
               "\t\"b_employer1_self\": false,\n" +
               "\t\"b_employer2_self\": false,\n" +
               "\t\"c_employer1_self\": false,\n" +
               "\t\"b_employer2_name\": \"ABC News\",\n" +
               "\t\"b_employer2_address1\": \"458 news lane\",\n" +
               "\t\"b_employer2_city\": \"San Diego\",\n" +
               "\t\"b_employer2_state\": \"CA\",\n" +
               "\t\"b_employer2_zip\": \"92119\",\n" +
               "\t\"b_employer1_title\": \"reporter\",\n" +
               "\t\"b_employer2_title\": \"reporter\",\n" +
               "\t\"c_employer1_title\": \"\",\n" +
               "\t\"b_employer1_years_in_field\": \"0\",\n" +
               "\t\"b_employer2_years_in_field\": \"0\",\n" +
               "\t\"c_employer1_years_in_field\": \"0\",\n" +
               "\t\"b_employer2_start_date\": \"05\\/01\\/2005\",\n" +
               "\t\"b_employer1_phone\": \"6753673738\",\n" +
               "\t\"b_employer2_phone\": \"9878339929\",\n" +
               "\t\"c_employer1_phone\": \"8973889393\",\n" +
               "\t\"b_employer2_hourly_rate\": 25,\n" +
               "\t\"b_employer2_regular_hours_per_week\": 40,\n" +
               "\t\"b_employer2_overtime_hours_per_week\": 5,\n" +
               "\t\"b_employer2_payment_type\": \"hourly\",\n" +
               "\t\"b_asset1_source\": \"\",\n" +
               "\t\"b_asset1_source_type\": \"other\",\n" +
               "\t\"b_asset1_amount\": 0,\n" +
               "\t\"b_asset2_source\": \"Chase\",\n" +
               "\t\"b_asset2_source_type\": \"checking\",\n" +
               "\t\"b_asset2_amount\": 245,\n" +
               "\t\"b_asset3_source\": \"Chase\",\n" +
               "\t\"b_asset3_source_type\": \"savings\",\n" +
               "\t\"b_asset3_amount\": 450,\n" +
               "\t\"b_asset4_source\": \"parents\",\n" +
               "\t\"b_asset4_source_type\": \"gift\",\n" +
               "\t\"b_asset4_amount\": 7500,\n" +
               "\t\"b_asset5_source\": \"ford\\/truck\",\n" +
               "\t\"b_asset5_source_type\": \"other\",\n" +
               "\t\"b_asset5_amount\": 56000,\n" +
               "\t\"b_asset6_source\": \"Disneyland\",\n" +
               "\t\"b_asset6_source_type\": \"stock\",\n" +
               "\t\"b_asset6_amount\": 5000000,\n" +
               "\t\"b_asset7_source\": \"Knotts berry farm\",\n" +
               "\t\"b_asset7_source_type\": \"stock\",\n" +
               "\t\"b_asset7_amount\": 200000,\n" +
               "\t\"b_asset8_source\": \"trust fund\",\n" +
               "\t\"b_asset8_source_type\": \"other\",\n" +
               "\t\"b_asset8_amount\": 35000,\n" +
               "\t\"b_asset9_source\": \"\",\n" +
               "\t\n" +
               "\t\"b_asset9_source_type\": \"other\",\n" +
               "\t\"b_asset9_amount\": 0,\n" +
               "\t\"b_incomes3_amount\": 0,\n" +
               "\t\"c_incomes3_amount\": 0,\n" +
               "\t\"b_incomes3_source\": \"disability\",\n" +
               "\t\"c_incomes3_source\": \"disability\",\n" +
               "\t\"b_incomes4_amount\": 0,\n" +
               "\t\"c_incomes4_amount\": 0,\n" +
               "\t\"b_incomes4_source\": \"pension_retirement\",\n" +
               "\t\"c_incomes4_source\": \"pension_retirement\",\n" +
               "\t\"b_ongoing_payments\": \"\",\n" +
               "\t\"b_property1_property_status\": false,\n" +
               "\t\"b_property1_monthly_homeowners_insurance\": 0,\n" +
               "\t\"b_home1_address1\": \"123 The Street\",\n" +
               "\t\"b_home1_address2\": \"\",\n" +
               "\t\"b_home1_city\": \"Discover Bay\",\n" +
               "\t\"b_home1_state\": \"CA\",\n" +
               "\t\"b_home1_zip\": \"78474\",\n" +
               "\t\"b_home1_owned\": false,\n" +
               "\t\"b_home1_start_date\": \"04\\/01\\/2014\",\n" +
               "\t\"b_home2_address1\": \"1 prior st\",\n" +
               "\t\"b_home2_address2\": \"\",\n" +
               "\t\"b_home2_city\": \"San Diego\",\n" +
               "\t\"b_home2_state\": \"CA\",\n" +
               "\t\"b_home2_zip\": \"78474\",\n" +
               "\t\"b_home2_owned\": true,\n" +
               "\t\"b_home2_start_date\": \"04\\/01\\/2016\",\n" +
               "\t\"b_home3_address1\": \"2 prior st\",\n" +
               "\t\"b_home3_address2\": \"\",\n" +
               "\t\"b_home3_city\": \"New Orleans\",\n" +
               "\t\"b_home3_state\": \"LA\",\n" +
               "\t\"b_home3_owned\": false,\n" +
               "\t\"b_home3_zip\": \"78474\",\n" +
               "\t\"b_home3_start_date\": \"04\\/01\\/2012\",\n" +
               "\t\"b_employer1_annual_salary\": \"184000\",\n" +
               "\t\"b_employer1_annual_bonuses\": \"1000\",\n" +
               "\t\"b_employer1_annual_commissions\": \"1000\",\n" +
               "\t\"b_employer1_hourly_rate\": \"80\",\n" +
               "\t\"b_employer1_regular_hours_per_week\": \"40\",\n" +
               "\t\"b_employer1_overtime_hours_per_week\": \"0\",\n" +
               "\t\"b_employer1_end_date\": \"04\\/01\\/2015\", \n" +
               "\t\"b_home1_years\": \"3\",\n" +
               "\t\"b_home1_months\": \"20\",\n" +
               "\t\"b_liability1_reo_asset_id\": \"763487\" ,\n" +
               "\t\"b_liability1_to_be_resubordinated\": \"6737\",\n" +
               "\t\"b_liability1_omitted\": \"76784\",\n" +
               "\t\"b_liability1_subject_property\": \"7657\",\n" +
               "\t\"b_liability1_rental_property\": \"67457\",\n" +
               "\t\"c_employer1_annual_salary\": \"736474\",\n" +
               "\t\"c_employer1_annual_bonuses\": \"8823\",\n" +
               "\t\"c_employer1_annual_commissions\": \"7474\",\n" +
               "\t\"c_employer1_hourly_rate\": \"200\",\n" +
               "\t\"c_employer1_regular_hours_per_week\": \"80\",\n" +
               "\t\"c_employer1_overtime_hours_per_week\": \"20\",\n" +
               "\t\"c_employer1_end_date\": \"04\\/01\\/2016\", \n" +
               "\t\"c_home1_years\": \"5\",\n" +
               "\t\"c_home1_months\": \"12\",\n" +
               "\t\"c_liability1_reo_asset_id\": \"876376347\" ,\n" +
               "\t\"c_liability1_to_be_resubordinated\": \"763473\",\n" +
               "\t\"c_liability1_omitted\": \"848\",\n" +
               "\t\"c_liability1_subject_property\": \"94563\",\n" +
               "\"created_at\": \"2019-07-12T19:11:11Z\",\n" +
               "  \"started_at\": \"2019-07-13T19:11:11Z\",\n" +
               "  \"updated_at\": \"2019-07-14T19:11:11Z\",\n" +
               "  \"completed_at\": \"2019-07-15T19:11:11Z\",\n" +
               "  \"submitted_at\": \"2019-07-15T19:11:11Z\",\n"+
               "\t\"property_use\": 3,    \n" +
               "    \"subject_property_address1\": \"751 Palmer Dr\",\n" +
               "    \"subject_property_city\": \"Herndon\",\n" +
               "    \"subject_property_zip\": \"20170\",\n" +
               "    \"subject_property_state\": \"VA\",\n" +
               "    \"loan_amount\":222222\n" +
               "}";

     /* String b = "{\n" +
              "  \"reference_id\": \"824188418\",\n" +
              "  \"application_type\": \"purchase\",\n" +
              "  \"amortization_term\": \"30\",\n" +
              "  \"loan_amount\": 2000000,\n" +
              "  \"down_payment\": 40000\n" +
              "}";*/

        return b;

    }
}
