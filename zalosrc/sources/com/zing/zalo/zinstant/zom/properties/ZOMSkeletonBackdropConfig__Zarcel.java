package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMSkeletonBackdropConfig__Zarcel {
    public static void createFromSerialized(ZOMSkeletonBackdropConfig zOMSkeletonBackdropConfig, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMRect createObject = ZOMRect.createObject();
                        zOMSkeletonBackdropConfig.mDimen = createObject;
                        ZOMRect__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    zOMSkeletonBackdropConfig.mWidth = interfaceC29690f.mo147644d();
                    zOMSkeletonBackdropConfig.mHeight = interfaceC29690f.mo147644d();
                    zOMSkeletonBackdropConfig.mRadius = (float) interfaceC29690f.readDouble();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMSkeletonBackdropConfig.mCornersToggle = new boolean[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMSkeletonBackdropConfig.mCornersToggle[i11] = interfaceC29690f.mo147643c();
                        }
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMBorder createObject2 = ZOMBorder.createObject();
                        zOMSkeletonBackdropConfig.mBorder = createObject2;
                        ZOMBorder__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    zOMSkeletonBackdropConfig.mBackgroundColor = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMSkeletonBackdropConfig is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMSkeletonBackdropConfig is outdated. Update ZOMSkeletonBackdropConfig to deserialize newest binary data.");
    }

    public static void serialize(ZOMSkeletonBackdropConfig zOMSkeletonBackdropConfig, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOMSkeletonBackdropConfig.mDimen != null) {
            interfaceC29691g.mo147658g(true);
            ZOMRect__Zarcel.serialize(zOMSkeletonBackdropConfig.mDimen, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMSkeletonBackdropConfig.mWidth);
        interfaceC29691g.mo147652a(zOMSkeletonBackdropConfig.mHeight);
        interfaceC29691g.mo147654c(zOMSkeletonBackdropConfig.mRadius);
        if (zOMSkeletonBackdropConfig.mCornersToggle != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMSkeletonBackdropConfig.mCornersToggle.length);
            int i11 = 0;
            while (true) {
                boolean[] zArr = zOMSkeletonBackdropConfig.mCornersToggle;
                if (i11 >= zArr.length) {
                    break;
                }
                interfaceC29691g.mo147658g(zArr[i11]);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMSkeletonBackdropConfig.mBorder != null) {
            interfaceC29691g.mo147658g(true);
            ZOMBorder__Zarcel.serialize(zOMSkeletonBackdropConfig.mBorder, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMSkeletonBackdropConfig.mBackgroundColor);
    }
}
