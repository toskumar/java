package com.example.wsdl;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.webservice.tempconvert.wsdl.CelsiusToFahrenheit;
import com.example.webservice.tempconvert.wsdl.CelsiusToFahrenheitResponse;
import com.example.webservice.tempconvert.wsdl.ObjectFactory;

public class TempConvertWSClient extends WebServiceGatewaySupport {

	public CelsiusToFahrenheitResponse getCelsiusToFahrenheit(String num) {
		CelsiusToFahrenheit request = new ObjectFactory().createCelsiusToFahrenheit();
		request.setCelsius(num);

		CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) getWebServiceTemplate()
				.marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx?wsdl", request,
						new SoapActionCallback("https://www.w3schools.com/xml/CelsiusToFahrenheit"));
		return response;
	}

}
