package telran.dao;

import telran.data.Post;
import telran.data.UserAdmin;

import java.util.Scanner;

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

    public boolean checkPassword() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (posts[i].getAutor().getClass().getSimpleName().equalsIgnoreCase("UserAdmin")) {
                UserAdmin admin = (UserAdmin) posts[i].getAutor();
                System.out.println("Enter password, please");
                String password = scanner.nextLine();
                if (admin.getPassword().equals(password)){
                    return true;
                }
                System.out.println("Wrong passwort");
            }

        }
        return false;
    }
    public void updatePostByAdmin(int postID){
        Scanner scanner = new Scanner(System.in);
        if (checkPassword()){
            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID()==postID){
                    System.out.println("Enter new content");
                    String newContent = scanner.nextLine();
                    posts[i].setContent(newContent);
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                }
            }
        } else{
            System.out.println("acces is denied");
        }
    }

    public boolean updatePostI(int id, String newContext, UserAdmin userAdmin, String pas) {
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

    public boolean deletePostI(int id, String newContext, UserAdmin userAdmin, String pas) {
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

    public int getCountLikesI(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Count of likes in title " + posts[i].getTitle() + " is " + posts[i].getLikes());
                return posts[i].getLikes();
            }
        }
        return 0;
    }

    public int countOfPostI(String autor) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(autor)) {
                count++;
            }
        }
        System.out.println(autor + " have a " + count + " posts.");
        return count;
    }

    //    последние посты
    public Post[] getPostsByAutor(String autor, int numerOfPosts) {
        Post[] autorsPosts = new Post[numerOfPosts];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (posts[i].getAutor().getUserName().equalsIgnoreCase(autor) && j < numerOfPosts) {
                autorsPosts[j] = posts[i];
                j++;
            }
        }
        return autorsPosts;
    }
}
