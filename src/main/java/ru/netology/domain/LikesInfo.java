package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikesInfo {
    private int count;
    private int userLike;
    private int canLike;
    private int canPublish;

}
