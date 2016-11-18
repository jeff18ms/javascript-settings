package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "642c42e8-04c3-4ec1-8494-047a61496192"
    extId = "JavaScript_03Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
