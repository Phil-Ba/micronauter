package at.java.micronauter;


import io.micronaut.runtime.context.scope.ThreadLocal;

//@Singleton
@ThreadLocal
public class Bean2
{
//        implements Bean2Int {@Override
    public String hello() {
        return "Hello from Bean2";
    }
}
