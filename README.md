# AP Java Starter Project (Bothell High)

This is a starter template for all Java assignments in AP CS-A at Bothell High School.

It includes:
- Java 21 project structure with Maven
- Unit testing via JUnit 5
- JavaFX support for graphical programs
- Built-in support for VS Code (both desktop and browser-based)
- Optional browser-based GUI display via Xpra

---

## 💻 Project Structure
```
src/
  main/java/edu/bhscs/Main.java ← your main code here
  test/java/edu/bhscs/MainTest.java ← JUnit tests go here
```

This follows the standard Maven Java layout used in industry.

---

## 🚀 How to Use This Project

You can run this code **in your browser (recommended)** or **on your local computer**.

---

## Option 1: 🌐 GitHub Workspaces (in-browser)

**Easiest and cleanest way to work on this project.**

### Steps:
1. Open this project in [GitHub Workspaces](https://github.com/features/workspaces)
   *(your assignment may include a link)*
2. The container will automatically:
   - Install Java 21, Maven, and JavaFX
   - Start a virtual GUI server (Xpra)
3. VS Code will open in your browser with everything ready to go
4. Use the terminal to run:
```
  ./mvnw -q exec:java # Runs your program
  ./mvnw -q test # Runs all tests
```

5. To view graphical output (JavaFX or Swing), click the forwarded port (9876) to open the virtual desktop window.

---

## Option 2: 🖥️ Run Locally (advanced)

If you prefer to work on your own computer:

### Requirements:
- Java 21 or higher (we recommend [ZuluFX JDK](https://www.azul.com/downloads/?package=jdk))
- Apache Maven (https://maven.apache.org)
- VS Code with the Java Extension Pack

### Steps:
1. Clone or download this repo
2. Open in VS Code
3. In the terminal, run:
```
  ./mvnw -q exec:java
  ./mvnw -q test
```

If you use the ZuluFX JDK, JavaFX GUIs will work with no extra setup.

---

## 🧪 Testing

This project uses **JUnit 5** for unit tests. All test files live in:
```
  src/test/java/edu/bhscs/
```

To run all tests:
```
  ./mvnw -q test
```
---

## 🎨 GUIs
- **Local + ZuluFX** → GUIs open in normal system windows.
- **GitHub Workspaces** → GUIs appear in a browser tab using Xpra.
  - The container starts Xpra automatically.
  - Click the forwarded port (usually `9876`) to launch the virtual desktop and see your app.

---

## ⚙️ Key Files
- `.gitignore` → Skips compiled files and IDE junk
- `.vscode/` → VS Code settings (Java extensions, clean UI, inlay hints off)
- `.devcontainer/` → Container setup for GitHub Workspaces (tools + GUI)
- `scripts/start-xpra.sh` → Launches the browser-based GUI environment
- `pom.xml` → Project definition (Maven build, test runner, dependencies)

---

## ❓ Troubleshooting

**GUI not showing?**
- In GitHub Workspaces: click the forwarded port tab (port `9876`)
- Locally: make sure you're using a JDK with JavaFX (e.g. ZuluFX 21)

**Can't run the code?**
- Try: `./mvnw clean` then `./mvnw -q compile`
- Make sure you're inside the container or using JDK 21+ locally

**Tests failing?**
- Review your logic and confirm the test expectations
- Run `./mvnw -q test` to recheck

---

Happy coding! 🚀
