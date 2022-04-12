import java.util.Arrays;

public class CustomStack {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            addElement(String.valueOf(i));
        }
    }

    private static String[] sourceArray = new String[1];

    public static void addElement(String str) {
        if (sourceArray[sourceArray.length - 1] != null) {
            String[] resultArray = new String[(int) Math.ceil(sourceArray.length * 1.5)];
            System.arraycopy(sourceArray, 0, resultArray, 0, sourceArray.length);
            resultArray[sourceArray.length] = str;
            sourceArray = resultArray;
            System.out.println(Arrays.toString(sourceArray));
        }else {
            for (int i = 0; i < sourceArray.length; i++) {
                if (sourceArray[i] == null) {
                    sourceArray[i] = str;
                    break;
                }
            }
        }
    }
}



