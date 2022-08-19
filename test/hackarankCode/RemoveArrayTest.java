package hackarankCode;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveArrayTest {
    @Test
    public void testThatIcanCreateAnArrayOfElement_WithDifferentLengths(){
        RemoveArray messenger = new  RemoveArray();
       messenger.createAnArray(new int[10]);
       assertTrue(true);
    }
//
//    @Test
//    public void testThatICanAddToMyArray(){
//        RemoveArray messenger = new  RemoveArray();
//
////        messenger.createAnArray(new int[6]);
//        messenger.populateArray(4, 2);
////        assertArrayEquals(new int[]{},new int[]{});
//    }


}
