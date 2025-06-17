//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product>list = new ArrayList<>();

        System.out.println("Enter the no. of product: ");
        int n = sc.nextInt();

        for(int i = 0;i < n;i++){
            System.out.println("Enter the id of product: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of product: ");
            String name = sc.nextLine();
            System.out.println("Enter the category of product: ");
            String category = sc.nextLine();

            Product obj = new Product(id, name, category);
            list.add(obj);
        }

        System.out.println("Enter the id you want to search: ");
        int id = sc.nextInt();

        System.out.println(Linear(id, list));
        System.out.println(Binary(id, list));
    }

    public static Boolean Linear(int id, ArrayList<Product> arr){
        int n = arr.size();
        for(int i = 0;i < n;i++){
            if(arr.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    /*
    Explain Big O notation and how it helps in analyzing algorithms.
    => Big O notation describes the upper limit of an algorithm's running time as input grows. It helps compare algorithms by focusing on performance trends, not exact time, especially for large inputs. It shows how scalable an algorithm is.

	Describe the best, average, and worst-case scenarios for search operations.
	=>Best case is when the element is found immediately, taking minimal time. Average case assumes the element is somewhere in the middle. Worst case means searching the entire input if the element is last or not present, taking maximum time.
     */

    public static Boolean Binary(int id, ArrayList<Product> arr){
        int n = arr.size();
        int low = 0;
        int high = n-1;
        Collections.sort(arr, (a, b) -> a.getId() - b.getId());

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr.get(mid).getId() == id) return true;
            else if(arr.get(mid).getId() > id){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return false;
    }

    /*
    Compare the time complexity of linear and binary search algorithms.
    => Linear search has O(n) time complexity as it checks each element one by one. Binary search is faster with O(log n) but only works on sorted data. So, binary search is more efficient for large, sorted lists.

    Discuss which algorithm is more suitable for your platform and why.
    => If the data on my platform is unsorted or changes frequently, linear search is more suitable due to simplicity. But if the data is sorted and large, binary search is better as it reduces search time significantly using divide-and-conquer.
     */

    /*
    OUTPUT:
    Enter the no. of product:
    5
    Enter the id of product:
    1
    Enter the name of product:
    one
    Enter the category of product:
    number
    Enter the id of product:
    2
    Enter the name of product:
    two
    Enter the category of product:
    number
    Enter the id of product:
    3
    Enter the name of product:
    three
    Enter the category of product:
    number
    Enter the id of product:
    4
    Enter the name of product:
    four
    Enter the category of product:
    number
    Enter the id of product:
    5
    Enter the name of product:
    five
    Enter the category of product:
    number
    Enter the id you want to search:
    4
    true
    true
     */
}