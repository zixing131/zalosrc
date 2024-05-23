package p297kd;

import fn0.AbstractC19074t;
import p586vt.AbstractC28618c;

/* renamed from: kd.d */
/* loaded from: classes3.dex */
public final class C21689d extends AbstractC28618c {

    /* renamed from: e */
    private boolean f105267e;

    /* renamed from: f */
    private boolean f105268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21689d(int i11, int i12, int i13, String str) {
        super(i11, i12, i13, str);
        AbstractC19074t.m100205c(str);
    }

    @Override // p586vt.AbstractC28618c
    /* renamed from: e */
    public boolean mo97004e() {
        return this.f105267e;
    }

    /* renamed from: f */
    public final boolean m111858f() {
        return this.f105268f;
    }

    /* renamed from: g */
    public final boolean m111859g() {
        if (m143142c() == 14) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m111860h() {
        if (m143142c() < 12 && m143142c() >= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m111861i(boolean z11) {
        this.f105268f = z11;
    }

    /* renamed from: j */
    public void m111862j(boolean z11) {
        this.f105267e = z11;
    }

    @Override // p586vt.AbstractC28618c
    public String toString() {
        return "SyncErrorData(errorPhase=" + m143142c() + ", errorPos=" + m143143d() + ", errorCode=" + m143140a() + ", errorMes='" + m143141b() + "', isNetworkError=" + mo97004e() + ", isFullStorageError=" + this.f105268f + ")";
    }
}
