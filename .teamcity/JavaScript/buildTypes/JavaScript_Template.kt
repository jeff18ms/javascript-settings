package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_Template : Template({
    uuid = "ab6fd150-cdcd-404c-80a3-aa49c318c8ad"
    extId = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComJeff18msTeamcityCourseCards)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_7"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_8"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity --captureTimeout 100000"
        }
    }


})
