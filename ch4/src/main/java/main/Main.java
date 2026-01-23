package main;

import main.models.Comment;
import main.proxies.EmailCommentNotificationProxy;
import main.repositories.CommentRepository;
import main.repositories.DBCommentRepository;
import main.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Mann");
        comment.setText("I love Java");

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}
