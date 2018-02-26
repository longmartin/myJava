import java.util.Scanner;

class MyArrayTest {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] strArray = {"", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入查表法数字(1-7): ");
        int index = sc.nextInt();
        System.out.println("你要查找的星期为：" +strArray[index]);
    }

    //遍历
    public static void mapArray (int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                System.out.println(arr[i] + ",");
            }
            System.out.println(arr[i]);
        }
        System.out.println("]");
    }

    //最值
    public static int getMax (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //反转
    public static void reverse (int[] arr) {
        for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    //第一次出现的索引
    public static int indexOfArray (int[] arr, int key) {
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

}