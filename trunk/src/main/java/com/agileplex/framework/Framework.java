package com.agileplex.framework;

import com.agileplex.framework.configuration.Configuration;

public interface Framework {
	
	String DEFAULT_CONFIGURATION_FILE_NAME = "system.config.xml";
	String VERSION_1_0 = "1.0";
	
	Configuration getConfiguration();
	
}
