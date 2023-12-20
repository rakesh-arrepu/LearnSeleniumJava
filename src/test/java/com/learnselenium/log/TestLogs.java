package com.learnselenium.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestLogs {
	
	public static Logger log = LogManager.getLogger();
	
	@Test
	public void testLoggers() {
		log.debug("Sample DEBUG message");
        log.error("Sample ERROR message");
        log.info("Sample INFO message");
        log.warn("Sample WARN message");
        
        
       System.out.println("Sample DEBUG message");
       
	}

}
