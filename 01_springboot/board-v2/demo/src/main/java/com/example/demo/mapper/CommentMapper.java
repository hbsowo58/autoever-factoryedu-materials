package com.example.demo.mapper;

import com.example.demo.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 댓글 관련 DB 접근 매퍼 (MyBatis)
 */
@Mapper
public interface CommentMapper {
    /** 특정 게시글의 댓글 목록 조회 */
    List<Comment> findByPostId(@Param("postId") Long postId);
    /** 댓글 단건 조회 */
    Comment findById(@Param("id") Long id);
    /** 댓글 등록 */
    int insert(Comment comment);
    /** 댓글 수정 */
    int update(Comment comment);
    /** 댓글 삭제 */
    int delete(@Param("id") Long id);
} 