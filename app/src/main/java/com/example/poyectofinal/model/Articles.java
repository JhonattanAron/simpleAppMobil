package com.example.poyectofinal.model;

public class Articles {
    private String id;
    private String ImgUrl;
    private String paragraphOne;
    private String paragraphTwo;
    private String footer;
    private String tittle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getParagraphOne() {
        return paragraphOne;
    }

    public void setParagraphOne(String paragraphOne) {
        this.paragraphOne = paragraphOne;
    }

    public String getParagraphTwo() {
        return paragraphTwo;
    }

    public void setParagraphTwo(String paragraphTwo) {
        this.paragraphTwo = paragraphTwo;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
