#include<stdio.h>

int main(void) {
    int king = 1;
    int queen = 1;
    int rook = 2;
    int bishop = 2;
    int knight = 2;
    int pawn = 8;

    int fking, fqueen, frook, fbishop, fknight, fpawn;

    scanf("%d %d %d %d %d %d", &fking, &fqueen, &frook ,&fbishop, &fknight, &fpawn);

    printf("%d %d %d %d %d %d", king - fking, queen - fqueen, rook - frook, bishop - fbishop, knight - fknight, pawn - fpawn);

    return 0;
}