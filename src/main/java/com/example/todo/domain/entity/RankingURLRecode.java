package com.example.todo.domain.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RankingURLRecode implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userName;
    private String title;
    private List<String> tags;
    private String lgtm;
    private String url;

}
