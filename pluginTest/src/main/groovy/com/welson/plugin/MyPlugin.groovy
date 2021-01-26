package com.welson.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {

    void apply(Project project) {
        def appExtension = project.extensions.findByType(AppExtension.class)
        appExtension.registerTransform(new MyTransform());
    }
}