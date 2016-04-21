import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Testing numbers to their text conversion
 */
public class NumbersToTextTest {
   @Test
   /**
    * Given a NumbersToText
    * when a number is zero
    * Then text is 'zero'
    */
   public void numberIsZeroTextIsZero(){
      //Arrange

      //Act
      String textNumber = NumbersToText.toText(0);
      //Assert
      assertThat(textNumber, is("zero"));
   }
   @Test
   /**
    * Given a NumbersToText
    * When a number is 28
    * Then text is 'twenty eight'
    */
   public void numberIsTwentyEightTextIsTwentyEight(){
      //Arrange

      //Act
      String textNumber = NumbersToText.toText(28);

      //Assert
      assertThat(textNumber, is("twenty eight"));
   }
   @Test
   /**
    * Given a NumbersToText
    * When a number is 35
    * THen text is 'Thirty Five'
    */
   public void numberIsThirtyFiveTextIsThirtyFive(){
      //Arrange

      //Act
      String textNumber = NumbersToText.toText(35);

      //Assert
      assertThat(textNumber, is("thirty five"));

   }

   @Test
   /**
    * Given a NumbersToText
    * When a number is 49
    * Then text is 'forty nine'
    */

public void numberIsFortyNineTextIsFortyNine(){
      //Arrange

      //Act
      String textNumber = NumbersToText.toText(49);

      //Assert
      assertThat(textNumber, is("forty nine"));

   }

   @Test
   public void numberIs73TextIsSeventyThree(){
      //Arrange

      //Act
      String textNumber = NumbersToText.toText(73);

      //Assert
      assertThat(textNumber, is("seventy three"));

   }

}
