plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.saray"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.saray"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
        kotlinCompilerVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.lifecycle.runtime.compose.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(project(":loymaxKotlinSdk-main"))
    implementation(project(":network"))
    implementation(project(":composecomponents"))

    implementation( "com.squareup.moshi:moshi-kotlin:1.13.0")
    implementation( "com.squareup.moshi:moshi-adapters:1.13.0")
    implementation( "com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation( "com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")

    // DI
    implementation("io.insert-koin:koin-core:3.2.2")
    implementation("io.insert-koin:koin-android:3.2.3")
    implementation("io.insert-koin:koin-core-ext:3.0.1")
    implementation("io.insert-koin:koin-androidx-compose:3.2.2")

    // NAVIGATION
    implementation("androidx.navigation:navigation-compose:2.7.7")

    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")

    //SplashScreen
    implementation("androidx.core:core-splashscreen:1.2.0-alpha01")

    //Material
    implementation(libs.material)
    implementation("androidx.compose.material3:material3:1.2.1")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("com.google.accompanist:accompanist-glide:0.15.0")
    //Coil
    implementation("com.google.accompanist:accompanist-coil:0.15.0")

    //googleMaps
    implementation("com.google.android.gms:play-services-maps:18.0.2")
    implementation("com.google.maps.android:maps-compose:2.1.1")
}