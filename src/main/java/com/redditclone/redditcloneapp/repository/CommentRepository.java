package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Comment;
import com.redditclone.redditcloneapp.model.Post;
import com.redditclone.redditcloneapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
        List<Comment> findByPost(Post post);
        List<Comment> findAllByUser(User user);
}

