package org.example.devoir;
import java.nio.charset.IllegalCharsetNameException;
public class Grader {



    public char inputGrader(int number)
    {
        if(number <0) {
            throw new IllegalArgumentException("Illegal Number");
        }
        else if(number <60) {
            return 'F';
        }
        else if(number <70) {
            return 'D';
        }
        else if(number <80) {
            return 'C';
        }
        else if(number <90) {
            return 'B';
        }
        else return 'A';
    }


}
