package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.node.ZOMImage;
import com.zing.zalo.zinstant.zom.properties.ZOMFilter;
import com.zing.zalo.zinstant.zom.properties.ZOMFilter__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMImage__Zarcel {
    public static void createFromSerialized(ZOMImage zOMImage, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 5) {
            if (mo147644d >= 2) {
                ZOM__Zarcel.createFromSerialized(zOMImage, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMImage.mSrc = interfaceC29690f.mo147646f();
                    zOMImage.mImageScaleType = interfaceC29690f.mo147644d();
                    zOMImage.mImageType = interfaceC29690f.mo147644d();
                    zOMImage.mIsUsePlaceholder = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 1) {
                    zOMImage.mTintColor = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 2) {
                    zOMImage.mSrcExt = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 3) {
                    zOMImage.mIsUseStateLoading = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 4 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMImage.mFilters = new ZOMFilter[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMImage.mFilters[i11] = new ZOMFilter();
                        ZOMFilter__Zarcel.createFromSerialized(zOMImage.mFilters[i11], interfaceC29690f);
                    }
                }
                if (mo147644d >= 5) {
                    zOMImage.mTransitionType = interfaceC29690f.mo147644d();
                    zOMImage.mKeepState = interfaceC29690f.mo147643c();
                }
                new ZOMImage.C17253a().m92113a(zOMImage, mo147644d, 5);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMImage is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMImage is outdated. Update ZOMImage to deserialize newest binary data.");
    }

    public static void serialize(ZOMImage zOMImage, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(5);
        ZOM__Zarcel.serialize(zOMImage, interfaceC29691g);
        interfaceC29691g.mo147655d(zOMImage.mSrc);
        interfaceC29691g.mo147652a(zOMImage.mImageScaleType);
        interfaceC29691g.mo147652a(zOMImage.mImageType);
        interfaceC29691g.mo147658g(zOMImage.mIsUsePlaceholder);
        interfaceC29691g.mo147652a(zOMImage.mTintColor);
        interfaceC29691g.mo147655d(zOMImage.mSrcExt);
        interfaceC29691g.mo147658g(zOMImage.mIsUseStateLoading);
        int i11 = 0;
        if (zOMImage.mFilters != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMImage.mFilters.length);
            while (true) {
                ZOMFilter[] zOMFilterArr = zOMImage.mFilters;
                if (i11 >= zOMFilterArr.length) {
                    break;
                }
                ZOMFilter__Zarcel.serialize(zOMFilterArr[i11], interfaceC29691g);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMImage.mTransitionType);
        interfaceC29691g.mo147658g(zOMImage.mKeepState);
    }
}
