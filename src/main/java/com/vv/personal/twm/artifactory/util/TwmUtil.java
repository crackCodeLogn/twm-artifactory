package com.vv.personal.twm.artifactory.util;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
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
}
