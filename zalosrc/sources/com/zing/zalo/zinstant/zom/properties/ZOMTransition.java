package com.zing.zalo.zinstant.zom.properties;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class ZOMTransition {
    public int key = 0;
    private HashMap<Integer, ZOMTransitionElement> mData;
    public boolean mHasOnCancelListener;
    public boolean mHasOnEndListener;
    public boolean mHasOnRunListener;
    public boolean mHasOnStartListener;
    public ZOMTransitionElement[] mTransitionElements;

    public static ZOMTransition createObject() {
        return new ZOMTransition();
    }

    public ZOMTransitionElement get(int i11) {
        HashMap<Integer, ZOMTransitionElement> hashMap = this.mData;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i11));
        }
        return null;
    }

    public void onAnimationCancel(int i11) {
        __ZOMTransition_zjni.onAnimationCancel(this, i11);
    }

    public void onAnimationEnd(int i11) {
        __ZOMTransition_zjni.onAnimationEnd(this, i11);
    }

    public void onAnimationRun(int i11) {
        __ZOMTransition_zjni.onAnimationRun(this, i11);
    }

    public void onAnimationStart(int i11) {
        __ZOMTransition_zjni.onAnimationStart(this, i11);
    }

    public void setData(Object[] objArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        ZOMTransitionElement[] zOMTransitionElementArr = (ZOMTransitionElement[]) objArr;
        this.mTransitionElements = zOMTransitionElementArr;
        if (zOMTransitionElementArr != null && zOMTransitionElementArr.length > 0) {
            HashMap<Integer, ZOMTransitionElement> hashMap = this.mData;
            if (hashMap == null) {
                this.mData = new HashMap<>();
            } else {
                hashMap.clear();
            }
            for (ZOMTransitionElement zOMTransitionElement : this.mTransitionElements) {
                this.mData.put(Integer.valueOf(zOMTransitionElement.mProperty), zOMTransitionElement);
            }
        } else {
            HashMap<Integer, ZOMTransitionElement> hashMap2 = this.mData;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
        }
        if (z11) {
            this.key++;
        }
        this.mHasOnRunListener = z12;
        this.mHasOnStartListener = z13;
        this.mHasOnEndListener = z14;
        this.mHasOnCancelListener = z15;
    }
}
