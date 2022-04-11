package com.example.cicd;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class FirstRestControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void getFirst() throws Exception {
        mockMvc.perform(get("/first"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message", Matchers.is("First page1")));
    }
}