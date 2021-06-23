package ru.netology.domain;

import java.util.Date;

public class Post {
    private int idPost;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private Date date;
    private int replyOwnerId;
    private int replyPostId;
    private int frendOnly;
    private String imageUrl;
    private String text;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;

    // + get/set на все поля
}
