package ru.avalon.java.actions;

import java.io.*;
import java.nio.file.Files;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    File from;
    File dest;

    public FileCopyAction(String fr , String to) {
     from = new File(fr);
     dest = new File(to);
     
    }
   
    
     
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        
     try{Files.copy(from.toPath(), dest.toPath());} catch (IOException e){
         System.out.println(" OOOOOPSSSSS!!!!!!!" + e.getMessage());
         
         
     } 
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
