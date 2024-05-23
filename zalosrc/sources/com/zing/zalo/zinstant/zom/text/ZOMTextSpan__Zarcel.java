package com.zing.zalo.zinstant.zom.text;

import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMClick__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam__Zarcel;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTextSpan__Zarcel {
    public static void createFromSerialized(ZOMTextSpan zOMTextSpan, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 7) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMTextSpan.text = interfaceC29690f.mo147646f();
                    zOMTextSpan.textSize = interfaceC29690f.mo147644d();
                    zOMTextSpan.bold = interfaceC29690f.mo147643c();
                    zOMTextSpan.italic = interfaceC29690f.mo147643c();
                    zOMTextSpan.underline = interfaceC29690f.mo147643c();
                    zOMTextSpan.textColor = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMBackground createObject = ZOMBackground.createObject();
                        zOMTextSpan.mBackground = createObject;
                        ZOMBackground__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMClick createObject2 = ZOMClick.createObject();
                        zOMTextSpan.mClick = createObject2;
                        ZOMClick__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMClick createObject3 = ZOMClick.createObject();
                        zOMTextSpan.mLongClick = createObject3;
                        ZOMClick__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMConditionParam createObject4 = ZOMConditionParam.createObject();
                        zOMTextSpan.mCondition = createObject4;
                        ZOMConditionParam__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    }
                }
                if (mo147644d >= 1) {
                    zOMTextSpan.fontWeight = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 3) {
                    zOMTextSpan.strikeThrough = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 4) {
                    zOMTextSpan.emoticonEnabled = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 5) {
                    zOMTextSpan.fontFamily = interfaceC29690f.mo147646f();
                    zOMTextSpan.fontUrl = interfaceC29690f.mo147646f();
                    zOMTextSpan.keepFontSize = interfaceC29690f.mo147643c();
                    zOMTextSpan.fontScale = (float) interfaceC29690f.readDouble();
                    zOMTextSpan.f88013id = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 6) {
                    zOMTextSpan.screenScale = (float) interfaceC29690f.readDouble();
                }
                if (mo147644d >= 7) {
                    zOMTextSpan.mOpacity = (float) interfaceC29690f.readDouble();
                }
                new ZOMTextSpan.C17286a().m92124a(zOMTextSpan, mo147644d, 7);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTextSpan is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTextSpan is outdated. Update ZOMTextSpan to deserialize newest binary data.");
    }

    public static void serialize(ZOMTextSpan zOMTextSpan, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(7);
        interfaceC29691g.mo147655d(zOMTextSpan.text);
        interfaceC29691g.mo147652a(zOMTextSpan.textSize);
        interfaceC29691g.mo147658g(zOMTextSpan.bold);
        interfaceC29691g.mo147658g(zOMTextSpan.italic);
        interfaceC29691g.mo147658g(zOMTextSpan.underline);
        interfaceC29691g.mo147652a(zOMTextSpan.textColor);
        if (zOMTextSpan.mBackground != null) {
            interfaceC29691g.mo147658g(true);
            ZOMBackground__Zarcel.serialize(zOMTextSpan.mBackground, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMTextSpan.mClick != null) {
            interfaceC29691g.mo147658g(true);
            ZOMClick__Zarcel.serialize(zOMTextSpan.mClick, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMTextSpan.mLongClick != null) {
            interfaceC29691g.mo147658g(true);
            ZOMClick__Zarcel.serialize(zOMTextSpan.mLongClick, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMTextSpan.mCondition != null) {
            interfaceC29691g.mo147658g(true);
            ZOMConditionParam__Zarcel.serialize(zOMTextSpan.mCondition, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMTextSpan.fontWeight);
        interfaceC29691g.mo147658g(zOMTextSpan.strikeThrough);
        interfaceC29691g.mo147658g(zOMTextSpan.emoticonEnabled);
        interfaceC29691g.mo147655d(zOMTextSpan.fontFamily);
        interfaceC29691g.mo147655d(zOMTextSpan.fontUrl);
        interfaceC29691g.mo147658g(zOMTextSpan.keepFontSize);
        interfaceC29691g.mo147654c(zOMTextSpan.fontScale);
        interfaceC29691g.mo147655d(zOMTextSpan.f88013id);
        interfaceC29691g.mo147654c(zOMTextSpan.screenScale);
        interfaceC29691g.mo147654c(zOMTextSpan.mOpacity);
    }
}
