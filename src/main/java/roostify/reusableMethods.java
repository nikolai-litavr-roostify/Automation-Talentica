package roostify;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Base64;

public class ReusableMethods {

    public static JsonPath rawToJson(Response r)
    {
        String ressrting = ((Response) r).body().asString();
        System.out.println(ressrting);

        JsonPath js = new JsonPath(ressrting);
        return js;

    }

   public static String getSrcLink(String data)
   {
       String arr[] =  data.split("\\<");
       String srcline = arr[5];
       String arr1[] = srcline.split("\"");
       String srcLink = arr1[3];
       //System.out.println(srcLink);
       return srcLink;

   }

    public static String encoder(String filePath) {
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.getEncoder().encodeToString(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        return base64File;
    }

    public static void createFile(String data) throws IOException {
        String fileName= "downloadedfile";
        String filePath = "C:\\Users\\KrishnaA\\Desktop\\new.pdf";

       // final File dwldsPath = new File(System.getProperty("user.dir") + fileName + ".pdf");
         byte[] pdfAsBytes = Base64.getDecoder().decode(data);
        FileOutputStream fos = new FileOutputStream(filePath);
       // os = new FileOutputStream(dwldsPath, false);

        fos.write(pdfAsBytes);
        fos.flush();
        fos.close();
    }

    public static String removeNewLineCharacter(String data)
    {
        String returnString = data.replaceAll("\\r\\n|\\r|\\n", "");
        return returnString;
    }

    public static String ObjectToString(Object data){

            String result = data.toString();
        result=result.replaceAll("\\[","");
        result=result.replaceAll("\\]","");

        return result;
        }




}
