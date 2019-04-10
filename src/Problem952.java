import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem952 {
    public int[] prisonAfterNDays(int[] cells, int N) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        hashMap.put(new Integer(binaryToNumber(cells)),0);
        list.add(new Integer(binaryToNumber((cells))));
        int currDay = 1;
        while(currDay<= N) {
            int[] newCells = new int[8];
            for (int i =1; i< cells.length -1; i++) {
                if(cells[i-1] == cells[i+1]) newCells[i] = 1;
                else newCells[i] = 0;
            }
            cells = newCells;
            Integer cellNum = new Integer(binaryToNumber(cells));
            if(hashMap.containsKey(cellNum)) {
                int startCircleDay = hashMap.get(cellNum);
                int sameDay = (N-startCircleDay) % (currDay-startCircleDay) + startCircleDay;
                int resultNum = list.get(sameDay).intValue();
                return numberToBinary(resultNum);
            } else {
                hashMap.put(new Integer(binaryToNumber(cells)), currDay);
                list.add(new Integer(binaryToNumber((cells))));
                currDay++;
            }

        }
        return cells;
    }

    private int binaryToNumber(int[] nums) {
        int result = 0;
        int n = 0;
        for(int i =nums.length-1;i>=0;i--) {
            result += Math.pow(2,n)*nums[i];
            n++;
        }
        return result;
    }

    private int[] numberToBinary(int num) {
        int[] result = new int[8];
        int index = 7;
        StringBuilder stringbuilder = new StringBuilder();
        while(num >0) {
            result[index] = num%2;
            num = num /2;
            index --;
        }
        return result;
    }
}
