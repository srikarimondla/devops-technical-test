/*
 * Copyright © 2023 Mirada Medical Ltd.
 * All Rights Reserved.
 */
package com.mirada.devops.techtest.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for returning Hello World demo
 *
 * @author lottie.thomas
 */
@RestController
public final class HelloWorldController
{
   private static final Logger LOGGER = LoggerFactory.getLogger( HelloWorldController.class );

   /**
    * Get method for hello request
    * @return Returns greeting message
    */
   @GetMapping( "hello" ) //$NON-NLS-1$
   public String helloWorld()
   {
      LOGGER.info( "Received GET request for hello endpoint" ); //$NON-NLS-1$
      return "Hello World!";
   }
}
