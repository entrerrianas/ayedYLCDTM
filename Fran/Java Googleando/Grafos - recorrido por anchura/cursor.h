#ifndef Cursor_H
#define Cursor_H
#include <string>
using std::string;

class cursor{
  int data;
  int next;
  char pos;
public:
 cursor();
 cursor(int, char='*',int=-1);
 cursor(const cursor &);
 char getpos();
 int getnext();
 int getdata();
 void setnext(int);
 void setdata(int);
 void setpos(char);
 void print() const;
};
#endif