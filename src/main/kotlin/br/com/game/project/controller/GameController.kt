package br.com.game.project.controller

import br.com.game.project.model.Game
import br.com.game.project.repository.GameRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/games"])
class GameController(
    private val gameRepository: GameRepository
) {

    @PostMapping
    fun publishGame(@RequestBody game: Game): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.CREATED).body(gameRepository.save(game))
    }

    @GetMapping("/{id}")
    fun getGameById(@PathVariable id: Long): ResponseEntity<Game> {
        return gameRepository.findById(id).map { ResponseEntity.ok(it) }
            .orElse(ResponseEntity.notFound().build())
    }

    @GetMapping
    fun getAllGames(): ResponseEntity <List<Game>> {
        return ResponseEntity.ok(gameRepository.findAll())
    }

    @PutMapping
    fun updateGame(@RequestBody game: Game): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.OK).body(gameRepository.save(game))
    }

    @DeleteMapping("/{id}")
    fun deleteGameById(@PathVariable id: Long) {
        gameRepository.deleteById(id)
    }
}