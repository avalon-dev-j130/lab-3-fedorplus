package ru.avalon.java;

import ru.avalon.java.console.ConsoleUI;

import java.io.IOException;
import ru.avalon.java.actions.FileCopyAction;
import ru.avalon.java.actions.FileMoveAction;
import ru.avalon.java.actions.FileCreateAction;
import ru.avalon.java.actions.FileDeleteAction;

/**
 * Лабораторная работа №3
 * <p>
 * Курс: "Программирование на платформе Java. Разработка
 * многоуровневых приложений"
 * <p>
 * Тема: "Потоки исполнения (Threads) и многозадачность" 
 *
 * @author Daniel Alpatov <danial.alpatov@gmail.com>
 */
public class Lab3 extends ConsoleUI<Commands> {
    /**
     * Точка входа в приложение.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        new Lab3().run();
    }
    /**
     * Конструктор класса.
     * <p>
     * Инициализирует экземпляр базового типа с использоавнием
     * перечисления {@link Commands}.
     */
    Lab3() {
        super(Commands.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCommand(Commands command) throws IOException {
        Commands comman = Commands.byName("copy");
        switch (command) {
            case copy:{
                FileCopyAction fl = new FileCopyAction("H:/t1/t2.txt", "H:/t2/t2.txt");
                Thread tr1 = new Thread(fl);
                tr1.run();
            }
                /*
                 * TODO №6 Обработайте команду copy
                 */
                break;
            case move:{
                FileMoveAction fl = new FileMoveAction("H:/t1/t2.txt", "H:/t2");
                Thread tr1 = new Thread(fl);
                tr1.run();
            }
                /*
                 * TODO №7 Обработайте команду move
                 */
                break;
            case new1:{
                FileCreateAction fl = new FileCreateAction("H:/t1/t2.txt");
                Thread tr1 = new Thread(fl);
                tr1.run();
            }
                /*
                 * TODO №7 Обработайте команду move
                 */
                break;
            case delete:{
                FileDeleteAction fl = new FileDeleteAction("H:/t1/t2.txt");
                Thread tr1 = new Thread(fl);
                tr1.run();
            }
                /*
                 * TODO №7 Обработайте команду move
                 */
                break;
            case exit:
                close();
                break;
                /*
                 * TODO №9 Обработайте необработанные команды
                 */
        }
    }
    
}
