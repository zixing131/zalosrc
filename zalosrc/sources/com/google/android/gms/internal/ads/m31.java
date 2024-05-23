package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class m31 {

    /* renamed from: a */
    private final na1 f24357a;

    /* renamed from: b */
    private final vc1 f24358b;

    public m31(na1 na1Var, vc1 vc1Var) {
        this.f24357a = na1Var;
        this.f24358b = vc1Var;
    }

    /* renamed from: a */
    public final na1 m24449a() {
        return this.f24357a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final vc1 m24450b() {
        return this.f24358b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final if1 m24451c() {
        vc1 vc1Var = this.f24358b;
        if (vc1Var != null) {
            return new if1(vc1Var, kl0.f23368f);
        }
        return new if1(new l31(this), kl0.f23368f);
    }
}
