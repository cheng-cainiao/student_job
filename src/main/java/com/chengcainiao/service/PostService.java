package com.chengcainiao.service;

import com.chengcainiao.mapper.PostMapper;
import com.chengcainiao.entity.Post;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public int create(Post post) {
        return postMapper.create(post);
    }

    public int delete(String ids) {
        String[] arr = ids.split(",");
        int row = 0;
        for (String s : arr) {
            if(!StringUtils.isEmpty(s)){
                postMapper.delete(Integer.parseInt(s));
            row++;
            }
        }
        return row;
    }

    public int delete(Integer id) {
        return postMapper.delete(id);
    }

    public int update(Post post) {
        return postMapper.update(post);
    }

    public int updateSelective(Post post) {
        return postMapper.updateSelective(post);
    }

    public PageInfo<Post> query(Post post) {
        if(post != null && post.getPage() != null){
            PageHelper.startPage(post.getPage(),post.getLimit());
        }
        return new PageInfo<Post>(postMapper.query(post));
    }

    public Post detail(Integer id) {
        return postMapper.detail(id);
    }

    public int count(Post post) {
        return postMapper.count(post);
    }
}
