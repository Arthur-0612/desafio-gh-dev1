package br.com.mv.gh.desafioghdev1.dto;

import jakarta.persistence.Column;

public class StateDTO {

    private Long id;

    @Column(name = "title", length = 35)
    private String title;

    @Column(name = "url", length = 30)
    private String url;

    @Column(name = "lang", length = 10)
    private String lang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
