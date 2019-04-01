package com.example.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.message.internal.ReaderWriter;

@Path("/form")
public class UploadService {

	@POST
	@Path("/urlencoded")
	@Consumes("application/x-www-form-urlencoded")
	public String formencoded(@FormParam("email") String email) {
		return email;
	}
	
	@POST
	@Path("/multipart1")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_PLAIN)
	public String multipart(@FormDataParam("file") InputStream inputStream,
			@FormDataParam("file") FormDataContentDisposition fileDetail) {

		String tmp = System.getenv("tmp") + File.separator + fileDetail.getFileName();
		try (FileOutputStream out = new FileOutputStream(tmp)) {
			byte[] bytes = new byte[1024];
			while (inputStream.read(bytes) != -1) {
				out.write(bytes);
			}

		} catch (IOException ex) {
			ex.printStackTrace(System.out);
			return "Oops";
		}
		return "Upload OK - " + tmp;
	}

	@POST
	@Path("/multipart2")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_HTML)
	public String multipart(@FormDataParam("file") List<FormDataBodyPart> files) {

		StringBuilder sb = new StringBuilder();
		for (FormDataBodyPart filePart : files) {
			ContentDisposition cd = filePart.getContentDisposition();
			String tmp = System.getenv("tmp") + File.separator + cd.getFileName();
			sb.append(tmp + "<br/>");
			try (FileOutputStream out = new FileOutputStream(tmp)) {
				ReaderWriter.writeTo(filePart.getEntityAs(InputStream.class), out);
			} catch (IOException ex) {
				ex.printStackTrace(System.out);
				return "Oops";
			}
		}
		return sb.toString() + "Upload OK";
	}
}
