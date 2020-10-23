package com.sample.project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class WebResources {
	
	@Path("status")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String connectTest() {
		return "<html style='color:blue'>"
				+ "<h3>Sample Eclipse  Dynamic Web Project</h3>" 
				+ "<h3 style='margin-left: 50px; margin-top:-15px;'>status:&nbsp&nbsp"
				+ 	"<span style='color:green; font-style:italic;'>running</span>"
				+ "</h3></html>";
 
	}
	
	@Path("echo/{val}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String echo( @PathParam("val") String val) {
		return "<html style='color:blue'>"
				+ "<h3>Sample Eclipse  Dynamic Web Project</h3>" 
				+ "<h3 style='margin-left: 50px; margin-top:-15px;'>echo:&nbsp&nbsp"
				+ 	"<span style='color:green; font-style:italic;'>" + val + "</span>"
				+ "</h3></html>";
 
	}


}
