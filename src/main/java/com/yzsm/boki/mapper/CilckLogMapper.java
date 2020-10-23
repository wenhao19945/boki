package com.yzsm.boki.mapper;

import com.yzsm.boki.entity.CilckLog;
import com.yzsm.boki.entity.CilckLogExample;
import java.util.List;

public interface CilckLogMapper {
    int countByExample(CilckLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CilckLog record);

    int insertSelective(CilckLog record);

    List<CilckLog> selectByExample(CilckLogExample example);

    CilckLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CilckLog record);

    int updateByPrimaryKey(CilckLog record);
}