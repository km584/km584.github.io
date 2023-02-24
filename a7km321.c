/*
 * This program will translate number into Japanese word
 * Kairi Tanaka
 * 2/4/22
*/

#include <stdio.h>
#define ZERO 0
#define LIMIT 10000

int main(){
    //instance variables
    int x = ZERO;
    int one = 0;
    int ten = 0;
    int hudred = 0;
    int thousand = 0;
    
    //for loop until reach to 9999
    for(x=1; x < LIMIT; x++){
        //take out number into one digit
        int one = (x / 1) % 10;
        int ten = (x / 10) % 10;
        int hundred = (x / 100) % 10;
        int thousand = (x / 1000) % 10;
        printf("%i", x);
        printf(" = ");

        //set thousand place
        switch(thousand){
            case 1:
                printf("sen ");
                break;
            case 2:
                printf("nisen ");
                break;
            case 3:
                printf("sanzen ");
                break;
            case 4:
                printf("yonsen ");
                break;
            case 5:
                printf("gosen ");
                break;
            case 6:
                printf("rokusen ");
                break;
            case 7:
                printf("nanasen ");
                break;
            case 8:
                printf("hassen ");
                break;
            case 9:
                printf("kyuusen ");
                break;
            default:
                printf("");
                break;
        }

        //set hundred place
        switch(hundred){
            case 1:
                printf("hyaku ");
                break;
            case 2:
                printf("nihyaku ");
                break;
            case 3:
                printf("sanbyaku ");
                break;
            case 4:
                printf("yonhyaku ");
                break;
            case 5:
                printf("gohyaku ");
                break;
            case 6:
                printf("roppyaku ");
                break;
            case 7:
                printf("nanahyaku ");
                break;
            case 8:
                printf("happyaku ");
                break;
            case 9:
                printf("kyuuhyaku ");
                break;
            default:
                printf("");
                break;
        }

        //set ten place
        switch(ten){
            case 1:
                printf("juu ");
                break;
            case 2:
                printf("nijuu ");
                break;
            case 3:
                printf("sanjuu ");
                break;
            case 4:
                printf("yonjuu ");
                break;
            case 5:
                printf("gojuu ");
                break;
            case 6:
                printf("rokujuu ");
                break;
            case 7:
                printf("nanajuu ");
                break;
            case 8:
                printf("hachijuu ");
                break;
            case 9:
                printf("kyuujuu ");
                break;
            default:
                printf("");
                break;
        }

        //set one place
        switch(one){
            case 1:
                puts("ichi");
                break;
            case 2:
                puts("ni");
                break;
            case 3:
                puts("san");
                break;
            case 4:
                puts("yon");
                break;
            case 5:
                puts("go");
                break;
            case 6:
                puts("roku");
                break;
            case 7:
                puts("nana");
                break;
            case 8:
                puts("hachi");
                break;
            case 9:
                puts("kyuu");
                break;
            default:
                puts("");
                break;
            }
    }
    return 0;
}
