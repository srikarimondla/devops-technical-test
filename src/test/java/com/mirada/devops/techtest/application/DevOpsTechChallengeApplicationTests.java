package com.mirada.devops.techtest.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DevOpsTechChallengeApplicationTests
{
   @Autowired
   private HelloWorldController helloWorldController;

   @Test
   void contextLoads()
   {
      assertNotNull( this.helloWorldController, "helloWorldController should have been created" );
   }
}
