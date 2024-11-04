package ru.oop.task1;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Доехать по возможности до указанного местоположения на машине
     * @param car машина, на которой человек может доехать
     * @param destination место назначения
     * */
    void move(Car car, Position destination);

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
}
