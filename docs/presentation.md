# APL
## A Primer

---

<img src="image/cover.png">

???

# APL programming language
# Named after a "A Programming Language"
# Kenneth E. Iverson

---

<a href="https://en.wikipedia.org/wiki/Kenneth_E._Iverson"><img src="image/kenneth-iverson.jpg"></a>

???

# Kenneth E. Iverson
# 17 December 1920 &emdash; 19 October 2004
# Graduated Harvard
# Assistant Professor 

---

> These machines are going to be immensely important for business, and I want you to prepare and teach a course in business data processing.

--

<!-- -->

> He was "appalled" to find that conventional mathematical notation failed to fill his needs, and began work on extensions to the notation that were more suitable

???

# APL born out of necessity
# Mathematical background
# Business application

---

## Notation as a tool of thought
 
* Ease of expressing constructs arising in problems.
* Suggestivity.
* Ability to subordinate detail.
* Economy.
* Amenability to formal proofs.

???

# http://www.eecg.toronto.edu/~jzhu/csc326/readings/iverson.pdf
# Turing Award Lecture
# 1979

---

```java
package nl.fifth_postulate;

public class Verbose1 {

    public static void main(String[] args) {
	    int[] data = {1, 2, 3, 4, 5, 6, 7};
        int length = data.length;

        int sum = 0;
	    for (int index = 0; index < length; index++) {
	        int n = data[index];
	        n *= n;
	        sum += n;
        }

        System.out.println(String.format("sum = %d", sum));
    }
}
```

???

# What does this do? 
# Sum of Squares

---

```java
package nl.fifth_postulate;

import java.util.Arrays;

public class Verbose2 {

    public static void main(String[] args) {
	    int[] data = {1, 2, 3, 4, 5, 6, 7};

        int sum =
                Arrays.stream(data)
                .map(n -> n*n)
                .sum();

        System.out.println(String.format("sum = %d", sum));
    }
}
```

???

# Better with stream API
# Still verbose
# Java isn't the best language

---

```apl
+/(⍳7)*2
```

???

# Should be skeptical
# Try APL

---

### What to know about
## APL

---

## Everything is an Array

--

```apl
1 2 3 4 5
```

--

```apl
1 ⍝ this is not an array ☹
```

--

```apl
'abc'
```

--

```apl
 1  2  3
 4  5  6

 7  8  9
10 11 12
```

???

# Well, actually...
# Almost everything

---

## Functions

--

### `ρ`

#### monadic _shape_

```apl
    ρ 1 2 3 4 5

5
```

--

#### dyadic _reshape_

```apl
    2 2 3 ρ 1 2 3 4 5 6 7 8 9 10 11 12
 
 1  2  3
 4  5  6

 7  8  9
10 11 12
```

???

# Standard functions succinctly with one character
# Monadic: arguments only on one side
# Dyadic: arguments on two sides
# Almost all function have a name

---

## Functions continued

--

```apl
    10 + 1 2 3 4
11 12 13 14
```

--

```apl
    10 20 30 40 + 1 2 3 4
11 12 13 14
```

--

```apl
    10 20 + 1 2 3 4
LENGTH ERROR
```

???

# Functions try to do sensible things
# scalar and vector
# vectors of same shape
# vectors of different shape

---

# Assignment

```apl
skyscrapers ← 5 5 2 10 3 15 10
```

???

# Assignment done with ← (left arrow)

---

## Challenge!

> Imagine standing in front of a line of skyscrapers of varying heights.
> Assume that you can always see a skyscraper that is taller than a closer
> skyscraper.
>
> Write an APL expression that, given a scalar or vector of skyscraper heights
> from closest to furthest, will return an integer representing the number of
> skyscrapers that can be seen.

--

Take a look at

* `\` *scan*
* `⌈` *maximum*
* `∪` *unique*
* `≢` *tally*

---

## Abstraction

If `S` is an APL expression, e.g. `≢∪⌈\`

--

`{Sω}` is the function that accepts arguments to the right.

???

# Function abstraction
# How would a function that accepts arguments to the left look like

---

## Challenge!

> Write an APL expression that, given a scalar real non-negative number, will 
> return a two-element vector of the integer and fractional parts of the number. 

---

## Homework

### [https://adventofcode.com/2018/](https://adventofcode.com/2018/)

???

# Advent of code
# Save christmas by solving puzzles
# Solve as many as you like, but at least one in APL

---

### Slides: [http://fifth-postulate.nl/APL_primer/](http://fifth-postulate.nl/APL_primer/)
### Twitter: [@daan_van_berkel](https://twitter.com/daan_van_berkel)
### GitHub: [dvberkel](https://github.com/dvberkel)
