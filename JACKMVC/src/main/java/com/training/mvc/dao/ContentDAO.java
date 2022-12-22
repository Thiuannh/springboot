package com.training.mvc.dao;

import java.util.List;

import com.training.mvc.entities.Content;
import com.training.mvc.entities.User;

public interface ContentDAO {
	
	void createContent(Content content);
	
	List<Content> getAll();
	
	List<Content> findByUser(User user);

}
