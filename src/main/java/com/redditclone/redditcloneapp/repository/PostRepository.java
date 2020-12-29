package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Post;
import com.redditclone.redditcloneapp.model.Subreddit;
import com.redditclone.redditcloneapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}





