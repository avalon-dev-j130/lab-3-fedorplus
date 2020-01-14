package ru.avalon.java;

/**
 * Обрабатываемые приложением команды.
 */
public enum Commands {
    move("move"),
    copy("copy"),
    exit("exit"),
    new1("new1"),
    delete("delete");
    /*
     * TODO №8 К текущему списку команд, добавьте ещё две команды
     */
    
    private String name;

    private Commands(String name) {
        this.name = name;
    }
    
    public static Commands byName(String name) {
        for(Commands command : values()) {
            if (command.name == name) {
                return command;
            }
        }
        return null;
    }
    
}
