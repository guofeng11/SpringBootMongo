package cn.com.dao;

import cn.com.entity.Address;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;







/**
 * implementation using the Spring Data
 * @author guofeng
 *
 */
@Repository
@Profile("mongodb")
public class AddressRepositoryImpl implements AddressRepository{

	private MongoOperations mongoOperations;

	/**
	 * Creates a new {@link AddressRepositoryImpl} using the given {@link MongoOperations}.
	 * @param operations must not be {@literal null}.
	 */
	@Autowired
	public AddressRepositoryImpl(MongoOperations mongoOperations) {
		Assert.notNull(mongoOperations);
		this.mongoOperations = mongoOperations;
	}
	@Override
    public Address findById(String id) {
    	Query query = query(where("id").is(id));
		return mongoOperations.findOne(query, Address.class);
	}
    @Override
    public Address save(Address address) {
    	mongoOperations.save(address);
		return address;
	}
    @Override
    public List<Address> findByParentid(int parentid) {
    	Query query = query(where("parentid").is(parentid));
		return mongoOperations.find(query, Address.class);
	}

	
}
