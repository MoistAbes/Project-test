package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {


    /*
    @GetMapping(value = "{userId}")
    public UserDto getUser(Long userId){
        return new UserDto(1L, "seba", 1, 12345);
    }

     */

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok().build();
    }



    @PutMapping("/status")
    public ResponseEntity<UserDto> updateUserStatus(@RequestBody UserDto userDto){
        return ResponseEntity.ok(new UserDto(1L, "username", 1, 12345));
    }

    @PutMapping("/userkey")
    public ResponseEntity<UserDto> updateUserKey(@RequestBody UserDto userDto){
        return  ResponseEntity.ok(new UserDto(2L, "username", 1, 54221));
    }




}
