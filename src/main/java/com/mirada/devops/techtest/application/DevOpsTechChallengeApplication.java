/*
 * Copyright © 2023 Mirada Medical Ltd.
 * All Rights Reserved.
 */
package com.mirada.devops.techtest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for demo application
 *
 * @author lottie.thomas
 */
@SpringBootApplication
public /*non-final*/ class DevOpsTechChallengeApplication
{
   /**
    * Entry point for demo application
    * @param args Entry arguments
    */
   public static void main( String[] args )
   {
      SpringApplication.run( DevOpsTechChallengeApplication.class, args );
   }
}
