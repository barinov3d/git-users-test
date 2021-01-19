package org.barinov3d.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    @Test
    void simple_sum () {
        assertEquals(MathService.sum(3L,4L), 7L);
    }
}