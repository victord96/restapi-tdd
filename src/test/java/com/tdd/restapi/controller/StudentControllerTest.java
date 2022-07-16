package com.tdd.restapi.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
@ExtendWith(SpringExtension.class)

public class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getAllStudentsTest() throws Exception {
        mockMvc.perform(get("/api/students"))
                .andExpect(status().is2xxSuccessful());
    }
}
