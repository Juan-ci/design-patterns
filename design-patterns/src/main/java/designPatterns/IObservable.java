package designPatterns;

public interface IObservable {

    void addObserver(IObserver o);
    
    void notifyObserver();
}
