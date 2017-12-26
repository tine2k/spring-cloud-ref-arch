# Spring Cloud Reference Architecture

## Description

This repository contains a Spring Cloud Reference Architecture containing of the following microservices:
- Spring Boot Admin
- Microservice 1 (Client)
- Microservice 2 (Contacted by Microservice 1)
- Gateway (Zuul)
- Zipkin Server

## How to get started?

Download Consul from https://www.consul.io/downloads.html and start with 
`./consul agent -data-dir=/tmp/consul -dev -bind=127.0.0.1`

Then run all Spring Boot Applications.

## URLs
- Consul: http://localhost:8500
- Microservice 1: http://localhost:8080/ms1
- Spring Boot Admin: http://localhost:8000
- Zipkin Server: http://localhost:7000