package com.dongverine.springboot_kotlin_gradle_jdk6

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKotlinGradleJdk6Application

fun main(args: Array<String>) {
    //runApplication<SpringbootKotlinGradleJdk6Application>(*args)
    SpringApplication.run(SpringbootKotlinGradleJdk6Application::class.java, *args)
}
