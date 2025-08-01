#To be run from this folder itself!
rm ../src/main/java/com/vv/personal/twm/artifactory/generated/itemPricing/ItemPricingProto.java
#Install protoc via 'sudo apt install protobuf-compiler'
protoc --java_out='../src/main/java' ItemPricing.proto