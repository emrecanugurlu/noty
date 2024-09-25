package com.cn.noty.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cn.noty.ui.theme.robotoBlackFamily
import com.cn.noty.ui.theme.robotoMediumFamily
import com.cn.noty.ui.theme.robotoSmallFamily

@Composable
fun SingUpPage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                modifier = Modifier.padding(bottom = 2.dp),
                text = "Hoş Geldiniz",
                fontFamily = robotoBlackFamily,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(height = 3.dp))
            Text(
                fontSize = 15.sp,
                text = "Bizimle yeni bir yolculuk!",
                fontFamily = robotoMediumFamily,
            )
        }

        Column {
            TextField(value = "e-mail", onValueChange = {},modifier = Modifier.size(width =280.dp, height = 60.dp))
            Spacer(modifier = Modifier.padding(bottom = 10.dp))
            TextField(value = "password", onValueChange = {},modifier = Modifier.size(width =280.dp, height = 60.dp))
            Spacer(modifier = Modifier.padding(bottom = 10.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.size(width =280.dp, height = 50.dp), shape = RoundedCornerShape(4), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFCBF49), contentColor = Color.Black)) {
                Text(text = "Kaydol")
            }
        }

        Column {
            BasicText(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 14.sp, color = Color.Black, fontFamily = robotoSmallFamily)) {
                        append("Hesabın var mı?")
                    }
                    append("  ")
                    withStyle(style = SpanStyle(fontSize = 15.sp, color = Color.Black, fontFamily = robotoMediumFamily)) {
                        append("Giriş Yap")
                    }
                }
            )
        }

    }
}