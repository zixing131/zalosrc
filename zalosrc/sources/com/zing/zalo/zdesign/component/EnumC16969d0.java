package com.zing.zalo.zdesign.component;

import android.content.Context;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.d0 */
/* loaded from: classes7.dex */
public enum EnumC16969d0 {
    PADDING_0(0),
    PADDING_2(2),
    PADDING_4(4),
    PADDING_8(8),
    PADDING_12(12),
    PADDING_16(16);


    /* renamed from: p */
    private final int f86690p;

    EnumC16969d0(int i11) {
        this.f86690p = i11;
    }

    /* renamed from: c */
    public final int m90857c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return C27276c.m139649b(context, this.f86690p);
    }
}
