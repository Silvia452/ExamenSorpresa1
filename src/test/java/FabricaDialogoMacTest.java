import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FabricaDialogoMacTest {

    @InjectMocks
    private FabricaDialogoMac underTest;

    @org.junit.jupiter.api.Test
    void nuevoDialogo() {
    }

    @Nested
    class WhenNuevoingDialogo {
        @BeforeEach
        void setup() {
        }
    }
}