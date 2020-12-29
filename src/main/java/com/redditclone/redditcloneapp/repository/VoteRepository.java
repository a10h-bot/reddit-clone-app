package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Post;
import com.redditclone.redditcloneapp.model.User;
import com.redditclone.redditcloneapp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}