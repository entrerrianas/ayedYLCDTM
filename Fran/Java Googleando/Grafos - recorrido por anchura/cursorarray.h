#ifndef Cursorarray_H
#define Cursorarray_H
#include "Cursor.h"

class arreglo{

	friend class pila;
cursor *array;
int max;
protected:
int head;
public:
arreglo();
//arreglo(int);
arreglo(const arreglo &);
~arreglo();
bool insertar(cursor,int=0);
bool suprime(int);
int localiza(int);
int recuperas(int);
cursor recuperac(int);
int primero();
int anterior(int);
int siguiente(int);
void anula();
bool isEmpty();
bool isFull();
void print1()const;
void print2();
void print();
void printarr(int);

};
#endif