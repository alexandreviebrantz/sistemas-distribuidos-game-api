package br.com.unicuritiba.gamelibraryjava.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.gamelibraryjava.models.Game;

public interface GameRepository 
	extends JpaRepository<Game, Long>{

}
