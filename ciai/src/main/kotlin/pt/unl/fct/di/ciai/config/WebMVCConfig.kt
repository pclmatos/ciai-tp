package pt.unl.fct.di.ciai.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import pt.unl.fct.di.ciai.RequestLoggingInterceptor

@Configuration
class WebMvcConfig : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        //registry.addInterceptor(RequestLoggingInterceptor())
    }
}
