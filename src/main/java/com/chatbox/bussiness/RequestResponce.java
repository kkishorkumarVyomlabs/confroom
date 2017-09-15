package com.chatbox.bussiness;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import com.chatbox.model.API_AI_Response_Mdl;
import com.chatbox.model.Parameters;
import com.chatbox.model.Response_Mdl;
import com.chatbox.model.Result;
import com.chatbox.model.Messages;
import com.chatbox.model.Fulfillment;

@Path("book")
public class RequestResponce {

	@GET
	public Response getMsg() {
		return Response.status(200).entity("Hello").build();
		

	}
	
@POST 
@Consumes(MediaType.APPLICATION_JSON)
public Response getConf(String outputJSON) throws IOException{
	System.out.println("Request recieved");
	 API_AI_Responce response = new API_AI_Responce();
		
		System.out.println("responceBO : "+response.toString());
		API_AI_Response_Mdl apiAiResponse = response.jsonToJava(outputJSON);
		
		System.out.println("apiAiResponse : " +apiAiResponse);
		
		Result rs=apiAiResponse.getResult();
		
		System.out.println("rs :"+rs.toString());
		Parameters params=rs.getParameters();
		
	      Parameters p=rs.getParameters();
        String room=p.getRoomname();
	System.out.println("room :"+room);
        String cap=p.getNoofparticipant();
	int capn=Integer.valueOf((String)p.getNoofparticipant());
	//int capn=Integer.parseInt(cap);
	String date=p.getDate();
        String stime=p.getStarttime();
        String etime=p.getEndtime();
        String bookby=p.getUsername();
        String purpos=p.getPurpose();
        String projector=p.getProjector();
        String phone=p.getPhone();
        String tea=p.getTea();
        String p_user=p.getPrimaryuser();
	RoomBooking rb=new RoomBooking();
        String str1 =rb.checkCapacity(room, capn, date, stime, etime, bookby, purpos, projector, phone, cap, tea, p_user);
		Response_Mdl res=new Response_Mdl();
		res.setSource("policyWS");
		res.setSpeech("got it"+str1);
	        res.setDisplayText("got it"+str1);
	/*Fulfillment f=rs.getFulfillment ();
	Messages[] msg=f.getMessages();
	       msg[0].setSpeech(result);*/
		ObjectMapper om=new ObjectMapper();
		String str2=om.writeValueAsString(res);
	
	return Response.status(200).entity(str2).header("Content-Type", "application/json").build();
}
}
