package sample.bean.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class MessageRestController {
	
	
	
	@GET
	@Path("/send/{message}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sendMessage(@PathParam("message") String message){
		return message ;
	}
	
	

}
