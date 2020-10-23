package com.yzsm.boki.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzsm.boki.entity.CilckLog;
import com.yzsm.boki.mapper.CilckLogMapper;
import com.yzsm.boki.service.CilckLogService;

@Service("clickService")
public class CilckLogServiceImpl implements CilckLogService {

	@Autowired
	private CilckLogMapper mapper;
	
	@Override
	public int insertSelective(CilckLog record) {
		// TODO Auto-generated method stub
		return this.mapper.insertSelective(record);
	}

}
