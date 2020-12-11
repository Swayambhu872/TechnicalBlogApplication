package technicalBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPost(Model model) { // Spring provides model object to be passed between the spring
                       // mvc components. The underlying structure of spring by default add the objects provided
                       //into Spring model object
        List <Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Body of post 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Body of post 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Body of post 3");
        post3.setDate(new Date());
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts); // in order unique identification of the model we need to provie a key , so that
           // on the UI one can access this model by passing the key
        return "index";
    }

}
