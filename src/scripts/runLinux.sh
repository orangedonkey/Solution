#!/usr/bin/env bash

#
# PS: mvn clean install is setup to dump the jars in locations as such to make this script run
#
# For linux environments - also can usually run using linux emulator shells in Windows such as
# GitBash and Cygwin

LEARN_TO_CODE_PATH=../../target

cd ${LEARN_TO_CODE_PATH}

echo "Found learn to code path"

java -jar LearnToCode.jar