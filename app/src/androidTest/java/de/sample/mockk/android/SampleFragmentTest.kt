package de.sample.mockk.android

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import de.sample.mockk.R
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test

class SampleFragmentTest {

    @MockK
    private lateinit var sampleViewModel: SampleViewModel

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @Test
    fun should_show_the_headline() {
        // GIVEN
        launchFragmentInContainer<SampleFragment>(themeResId = R.style.AppTheme)

        // THEN
        onView(withId(R.id.headline_textview)).check(matches(withText("Hello World")))
    }
}
