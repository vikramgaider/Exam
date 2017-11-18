package com.test.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.test.springboot.model.User;



@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByEmail(String email) {
		for(User user : users){
			if(user.getEmail().equalsIgnoreCase(email)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		user.setActive(true);
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        user.setActive(false);
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByEmail(user.getEmail())!=null;
	}
	
	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(), "vikram", "verma", "vikramverma800@gmail.com", 411006, "o1-05-1990",true));
		users.add(new User(counter.incrementAndGet(), "vikram_1", "verma", "vikramverma801@gmail.com", 411006, "o1-05-1990",true));
		users.add(new User(counter.incrementAndGet(), "vikram_2", "verma", "vikramverma802@gmail.com", 411006, "o1-05-1990",true));
		users.add(new User(counter.incrementAndGet(), "vikram_3", "verma", "vikramverma803@gmail.com", 411006, "o1-05-1990",true));
		return users;
	}

}
