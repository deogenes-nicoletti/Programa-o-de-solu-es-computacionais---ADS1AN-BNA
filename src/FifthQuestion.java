import java.util.Arrays;
import java.util.List;

public class FifthQuestion
{
    protected ThreeQuestion threeQuestion;

    public FifthQuestion(
        ThreeQuestion threeQuestion
    ){
        this.threeQuestion = threeQuestion;
    }

    public void Handle()
    {
        List<Integer> firstList = this.threeQuestion.firstList;
        List<Integer> secondList = this.threeQuestion.secondList;

        final int firstListSize = firstList.size();
        final int secondListSize = secondList.size();

        for(int idx = 0; idx < firstListSize; ++idx)
        {
            if(secondListSize < idx)
            {
                System.out.println("Second list size is smaller than the first list, impossible continue");
                break;
            }

            int firstListValue = firstList.get(idx);
            int secondListValue = secondList.get(idx);

            Process(firstListValue, secondListValue);
        }

        System.out.println("\n\nQuestion 5 \nnumber1: " + FourthQuestion.number1 + " number2: " + FourthQuestion.number2);
    }

    protected void Process(int firstValue, int secondValue)
    {
        final boolean isEquals = firstValue == secondValue;
        final boolean firstIsGreather = firstValue > secondValue;
        final boolean firstIsSmaller = !isEquals && !firstIsGreather;

        if(firstIsGreather)
            ++FourthQuestion.number1;
        else if(firstIsSmaller)
            ++FourthQuestion.number2;
    }
}
