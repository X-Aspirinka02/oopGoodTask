package ru.oop.task3;

/**
 * Все виды транспорта
 */
public interface Transport extends Positioned {
    /**
     * По возможности перевезти человека до заданной точки
     * @param person человек
     * @param destination заданная точка
     */
    void move(Person person, Position destination);
}

