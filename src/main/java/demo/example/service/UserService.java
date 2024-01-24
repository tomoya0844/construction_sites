package demo.example.service;

import demo.example.entity.User;
import demo.example.mapper.UserMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserMapper userMapper;

  public UserService(UserMapper userMapper) {
    this.userMapper = userMapper;
  }
  public List<User> findUsers() {
    return userMapper.findAll();
  }
  public User findUser(int id) {
    Optional<User> user = this.userMapper.findById(id);
    return user.get();
  }
}
