package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.*;

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
           System.out.println("");
       }

        SecondChallenge secondChallenge = new SecondChallenge();

       try {
           secondChallenge.probablyWillThrowException(0,4);
       } catch (Exception e){
           System.out.println("Wystąpił wyjątek: " + e);
       }
       finally {
           System.out.println("Próbę działania podjęto o " + LocalDateTime.now());
           System.out.println("");
       }


        Flight flight1 = new Flight("Warsaw", "Cracow");
        FlightSearcher flightSearcher = new FlightSearcher();
       try {
           flightSearcher.findFlight(flight1);
       } catch (RouteNotFoundException e){
           System.out.println("The searched route was not found.");
       }


    }
}
