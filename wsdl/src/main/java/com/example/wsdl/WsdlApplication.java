package com.example.wsdl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.webservice.tempconvert.wsdl.CelsiusToFahrenheitResponse;

@SpringBootApplication
public class WsdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsdlApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(TempConvertWSClient tempconvert) {
		return args -> {
			String celsius = "10";

			if (args.length > 0) {
				celsius = args[0];
			}

			CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) tempconvert
					.getCelsiusToFahrenheit(celsius);
			System.out.println("Temperature in Celcius = " + celsius + " C");
			System.out.println("Temperature in Fahrenheit = " + response.getCelsiusToFahrenheitResult() + " F");
		};

	}

}
