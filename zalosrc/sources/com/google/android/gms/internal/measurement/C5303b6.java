package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p665y0.C30245g;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes.dex */
public final class C5303b6 {

    /* renamed from: a */
    private final C30245g f32273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5303b6(C30245g c30245g) {
        this.f32273a = c30245g;
    }

    /* renamed from: a */
    public final String m28944a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C30245g c30245g = (C30245g) this.f32273a.get(uri.toString());
        if (c30245g == null) {
            return null;
        }
        return (String) c30245g.get("".concat(str3));
    }
}
