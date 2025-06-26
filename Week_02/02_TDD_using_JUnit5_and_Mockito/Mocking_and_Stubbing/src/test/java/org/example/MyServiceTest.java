package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create mock of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub method to return value
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        MyService service = new MyService(mockApi);

        // 4. Call service and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
