import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 1");
        List<Integer> numbers = Arrays.asList(2,2,3,4,5,8,9,10,10,11,11,12,12,16,18,18,21,21,23,25);
        System.out.println(Arrays.toString(numbers.toArray()));

        SecondQuestion secondQuestion = new SecondQuestion();
        System.out.println("\n\nQuestion 2");
        secondQuestion.ShuffleDistinct(numbers);

        ThreeQuestion threeQuestion = new ThreeQuestion();
        System.out.println("\n\nQuestion 3");
        threeQuestion.Handle(numbers);

        System.out.println("\n\nQuestion 4 \nnumber1: " + FourthQuestion.number1 + " number2: " + FourthQuestion.number2);

        FifthQuestion fifthQuestion = new FifthQuestion(threeQuestion);
        fifthQuestion.Handle();
    }
}
