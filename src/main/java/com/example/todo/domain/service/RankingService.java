package com.example.todo.domain.service;

import java.io.IOException;
import java.util.List;

import com.example.todo.domain.entity.RankingURLRecode;

public interface RankingService {
    
    List<RankingURLRecode> getQiitaContent() throws IOException;

}
