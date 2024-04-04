package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface GroupService {
	public List<Group> findAlls();

    public String findById(int id);

    public Group findGroupById(int id);

    public Group save(Group group);

    public int deleteById(int id);
}