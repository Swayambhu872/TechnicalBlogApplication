package technicalBlog.service;

import org.springframework.stereotype.Service;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;
@Service // This annotation tells the spring that this class is also a component to register in the IOC
// container as service class. We use at service annotation for classes that implement business logic
public class PostSevices {

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
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
        return posts;
    }
    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("This is your first post");
        post1.setBody("This is your post body");
        post1.setDate(new Date());
        posts.add(post1);
        return posts;
    }
    public void createPost(Post newPost) {}
}
