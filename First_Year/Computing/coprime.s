  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Follow the instructions in the handout for Assignment 4

 MOV R2, #1          @ a = 1
 MOV R0, #0          @ R0 = coprimeNo

While:
 CMP R1, R2         @ while a < N
 BLE EndWh          @ {

 MOV R3, R2         @ b = a

 While2:
  CMP R1, R3        @ while b < N
  BLE EndWh2        @ {

    MOV R4, R2      @   R4 = a
    MOV R5, R3      @   R5 = b

    While3:
      CMP R4, R5        @ while Value1 != Value2
      BEQ EndWh3        @ {

      CMP R4, R5        @ if (Value1 > Value2)
      BLT ElseMaxB      @ {
      SUB R4, R4, R5    @ Value1 - Value2
      B EndMax          @ }
     ElseMaxB:          @ else {
      SUB R5, R5, R4    @ Value2 - Value1
     EndMax:            @ }

     B While3           @ }
    EndWh3:

     CMP R4, #1         @ if coprime = 1
     BNE NotCoprime     @ {
     ADD R0, R0, #1     @   coprimeNo = coprime + 1
    NotCoprime:         @ }

    ADD R3, R3, #1  @ b = b + 1

  B While2          @ }
 EndWh2:

 ADD R2, R2, #1     @ a = a + 1

 B While            @ }
EndWh:        

  @ End of program ... check your result

End_Main:
  BX    LR

  .end