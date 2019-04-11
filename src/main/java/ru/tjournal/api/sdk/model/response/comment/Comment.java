package ru.tjournal.api.sdk.model.response.comment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.tjournal.api.sdk.model.Author;
import ru.tjournal.api.sdk.model.Likes;

@Getter
public class Comment {

    private String id;
    private long date;
    private String dateRFC;
    private Author author;
    private String text;
    private Likes likes;
    private String replayTo;
    private int level;
    private boolean isFavorited;
    @SerializedName("is_pinned")
    private boolean isPinned;
    private boolean isEdited;
    @SerializedName("source_id")
    private int sourceId;

}