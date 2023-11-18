package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();
		try {
//		app.test();
			app.launch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void launch() throws SQLException {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);

		input.close();
	}

	private void startUserInterface(Scanner input) throws SQLException {
		String choice = "";
		while (!choice.equals("3")) {
			displayMenu();
			choice = input.next();
			switch (choice) {
			case "1":
				optionOne(input);
				break;
			case "2":
				optionTwo(input);
				break;
			case "3":
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("Invalid entry, try again!");
			}
		}
	}

	private void optionOne(Scanner sc) throws SQLException {
		Film film = null;
		System.out.print("Enter film ID: ");
		int filmId = sc.nextInt();
		film = db.findFilmById(filmId);

		if (film != null) {
			printFilm(film);
		} else {
			System.out.println("No such film exist!");
		}

	}

	private void printFilm(Film film) {
		System.out.println("Title: " + film.getTitle() + ", Realease year: " + film.getReleaseYear() + ", Rating: "
				+ film.getRating() + ", Description: " + film.getDescription() + ", Language: " + film.getLanguage());
		for (Actor actor : film.getActors()) {
			System.out.println(actor);
		}
	}

	private void optionTwo(Scanner sc) {
		System.out.print("Enter a keyword: ");
		String keyword = sc.next();
		List<Film> films = db.findFilmsByKeyword(keyword);

		if (!films.isEmpty()) {
			for (Film film : films) {
				printFilm(film);
			}
		} else {
			System.out.println("No such film exist!");
		}
	}

	private void displayMenu() {
		System.out.println("1. Look up a film by its id.");
		System.out.println("2. Look up a film by a search keyword.");
		System.out.println("3. Exit the application.");
		System.out.print("Choose one option: ");
	}

	private void test() throws SQLException {
		// Film film = db.findFilmById(1);
		Actor actor = db.findActorById(1);
		for (Film film : actor.getFilms()) {
			System.out.println(film);
		}
	}

}
