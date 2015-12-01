import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionsOps {

    public static List<Integer> odd(List<Integer> numbers) {
        List<Integer> oddNumbers=new ArrayList<>();
        for(int i=0;i<numbers.size();i++)
        {
            if (numbers.get(i)%2!=0)
            {
               oddNumbers.add(numbers.get(i));
            }
        }
       return  oddNumbers;

    }

    public static List<Integer> doubleEvens(List<Integer> numbers) {
        int count=0;
        for(Iterator<Integer> i=numbers.iterator();i.hasNext();)
        {
            int num=i.next();

            if (num%2==0)
            {
                num=num*2;

                numbers.set(count,num);

            }
            count++;
        }
        return numbers;
    }

    public static String tryFind(Integer toFind, List<Integer> numbers) {
        String fin=null;
        for(Iterator<Integer> i=numbers.iterator();i.hasNext();)
        {
            int num=i.next();
            if (toFind==num)
            {
                 fin="Hello"+", "+num;
                return fin;
            }
        }
        if (fin==null)
        {
            fin="Not Found";
        }
        return fin ;
    }
}
