package at.bayava.micronauter

import at.bayava.micronauter.websocket.Subscriber2
import io.micronaut.runtime.Micronaut

/**
 *
 */
class Main {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
        Micronaut
                .build()
                .packages("at.bayava.micronauter")
                .mainClass(Main.javaClass)
                .start()
//                .getBean(Subscriber::class.java)
                .getBean(Subscriber2::class.java)
                .start()
//    ApplicationContext.run().use { context ->
//        val myBean = context.getBean(MyBean::class.java)
//        println(myBean)
//        println(myBean.does())
//         do something with your bean
        }
    }


}