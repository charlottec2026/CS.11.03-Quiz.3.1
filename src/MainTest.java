import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateGrade() {
        assertEquals('A', Main.calculateGrade(90));
        assertEquals('B', Main.calculateGrade(80));
        assertEquals('C', Main.calculateGrade(79));
        assertEquals('D', Main.calculateGrade(69));
        assertEquals('F', Main.calculateGrade(49));
    }

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        assertEquals("fizz", Main.fizzBuzz(3));
        assertEquals("buzz", Main.fizzBuzz(5));
        assertEquals("fizzbuzz", Main.fizzBuzz(15));
        assertEquals("unlucky", Main.fizzBuzz(16));
        assertEquals("buzz", Main.fizzBuzz(100));
    }

    @org.junit.jupiter.api.Test
    void frontBack() {
        assertEquals("hehellohe", Main.frontBack("hello"));
        assertEquals("hihihi", Main.frontBack("hi"));
        assertEquals("g", Main.frontBack("g"));
    }

    @org.junit.jupiter.api.Test
    void twoAsOne() {
        assertTrue(Main.twoAsOne(1,2,3));
        assertTrue(Main.twoAsOne(4,11,-7));
        assertFalse(Main.twoAsOne(4,6,12));
    }

    @org.junit.jupiter.api.Test
    void endUp() {
        assertEquals("heLLO", Main.endUp("hello"));
        assertEquals("for sURE", Main.endUp("for sure"));
        assertEquals("GG", Main.endUp("gg"));
   }
}