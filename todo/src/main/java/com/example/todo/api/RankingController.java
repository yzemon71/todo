package com.example.todo.api;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.domain.entity.RankingURLRecode;
import com.example.todo.domain.service.RankingService;

@RestController
@RequestMapping("ranking")
public class RankingController {
    
    @Autowired
    private RankingService rankingService;
    
    @GetMapping
    public List<RankingURLRecode> getRanking() throws IOException {
        return rankingService.getQiitaContent();
    }

}
