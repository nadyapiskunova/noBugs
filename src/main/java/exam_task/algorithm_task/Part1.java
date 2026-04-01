package exam_task.algorithm_task;

import java.util.*;
import java.util.stream.Collectors;

public class Part1 {
    public static void isPalindrome(String s){
        if (s == null || s.isEmpty()){
            System.out.println("Строка пустая или null");
        } else {
            String clean = s.replaceAll("\\s+", "").toLowerCase();
            boolean result = new StringBuilder(clean).reverse().toString().equals(clean);
            System.out.println(result);
        }
    }
    public static void sumNumArray(int[] array){
        int sum = 0;
        boolean isPositive = true;
        if (array == null || array.length == 0){
            System.out.println("Массив пустой или null");
        } else {
            for(int arr : array){
                if (arr < 0){
                    System.out.println("Массив должен быть положительным");
                    isPositive = false;
                    break;
                } else {
                    sum += arr;
                }
            }
            if (isPositive){
                System.out.println(sum);
            }
        }
    }
    public static void findMaxArray(int[] array){
        boolean isPositive = true;
        int max = Integer.MIN_VALUE;
        if (array == null || array.length == 0) {
            System.out.println("Массив пустой или null");
        } else {
            for(int num : array){
                if (num < 0){
                    System.out.println("отрицательный");
                    isPositive = false;
                    break;
                }else if(num > max){
                    max = num;
                }
            }
            if (isPositive){
                System.out.println(max);
            }
        }
    }
    public static  void checkIsSimpleNum(int num){
        boolean isSimple = true;
        if (num == 1 || num == 0){
            System.out.println("Число не простое");
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isSimple = false;
                    break;
                }
            }
            if (isSimple){
                System.out.println("Число простое");
            } else {
                System.out.println("Число не простое");
            }
        }
    }
    public static void calculateFactorial(int num){
        int result = 1;
        if(num == 0 || num ==1){
            System.out.println(1);
            return;
        }
        if (num < 0){
            System.out.println("Число отрицательное");
            return;
        }
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println(result);
    }
    public static void calculateVowels(String s){
        int count = 0;
        if (s == null || s.isEmpty()){
            System.out.println("Пустая строка");
            return;
        } else {
            for(char ch : s.toLowerCase().toCharArray()){
                if (("аеёиоуэяюыeuoai").indexOf(ch) > 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void findSecondMax(int[] array){
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        boolean isPositive = true;
        if (array == null || array.length == 0){
            System.out.println("Массив пустой или null");
        } else {
            for (int num : array) {
                if (num < 0) {
                    isPositive = false;
                    System.out.println("В массиве отрицательные числа!");
                    break;
                } else if (num > fMax) {
                    sMax = fMax;
                    fMax = num;
                }
                if (num > sMax && num != fMax) {
                    sMax = num;
                }
            }

        }
        if (isPositive) {
            System.out.println(sMax);
        }
    }
    public static void checkIsAnagram(String a, String b){
        if (a == null || a.isEmpty() || b == null || b.isEmpty()){
            System.out.println("Одна или две строки пустые");
        } else {
            char[] ca = a.toLowerCase().replaceAll("\\s+", "").toCharArray(),
                    cb = b.toLowerCase().replaceAll("\\s+", "").toCharArray();
            Arrays.sort(ca);
            Arrays.sort(cb);
            boolean result = Arrays.equals(ca, cb);
            System.out.println(result);
        }
    }
    public static void countWords(String s){
        if(s == null || s.trim().isEmpty()){
            System.out.println(0);
        } else {
            int count = s.trim().split("\\s+").length;
            System.out.println(count);
        }
    }
    public static int countSumInList(List<Integer> numbers){
        int sum = 0;
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
        for (Integer n : numbers){
            if (n != null){
                sum += n;
            }
        }
        return sum;
    }
    public static boolean checkIsUnique(int[] num){
        Set<Integer> set = new HashSet<>();
        for(int n : num){
            if(!set.add(n))
                return false;
        }
        return true;
    }
    public static void safeDivide(int a, int b){
        try{
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e){
            if (b == 0){
                System.out.println("Деление на ноль запрещено!");
            }
        }
    }
    public static void filterByA(List<String> list){
        if (list == null || list.isEmpty()){
            System.out.println("Список пустой или null");
        } else {
            List<String> filteredList = list.stream()
                    .filter(s -> s.trim().startsWith("А"))
                    .collect(Collectors.toList());
            if (filteredList.isEmpty()){
                System.out.println("Строк с префиксом A - нет!");
                return;
            }
            System.out.println(filteredList);
        }
    }
    public static void removeDuplicates(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()){
            System.out.println("Список пустой или null");
        } else {
            List<Integer> removeList = new ArrayList<>(new LinkedHashSet<>(numbers));
            System.out.println(removeList);
        }

    }
    public static void filterOddNumber(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()){
            System.out.println("Список пустой или null");
        } else {
            List<Integer> oddNumber = numbers.stream()
                    .filter(n -> n % 2 !=0)
                    .collect(Collectors.toList());
            if (oddNumber.isEmpty()){
                System.out.println("В списке нет нечетных чисел");
                return;
            }
            System.out.println(oddNumber);
        }
    }

    public static boolean isHasNumber(List<Integer> numbers, int num){
        if (numbers == null || numbers.isEmpty()){
            return false;
        }
        return numbers.contains(num);
    }
    public static boolean isNumber(String s){
        if (s == null || s.isEmpty()){
            return false;
        }
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static List<Integer> merge(List<Integer> listA,List<Integer> listB){
        if (listA == null || listB == null || listA.isEmpty() || listB.isEmpty())
            throw new IllegalArgumentException("Оба или один список null илт пустой");

        List<Integer> listMerge = new ArrayList<>(listA);
        listMerge.addAll(listB);
        return listMerge;
    }

    public static boolean isIven(int num){
        if(num == 0) return false;
        return num % 2 == 0;
    }
    public static String concatString(String[] s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length; i++){
            sb.append(s[i]);
            if(i != s.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static Map<String,Integer> countWordsOfString(String s){
        Map<String,Integer> mapCount = new HashMap<>();
        String[] words = s.trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
        for(String word : words){
            if(mapCount.containsKey(word)) {
                mapCount.put(word, mapCount.get(word) + 1);
            } else {
                mapCount.put(word, 1);
            }
        }
        return mapCount;
    }

    public static void printElement(Queue<String> queue){
        if (queue.isEmpty()) System.out.println("Очередь пуста");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void sortString(List<String> list){
        if(list == null || list.isEmpty()) return;
        list.sort(Comparator.comparingInt(String::length));
    }

    public static void compareVersion(String v1, String v2){
        if (v1 == null || v2 == null){
            throw new IllegalArgumentException("Передан null");
        }
        if (v1.isEmpty() || v2.isEmpty()){
            throw new IllegalArgumentException("Один или оба аргументы пустые!");
        }

        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");

        for(int i = 0; i < Math.max(a.length, b.length); i++){
            int num1 = (i < a.length) ? Integer.parseInt(a[i]) : 0;
            int num2 = (i < b.length) ? Integer.parseInt(b[i]) : 0;

            if (num1 > num2){
                System.out.println("Версия: " + v1 + " новее");
                return;
            }
            if (num2 > num1){
                System.out.println("Версия: " + v2 + " новее");
                return;
            }
        }
        System.out.println("Версии одинаковые ");
    }
    public static boolean isPalindromeNumber(int num){
        int rev = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return original == rev;
    }
    public static int randomNumber10(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static void countUniqeChar(String s){
        Set<Character> set = new HashSet<>();
        for (Character ch : s.toLowerCase().toCharArray()){
            set.add(ch);
        }

        System.out.println(set.size());
    }

    public static void removeSpace(String s){
        System.out.println(s.replaceAll("\\s+", ""));
    }

    public static int[] findSumTwoNumberForTarget(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int currentNum = array[i];
            int complement = target - currentNum;

            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(currentNum, i);
        }
        throw new IllegalArgumentException("В массиве нет чисел, которые бы составили заданную сумму");
    }

    public static int [] unique(int[] array){
        return Arrays.stream(array)
                .distinct()
                .toArray();
    }

    public static int[] newSortArray(int[] arrayA, int[] arrayB){
        int[] result = new int[arrayA.length + arrayB.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrayA.length && j < arrayB.length){
            if(arrayA[i] < arrayB[j]){
                result[k] = arrayA[i];
                i++;
            } else {
                result[k] = arrayB[j];
                j++;
            }
            k++;
        }
        while (i < arrayA.length){
            result[k] = arrayA[j];
            i++;
            k++;
        }

        while (j < arrayB.length){
            result[k] = arrayB[j];
            j++;
            k++;
        }
        return result;
    }
    public static int sumCountInStr(String s){
        int totalSum = 0;
        int currentNum = 0;

        for(Character ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                int digit = ch - '0';
                currentNum = currentNum * 10 + digit;
            } else {
                totalSum += currentNum;
                currentNum = 0;
            }
        }
        totalSum += currentNum;
        return totalSum;
    }
    public static void main(String[] args) {

//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6,7,8,9};
//        System.out.println(Arrays.toString(newSortArray(arr1,arr2)));

//        int[] arr1 = {1,3,2,1,3,4,4,5,5};
//        System.out.println(Arrays.toString(unique(arr1)));

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,5};
//        int[] result1 = findSumTwoNumberForTarget(arr1,3);
//        System.out.println(Arrays.toString(result1));

//        removeSpace(" j a v a ");

//        countUniqeChar("Java");

//        System.out.println(randomNumber10());

//        System.out.println(isPalindromeNumber(121));
//        compareVersion("1.0", "1.0.");

//        System.out.printf("%.2f", 3.14159);

//        Queue<String> queue = new LinkedList<>();
//        queue.offer("Hello");
//        queue.offer("World");
//        queue.offer("It's");
//        queue.offer("Me");
//        printElement(queue);

//        System.out.println(countWordsOfString("Жили жили  у бабуси   двадва два два веселых гуся  "));

//        String[] s = {"мороз", "и", "солнце", "день", "чудесный"};
//        System.out.println(concatString(s));

//        System.out.println(isIven(2));
//        System.out.println(isIven(3));
//        System.out.println(isIven(0));
//        System.out.println(isIven(-3));
//        System.out.println(isIven(-2));

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        List<Integer> list1 = Arrays.asList(4,2,6);
//        System.out.println(merge(list, list1));

//        System.out.println(isNumber("hello"));
//        System.out.println(isNumber("12"));
//        System.out.println(isNumber("12abc"));
//        System.out.println(isNumber(""));
//        System.out.println(isNumber(null));

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        List<Integer> list1 = Arrays.asList(4,2,6);
//        List<Integer> list2 = List.of();
//        List<Integer> list3 = null;
//        System.out.println(isHasNumber(list, 9));
//        System.out.println(isHasNumber(list1, 4));
//        System.out.println(isHasNumber(list2, 9));
//        System.out.println(isHasNumber(list3, 9));

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        List<Integer> list1 = Arrays.asList(4,2,6);
//        List<Integer> list2 = List.of();
//        List<Integer> list3 = null;
//        filterOddNumber(list);
//        filterOddNumber(list1);
//        filterOddNumber(list2);
//        filterOddNumber(list3);


//        List<Integer> list = Arrays.asList(1,1,2,2,3,3);
//        List<Integer> list1 = Arrays.asList(1,2,3);
//        List<Integer> list2 = List.of();
//        List<Integer> list3 = null;
//        removeDuplicates(list);
//        removeDuplicates(list1);
//        removeDuplicates(list2);
//        removeDuplicates(list3);


//        List<String> list = Arrays.asList("Арбуз", "Апельсин", "Банан", "Киви", "Манго", " Автобус ");
//        List<String> listWithoutA = Arrays.asList( "Банан", "Киви", "Манго");
//        List<String> listNull = null;
//        List<String> listEmpty = List.of();
//        filterByA(list);
//        filterByA(listWithoutA);
//        filterByA(listNull);
//        filterByA(listEmpty);

//        safeDivide(1,3);
//        safeDivide(1,0);
//        int[] arr1 = {1, 2, 3, 3, 4, 5};
//        int[] arr2 = {1, 2, 3, 4, 5, 5};
//        int[] arr3 = {};
//        int[] arr4 = {1, 2, 3, 4, 5};
//        System.out.println(checkIsUnique(arr1));
//        System.out.println(checkIsUnique(arr2));
//        System.out.println(checkIsUnique(arr3));
//        System.out.println(checkIsUnique(arr4));

//        List<Integer> listNum = Arrays.asList(1,2,3);
//        List<Integer> listNull = null;
//        List<Integer> listEmpty = List.of();
//
//        System.out.println(countSumInList(listNum));
//        System.out.println(countSumInList(listNull));
//        System.out.println(countSumInList(listEmpty));


//        countWords("привет мир   это я ");
//        countWords(null);
//        countWords("");

//        checkIsAnagram("abba", "bbaa");
//        checkIsAnagram("abBa", "bbaa");
//        checkIsAnagram("abBa", null);
//        checkIsAnagram("", "bbaa");
//        checkIsAnagram("fddd", "bbaa");


//       isPalindrome("abba");
//       isPalindrome("dss");
//       isPalindrome("");
//       isPalindrome(null);

//        int[] arr1 = {1,2,3};
//        int[] arr2 = {1,2,-3};
//        int[] arr3 = {};
//        int[] arr4 = null;
//        sumNumArray(arr1);
//        sumNumArray(arr2);
//        sumNumArray(arr3);
//        sumNumArray(arr4);

//        int[] arr1 = {1,7,3,5,0,3};
//        int[] arr2 = {1,7,3,-5,0,3};
//        findMaxArray(arr1);
//        findMaxArray(arr2);

//        checkIsSimpleNum(4);
//        checkIsSimpleNum(5);
//        checkIsSimpleNum(0);
//        checkIsSimpleNum(1);

//        calculateFactorial(5);
//        calculateFactorial(-5);
//        calculateFactorial(1);
//        calculateFactorial(0);

//        calculateVowels("Hello");
//        calculateVowels(null);
//        calculateVowels("dvd");
//        calculateVowels("");

//        int[] arr1 = {1,7,3,5,0,3};
//        int[] arr2 = {1,7,3,-5,0,3};
//        int[] arr3 = {1,7,3,12,0,3};
//        findSecondMax(arr1);
//        findSecondMax(arr2);
//        findSecondMax(arr3);







    }
}
