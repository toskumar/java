package com.example.service;

import java.util.Iterator;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;


@Path("/param")
public class ParamService {

	@GET
	@Path("/id/{id}")
	public String path(@PathParam("id") int id) {
		String output = "<b>path param : </b> " + id;
		return output;
	}

	@GET
	@Path("/query")
	public String query(@QueryParam("format") String format) {
		String output = "<b>query param : </b>" + format;
		return output;
	}

	@GET
	@Path("/default")
	public String queryDefault(@DefaultValue("json") @QueryParam("format") String format) {
		String output = "<b>query param : </b>" + format;
		return output;
	}

	@GET
	@Path("/matrix")
	public String matrix(@MatrixParam("a1") String a1, @MatrixParam("a2") String a2) {
		String output = "<b>Matrix param a1, a2 : </b>" + a1 + ", " + a2;
		return output;
	}

	@POST
	@Path("/consume")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public Employee consume(Employee e) {
		e.setName(e.getName() + "*** Consumed *** ");
		return e;
	}
	

	@GET
	@Path("/context")
	public String context(@Context UriInfo info) {
		StringBuilder sb = new StringBuilder();
		sb.append("<br> Path : " + info.getPath()).append("<br> Abs Path : " + info.getAbsolutePath())
				.append("<br> Req URI : " + info.getRequestUri());
		return sb.toString();
	}

	@GET
	@Path("/cookieParam")
	public String cookieParam(@CookieParam("JSESSIONID") String jsessionid) {
		return "JSESSIONID : " + jsessionid;
	}

	@GET
	@Path("/cookies")
	public String cookies(@Context HttpHeaders hh) {
		Map<String, Cookie> cookieParams = hh.getCookies();
		Iterator<String> iter = cookieParams.keySet().iterator();
		StringBuilder sb = new StringBuilder();
		sb.append("Cookies [<br/>");
		while (iter.hasNext()) {
			String key = iter.next();
			Cookie coo = cookieParams.get(key);
			sb.append(coo.getName() + "=" + coo.getValue() + "; <br/>");
		}
		sb.append("]");
		return sb.toString();
	}

	@GET
	@Path("/headers")
	public String headers(@Context HttpHeaders hh) {
		MultivaluedMap<String, String> headerParams = hh.getRequestHeaders();
		return headerParams.toString();
	}
}
