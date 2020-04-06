package com.fang.dao;

import com.fang.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMemberDao {
    @Select("select * from member where id = #{memberId}")
    public List<Member> findById() throws Exception;
}
