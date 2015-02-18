#ifndef pila_h
#define pila_h
#include"Cursorarray.h"
#include "Cursor.h"
using std::string;
using namespace std;

class pila:public arreglo
{
private:
arreglo* pl;
cursor*arr;
string l;
int size;
 
public:

pila();
pila(int);
pila(const pila&);
~pila();
void Anula();
int Tope();
void Saca();
void Mete(cursor);
int Vacia();
void printp();

};

#endif
