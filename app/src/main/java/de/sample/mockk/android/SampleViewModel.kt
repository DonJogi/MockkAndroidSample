package de.sample.mockk.android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    val headline = MutableLiveData("Hello World")
}
