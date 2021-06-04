package com.chengcainiao.mapper;

import java.util.List;
import java.util.Map;

import com.chengcainiao.entity.Train;

public interface TrainMapper {

	public int create(Train train);

	public int delete(Integer id);

	public int update(Train train);

	public int updateSelective(Train train);

	public List<Train> query(Train train);

	public Train detail(Integer id);

	public int count(Train train);

}