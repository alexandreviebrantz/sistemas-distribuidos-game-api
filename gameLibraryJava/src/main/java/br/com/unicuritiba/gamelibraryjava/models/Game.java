package br.com.unicuritiba.gamelibraryjava.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_library")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="game_name")
	private String game_name;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="price")
	private float price;
	
	@Column(name="multi_player")
	private boolean multi_player;
	
	@Column(name="play_online")
	private boolean play_online;
	
	@Column(name="year")
	private int year;
	
	@Column(name="min_memory_pc")
	private int min_memory_pc;
	
	@Column(name="min_memory_gpu")
	private int min_memory_gpu;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getgame_name() {
		return game_name;
	}

	public void setgame_name(String game_name) {
		this.game_name = game_name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean ismulti_player() {
		return multi_player;
	}

	public void setmulti_player(boolean multi_player) {
		this.multi_player = multi_player;
	}

	public boolean isplay_online() {
		return play_online;
	}

	public void setplay_online(boolean play_online) {
		this.play_online = play_online;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getmin_memory_pc() {
		return min_memory_pc;
	}

	public void setmin_memory_pc(int min_memory_pc) {
		this.min_memory_pc = min_memory_pc;
	}

	public int getmin_memory_gpu() {
		return min_memory_gpu;
	}

	public void setmin_memory_gpu(int min_memory_gpu) {
		this.min_memory_gpu = min_memory_gpu;
	}
	
}


