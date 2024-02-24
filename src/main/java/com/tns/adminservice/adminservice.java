package com.tns.adminservice;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class adminservice {
@Autowired
	private adminrepository repository;

	public List<admin> listAll(){
	return repository.findAll();	
	}
	public admin get(Integer id) {
		return repository.findById(id).get();
	}
	public void save(admin admin) {
		repository.save(admin);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}