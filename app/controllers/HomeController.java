package controllers;

import java.util.List;

import com.google.gson.Gson;

import core.AgendaMatcherImpl;
import core.IDMatcher;
import core.MeetingMatcherImpl;
import core.ReplyMatcherImpl;
import model.Agenda;
import model.Meeting;
import model.Reply;
import model.Response;
import play.mvc.Controller;
import play.mvc.Result;
import simulator.MeetingFactory;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


	
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok("");
    }    
    
    public Result post( String type,Integer id) {
    	
    	IDMatcher idMatcher = null;
    	
    	List<Meeting> meetingList = MeetingFactory.getMeetingList();
    	
    	Gson gson = new Gson();
    	
    	if(type.equalsIgnoreCase("meeting")) {
    		idMatcher = new MeetingMatcherImpl();
    		    		    		
    		Response<Meeting> response = new Response<>();
    		
    		response.setType((Meeting)idMatcher.match(id, meetingList));

            return ok(gson.toJson(response,Response.class) );
            
    	}else if (type.equalsIgnoreCase("agenda")){
    		idMatcher = new AgendaMatcherImpl();
    		
    		Response<Agenda> response = new Response<>();
    		
    		idMatcher.match(id, meetingList);
    		
    		response.setType((Agenda)idMatcher.match(id, meetingList));
    		
            return ok(gson.toJson(response,Response.class) );
            
    	}else if (type.equalsIgnoreCase("reply")){
    		idMatcher = new ReplyMatcherImpl();
    		
    		Response<Reply> response = new Response<>();
    		
    		idMatcher.match(id, meetingList);
    		
    		response.setType((Reply)idMatcher.match(id, meetingList));
    		
            return ok(gson.toJson(response,Response.class) );
            
            
    	}else {
    		Response<String> response = new Response<>();
    		response.setMsg(" No match found ");
            return ok(gson.toJson(response,Response.class) );
    	}

    }

}
