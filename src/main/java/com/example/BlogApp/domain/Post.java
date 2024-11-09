package com.example.BlogApp.domain;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Post {
    private Integer ID;
    @NotNull @Size(min=3 , max = 500 , message = "The title can not be empty, the min characters is 3 and the max is 500")
    private String title;
    private String description;
    private String slug;
    private String body;
    private PostStatus postStatus;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<Comment> comments;
}
