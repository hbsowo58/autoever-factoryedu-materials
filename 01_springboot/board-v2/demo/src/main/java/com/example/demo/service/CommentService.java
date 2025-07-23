package com.example.demo.service;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * 댓글 비즈니스 로직 서비스
 */
@Service
public class CommentService {
    private final CommentMapper commentMapper;

    @Autowired
    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    /** 특정 게시글의 댓글 목록 조회 */
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentMapper.findByPostId(postId);
    }

    /** 댓글 단건 조회 */
    public Comment getCommentById(Long id) {
        return commentMapper.findById(id);
    }

    /** 댓글 등록 */
    public int createComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    /** 댓글 수정 */
    public int updateComment(Comment comment) {
        return commentMapper.update(comment);
    }

    /** 댓글 삭제 */
    public int deleteComment(Long id) {
        return commentMapper.delete(id);
    }
} 