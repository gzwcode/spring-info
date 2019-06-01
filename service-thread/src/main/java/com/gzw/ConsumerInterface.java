package com.gzw;


@FunctionalInterface
public interface ConsumerInterface<T> {
 void  accept(T t);
}
