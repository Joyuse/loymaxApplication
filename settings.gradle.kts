pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LoymaxAndroidApplication"
include(":app")
include(":loymaxKotlinSdk-main")
include(":network")
include(":loymaxWhiteLabel")
include(":loymaxWhiteLabel:sarayProject")
include(":loymaxWhiteLabel:guliver")
include(":composecomponents")
