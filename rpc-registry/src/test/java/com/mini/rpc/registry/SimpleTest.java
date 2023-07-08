package com.mini.rpc.registry;

import org.junit.Test;

import java.util.BitSet;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @date 2021/10/15 17:51
 * @since 1.0
 */
public class SimpleTest {
    @Test
    public void testBitset() {
        BitSet bitSet = new BitSet(10);
        bitSet.set(1);
        bitSet.set(10);
        bitSet.set(6);
        System.out.println(bitSet.toString());
    }
}
