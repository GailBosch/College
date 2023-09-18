  .syntax unified
  .cpu cortex-m3
  .fpu softvfp
  .thumb
  
  .global  Main

Main:

  @ Translate the pseudocode below into ARM Assembly Langauge.
  @ Assume v is a value in R1 and a is a value in R0.

  @ if (v < 10) {
  @ 	a = 1;
  @ }
  @ else if (v < 100) {
  @ 	a = 10;
  @ }
  @ else if (v < 1000) {
  @ 	a = 100;
  @ }
  @ else {
  @ 	a = 0;
  @ }  

  CMP R1, #10   @ if (v < 10)
  BGE ElseV10   @ {
  MOV R0, #1    @ a = 1;
  B EndV10      @ }
ElseV10:        @ else {
    
    CMP R1, #100     @ if (v < 100)
    BGE ElseV100     @ {
    MOV R0, #10      @ a = 10;
    B EndV100        @ }
  ElseV100:          @ else {
    
      CMP R1, #1000     @ if (v < 1000)
      BGE ElseV1000     @ {
      MOV R0, #100      @ a = 100;
      B EndV1000        @ }
    ElseV1000:          @ else {
      MOV R0, #0        @ a = 0;
    EndV1000:           @ }
  
  EndV100:          @ }

EndV10:          @ }



End_Main:
  BX    LR

  .end