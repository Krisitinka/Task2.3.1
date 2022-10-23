package mvc_hiber.controller;

import mvc_hiber.dao.UserDAO;
import  mvc_hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import mvc_hiber.service.UserService;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "showAllUsers";
    }

    @GetMapping("/{id}")
    public String getUser (@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "showUser";
    }

    @GetMapping("/new")
    public String addUser(@ModelAttribute("user") User user) {
        return "newUser";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
        return "redirect:/";
    }

    @GetMapping("{id}/edit")
    public String updateUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute(userService.getUser(id));
        return "editUser";
    }
    @PostMapping()
    public String createUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/";
    }

    @PutMapping
    public String update(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

}
