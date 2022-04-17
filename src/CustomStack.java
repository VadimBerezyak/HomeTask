import java.util.Arrays;

public class CustomStack {

    private static final Object customNull = "SUPERNULL";
    private static Object[] sourceArray = {null};
    private static Object[] resultArray = new Object[sourceArray.length];

    public static void main(String[] args) {
        addElement("123", customNull, sourceArray);
    }

    public static void addElement(Object str, Object customNull, Object[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            resultArray[i] = sourceArray[i];
        }
        if (sourceArray[sourceArray.length - 1] != customNull && sourceArray[sourceArray.length - 1] != null) {
            Object[] resultArray = new Object[(int) Math.ceil(sourceArray.length * 1.5)];
            for (int i = 0; i < sourceArray.length; i++) {
                resultArray[i] = sourceArray[i];
            }
            resultArray[sourceArray.length] = str;
            if (resultArray[resultArray.length - 1] == null) {
                resultArray[sourceArray.length + 1] = customNull;
            }
            sourceArray = resultArray;
            System.out.println(Arrays.toString(sourceArray));
        } else if (sourceArray[sourceArray.length - 1] == customNull) {
            Object[] resultArray = new Object[(int) Math.ceil(sourceArray.length * 1.5)];
            for (int i = 0; i < sourceArray.length; i++) {
                resultArray[i] = sourceArray[i];
            }
            resultArray[sourceArray.length - 1] = str;
            resultArray[sourceArray.length] = customNull;
            sourceArray = resultArray;
            System.out.println(Arrays.toString(sourceArray));
        } else if (sourceArray[sourceArray.length - 1] == null && sourceArray.length != 1) {
            for (int i = 0; i < sourceArray.length; i++) {
                if (sourceArray[i] == customNull) {
                    resultArray[i] = str;
                    resultArray[i + 1] = customNull;
                    sourceArray = resultArray;
                    break;
                }
                sourceArray = resultArray;
            }
            System.out.println(Arrays.toString(sourceArray));

        } else if (sourceArray[sourceArray.length - 1] == null && sourceArray.length == 1) {
            resultArray[0] = str;
            sourceArray = resultArray;
            System.out.println(Arrays.toString(sourceArray));
        }
    }
}

