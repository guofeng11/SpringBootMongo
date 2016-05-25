package cn.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;


@Configurable
@ComponentScan
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration{

	@Autowired
	private List<Converter<?,?>> converters;
	
	@Override
	protected String getDatabaseName() {
       return "CommonData";
	}

	/**
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#mongo()
	 */
	@Override
	public Mongo mongo() throws Exception {
		Mongo mongo = new MongoClient();
//		mongo.setWriteConcern(WriteConcern.SAFE);

		return mongo;
	}
	/**
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#customConversions()
	 */
	@Override
	public CustomConversions customConversions() {
		return new CustomConversions(converters);
	}
}
