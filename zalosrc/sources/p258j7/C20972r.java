package p258j7;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import p291k7.AbstractRunnableC21539r1;
import p291k7.C21515j1;
import p291k7.C21536q1;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j7.r */
/* loaded from: classes3.dex */
public final class C20972r extends AbstractRunnableC21539r1 {

    /* renamed from: q */
    final /* synthetic */ Collection f102877q;

    /* renamed from: r */
    final /* synthetic */ Collection f102878r;

    /* renamed from: s */
    final /* synthetic */ C21515j1 f102879s;

    /* renamed from: t */
    final /* synthetic */ C22890k f102880t;

    /* renamed from: u */
    final /* synthetic */ C20984x f102881u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20972r(C20984x c20984x, C22890k c22890k, Collection collection, Collection collection2, C21515j1 c21515j1, C22890k c22890k2) {
        super(c22890k);
        this.f102881u = c20984x;
        this.f102877q = collection;
        this.f102878r = collection2;
        this.f102879s = c21515j1;
        this.f102880t = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.IInterface, k7.m0] */
    @Override // p291k7.AbstractRunnableC21539r1
    /* renamed from: c */
    protected final void mo109504c() {
        C21536q1 c21536q1;
        String str;
        ArrayList m109532h = C20984x.m109532h(this.f102877q);
        m109532h.addAll(C20984x.m109531g(this.f102878r));
        try {
            this.f102879s.m111163b(2);
            ?? m111149e = this.f102881u.f102905b.m111149e();
            str = this.f102881u.f102904a;
            m111149e.mo111169h0(str, m109532h, C20984x.m109528b(this.f102879s), new BinderC20980v(this.f102881u, this.f102880t));
        } catch (RemoteException e11) {
            c21536q1 = C20984x.f102902c;
            c21536q1.m111196c(e11, "startInstall(%s,%s)", this.f102877q, this.f102878r);
            this.f102880t.m117597d(new RuntimeException(e11));
        }
    }
}
