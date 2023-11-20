# FilmQueryProject

# Description
You will create a command-line application that retrieves and displays film data. It will be menu-based, allowing the user to choose actions and submit query data.

All JDBC code will be encapsulated in methods of the com.skilldistillery.filmquery.database.DatabaseAccessorObject class. As you need new database access methods, declare them first in the DatabaseAccessor interface, then implement them in DatabaseAccessorObject. Methods should return objects like Film, Actor, and List<Actor>, not String or List<String>.

All user input and display output will be in methods of com.skilldistillery.filmquery.app.FilmQueryApp (or additional application classes in that package, if you choose to create them.) Comment out app.test(); and uncomment app.launch() as a starting point.

User Stories
User Story 1
The user is presented with a menu in which they can choose to:

Look up a film by its id.
Look up a film by a search keyword.
Exit the application.
User Story 2
If the user looks up a film by id, they are prompted to enter the film id. If the film is not found, they see a message saying so. If the film is found, its title, year, rating, and description are displayed.

User Story 3
If the user looks up a film by search keyword, they are prompted to enter it. If no matching films are found, they see a message saying so. Otherwise, they see a list of films for which the search term was found anywhere in the title or description, with each film displayed exactly as it is for User Story 2.

User Story 4
When a film is displayed, its language (English,Japanese, etc.) is displayed, in addition to the film's title, year, rating, and description.

User Story 5
When a film is displayed, the list of actors in its cast is displayed, in addition to the film's title, year, rating, description, and language.
# Technologies Used
 Java,OOP, Eclipse, MySQL, JDBC
# Lessons Learned
 OOP, Reading data from Database, Implementing SQL commands with Java, Encapsulation.