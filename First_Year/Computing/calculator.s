  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Follow the instructions in the handout for Assignment 7

 MOV R4, #10 

While: @
 LDRB R2, [R1]      @ while ((ch = byte[address]) != 0)
 CMP R2, #0         @ {
 BEQ EndWhile       @

 CMP R2, #'+'       @ if ch = "+"
 BEQ Adding         @
 CMP R2, #'-'       @ if ch = "-"
 BEQ Subbing        @
 CMP R2, #'*'       @ if ch = "*"
 BEQ Multiplying    @
 CMP R2, #'x'       @ if ch = "x"
 BEQ Hexing         @

  CMP R4, #'A'      @ if (char >= 'A'
  BLO EndIfOne      @ AND
  CMP R4, #'Z'      @ char <= 'Z')
  BHI EndIfOne      @ {
  SUB R4, R4, #0x07 @ char = char - 0x07
EndIfOne:           @ }

 MUL R3, R3, R4     @ total = total * 10
 CMP R2, #'0'       @   if (ch >= '0' && ch <= '9')
 BLO EndIfLwr       @   {
 CMP R2, #'9'       @
 BHI EndIfLwr       @
 SUB R2, R2, #0x30  @     ch = ch - 0x30;
EndIfLwr:           @   }
 ADD R3, R3, R2     @   value
 ADD R1, R1, #1     @   address = address + 1;
 B While            @ }

Adding: 
 MOV R6, #0
 B NextNumber            
Subbing: 
 MOV R6, #1
 B NextNumber
 Multiplying:
 MOV R6, #2
 B NextNumber

NextNumber:
 CMP R5, #0
 BNE NoAdd
 ADD R0, R0, R3     @ runningTotal + number
NoAdd:
 CMP R5, #1
 BNE NoSub
 SUB R0, R0, R3     @ runningTotal - number
NoSub:
 CMP R5, #2
 BNE NoMul
 MUL R0, R0, R3     @ runningTotal * number
NoMul:
 MOV R3, #0         @ number = 0
 ADD R1, R1, #1     @ address = address + 1;
 MOV R5, R6
 MOV R4, #10
 B While

Hexing:
 MOV R4, #16
 ADD R1, R1, #1     @ address = address + 1;
 B While
EndWhile:

 CMP R5, #0
 BNE NoAddEnd
 ADD R0, R0, R3     @ runningTotal + number
NoAddEnd:
 CMP R5, #1
 BNE NoSubEnd
 SUB R0, R0, R3     @ runningTotal - number
NoSubEnd:
 CMP R5, #2
 BNE NoMulEnd
 MUL R0, R0, R3     @ runningTotal * number
NoMulEnd:
 
  @ End of program ... check your result

End_Main:
  BX    LR

  .end