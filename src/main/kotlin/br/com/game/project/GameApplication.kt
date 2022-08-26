package br.com.game.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GameApplication

fun main(args: Array<String>) {
	runApplication<GameApplication>(*args)
}