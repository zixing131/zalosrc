package com.zing.zalo.p077ui.widget;

import qm0.AbstractC25358n;

/* renamed from: com.zing.zalo.ui.widget.b3 */
/* loaded from: classes.dex */
public enum EnumC13569b3 {
    NONE(0, new float[]{0.875f, 1.0f, 1.121f, 1.25f, 1.405f, 1.5f, 1.6f}),
    TEXT(1, new float[]{0.889f, 1.0f, 1.1f, 1.21f, 1.331f, 1.464f, 1.611f}),
    HEADING(2, new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}),
    BUTTON(3, new float[]{0.889f, 1.0f, 1.1f, 1.21f, 1.331f, 1.464f, 1.611f}),
    AVATAR(4, new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}),
    BADGE(5, new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f});


    /* renamed from: p */
    private final int f69904p;

    /* renamed from: q */
    private final float[] f69905q;

    EnumC13569b3(int i11, float[] fArr) {
        this.f69904p = i11;
        this.f69905q = fArr;
    }

    /* renamed from: c */
    public final float m76020c(int i11) {
        int m131359G;
        int m131359G2;
        if (i11 >= 0) {
            m131359G = AbstractC25358n.m131359G(this.f69905q);
            if (i11 > m131359G) {
                float[] fArr = this.f69905q;
                m131359G2 = AbstractC25358n.m131359G(fArr);
                return fArr[m131359G2];
            }
            return this.f69905q[i11];
        }
        return this.f69905q[0];
    }

    /* renamed from: d */
    public final float[] m76021d() {
        return this.f69905q;
    }

    /* renamed from: e */
    public final int m76022e() {
        return this.f69904p;
    }
}
