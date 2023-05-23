package com.zay.fithub.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zay.fithub.Entities.User;
import com.zay.fithub.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createProduct(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllProducts() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getProductById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}






// package com.zay.fithub.Controllers;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.zay.fithub.Entities.User;
// import com.zay.fithub.Repositories.UserRepository;

// @RestController
// @RequestMapping("/users")
// public class UserController {

//     private  UserRepository userRepository;

//     @PostMapping("/addUser")
//     public String createUser(@RequestBody User user) {
//         userRepository.save(user);
//         return  "Added user:"+user.getFirstName()+" "+user.getName()+"with id: "+user.getId();
//     }

//     @GetMapping
//     public List<User> getUsers() {
//         return userRepository.findAll();
//     }

//     @GetMapping("/{id}")
//     public Optional<User> getUser(@PathVariable int id){
//         return userRepository.findById((long) id);
//     }

//     @DeleteMapping("/{id}")
//     public String deleteUser(@PathVariable int id){
//         userRepository.deleteById((long) id);
//         return "user deleted with id: "+id;
//     }
// }
