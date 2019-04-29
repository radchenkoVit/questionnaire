package com.radchenko.questionnaire;

import static com.radchenko.questionnaire.Application.scanner;
import static com.radchenko.questionnaire.Application.students;
import static com.radchenko.questionnaire.Radnomizer.randomFromList;

public class AnswerController {

    public static void displayMenu() {
        while (true) {
            System.out.print("Answered? ");
            String answer = scanner.next();
            if ("yes".equalsIgnoreCase(answer) || "break".equalsIgnoreCase(answer)) {
                break;
            }

            System.out.println("Answer: " + randomFromList(students));
        }

        System.out.println();
    }
}
