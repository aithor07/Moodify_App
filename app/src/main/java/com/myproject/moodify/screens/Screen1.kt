package com.myproject.moodify.screens



import android.annotation.SuppressLint
import android.widget.Button
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.myproject.moodify.R
import com.myproject.moodify.navigation.AppScreens
import kotlinx.coroutines.delay


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun QuoteCarousel() {
    val quotes = listOf(
        "Every memory deserves a melody.",
        "Let your moments sing.",
        "Feel the music, relive the moment.",
        "Songs capture what words can't.",
        "A tune for every time."
    )

    var currentIndex by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            currentIndex = (currentIndex + 1) % quotes.size
        }
    }

    AnimatedContent(
        targetState = quotes[currentIndex],
        transitionSpec = {
            fadeIn(animationSpec = tween(700)).togetherWith(fadeOut(animationSpec = tween(700)))
        }
    ) { quote ->
        Text(
            text = quote,
            fontFamily = MyFontFamily,
            fontSize = 34.sp,
            textAlign = TextAlign.Center,
            color = figmaOtherColor.copy(alpha = 0.85f),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
                .height(100.dp)
        )
    }
}



















val MyFontFamily = FontFamily(
    Font(R.font.moodifyfont, FontWeight.ExtraBold)
)

val figmaPrimaryColor = Color(0xFFA8C256)
val figmaSecondaryColor = Color.White
val figmaOtherColor = Color(0xFFE1C692)


@Composable
fun MoodifyTitle() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(0.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 0.dp)
        ) {
            Text(
                text = "Mood",
                fontFamily = MyFontFamily,
                fontSize = 60.sp,
                color = figmaPrimaryColor

            )

            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "Music Icon",
                modifier = Modifier.size(47.dp)
            )

            Text(
                text = "fy",
                fontFamily = MyFontFamily,
                fontSize = 60.sp,
                color = figmaPrimaryColor
            )
        }
    }
}








@Composable
fun LoginScreen(navController: NavController){
    Screen1Content(navController)
}


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun Screen1Content(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF655F80)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {

            // Contenido scrollable con botones incluidos
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(top = 32.dp, bottom = 32.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item { MoodifyTitle() }
                item { Spacer(modifier = Modifier.height(150.dp)) }
                item { QuoteCarousel() }
                item { Spacer(modifier = Modifier.height(160.dp)) }



                item{
                    Text("Create an account or log in into an\nexisting one",
                        fontFamily = MyFontFamily,
                        fontSize = 20.sp,
                        color = figmaOtherColor,
                        textAlign = TextAlign.Center)
                }

                item{ Spacer(modifier = Modifier.height(10.dp)) }
                item{
                    Button(onClick = { throw RuntimeException("Test crash")}){
                        Text("Test Crash")
                    }
                }


                item{ Spacer(modifier = Modifier.height(20.dp)) }


                item {
                    Button(
                        onClick = { navController.navigate(route = AppScreens.SecondScreen.route) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = figmaPrimaryColor,
                            contentColor = figmaSecondaryColor
                        )
                    ) {
                        Text("Log in", fontFamily = MyFontFamily)
                    }
                }
                item {
                    Button(
                        onClick = { navController.navigate(route = AppScreens.SecondScreen.route) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = figmaPrimaryColor,
                            contentColor = figmaSecondaryColor
                        )
                    ) {
                        Text("Sign up", fontFamily = MyFontFamily)
                    }
                }
            }
        }
    }
}















