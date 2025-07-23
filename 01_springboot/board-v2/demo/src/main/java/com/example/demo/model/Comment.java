package com.example.demo.model;

import java.time.LocalDateTime;

/**
 * 댓글 엔티티 (comments 테이블 매핑)
 */
public class Comment {
    /** 댓글 고유 ID (PK) */
    private Long id;
    /** 연결된 게시글의 ID (FK) */
    private Long postId;
    /** 댓글 내용 */
    private String content;
    /** 댓글 작성 시각 */
    private LocalDateTime createdAt;
    /** 댓글 수정 시각 */
    private LocalDateTime updatedAt;

    public Comment() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPostId() { return postId; }
    public void setPostId(Long postId) { this.postId = postId; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", postId=" + postId +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
} 