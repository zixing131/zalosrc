package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMMatrix2D__Zarcel {
    public static void createFromSerialized(ZOMMatrix2D zOMMatrix2D, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMTransformElement__Zarcel.createFromSerialized(zOMMatrix2D, interfaceC29690f);
                if (mo147644d >= 0 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMMatrix2D.matrix = new float[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMMatrix2D.matrix[i11] = (float) interfaceC29690f.readDouble();
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMMatrix2D is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMMatrix2D is outdated. Update ZOMMatrix2D to deserialize newest binary data.");
    }

    public static void serialize(ZOMMatrix2D zOMMatrix2D, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        ZOMTransformElement__Zarcel.serialize(zOMMatrix2D, interfaceC29691g);
        if (zOMMatrix2D.matrix != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMMatrix2D.matrix.length);
            while (true) {
                if (i11 < zOMMatrix2D.matrix.length) {
                    interfaceC29691g.mo147654c(r1[i11]);
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
