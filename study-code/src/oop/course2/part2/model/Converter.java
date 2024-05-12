package oop.course2.part2.model;
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
