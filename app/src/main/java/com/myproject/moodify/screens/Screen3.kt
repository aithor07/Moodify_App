package com.myproject.moodify.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.myproject.moodify.R
import com.myproject.moodify.screens.MyFontFamily







@Composable
fun Screen3(navController: NavController){
    Screen3Content(navController)
}









@Composable
fun Screen3Content(navController: NavController){


    Surface(modifier = Modifier.fillMaxSize(), color = figmaOtherColor) {



        LazyColumn(

            modifier = Modifier.fillMaxSize()
        ){


            item {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().fillParentMaxHeight()) {



                    Box(

                        modifier = Modifier.wrapContentSize()




                    ){
                        Text(text = "Work in progress!", textAlign = TextAlign.Center, fontFamily = MyFontFamily, fontSize = 150.sp)




                    }














                }
            }

        }





    }






}


















