package at.java.micronauter;

import javax.inject.Singleton;

@Singleton
public class Bean2 implements Bean2Int {

    @Override
    public String hello() {
        return "Hello from Bean2";
    }
}
