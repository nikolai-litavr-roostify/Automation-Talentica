package roostify.rCore.payLoad;

import java.io.IOException;

public class statusUpdate {
    public static String getStatusUpdateData(String loanId) throws IOException {

        String data = "  \"loan_application_id\": \"6865676134895908\",\n" +
                "  \"update_content\": \"Hello, world!\",\n" +
                "  \"roostify_status_code\": \"funded\",\n" +
                "  \"status_id\": \"60\",\n" +
                "  \"view_borrower\": false";
        return data;
    }

}
