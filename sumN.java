public class sum{
public static void main(String[] args){
int N=1234;
int i;
int sum;
sum=0;
for(i=0;i<=3;i++){
int a=N%10;
 sum=sum+a;
N=N/10;
}
System.out.println(sum);
}
}
