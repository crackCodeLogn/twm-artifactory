package com.vv.personal.twm.artifactory.util;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Vivek
 * @since 2025-04-12
 */
class TwmUtilTest {

  @Test
  public void testGetUUID() {
    String uuidStr = "3641f3b5-8d30-4b89-812c-0f4ba48a200d";
    UUID uuid = TwmUtil.getUUID(uuidStr);
    assertEquals(uuidStr, uuid.toString());
  }

  @Test
  public void testGetUUIDString() {
    UUID uuid = UUID.randomUUID();
    String uuidStr = TwmUtil.getUUIDString(uuid);
    assertEquals(uuidStr, uuid.toString());
  }

  @Test
  public void testGenerateSha512Hash() {
    String data = "this is test1";
    String sha512Hash = TwmUtil.generateSha512Hash(data);
    assertEquals(128, sha512Hash.length());
    assertEquals(
        "3c02b0533e6c51cacc3b8fa413b32f73deebea5b644ea9371ea5d9e35e494f541e50c385a248ff3621d5267091fed89d01a2644afc004cc5e87a24d14be8218d",
        sha512Hash);

    // test duplication
    sha512Hash = TwmUtil.generateSha512Hash("this is test1");
    assertEquals(
        "3c02b0533e6c51cacc3b8fa413b32f73deebea5b644ea9371ea5d9e35e494f541e50c385a248ff3621d5267091fed89d01a2644afc004cc5e87a24d14be8218d",
        sha512Hash);

    // should be different now
    sha512Hash = TwmUtil.generateSha512Hash("this is test2");
    assertNotEquals(
        "3c02b0533e6c51cacc3b8fa413b32f73deebea5b644ea9371ea5d9e35e494f541e50c385a248ff3621d5267091fed89d01a2644afc004cc5e87a24d14be8218d",
        sha512Hash);
  }

  @Test
  public void testGenerateSha256Hash() {
    String data = "this is test1";
    String sha256Hash = TwmUtil.generateSha256Hash(data);
    assertEquals(64, sha256Hash.length());
    assertEquals("29ef4c5c86ebe958456371d34032cd763d0b5295c05e2269d2d12047ac275646", sha256Hash);

    // test duplication
    sha256Hash = TwmUtil.generateSha256Hash("this is test1");
    assertEquals("29ef4c5c86ebe958456371d34032cd763d0b5295c05e2269d2d12047ac275646", sha256Hash);

    // should be different now
    sha256Hash = TwmUtil.generateSha256Hash("this is test2");
    assertNotEquals("29ef4c5c86ebe958456371d34032cd763d0b5295c05e2269d2d12047ac275646", sha256Hash);
  }
}
