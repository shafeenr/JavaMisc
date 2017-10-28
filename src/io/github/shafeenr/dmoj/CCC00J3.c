#include <stdio.h>

int main(void)
{
    int coinsLeft, machineOne, machineTwo, machineThree, count;

    scanf("%d", &coinsLeft);
    scanf("%d", &machineOne);
    scanf("%d", &machineTwo);
    scanf("%d", &machineThree);

    while (coinsLeft != 0) {
        machineOne++;
        coinsLeft--;
        count++;
        if (machineOne == 35) {
            coinsLeft += 30;
            machineOne = 0;
        }

        machineTwo++;
        coinsLeft--;
        count++;
        if (machineTwo == 100) {
            coinsLeft += 60;
            machineTwo = 0;
        }
        
        machineThree++;
        coinsLeft--;
        count++;
        if (machineThree == 10) {
            coinsLeft += 9;
            machineThree = 0;
        }
    }

    printf("Martha plays %d times before going broke.", count);
}