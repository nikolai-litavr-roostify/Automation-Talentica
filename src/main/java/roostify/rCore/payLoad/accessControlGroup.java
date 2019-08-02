package roostify.rCore.payLoad;

import resources.reusableMethods;

public class accessControlGroup {

    public static String getACGData(){

        String system_Name = reusableMethods.getSaltString();

        String data="{\n" +
                "  \"name\": \"My Acg Group\",\n" +
                "  \"system_name\": \""+system_Name+"\",\n" +
                "  \"account_permissions\": {\n" +
                "    \"access_control\": \"none\",\n" +
                "    \"configuration\": \"read_only\",\n" +
                "    \"lead\": \"read_only\",\n" +
                "    \"report\": \"read_only\",\n" +
                "    \"user\": \"none\"\n" +
                "  }\n" +
                "}";

        return data;

    }
}
