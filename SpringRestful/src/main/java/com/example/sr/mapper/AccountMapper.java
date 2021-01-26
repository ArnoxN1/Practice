package com.example.sr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sr.entity.AccEntity;

/**
 * @author dell
 * Dao层
 */
@Mapper
public interface AccountMapper {
	
	public List<AccEntity> findAll();
	
	public AccEntity findOne(int id);
	
	public void insert(AccEntity accEntity);
	
	public void delete(int id);
	
	public void update(AccEntity accEntity);
}
