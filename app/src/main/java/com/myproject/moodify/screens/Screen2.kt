package com.myproject.moodify.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.myproject.moodify.R
import com.myproject.moodify.navigation.AppScreens


const val buildDate = "23/05/2025"




@Composable
fun LogOrRegisterScreen(navController: NavController){
    Content(navController)
}








@Composable
fun Content(navController: NavController) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }




    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF655F80)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item { Spacer(Modifier.height(30.dp)) }

            item {
                MoodifyTitle()
            }

            item { Spacer(Modifier.height(40.dp)) }

            item {
                Box(modifier = Modifier
                    .fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "generic avatar image",
                        modifier = Modifier.size(150.dp)
                            .align(Alignment.Center)


                    )
                }
            }


            item{ Spacer(modifier = Modifier.height(50.dp))}

            item {
                Box(modifier = Modifier.fillMaxWidth()) {

                    Text("Username",
                        fontFamily = MyFontFamily,
                        color = figmaOtherColor,
                        modifier = Modifier.align(Alignment.Center))


                }
            }



            item{Spacer(modifier = Modifier.height(10.dp))}



            item{


                Box(
                    modifier = Modifier.fillMaxWidth()

                ){

                    OutlinedTextField(


                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Type here", fontFamily = MyFontFamily, color = figmaOtherColor) },
                        modifier = Modifier.align(Alignment.Center)
                    )
                }










                }
            item{ Spacer(modifier = Modifier.height(50.dp))}

            item{
                Box(


                    modifier = Modifier.fillMaxWidth()

                ){


                    Text("Password", fontFamily = MyFontFamily, color = figmaOtherColor, modifier = Modifier.align(Alignment.Center))

                }
            }
            item{Spacer(modifier = Modifier.height(10.dp))}



            item{
                Box(modifier = Modifier.fillMaxWidth()){



                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Type here", fontFamily = MyFontFamily, color = figmaOtherColor) },
                        modifier = Modifier.align(Alignment.Center),
                        visualTransformation = PasswordVisualTransformation()
                    )


                }
            }

            item{ Spacer(modifier = Modifier.height(50.dp))}



            item{



                Box(

                    modifier = Modifier.fillMaxWidth()
                ){

                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.align(Alignment.Center),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = figmaPrimaryColor,
                            contentColor = figmaSecondaryColor,

                        )
                    ){
                        Text("Submit", fontFamily = MyFontFamily)
                    }



                }



            }

            item{ Spacer(modifier = Modifier.height(130.dp))}



            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp) // Padding opcional para separar del borde
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.BottomStart)
                    ) {
                        Text(
                            "Prototype build $buildDate",
                            fontFamily = MyFontFamily,
                            color = figmaOtherColor
                        )
                        Text(
                            "Made by Aithor",
                            fontFamily = MyFontFamily,
                            color = figmaOtherColor
                        )
                    }

                    Button(
                        onClick = { navController.navigate(route = AppScreens.FirstScreen.route) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = figmaPrimaryColor,
                            contentColor = figmaSecondaryColor
                        ),
                        modifier = Modifier.align(Alignment.BottomEnd)
                    ) {
                        Text("Back", fontFamily = MyFontFamily, color = figmaOtherColor)
                    }
                }
            }






        }

        }
    }









