

package lab8;

import static org.junit.Assert.*;

import org.junit.Test;

import static lab8.ListItem.*;

public class ListItemTestExtension1 {


	private ListItem testOne =
			new ListItem(3,
					new ListItem(2,
							new ListItem(6,
									new ListItem(9, null)
									)
							)
					);
	private ListItem testTwo =
			new ListItem(3,
					new ListItem(1,
							new ListItem(4,
									new ListItem(5, null)
									)
							)
					);

	private ListItem testAdd =
			new ListItem(6,
					new ListItem(3,
							new ListItem(10,
									new ListItem(14, null)
									)
							)
					);
	private ListItem testSmallElements10 = 
			new ListItem(6,new ListItem(3,null));

	@Test
	public void testPairwiseSum() {
		ListItem testAddEd;
		testAddEd = new ListItem(testOne.number+testTwo.number,pairwiseSum(testOne.next,testTwo.next));
		assertEquals(testAdd.toString(),testAddEd.toString());

	}
	@Test
	public void testSmallElements() {

		assertEquals(testAdd.smallElements(9).toString(),testSmallElements10.toString());

	}
	@Test
	public void testScale() {
		ListItem correct = new ListItem(12,new ListItem(6,null));
		assertEquals(correct.toString(), scale(testSmallElements10,2).toString());
	}

	@Test
	public void testInsertAfter() {
		ListItem correct = new ListItem(6,new ListItem(4,new ListItem(3,null)));
		assertEquals(correct.toString(), insertAfter(testSmallElements10,4,6).toString());
	}
}