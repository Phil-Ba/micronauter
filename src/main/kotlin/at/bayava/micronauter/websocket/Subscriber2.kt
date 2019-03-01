package at.bayava.micronauter.websocket

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Subscriber2
@Inject
//@Client("http://localhost:8761/")
//@Client("wss:ws-sandbox.kraken.com")
//@Client("https://ws-sandbox.kraken.com")
constructor(val wsClient: WsClient) {

    fun start() {
        wsClient.send("{\n" +
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