package at.java.micronauter;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Bean1 {

    @Inject
    Bean2Int bean2;

    public void call(){
        System.out.println(bean2.hello());
    }

}
