package com.example.mapper;

import com.example.model.SpringBootTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SpringBootTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpringBootTest record);

    int insertSelective(SpringBootTest record);

    SpringBootTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpringBootTest record);

    int updateByPrimaryKey(SpringBootTest record);

    @Select("SELECT id, name FROM spring_boot_test ")
    List<SpringBootTest> getAllTests();
}