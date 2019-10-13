package DesignPatterns.prototype;

/**
 * Класс Spawner хранит в кэше экземпляры классов Skeleton и Dragon и в случае чего выдаёт их копии
 */

public class Spawner {

    private Skeleton skeleton = new Skeleton();

    private Dragon dragon;

    public Dragon getDragon() throws CloneNotSupportedException {
        return (Dragon) dragon.clone();
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public Skeleton getSkeleton() throws CloneNotSupportedException {
        return (Skeleton) skeleton.clone();
    }

    public void setSkeleton(Skeleton skeleton) {
        this.skeleton = skeleton;
    }
}
