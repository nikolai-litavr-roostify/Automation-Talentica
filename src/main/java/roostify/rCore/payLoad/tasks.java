package roostify.rCore.payLoad;

public class tasks {

    public static String getTaskCreationData(String loanId){

        String data="{\n" +
                "  \"loan_application_id\": \""+loanId+"\",\n" +
                "  \"reference_id\": \"45445\",\n" +
                "  \"name\": \"Task Name\",\n" +
                "  \"assigned_role\": \"borrower\",\n" +
                "  \"notify_assignee_immediately\": \"true\",\n" +
                "  \"release_automatically\": \"true\",\n" +
                "  \"restricted\": \"false\",\n" +
                "  \"description\": \"Task for email to Borrower 3\",\n" +
                "  \"due_at\": \"2019-05-29 19:11:11Z\",\n" +
                "  \"instructions\": \"Please upload the Foo Document 3 \"\n" +
                "}";

        return data;
    }

    public static String updateTaskData(){

        String data="{\n" +
                "  \"description\": \"Task for email to Borrower 4\",\n" +
                "  \"instructions\": \"Please upload the new PDF\"\n" +
                "}";

        return data;
    }



}
