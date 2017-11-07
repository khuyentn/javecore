package world.Plant;

import world.Plant1;

public class Apps {
    public static void main(String[] args){

        Plant1 plant1 = new Plant1();
        Test test = new Test();

        System.out.println(plant1.name);
        System.out.println(plant1.ID);

        //won't work type is private
//      System.out.println(plant1.type);
//
//        //Size is protected; App is not in the same pakage as Plant
//        //Won't work
        //System.out.println(plant1.height);

        System.out.println(test.age);
    }
}
