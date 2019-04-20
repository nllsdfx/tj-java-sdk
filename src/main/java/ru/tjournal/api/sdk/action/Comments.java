package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.comments.*;

public class Comments extends Action {

    public Comments(ApiClient client) {
        super(client);
    }

    public CommentGetQuery getBy(String entryId) {
        return new CommentGetQuery(getClient(), entryId);
    }

    public CommentGetLikesQuery likes() {
        return new CommentGetLikesQuery(getClient());
    }

    public CommentSendQuery send() {
        return new CommentSendQuery(getClient());
    }

    public CommentEditQuery edit() {
        return new CommentEditQuery(getClient());
    }

    public CommentGetThreadQuery thread() {
        return new CommentGetThreadQuery(getClient());
    }

    public CommentSaveSeenCountQuery saveSeen() {
        return new CommentSaveSeenCountQuery(getClient());
    }

    public CommentLevelsGetQuery commentsLevels() {
        return new CommentLevelsGetQuery(getClient());
    }


}
