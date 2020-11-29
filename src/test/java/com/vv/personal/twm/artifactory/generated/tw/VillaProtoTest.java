package com.vv.personal.twm.artifactory.generated.tw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * @author Vivek
 * @since 29/11/20
 */
@RunWith(JUnit4.class)
public class VillaProtoTest {

    @Test
    public void testVillaCreation() {
        long timestamp = System.currentTimeMillis();
        VillaProto.Villa villa = VillaProto.Villa.newBuilder()
                .setWorld("enp9")
                .setName("0.WCR.R0.Mahakal")
                .setId("10546")
                .setX(560)
                .setY(585)
                .setTimestamp(timestamp)
                .setType(VillaProto.VillaType.OFF)
                .setTroops(
                        VillaProto.Troops.newBuilder()
                                .setSp(300)
                                .setSw(300)
                                .setAx(4684)
                                .setAr(0)
                                .setSu(154)
                                .setLc(2137)
                                .setMa(101)
                                .setHc(0)
                                .setRm(352)
                                .setCt(101)
                                .setPd(1)
                                .setNb(4)
                                .setWl(20)
                                .build()
                ).build();

        System.out.println(villa);
        assertEquals("10546", villa.getId());
        assertEquals(4684, villa.getTroops().getAx());
        assertEquals(VillaProto.VillaType.OFF, villa.getType());
    }

}