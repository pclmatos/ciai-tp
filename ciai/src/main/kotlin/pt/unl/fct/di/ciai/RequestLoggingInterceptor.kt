package pt.unl.fct.di.ciai

import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import javax.servlet.http.HttpServletRequest

@Component
class RequestLoggingInterceptor : HandlerInterceptor {
    override fun preHandle(
        request: jakarta.servlet.http.HttpServletRequest,
        response: jakarta.servlet.http.HttpServletResponse,
        handler: Any
    ): Boolean {
        val requestURI = request.requestURL
        val method = request.method
        val body = readRequestBody(request = request)
        println("Request: $method $requestURI ")
        println("Body: $body ")

        return true
    }

    private fun readRequestBody(request: jakarta.servlet.http.HttpServletRequest): String {
        val buffer = StringBuilder()
        val reader = request.reader
        reader.use {
            var line: String? = it.readLine()
            while (line != null) {
                buffer.append(line)
                line = it.readLine()
            }
        }
        return buffer.toString()
    }
}
