  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Translate the pseudocode below into ARM Assembly Langauge.
  @ Assume ch is an ASCII character in R0.

  @ if (ch >= 'A' && ch <= 'Z') {
  @ 	ch = ch + 0x20;
  @ }

  CMP R0, #'A' @ if (char >= 'A'
  BLO EndIfLc @ AND
  CMP R0, #'Z' @ char <= 'Z')
  BHI EndIfLc @ {
  ADD R0, R0, #0x20 @ char = char + 0x20
EndIfLc: @ }

  @ End of program ... check your result

End_Main:
  BX    LR

  .end