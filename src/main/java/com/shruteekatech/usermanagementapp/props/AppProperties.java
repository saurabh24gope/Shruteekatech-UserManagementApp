package com.shruteekatech.usermanagementapp.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties
public class AppProperties {
	
	private Map<String,String> messages = new HashMap<String, String>();

}
