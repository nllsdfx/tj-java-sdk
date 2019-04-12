package ru.tjournal.api.sdk.query.entry;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

public class EntriesGetPopularQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEntriesGetPopular() throws ClientException, ApiException {

        EntriesGetPopularQuery mock = Mockito.mock(EntriesGetPopularQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.id("1").execute()).thenReturn(Collections.singletonList(new Entry()));
        List<Entry> list = mock.id("1").execute();
        Assert.assertNotNull(list);
        Assert.assertEquals(1, list.size());
        Assert.assertNotNull(list.get(0));

        new EntriesGetPopularQuery(new TJApiClient("test")).execute();

    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");
        List<Entry> list = client.entries().popular().id("93275").execute();
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }
}
