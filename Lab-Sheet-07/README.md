# Java Lab Sheet 7 – Multithreading

**Total questions:** 15

Each `Q01` to `Q15` folder contains one Java source file and its sample output.

## Compile and run
Open a question folder in terminal and run:

```bash
javac ClassName.java
java ClassName
```

Replace `ClassName` with the Java filename without `.java`.

## Notes
- Thread scheduling is controlled by the JVM/operating system, so output order can vary.
- Q10 intentionally demonstrates an unsynchronized race condition; its actual balance may vary between runs.
- Q14 safely demonstrates deadlock using daemon threads so the demonstration does not leave the Java process running forever.
- Q15 fixes deadlock by acquiring both locks in the same order.
- In Q01 and Q02, replace `Aditya` with your own name if required.
