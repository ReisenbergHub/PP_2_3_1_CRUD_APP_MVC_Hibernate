package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(Long id);
    void update(User user);
    List<User> getList();
    User getUser(Long id);
}