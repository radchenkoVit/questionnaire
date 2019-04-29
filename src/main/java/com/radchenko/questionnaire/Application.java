package com.radchenko.questionnaire;

import java.util.List;
import java.util.Scanner;

import static com.radchenko.questionnaire.FileReader.loadLines;
import static com.radchenko.questionnaire.Radnomizer.randomFromList;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static List<String> students;
    private static List<String> questions;

    public static void main(String[] args) {
        questions = loadLines(args[0]);
        students = loadLines(args[1]);

        if (questions.isEmpty()) {
            System.out.println("No questions found");
            return;
        }

        System.out.println("Welcome to 'Questionnaire'");
        scanner.nextLine();

        while (true) {
            System.out.println("Answer: " + randomFromList(students));

            String question = randomFromList(questions);
            System.out.println("Question: " + question);

            AnswerController.displayMenu();
            questions.remove(question);

            if (questions.isEmpty()) {
                System.out.println("No question left");
                break;
            }

            if ("break".equalsIgnoreCase(scanner.nextLine())) {
                break;
            }
        }

        System.out.println("Thank you for using 'Questionnaire'");
    }
}
