cd ..
base=`pwd`

rm -rf src/main/java/com/vv/personal/twm/artifactory/generated/*

cd protobuf/

#find * -name "generate*Proto.sh" -exec bash {} +;
find * -name "generate*Proto.sh" -exec bash {} \;