package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int idPost;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private Date date;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String imageUrl;
    private String text;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
}


