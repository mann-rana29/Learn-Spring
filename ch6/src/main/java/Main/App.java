package Main;

import Main.Models.Comment;
import Main.Services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {

    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args){
        Comment comment = new Comment();
        comment.setText("HHIHIHIHHAHHAHAHAHA");
        comment.setAuthor("fifiona");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        String value =  commentService.publishComment(comment);

        logger.info(value);
    }
}
