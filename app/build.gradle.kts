plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.dagger.hilt)
    kotlin("kapt")
}

android {
    namespace = "com.example.nbcsporsassignmentapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.nbcsporsassignmentapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "com.example.nbcsporsassignmentapp.HiltTestRunner"
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
    packaging {
        resources.excludes.add("META-INF/LICENSE.md")
        resources.excludes.add("META-INF/LICENSE-notice.md")
        resources.excludes.add("MANIFEST.MF")
    }
    testOptions {
        packaging {
            jniLibs {
                useLegacyPackaging = true
            }
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Hilt
    implementation("com.google.dagger:hilt-android:2.49")
    implementation(libs.androidx.runner)
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    // ViewModel and LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.2")

    implementation("com.google.code.gson:gson:2.8.8")

    implementation("androidx.fragment:fragment-ktx:1.8.0")

    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0")

    testImplementation(libs.junit)
    testImplementation("io.mockk:mockk:1.13.11")
    testImplementation("androidx.arch.core:core-testing:2.2.0")

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation("androidx.arch.core:core-testing:2.2.0")
    //androidTestImplementation("androidx.test.espresso:espresso-contrib:3.6.0")

    androidTestImplementation("io.mockk:mockk-android:1.13.11")
    androidTestImplementation("io.mockk:mockk-agent:1.13.11")
    debugImplementation("androidx.fragment:fragment-testing:1.8.0")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.43.2")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.48")
}

kapt {
    correctErrorTypes = true
}