#To be run from this folder itself!
rm ../src/main/java/com/vv/personal/twm/artifactory/generated/bank/BankProto.java
#Install protoc via 'sudo apt install protobuf-compiler'
protoc --java_out='../src/main/java' Bank.proto