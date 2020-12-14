package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;
import technicalBlog.service.PostSevices;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired // this annotation gives you the required object instance from the Spring container
    private PostSevices postService;

    @RequestMapping("/")
    public String getAllPost(Model model) { // Spring provides model object to be passed between the spring
                       // mvc components. The underlying structure of spring by default add the objects provided
                       //into Spring model object

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts",posts); // in order unique identification of the model we need to provie a key , so that
           // on the UI one can access this model by passing the key
        return "index";
    }

}
