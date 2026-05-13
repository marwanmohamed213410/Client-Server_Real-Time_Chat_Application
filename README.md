# Client-Server Real-Time Chat Application

A real-time chat application built with Java Swing, supporting multiple clients communicating through a central server over TCP/IP.

---

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [How to Use](#how-to-use)
- [Commands](#commands)
- [User Authentication](#user-authentication)

---

## Features

- Real-time messaging between multiple clients
- User authentication (Login / Sign Up)
- Server-based broadcast messaging
- Private messaging between clients
- Auto-reconnect if server is down
- Show online users
- Command system

---

## Project Structure

```
Client-Server_Real-Time_Chat_Application/
├── src/main/java/
│   ├── Login.java         → Login screen
│   ├── SignUp.java        → Sign up screen
│   ├── ServerChat.java    → Server application
│   ├── ServerChat.java    → Server application
│   ├── Server.java        → (Testing)Server application half-duplex
│   └── Client.java        → (Testing)Client application half-duplex
├── resources/
│   └── users.txt          → Stores usernames and passwords
├── assets/
│   └── *.png              → Images used in UI
└── pom.xml
```

---

## Requirements

- Java 17 or higher
- Apache NetBeans IDE
- Java Swing
- Maven

---

## How to Run

### 1. Start the Server

Login with the server account:

```
Username: admin
Password: 6070
```

The server window will open automatically.

### 2. Start Clients

Open a new CMD window for each client:

```cmd
cd "D:\path\to\Client-Server_Real-Time_Chat_Application"
mvn exec:java -Dexec.mainClass=Login
```

### 3. Sign Up / Login

- New users can register via the **Sign Up** screen
- Existing users login with their username and password
- Accounts are saved in `resources/users.txt`

---

## How to Use

1. Start the **Server** first
2. Open one or more **Client** windows
3. Login with your credentials
4. Start chatting!

---

## Commands

| Command                 | Description                               |
| ----------------------- | ----------------------------------------- |
| `@help`                 | Show all available commands               |
| `@clear`                | Clear the chat window                     |
| `@exit`                 | Exit the program                          |
| `@all`                  | Show all online users                     |
| `@msg:username:message` | Send a private message to a specific user |

### Examples

```
@msg:Ahmed:Hello!        → sends "Hello!" to Ahmed only
@msg:Ali:How are you?    → sends to Ali only
@all                     → shows list of online users
```

---

## User Authentication

Users are stored in `resources/users.txt` in the format:

```
username:password
```

Example:

```
Marwan:1234
kimo:5050
user1:666
```

- `admin` is the server admin account
- All other accounts are client accounts
- New accounts can be created via the Sign Up screen

---

##  Network

| Setting  | Value     |
| -------- | --------- |
| Protocol | TCP       |
| Host     | localhost |
| Port     | 20597     |

---

## Author

**Done by: Marwan Mohamed (3r year computer science & information technology) for: Network programm Project Date: May 2026**
