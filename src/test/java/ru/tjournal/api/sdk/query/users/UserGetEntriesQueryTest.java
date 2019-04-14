package ru.tjournal.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class UserGetEntriesQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Entry> entries = client.users().entries().of("2").count(10).offset(1).execute();
        assertNotNull(entries);
        assertEquals(10, entries.size());
    }

}