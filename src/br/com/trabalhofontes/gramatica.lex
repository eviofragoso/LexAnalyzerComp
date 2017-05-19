package br.com.trabalhofontes;
import static br.com.trabalhofontes.Token.*;


%%
%class LexicalAnalyser
%type Token
%line
%column



SPACECHAR = [\ \t]
LINECHAR = \n|\r|\r\n

NAT = [1-9][0-9]*
NATWP = [1-9][0-9]*[@]?
ID = [a-zA-Z$][a-zA-Z$0-9]*
FLOAT = {NAT}+[,]{NAT}+
FLOATWP = {NAT}+[,]{NAT}+[@]?
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
 {NAT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return NAT;}
 {NATWP} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return NATWP;}
 {FLOAT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return FLOAT;}
 {FLOATWP} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return FLOATWP;}
 {COMMENT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return COMMENT;}
 {BLOCKCOMMENT} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return BLOCKCOMMENT;}
 {STRING} {lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return STRING;}

.                { lexeme = yytext()+" line: "+yyline+" column: "+yycolumn; return ERROR; }
 





