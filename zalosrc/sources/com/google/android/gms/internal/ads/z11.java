package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class z11 {

    /* renamed from: a */
    private final t31 f31320a;

    /* renamed from: b */
    private final View f31321b;

    /* renamed from: c */
    private final jq2 f31322c;

    /* renamed from: d */
    private final zq0 f31323d;

    public z11(View view, zq0 zq0Var, t31 t31Var, jq2 jq2Var) {
        this.f31321b = view;
        this.f31323d = zq0Var;
        this.f31320a = t31Var;
        this.f31322c = jq2Var;
    }

    /* renamed from: f */
    public static final if1 m28421f(final Context context, final zzcgv zzcgvVar, final iq2 iq2Var, final dr2 dr2Var) {
        return new if1(new l91() { // from class: com.google.android.gms.internal.ads.x11
            @Override // com.google.android.gms.internal.ads.l91
            public final void zzn() {
                zzt.zzs().zzn(context, zzcgvVar.f32030p, iq2Var.f22290D.toString(), dr2Var.f19400f);
            }
        }, kl0.f23368f);
    }

    /* renamed from: g */
    public static final Set m28422g(j31 j31Var) {
        return Collections.singleton(new if1(j31Var, kl0.f23368f));
    }

    /* renamed from: h */
    public static final if1 m28423h(h31 h31Var) {
        return new if1(h31Var, kl0.f23367e);
    }

    /* renamed from: a */
    public final View m28424a() {
        return this.f31321b;
    }

    /* renamed from: b */
    public final zq0 m28425b() {
        return this.f31323d;
    }

    /* renamed from: c */
    public final t31 m28426c() {
        return this.f31320a;
    }

    /* renamed from: d */
    public j91 mo23139d(Set set) {
        return new j91(set);
    }

    /* renamed from: e */
    public final jq2 m28427e() {
        return this.f31322c;
    }
}
