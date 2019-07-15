package managers;

//import utils.JsonDataReader;
import utils.ReadConfig;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ReadConfig readConfig;
//    private static JsonDataReader jsonDataReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ReadConfig getConfigReader() {
        return (readConfig == null) ? new ReadConfig() : readConfig;
    }

//    public JsonDataReader getJsonReader(){
//        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
//    }
}
