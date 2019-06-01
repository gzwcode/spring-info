package com.gzw;

import java.util.List;

public class MyStream<T> {
    private List<T> list;

    public void myForEach(ConsumerInterface<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
