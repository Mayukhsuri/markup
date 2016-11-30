package domain.markup.web_service.messenger.attribute;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

//@Path("/messages")
@XmlRootElement
public class msg {

	private long id;
	private String message;
	private Date created;
	private String author;
	
	public msg(){
		
	}
	
	public msg (long id, String message, String author){
		this.id=id;
		this.message= message;
		this.author=author;
		this.created=new Date();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
		
	
}
