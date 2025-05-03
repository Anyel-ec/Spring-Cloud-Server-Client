package top.anyel.server;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 24/02/2025
 */
public class EncryptorDemo {
    public static void main(String[] args) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("Anyel");
        String encrypted = encryptor.encrypt("anyel");
        System.out.println("Valor encriptado: " + encrypted);
    }
}