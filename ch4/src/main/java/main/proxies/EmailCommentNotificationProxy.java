package main.proxies;

import main.models.Comment;

public class EmailCommentNotificationProxy  implements  CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment : " + comment.getText());
    }
}
