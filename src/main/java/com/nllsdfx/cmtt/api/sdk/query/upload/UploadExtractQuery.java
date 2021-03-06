package com.nllsdfx.cmtt.api.sdk.query.upload;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.upload.UploadResponse;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UploadExtractQuery extends QueryBuilder<UploadExtractQuery, List<UploadResponse>> {

    public UploadExtractQuery(ApiClient client) {
        super(client, "uploader/extract", Utils.buildParametrizedType(List.class, UploadResponse.class));
        setHttpMethod(HttpMethod.POST);
    }

    public UploadExtractQuery url(String url) {
        return unsafeParam("url", url);
    }

    @Override
    protected UploadExtractQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("url");
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
