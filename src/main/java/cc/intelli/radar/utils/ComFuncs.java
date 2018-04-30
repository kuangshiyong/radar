package cc.intelli.radar.utils;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author guaguagua-mac
 */
public class ComFuncs {

    public static void printLog(Class context, String info) {
        Log logger = LogFactory.getLog(context);
        logger.info(info);
    }

    public static void printError(Class context, String error) {
        Log logger = LogFactory.getLog(context);
        logger.error(error);
    }

    public static String readFile(String filePath) {
        String str = "";
        try {
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return str;
    }
}
