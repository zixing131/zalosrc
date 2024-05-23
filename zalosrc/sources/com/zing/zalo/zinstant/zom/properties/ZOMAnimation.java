package com.zing.zalo.zinstant.zom.properties;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class ZOMAnimation {
    private HashMap<Integer, ZOMAnimationElement> mData;
    public ZOMAnimationElement[] mElements;

    public static ZOMAnimation createObject() {
        return new ZOMAnimation();
    }

    public void setData(Object[] objArr) {
        ZOMAnimationElement[] zOMAnimationElementArr = (ZOMAnimationElement[]) objArr;
        this.mElements = zOMAnimationElementArr;
        if (zOMAnimationElementArr.length > 0) {
            HashMap<Integer, ZOMAnimationElement> hashMap = this.mData;
            if (hashMap == null) {
                this.mData = new HashMap<>();
            } else {
                hashMap.clear();
            }
            for (ZOMAnimationElement zOMAnimationElement : this.mElements) {
                this.mData.put(Integer.valueOf(zOMAnimationElement.mProperty), zOMAnimationElement);
            }
        }
    }
}
