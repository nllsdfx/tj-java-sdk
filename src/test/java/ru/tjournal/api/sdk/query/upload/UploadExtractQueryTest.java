package ru.tjournal.api.sdk.query.upload;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.upload.UploadResponse;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class UploadExtractQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");

        List<UploadResponse> list = client
                .uploads()
                .extract()
                .url("https://images.pexels.com/photos/459793/pexels-photo-459793.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                .execute();

        assertNotNull(list);
        UploadResponse object = list.get(0);
        assertNotNull(object);
        assertNotNull(object.getData().getUuid());
        assertEquals("image", object.getType());
    }

}