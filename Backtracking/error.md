Executing tasks: [iosSimulatorArm64Test] in project /Users/krystsinakurytsyna/skill-up/common

> Task :buildSrc:compileKotlin UP-TO-DATE
> Task :buildSrc:compileJava NO-SOURCE
> Task :buildSrc:compileGroovy NO-SOURCE
> Task :buildSrc:pluginDescriptors UP-TO-DATE
> Task :buildSrc:processResources NO-SOURCE
> Task :buildSrc:classes UP-TO-DATE
> Task :buildSrc:inspectClassesForKotlinIC UP-TO-DATE
> Task :buildSrc:jar UP-TO-DATE
> Task :buildSrc:assemble UP-TO-DATE
> Task :buildSrc:compileTestKotlin NO-SOURCE
> Task :buildSrc:pluginUnderTestMetadata UP-TO-DATE
> Task :buildSrc:compileTestJava NO-SOURCE
> Task :buildSrc:compileTestGroovy NO-SOURCE
> Task :buildSrc:processTestResources NO-SOURCE
> Task :buildSrc:testClasses UP-TO-DATE
> Task :buildSrc:test NO-SOURCE
> Task :buildSrc:validatePlugins UP-TO-DATE
> Task :buildSrc:check UP-TO-DATE
> Task :buildSrc:build UP-TO-DATE
> Configure project :android
AGPBI: {"kind":"warning","text":"BuildType(staging): buildConfigField 'BASE_URL' value is being replaced.","sources":[{}]}
AGPBI: {"kind":"warning","text":"BuildType(signedDebug): buildConfigField 'BASE_URL' value is being replaced.","sources":[{}]}
> Configure project :common
Kotlin Multiplatform Projects are an Alpha feature. See: https://kotlinlang.org/docs/reference/evolution/components-stability.html. To hide this message, add 'kotlin.mpp.stability.nowarn=true' to the Gradle properties.
Dependency on pods requires cocoapods-generate plugin to be installed.
If you plan to add dependencies on third party pods, don't forget to install it by executing 'gem install cocoapods-generate' in terminal.
A compileOnly dependency is used in the Kotlin/Native target 'iosArm64':
Compilation: main
Dependencies:
org.jetbrains.kotlinx:atomicfu:0.16.1
Such dependencies are not applicable for Kotlin/Native, consider changing the dependency type to 'implementation' or 'api'.
To disable this warning, set the kotlin.native.ignoreIncorrectDependencies=true project property
A compileOnly dependency is used in the Kotlin/Native target 'iosX64':
Compilation: main
Dependencies:
org.jetbrains.kotlinx:atomicfu:0.16.1
Such dependencies are not applicable for Kotlin/Native, consider changing the dependency type to 'implementation' or 'api'.
To disable this warning, set the kotlin.native.ignoreIncorrectDependencies=true project property
A compileOnly dependency is used in the Kotlin/Native target 'iosSimulatorArm64':
Compilation: main
Dependencies:
org.jetbrains.kotlinx:atomicfu:0.16.1
Such dependencies are not applicable for Kotlin/Native, consider changing the dependency type to 'implementation' or 'api'.
To disable this warning, set the kotlin.native.ignoreIncorrectDependencies=true project property
> Task :common:compileKotlinIosSimulatorArm64
w: /Users/krystsinakurytsyna/skill-up/common/src/iosMain/kotlin/com/daftgrowth/skillup/utils/BlockingUtilities.kt: (8, 53): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
> Task :common:iosSimulatorArm64ProcessResources NO-SOURCE
> Task :common:iosSimulatorArm64MainKlibrary
> Task :common:compileTestKotlinIosSimulatorArm64
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/mock/MockDataSource.kt: (7, 105): Unchecked cast: Any? to Response
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/mock/login/StorageMock.kt: (8, 60): Unchecked cast: Any? to T?
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/Utils.kt: (25, 2): This class can only be used with the compiler argument '-opt-in=kotlin.RequiresOptIn'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/Utils.kt: (45, 5): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/Utils.kt: (50, 2): This class can only be used with the compiler argument '-opt-in=kotlin.RequiresOptIn'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/Utils.kt: (56, 2): This class can only be used with the compiler argument '-opt-in=kotlin.RequiresOptIn'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (17, 80): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (23, 84): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (30, 64): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (36, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (36, 75): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (44, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/network/ktor/ErrorMapperTest.kt: (44, 93): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/book/view/BookMiddlewareTest.kt: (49, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/book/view/BookMiddlewareTest.kt: (62, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/loading/LoadingReducerTest.kt: (11, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/loading/LoadingReducerTest.kt: (17, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/loading/LoadingReducerTest.kt: (23, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/loading/LoadingReducerTest.kt: (29, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/loading/LoadingReducerTest.kt: (35, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/navigation/DestinationTabsTest.kt: (26, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/navigation/DestinationTabsTest.kt: (45, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/navigation/view/TabNavigationMiddlewareTest.kt: (52, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/navigation/view/TabNavigationMiddlewareTest.kt: (63, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/path/SkillPathTest.kt: (25, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/path/SkillPathTest.kt: (45, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/path/logic/SkillPathsReducerTest.kt: (54, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/PlaybackSynchronizerTest.kt: (24, 2): This class can only be used with the compiler argument '-opt-in=kotlin.RequiresOptIn'
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (62, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (68, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (74, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (80, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (107, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (113, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (119, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/logic/PlaybackSystemMiddlewareTest.kt: (142, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/view/PlayerMiddlewareTest.kt: (33, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/view/PlayerMiddlewareTest.kt: (45, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/view/PlayerMiddlewareTest.kt: (57, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/player/view/PlayerMiddlewareTest.kt: (69, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/request/DataSourceExecutableRequestFactoryTest.kt: (43, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/request/DataSourceExecutableRequestFactoryTest.kt: (52, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (18, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (24, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (29, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (34, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (39, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (44, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/user/view/ProfileMiddlewareTest.kt: (49, 9): Name contains illegal characters: "()". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/utils/AppStateUtilsTest.kt: (29, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/redux/utils/AppStateUtilsTest.kt: (70, 9): Name contains illegal characters: ",". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/subscription/SubscriptionProductTest.kt: (10, 9): Name contains illegal characters: "%". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/subscription/SubscriptionProductTest.kt: (18, 9): Name contains illegal characters: "%". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/subscription/SubscriptionProductTest.kt: (25, 9): Name contains illegal characters: "%". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/subscription/SubscriptionProductTest.kt: (32, 9): Name contains illegal characters: "%". This will become an error in Kotlin 1.7
w: /Users/krystsinakurytsyna/skill-up/common/src/commonTest/kotlin/com/daftgrowth/skillup/validation/form/FieldTest.kt: (21, 2): This class can only be used with the compiler argument '-opt-in=kotlin.RequiresOptIn'
> Task :common:linkDebugTestIosSimulatorArm64
w: Cached libraries will not be used with experimental memory model
> Task :common:iosSimulatorArm64Test
An error was encountered processing the command (domain=NSPOSIXErrorDomain, code=86):
The operation couldn’t be completed. Bad CPU type in executable
Bad CPU type in executable
> Task :common:iosSimulatorArm64Test FAILED
FAILURE: Build failed with an exception.
* What went wrong:
Execution failed for task ':common:iosSimulatorArm64Test'.
> command '/usr/bin/xcrun' exited with errors (exit code: 86)
* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
* Get more help at https://help.gradle.org
Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/7.0.2/userguide/command_line_interface.html#sec:command_line_warnings
BUILD FAILED in 1m 44s
4 actionable tasks: 4 executed
16:04:50: Task execution finished 'iosSimulatorArm64Test'.
