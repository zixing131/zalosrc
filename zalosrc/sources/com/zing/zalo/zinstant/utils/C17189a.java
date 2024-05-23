package com.zing.zalo.zinstant.utils;

import android.graphics.Color;
import hn0.AbstractC20104d;

/* renamed from: com.zing.zalo.zinstant.utils.a */
/* loaded from: classes7.dex */
public final class C17189a {

    /* renamed from: a */
    public static final C17189a f87752a = new C17189a();

    private C17189a() {
    }

    /* renamed from: a */
    public final int m91795a(int i11, int i12) {
        return (((i11 * Color.alpha(i12)) / 255) << 24) | (i12 & 16777215);
    }

    /* renamed from: b */
    public final int m91796b(float f11, int i11) {
        int m104529e;
        m104529e = AbstractC20104d.m104529e(f11 * Color.alpha(i11));
        return (m104529e << 24) | (i11 & 16777215);
    }
}
