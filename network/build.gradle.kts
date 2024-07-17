plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.network"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.foundation.android)
//    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation( "com.squareup.moshi:moshi-kotlin:1.13.0")
    implementation( "com.squareup.moshi:moshi-adapters:1.13.0")
    implementation( "com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation( "com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation(project(":loymaxKotlinSdk-main"))

    //SDK implementation loymax SDK https://github.com/semdelion/loymaxKotlinSdk

    // DI
    implementation("io.insert-koin:koin-core:3.2.2")
    implementation("io.insert-koin:koin-android:3.2.3")
    implementation("io.insert-koin:koin-core-ext:3.0.1")
    implementation("io.insert-koin:koin-androidx-compose:3.2.2")
}