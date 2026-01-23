package main;

import main.models.Comment;
import main.proxies.EmailCommentNotificationProxy;
import main.repositories.CommentRepository;
import main.repositories.DBCommentRepository;
import main.services.CommentService;

public class Main {
    public static void main(String[] args){
        var comment = new Comment();
        comment.setAuthor("Mann");
        comment.setText("I love Java");

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository,commentNotificationProxy);

        commentService.publishComment(comment);
    }
}
