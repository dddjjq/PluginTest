package com.welson.plugin

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Attribute
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.ModuleVisitor
import org.objectweb.asm.TypePath
import org.objectweb.asm.commons.AdviceAdapter

class MyClassVisitor extends ClassVisitor {

    MyClassVisitor(int api) {
        super(api)
    }

    MyClassVisitor(int api, ClassVisitor classVisitor) {
        super(api, classVisitor)
    }

    @Override
    void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces)
        println "visit : " + name
    }

    @Override
    void visitSource(String source, String debug) {
        super.visitSource(source, debug)
        //println "visitSource"
    }

    @Override
    ModuleVisitor visitModule(String name, int access, String version) {
        return super.visitModule(name, access, version)
    }

    @Override
    void visitNestHost(String nestHost) {
        super.visitNestHost(nestHost)
    }

    @Override
    void visitOuterClass(String owner, String name, String descriptor) {
        super.visitOuterClass(owner, name, descriptor)
    }

    @Override
    AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        return super.visitAnnotation(descriptor, visible)
    }

    @Override
    AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
        return super.visitTypeAnnotation(typeRef, typePath, descriptor, visible)
    }

    @Override
    void visitAttribute(Attribute attribute) {
        super.visitAttribute(attribute)
    }

    @Override
    void visitNestMember(String nestMember) {
        super.visitNestMember(nestMember)
    }

    @Override
    void visitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(name, outerName, innerName, access)
    }

    @Override
    FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        return super.visitField(access, name, descriptor, signature, value)
    }

    @Override
    MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        return (mv == null) ? null : new MyMethodVisitor(mv);
    }

    @Override
    void visitEnd() {
        super.visitEnd()
    }

    @Override
    Object invokeMethod(String name, Object args) {
        return super.invokeMethod(name, args)
    }
}