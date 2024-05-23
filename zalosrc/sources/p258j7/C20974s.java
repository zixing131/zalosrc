package p258j7;

import android.os.Bundle;
import android.os.RemoteException;
import p291k7.AbstractRunnableC21539r1;
import p291k7.C21536q1;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j7.s */
/* loaded from: classes3.dex */
public final class C20974s extends AbstractRunnableC21539r1 {

    /* renamed from: q */
    final /* synthetic */ int f102883q;

    /* renamed from: r */
    final /* synthetic */ C22890k f102884r;

    /* renamed from: s */
    final /* synthetic */ C20984x f102885s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20974s(C20984x c20984x, C22890k c22890k, int i11, C22890k c22890k2) {
        super(c22890k);
        this.f102885s = c20984x;
        this.f102883q = i11;
        this.f102884r = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, k7.m0] */
    @Override // p291k7.AbstractRunnableC21539r1
    /* renamed from: c */
    protected final void mo109504c() {
        C21536q1 c21536q1;
        String str;
        Bundle m109533i;
        try {
            ?? m111149e = this.f102885s.f102905b.m111149e();
            str = this.f102885s.f102904a;
            int i11 = this.f102883q;
            m109533i = C20984x.m109533i();
            m111149e.mo111168H3(str, i11, m109533i, new BinderC20976t(this.f102885s, this.f102884r));
        } catch (RemoteException e11) {
            c21536q1 = C20984x.f102902c;
            c21536q1.m111196c(e11, "cancelInstall(%d)", Integer.valueOf(this.f102883q));
            this.f102884r.m117597d(new RuntimeException(e11));
        }
    }
}
