package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMIndicator__Zarcel {
    public static void createFromSerialized(ZOMIndicator zOMIndicator, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 2) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMIndicator.mVerticalAlign = interfaceC29690f.mo147644d();
                    zOMIndicator.mHorizontalAlign = interfaceC29690f.mo147644d();
                    zOMIndicator.mTranslateX = (float) interfaceC29690f.readDouble();
                    zOMIndicator.mTranslateY = (float) interfaceC29690f.readDouble();
                    zOMIndicator.mShape = interfaceC29690f.mo147644d();
                    zOMIndicator.mSize = (float) interfaceC29690f.readDouble();
                    zOMIndicator.mStrokeWidth = (float) interfaceC29690f.readDouble();
                    zOMIndicator.mActiveColor = interfaceC29690f.mo147644d();
                    zOMIndicator.mInactiveColor = interfaceC29690f.mo147644d();
                    zOMIndicator.mStrokeColor = interfaceC29690f.mo147644d();
                    zOMIndicator.mVisibleForOneItem = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 1) {
                    zOMIndicator.mHeight = (float) interfaceC29690f.readDouble();
                    zOMIndicator.mGapWidth = (float) interfaceC29690f.readDouble();
                }
                new ZOMIndicator.C17285a().m92123a(zOMIndicator, mo147644d, 2);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMIndicator is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMIndicator is outdated. Update ZOMIndicator to deserialize newest binary data.");
    }

    public static void serialize(ZOMIndicator zOMIndicator, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(2);
        interfaceC29691g.mo147652a(zOMIndicator.mVerticalAlign);
        interfaceC29691g.mo147652a(zOMIndicator.mHorizontalAlign);
        interfaceC29691g.mo147654c(zOMIndicator.mTranslateX);
        interfaceC29691g.mo147654c(zOMIndicator.mTranslateY);
        interfaceC29691g.mo147652a(zOMIndicator.mShape);
        interfaceC29691g.mo147654c(zOMIndicator.mSize);
        interfaceC29691g.mo147654c(zOMIndicator.mStrokeWidth);
        interfaceC29691g.mo147652a(zOMIndicator.mActiveColor);
        interfaceC29691g.mo147652a(zOMIndicator.mInactiveColor);
        interfaceC29691g.mo147652a(zOMIndicator.mStrokeColor);
        interfaceC29691g.mo147658g(zOMIndicator.mVisibleForOneItem);
        interfaceC29691g.mo147654c(zOMIndicator.mHeight);
        interfaceC29691g.mo147654c(zOMIndicator.mGapWidth);
    }
}
