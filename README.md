# Parser-translator-of-custom-language
 Implementation of a parser and translator for a language supporting string operations. 

The language supports the concatenation operator over strings, function definitions and calls, 
conditionals (if-else i.e, every "if" must be followed by an "else"), 
and the following logical expressions:
  is-prefix-of (string1 prefix string2): Whether string1 is a prefix of string2.
  is-suffix-of (string1 suffix string2): Whether string1 is a suffix of string2.  
  All values in the language are strings.
  
  
  
The parser, based on a context-free grammar,translates the input language into Java. 
JavaCUP is used for the generation of the parser combined either with a hand-written lexer or a generated-one 
(e.g., using JFlex, which is encouraged).

compilation: make compile
execution: make execute < input.txt

File named Main.java after execution contains the input code in compilable java code.
