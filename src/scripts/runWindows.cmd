:: PS: mvn clean install is setup to dump the jars in locations as such to make this script run
:: For windows only

SET LEARN_TO_CODE_PATH=../../target

cd %LEARN_TO_CODE_PATH%

echo "Found learn to code path"

java -jar LearnToCode.jar