# Email

## Introduction

This is an API built to demonstrate how to send emails using Amazon Simple Email Service.

## Build

### Dependencies:

- JDK 11
- Gradle

`gradlew build`

## Test

`gradlew test`

## How to use

1. Configure Spring Datasource in application.yml file.
2. Create a file named credentials at ~/.aws and put your IAM profile aws_access_key_id and
   secret_access_key (https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html)
3. Run EmailApplication.java
