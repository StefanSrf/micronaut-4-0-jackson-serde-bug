package com.example

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test

@MicronautTest
internal class TestControllerTest(
    @Client("/") val client: HttpClient
) {

    @Test
    fun `should support jackson`() {
        val response = client.toBlocking().exchange("/testEndpoint", DemoObject::class.java)
        assertEquals(200, response.status.code)
    }
}
