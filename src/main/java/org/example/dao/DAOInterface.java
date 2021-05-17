package org.example.dao;

import org.example.entities.Question;

import java.util.List;

public interface DAOInterface {

    void connect();
    void disconnect();

    boolean addUser(int id, String name);
    boolean updateTotalPoints(String name, int points);
    List<Question> getFiveQuestions();
    int getTotalPoints(String name);

}
