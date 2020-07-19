package com.isoftstone.gdmt.dao;

import com.isoftstone.gdmt.model.url;
import com.isoftstone.gdmt.model.urlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface urlMapper {
    long countByExample(urlExample example);

    int deleteByExample(urlExample example);

    int deleteByPrimaryKey(String resUuid);

    int insert(url record);

    int insertSelective(url record);

    List<url> selectByExample(urlExample example);

    url selectByPrimaryKey(String resUuid);

    int updateByExampleSelective(@Param("record") url record, @Param("example") urlExample example);

    int updateByExample(@Param("record") url record, @Param("example") urlExample example);

    int updateByPrimaryKeySelective(url record);

    int updateByPrimaryKey(url record);
}