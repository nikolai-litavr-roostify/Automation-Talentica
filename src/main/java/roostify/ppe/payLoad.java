package roostify.ppe;

import resources.dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class payLoad {

    public static String getPostData(String Scenarioname) throws IOException {

        dataDriven d = new dataDriven();
        String Sheetname = "PPE_Heloc";
       ArrayList data = d.getData(Sheetname, Scenarioname);

       /* String a= "{\n" +
                "    \"account_id\": \"ACCOUNT_OB\",\n" +
                "    \"asset_documentation\": \"VERIFIED\",\n" +
                "    \"bankruptcy_date\": \"03/03/2015\",\n" +
                "    \"borrower_info\": {\n" +
                "        \"bankruptcy\": true,\n" +
                "        \"citizenship\": \"US\",\n" +
                "        \"contact_info\": {\n" +
                "            \"address\": {\n" +
                "                \"city_name\": \"atlanta\",\n" +
                "                \"country_code\": \"US\",\n" +
                "                \"county_fips\": 13067,\n" +
                "                \"county_name\": \"Cobb\",\n" +
                "                \"state_code\": \"GA\",\n" +
                "                \"zip_code\": 30301\n" +
                "            },\n" +
                "            \"email\": \"qatest@roostify.com\",\n" +
                "            \"phone\": 1234456789\n" +
                "        },\n" +
                "        \"fico_score\": 720,\n" +
                "         \"person_info\": {\n" +
                "            \"first_name\": \"Gopal\",\n" +
                "            \"last_name\": \"Singh\",\n" +
                "            \"ssn\": \"999-40-5000\"\n" +
                "        },\n" +
                "        \"firstime_homebuyer\": true,\n" +
                "        \"foreclosure\": false,\n" +
                "        \"mortgage_late_120\": 0,\n" +
                "        \"mortgage_late_30\": 0,\n" +
                "        \"mortgage_late_60\": 0,\n" +
                "        \"mortgage_late_90\": 0,\n" +
                "        \"mortgage_late_rolling\": 0,\n" +
                "        \"self_employed\": false,\n" +
                "        \"veteran_status\": true\n" +
                "    },\n" +
                "    \"buydown\": \"None\",\n" +
                "    \"customer_id\": \"f99e1b75-84b2-40c0-bc25-a1a97caec691\",\n" +
                "    \"employment_documentation\": \"VERIFIED\",\n" +
                "    \"external_id\": \"f4401df3-ea03-45d4-82b0-ab35f89b1616\",\n" +
                "    \"foreclosure_date\": \"32ststew\",\n" +
                "    \"income_documentation\": \"VERIFIED\",\n" +
                "    \"interest_only\": true,\n" +
                "    \"loan_info\": {\n" +
                "        \"adjustable_rate_terms\": [\n" +
                "            \"10YEAR\",\n" +
                "            \"7YEAR\",\n" +
                "            \"5YEAR\"\n" +
                "        ],\n" +
                "        \"auto_debit\": true,\n" +
                "        \"cashout_amount\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 25000\n" +
                "        },\n" +
                "        \"desired_price\": 100,\n" +
                "        \"down_payment\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 25000\n" +
                "        },\n" +
                "        \"employee_loan\": true,\n" +
                "        \"lien_type\": 1,\n" +
                "        \"loan_amortization\": [\n" +
                "            \"VARIABLE\",\n" +
                "            \"FIXED\"\n" +
                "        ],\n" +
                "        \"loan_purpose\": \"Purchase\",\n" +
                "        \"loan_terms\": [\n" +
                "            \"15\",\n" +
                "            \"30\"\n" +
                "        ],\n" +
                "        \"loan_types\": [\n" +
                "            \"ALTAEXPANDEDCRITERIA\"\n" +
                "        ],\n" +
                "        \"lock_period\": 30,\n" +
                "        \"mortgage_balance\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 25000\n" +
                "        },\n" +
                "        \"property_value\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 100000\n" +
                "        },\n" +
                "        \"waive_escrow\": true\n" +
                "    },\n" +
                "    \"months_reserve\": 0,\n" +
                "    \"pledged_assets\": true,\n" +
                "    \"property_info\": {\n" +
                "        \"address\": {\n" +
                "            \"city_name\": \"atlanta\",\n" +
                "            \"country_code\": \"US\",\n" +
                "            \"county_fips\": 13067,\n" +
                "            \"county_name\": \"Cobb\",\n" +
                "            \"state_code\": \"GA\",\n" +
                "            \"zip_code\": 30301\n" +
                "        },\n" +
                "        \"monthly_hoa\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 65\n" +
                "        },\n" +
                "        \"mortgage_insurance\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 0\n" +
                "        },\n" +
                "        \"property_tax\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 2000\n" +
                "        },\n" +
                "        \"property_type\": \"DETCH\",\n" +
                "        \"property_use\": \"Primary\",\n" +
                "        \"purchase_price\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": 100000\n" +
                "        },\n" +
                "        \"stories\": 1,\n" +
                "        \"units\": 1\n" +
                "    },\n" +
                "    \"representative_fico_score\": 740,\n" +
                "    \"request_type\": \"fullService\"\n" +
                "}";*/


        String c= "{\n" +
                "    \"account_id\": \""+data.get(1)+"\",\n" +
                "    \"asset_documentation\": \"VERIFIED\",\n" +
                "    \"bankruptcy_date\": \"03/03/2015\",\n" +
                "    \"borrower_info\": {\n" +
                "        \"bankruptcy\": "+data.get(3)+",\n" +
                "        \"citizenship\": \""+data.get(4)+"\",\n" +
                "        \"contact_info\": {\n" +
                "            \"address\": {\n" +
                "                \"city_name\": \""+data.get(5)+"\",\n" +
                "                \"country_code\": \"US\",\n" +
                "                \"county_fips\": 13067,\n" +
                "                \"county_name\": \"Cobb\",\n" +
                "                \"state_code\": \"GA\",\n" +
                "                \"zip_code\": "+data.get(6)+"\n" +
                "            },\n" +
                "            \"email\": \"qatest@roostify.com\",\n" +
                "            \"phone\": 1234456789\n" +
                "        },\n" +
                "        \"fico_score\": 720,\n" +
                "         \"person_info\": {\n" +
                "            \"first_name\": \"Krishna \",\n" +
                "            \"last_name\": \"Asegaonkar\",\n" +
                "            \"ssn\": \"999-40-5000\"\n" +
                "        },\n" +
                "        \"firstime_homebuyer\": true,\n" +
                "        \"foreclosure\": false,\n" +
                "        \"mortgage_late_120\": 0,\n" +
                "        \"mortgage_late_30\": 0,\n" +
                "        \"mortgage_late_60\": 0,\n" +
                "        \"mortgage_late_90\": 0,\n" +
                "        \"mortgage_late_rolling\": 0,\n" +
                "        \"self_employed\": false,\n" +
                "        \"veteran_status\": true\n" +
                "    },\n" +
                "    \"buydown\": \"None\",\n" +
                "    \"customer_id\": \""+data.get(2)+"\",\n" +
                "    \"employment_documentation\": \"VERIFIED\",\n" +
                "    \"external_id\": \"f4401df3-ea03-45d4-82b0-ab35f89b1616\",\n" +
                "    \"foreclosure_date\": \"32ststew\",\n" +
                "    \"income_documentation\": \"VERIFIED\",\n" +
                "    \"interest_only\": true,\n" +
                "    \"loan_info\": {\n" +
                "        \"adjustable_rate_terms\": [\n" +
                "           \""+data.get(12)+"\"\n" +
                "        ],\n" +
                "        \"auto_debit\": true,\n" +
                "        \"cashout_amount\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(7)+"\n" +
                "        },\n" +
                "        \"desired_price\": 100,\n" +
                "        \"down_payment\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(8)+"\n" +
                "        },\n" +
                "        \"employee_loan\": true,\n" +
                "        \"lien_type\": 1,\n" +
                "        \"loan_amortization\": [\n" +
                "            \""+data.get(11)+"\"\n" +
                "        ],\n" +
                "        \"loan_purpose\": \""+data.get(9)+"\",\n" +
                "        \"loan_terms\": [\n" +
                "            \""+data.get(13)+"\"\n" +
                "        ],\n" +
                "        \"loan_types\": [\n" +
                "            \""+data.get(14)+"\"\n" +
                "        ],\n" +
                "        \"lock_period\": 30,\n" +
                "        \"mortgage_balance\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(10)+"\n" +
                "        },\n" +
                "        \"property_value\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(15)+"\n" +
                "        },\n" +
                "        \"waive_escrow\": true\n" +
                "    },\n" +
                "    \"months_reserve\": 0,\n" +
                "    \"pledged_assets\": true,\n" +
                "    \"property_info\": {\n" +
                "        \"address\": {\n" +
                "            \"city_name\": \"atlanta\",\n" +
                "            \"country_code\": \"US\",\n" +
                "            \"county_fips\": 13067,\n" +
                "            \"county_name\": \"Cobb\",\n" +
                "            \"state_code\": \"GA\",\n" +
                "            \"zip_code\": 60012\n" +
                "        },\n" +
                "        \"monthly_hoa\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(16)+"\n" +
                "        },\n" +
                "        \"mortgage_insurance\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(17)+"\n" +
                "        },\n" +
                "        \"property_tax\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(18)+"\n" +
                "        },\n" +
                "        \"property_type\": \""+data.get(19)+"\",\n" +
                "        \"property_use\": \""+data.get(20)+"\",\n" +
                "        \"purchase_price\": {\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"value\": "+data.get(21)+"\n" +
                "        },\n" +
                "        \"stories\": 1,\n" +
                "        \"units\": 1\n" +
                "    },\n" +
                "    \"representative_fico_score\": "+data.get(22)+",\n" +
                "    \"request_type\": \"fullService\"\n" +
                "}";

        return c;


    }

    public static int getExpected(String Scenarioname) throws IOException {
        dataDriven d=new dataDriven();
        String Sheetname = "PPE_Heloc";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        Object expected = data.get(23);
        int exp = Integer.parseInt((String) expected);
        return exp;

    }

}
