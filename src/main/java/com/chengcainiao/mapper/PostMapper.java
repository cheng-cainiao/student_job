package com.chengcainiao.mapper;

import java.util.List;
import java.util.Map;

import com.chengcainiao.entity.Post;

public interface PostMapper {

	public int create(Post post);

	public int delete(Integer id);

	public int update(Post post);

	public int updateSelective(Post post);

	public List<Post> query(Post post);

	public Post detail(Integer id);

	public int count(Post post);

}