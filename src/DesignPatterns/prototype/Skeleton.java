package DesignPatterns.prototype;

/**
 * class Skeleton имплементирует интерфейс Mob, который в свою очередь
 * наследует интерфейс Cloneable и переопределяет метод clone()
 * Псевдокод реализует селетов
 */

public class Skeleton implements Mob {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Skeleton)super.clone();
    }

}
