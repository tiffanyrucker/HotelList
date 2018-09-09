package com.hotellab.demo.HotelList.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hotellab.demo.HotelList.entity.Hotel;

@Repository
@Transactional



public class HotelDao {
	@PersistenceContext

	EntityManager eManager;
	
	
	public Hotel findByCity(String city) {
		return eManager.find(Hotel.class, city);
	}
//	public Person findByName(String name) {
//	String findNameQuery = "select * from person where name = ?";		
//	return jdbc.queryForObject(findNameQuery, new Object[]{name}, new BeanPropertyRowMapper<Person>(Person.class));
//}

public List<Hotel> findAll() {
	TypedQuery<Hotel> namedQuery= eManager.createNamedQuery("find_all_hotels", Hotel.class);
	return namedQuery.getResultList();
}
//to update or insert we will use the merge()
	// it will insert a value if it doesn't exist in the tables
	// otherwise it will update the value if it exists
	public Hotel update(Hotel h) {
		return eManager.merge(h);
	}
	
	/*// the delet method
	public void deleteById(int id) {
		// we first need to find the person based on the reference to their id
		Person p1 = findById(id);
		eManager.remove(p1);
	}*/

}
	
	



//our crud method should live here

