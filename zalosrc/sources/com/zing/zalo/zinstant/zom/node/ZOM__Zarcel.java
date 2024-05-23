package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.adapter.ZOMConditionalAdapter;
import com.zing.zalo.zinstant.zom.properties.ZOMAnchor;
import com.zing.zalo.zinstant.zom.properties.ZOMAnchor__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMAnimation__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow;
import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMClick__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMGlowingAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMGlowingAnimation__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.properties.ZOMRect__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMTransition;
import com.zing.zalo.zinstant.zom.properties.ZOMTransition__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOM__Zarcel {
    public static void createFromSerialized(ZOM zom, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 11) {
            if (mo147644d >= 9) {
                if (mo147644d >= 0) {
                    zom.mType = interfaceC29690f.mo147644d();
                    zom.f87947mX = interfaceC29690f.mo147644d();
                    zom.f87948mY = interfaceC29690f.mo147644d();
                    zom.mWidth = interfaceC29690f.mo147644d();
                    zom.mHeight = interfaceC29690f.mo147644d();
                    zom.mID = interfaceC29690f.mo147646f();
                    ZOMRect createObject = ZOMRect.createObject();
                    zom.mBound = createObject;
                    ZOMRect__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    if (interfaceC29690f.mo147643c()) {
                        ZOMRect createObject2 = ZOMRect.createObject();
                        zom.mMargin = createObject2;
                        ZOMRect__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMRect createObject3 = ZOMRect.createObject();
                        zom.mPadding = createObject3;
                        ZOMRect__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMBorder createObject4 = ZOMBorder.createObject();
                        zom.mBorder = createObject4;
                        ZOMBorder__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMBackground createObject5 = ZOMBackground.createObject();
                        zom.mBackground = createObject5;
                        ZOMBackground__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMClick createObject6 = ZOMClick.createObject();
                        zom.mClick = createObject6;
                        ZOMClick__Zarcel.createFromSerialized(createObject6, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMClick createObject7 = ZOMClick.createObject();
                        zom.mLongClick = createObject7;
                        ZOMClick__Zarcel.createFromSerialized(createObject7, interfaceC29690f);
                    }
                    zom.mRadius = (float) interfaceC29690f.readDouble();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zom.mCornersToggle = new boolean[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zom.mCornersToggle[i11] = interfaceC29690f.mo147643c();
                        }
                    }
                    if (interfaceC29690f.mo147643c()) {
                        zom.mCondition = new ZOMConditionalAdapter().createFromSerialized(interfaceC29690f);
                    }
                    zom.mExtraData = interfaceC29690f.mo147646f();
                    zom.mVisibility = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMBoxShadow createObject8 = ZOMBoxShadow.createObject();
                        zom.mBoxShadow = createObject8;
                        ZOMBoxShadow__Zarcel.createFromSerialized(createObject8, interfaceC29690f);
                    }
                }
                if (mo147644d >= 1 && interfaceC29690f.mo147643c()) {
                    ZOMInsight createObject9 = ZOMInsight.createObject();
                    zom.mInsight = createObject9;
                    ZOMInsight__Zarcel.createFromSerialized(createObject9, interfaceC29690f);
                }
                if (mo147644d >= 2) {
                    zom.mWrapped = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 4 && interfaceC29690f.mo147643c()) {
                    ZOMGlowingAnimation createObject10 = ZOMGlowingAnimation.createObject();
                    zom.mGlowingAnimation = createObject10;
                    ZOMGlowingAnimation__Zarcel.createFromSerialized(createObject10, interfaceC29690f);
                }
                if (mo147644d >= 5) {
                    zom.mAnchorType = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 7 && interfaceC29690f.mo147643c()) {
                    ZOMAnchor createObject11 = ZOMAnchor.createObject();
                    zom.mAnchor = createObject11;
                    ZOMAnchor__Zarcel.createFromSerialized(createObject11, interfaceC29690f);
                }
                if (mo147644d >= 8) {
                    zom.mOverflow = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 9 && interfaceC29690f.mo147643c()) {
                    ZOMRect createObject12 = ZOMRect.createObject();
                    zom.mAfterPaddingNode = createObject12;
                    ZOMRect__Zarcel.createFromSerialized(createObject12, interfaceC29690f);
                }
                if (mo147644d >= 10) {
                    zom.mOpacity = (float) interfaceC29690f.readDouble();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTransform createObject13 = ZOMTransform.createObject();
                        zom.mTransform = createObject13;
                        ZOMTransform__Zarcel.createFromSerialized(createObject13, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTransition createObject14 = ZOMTransition.createObject();
                        zom.mTransition = createObject14;
                        ZOMTransition__Zarcel.createFromSerialized(createObject14, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMAnimation createObject15 = ZOMAnimation.createObject();
                        zom.mAnimation = createObject15;
                        ZOMAnimation__Zarcel.createFromSerialized(createObject15, interfaceC29690f);
                    }
                }
                if (mo147644d >= 11) {
                    zom.mRelativeVisibility = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOM is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOM is outdated. Update ZOM to deserialize newest binary data.");
    }

    public static void serialize(ZOM zom, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(11);
        interfaceC29691g.mo147652a(zom.mType);
        interfaceC29691g.mo147652a(zom.f87947mX);
        interfaceC29691g.mo147652a(zom.f87948mY);
        interfaceC29691g.mo147652a(zom.mWidth);
        interfaceC29691g.mo147652a(zom.mHeight);
        interfaceC29691g.mo147655d(zom.mID);
        ZOMRect__Zarcel.serialize(zom.mBound, interfaceC29691g);
        if (zom.mMargin != null) {
            interfaceC29691g.mo147658g(true);
            ZOMRect__Zarcel.serialize(zom.mMargin, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mPadding != null) {
            interfaceC29691g.mo147658g(true);
            ZOMRect__Zarcel.serialize(zom.mPadding, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mBorder != null) {
            interfaceC29691g.mo147658g(true);
            ZOMBorder__Zarcel.serialize(zom.mBorder, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mBackground != null) {
            interfaceC29691g.mo147658g(true);
            ZOMBackground__Zarcel.serialize(zom.mBackground, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mClick != null) {
            interfaceC29691g.mo147658g(true);
            ZOMClick__Zarcel.serialize(zom.mClick, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mLongClick != null) {
            interfaceC29691g.mo147658g(true);
            ZOMClick__Zarcel.serialize(zom.mLongClick, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147654c(zom.mRadius);
        if (zom.mCornersToggle != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zom.mCornersToggle.length);
            int i11 = 0;
            while (true) {
                boolean[] zArr = zom.mCornersToggle;
                if (i11 >= zArr.length) {
                    break;
                }
                interfaceC29691g.mo147658g(zArr[i11]);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mCondition != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMConditionalAdapter().serialize(zom.mCondition, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147655d(zom.mExtraData);
        interfaceC29691g.mo147652a(zom.mVisibility);
        if (zom.mBoxShadow != null) {
            interfaceC29691g.mo147658g(true);
            ZOMBoxShadow__Zarcel.serialize(zom.mBoxShadow, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mInsight != null) {
            interfaceC29691g.mo147658g(true);
            ZOMInsight__Zarcel.serialize(zom.mInsight, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147658g(zom.mWrapped);
        if (zom.mGlowingAnimation != null) {
            interfaceC29691g.mo147658g(true);
            ZOMGlowingAnimation__Zarcel.serialize(zom.mGlowingAnimation, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147655d(zom.mAnchorType);
        if (zom.mAnchor != null) {
            interfaceC29691g.mo147658g(true);
            ZOMAnchor__Zarcel.serialize(zom.mAnchor, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zom.mOverflow);
        if (zom.mAfterPaddingNode != null) {
            interfaceC29691g.mo147658g(true);
            ZOMRect__Zarcel.serialize(zom.mAfterPaddingNode, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147654c(zom.mOpacity);
        if (zom.mTransform != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTransform__Zarcel.serialize(zom.mTransform, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mTransition != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTransition__Zarcel.serialize(zom.mTransition, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zom.mAnimation != null) {
            interfaceC29691g.mo147658g(true);
            ZOMAnimation__Zarcel.serialize(zom.mAnimation, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zom.mRelativeVisibility);
    }
}
