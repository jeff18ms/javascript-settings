package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.HttpsGithubComJeff18msJavascriptSettingsGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "51bd0840-9c90-4587-900b-b3cda847677c"
    extId = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"
    description = "My JS Project"
    vcsRoot(HttpsGithubComJeff18msJavascriptSettingsGit)
    vcsRoot(JavaScript_HttpsGithubComJeff18msTeamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)
    buildType(JavaScript_03Firefox)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = HttpsGithubComJeff18msJavascriptSettingsGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
