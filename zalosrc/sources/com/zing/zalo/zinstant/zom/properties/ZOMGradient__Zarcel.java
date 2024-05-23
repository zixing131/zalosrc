package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMGradient__Zarcel {
    public static void createFromSerialized(ZOMGradient zOMGradient, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMGradient.mType = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMGradient.mColors = new int[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMGradient.mColors[i11] = interfaceC29690f.mo147644d();
                        }
                    }
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d3 = interfaceC29690f.mo147644d();
                        zOMGradient.mPositions = new float[mo147644d3];
                        for (int i12 = 0; i12 < mo147644d3; i12++) {
                            zOMGradient.mPositions[i12] = (float) interfaceC29690f.readDouble();
                        }
                    }
                    zOMGradient.mAngle = interfaceC29690f.mo147644d();
                    zOMGradient.mRadius = (float) interfaceC29690f.readDouble();
                    zOMGradient.mCenterX = (float) interfaceC29690f.readDouble();
                    zOMGradient.mCenterY = (float) interfaceC29690f.readDouble();
                    zOMGradient.mScaleX = (float) interfaceC29690f.readDouble();
                    zOMGradient.mScaleY = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMGradient is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMGradient is outdated. Update ZOMGradient to deserialize newest binary data.");
    }

    public static void serialize(ZOMGradient zOMGradient, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMGradient.mType);
        if (zOMGradient.mColors != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMGradient.mColors.length);
            int i12 = 0;
            while (true) {
                int[] iArr = zOMGradient.mColors;
                if (i12 >= iArr.length) {
                    break;
                }
                interfaceC29691g.mo147652a(iArr[i12]);
                i12++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMGradient.mPositions != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMGradient.mPositions.length);
            while (true) {
                if (i11 >= zOMGradient.mPositions.length) {
                    break;
                }
                interfaceC29691g.mo147654c(r1[i11]);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMGradient.mAngle);
        interfaceC29691g.mo147654c(zOMGradient.mRadius);
        interfaceC29691g.mo147654c(zOMGradient.mCenterX);
        interfaceC29691g.mo147654c(zOMGradient.mCenterY);
        interfaceC29691g.mo147654c(zOMGradient.mScaleX);
        interfaceC29691g.mo147654c(zOMGradient.mScaleY);
    }
}
