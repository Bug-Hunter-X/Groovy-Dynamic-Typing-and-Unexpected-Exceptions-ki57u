# Groovy Dynamic Typing and Unexpected Exceptions

This example demonstrates a potential issue in Groovy related to its dynamic typing.  A method might appear to handle null inputs gracefully, but it could still throw exceptions for unexpected input types without explicit type checking.

The `bug.groovy` file contains a Groovy class with a method that seemingly handles `null` correctly but fails when given a list as input. The `bugSolution.groovy` file provides an improved version with explicit type checking to avoid this problem.
