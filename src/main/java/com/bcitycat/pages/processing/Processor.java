package com.bcitycat.pages.processing;

public class Processor {
    private static final Processor instance = new Processor();

    public static Processor getInstance() {
        return instance;
    }

    private Processor() {
    }

    /**
     * Pushes an article for processing
     */
    private void pushArticle(Article article) {



    }
}
