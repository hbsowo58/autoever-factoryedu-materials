package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 댓글 관련 REST API 컨트롤러
 */
@RestController
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    /** 특정 게시글의 댓글 목록 조회 */
    @GetMapping("/posts/{postId}/comments")
    public List<Comment> getCommentsByPostId(@PathVariable Long postId) {
        return commentService.getCommentsByPostId(postId);
    }

    /** 댓글 등록 */
    @PostMapping("/posts/{postId}/comments")
    public int createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        comment.setPostId(postId);
        return commentService.createComment(comment);
    }

    /** 댓글 단건 조회 */
    @GetMapping("/comments/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return commentService.getCommentById(id);
    }

    /** 댓글 수정 */
    @PutMapping("/comments/{id}")
    public int updateComment(@PathVariable Long id, @RequestBody Comment comment) {
        comment.setId(id);
        return commentService.updateComment(comment);
    }

    /** 댓글 삭제 */
    @DeleteMapping("/comments/{id}")
    public int deleteComment(@PathVariable Long id) {
        return commentService.deleteComment(id);
    }
} 