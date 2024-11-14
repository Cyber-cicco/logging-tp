package fr.diginamic;

import fr.diginamic.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("bienvenu");
        var service = new AppService();
        service.exectuer("prout");
    }
}