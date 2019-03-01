package at.bayava.micronauter.websocket

import io.micronaut.http.client.annotation.Client
import io.micronaut.websocket.RxWebSocketClient
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Subscriber
@Inject
@Client("http://localhost:8761/")
//@Client("wss:ws-sandbox.kraken.com")
//@Client("https://ws-sandbox.kraken.com")
constructor(val webSocketClient: RxWebSocketClient) {

    fun start() {
        webSocketClient.connect(WsClient::class.java, "/")
                .subscribe {
                    it.send("{\n" +
                            "  \"event\": \"subscribe\",\n" +
                            "  \"pair\": [\n" +
                            "    \"XBT/USD\",\"XBT/EUR\"\n" +
                            "  ],\n" +
                            "  \"subscription\": {\n" +
                            "    \"name\": \"ticker\"\n" +
                            "  }\n" +
                            "}")
                }
    }

}