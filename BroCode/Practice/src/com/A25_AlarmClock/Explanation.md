# Alarm Clock - Full Line-by-Line Explanation

This markdown explains the Java code in `Main.java` and `AlarmClock.java` for your Alarm Clock project. Every significant line is annotated so you can revisit this anytime and understand how it works.

---

## ✅ Main.java
```java
package com.A25_AlarmClock;
```
- Declares the package name. Your classes are stored in a directory named `A25_AlarmClock`.

```java
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
```
- Imports required Java libraries:
    - `DateTimeParseException`: to handle invalid time format inputs.
    - `Scanner`: for taking user input.
    - `DateTimeFormatter` and `LocalTime`: for parsing and working with time.

```java
public class Main {
```
- This is the main class containing the entry point of your application.

```java
    public static void main(String[] args) {
```
- The main method that runs when the program starts.

```java
        Scanner in = new Scanner(System.in);
```
- Creates a `Scanner` object to read input from the user.

```java
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
```
- Defines the expected time input format (24-hour format with seconds).

```java
        LocalTime alarmTime = null;
```
- Declares a `LocalTime` variable to hold the user's alarm time.

```java
        String filepath = "D:\\Work\\Java Practise\\BroCode\\Practice\\src\\com\\A25_AlarmClock\\Fortunate Son.wav";
```
- The file path of the audio file to be played when the alarm goes off.
- Note: Double backslashes `\\` are used for escaping in strings.

```java
        while(alarmTime == null){
```
- Loop until a valid time is entered by the user.

```java
            try{
                System.out.print("Alarm Time (HH:MM:SS) : ");
                String inputTime = in.nextLine();
```
- Prompts user for input and reads the time.

```java
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
```
- Parses the input string into `LocalTime` object using the formatter.

```java
            } catch(DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }
```
- Catches invalid format exceptions and loops again.

```java
        AlarmClock alarmClock = new AlarmClock(alarmTime, filepath, in);
```
- Creates an instance of your custom `AlarmClock` class.

```java
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
```
- Starts the alarm in a separate thread so your program can perform other tasks if needed.

---

## ⏰ AlarmClock.java
```java
package com.A25_AlarmClock;
```
- Same package as `Main.java`.

```java
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
```
- Required imports for audio, file handling, time, and input reading.

```java
public class AlarmClock implements Runnable{
```
- Implements `Runnable`, so this class can run on a separate thread.

```java
    public final LocalTime alarmTime;
    public final String filepath;
    public final Scanner in;
```
- Declares final variables to store the alarm time, audio file path, and scanner.
- `final` ensures their values don’t change after initialization.

```java
    AlarmClock(LocalTime alarmTime, String filepath, Scanner in){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.in = in;
    }
```
- Constructor initializes the class with required values.

```java
    @Override
    public void run(){
```
- Overriding the `run()` method from the `Runnable` interface.
- This code executes when the thread starts.

```java
        while(LocalTime.now().isBefore(alarmTime)){
```
- Loops until the current time reaches or passes the alarm time.

```java
            try{
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
```
- Sleeps for 1 second (1000 ms) to simulate ticking.
- Prints the current time in `HH:MM:SS` format, updating on the same line using `\r`.

```java
            }catch (InterruptedException e){
                System.out.println("Thread Was Interrupted");
            }
        }
```
- If thread is interrupted, a message is shown.
- Ends the loop when alarm time is reached.

```java
        playSound(filepath);
    }
```
- Calls method to play the audio file.

```java
    private void playSound(String filepath){
```
- Private method to handle playing the alarm sound.

```java
        File audioFile = new File(filepath);
```
- Creates a `File` object using the given path.

```java
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
```
- Uses try-with-resources to open the audio file.

```java
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
```
- Loads and plays the audio clip.

```java
            System.out.print("\nHit *ENTER* to stop alarm : -");
            in.nextLine();
            clip.stop();
            in.close();
```
- Waits for the user to hit enter.
- Stops the alarm and closes the input stream.

```java
        }catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File");
        }catch(IOException e){
            System.out.println("IOException");
        } catch (LineUnavailableException e) {
            System.out.println("Line Unavailable");
        }
    }
}
```
- Exception handling for unsupported file format, IO errors, or line unavailability in the system.

---

## 🧠 Key Concepts Covered
- `LocalTime` and `DateTimeFormatter`
- User input parsing and validation
- Multi-threading with `Runnable`
- Audio playback with `Clip` and `AudioSystem`
- Exception handling
- `try-with-resources` for managing streams
- Updating time display dynamically with `\r`

---

