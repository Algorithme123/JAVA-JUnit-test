package devoirTest;
import static org.junit.Assert.assertEquals;
import org.example.devoir.Grader;
import org.junit.Test;

public class GraderTest {

    @Test
    public void sisixtySixShouldReturnD(){
        Grader grader = new Grader();
        assertEquals( 'D', grader.inputGrader(66));
    }

    @Test
    public void fourteenReturnD(){
        Grader grader = new Grader();
        assertEquals( 'F', grader.inputGrader(14));
    }
    @Test
    public void eightyFiveReturnB(){
        Grader grader = new Grader();
        assertEquals( 'B', grader.inputGrader(85));
    }
}
