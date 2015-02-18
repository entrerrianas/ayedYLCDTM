#include"Cursorarray.h"
#include "Cursor.h"
#include"pila.h"
#include<string>
#include<iostream>
#include <iomanip>
using namespace std;


pila::pila(){
l='\0';
}

pila::pila(int y){

size=y;

 pl = new arreglo[size+1];
 if(!pl)
 {
  cout << "No Hay Memoria..." << endl;
  exit(1);
 }

 system("PAUSE");

}

pila::~pila(){
if(pl)
   delete []pl;
}


void pila::Anula(){
	arreglo::anula();
	arreglo::print2();
}

int pila::Tope(){
 arreglo::recuperac(head);
int x=head;
return x;
 //arreglo::printarr(x); 
}

void pila::Saca(){
	int x=head;
	head=arreglo::anterior(head);
 arreglo::suprime(x);
 //arreglo::print2();
}


void pila::Mete(cursor p){
	int f=arreglo::primero();
	arreglo::insertar(p);
	//arreglo::print2(); 
}


int pila::Vacia(){

if(arreglo::isEmpty()){
     //cout<<"pila vacia!!!"<<endl;
	 return 1;
	
	}
    else{
      //cout<<"no esta vacia!!"<<endl; 
       return 0;
	}
}

void pila::printp(){

	arreglo::print2();
}