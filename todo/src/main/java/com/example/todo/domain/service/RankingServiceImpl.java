package com.example.todo.domain.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.example.todo.domain.entity.RankingURLRecode;

@Service
public class RankingServiceImpl implements RankingService {

    public List<RankingURLRecode> getQiitaContent() throws IOException {
        Document doc = Jsoup.connect("https://qiita.com/").get();
        Elements newsHeadlines = doc.select("article");
        List<RankingURLRecode> recodes = new ArrayList<>();
        for (Element headline : newsHeadlines) {
            recodes.add(new RankingURLRecode(
                    headline.select("header").select("div").select("a").text(),
                    headline.select("h2").select("a").text(),
                    headline.select("footer").select("a").eachText(),
                    headline.select("footer").select("div").get(3).text(),
                    headline.select("h2").select("a").attr("href")
                    )
            );
        }
        return recodes;
    }
}
