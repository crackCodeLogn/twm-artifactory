package com.vv.personal.twm.artifactory.util;

import com.google.common.hash.Hashing;
import com.google.protobuf.Timestamp;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.UUID;

/**
 * @author Vivek
 * @since 2025-04-12
 */
public class TwmUtil {

  public static UUID getUUID(String id) {
    return UUID.fromString(id);
  }

  public static String getUUIDString(UUID uuid) {
    return uuid.toString();
  }

  public static String generateSha512Hash(String data) {
    return Hashing.sha512().hashString(data, StandardCharsets.UTF_8).toString();
  }

  public static String generateSha256Hash(String data) {
    return Hashing.sha256().hashString(data, StandardCharsets.UTF_8).toString();
  }

  public static boolean writeToFile(
      String data, String destinationFolder, String destinationFileName) throws IOException {
    String destinationFile = String.format("%s/%s", destinationFolder, destinationFileName);
    try (FileWriter fileWriter = new FileWriter(destinationFile)) {
      fileWriter.write(data);
      return true;
    } catch (IOException e) {
      throw new IOException(
          String.format(
              "Failed to write content to file: %s. %s", destinationFile, e.getMessage()));
    }
  }

  public static Instant fromTimestamp(Timestamp timestamp) {
    return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
  }

  public static Timestamp fromInstant(Instant instant) {
    return Timestamp.newBuilder()
        .setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano())
        .build();
  }
}
