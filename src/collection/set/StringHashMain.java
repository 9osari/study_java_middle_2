package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);

        //hashCode
        System.out.println();
        System.out.println("hashCode A = " + hashCode("A"));    //hashCode A = 65
        System.out.println("hashCode B = " + hashCode("B"));    //hashCode B = 66
        System.out.println("hashCode C = " + hashCode("C"));    //hashCode C = 67
        System.out.println("hashCode AB = " + hashCode("AB"));  //hashCode AB = 131

        //hashIndex
        System.out.println("hashIndexA = " + hashIndex(hashCode("A")));
        System.out.println("hashIndexB = " + hashIndex(hashCode("B")));
        System.out.println("hashIndexC = " + hashIndex(hashCode("C")));
        System.out.println("hashIndexAB = " + hashIndex(hashCode("AB"))); //131 % 10 = 1
    }

    private static int hashIndex(int index) {
        return index % CAPACITY;
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

}
