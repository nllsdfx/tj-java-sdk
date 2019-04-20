package ru.tjournal.api.sdk.query.upload;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.upload.UploadResponse;
import ru.tjournal.api.sdk.util.Utils;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UploadQuery extends QueryBuilder<UploadQuery, List<UploadResponse>> {

    public UploadQuery(ApiClient client) {
        super(client, "uploader/upload", Utils.buildParametrizedType(List.class, UploadResponse.class));
        setHttpMethod(HttpMethod.POST);
    }

    public UploadQuery file(File file) {
        return unsafeParam("file", file);
    }

    @Override
    protected UploadQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("file");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
