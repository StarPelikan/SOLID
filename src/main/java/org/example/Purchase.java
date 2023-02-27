package org.example;

public class Purchase {
    //Слишком много всего в классе, нарушение первого принципа SOLID
    //Оставил здесь конструктор.
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;

    }
}
