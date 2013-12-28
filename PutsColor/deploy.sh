#!/bin/bash

mvn install:install-file -DgroupId=cn.chendihao -DartifactId=PutsColor -Dversion=0.1.0 -Dfile=./target/PutsColor-0.1.0.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=../release/  -DcreateChecksum=true