/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhofontes;

import java.io.File;

/**
 *
 * @author evio
 */
public class Jflex {
    public static void gerador(String path){
    File file = new File(path);
    jflex.Main.generate(file);
    }
    
    public static void main(String[] args) {
        String path = "/home/evio/NetBeansProjects/TrabalhoFontesv2/TrabalhoFontesLexico/src/br/com/trabalhofontes/gramatica.lex";
        gerador(path);
    }
}
