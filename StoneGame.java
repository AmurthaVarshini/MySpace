public class StoneGame   
{  
    private int solve(int j, int[] nums)  
    {  
        // size of the array  
        int size = nums.length;  
          
        // handling the base case  
        if(j >= size)  
        {  
            return 0;  
        }  
        // if we pick only one stone  
        int one = Integer.MIN_VALUE;  
        // if we pick two stones  
        int two = Integer.MIN_VALUE;  
        // if we pick three stones  
        int three = Integer.MIN_VALUE;  
        // picked one stone and performing the   
        // further computation  
        one = nums[j] - solve(j + 1, nums);  
        if((j + 1) < size)  
        {  
            // picked two stones at a time and performing   
            // the further computation  
            two = nums[j] + nums[j + 1] - solve(j + 2, nums);  
        }  
        if((j + 2) < size)  
        {  
            // picked 3 stones at a time and performing the further  
            // computation  
            three = nums[j] + nums[j + 1] + nums[j + 2] - solve(j + 3, nums);  
        }  
        // picking the maximum between one, two and three  
        return Math.max(one, Math.max(two, three));  
    }  
    public int stoneGameSol(int[] stoneVal)   
    {  
        int ans = solve(0, stoneVal);  
        if(ans == 0)  
        {  
            // 0 means its a tie  
            return 0;  
        }  
        if(ans > 0)  
        {  
            // 1 means player 1 wins the game  
            return 1;  
        }  
        // 2 means player 2 wins the game  
        return 2;  
    }  
    // main method  
public static void main(String[] argvs)   
{  
// creating an object of the class StoneGame  
StoneGame obj = new StoneGame();  
// input 1  
int arr[] = {4, 3, 9, 16};  
int size = arr.length;  
System.out.println("For the stones of the following values: ");  
for(int i = 0; i < size; i++)  
{  
    System.out.print(arr[i] + " ");  
}  
System.out.println();  
int ans = obj.stoneGameSol(arr);  
if(ans == 0)  
{  
System.out.println("It is a tie between player 1 and player 2");  
}  
else if(ans == 1)  
{  
System.out.println("Player 1 wins the game.");  
}  
else   
{  
System.out.println("Player 2 wins the game.");  
}  
System.out.println();  
// input 2  
int arr1[] = {8, -1, -1, 7};  
size = arr1.length;  
System.out.println("For the stones of the following values: ");  
for(int i = 0; i < size; i++)  
{  
    System.out.print(arr1[i] + " ");  
}  
System.out.println();  
ans = obj.stoneGameSol(arr1);  
if(ans == 0)  
{  
System.out.println("It is a tie between player 1 and player 2");  
}  
else if(ans == 1)  
{  
System.out.println("Player 1 wins the game.");  
}  
else   
{  
System.out.println("Player 2 wins the game.");  
}  
System.out.println();  
// input 3  
int arr2[] = {-7, 2, 6, 3};  
size = arr2.length;  
System.out.println("For the stones of the following values: ");  
for(int i = 0; i < size; i++)  
{  
    System.out.print(arr2[i] + " ");  
}  
System.out.println();  
ans = obj.stoneGameSol(arr2);  
if(ans == 0)  
{  
System.out.println("It is a tie between player 1 and player 2");  
}  
else if(ans == 1)  
{  
System.out.println("Player 1 wins the game.");  
}  
else   
{  
System.out.println("Player 2 wins the game.");  
}  
System.out.println();  
// input 4  
int arr3[] = {1, 2, 0, 3, 6, 7, 4};  
size = arr3.length;  
System.out.println("For the stones of the following values: ");  
for(int i = 0; i < size; i++)  
{  
    System.out.print(arr3[i] + " ");  
}  
System.out.println();  
ans = obj.stoneGameSol(arr3);  
if(ans == 0)  
{  
System.out.println("It is a tie between player 1 and player 2");  
}  
else if(ans == 1)  
{  
System.out.println("Player 1 wins the game.");  
}  
else   
{  
System.out.println("Player 2 wins the game.");  
}  
}  
}
