package at.bayava.micronauter

import javax.inject.Singleton

@Singleton
class MyBean (private val myBean2: MyBean2) {
//class MyBean @Inject  constructor (val myBean2: MyBean2) {
//class MyBean {

//    @Inject
//    lateinit var myBean2: MyBean2

    fun does () {
        println(myBean2.call())
    }

}
