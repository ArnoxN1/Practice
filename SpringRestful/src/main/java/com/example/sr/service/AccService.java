package com.example.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sr.entity.AccEntity;
import com.example.sr.mapper.AccountMapper;

/**
 * @author dell
 * 业务逻辑处理层
 */
@Service
public class AccService {
	
	@Autowired
	AccountMapper accountMapper;
	
	/**
	 * @return 查找到的全部数据记录
	 */
	public List<AccEntity> findAll(){
		return accountMapper.findAll();
	}
	
	/**
	 * @param id 想要查找的id
	 * @return 符合id条件的记录
	 */
	public AccEntity findOne(int id) {
		return accountMapper.findOne(id);
	}
	
	/**
	 * @param accEntity 想要录入的数据
	 */
	public void insert(AccEntity accEntity) {
		accountMapper.insert(accEntity);
	}
	
	/**
	 * @param id 想要删除的记录所对应的id
	 */
	public void delete(int id) {
		accountMapper.delete(id);
	}
	
	/**
	 * @param accEntity 想要更改的数据记录信息
	 */
	public void update(AccEntity accEntity) {
		accountMapper.update(accEntity);
	}

}
