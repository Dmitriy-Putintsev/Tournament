package ru.netology.tournament;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException() {
        super("The player is not registered");
    }
}
