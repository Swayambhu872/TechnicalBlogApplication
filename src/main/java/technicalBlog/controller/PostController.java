package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalBlog.model.Post;
import technicalBlog.service.PostSevices;

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
    @RequestMapping("/posts/newpost")
    public String newPost() {
        return "posts/create";
    }
    @RequestMapping(value = "/posts/create", method = RequestMethod.POST)
    public String createPost(Post newPost) {

        postSevices.createPost(newPost);
        return "redirect:/posts";
    }
}
