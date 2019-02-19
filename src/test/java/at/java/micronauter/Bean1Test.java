package at.java.micronauter;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class Bean1Test {

    @Inject
    Bean1 bean1;
    @Inject
    Bean2 bean2;

    @Test
    void call() {
//        when(bean2.hello())
//                .thenReturn("Hello from MOck");
        bean1.call();
    }

//    @MockBean(Bean2Int.class)
//    @MockBean(Bean2.class)
//    @Primary
//    @Singleton
//    @Replaces(Bean2.class)
//    public Bean2 bean2() {
//    public Bean2Int bean2() {
//return        mock(Bean2.class);
//        return new Bean2();
//        return mock(MyBean2::class.java)
//    }
}