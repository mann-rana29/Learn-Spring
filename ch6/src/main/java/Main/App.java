package Main;

import Main.Models.Comment;
import Main.Services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        Comment comment = new Comment();
        comment.setText("HHIHIHIHHAHHAHAHAHA");
        comment.setAuthor("fifiona");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}
