package org.barinov3d.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DateServiceTest {

    @Test
    void now_toString_should_return_correct_format() {
        assertTrue(DateService.now().toString().matches("\\d{4}-\\d{2}-\\d{2}"));
    }
}