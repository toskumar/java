package com.example.wsdl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class TempConvertWSConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.example.webservice.tempconvert.wsdl");
		return marshaller;
	}

	@Bean
	public TempConvertWSClient tempConvertWSClient(Jaxb2Marshaller marshaller) {
		TempConvertWSClient client = new TempConvertWSClient();
		client.setDefaultUri("https://www.w3schools.com/xml/tempconvert.asmx?wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
