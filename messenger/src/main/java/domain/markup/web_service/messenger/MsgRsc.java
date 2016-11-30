package domain.markup.web_service.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.markup.web_service.messenger.attribute.msg;
import domain.markup.web_service.messenger.service.MsgService;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/message")
public class MsgRsc {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	MsgService Msg = new MsgService();
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<msg> getMessages() {
        return Msg.getAllMessages();
    	
    }
    
}
