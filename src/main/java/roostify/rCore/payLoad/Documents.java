package roostify.rCore.payLoad;

import roostify.ReusableMethods;


public class Documents {

    public static String getUploadDocumentData(String loanId, String taskId){
        String encodedFile = ReusableMethods.encoder(System.getProperty("user.dir")+"//sample.pdf");

       String data="{\n" +
               "  \"name\": \"Disneyland\",\n" +
               "  \"task_id\": \""+taskId+"\",\n" +
               "  \"loan_application_id\": \""+loanId+"\",\n" +
               "  \"reference_id\": \"5647382910\",\n" +
               "  \"file_name\": \"sample.pdf\",\n" +
               "  \"file_content\": \""+encodedFile+"\\\\n\"\n" +
               "}";

        return data;
    }



}
