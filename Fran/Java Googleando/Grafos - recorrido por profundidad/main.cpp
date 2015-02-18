#include "Cursorarray.h"
#include "Cursor.h"
#include "pila.h"
#include "console.h"
#include <iostream>
#include <ctime>
#include <string>
using namespace std;
using std::string;

char ** leer(int);
void print(char**, int);

void tope_p(pila*);
void mete_p(cursor,pila*);
void print_p(pila*);
void saca_p(pila*);
void anula_p(pila*);
int vacia_p(pila*);


int * recorrer(char **,int);
void print1(int*,int);
int * segunda(char**,pila*,int*,int);


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
void tope_p(pila* p){
	p->Tope();

}


void mete_p(cursor t,pila* r){
//clrscr();
//cout<<"\n\t\t\tMETE\n\n"<<endl;
r->Mete(t);
/*cout<<"\n";
r->Mete(a);
cout<<"\n";
r->Mete(b);
cout<<"\n";
r->Mete(c);
cout<<"\n";
system ("PAUSE");
*/
}



void print_p(pila* p){

cout<<"\n\t\t\tIMPRIME PILA\n\n"<<endl;
p->printp();
system ("PAUSE");

}

void saca_p(pila* p){
p->Saca();

}


void anula_p(pila* p){
cout<<"\n\t\t\tANULA PILA\n\n"<<endl;
p->Anula();
system ("PAUSE");

}

int vacia_p(pila* p){
return p->Vacia();

}
//////////////////////////////////////////////////////////////////////////////////////////////
int * recorrer(char **A,int n){
    int c=1;
    int e=0,k=0;
	int* r=new int[n];
	for (int i=1;i<=n;i++)
		r[i]=0;

  pila* t=new pila;
  cursor x;

  for(int v=1;v<=n;v++){
	for(int j=1;j<=n;j++){
	     if(A[1][1]=='0'){
	       x.setdata(v); 
			 mete_p(x,t);
			 A[v][j]='/';
	        r[c]=v;
			c++;
			j++;
		 } 
         if(A[v][j]=='X' && A[j][j]!='/'){
			 v=j;
			  x.setdata(v); 
			  mete_p(x,t);
			  A[v][j]='/';
	          r[c]=v;
			  c++;
			 j=0;
		}

		 if (j==n){
			 if(!vacia_p(t)){
			   v=t->Tope();
			   saca_p(t);
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
        


int * segunda(char ** X,pila* p, int* r, int s){
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
						   mete_p(x,p);
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
			  mete_p(x,p);
			  X[v][j]='/';
	          r[c]=v;
			  c++;
			 j=0;
		}

		 if (j==s && a>0){
			 if(!vacia_p(p)){
			   v=p->Tope();
			   saca_p(p);
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





