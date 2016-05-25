package app;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration 
public class AppConfig {
	
	public @Bean Mongo mongo() throws UnknownHostException {   
		return new MongoClient("10.0.0.250:27017"); //如果是远程的就填IP    } 
	}
	   public @Bean MongoTemplate mongoTemplate() throws Exception {       
		   return new MongoTemplate(mongo(), "book"); 
		   }
}
