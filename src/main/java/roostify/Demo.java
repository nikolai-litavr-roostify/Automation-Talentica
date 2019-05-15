package roostify;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo {
    private static Logger log = LogManager.getLogger(Demo.class.getName());
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");
        log.debug("I am debugging");
        if(5>4)
        {
            log.info("Object is Present");
        }
        log.error("Object is not present");
        log.fatal("This is fatal");
    }
}
