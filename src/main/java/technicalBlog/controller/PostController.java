package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;
import technicalBlog.post.PostSevices;

import java.util.ArrayList;

@Controller
public class PostController {
    @Autowired
    private PostSevices postSevices;

    @RequestMapping("posts")
    public String getUserPosts(Model model){
       ArrayList<Post> posts = postSevices.getOnePost();
        model.addAttribute("posts",posts);
        return "posts";
    }
}
