package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "99375fd9-94f8-4474-a548-9fc5575a9fda"
    extId = "JavaScript_03DeployToStaging"
    name = "03. Deploy To Staging Trigger"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComJeff18msTeamcityCourseCards)

    }
    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_7"
            scriptContent = """
rmdir /S /Q \inetpub\www
xcopy /S /I /Y app \inetpub\www\
            """
        }
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03Firefox) {
            snapshot {
            }
        }

    }
    triggers {
        vcs {
            id = "vcsTrigger"
            perCheckinTriggering = true
        }
    }
})
