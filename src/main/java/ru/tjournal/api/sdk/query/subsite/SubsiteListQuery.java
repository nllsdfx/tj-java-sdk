package ru.tjournal.api.sdk.query.subsite;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.Subsite;
import ru.tjournal.api.sdk.model.SubsiteType;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubsiteListQuery extends QueryBuilder<SubsiteListQuery, List<Subsite>> {

    public SubsiteListQuery(ApiClient client) {
        super(client, "subsites_list/{type}", Utils.buildParametrizedType(List.class, Subsite.class));
    }

    public SubsiteListQuery type(SubsiteType type) {
        return unsafePath("type", type.name().toLowerCase());
    }

    @Override
    protected SubsiteListQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("type");
    }
}
