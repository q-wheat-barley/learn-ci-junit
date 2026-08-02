package com.example.democi;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = CalcController.class)
public class CalcControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockitoBean
        private Calculator calculator;

        @Test
        void 足し算呼び出し() throws Exception {

                when(calculator.plus(1, 2)).thenReturn(3);

                mockMvc.perform(
                                org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/plus/1/2"))
                                .andExpect(
                                                org.springframework.test.web.servlet.result.MockMvcResultMatchers
                                                                .status().isOk())
                                .andExpect(
                                                org.springframework.test.web.servlet.result.MockMvcResultMatchers
                                                                .content().string("3"));
        }

        @Test
        void 引き算呼び出し() throws Exception {

                when(calculator.minus(2, 1)).thenReturn(1);

                mockMvc.perform(
                                org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/minus/2/1"))
                                .andExpect(
                                                org.springframework.test.web.servlet.result.MockMvcResultMatchers
                                                                .status().isOk())
                                .andExpect(
                                                org.springframework.test.web.servlet.result.MockMvcResultMatchers
                                                                .content().string("1"));
        }
}
