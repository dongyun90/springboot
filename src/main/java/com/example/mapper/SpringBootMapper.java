package com.example.mapper;

import com.example.model.SpringBootModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SpringBootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpringBootModel record);

    int insertSelective(SpringBootModel record);

    SpringBootModel selectByPrimaryKey(@Param(value = "springId") Integer id);

    int updateByPrimaryKeySelective(SpringBootModel record);

    int updateByPrimaryKey(SpringBootModel record);

    @Select("SELECT id, name FROM spring_boot_test ")
    List<SpringBootModel> getAllTests();
}