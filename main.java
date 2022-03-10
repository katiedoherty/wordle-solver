


import java.io.FileNotFoundException;
import java.util.*;



public class main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc= new Scanner(System.in);
		String input1="";
		String numbers ="";
		
		List<String> list = new ArrayList<String>();

		for(int i=0; i<6; i++) {
			for(int j =0; j<1; j++) {
			input1=sc.nextLine();
			numbers=sc.nextLine();}
			answer(input1,numbers, list);
			
		}
		sc.close();
		
		}
			
	
 
 public static void answer(String input1, String numbers, List<String> list) throws FileNotFoundException {
	 
	 
	 
	 
	 
	 String greencharacters="";
	 String yellowcharacters="";
	 String greycharacters="";
	 List<Integer> greencharactersarray = new ArrayList<Integer>();
	 List<Integer> yellowcharactersarray = new ArrayList<Integer>();
	
 int indexval=0;
 String indexvalues="";
 String tempvalue=input1;
 String charval ="";
 String indexvaluesyellow="";
 int tempindex=0;
 int tempindexval=0;

 
 	for(int i =0; i<input1.length(); i++) {
 		if(numbers.charAt(i)=='0') {
 			greycharacters = greycharacters+String.valueOf(input1.charAt(i));
 		}
 		else if(numbers.charAt(i)=='1') {
 			yellowcharacters = yellowcharacters+String.valueOf(input1.charAt(i));
 			indexval = input1.indexOf(String.valueOf(input1.charAt(i)));
 			if(indexval==tempindex&&tempindex!=0) {
 				indexval=indexval+1;
 			}
 			yellowcharactersarray.add(indexval);
 			indexvaluesyellow=indexvaluesyellow+String.valueOf(indexval);
 			tempindex=indexval;
 		}
 		else if(numbers.charAt(i)=='2') {
 			greencharacters = greencharacters+String.valueOf(input1.charAt(i));
 			indexval = i;
 			
 			
 			if(indexval==tempindex&&tempindex!=0) {
 				indexval=indexval+1;
 			}
 			greencharactersarray.add(indexval);
 			indexvalues=indexvalues+String.valueOf(indexval);
 			tempindex=indexval;
 		}
 			}
 	
 	
 	checkcharacters(greencharacters, yellowcharacters, greycharacters, input1, indexvalues, indexvaluesyellow, list, greencharactersarray, yellowcharactersarray);
 	
 	greencharactersarray.clear();
 	yellowcharactersarray.clear();
	 
 	}
 
 public static void checkcharacters(String greencharacters, String yellowcharacters, String greycharacters, String input1, String indexvalues, String indexvaluesyellow, List <String> list, List <Integer> greencharactersarray, List <Integer> yellowcharactersarray) throws FileNotFoundException {
 
Dictionary wordcheckobject = new Dictionary();
String array [] =wordcheckobject.makenewarray();
List<String> templist = new ArrayList<String>();

int count =0;
String str ="";
String indexvalues2="";
int indexval=0;
String temp ="";
String yellowsentence="";
String best="";
String str1="";
String str2="";
String noyelloworgreen="";
String greysentence ="";
String tempbestword="";
int tempindex=0;
int count1=0;
int yellowcount=0;
String temp1 ="";
String yellowindexs="";


	if(list.isEmpty()) {
	for(int i =0; i<array.length; i++) {
		for(int j =0; j<array[i].length(); j++) {
			if(greencharacters!="") {
			for(int n =0; n<greencharacters.length(); n++) {
				if(j==greencharactersarray.get(n)&&array[i].charAt(j)==greencharacters.charAt(n)) {
					//indexval = array[i].indexOf(String.valueOf(array[i].charAt(j)));
					count1=count1+1;
					
				
				}
						}
		}
		}
		
		if(count1==greencharacters.length()&&greencharacters.length()!=0) {
			str=array[i];
		}
		count1=0;
		
		
indexvalues2 ="";
temp=str;
	if(str!="") {
		for(int n =0; n<str.length(); n++) {
			for(int g =0; g<greencharacters.length(); g++) {
				if(str.charAt(n)==greencharacters.charAt(g)&&n==greencharactersarray.get(g)) {
					temp = temp.replaceFirst(String.valueOf(str.charAt(n)), "");
					
					}
						}
							}
							}
	
	
	
	
	
	if(str!="") {
	
		for(int k=0; k<temp.length(); k++) {
		for(int m=0; m<yellowcharacters.length(); m++) {
		
			if(temp.contains(String.valueOf(yellowcharacters.charAt(m)))&&array[i].indexOf(yellowcharacters.charAt(m))!=yellowcharactersarray.get(m)) {
				yellowsentence = yellowsentence+String.valueOf(yellowcharacters.charAt(m));
				temp = temp.replaceFirst(String.valueOf(yellowcharacters.charAt(m)), "");
				
				
			}
		}
		}
		
		
	
	}else {
		
		
			temp1=array[i];
			
		
			for(int k=0; k<array[i].length(); k++) {
			for(int m=0; m<yellowcharacters.length(); m++) {
				//System.out.println(k);
				if(temp1.contains(String.valueOf(yellowcharacters.charAt(m)))&&array[i].indexOf(yellowcharacters.charAt(m))!=yellowcharactersarray.get(m)) {
					yellowsentence = yellowsentence+String.valueOf(yellowcharacters.charAt(m));
					temp1 = temp1.replaceFirst(String.valueOf(yellowcharacters.charAt(m)), "");
					
					//System.out.println(array[i].indexOf(yellowcharacters.charAt(m)));
				
				}
			}
			
		}
	}
	
	
	
	if(yellowsentence.length()==yellowcharacters.length()&&yellowsentence!="") {
		for(int y=0; y<yellowcharacters.length(); y++) {
			if(yellowcharacters.charAt(y)==yellowsentence.charAt(y)) {
				yellowcount=yellowcount+1;
				
				
				
			}
			else {
				yellowcount=0;
			}
		}}
	
	if(str!="") {
		for(int y=0; y<greycharacters.length();y++) {
			if(temp.contains(String.valueOf(greycharacters.charAt(y)))) {
				count=count+1;	
			}
		}
	}
	else {
		for(int y=0; y<greycharacters.length();y++) {
			if(temp1.contains(String.valueOf(greycharacters.charAt(y)))) {
				count=count+1;	
			}
		}
	}
	//System.out.println(yellowcount);
	if(yellowcount==yellowcharacters.length()&&greencharacters==""&&count==0) {
		str2=array[i];
	}
	else if(yellowcount==yellowcharacters.length()&&str!=""&&count==0) {
		str1=array[i];
	}
	
	//System.out.println(str2);

	
	
	
	
	
	if(yellowcharacters!=""&&greencharacters!=""&&count==0&&yellowcount==yellowcharacters.length()&&str!="") {
		best=str1;
		
	}
	else if(yellowcharacters==""&&greencharacters!=""&&count==0&&str!="") {
		best=str;
		
	}
	else if(yellowcharacters!="" &&count==0&&greencharacters==""&&yellowcount==yellowcharacters.length()) {
		best=str2;
		
	}
	else if(greencharacters!=""&&yellowcharacters==""&&count==0&&str!="") {
		best=str;
		
	}
	
	
	if(best!=""&&tempbestword!=best) {
		//list.add(best);
		templist.add(best);
	}
	
	tempbestword=best;
	
	best="";
	
	
	yellowsentence ="";
	
	temp="";
	count=0;
	str="";
	str1="";
	str2="";
	yellowcount=0;
	
	}
	
	}
	else {
		

		/*for(int i =0; i<list.size(); i++) {
			templist.add(list.get(i));
		}*/
		
		for(int i =0; i<list.size(); i++) {
			for(int j =0; j<list.get(i).length(); j++) {
				if(greencharacters!="") {
				for(int n =0; n<greencharacters.length(); n++) {
					if(j==greencharactersarray.get(n)&&list.get(i).charAt(j)==greencharacters.charAt(n)) {
						//indexval = array[i].indexOf(String.valueOf(array[i].charAt(j)));
						count1=count1+1;
						
					
					}
							}
			}
			}
			
			if(count1==greencharacters.length()&&greencharacters.length()!=0) {
				str=list.get(i);
			}
			count1=0;
			
			
	indexvalues2 ="";
	temp=str;
		if(str!="") {
			for(int n =0; n<str.length(); n++) {
				for(int g =0; g<greencharacters.length(); g++) {
					if(str.charAt(n)==greencharacters.charAt(g)&&n==greencharactersarray.get(g)) {
						temp = temp.replaceFirst(String.valueOf(str.charAt(n)), "");
						
						}
							}
								}
								}
		
		
		
		
		if(str!="") {
		
			for(int k=0; k<temp.length(); k++) {
			for(int m=0; m<yellowcharacters.length(); m++) {
			
				if(temp.contains(String.valueOf(yellowcharacters.charAt(m)))&&list.get(i).indexOf(yellowcharacters.charAt(m))!=yellowcharactersarray.get(m)) {
					yellowsentence = yellowsentence+String.valueOf(yellowcharacters.charAt(m));
					temp = temp.replaceFirst(String.valueOf(yellowcharacters.charAt(m)), "");
					
					
				}
			}
			}
			
			
		
		}else {
			
			
				temp1=list.get(i);
				
			
				for(int k=0; k<list.get(i).length(); k++) {
				for(int m=0; m<yellowcharacters.length(); m++) {
					//System.out.println(k);
					if(temp1.contains(String.valueOf(yellowcharacters.charAt(m)))&&list.get(i).indexOf(yellowcharacters.charAt(m))!=yellowcharactersarray.get(m)) {
						yellowsentence = yellowsentence+String.valueOf(yellowcharacters.charAt(m));
						temp1 = temp1.replaceFirst(String.valueOf(yellowcharacters.charAt(m)), "");
					
					}
				}
				
			}
		}
		
		if(yellowsentence.length()==yellowcharacters.length()&&yellowsentence!="") {
			for(int y=0; y<yellowcharacters.length(); y++) {
				if(yellowcharacters.charAt(y)==yellowsentence.charAt(y)) {
					yellowcount=yellowcount+1;
					
					
				}
				else {
					yellowcount=0;
				}
			}}
		
		if(str!="") {
			for(int y=0; y<greycharacters.length();y++) {
				if(temp.contains(String.valueOf(greycharacters.charAt(y)))) {
					count=count+1;	
				}
			}
		}
		else {
			for(int y=0; y<greycharacters.length();y++) {
				if(temp1.contains(String.valueOf(greycharacters.charAt(y)))) {
					count=count+1;	
				}
			}
		}
		
		
		if(yellowcount==yellowcharacters.length()&&greencharacters==""&&count==0) {
			str2=list.get(i);
		}
		else if(yellowcount==yellowcharacters.length()&&str!=""&&count==0) {
			str1=list.get(i);
		}
		
		

		
		
		
		
		if(yellowcharacters!=""&&greencharacters!=""&&count==0&&yellowcount==yellowcharacters.length()&&str!="") {
			best=str1;
			
		}
		else if(yellowcharacters==""&&greencharacters!=""&&count==0&&str!="") {
			best=str;
			
		}
		else if(yellowcharacters!="" &&count==0&&greencharacters==""&&yellowcount==yellowcharacters.length()) {
			best=str2;
			
		}
		else if(greencharacters!=""&&yellowcharacters==""&&count==0&&str!="") {
			best=str;
			
		}
		
		if(best!=""&&tempbestword!=best) {
			templist.add(best);
		}
		
		tempbestword=best;
		
		best="";
		
		
		yellowsentence ="";
		
		temp="";
		count=0;
		str="";
		str1="";
		str2="";
		yellowcount=0;
		
		}
	}
	
	
	
String guess="";    
	
	
	guess=randomelementanswer(templist);
	
	
	System.out.println("best guess:"+guess);
	
	
	
	System.out.println("list of other possible words: "+templist);
	for(int i =0; i<templist.size(); i++) {
		list.add(templist.get(i));
	}
	list.remove(guess);
	
	templist.removeAll(templist);
	
 
}

public static List<String> makealistofwordsguessed(String best, List<String> list) {
	list.add(best);
	 return list;
 }
 
 public static boolean checkifwordisguessed(String str, String str1, String str2, List<String> list) {
	 int yes=0;
	 for(int t=0; t<list.size(); t++) {
			if(list.get(t)==str||list.get(t)==str1||list.get(t)==str2) {
				yes=1;
			}
			
		}
	 
	 if(yes==1) {
		 return true;
	 }
	 else {return false;}
	 
 }
 
 public static List<String> removeusedword(String worst, List<String> list){
	 list.remove(worst);
	 return list;
 }
 
 public static String randomelementanswer(List <String> list) {
	    Random r = new Random();

	    int randomitem = r.nextInt(list.size());
	    String randomElement = list.get(randomitem);
	    return randomElement;
 }
 
 
 }