// console.h
//
#if !defined CONSOLE_H
#define CONSOLE_H

#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <windows.h>

void clrscr();
void gotoxy(int, int);
void setrgb(WORD);
//void printxy(int, int, char);
void printxy(int x, int y, const char* c);
void printxy(int x, int y, long int c);
#endif
