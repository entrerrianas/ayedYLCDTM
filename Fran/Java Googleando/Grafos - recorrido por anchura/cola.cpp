#include <iostream>
#include <iomanip>
#include <stdlib.h>
#include "Cursor.h"
#include "cola.h"
#include "Cursorarray.h"
using namespace std;

cola::cola():arreglo()
{

}

cola::~cola()
{

}

void cola::anula()
{
 arreglo::anula();
 arreglo::print1();
}


int  cola::frente()
{
	cursor x;
 x=arreglo::recuperas(arreglo::primero());
 return x.getdata();
 //arreglo::printarr();
 
}


void cola::pone_en_cola(cursor x)
{   
	arreglo::insertar(x);
	arreglo::print1();
	
}

void cola::quita_de_cola()
{

 arreglo::suprime(arreglo::primero());
 arreglo::print1();
}

bool cola::vacia()
{  
    if(arreglo::isEmpty()){
     cout<<"cola vacia!!!"<<endl; 		
	  return true;
	}
    else{
      cout<<"no esta vacia!!"<<endl; 
        return false;
	}
}

void cola::printC()
{
 arreglo::print();
}

