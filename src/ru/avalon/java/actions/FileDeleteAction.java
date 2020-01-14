package ru.avalon.java.actions;

import java.io.*;
import java.nio.file.*;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileDeleteAction implements Action {
    String file;    
    Path p;

    public FileDeleteAction(String fr) {
     p = Paths.get(fr);
     
    }
   
    
     
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        try{Files.delete(p);}catch (IOException e){
         System.out.println(" OOOOOPSSSSS!!!!!!!" + e.getMessage());}   
         
         
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
