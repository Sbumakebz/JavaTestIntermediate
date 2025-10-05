package solutions.fluidity.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VehicleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddCargoToCar() throws Exception {
        mockMvc.perform(post("/vehicles/car/cargo/400"))
                .andExpect(status().isOk())
                .andExpect(content().string("Car cargo: 400kg"));
    }

    @Test
    void testDriveTruck() throws Exception {
        mockMvc.perform(get("/vehicles/truck/drive"))
                .andExpect(status().isOk())
                .andExpect(content().string("truck is now driving!"));
    }

    @Test
    void testInvalidVehicleType() throws Exception {
        mockMvc.perform(post("/vehicles/bicycle/cargo/10"))
                .andExpect(status().is4xxClientError());
    }
}
