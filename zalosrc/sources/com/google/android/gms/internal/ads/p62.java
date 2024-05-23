package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class p62 {

    /* renamed from: a */
    private final InterfaceC20285f f26086a;

    /* renamed from: b */
    private final q62 f26087b;

    /* renamed from: c */
    private final ox2 f26088c;

    /* renamed from: d */
    private final List f26089d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private final boolean f26090e = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21147V5)).booleanValue();

    /* renamed from: f */
    private final g32 f26091f;

    public p62(InterfaceC20285f interfaceC20285f, q62 q62Var, g32 g32Var, ox2 ox2Var) {
        this.f26086a = interfaceC20285f;
        this.f26087b = q62Var;
        this.f26091f = g32Var;
        this.f26088c = ox2Var;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m25408g(p62 p62Var, String str, int i11, long j11, String str2, Integer num) {
        String str3 = str + "." + i11 + "." + j11;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21388u1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        p62Var.f26089d.add(str3);
    }

    /* renamed from: e */
    public final tc3 m25410e(tq2 tq2Var, iq2 iq2Var, tc3 tc3Var, kx2 kx2Var) {
        lq2 lq2Var = tq2Var.f28473b.f27823b;
        long mo105914b = this.f26086a.mo105914b();
        String str = iq2Var.f22352x;
        if (str != null) {
            kc3.m23886r(tc3Var, new o62(this, mo105914b, str, iq2Var, lq2Var, kx2Var, tq2Var), kl0.f23368f);
        }
        return tc3Var;
    }

    /* renamed from: f */
    public final String m25411f() {
        return TextUtils.join("_", this.f26089d);
    }
}
