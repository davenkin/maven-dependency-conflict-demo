maven-dependency-conflict-demo
==============================

This project is for demonstrating conflicts due to Maven's dependency resolution know as "nears win strategy"

resolve-web -> project-A -> project-common:1.0
resolve-web -> project-B -> project-C -> project-common:2.0

(1)go to project-common, run "mvn clean install". Then change project version from 1.0 to 2.0, and add a sayGoodBye() method in HelloWorld.java.

    public String sayGoodBye(){
        return "goodbye world";
    }

run "mvn clean install" again. Now local Maven repository should have both V1.0 and V2.0 for project-common.

(2)go to project-A, run "mvn clean install"

(3)go to project-C, run "mvn clean install"

(4)go to project-B, run "mvn clean install"

(5)go to resolve-web, run "mvn clean verify org.codehaus.cargo:cargo-maven2-plugin:run"

(6)open "http://localhost:8080/resolve-web/hello", you should see "hello world".

(7)open "http://localhost:8080/resolve-web/goodBye", you should see "java.lang.NoSuchMethodError: projectcommon.HelloWorld.sayGoodBye()Ljava/lang/String;", but we expect to see "goodbye world".
