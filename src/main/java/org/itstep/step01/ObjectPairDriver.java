package org.itstep.step01;

import java.util.Arrays;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", 66233);

       // System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
        System.out.println("Название стадиона с наибольшей вместимостью: ");
        System.out.println(" ");
        int idx = 0;
        int max = (int) stadiums[idx].getSecond();
        for (int i = 1; i<stadiums.length; i++){
            if ((int) stadiums[i].getSecond()>max){
                idx = i;
                max= (int) stadiums[i].getSecond();
            }
        }
        return stadiums[idx].getFirst().toString();
    }

}
