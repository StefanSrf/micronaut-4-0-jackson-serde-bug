package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller
class DemoController {

    @Get("/testEndpoint")
    fun testEndpoint(
        @QueryValue("text") text: String?
    ): HttpResponse<DemoObject> {
        return HttpResponse.ok(
            DemoObject()
        )
    }
}
