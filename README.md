# Problem 1 - Pangram Utility - Missing Letters
The sentence "A quick brown fox jumps over the lazy dog" contains every single letter in
the alphabet. Such sentences are called pangrams. You are to write a method
getMissingLetters, which takes as input a string containing a sentence and returns all
the letters not present at all in the sentence (i.e., the letters that prevent it from being a
pangram). You should ignore the case of the letters in sentence, and your return should
be all lower case letters, in alphabetical order. You should also ignore all non­alphabet
characters as well as all non­US­ASCII characters.

Imagine that the method you write will be called many thousands of times in rapid
succession on strings with length ranging from 0 to 50. Accordingly, you should try to
write code that runs as quickly as possible. Also, imagine the case when the input string
is quite large (e.g., tens of megabytes). See if you can develop an algorithm that
handles this case efficiently while still running very quickly on smaller inputs.
    
## Table of contents
- [Prerequisites](#prerequisites)
- [Quick start](#quick-start)
- [Status](#status)
- [Bugs and feature requests](#bugs-and-feature-requests)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [Versions](#versions)
- [Creator](#creator)
- [Copyright and license](#copyright-and-license)

## Prerequisites
- Java 8
- Maven 3.5.0
- Junit 4.12
- Junit.Jupiter 5.0.2
- SpringBoot 1.5.9.RELEASE

## Quick start
 1. Get the Repo: 
		```git clone git@github.com:DeniseFranke/solution.git```
 2. Import into your IDE - Menu **File –> Import –> Maven –> Existing Maven Projects**
        ```Browse to your source code location
        Click **Finish** button to finish the importing```
 3. Check the versions in the pom.xml, 
		```Update version of to match your environment or update your environment.```
 4. Run the example with Junit: 
        ```mvn test```
   
## Status
[![Slack]](https://denisefranke/slack.com/#status)

## Bugs and feature requests
Find a bug or would like to request a new feature? 
Please first read the [issue guidelines](CONTRIBUTING.md#using-the-issue-tracker) 
Note:  Normally I would point to the issues page in the github repo here and recommend searching the for existing and closed issues.  If your problem or idea has not already been addressed, 
[please open a new issue](link to the github project's issue page normally would go here ).

## Documentation
Documentation consists of this README.md, the CONTRIBUTING.md and all files in this archive's /documents folder.

## Contributing
Please read through the project's [contributing guidelines](https://github.com/DeniseFranke/simulator/CONTRIBUTING.md). 
It provides direction for opening issues, coding standards, and notes on development.
Moreover, if your pull request contains any code changes, please include relevant unit tests.

## Versions
For transparency into the release cycle and in striving to maintain backward compatibility, 
this site is maintained under [the Semantic Versioning guidelines](http://semver.org/).
Normally I would put a github releases page reference here with a discussion about changelogs and where to find major release announcements for each major release version of the utility.   Usually I put these on a slack channel so continuous integration tool (jenkins, etc) can update it automatically via a hook. 

## Creator
**Denise Franke**
- [twitter](https://twitter.com/charmedlife000)
- [github](https://github.com/DeniseFranke)
- [linkedin](https://www.linkedin.com/in/denisefranke)

## Copyright and license
Code and documentation released under [MIT License] (https://github.com/DeniseFranke/master/docs/LICENSE) and copyright 2018 by @DeniseFranke
Docs released under the Creative Commons License.
Copyright (c) 2018 Denise Franke 
