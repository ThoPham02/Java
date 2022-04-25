package animal;

public abstract class Animal {
    public abstract void Eat();

    public void Sleep() {
        System.out.println("Zzz");
    }

    public abstract void Walk();

    public abstract void Run();

    public abstract void Roar();
}
