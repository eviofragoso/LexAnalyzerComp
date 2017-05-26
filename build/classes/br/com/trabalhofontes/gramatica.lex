package br.com.trabalhofontes;
import static br.com.trabalhofontes.Token.*;


%%
%class LexicalAnalyser
%type Token
%line
%column



SPACECHAR = [\ \t]
LINECHAR = \r|\n

INT =[1-9][0-9]*
NEGINT = [\-]?[1-9][0-9]*
POWER = \@
ID = [a-zA-Z$][a-zA-Z$0-9]*
FLOAT = [1-9][0-9]*[,][0-9]+
NEGFLOAT = [\-][1-9][0-9]+[,][0-9]+

COMMENT = (["#"].*)
BLOCKCOMMENT = ([":"].*[":"])
STRING = (["&"].*["&"])



%{
public String lexeme;


%}
%%

 

 "<-" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ARROW;}
  {LINECHAR} {lexeme = yytext(); return LINEBREAK;}
 {SPACECHAR} {/*Ignore*/}
 "(" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return LEFTPARENT;}
 ")" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return RIGHTPARENT;}
 "if" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return IF;}
 "else" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ELSE;}
 "end" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return END;}
 "<>" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return OR;}
 ">" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return MAJOR;}
 "<" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return LESS;}
 "!" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return NO;}
 "&&" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return AND;}
 "<=" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return EQLESS;}
 ">=" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return EQMAJOR;}
 "range" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return RANGE;}
 "while" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return WHILE;}
 "{" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return LEFTBRACK;}
 "}" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return RIGHTBRACK;}
 "+" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ADD;}
 "-" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return MINUS;}
 "/" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return DIV;}
 "*" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return MUL;}
 "=" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return EQ;}
 "!=" {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn;return NOEQ;}
 {ID} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ID;}
 {INT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return INT;}
 {NEGINT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return NEGINT;}
 {POWER} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return POWER;}
 {FLOAT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return FLOAT;}
 {NEGFLOAT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return NEGFLOAT;}
 {COMMENT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return COMMENT;}
 {BLOCKCOMMENT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return BLOCKCOMMENT;}
 {STRING} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return STRING;}

.                { lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ERROR; }
 





