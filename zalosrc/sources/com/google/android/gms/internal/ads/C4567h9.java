package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h9 */
/* loaded from: classes2.dex */
public final class C4567h9 {

    /* renamed from: a */
    private final int f21585a;

    /* renamed from: b */
    private final List f21586b;

    /* renamed from: c */
    private final int f21587c;

    /* renamed from: d */
    private final InputStream f21588d;

    public C4567h9(int i11, List list, int i12, InputStream inputStream) {
        this.f21585a = i11;
        this.f21586b = list;
        this.f21587c = i12;
        this.f21588d = inputStream;
    }

    /* renamed from: a */
    public final int m22741a() {
        return this.f21587c;
    }

    /* renamed from: b */
    public final int m22742b() {
        return this.f21585a;
    }

    /* renamed from: c */
    public final InputStream m22743c() {
        InputStream inputStream = this.f21588d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List m22744d() {
        return Collections.unmodifiableList(this.f21586b);
    }
}
