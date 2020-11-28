#Install protoc via 'sudo apt install protobuf-compiler'
protoc --java_out='../src/main/java' $TWM_HOME_PARENT/TWM/twm-artifactory/protobuf/Bank.proto