package com.dongverine.springboot_kotlin_gradle_jdk6

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.support.SpringBootServletInitializer

class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(SpringbootKotlinGradleJdk6Application::class.java)
    }

}
