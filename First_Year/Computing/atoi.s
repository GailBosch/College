  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

@ Follow the instructions in the handout for Assignment 2

@ Character 1
  CMP R4, #'A' @ if (char >= 'a'
  BLO EndIfOne @ AND
  CMP R4, #'Z' @ char <= 'z')
  BHI EndIfOne @ {
  SUB R4, R4, #0x07 @ char = char - 0x20
EndIfOne: @ }
  SUB R4, R4, #0x30

@ Character 2
  CMP R3, #'A' @ if (char >= 'a'
  BLO EndIfTwo @ AND
  CMP R3, #'Z' @ char <= 'z')
  BHI EndIfTwo @ {
  SUB R3, R3, #0x07 @ char = char - 0x20
EndIfTwo: @ }
  SUB R3, R3, #0x30

@ Character 3
  CMP R2, #'A' @ if (char >= 'a'
  BLO EndIfThree @ AND
  CMP R2, #'Z' @ char <= 'z')
  BHI EndIfThree @ {
  SUB R2, R2, #0x07 @ char = char - 0x20
EndIfThree: @ }
  SUB R2, R2, #0x30

@ Character 4
  CMP R1, #'A' @ if (char >= 'a'
  BLO EndIfFour @ AND
  CMP R1, #'Z' @ char <= 'z')
  BHI EndIfFour @ {
  SUB R1, R1, #0x07 @ char = char - 0x20
EndIfFour: @ }
  SUB R1, R1, #0x30


    MUL R2, R2, R5
    MUL R6, R5, R5

    MUL R3, R3, R6
    MUL R6, R6, R5

    MUL R4, R4, R6

    MOV R0, R1
    ADD R0, R0, R2
    ADD R0, R0, R3
    ADD R0, R0, R4

  @ End of program ... check your result

End_Main:
  BX    LR

  .end