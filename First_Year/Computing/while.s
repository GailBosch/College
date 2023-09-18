  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Translate the pseudocode below into ARM Assembly Language.
  @ Assume h is a value in R0.

  @ while (h >= 13) {
  @ 	h = h - 12;
  @ }

  WhileSlay:
    CMP R0, #13      @ while (h >= 13)
    BLE EndWhSlay    @ {
    SUB R0, R0, 12
    B WhileSlay      @ }
  EndWhSlay:
  

End_Main:
  BX    LR

  .end