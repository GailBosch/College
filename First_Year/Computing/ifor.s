  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Translate the pseudocode below into ARM Assembly Language.
  @ Assume ch is an ASCII character code in R1 and v is a value in R0.

  @ if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
  @ {
  @ 	v = 1;
  @ }
  @ else
  @ {
  @ 	v = 0;
  @ }
  MOV R0, #0

  CMP     R1, #0x61      @ if (ch=='a'
  BEQ     Then           @ ||
  CMP     R1, #0x65      @ ch=='e'
  BEQ     Then           @ ||
  CMP     R1, #0x69      @ ch=='i'
  BEQ     Then           @ ||
  CMP     R1, #0x6F      @ ch=='o'
  BEQ     Then           @ ||
  CMP     R1, #0x75      @ ch=='u'
  BNE     EndIf          @ {
Then: MOV R0, #1     @ y = y + 1
EndIf:                   @ }

  @ End of program ... check your result

End_Main:
  BX    LR

  .end