package com.redditclone.redditcloneapp.model;

public enum VoteType {
UPVOTE(1),DOWNVOTE(-1),
    ;
int direction;
VoteType(int direction){

}
}
