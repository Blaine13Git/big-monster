package com.muyi.bigMonster.tools;

import org.eclipse.jdt.core.dom.*;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 编译Java类
 * Eclipse JDT 提供了访问和操作Java源代码的 API。
 * Java 类用 Compilation Unit（编译单元）节点表示。
 */
public class JDTTools {

    public static void main(String[] args) {
        JDTTools tools = new JDTTools();
        String fileName = "/Users/changfeng/work/code/big-monster/monster-service/src/main/java/com/muyi/bigMonster/tools/ForASTTest.java";
        String sourceFormFile = tools.getSourceFormFile(fileName);

        try {

            MethodDeclaration[] methods = tools.getMethods(sourceFormFile);

            for (MethodDeclaration methodDeclaration : methods) {
                tools.getMethodMD5(methodDeclaration);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * AST (Abstract Syntax Tree)抽象语法树
     * <p>
     * AST是Java源代码的详细树形表示。
     * AST定义了一个API，用于修改，创建，读取和删除源代码。
     * <p>
     * 每个Java源元素都表示为ASTNode类的子类。
     * 每个特定的AST节点都提供有关其表示的对象的特定信息。
     *
     * @param javaSource
     * @return
     */

    /**
     * 通过源码获取一个编译单元
     *
     * @param javaSource
     * @return
     */
    public static CompilationUnit getCompilationUnit(String javaSource) {

        ASTParser astParser = ASTParser.newParser(AST.JLS13);

        astParser.setKind(ASTParser.K_COMPILATION_UNIT);
        astParser.setSource(javaSource.toCharArray());

        ASTNode ast = astParser.createAST(null);
        return (CompilationUnit) ast;
    }

    /**
     * 通过源码获取class
     *
     * @param javaSource
     * @return
     */
    public TypeDeclaration getClass(String javaSource) {
        CompilationUnit compilationUnit = getCompilationUnit(javaSource);
        TypeDeclaration typeDeclaration = (TypeDeclaration) compilationUnit.types().stream().filter(type -> type instanceof TypeDeclaration).findFirst().get();
        System.out.println("Class Name: " + typeDeclaration.getName());
        return typeDeclaration;
    }

    /**
     * 通过源码获取methods
     *
     * @param javaSource
     * @return
     * @throws Exception
     */
    public MethodDeclaration[] getMethods(String javaSource) throws Exception {
        TypeDeclaration typeDeclaration = getClass(javaSource);
        MethodDeclaration[] methods = typeDeclaration.getMethods();
        Arrays.stream(methods).forEach(methodDeclaration -> System.out.println("Method Name: " + methodDeclaration.getName()));
        return methods;
    }

    public String getMethodMD5(MethodDeclaration methodDeclaration) {
        String md5String;
        try {
            String methodString = methodDeclaration.toString();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            md5String = base64en.encode(md5.digest(methodString.getBytes("utf-8")));
            System.out.println("MD5值：" + md5String);
        } catch (Exception e) {
            md5String = "";
            e.printStackTrace();
        }
        return md5String;
    }

    /**
     * @param fileName
     * @return
     */
    public String getSourceFormFile(String fileName) {
        String sourceString = "";
        try {
            File resource = new File(fileName);
            Path path = Paths.get(resource.toURI());
            sourceString = new String(Files.readAllBytes(path));
        } catch (Exception e) {

        }

        return sourceString;
    }

    // test
    public void getMethodBody(MethodDeclaration methodDeclaration) {
        Block body = methodDeclaration.getBody();
        System.out.println(body.toString());
    }

    // test
    void getMethodString(MethodDeclaration methodDeclaration) {
        System.out.println(methodDeclaration.toString());
    }

}
