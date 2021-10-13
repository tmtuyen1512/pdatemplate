package com.github.tmtuyen1512.pdatemplate.services

import com.intellij.openapi.project.Project
import com.github.tmtuyen1512.pdatemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
