package org.example;

public class Purchase {

    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title.toLowerCase();
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }
}
