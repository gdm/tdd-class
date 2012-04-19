package com.xebia.university.tdd;

import com.xebia.university.tdd.enigma.Enigma;
import com.xebia.university.tdd.enigma.EnigmaTransformer;
import com.xebia.university.tdd.enigma.Rotor;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.internal.matchers.TypeSafeMatcher;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

/**
 * Shows a some things demoed and discussed ad hoc
 *
 * @author iwein
 */
public class TestDrive {

  @Test
  public void customMatchers() throws Exception {
    EnigmaTransformer transformer = mock(EnigmaTransformer.class);
    Rotor rotor = new Rotor("asdflkjasdag", Enigma.realAlphabet, transformer);



    givenPreparedRotor(rotor);



    //assertThat(rotor, transforms(5).to(2));

    await().atMost(5, SECONDS).until(somethingCoolHappened(rotor));
  }

  private void givenPreparedRotor(Rotor rotor) {
    given(rotor.rotate(any(Integer.class))).willReturn(rotor);
  }

  private Callable<Boolean> somethingCoolHappened(final Rotor rotor) {
    return new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        System.out.println("Called");
        return rotor.transform(5) == 3;
      }
    };
  }


  private RotorMatcherBuilder transforms(int from) {
    return new RotorMatcherBuilder(from);
  }

  private static class RotorMatcherBuilder {

    private final int from;

    public RotorMatcherBuilder(int from) {
      this.from = from;
    }

    public Matcher<Rotor> to(final int to) {
      return new TypeSafeMatcher<Rotor>() {
        @Override
        public boolean matchesSafely(Rotor rotor) {
          return rotor.transform(from) == to;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void describeTo(Description description) {
          description.appendText("A rotor transforming to " + to);
        }
      };
    }
  }
}
