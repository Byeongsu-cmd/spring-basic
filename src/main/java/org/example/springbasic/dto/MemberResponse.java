package org.example.springbasic.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberResponse {

    private Long id;
    private String name;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public MemberResponse(Long id, String name, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
