package com.github.vskrahul.authserver.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
@Getter
public class KeyStore {

	@Value("${keystore.file}")
	private String file;
	
	@Value("${keystore.storepass}")
	private String storepass;
	
	@Value("${keystore.key-alias}")
	private String keyAlias;
	
	@Value("${keystore.key-secret}")
	private String keySecret;
}
