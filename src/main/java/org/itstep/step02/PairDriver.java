package org.itstep.step02;

import org.itstep.step01.ObjectPair;

// TODO: Пишите ваш код здесь
public class PairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        Pair<String,Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

       //  System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));

    }
    public static String largestStadium(Pair<String,Integer>[] stadiums) {

        System.out.println("Название стадиона с наибольшей вместимостью: ");

        int idx = 0;
        int max =  stadiums[idx].getSecond();
        for (int i = 1; i<stadiums.length; i++){
            if ( stadiums[i].getSecond()>max){
                idx = i;
                max=  stadiums[i].getSecond();
            }
        }
        return stadiums[idx].getFirst();

    }

    }
