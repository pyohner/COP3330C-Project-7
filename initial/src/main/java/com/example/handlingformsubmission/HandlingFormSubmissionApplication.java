/*
Phillip Yohner
COP 3330C - CRN 24680
April 2, 2024

Description:
The purpose of this program is to demonstrate a Spring Boot and Maven application.  The user will have the ability
to enter data and then have that data displayed back to the user.  The data will include a student ID number; a month,
day, and year; and a custom message.
*/

package com.example.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingFormSubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingFormSubmissionApplication.class, args);
	}

}
