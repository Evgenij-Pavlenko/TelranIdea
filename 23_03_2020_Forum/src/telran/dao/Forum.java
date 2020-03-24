package telran.dao;

import telran.data.Post;
import telran.data.UserAdmin;

public class Forum {
    private Post[] posts;
    private int size = 0;

    public Forum(int capacity) {
        posts = new Post[capacity];
//        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePost(int id) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostID() == id) {
                posts[i] = posts[size - 1];
                size++;
                return true;
            }
        }
        return false;
    }

    public void printdisplayPost() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }//апдейтить пост если юсер админ
    //удалить пост если юсер админ
    //посчитать колво лайков по названию
    // колво постов по автору. Или посты по автору?

    public boolean updatePost(int id, String newContext, UserAdmin userAdmin, String pas) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostID() == id) {
                if (userAdmin.getPassword().equals(pas)) {
                    posts[i].setContent(newContext);
                    System.out.println("Context Post with ID " + id + " was change");
                    return true;
                } else System.out.println("Password for Admin " + userAdmin.getUserName() + " is wrong");
            }
        }
        System.out.println("Post with ID " + id + " not found");
        return false;
    }
    public boolean deletePost(int id, String newContext, UserAdmin userAdmin, String pas) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostID() == id) {
                if (userAdmin.getPassword().equals(pas)) {
                    posts[i] = posts[size];
                    size--;
                    System.out.println("Context Post with ID " + id + " was deleted");
                    return true;
                } else System.out.println("Password for Admin " + userAdmin.getUserName() + " is wrong");
            }
        }
        System.out.println("Post with ID " + id + " not found");
        return false;
    }
    public int countOfLikes(String title){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)){
                count = posts[i].getLikes();
                System.out.println("Count of likes in title " + posts[i].getTitle() + " is " + count);
            }
        }

        return count;
    }
    public int countOfPost(String autor){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(autor)){
                count++;
            }
        }
        System.out.println(autor + " have a " + count + " posts.");
        return count;
    }
}
