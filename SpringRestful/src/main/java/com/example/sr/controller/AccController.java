package com.example.sr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sr.entity.AccEntity;
import com.example.sr.service.AccService;

@RestController
@RequestMapping("/api/v1.1")
public class AccController {
	
	@Autowired
	AccService accService;
	
	/**
	 * @return 查找到的全部数据记录
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<AccEntity> findAll(){
		return accService.findAll();
	}
	
	/**
	 * @param id 想要查找的id
	 * @return 符合id条件的记录
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public AccEntity findOne(@PathVariable("id") int id) {
		return accService.findOne(id);
	}
	
	/**
	 * @param accEntity 想要录入的数据
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void insert(@RequestBody AccEntity accEntity) {
		accService.insert(accEntity);
	}
	
	/**
	 * @param id 想要删除的记录所对应的id
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		accService.delete(id);
	}
	
	/**
	 * @param accEntity 想要更改的数据记录信息
	 */
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public void update(@RequestBody AccEntity accEntity) {
		accService.update(accEntity);
	}

}
