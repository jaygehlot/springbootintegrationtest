package com.jgehlot.service;


import com.jgehlot.model.Manga;
import com.jgehlot.model.MangaResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MangaService {

    Logger logger = LoggerFactory.getLogger(MangaService.class);

    private static final String MANGA_SEARCH_URL="https://api.jikan.moe/search/manga/";

    @Autowired
    RestTemplate restTemplate;

    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL + title, MangaResult.class).getBody().getResult();
    }

}
