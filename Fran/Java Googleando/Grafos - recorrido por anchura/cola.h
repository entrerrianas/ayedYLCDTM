#ifndef cola_h
#define cola_h
#include "Cursor.h"
#include "cursorarray.h"

class cola : public arreglo//
{
 public:
        cola();
        ~cola();
        void anula();
        int  frente();
        void pone_en_cola(cursor);
        void quita_de_cola();
        bool vacia();
        void printC();
};
#endif
