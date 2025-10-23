package com.myproject.moodify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.myproject.moodify.navigation.AppNavigation
import com.myproject.moodify.navigation.AppScreens
import com.myproject.moodify.ui.theme.MoodifyTheme

class MainActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        enableEdgeToEdge()
        setContent {
            MoodifyTheme {
                AppNavigation()

            }
        }
    }


    fun onStart(navController: NavController) {
        super.onStart()
        val currentUser: FirebaseUser? = auth.currentUser
        if (currentUser != null) {
            //Navegar a la pagina principal de la app que se
        // encuentra detras del inicio de sesion directamente
            navController.navigate(route = AppScreens.ThirdScreen.route)

        }
    }




}

