package com.example.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

@ApplicationPath("/test")
public class RestApplication extends Application {
	public RestApplication() {
		System.out.println("Rest Application");
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(EmployeeService.class);
		s.add(ParamService.class);
		s.add(UploadService.class);
		
		s.add(MultiPartFeature.class);
		return s;

	}
}