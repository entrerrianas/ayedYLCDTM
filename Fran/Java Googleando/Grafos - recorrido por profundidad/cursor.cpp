 #include<iostream>
 #include <iomanip>
#include <string>
#include<cassert>
 #include "Cursor.h"
 using namespace std;

 
 cursor::cursor(){
 data=0;
 next=-1;
 pos='X';
 }
 
cursor::cursor(int a, char b,int c){
 data=a;
 next=c;
 pos=b;
 }

 cursor::cursor(const cursor& p){
 data=p.data;
 next=p.next;
 pos=p.pos;
 }
 
 char cursor::getpos(){
 return pos;
 }
 
 int cursor::getnext(){
 return next;
 }

 int cursor::getdata(){
 return data;
 }

 void cursor::setnext(int x){
 next=x;
 }

 void cursor::setdata(int a){
 data=a;
 }

 void cursor::setpos(char a){
 pos=a;
 }

 void cursor::print() const{
 cout<<"\t\t"<<data<<"\t\t"<<next<<"\t\t"<<pos<<endl;

 }