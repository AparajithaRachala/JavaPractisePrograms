#include <stdio.h>

struct Aparajitha{
	int UIN;
	char *subject1;
	char *lunch;
};

int main(void) {
	// your code goes here
	struct Aparajitha Nishanth={678851150,"Algorithms","Chicken"};

	printf("Nishanth subject is %c\n",Nishanth.subject1);
	printf("Nishanth lunchi is %c",Nishanth.lunch);


	return 0;
}
