package lab8;
import static lab8.ListItem.*;
//TA:  Make sure you use correct spacing and better naming conventions next time, 3/3


/**
 * Holds a number in a linked list structure.
 * 
 * Philip I. Thomas
 * @version 1.0
 * CSE131 Lab 8
 * Date: 26 March 2012
 */

public class ListItem {
	int number;
	ListItem next;

	/**
	 * Creates a single list item.
	 * @param number the value to be held in the item
	 * @param next a reference to the next item in the list
	 */
	ListItem(int number, ListItem next) {
		this.number = number;
		this.next   = next;
	}

	/**
	 * Return a copy of this list using recursion.  No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact -- this method must not mutate anything.
	 * @return
	 */
	public ListItem duplicate() {
		ListItem duplicated = new ListItem(this.number, duplicate(this.next));
		return duplicated;

	}
	/**
	 * Helper method to duplicate() that recursively builds the list
	 * @param nextItem
	 * @return
	 */
	//TA: This is more of a helper method than an overloaded method, so it would be less confusing if you used a distinguishing name
	public ListItem duplicate(ListItem nextItem) {
		if (nextItem == null) {return null;}
		else {
			ListItem duplicated = new ListItem(nextItem.number, duplicate(nextItem.next));
			return duplicated;
		}
	}
	/**
	 * Recursively compute the number of elements in the list. No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact.
	 * @return
	 */
	public int length() {
		int i = 1; // Initiates a counter
		return this.length(this.next,i);

	}
	/**
	 * Helper method to length() that recursively checks list length
	 * @param nextItem
	 * @param i
	 * @return
	 */
	//TA: See above about name
	public int length(ListItem nextItem, int i) {
		if (nextItem==null) {return i;}
		else
		{
			i++;
			return nextItem.length(nextItem.next,i);
		}
	}

	/**
	 * Return a new list, like duplicate(), but every element
	 * appears n times instead of once.  See the web page for details.
	 * You must do this method iteratively.  No credit
	 * if you use any recursion!
	 * @param n a positive (never 0) number specifying how many times to copy each element
	 * @return
	 */

	public ListItem stretch(int n) {
		// INITIALIZE
		ListItem prev;
		ListItem current;
		ListItem source;
		ListItem start = new ListItem(this.number,null); // Initializes first item.
		if (n>1) {source = this;}
		else {source =this.next;}
		current = new ListItem(source.number,null);
		start.next=current;
		prev = start;
		for (int i = 2; i<n; i++) {
			prev=current;
			current = new ListItem(source.number,null);
			prev.next=current;
		}
		while (source.next!=null) {
			source=source.next;

			for (int i = 0; i<n; i++) {
				prev=current;
				current = new ListItem(source.number,null);
				prev.next=current;


			}

		}
		return start;
	}

	/**
	 * Return the first ListItem, looking from "this" forward,
	 * that contains the specified number.  No lists should be
	 * modified as a result of this call.  You may do this recursively
	 * or iteratively, as you like.
	 * @param n
	 * @return
	 */

	public ListItem find(int n) {
		return find(this,n);

	}
	/**
	 * Recursive helper method for finding the value n in a list
	 * @param check
	 * @param n
	 * @return
	 */
	public ListItem find(ListItem check, int n) { 
		if (check.number ==n) {return check;}
		if (check.next == null) {return null;}
		else {return find(check.next,n);}
	}

	public static ListItem pairwiseSum(ListItem l1, ListItem l2) {
		if (l1.next == null) {
			return new ListItem(l1.number+l2.number,null);
		}
		else {
			return new ListItem(l1.number+l2.number,pairwiseSum(l1.next,l2.next));
		}

	}

	/**
	 * Return the maximum number contained in the list
	 * from this point forward.  No lists should be modified
	 * as a result of this call.  You may do this method recursively
	 * or iteratively,as you like.
	 * @return
	 */

	public int max() {
		return max(this,this.number);
	}
	/**
	 * Helper method to max(). Recursively checks max of list.
	 * @param test
	 * @param max
	 * @return
	 */
	public int max(ListItem test, int max) {
		if (test.number > max) {max = test.number;}
		if (test.next == null) {return max;}
		else {return max(test.next,max);}
	}


	/**
	 * Returns a copy of the list beginning at ls, but containing
	 * only elements that are even.
	 * @param ls
	 * @return
	 */
	//TA:  Make sure you use correct spacing (eclipse can do this automatically for you)
	public static ListItem evenElements(ListItem ls) {
		if (ls== null)
			return ls;
		else
		{if (ls.number%2==0) { return new ListItem(ls.number,evenElements(ls.next)); }
		else
		{
			return evenElements(ls.next);
		}
		}
	}


	/**
	 * Returns a string representation of the values reachable from
	 * this list item.  Values appear in the same order as the occur in
	 * the linked structure.  Leave this method alone so our testing will work
	 * properly.
	 */
	public String toString() {
		if (next == null)
			return ("" + number);
		else
			return (number + " " + next); // calls next.toString() implicitly
	}
	public ListItem smallElements(int n) {
		if (this.next == null) {
			if (this.number>n) {
				return null;
			}
			else
				return new ListItem(this.number,null);
		}
		else {
			if (this.number>n) {
				return this.next.smallElements(n);

			}
			else {
				return new ListItem(this.number,this.next.smallElements(n));			

			}		
		}
	}
	public static ListItem scale(ListItem ls, int n) {
		if (ls.next!=null) {
			return new ListItem(ls.number*n,scale(ls.next,n));
		}
		else
			return new ListItem(ls.number*n,null);
	}
	public static ListItem insertAfter(ListItem ls, int i, int j) {
		if (ls.next!=null) {
			if (ls.number!=j) {
				return new ListItem(ls.number,insertAfter(ls.next,i,j));
			}
			else
				return new ListItem(j,new ListItem(i, insertAfter(ls.next,i,j)));
		}
		else {
			if (ls.number!=j) {
				return new ListItem(ls.number,null);
			}
			else
				return new ListItem(j,new ListItem(i, null));
		}
	}
}