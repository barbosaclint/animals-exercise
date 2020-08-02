package com.clint.animals.exercise.animals.exercise;

import com.clint.animals.exercise.animals.exercise.controller.AnimalController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AnimalController.class)
public class AnimalsApiRestWsTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void testGetAnimalActionCount() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders.get("/animalsApi/getAnimalCounts");
        MvcResult result = mvc.perform(request).andReturn();
        System.out.println(" result --> " + result.getResponse().getContentAsString());
        assertThat(result.getResponse().getContentAsString(), containsString("animalsCanFly"));
    }

}
