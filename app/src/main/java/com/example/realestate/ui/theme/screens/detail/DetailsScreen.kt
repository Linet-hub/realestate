package com.example.realestate.ui.theme.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.ui.theme.Lavender
import com.example.realestate.ui.theme.Purple40
import com.example.realestate.ui.theme.PurpleGrey40
import com.example.realestate.ui.theme.darkergrey
import com.example.realestate.ui.theme.lightpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(lightpurple)
    ) {

        TopAppBar(
            title = { Text(text = "MagicBricks", fontFamily = FontFamily.Cursive, fontSize = 40.sp, color = (darkergrey)) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Lavender),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.Black )
                    
                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications", tint = Color.Black )

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Call, contentDescription = "Call", tint = Color.Black )

                }
            }

            )

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
            contentAlignment = Alignment.Center) {

            Image(painter = painterResource(id = R.drawable.homeimage9) ,
                contentDescription ="home",
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text ="Choose your best property.",
                fontSize = 30.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        //search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search =it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = { Text(text = "What's your location?") }
        )
        //end of search bar

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())
        ) {
            //card1
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp) ){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.homeimage4) ,
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            //end of card1
            Spacer(modifier = Modifier.width(20.dp))

            //card2

            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp) ){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.homeimage5) ,
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            //end of card2
            Spacer(modifier = Modifier.width(20.dp))
            //card3

            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp) ){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.homeimage6) ,
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            //end of card 3
            Spacer(modifier = Modifier.width(20.dp))
            //card4

            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp) ){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.homeimage7) ,
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            //end of card4
            Spacer(modifier = Modifier.width(20.dp))
            //card5
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp) ){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.homeimage8) ,
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }

            //end of card5



        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navController.navigate(ROUT_PROPERTY)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(20.dp)

        ) {
            Text(text = "Continue")

        }






    }



}



@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}