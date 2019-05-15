package roostify;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class reusableMethods {

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


}
