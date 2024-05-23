package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sh */
/* loaded from: classes2.dex */
public abstract class AbstractC4983sh {

    /* renamed from: a */
    public static final AbstractC4983sh f27675a = new C4872ph();

    /* renamed from: a */
    public abstract int mo25464a(Object obj);

    /* renamed from: b */
    public abstract int mo25465b();

    /* renamed from: c */
    public abstract int mo25466c();

    /* renamed from: d */
    public abstract C4909qh mo25467d(int i11, C4909qh c4909qh, boolean z11);

    /* renamed from: e */
    public abstract C4946rh mo25468e(int i11, C4946rh c4946rh, boolean z11, long j11);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:            if ((mo25466c() - 1) == 0) goto L11;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26304f(int i11, C4909qh c4909qh, C4946rh c4946rh, int i12) {
        mo25467d(i11, c4909qh, false);
        m26305g(0, c4946rh, false);
        int i13 = 1;
        if (i11 == 0) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException();
                    }
                }
                i13 = 0;
            } else if (mo25466c() - 1 == 0) {
                i13 = -1;
            }
            if (i13 == -1) {
                return -1;
            }
            m26305g(i13, c4946rh, false);
            return 0;
        }
        return i11 + 1;
    }

    /* renamed from: g */
    public final C4946rh m26305g(int i11, C4946rh c4946rh, boolean z11) {
        return mo25468e(i11, c4946rh, false, 0L);
    }

    /* renamed from: h */
    public final boolean m26306h() {
        return mo25466c() == 0;
    }
}
