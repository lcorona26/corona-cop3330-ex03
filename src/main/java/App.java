/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

/*
Exercise 3 - Printing Quotes
Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.

 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String quote = app.readQuote();
        String author = app.readAuthor();
        String output = app.createOutput(quote, author);
        app.printOutput(output);


    }

    private void printOutput(String output) {
        System.out.println(output);
    }

    private String createOutput(String quote, String author) {
        return author + " says, " + "\""+ quote +"\"";
    }

    private String readQuote() {
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        return quote;
    }
    private String readAuthor() {
        System.out.print("Who said it? ");
        String author = in.nextLine();
        return author;
    }
}
