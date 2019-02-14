package at.bayava.micronauter

import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import javax.inject.Inject


/**
 *
 */
@MicronautTest
internal class MainKtTest2
//@Inject constructor(val myBean: MyBean)
{
@Inject lateinit var myBean: MyBean
@Inject lateinit var myBean2i: MyBean2


    @Test
    fun t2() {
        `when`(myBean2i.call())
                .thenReturn("Mocked!")

        println(myBean.does())
    }

    @MockBean(MyBean2::class)
    fun myBean2(): MyBean2 {
        return MyBean2()
//        return mock(MyBean2::class.java)
    }

}