public class Person {
    public void getName(String name){
        System.out.println(name);
    }
    public void getAge(int age){
        if(age<0){
            System.out.println("Siz hato raqam kiritdingiz");
        }else{
            System.out.println(age);
        }
    }
    public void getWeight(float weight){
       if(weight<0){
           System.out.println("Siz hato raqam kiritdingiz");
       }else{
           System.out.println(weight);
       }
    }

}
