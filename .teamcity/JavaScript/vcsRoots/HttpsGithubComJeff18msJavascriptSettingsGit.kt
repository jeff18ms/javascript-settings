package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComJeff18msJavascriptSettingsGit : GitVcsRoot({
    uuid = "647738b3-870e-44d8-bb4e-56d75a3bb8de"
    extId = "HttpsGithubComJeff18msJavascriptSettingsGit"
    name = "https://github.com/jeff18ms/javascript-settings.git"
    url = "https://github.com/jeff18ms/javascript-settings.git"
    authMethod = password {
        userName = "jeff18ms"
        password = "zxxc6832fe14ef4822a775d03cbe80d301b"
    }
})
