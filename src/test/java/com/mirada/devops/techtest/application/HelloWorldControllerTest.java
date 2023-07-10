/*
 * Copyright © 2023 Mirada Medical Ltd.
 * All Rights Reserved.
 */
package com.mirada.devops.techtest.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link HelloWorldController}
 *
 * @author lottie.thomas
 */
@SuppressWarnings( "HardCodedStringLiteral" )
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
class HelloWorldControllerTest
{
   private static final String HELLO_URL = "/hello";
   private static final String EXPECTED_GREETING = "Hello World!";

   @Autowired
   private WebTestClient webTestClient;

   @Test
   void helloWorldReturnsGreeting()
   {
      // When a GET request is made to the hello endpoint
      WebTestClient.ResponseSpec response = this.webTestClient.get().uri( HELLO_URL ).exchange();
      // Then an OK response should be received with a greeting in the body
      response.expectStatus().isOk()
              .expectBody( String.class ).isEqualTo( EXPECTED_GREETING );
   }
}