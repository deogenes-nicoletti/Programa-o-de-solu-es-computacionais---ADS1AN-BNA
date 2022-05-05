import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 2. Embaralhar os valores na lista, como se fosse um deck de cartas de baralho (a posição dos elementos na lista depois que eles foram inseridos na mesma deve mudar de lugar);
 */
public class SecondQuestion{
    
    public void ShuffleDistinct(List<Integer> numbers) throws Exception
    {
        System.out.println("Original list: \n " + Arrays.toString(numbers.toArray()));

        List<Integer> newList = new ArrayList<Integer>(Collections.nCopies(20, 0));

        for(int oldNumberIdx = 0; oldNumberIdx < numbers.size(); ++oldNumberIdx)
        {
            boolean sorted = false; 

            for(int newListIdx = 0; newListIdx < newList.size(); ++ newListIdx)
            {
                int oldNumber = numbers.get(oldNumberIdx);
                int numberInNewIdx = numbers.get(newListIdx);

                if(newList.get(newListIdx) != 0 || newListIdx == oldNumberIdx || numberInNewIdx == oldNumber)
                    continue;
                
                newList.set(newListIdx, oldNumber);
                sorted = true;
                break;
            }

            if(!sorted)
                throw new Exception("Number not sorted");
        }

        System.out.println("Shuffed distinct List: \n " + Arrays.toString(newList.toArray()));
    }
}
