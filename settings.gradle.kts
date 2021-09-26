rootProject.name = "shopping-cart"

plugins {
    `gradle-enterprise`
    id("nu.studer.build-scan.teamcity") version "1.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
