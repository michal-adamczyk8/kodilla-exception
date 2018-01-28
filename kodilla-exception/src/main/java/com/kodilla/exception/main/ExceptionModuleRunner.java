package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.FirstChallenge;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
       /* FileReader fileReader = new FileReader();
        fileReader.readFile();*/

       FirstChallenge firstChallenge = new FirstChallenge();

       try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Pojawił się wyjątek: " + e);
        }
        finally {
           System.out.println("Próbę działania podjęto o " + LocalDateTime.now());
       }
    }
}
