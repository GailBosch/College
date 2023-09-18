  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Translate the pseudocode below into ARM Assembly Language.
  @ Assume a and b are values in R1 and R2 and r is a value in R0.

  CMP R2, R1     @ if (a < b)
  BLT ElseMaxB   @ {
  MOV R0, R1     @ r = a;
  B EndMax       @ }
ElseMaxB:        @ else {
  MOV R0, R2     @ r = b;
EndMax:          @ }

  @ End of program ... check your result

End_Main:
  BX    LR

  .end