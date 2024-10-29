package com.example.scanpharma

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scanpharma.ui.theme.ScanPharmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        // Navegação dos botões pelas telas
        val entrarButton: Button = findViewById(R.id.EntrarButton)
        entrarButton.setOnClickListener {
            setContentView(R.layout.main_screen)

            val logoutButton: Button = findViewById(R.id.LogoutButton)
            logoutButton.setOnClickListener {
                setContentView(R.layout.main_activity)
            }

            val bulasButton: Button = findViewById(R.id.BulasButton)
            bulasButton.setOnClickListener {
                setContentView(R.layout.bula)
            }

            val perfilRedirectButton: Button = findViewById(R.id.PerfilRedirectButton)
            perfilRedirectButton.setOnClickListener {
                setContentView(R.layout.perfil)
            }
        }
    }
}



