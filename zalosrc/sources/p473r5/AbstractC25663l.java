package p473r5;

import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4098h;
import p342m6.C22890k;
import p704z4.AbstractC31238l;

/* renamed from: r5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC25663l extends AbstractC4098h {

    /* renamed from: d */
    private C22890k f122630d;

    private AbstractC25663l() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4098h
    /* renamed from: b */
    public /* synthetic */ void mo19431b(C4071a.b bVar, C22890k c22890k) {
        this.f122630d = c22890k;
        mo132547f((InterfaceC25655d) ((C25659h) bVar).getService());
    }

    /* renamed from: f */
    protected abstract void mo132547f(InterfaceC25655d interfaceC25655d);

    /* renamed from: g */
    public final void m132548g(Status status) {
        AbstractC31238l.m152113b(status, this.f122630d);
    }

    public /* synthetic */ AbstractC25663l(C25661j c25661j) {
        this();
    }
}
