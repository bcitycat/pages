package com.bcitycat.pages.crawler;

import com.gargoylesoftware.htmlunit.WebClient;

import java.util.Date;

public class Crawler {
    private final WebClient webClient = new WebClient();

    public Crawler() {
    }

    public void run() {
        Date startDate = new Date();
        // http://444.hu/2016/03/27/
        // webClient.getPage("http://444.hu/" + startDate.)
    }
}
