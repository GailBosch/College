  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Follow the instructions in the handout for Assignment 6

  MOV R0, #0      @ mode = 0
  MOV R3, #1      @ currentValue = 1
  MOV R10, #2     @ 2 = 2

  LDR R11, [R1]    @ count = first word at r1
  ADD R1, R1, #4  @ address = address + 4

For:
  CMP R11, R3      @ for (count > currentValue)
  BEQ EndFor      @ {

  MOV R7, R11      @   YCount = count
  SUB R7, R7, #1  @   YCount = YCount - 1
  
  LDRH R4, [R1]   @   x = value at address
  ADD R1, R1, #2  @   address = address + 2

  MOV R8, R7      @   currentYValue = YCount

 YLeft:
  CMP R8, #0      @   while y values left
  BEQ YNotLeft    @   {

  LDRH R5, [R1]   @     y = value at address

  CMP R4, R5      @     if (x = y)
  BNE NotEqual    @     {
  ADD R6, R6, #1  @       noOfMatches = noOfMatches + 1
 NotEqual:        @     }

  ADD R1, R1, #2  @     address = address + 2
  SUB R8, R8, #1  @     YValuesLeft =-1
  B YLeft         @   }
 YNotLeft:

  CMP R6, R9      @   if (noOfMatches > currentModeMatches)
  BLE NoNewMode   @   {
  MOV R9, R6      @     currentModeMatches = noOfMatches
  MOV R0, R4      @     mode = x
 NoNewMode:       @   }


  MOV R6, #0
  MUL R7, R7, R10 @   YCount = YCount * 2
  SUB R1, R1, R7  @   address = address - YCount
  ADD R3, R3, #1  @   currentValue = currentValue + 1
  B   For         @ }
EndFor:

  ADD R9, R9, #1
  SUB R3, R11, R9  @ count - currentModeMatches
  STR R3, [R2]

  MOV R7, R11     @ YCount = Count
  MUL R7, R7, R10 @ YCount = YCount * 2
  SUB R1, R1, R7  @ address = address - YCount
  MOV R3, #0

  ADD R2, R2, #4
  LDRH R9, [R1]

Store:
  CMP R11, R3     @ while (currentValue =! count)
  BEQ StopStore

  LDRH R5, [R1]
  CMP R5, R0      @   if (value = mode)
  BEQ IfMode      @   {
  STRH R5, [R2]   @     store value in address
  ADD R2, R2, #2  @     address + 2
  IfMode:         @   }
  ADD R1, R1, #2
  ADD R3, R3, #1
  B Store         @ }
StopStore:

          




  @ End of program ... check your result

End_Main:
  BX    LR

  .end