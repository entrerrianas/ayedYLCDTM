#include "Cursorarray.h"
#include "Cursor.h"
#include <iostream>
#include <iomanip>
#include<cassert>
#include <string>
using namespace std;

arreglo::arreglo(){
 max=100;
 array = new cursor[max+1];
 head=0;
 if(!array)
 {
  cout << "No Hay Memoria..." << endl;
  exit(1);
 }

 system("PAUSE");


}

arreglo::arreglo(const arreglo& others){
 max = others.max;
 array = new cursor[max];
 if(!array)
 {
  cout << "No Hay Memoria..." << endl;
  exit(1);
  }
   for (int i = 0; i <= max; i++)
        array[i] = others.array[i];
 system("PAUSE");

}

arreglo::~arreglo(){
if(array)
   delete []array;

}


bool arreglo::insertar(cursor y,int p){
	
	int pa;
	int x=p;
	if(isFull())
		return false;
	
  if (x==0){
	   for(int i=1;i<=max;i++)
	   if(array[i].getdata()==0){
	    x=i;
	    break;
	   }
	  
  }
	
	if (isEmpty()){
	 head=x;
	  array[x]=y;
	 return true;
   }
 


 if(recuperas(x)!=0)
   return false;
   
 
 if(anterior(x)==-1){
   head=x;
   pa=primero();
 
   array[x]=y;
   array[x].setnext(pa);
 
   return true;
   }
   else{
  
   array[x]=y;
   array[x].setnext(head);
   head=x;
   return true;
   }
}



bool arreglo::suprime(int p){
 int pa,ps;
 cursor a;
	if(isEmpty())
		return false;
	if (recuperas(p)==0)
      return false;
      
	else{
	  if(head==p)
      head=anterior(p);

    pa=array[p].getnext();	
    ps=siguiente(p);
	array[ps].setnext(pa);
	array[p]=array[0];
	return true;

 }
}
int arreglo::localiza(int x){
 if(isEmpty())
   return -1;
  
   for(int i=1;i<=max;i++)
	   if(x==array[i].getdata())
		   return i;
	   return -1;

}

int arreglo::recuperas(int p){
 if(isEmpty())
   return 0;
 return array[p].getdata();

}

cursor arreglo::recuperac(int p){
if (isEmpty())
  return array[p];
else
return array[p];

}

int arreglo::siguiente(int p){
   
	if(isEmpty())
		return -1;
	if (head==p)
		return max+1;
	for(int i=1;i<=max;i++){
		 if(p==array[i].getnext())
			 return i;
	}
         return -1;
}


int arreglo::anterior(int p){
    int w;
	cursor temp;

	if(isEmpty()){
		w=-1;
	}
	temp=recuperac(p);
	
	if(temp.getnext()!=-1){
        w=temp.getnext();
	}
	if(temp.getnext()==-1&&temp.getdata()!=0){
	    w=0;   
		
	}
		return w;
}


int arreglo::primero(){
 for(int i=1;i<=max;i++)
    if((array[i].getnext()==-1)&&(array[i].getdata()!=0))
       return i;
	return -1;
}


void arreglo::anula(){
	if(isFull())
		cout<<"vacia!!"<<endl;
	else{
	for(int i=1;i<=max;i++)
    array[i]=array[0];
    }

//return true;	
}

bool arreglo::isEmpty(){
int c=0;
for(int i=1;i<=max;i++){
      if(array[i].getdata()==0)
         c++;
}
	  if(c==max)
         return true;
	  else
         return false;
}



bool arreglo::isFull(){
int c=0;
for(int i=1;i<=max;i++){
      if(array[i].getdata()!=0)
         c++;
}
	  if(c==max)
         return true;
	  else
         return false;
}



void arreglo::print(){
  int temp=head;
 while(temp!=-2){
	 if(array[temp].getdata()!=0){ 
          array[temp].print();
          temp=anterior(temp);
        if(temp==primero()){
           array[temp].print();
           temp=-2;
		}
	 } 
 }
}

 void arreglo::print1()const{
int c=0;
  for(int i=1;i<=max;i++)
     if(array[i].getdata()!=0)
     array[i].print();
	else
		c++;
	if(c==max)
		cout<<"VACIA"<<endl;
	 
}

 void arreglo::print2(){
int c=0;
  for(int i=max;i>=1;i--)
     if(array[i].getdata()!=0)
     array[i].print();
	else
		c++;
	if(c==max)
		cout<<"VACIA"<<endl;
	 
}


 void arreglo::printarr(int x){
int c=0;
 
     if(array[x].getdata()!=0)
     array[x].print();
	else
		c++;
	if(c==max)
		cout<<"VACIA"<<endl;
	 
}