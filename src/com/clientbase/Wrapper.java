package com.clientbase;

import com.clientbase.module.ModuleManager;
import com.cubk.event.EventProtocol;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Wrapper {

    /**  Client Info */
    public static final String name = "Equation";
    public static final String version = "sb";
    public static final Wrapper instance = new Wrapper();
    public static final Logger logger = LogManager.getLogger(name);

    private EventProtocol eventProtocol;
    private ModuleManager moduleManager;

    public boolean clientLoadFinished = false;

    public void init() {
        logger.info("Client starting up...");
        long start = System.currentTimeMillis();

        logger.info("Initializing managers...");
        this.eventProtocol = new EventProtocol();
        this.moduleManager = new ModuleManager();

        logger.info("Registering...");
        this.moduleManager.init();

        this.clientLoadFinished = true;
        logger.info("Finished loading in {} seconds.", (System.currentTimeMillis() - start) / 1000f);
    }

    public EventProtocol getEventProtocol() {
        return eventProtocol;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }
}
