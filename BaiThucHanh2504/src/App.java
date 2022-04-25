import car.*;
import person.*;
import animal.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Test Person
        OffStudent offStu = new OffStudent("Tho", 20, "Mo - Dia Chat", 8);
        offStu.display();

        OnlStudent onlStu = new OnlStudent("Tho", 20, "Mo - Dia Chat", "Java OOP");
        onlStu.display();

        PartTimeEmployee pt = new PartTimeEmployee("Tho", 20, "Deverloper", 20);
        pt.display();

        FullTimeEmployee ft = new FullTimeEmployee("Tho", 20, "Tester", 2);
        ft.display();

        // Test car
        Car c = new TaxiCar();
        c.Move();
        c.Reverse();
        c.Stop();
        c.TurnLeft();
        c.TurnRight();

        // Test animal
        Animal a = new Tiger();
        a.Eat();
        a.Roar();
        a.Run();
        a.Sleep();
        a.Walk();
    }
}
