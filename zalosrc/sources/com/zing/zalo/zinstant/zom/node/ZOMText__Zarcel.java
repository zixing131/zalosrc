package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMText__Zarcel {
    public static void createFromSerialized(ZOMText zOMText, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 2) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMText, interfaceC29690f);
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMText.mParagraph = new ZOMTextSpan[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMText.mParagraph[i11] = ZOMTextSpan.createObject();
                            ZOMTextSpan__Zarcel.createFromSerialized(zOMText.mParagraph[i11], interfaceC29690f);
                        }
                    }
                    zOMText.mTextAlignment = interfaceC29690f.mo147644d();
                    zOMText.mTextSpacingMult = (float) interfaceC29690f.readDouble();
                    zOMText.mTextSpacingAdd = (float) interfaceC29690f.readDouble();
                }
                if (mo147644d >= 1) {
                    zOMText.mMaxLines = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 2) {
                    zOMText.mTextLetterSpacing = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMText is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMText is outdated. Update ZOMText to deserialize newest binary data.");
    }

    public static void serialize(ZOMText zOMText, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(2);
        ZOM__Zarcel.serialize(zOMText, interfaceC29691g);
        int i11 = 0;
        if (zOMText.mParagraph != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMText.mParagraph.length);
            while (true) {
                ZOMTextSpan[] zOMTextSpanArr = zOMText.mParagraph;
                if (i11 >= zOMTextSpanArr.length) {
                    break;
                }
                ZOMTextSpan__Zarcel.serialize(zOMTextSpanArr[i11], interfaceC29691g);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMText.mTextAlignment);
        interfaceC29691g.mo147654c(zOMText.mTextSpacingMult);
        interfaceC29691g.mo147654c(zOMText.mTextSpacingAdd);
        interfaceC29691g.mo147652a(zOMText.mMaxLines);
        interfaceC29691g.mo147654c(zOMText.mTextLetterSpacing);
    }
}
