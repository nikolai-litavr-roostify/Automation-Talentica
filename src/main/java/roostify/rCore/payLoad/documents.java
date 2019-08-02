package roostify.rCore.payLoad;

import resources.reusableMethods;


public class documents {

    public static String getUploadDocumentData(String loanId, String taskId){
        String encodedFile = reusableMethods.encoder(System.getProperty("user.dir")+"//resources//sample.pdf");

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
