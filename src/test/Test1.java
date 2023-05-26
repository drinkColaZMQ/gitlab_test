package test;

import java.util.Random;

public class Test1 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] nums= new int[1000000];

        for (int i = 0;i<1000000;i++){
            nums[i]= random.nextInt(100000);
        }
        int maxNum = nums[0];
        int minNum = nums[0];
        Long sum = 0l;

        for (int i = 0;i<1000000;i++){
            if (i!=0 && nums[i]>maxNum){
                maxNum=nums[i];
            }

            if (i!=0 && nums[i]<minNum){
                minNum=nums[i];
            }
            sum+=nums[i];
        }
        System.out.println("最大值为："+maxNum+"，最小值为："+minNum+",平均值为："+sum/1000000);
    }
}
