package com.dongverine.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    //runApplication<SpringbootKotlinGradleJdk6Application>(*args)
    SpringApplication.run(Application::class.java, *args)
}
