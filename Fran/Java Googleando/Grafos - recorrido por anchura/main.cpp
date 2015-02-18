#include "Cursorarray.h"
#include "Cursor.h"
#include "cola.h"
#include "console.h"
#include <iostream>
#include <ctime>
#include <string>
using namespace std;
using std::string;

char ** leer(int);
void print(char**, int);

void pone_cola(cursor,cola*);
void quita_cola(cola*);
void frente_cola(cola*);
void anula_cola(cola*);
int vacia_cola(cola*);
void print_cola(cola*);

int * recorrer(char **,int);
void print1(int*,int);
int * segunda(char**,cola*,int*,int);


int main(){
	//cursor x("ww");
int * ptr;
char** m;
int size=1;
while (size){
cout<<"Tama"<<static_cast<char>(164)<<"o: ";
cin>>size;
m=leer(size);
print(m,size);
ptr=recorrer(m,size);
print1(ptr,size);
print(m,size);
cout<<endl<<endl;
system("PAUSE");
clrscr();
}
return 0;
}


char ** leer(int t){
srand(time(0));
char** x=new char*[t];
for (int i=1;i<=t;i++)
 x[i]=new char[t];
 
 for ( i=1;i<=t;i++)
	 for (int j=1;j<=t;j++)
       if(rand()%11>7)
        x[i][j]='X';
	   else
	    x[i][j]=' ';

	   for ( i=1;i<=t;i++)
		   x[i][i]='0';
 return x;


}

void print(char** x, int t){
  for ( int i=0;i<=t;i++){
	       if(i>0)
		   cout<<static_cast<char>(64+i);
		   for (int j=0;j<=t;j++){
			   if(i==0 ){
				   if(i==j)
		            cout<<"  ";
				   if(j>0)
                cout<<static_cast<char>(64+j)<<" ";
			   }
			   if(i>0 && j>0 )
				  if(i==j)
					  cout<<" "<<" ";
				  else
				   cout<<" "<<x[i][j];
			    

			   
		   }

  cout<<endl;
  }
}

void print1(int* Q,int h){
       cout<<"************************RECORRIDO DE UN GRAFO *************************"<<endl<<endl;
	 for(int i=1;i<=h;i++)
		 cout<<static_cast<char>(64+Q[i])<<"  ";
	 cout<<endl<<endl;


}

///////////////////////////////////PILA///////////////////////////////////////////////////////
    
void pone_cola(cursor y, cola* t){
/*clrscr();
cout<<"\n\t\t\tPONE COLA\n\n"<<endl;
cursor x("asd");
cursor y("hola");
cursor z("adios");
t->pone_en_cola(x);
cout<<"\n";
t->pone_en_cola(y);
cout<<"\n";*/
t->pone_en_cola(y);
//cout<<"\n";

//t->print();
system ("PAUSE");//3
}


void quita_cola(cola* t){
/*clrscr();
cout<<"\n\t\t\tQUITA COLA\n\n"<<endl;
cout<<"\n"<<endl;*/
t->quita_de_cola();
//t->print();
system ("PAUSE");//2


}


void frente_cola(cola* t){

clrscr();
cout<<"\n\t\t\tFRENTE \n\n"<<endl;
t->frente();

system ("PAUSE");//1

}


void anula_cola(cola* c){
clrscr();
cout<<"\n\t\t\tANULA \n\n"<<endl;
c->anula();
system ("PAUSE");

}

int vacia_cola(cola* c){
/*clrscr();
cout<<"\n\t\t\tVACIA \n\n"<<endl;*/
 return c->vacia();
//system ("PAUSE");

}

void print_cola(cola* t){
clrscr();
	
cout<<"\n\t\t\tIMPRIME COLA\n\n"<<endl;
t->print1();
system ("PAUSE");

}
//////////////////////////////////////////////////////////////////////////////////////////////
int * recorrer(char **A,int n){
	char h;
	int z;
	cout<<"el nodo a empezar: ";
	cin>>h;
    z=static_cast<int>(h)-64;
    int c=1;
    int e=0,k=0;
	int* r=new int[n];
	for (int i=1;i<=n;i++)
		r[i]=0;

  cola* t=new cola;
  cursor x;

  for(int v=1;v<=n;v++){
	for(int j=1;j<=n;j++){
	     if(A[z][z]=='0'){
	       x.setdata(v); 
			 pone_cola(x,t);
			 A[v][j]='/';
	        r[c]=v;
			c++;
			j++;
		 } 
         if(A[v][j]=='X' && A[j][j]!='/'){
			 v=j;
			  x.setdata(v); 
			  pone_cola(x,t);
			  A[v][j]='/';
	          r[c]=v;
			  c++;
			 j=0;
		}

		 if (j==n){
			 if(!vacia_cola(t)){
			   v=t->frente();
			   quita_cola(t);
			   j=0;

			 } 
		     else{
               e=1;
 			  break;
			 }
		 }

	}//for j
	if(e)
		 break;
  }//for vertice

 if(e)
	 r=segunda(A,t,r,n);

return r;

}
        


int * segunda(char ** X,cola* p, int* r, int s){
     int k=0,a=0;
	 cursor x;
      int i=0; 
	  int c;
      for(i=1;i<=s;i++)
		  if(r[i]==0){
			  c=i;
			  break;
		  }
	for(i=1;i<=s;i++)
		if(X[i][i]=='0')
         k++;
        
		if(k){
			k=1;
			for(int v=1;v<=s;v++){
			  for(int j=1;j<=s;j++){
				  //	cout<<"w";
				  while(X[k][k]=='/' && !a){
					   k++;
					  if(X[k][k]=='0'){
					       v=k;
						   x.setdata(v);
						   pone_cola(x,p);
			               X[v][v]='/';
	                       r[c]=v;
			               c++;
			               j=0;
						 a=1;
					  }
					  if(k==s){
					   a=-1;
					   break;
					  }
				  
				  }//while
		               
		 if(X[v][j]=='X' && X[j][j]!='/' && a>0){
			 v=j;
			  x.setdata(v); 
			  pone_cola(x,p);
			  X[v][j]='/';
	          r[c]=v;
			  c++;
			 j=0;
		}

		 if (j==s && a>0){
			 if(!vacia_cola(p)){
			   v=p->frente();
			   quita_cola(p);
			   j=0;

			 } 
		     else{
               a=0;
			 }
		 }
		
			  }//for v
			  }//for j

		}//if
        
		return r;
}