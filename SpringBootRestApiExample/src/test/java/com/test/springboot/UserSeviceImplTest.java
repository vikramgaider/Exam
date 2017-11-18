package com.test.springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.test.springboot.model.User;
import com.test.springboot.service.UserServiceImpl;

import junit.framework.Assert;


public class UserSeviceImplTest {

	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	
    @Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }

	@Test
	public void getListofUser() {

		List<User> findAllUsers = userServiceImpl.findAllUsers();
		
		Assert.assertNotNull(findAllUsers);
	}

	List<User> getuserList() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "vikram", "verma", "vikramverma800@gmail.com", 411006, "o1-05-1990", true));
		users.add(new User(2, "vikram_1", "verma", "vikramverma801@gmail.com", 411006, "o1-05-1990", true));

		return users;
	}
	
	@Test
	public void findByEmail() {
		User findByEmail = userServiceImpl.findByEmail("vikramverma805@gmail.com");
	}

}
