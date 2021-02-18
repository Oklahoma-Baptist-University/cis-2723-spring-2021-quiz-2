# CIS 2723 Spring 2021 Quiz #2

This quiz is open book and open notes, including homework solutions.

You are not allowed to search the web for solutions.

Submitting your answers to this quiz implies that you agree to the OBU Honor Code:

**On my honor as an OBU student, I pledge that I have neither received aid nor given aid on this quiz.**

You are to write a Java program in the included Main.java with the following specifications.

- Open the file named q2.txt. This file contains a list of email addresses, one address per line.
- Read in a line of data and do the following
  - Separate the user ID from the domain. Each email address has exactly one @ character that separates the user ID from the domain.
  - Determine if the user ID is invalid. The user ID is invalid if it starts with a '.' Count the number of invalid user IDs
  - Extract the extension (.com, .gov, .edu) from the domain and count the number of .com, .gov, .edu and "other" domains
- After all the data in the file is processed, print out the following percentages in the format shown. **Note that your numbers will be different**. The percentages must have a % character and two numbers to the right of the decimal. The statistics must be indented as shown.

```
Statistics:
	Number of invalid user IDs 25.00%
	Number of .com sites 25.00%
	Number of .edu sites 25.00%
	Number of .gov sites 25.00%
	Number of unknown sites 25.00%
```

**A submission will compilation errors will receive a 0 for the quiz.**

When you are finished, push your changes to the GitHub repository.