package LinkedList;

public class Final {
    public static void main(String[] args) {
        
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

      
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        
        System.out.print("Merged List: ");
        printList(mergedList); 

        // Приклад 2: обидва списки порожні
        list1 = null;
        list2 = null;
        mergedList = solution.mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList); 

        // Приклад 3: один список порожній
        list1 = null;
        list2 = new ListNode(0);
        mergedList = solution.mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList);
    }

    // Метод для виведення списку
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

