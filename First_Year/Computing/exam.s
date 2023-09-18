  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @
  @ Follow the instructions given in the examination paper
  @
  @ The address of string A is in register R1
  @ The address of string B is in register R2
  @
  @ To aid your debugging using Visual Studio Code:
  @ 
  @   - string A will be in RAM at 0x20000000
  @   - string B will be in RAM at 0x20000080
  @ 
  @ (However, your program should not assume that strings A and B will always
  @ be at the above addresses and Submitty may start your program with
  @ different start addresses for Strings A and B in R1 and R2.)
  @
  
  MOV R0, #0         @ result = 0;
  MOV R5, #0         @ matchCounter = 0;
  MOV R6, #0         @ memoryPosition = 0;

While:
  LDRB R3, [R1]      @ while ((ch = byte[address]) != 0)
  CMP R3, #0         @ {
  BEQ EndWhile       @

While2:
  LDRB R4, [R2]      @  while ((ch = byte[address]) != 0)
  CMP R4, #0         @  {
  BEQ EndWhile2      @

  LDRB R3, [R1]      @    value1 = char[address]

  CMP  R3,  R4       @    if (char1 = char2)
  BNE NoMatch        @    {
  ADD  R5,  R5, #1   @      matchCounter += 1;
  ADD R1, R1, #1     @      address += 1;
  B Match            @    }
NoMatch:             @    else {
  CMP R5, R0         @      if (matchCounter > result)
  BLT OldResult      @      {
  MOV R0, R5         @        result = matchCounter;
  MOV R9, R8         @        SubStPositionA = lengthA
  MOV R10, R2        @        SubStPositionB = addressB
OldResult:           @      }
  SUB R1, R1, R5     @      address = address - matchCounter;
  MOV R5, #0         @      matchCounter = 0; }

Match:               
  ADD R2, R2, #1     @    address ++;
  ADD R6, R6, #1     @    memoryPosition ++; 

  B While2           @  }
EndWhile2:

  ADD R1, R1, #1     @  address1 ++;
  SUB R2, R2, R6     @  address2 - memoryPosition;
  MOV R6, #0         @  memoryPosition = 0;
  ADD R8, R8, #1     @  lengthA++;

  B While            @ }
EndWhile:

  SUB R1, R1, R8     @ addressA = addressA - lengthA;
  MOV R5, #0         @ counter = 0;
  ADD R1, R1, R9     @ addressA += SubStPositionA;
  SUB R8, R8, R0     @ lengthA = lengthA - result;

For:
  CMP R5, R8         @ While (counter < lengthA)
  BEQ StringADone    @  {
  ADD R1, R1, R0     @    addressA += result;
  LDRB R3, [R1]      @    value1 = char[addressA]
  SUB R1, R1, R0     @    addressA += -result;
  STRB R3, [R1]      @    char[addressA] = value1;
  ADD R1, R1, #1     @    addressA ++;
  ADD R5, R5, #1     @    counter++;
  B For              @  }
StringADone:

  SUB R10, R10, R2   @ SubStPositionB -= addressB
  SUB R10, R10, R0   @ SubStPositionB -= result
  ADD R2,  R2,  R10  @ addressB += SubStPositionB
  MOV R5, #0         @ counter = 0;

ForB:
  CMP R5, R8         @ While (counter < lengthA)
  BEQ StringBDone    @  {
  ADD R2, R2, R0     @    addressB += result;
  LDRB R4, [R2]      @    value2 = char[addressB]
  SUB R2, R2, R0     @    addressB += -result;
  STRB R4, [R2]      @    char[addressB] = value1;
  ADD R2, R2, #1     @    addressB ++;
  ADD R5, R5, #1     @    counter++;
  B ForB              @  }
StringBDone:

End_Main:
  BX    LR

  .end