package ru.oop.task3;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
    /**
     * По возможности доехать до заданной точки на транспорте
     * @param transport вид транспорта
     * @param destination заданная точка
     */
    void moveOnTransport(Transport transport, Position destenation);
}
