package backend

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {

    val jsonResponse = """{
            "id": 1,
            "name": "Joao Alves",
            "username": "joao.alves",
            "email": "joao.alves@example.com"
        }"""

    embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText(jsonResponse, ContentType.Application.Json)
            }

            get("/random") {
                call.respondText("random message", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}