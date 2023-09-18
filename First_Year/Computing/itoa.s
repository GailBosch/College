  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

   @ Follow the instructions in the handout for Assignment 5
  CMP   R1, #0                @ if (integer = 0)
  BNE   IfNotZero             @ {
  MOV   R9, #0x30             @   a = "0"
  STRB  R9, [R0]              @   store a as string
  ADD   R0, R0, #1            @   move one place
  B     IfZero                @ }
IfNotZero:

  MOV   R6, #10000
  MOV   R3, #10000
  MUL   R3, R6, R3
  MOV   R6, #10
  MUL   R3, R3, R6            @ divisor = 1000000000

  CMP   R1, #0                @ if integer < 0 
  BGT   Positive              @ {
  MOV   R9, '-'               @  b = "-"
  STRB  R9, [R0]              @  add b to string
  ADD   R0, R0, #1            @  move one place

  MOV R9, -1                  @ b = -1
  MUL R1, R1, R9              @ integer=*b

  B     Negative              @ }
Positive:                     @ else {
  MOV   R9, #0x2B             @  b = "+"
  STRB  R9, [R0]              @  add b to string
  ADD   R0, R0, #1            @  move one place
Negative:                     @ }

WhileNotHighest:
  UDIV R7, R1, R3
  CMP R7, #0                  @ while integer/divisor < 0
  BGT WhileHighest            @ {
  UDIV R3, R3, R6             @ divisor/10
  B WhileNotHighest           @ }
WhileHighest:

WhileNotZero:
  CMP   R1, #0                @ while integer =! 0
  BEQ   WhileZero             @ {
  
  UDIV  R4, R1, R3            @     value = integer/divisor
  MUL   R5, R4, R3            @     takeAway = integer*divisor
  SUB   R1, R1, R5            @     integer = integer - takeAway
  ADD   R4, #0x30             @     convert to ascii

  STRB  R4, [R0]              @     store ascii value in register

  ADD   R0, R0, #1            @     placeNumber =+1
  UDIV  R3, R3, R6

  B     WhileNotZero          @ }
WhileZero:

BigNo:
  CMP R3, #0                  @ while (divisor != 0)
  BEQ NoBigNo                 @ {

  UDIV  R4, R1, R3            @     value = integer/divisor
  ADD   R4, #0x30             @     convert to ascii

  STRB  R4, [R0]              @     store ascii value in register

  ADD   R0, R0, #1            @     placeNumber =+1

  UDIV R3, R3, R6             @ divisor/10
  B   BigNo                   @ }
NoBigNo:


IfZero:
  MOV R8, #0                    @ end string
  STRB R8, [R0]

  @ End of program ... check your result

End_Main:
  BX    LR

  .end