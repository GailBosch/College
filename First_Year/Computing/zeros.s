  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Follow the instructions in the handout for Assignment 8
  MOV R0, #0            @ result = 0
  MOV R2, #0            @ counter = 0
  MOV R3, #0            @ zeroCounter = 0

While:
  CMP R2, #32           @ while (counter < 32)
  BEQ EndWhile          @ {

  MOVS R1, R1, LSR #1   @   if (carry clear)
  BCS CarrySet          @   {

  ADD R3, R3, #1        @     zeroCounter += 1

  ADD R2, R2, #1        @     counter++ }
  B While               @ }

EndWhile:

CarrySet:

  CMP R3, R0            @ if (zeroCounter > result)
  BLT NoChange          @ {

  MOV R0, R3            @  result = zeroCounter

NoChange:               @ }

  MOV R3, #0            @ zeroCounter = 0

  CMP R2, #32           @ if (counter != 32)
  BEQ End               @ {
  ADD R2, R2, #1        @   counter++
  B While               @   return to while loop}

End:
  @ End of program ... check your result

End_Main:
  BX    LR

  .end