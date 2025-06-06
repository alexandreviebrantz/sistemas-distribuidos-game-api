package br.com.unicuritiba.gamelibraryjava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.gamelibraryjava.models.Game;
import br.com.unicuritiba.gamelibraryjava.repository.GameRepository;

@RestController
public class GameController {
	@Autowired
	GameRepository repository;

	@GetMapping("/games")
	public ResponseEntity<List<Game>> getGame() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping("/games")
	public ResponseEntity<Game> saveGame(@RequestBody Game game) {
		Game gameSalvo = repository.save(game);
		return ResponseEntity.ok(gameSalvo);
	}

	@DeleteMapping("/games/{id}")
	public void removeGame(@PathVariable long id) {
		repository.deleteById(id);
	}

}
