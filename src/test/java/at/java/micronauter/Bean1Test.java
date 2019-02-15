package at.java.micronauter;

import at.bayava.micronauter.MyBean2;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@MicronautTest
class Bean1Test {

    @Inject
    Bean1 bean1;
    @Inject
    Bean2Int bean2;

    @Test
    void call() {
        when(bean2.hello())
                .thenReturn("Hello from MOck");
        bean1.call();
    }

//    @MockBean(Bean2Int.class)
    @MockBean(Bean2.class)
//    @Replaces(Bean2.class)
    public Bean2Int bean2() {
return        mock(Bean2.class);
//        return new Bean2();
//        return mock(MyBean2::class.java)
    }
}