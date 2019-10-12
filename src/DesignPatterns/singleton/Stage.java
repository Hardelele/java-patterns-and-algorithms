package DesignPatterns.singleton;

    /* Паттерн проектирования Singleton с приминением метода getInstance:
     * "инициализация по требованию владельца" Подробнее о getInstance:
     * http://mng.bz/IGYx.
     */

public class Stage {

    /*
     * Приватный конструктор класса Stage
     */

    private Stage() { }

    /*
     * Приватный Singleton класс, отвечающий за создание instance'а класса Stage
     */

    private static class StageSingletonHolder {
        static Stage instance = new Stage(); // Создание экземпляра
    }

    /*
     * Метод getInstance, возвращающий экземпляр
     */

    public static Stage getInstance() {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }

}
