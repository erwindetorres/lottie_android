# lottie_android

How this project was created.
1. Create new android project, use androidx (artifact)
2. Add libraries you are commonly using
3. Add lottie library -> http://airbnb.io/lottie/#/android
4. When using with ButterKnife, add this on your app level build.gradle
```
compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
```
Latest ButterKnife as of this writing is 10.1.0
```
implementation 'com.jakewharton:butterknife:10.1.0'
annotationProcessor 'com.jakewharton:butterknife-compiler:10.1.0'
```

5. Download lottie animation json file here -> https://lottiefiles.com/featured
6. Implement LottieAnimationView
