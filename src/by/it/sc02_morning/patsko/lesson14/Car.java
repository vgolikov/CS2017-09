package by.it.sc02_morning.patsko.lesson14;
/**Подкласс абстрактного класса <b>AbstractCarКласс</b> служит для хранения объектов со свойством <b>speed</b>
 * @author Аркадий Пацко
 * @version 1.0
 * */
public class Car extends AbstractCar {
    /**Создает новый объект
     * @param speed Скорость автомобиля
     * @see Car#Car(int)
     * */
    public Car(int speed) {
        super(speed);
    }

    /**Реализация абстрактного метода суперкласса.
     * Выводит на экран собщение "Автомобиль включил зажигание"
     * */
    public void fire(){
        System.out.println(this+" включил зажигание");
    }

    /**Реализация абстрактного метода суперкласса.
     * Выводит на экран собщение "Автомобиль поехал со скоростью speed км/ч",
     * гда speed - значение, хранящееся в свойстве speed,
     * полученное с помощью унаследованного метода getSpeed
     * */
    public void start(){
        System.out.println(this+" поехал со скоростью "+getSpeed()+" км/ч");
    }

    /**Реализация абстрактного метода суперкласса.
     * Выводит на экран собщение "Автомобиль остановился",
     * */
    public void stop(){
        System.out.println(this+" остановился");
    }

    /**Реализация абстрактного метода суперкласса.
     * Выводит на экран собщение "Автомобиль сигналит: Пи-бип!",
     * */
    public void beep(){
        System.out.println(this+" сигналит: Пи-бип!");
    }

    /**Реализация абстрактного переопределенного метода суперкласса.
     * @return Строка "Автомобиль",
     * */
    public String toString(){
        return "Автомобиль";
    }
}
