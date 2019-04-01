package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeService {

	private static Map<Long, Employee> map;

	static {

		System.out.println("EmployeeService loaded ");
		map = new HashMap<Long, Employee>();
		map.put(11242506L, new Employee(11242506L, "Senthil Kumar 06"));
		map.put(11242507L, new Employee(11242507L, "Senthil Kumar 07"));
		map.put(11242508L, new Employee(11242508L, "Senthil Kumar 08"));
		map.put(11242509L, new Employee(11242509L, "Senthil Kumar 09"));
		Employee e = new Employee(11242510L, "Senthil Kumar 10");
		e.setDepartment(new Department(10L, "India Development Center "));
		map.put(11242510L, e);
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public List<Employee> get() {
		System.out.println("Employee Service get method called ");
		return new ArrayList<Employee>(map.values());
	}

	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Employee get(@PathParam("id") long id) {
		System.out.println("Employee Service get method called ");
		return map.get(id);
	}

	@GET
	@Path("/id/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Response get(@PathParam("id") long id, @QueryParam("format") String format) {
		System.out.println("Employee Service get method called " + id);
		if(format == null) format = "json";
		if (map.containsKey(id)) {
			Employee e =  map.get(id);
			GenericEntity<Employee> entity = new GenericEntity<Employee>(e, Employee.class);
			System.out.println(e.getName());
			 return Response
			            // Set the status and Put your entity here.
			            .ok(entity)
			            // Add the Content-Type header to tell Jersey which format it should marshall the entity into.
			            .header(HttpHeaders.CONTENT_TYPE, "json".equals(format) ? MediaType.APPLICATION_JSON : MediaType.TEXT_XML)
			            .build();
		}
		return null;
	}

	@POST
	@Path("/{id}/name/{name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Employee add(@PathParam("id") Long id, @PathParam("name") String name) {
		System.out.println("Employee Service put method called ");
		map.put(id, new Employee(id, name));
		return map.get(id);
	}
	
	@PUT
	@Path("/{id}/name/{name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Employee update(@PathParam("id") Long id, @PathParam("name") String name) {
		System.out.println("Employee Service post method called ");
		if (map.containsKey(id)) {
			map.get(id).setName(name);
			return map.get(id);
		} else
			return null;
	}

	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Long delete(@PathParam("id") Long id) {
		System.out.println("Employee Service delete method called ");
		if (map.containsKey(id)) {
			map.remove(id);
			return id;
		} else {
			return 0L;
		}
	}
}
