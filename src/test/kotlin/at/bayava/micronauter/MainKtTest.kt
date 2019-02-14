package at.bayava.micronauter

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

/**
 *
 */
@MicronautTest
internal class MainKtTest
//@Inject constructor(val myBean: MyBean)
{
@Inject lateinit var myBean: MyBean


    @Test
    fun t1() {
        println(myBean.does())
    }

}