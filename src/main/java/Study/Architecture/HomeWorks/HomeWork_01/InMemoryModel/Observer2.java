package Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel;

public class Observer2 implements ModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Observer2 реагирует на изменения ...");
    }
}