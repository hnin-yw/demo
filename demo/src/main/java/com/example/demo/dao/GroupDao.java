package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.*;

public interface GroupDao {
	List<Group> getAlls();

	Group findGroupById(int id);

	Group save(Group group);

    void deleteById(int id);
}