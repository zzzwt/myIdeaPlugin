package com.github.zzzwt.myideaplugin.services

import com.github.zzzwt.myideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
