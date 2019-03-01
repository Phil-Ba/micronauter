package at.bayava.micronauter.websocket

import io.micronaut.websocket.annotation.ClientWebSocket
import io.micronaut.websocket.annotation.OnMessage

//@ClientWebSocket(uri = "/")
@ClientWebSocket(uri = "https://ws-sandbox.kraken.com")
abstract class WsClient : AutoCloseable {

    @OnMessage
    fun received(msg: String) {
        println(msg)
    }

    abstract fun send(message: String): io.reactivex.Single<String>

}