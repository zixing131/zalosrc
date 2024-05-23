package p093d6;

import com.google.android.gms.common.api.internal.C4086d;
import p342m6.C22890k;
import p568v5.C27536g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d6.h */
/* loaded from: classes2.dex */
public final class C17770h extends AbstractC17778m {

    /* renamed from: b */
    final /* synthetic */ C4086d f89950b;

    /* renamed from: c */
    final /* synthetic */ C17758b f89951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C17770h(C17758b c17758b, C4086d c4086d) {
        this.f89951c = c17758b;
        this.f89950b = c4086d;
    }

    @Override // p704z4.InterfaceC31230h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16705a(Object obj, Object obj2) {
        C27536g c27536g = (C27536g) obj;
        C22890k c22890k = (C22890k) obj2;
        if (m93914b()) {
            BinderC17772i binderC17772i = new BinderC17772i(this.f89951c, c22890k);
            try {
                C4086d.a m19391b = this.f89950b.m19391b();
                if (m19391b != null) {
                    c27536g.m140742l(m19391b, binderC17772i);
                }
            } catch (RuntimeException e11) {
                c22890k.m117597d(e11);
            }
        }
    }
}
