package DesignPatterns.prototype;

/**
 * class Dragon имплементирует интерфейс Mob, который в свою очередь
 * наследует интерфейс Cloneable и переопределяет метод clone()
 * Псевдо код реализует Драконов
 */

public class Dragon implements Mob {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Dragon)super.clone();
    }

}
