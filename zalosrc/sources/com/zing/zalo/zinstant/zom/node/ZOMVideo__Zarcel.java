package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMVideo__Zarcel {
    public static void createFromSerialized(ZOMVideo zOMVideo, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMVideo, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMVideo.mSrc = interfaceC29690f.mo147646f();
                    zOMVideo.mVideoType = interfaceC29690f.mo147646f();
                    zOMVideo.mAutoPlay = interfaceC29690f.mo147643c();
                    zOMVideo.mControls = interfaceC29690f.mo147643c();
                    zOMVideo.mLoop = interfaceC29690f.mo147643c();
                    zOMVideo.mMuted = interfaceC29690f.mo147643c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMVideo is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMVideo is outdated. Update ZOMVideo to deserialize newest binary data.");
    }

    public static void serialize(ZOMVideo zOMVideo, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOM__Zarcel.serialize(zOMVideo, interfaceC29691g);
        interfaceC29691g.mo147655d(zOMVideo.mSrc);
        interfaceC29691g.mo147655d(zOMVideo.mVideoType);
        interfaceC29691g.mo147658g(zOMVideo.mAutoPlay);
        interfaceC29691g.mo147658g(zOMVideo.mControls);
        interfaceC29691g.mo147658g(zOMVideo.mLoop);
        interfaceC29691g.mo147658g(zOMVideo.mMuted);
    }
}
