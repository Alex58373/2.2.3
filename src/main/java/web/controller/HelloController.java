package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<User> useer = userService.listUsers();
        model.addAttribute("userGetList", useer);
        return "allUsers";
    }

    @GetMapping(value = "/addNewUser")
    public String addNewUser(ModelMap model) {
        User user = new User();
        model.addAttribute("userAdd", user);
        return "user-add-new-user";
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("userAdd") User user) {
        userService.addUserService(user);
        return "redirect:/";
    }

    @GetMapping("/updateInfo")
    public String updateUserForm(@RequestParam("id") int id, ModelMap model) {
        User user = userService.getUserById(id);
        model.addAttribute("userAdd", user);
        return "user-add-new-user";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}