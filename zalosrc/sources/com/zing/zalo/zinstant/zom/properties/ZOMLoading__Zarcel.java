package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMLoading__Zarcel {
    public static void createFromSerialized(ZOMLoading zOMLoading, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMLoading.mWidth = (float) interfaceC29690f.readDouble();
                    zOMLoading.mHeight = (float) interfaceC29690f.readDouble();
                    zOMLoading.mColor = interfaceC29690f.mo147644d();
                    zOMLoading.mDuration = interfaceC29690f.mo147644d();
                    zOMLoading.mVariant = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTimingFunction createObject = ZOMTimingFunction.createObject();
                        zOMLoading.mTimingFunction = createObject;
                        ZOMTimingFunction__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMLinearLoading createObject2 = ZOMLinearLoading.createObject();
                        zOMLoading.mLinearLoading = createObject2;
                        ZOMLinearLoading__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMCircularLoading createObject3 = ZOMCircularLoading.createObject();
                        zOMLoading.mCircularLoading = createObject3;
                        ZOMCircularLoading__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMSkeletonLoading createObject4 = ZOMSkeletonLoading.createObject();
                        zOMLoading.mSkeletonLoading = createObject4;
                        ZOMSkeletonLoading__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMDotLoading createObject5 = ZOMDotLoading.createObject();
                        zOMLoading.mDotLoading = createObject5;
                        ZOMDotLoading__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMLoading is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMLoading is outdated. Update ZOMLoading to deserialize newest binary data.");
    }

    public static void serialize(ZOMLoading zOMLoading, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147654c(zOMLoading.mWidth);
        interfaceC29691g.mo147654c(zOMLoading.mHeight);
        interfaceC29691g.mo147652a(zOMLoading.mColor);
        interfaceC29691g.mo147652a(zOMLoading.mDuration);
        interfaceC29691g.mo147652a(zOMLoading.mVariant);
        if (zOMLoading.mTimingFunction != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTimingFunction__Zarcel.serialize(zOMLoading.mTimingFunction, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMLoading.mLinearLoading != null) {
            interfaceC29691g.mo147658g(true);
            ZOMLinearLoading__Zarcel.serialize(zOMLoading.mLinearLoading, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMLoading.mCircularLoading != null) {
            interfaceC29691g.mo147658g(true);
            ZOMCircularLoading__Zarcel.serialize(zOMLoading.mCircularLoading, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMLoading.mSkeletonLoading != null) {
            interfaceC29691g.mo147658g(true);
            ZOMSkeletonLoading__Zarcel.serialize(zOMLoading.mSkeletonLoading, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMLoading.mDotLoading != null) {
            interfaceC29691g.mo147658g(true);
            ZOMDotLoading__Zarcel.serialize(zOMLoading.mDotLoading, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
