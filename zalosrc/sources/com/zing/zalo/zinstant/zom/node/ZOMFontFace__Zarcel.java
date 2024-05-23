package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMFontFace__Zarcel {
    public static void createFromSerialized(ZOMFontFace zOMFontFace, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMFontFace.mFonts = new ZOMFont[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMFontFace.mFonts[i11] = ZOMFont.createObject();
                        ZOMFont__Zarcel.createFromSerialized(zOMFontFace.mFonts[i11], interfaceC29690f);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMFontFace is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMFontFace is outdated. Update ZOMFontFace to deserialize newest binary data.");
    }

    public static void serialize(ZOMFontFace zOMFontFace, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        if (zOMFontFace.mFonts != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMFontFace.mFonts.length);
            while (true) {
                ZOMFont[] zOMFontArr = zOMFontFace.mFonts;
                if (i11 < zOMFontArr.length) {
                    ZOMFont__Zarcel.serialize(zOMFontArr[i11], interfaceC29691g);
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
