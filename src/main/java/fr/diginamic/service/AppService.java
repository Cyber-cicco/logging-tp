package fr.diginamic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static Logger log = LoggerFactory.getLogger(AppService.class);

    public void exectuer(String param) {
        for (int i = 0; i < 10_000; i++){
            log.debug("Traitement 1 : {}", param);
        }
    }
}