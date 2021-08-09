package com.weiyuze.dp.bridge.v4;

public class GG {
    void chase(MM mm) {
        Gift gift = new WarmGift(new Flower());
        give(mm, gift);
    }

    void give(MM mm, Gift gift) {
        System.out.println(gift+"gived!");
    }
}
