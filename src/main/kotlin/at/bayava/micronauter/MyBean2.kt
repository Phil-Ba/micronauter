package at.bayava.micronauter

import javax.inject.Singleton

@Singleton
open class MyBean2{
    fun call(): String {
        return "Hello from myBean2!"
    }

}
