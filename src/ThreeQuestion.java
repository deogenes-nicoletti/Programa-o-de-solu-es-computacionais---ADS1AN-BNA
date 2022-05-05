import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 3. Criar duas novas listas. Metade dos elementos armazenados na lista do item "1" deve ir para uma das listas e a outra metade para a outra lista (cópia dos dados);
 */
public class ThreeQuestion{

    public List<Integer> firstList = new ArrayList<Integer>();
    public List<Integer> secondList = new ArrayList<Integer>();

    public void Handle(List<Integer> currentList)
    {
        if(currentList.isEmpty())
        {
            System.out.println("List is empty impossible continue");
            return;
        }

        System.out.println("Original List " + Arrays.toString(currentList.toArray()) + " size " + currentList.size());

        final int maxSize = currentList.size();
        int halfIdx = Math.floorDiv(maxSize, 2);
        halfIdx = halfIdx < 1 ? 1 : halfIdx;

        firstList = currentList.subList(0, halfIdx);
        secondList = currentList.subList(firstList.size(), maxSize);

        System.out.println("First list " + Arrays.toString(firstList.toArray()) + " size " + firstList.size());
        System.out.println("Second list " + Arrays.toString(secondList.toArray())  + " size " + secondList.size() );
    }
}
