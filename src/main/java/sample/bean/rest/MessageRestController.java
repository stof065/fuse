package sample.bean.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/api")
public class MessageRestController {
	
	@GET
	@Path("/send/{message}")
	public String sendMessage(@PathParam("message") String message){
		return null ;
	}
	
	

}
