package sn.isi.dao;

import sn.isi.entities.User;

import java.util.List;

public interface IUser {

    public int add(User user) throws Exception;
    public int delete(int id) throws Exception;
    public int update(User user) throws Exception;
    public List<User> getAll() throws Exception;
    public User get(int id) throws Exception;
    public User login(String email, String password) throws Exception;

}
