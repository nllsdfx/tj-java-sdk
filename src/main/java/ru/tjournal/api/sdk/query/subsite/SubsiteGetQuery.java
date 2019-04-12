package ru.tjournal.api.sdk.query.subsite;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Subsite;

import java.util.Collection;
import java.util.Collections;

public class SubsiteGetQuery extends QueryBuilder<SubsiteGetQuery, Subsite> {


    public SubsiteGetQuery(TJApiClient client) {
        super(client, "subsite/{id}", Subsite.class);
    }

    public SubsiteGetQuery id(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected SubsiteGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("id");
    }
}