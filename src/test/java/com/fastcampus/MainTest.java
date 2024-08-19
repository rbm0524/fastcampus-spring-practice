package com.fastcampus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        //Given
        String[] args = {"3", "1", "2"};

        //when & then -> 값 반환이 아니라 출력만 하니까
        Main.main( args);
    }
}