package demo.example.controller;

import demo.example.entity.User;
import demo.example.service.UserService;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private final UserService userService;
@Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }
  @GetMapping("/users")
  public List<User>getAllUsers(){
    return userService.findUsers();
  }
  @GetMapping("/users/{id}")
  public User getUser(@PathVariable("id") int id) {
  return userService.findUser(id);
  }
}
