//package utils;
//
//import com.google.gson.Gson;
//import managers.FileReaderManager;
//import testDataTypes.ApplicationInfo;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class JsonDataReader {
//    private final String applicationFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "applicantion.json";
//    private List<ApplicationInfo> applicationList;
//
//    public JsonDataReader(){
//        applicationList = getApplicationData();
//    }
//
//    private List<ApplicationInfo> getApplicationData() {
//        Gson gson = new Gson();
//        BufferedReader bufferReader = null;
//        try {
//            bufferReader = new BufferedReader(new FileReader(applicationFilePath));
//            ApplicationInfo[] customers = gson.fromJson(bufferReader, ApplicationInfo[].class);
//            return Arrays.asList(customers);
//        }catch(FileNotFoundException e) {
//            throw new RuntimeException("Json file not found at path : " + applicationFilePath);
//        }finally {
//            try { if(bufferReader != null) bufferReader.close();}
//            catch (IOException ignore) {}
//        }
//    }
//
//    public final testDataTypes.ApplicationInfo getApplicantPassword(String password){
//        return applicationList.stream().filter(x -> x.password.equalsIgnoreCase(password)).findAny().get();
//    }
//
//    //public final testDataTypes.ApplicationInfo getApplicantLastName(String applicantLastName){
//      //  return applicationList.stream().filter(x -> x.lastName.equalsIgnoreCase(applicantLastName)).findAny().get();
//    //}
//
//    public final testDataTypes.ApplicationInfo getApplicantEmail(String applicantEmail){
//        return applicationList.stream().filter(x -> x.email.equalsIgnoreCase(applicantEmail)).findAny().get();
//    }
//
//}