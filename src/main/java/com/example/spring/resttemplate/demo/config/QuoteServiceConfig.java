package com.example.spring.resttemplate.demo.config;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class QuoteServiceConfig {

	@Autowired
	private QuoteServer quoteServerConfig;
	
	public String getUrl() {
		return quoteServerConfig.getUrl();
	}

	public String getSenderId() {
		return quoteServerConfig.getSenderId();
	}
	
}

@Validated
@RefreshScope
@Configuration
class QuoteServer{

	@NotNull
	@NotEmpty
	@Value("${quoteserver.url}")
	private String url;

	@Value("${quoteserver.senderId}")
	@NotEmpty
	private String senderId;

	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	
	public String getUrl() {
		return url;
	}

	public String getSenderId() {
		return senderId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nURL : +" + url +
				"\nSenderid : " + senderId;
	}
}
