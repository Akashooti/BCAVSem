Class Fclass
{
String nameofclass,nameofstaff;
int noofstds;
Fclass(String noc,String nos,int numstd)
{
nameofclass=noc;
nameofstaff=nos;
noofstds=numstd;
}
void display()
{
System.out.print(nameofclass+"\t"+nameofstaff+"\t"+noofstds);
}
}
class Firstyear
{
public static void main(String args[])
{
Fclass std[]=new Fclass[3];
std[0]=new Fclass("\n BCA","MANJUNATH BALLULI\t",139);
std[1]=new Fclass("\n BBA","PRASHANTH BABU\t\t",110);
std[2]=new Fclass("\n BCom","GURU Prasad BABU\t",100);
System.out.print("Course \t Staff\t\t\t Number of Students");
for(int i=0;i<3;i++)
std[i].display();
}
}
