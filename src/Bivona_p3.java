import java.util.Scanner;
public class Bivona_p3 {

		final static int numTopics=5;
		final static int numRatings=10;
		static Scanner scan = new Scanner (System.in);  
		public static void main(String[] args) {
			String topic[]={"Counter Strike Global Offense","Call of Duty: Modern Warefare","League of Legends","Overwatch","Destiny 2"};
			int ratings[][]=new int[5][10];
			Userscan(topic,ratings);
			System.out.println("\n\nRatings are:\n\n");
			Tabulo(topic,ratings);
			System.out.println("");
			high(topic, ratings);
			low(topic, ratings);
		}

		private static void Userscan(String[] topic, int[][] ratings) {
			for(int i=0;i<numTopics;i++) {
				for(int j=0;j<numRatings;j++)
				{
					System.out.print("Enter the " +(j+1)+ " rating for the topic '"+topic[i]+"' :");
					ratings[i][j]=scan.nextInt();
				}
				System.out.println("");
			}
		}

		private static void Tabulo(String[] topic, int[][] ratings) {
			double avg;
			String format = "%1$-20s|%2$-10d%3$-10d%4$-10d%5$-10d%6$-10d%7$-10d%8$-10d%9$-10d%10$-10d" + "%11$-10d|%12$-10.2f\n";
			String format1 = "%1$-20s%2$-10s%3$105s\n";
			System.out.format(format1,"Topic","Ratings","Average Rating");
			for(int i = 0;i < numTopics; i++) {
				avg=Avg(ratings[i]);
				System.out.format(format, topic[i], ratings[i][0], ratings[i][1], ratings[i][2], ratings[i][3], ratings[i][4], ratings[i][5], ratings[i][6], ratings[i][7], ratings[i][8], ratings[i][9],avg);
			}
		}
		private static void high(String[] topic,int[][] ratings) {
			int maxPoint = Sum(ratings[0]);
			int point;
			int maxIndex = 0;
			for(int i = 0; i < numTopics;i++) {
				point=Sum(ratings[i]);
				if(point > maxPoint){
					maxPoint = point;
					maxIndex = i;
				}
			}
			System.out.println("The top rated topic is "+ topic[maxIndex] + " and total rating is " + maxPoint ); 
		}
		private static void low(String[] topic,int[][] ratings){
			int minPoint = Sum(ratings[0]);
			int point;
			int minIndex = 0;
			for(int i = 0; i < numTopics; i++){
				point=Sum(ratings[i]);
				if(point < minPoint){
					minPoint = point;
					minIndex = i;
				}
			}
			System.out.println("The top rated topic is " + topic[minIndex] + " and total rating is " + minPoint );  
		}
		private static double Avg(int[] rating) {
			return Sum(rating) / (double)rating.length;
		}  
		private static int Sum(int []rating){
			int sum = 0;
			for(int i = 0; i < rating.length; i++)
				sum += rating[i];
			return sum;
			}
}
