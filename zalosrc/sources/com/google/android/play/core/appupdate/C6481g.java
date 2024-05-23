package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.g */
/* loaded from: classes.dex */
public final class C6481g {

    /* renamed from: a */
    private C6488n f36286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6481g(AbstractC6480f abstractC6480f) {
    }

    /* renamed from: a */
    public final InterfaceC6478e m33346a() {
        C6488n c6488n = this.f36286a;
        if (c6488n != null) {
            return new C6479e0(c6488n, null);
        }
        throw new IllegalStateException(String.valueOf(C6488n.class.getCanonicalName()).concat(" must be set"));
    }

    /* renamed from: b */
    public final C6481g m33347b(C6488n c6488n) {
        this.f36286a = c6488n;
        return this;
    }
}
