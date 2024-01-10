import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

import javax.management.ValueExp;

import java.util.ArrayList;

class Food{
    public String foodName;
    public int foodPrice;
    
    int searchFood(ArrayList<String>  arr,int N,String searchVal)
    {
        for(int i=0;i<N;i++)
        {
            if(arr.get(i)==searchVal)
            {
                return i;
            }

        }    
        return -1;

    }
    Integer setFoodPrice(int price){
        return this.foodPrice=price;
      
    }
}


/**
 * hello
 */
public class hello {
    public static int calculatePrice(Map<String, Integer> map, String[] targetKey) {
        int sumVal = 0;


        for (String key : targetKey) {
            if (map.containsKey(key)) {
                sumVal += map.get(key);
            }
        }

        return sumVal;
    }
    
 public static void main(String[] args) {
    Food myfood=new Food();
 

    ArrayList<String> myFoods = new ArrayList<String>();
   

    myFoods.add(myfood.foodName="HAMBURGER");
    myFoods.add(myfood.foodName="PIZZA");
    myFoods.add(myfood.foodName="PIDE");
    myFoods.add(myfood.foodName="ÇORBA");
    myFoods.add(myfood.foodName="TAVUK");
    myFoods.add(myfood.foodName="ET");
    myFoods.add(myfood.foodName="PATATES");

    Map<String,Integer> mapFood=new HashMap<>();
     mapFood.put(myFoods.get(0), myfood.setFoodPrice(15000));
     mapFood.put(myFoods.get(1), myfood.setFoodPrice(20000));
     mapFood.put(myFoods.get(2), myfood.setFoodPrice(25000));
     mapFood.put(myFoods.get(3), myfood.setFoodPrice(35000));
     mapFood.put(myFoods.get(4), myfood.setFoodPrice(45000));
     mapFood.put(myFoods.get(5), myfood.setFoodPrice(55000));
     mapFood.put(myFoods.get(6), myfood.setFoodPrice(65000));
     String[] m_foods = {"HAMBURGER", "PIZZA","TAVUK"}; //FİYATLARININ TOPLAMINI İSTEDİĞİMİZ YEMEKLER
    
    int sum = calculatePrice(mapFood,m_foods);
    System.out.println(sum);
   


    

    
}
}