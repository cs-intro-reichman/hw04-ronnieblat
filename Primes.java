public class Primes {
    public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
boolean [] arr= new boolean[n+1];
for (int i=2; i<arr.length;i++)
    arr[i]=true;
int p=2;
System.out.println("Prime numbers up to "+ n +":");
while (p<=Math.sqrt(n)){
    for (int i=p+1;i<n+1;i++){
        if (i%p==0 && arr[i])
            arr[i]=false;
    }
    p++;
    while (!arr[p] && p<=Math.sqrt(n))
        p++;
}
int counter=0;
for (int i=0;i<n+1;i++){
    if (arr[i]){
        counter++;
        System.out.println(i);
    }
}
int precentage= (int)(((double )(counter)/n)*100);
System.out.println("There are "+counter+ " primes between 2 and "+n+ " ("+precentage+"% are primes)");
}
}