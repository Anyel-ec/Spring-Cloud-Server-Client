package top.anyel.client;

import org.springframework.beans.factory.annotation.Value;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 17/03/2025
 */
public class data {
    @Value("${hola}")
    private static String hola;

    public static void main(String[] args) {
        System.out.println("Hola: " + hola);
    }
}
