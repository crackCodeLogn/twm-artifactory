#To be run from this folder itself!
rm ../src/main/java/com/vv/personal/twm/artifactory/generated/user/User.java
#Install protoc via 'sudo apt install protobuf-compiler'
protoc --java_out='../src/main/java' User.proto