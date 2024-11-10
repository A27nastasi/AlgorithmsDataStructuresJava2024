package LinkedList;

public class Final {
    public static void main(String[] args) {
        final ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4))); 
        final ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4))); 

        Solution solution = new Solution();
        final ListNode mergedList = solution.mergeTwoLists(list1, list2); 

        System.out.print("Merged List: ");
        printList(mergedList);

        // Приклад 2: обидва списки порожні
        ListNode emptyList1 = null;
        ListNode emptyList2 = null;
        ListNode mergedEmptyList = solution.mergeTwoLists(emptyList1, emptyList2);
        System.out.print("Merged List: ");
        printList(mergedEmptyList);

        // Приклад 3: один список порожній
        ListNode nullList = null;
        final ListNode singleElementList = new ListNode(0);
        ListNode mergedSingleList = solution.mergeTwoLists(nullList, singleElementList);
        System.out.print("Merged List: ");
        printList(mergedSingleList);
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
