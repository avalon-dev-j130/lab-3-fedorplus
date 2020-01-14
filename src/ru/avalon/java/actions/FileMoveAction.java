package ru.avalon.java.actions;
import java.io.*;
import java.nio.file.Files;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {    
    File from;
    File dest;

    public FileMoveAction(String fr , String to) {
     from = new File(fr);
     dest = new File(to);
     
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
      try{Files.move(from.toPath(),dest.toPath());} catch (IOException e){
         System.out.println(" OOOOOPSSSSS!!!!!!!" + e.getMessage());
    }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }

}
