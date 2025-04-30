# Observations:

## Calculator

* Calculator-1-Unused import: List is used, but double-check relevance in final codebase.
* Calculator-2-Unused import: ArrayList is used, but consider using interface (List) in declarations instead.
* Calculator-4-Avoid static mutable fields: `finalResult` is static and mutable—can lead to concurrency issues.
* Calculator.Operations-6-Define constants as public static final when used externally or in tests.
* Calculator.Operations-7-10-Using separate constants for each operation clutters the class; consider an enum.
* Calculator.Operations-12-Private constructor prevents instantiation, good for utility class.
* Calculator.Operations-14-Method name `ToString` should follow camelCase: rename to `toString`.
* Calculator.Operations-14-Returning operator symbols as a concatenated string is brittle; splitting logic may fail if symbols change.
* Calculator-18-Public static method `Run` uses PascalCase; Java convention is camelCase: rename to `run`.
* Calculator-18-Method `Run` delegates to private method without validation—no input checks or trimming.
* Calculator-21-Magic behavior: silently prepending 0 if string starts with + or - can be confusing.
* Calculator-21-No null or empty check on `expression` before accessing charAt(0); may throw exception.
* Calculator-25-String split regex uses string from `ToString`—hard to maintain if symbols are ever extended.
* Calculator-28-Loop excludes last character `expression.length() - 1`; risk missing trailing operators.
* Calculator-29-36-Repeating symbol checks; better encapsulated in helper method like `isOperator(char)`.
* Calculator-42-Special case checks for Infinity are rare—consider documenting why this is supported.
* Calculator-43-50-Exception handling is too generic: catching `Exception` hides specific parsing issues.
* Calculator-44-Returning magic string `"ERROR"` is not type-safe or structured—consider custom exception or result object.
* Calculator-52-Reassigns static mutable field `finalResult`—not thread-safe.
* Calculator-53-Converts result to string directly—locale-dependent representation can cause issues.
* Calculator-58-Magic number: hardcoded checks for `numbers.size() == 1` without context.
* Calculator-61-Unused variable `result` is initialized multiple times—restructure to avoid unnecessary allocations.
* Calculator-63-90-Deep nesting with repeating patterns—DRY (Don’t Repeat Yourself) violation.
* Calculator-65-66-Performs operation then immediately mutates list; unclear logic separation.
* Calculator-73-88-Repeated blocks for each operator; could be consolidated via loop or map-based dispatch.
* Calculator-94-121-Code for addition and subtraction is near-identical to multiplication/division block—refactor needed.
* Calculator-123-Method lacks base case error handling: if unexpected operators exist, no fallback path.

## Start

* Start-1 - Unused import warning may be suppressed by IDEs, but `Scanner` is necessary here.
* Start-3 - Class declaration is fine; however, class should ideally have a comment/docstring.
* Start-5 - Variable `Expression` should use camelCase: rename to `expression`.
* Start-6 - Variable `active` controls loop but could be eliminated using `while (true)` with `break` inside.
* Start-7 - Prompt is printed once, but inside loop might be more user-friendly.
* Start-8 - Variable `scanIn` is declared outside the loop but instantiated inside—should either move both inside or reuse the same instance.
* Start-10 - New `Scanner` instance created in each iteration—resource intensive; should be created once before loop.
* Start-11 - Uses `scanIn.nextLine()` without checking for input availability; may throw exception in some environments.
* Start-13 - Uses `equals()` correctly for string comparison.
* Start-14 - Closes scanner if input is "exit", which is correct—but closing inside the loop and continuing usage is risky.
* Start-15 - Properly sets `active = false`, cleanly ending loop.
* Start-17 - Calls `Calculator.Run(Expression)` with PascalCase method; this goes against Java naming conventions.
* Start-17 - Tight coupling with `Calculator` class, which returns a raw string; not robust to errors or exceptions.
* Start-21 - End of method; overall loop lacks input validation (e.g., null input, invalid formats).