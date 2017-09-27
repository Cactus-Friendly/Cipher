/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphergit;

/**
 *
 * @author nzoel
 */

import java.util.Random;

public class Cipher {
    
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String cipher;
    private String phrase;
    private String endPhrase;
    
    Cipher (int seed, String phrase, char type) {
        Random rand = new Random(seed);
        this.phrase = phrase;
        int count = 0;
        int temp;
        
        while (count < alphabet.length()) {
            temp = rand.nextInt(alphabet.length());
            if (cipher.indexOf(alphabet.charAt(temp)) < 0) {
                cipher += alphabet.charAt(temp);
                count++;
            }
        }
        
        if (type == 'e') {
            encrypt();
        } else if (type == 'd') {
            decrypt();
        }
    }
    
    private void encrypt() {
        int tempN;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                tempN = alphabet.indexOf(phrase.charAt(i));
                
            }
        }
    }
    
    private void decrypt() {
        
    }
    
    public String getEncryptedPhrase() {
        return endPhrase;
    }
    
    public String getDecryptedPhrase() {
        return endPhrase;
    }
    
}
