package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMMedia__Zarcel {
    public static void createFromSerialized(ZOMMedia zOMMedia, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMMedia, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMMedia.mSrc = interfaceC29690f.mo147646f();
                    zOMMedia.mLoop = interfaceC29690f.mo147643c();
                    zOMMedia.mStreaming = interfaceC29690f.mo147643c();
                    zOMMedia.mAutoPlay = interfaceC29690f.mo147643c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMMedia is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMMedia is outdated. Update ZOMMedia to deserialize newest binary data.");
    }

    public static void serialize(ZOMMedia zOMMedia, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOM__Zarcel.serialize(zOMMedia, interfaceC29691g);
        interfaceC29691g.mo147655d(zOMMedia.mSrc);
        interfaceC29691g.mo147658g(zOMMedia.mLoop);
        interfaceC29691g.mo147658g(zOMMedia.mStreaming);
        interfaceC29691g.mo147658g(zOMMedia.mAutoPlay);
    }
}
