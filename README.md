# 🥋 **Judo Game** 🥋

**Judo Game** is an interactive game based on judo competitions. Players must register or log in to access different competitions, clubs, coaches, and competitors. As they compete, they earn points based on their performance, which positions them in a weight-based ranking. Show off your combat skills and climb the ranking!

---

## 🚀 **Key Features**

1. **Registration and Login**  
   Users must register or log in to access the platform. This ensures a personalized experience and tracking of points earned in competitions.

2. **Competition Overview**  
   Once logged in, players can see a list of available judo competitions, with details about each one.

3. **View Clubs, Coaches, and Competitors**  
   - **Clubs**: A list of available judo clubs in the game.  
   - **Coaches**: Each club has coaches who provide tips and challenges.  
   - **Competitors**: Players can learn about the competitors taking part in the competitions.

4. **Weight-Based Ranking**  
   Players can view the **weight-based ranking** to see how they compare to other competitors in their weight category.

5. **Compete Mode**  
   - Players can join a random match against other competitors.  
   - During the competition, **3 random matches** will take place.  
   - Players must use **strategic attacks** to win the matches.  
   - Based on the competition result (1st, 2nd, or 3rd place), points will be awarded:  
     - **1st place**: 100 points  
     - **2nd place**: 80 points  
     - **3rd place**: 60 points

6. **User Profile and Points Overview**  
   Players can access their profile to see their username and accumulated points throughout the competitions.

---

## 🎮 **How to Play**

1. **Log in or Register**:  
   To get started, create an account or log in if you already have one.

2. **Explore Competitions**:  
   Once logged in, you can view available competitions and join one of them.

3. **View Clubs and Coaches**:  
   Check out the different clubs and coaches available, and find the one that best suits your style.

4. **Compete**:  
   Join a competition and engage in 3 random matches. Use your skills and attacks to win.

5. **Ranking and Points**:  
   Based on your performance, you will be ranked in the weight-based ranking. Earn points (100, 80, or 60) depending on your position and check your profile to see your score.


   
https://github.com/user-attachments/assets/e8ad3ec2-4161-4d99-8f0e-9cc3e1b1a9fa


---

## 🗂️ **Project Structure**

The project is organized into several packages divided by functionality and domain. Below is the description of the package structure and the main classes that make up the project:

### **1. Package `com.judo.datos`**
This package contains the classes responsible for **data management** and **database connection**. The classes in this package directly interact with the database to store and retrieve information about players, competitions, clubs, and more.

### **2. Package `com.judo.dominio`**
This package defines the **business entities** and the relationships between them, modeling the game logic and main objects.

### **3. Package `com.mycompany.judo`**
This package contains classes related to the **user interface** and **interaction logic** within the game. It covers everything from the home screen to the combat logic and rankings.

### **4. Additional Resources**
The project also includes **images** to represent techniques and moves during the matches:

- **ippon**, **ippon2**, **nada**, **nada2**, **wazary**, **wazary2**: Images related to different scoring types and judo movements.

---

## 🛠️ **Technologies Used**

- **Java**: The main programming language for the game logic.
- **JFrames**: Used to create the graphical user interface (GUI) to allow players to interact visually with the game.
- **MySQL**: A relational database that stores user information, competitions, points, clubs, and coaches.

