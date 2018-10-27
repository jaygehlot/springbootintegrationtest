package com.jgehlot.model;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Manga {

    private Integer mal_id;
    private String url;
    private String image_url;
    private String title;
    private Boolean publishing;
    private String description;
    private String type;
    private Integer volumes;
    private Double score;
    private Integer members;
}
