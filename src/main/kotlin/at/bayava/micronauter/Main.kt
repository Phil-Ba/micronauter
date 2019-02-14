package at.bayava.micronauter

import io.micronaut.context.ApplicationContext

/**
 *
 */
class Main {

}

fun main(args: Array<String>) {
    ApplicationContext.run().use { context ->
        val myBean = context.getBean(MyBean::class.java)
        println(myBean)
        println(myBean.does())
        // do something with your bean
    }
}