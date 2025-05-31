# IntSocketProject

A simple Java client-server application demonstrating socket communication.

## Description

This project consists of two Java programs:

`- IntServer`: A server that listens on port 9999 and waits for clients to connect. When a client connects, it reads a number sent by the client and prints it to the console.

`- IntClient`: A client that connects to the server on localhost port 9999, generates a random number between 0 and 9, sends it to the server, and prints the number sent.

## How to Run

1. Compile both Java files:
   ```java
   javac IntServer.java IntClient.java

2. Open two terminal windows.

3. In the first terminal, start the server:
   ```java
   java IntServer

4. In the second terminal, run the client:
   ```java
   java IntClient

5. You should see the client send a random number and the server receive and print it.

## Features

- Basic socket communication between client and server.
- Server handles multiple connections in a loop (one at a time).
- Simple error handling and connection logging.

## Notes

- Both programs run on the same machine (localhost).
- The server listens on port 9999 — make sure this port is free.
- This example uses the default package (no package declaration).
