  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Follow the instructions in the handout for Assignment 3

 MOV R3, R1       @ R3 = Value1
 MOV R4, R2       @ R4 = Value2

While:
 CMP R1, R2       @ while Value1 != Value2
 BEQ EndWh        @ {

 CMP R1, R2       @ if (Value1 > Value2)
 BLT ElseMaxB     @ {
 SUB R1, R1, R2   @ Value1 - Value2
 B EndMax         @ }
ElseMaxB:         @ else {
 SUB R2, R2, R1   @ max = b
EndMax:           @ }

 B While          @ }
EndWh:

MUL R1, R3, R4
UDIV R1, R1, R2
MOV R0, R1


  @ End of program ... check your result

End_Main:
  BX    LR

  .end