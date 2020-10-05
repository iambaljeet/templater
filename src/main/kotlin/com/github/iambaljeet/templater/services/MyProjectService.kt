package com.github.iambaljeet.templater.services

import com.intellij.openapi.project.Project
import com.github.iambaljeet.templater.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
