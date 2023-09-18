  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @
  @ Write a program to compute ax^3+bx^2+cx+d
  @   where x, a, b, c, and d are values in R1, R2, R3, R4 and R5 respectively
  @
  @ Store your result in R0
  @

  MUL R7, R4, R1  @ cx
  MUL R6, R1, R1  @ x^2
  MUL R8, R3, R6  @ bx^2
  MUL R6, R6, R1  @ x^3
  MUL R2, R2, R6  @ ax^3

  MOV R0, R2      @ 0 + ax^3
  ADD R0, R0, R8  @ ax^3 + bx^2
  ADD R0, R0, R7  @ ax^3 + bx^2 + cx
  ADD R0, R0, R5  @ ax^3 + bx^2 + cx + d

  @ End of program ... check your result

End_Main:
  BX    LR

  .end