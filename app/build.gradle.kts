plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services") // Certifique-se de ter o plugin do Google Services
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        enable = true
    }
}

dependencies {
    // Dependências do AndroidX
    implementation("androidx.core:core-ktx:1.10.0")  // Verifique a versão mais recente
    implementation("androidx.appcompat:appcompat:1.6.1")  // Verifique a versão mais recente
    implementation("com.google.android.material:material:1.8.0")  // Material Components
    implementation("androidx.activity:activity-ktx:1.7.2")  // Verifique a versão mais recente
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")  // Verifique a versão mais recente

    // Firebase (usando Firebase BOM para versão gerenciada)
    implementation(platform("com.google.firebase:firebase-bom:32.0.0")) // Utilizando o BOM do Firebase

    // Dependências do Firebase
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-database")
    implementation("com.google.firebase:firebase-analytics-ktx")

    // Para usar o Firebase Firestore se necessário:
    // implementation("com.google.firebase:firebase-firestore")
}
