package service;

import model.Card;
import model.User;

import java.util.UUID;

public abstract class BaseService {

    protected abstract boolean add(Object object);
    protected abstract Object getById(UUID id);

    protected Card[] cardList = new Card[500];
    protected User[] userList = new User[100];


}
