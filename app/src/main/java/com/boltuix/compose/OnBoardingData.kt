package com.boltuix.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

data class OnBoardingData(val image: Int, val title: String, val desc: String)



@Composable
fun LoaderIntro(modifier: Modifier, image: Int) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(image))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        //progress = { progress },
        modifier = modifier
    )
}
