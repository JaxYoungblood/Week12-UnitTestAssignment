import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoTest {
	private TestDemo testDemo;

	@BeforeEach
	void setUp() {
		testDemo = new TestDemo();
	}// end METHOD setUp

@ParameterizedTest
@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, Boolean expectException) {

//GIVEN: two integers

		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} // end IF
		else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		} // end ELSE

//WHEN: method adds them together

//THEN: the sum of the integers is added

//AND: throw and exception if an int is <=0

	}// end METHOD assertThatTwoPositiveNumbersAreAddedCorrectly

	static Stream<Arguments> argumentsForAddPositive() {
		// @formatter:off
	    return Stream.of(
	        arguments(2, 4, 6, false),
	        arguments(1, 2, 3, false),
	        arguments(-1, 2, 1, true),
	        arguments(1, -2, 1, true),
	        arguments(0, 1, 1, true),
	        arguments(1, 0, 1, true),
	        arguments(0, 0, 0, true)
	    );
	    // @formatter:on
	}// end STREAM

@Test
	void assertThatNumberSquaredIsCorrect() {

		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();

		int fiveSquared = mockDemo.randomNumberSquared();
		
		assertThat(fiveSquared).isEqualTo(25);
		
	}// end TEST assertThatNumberSquaredIsCorrect


}// end CLASS
