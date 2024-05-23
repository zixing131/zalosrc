package p093d6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.api.internal.C4089e;
import com.google.android.gms.common.api.internal.C4095g;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationRequest;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p568v5.AbstractC27541l;
import p568v5.C27536g;
import p704z4.AbstractC31238l;
import p704z4.C31216a;
import p704z4.InterfaceC31230h;

/* renamed from: d6.b */
/* loaded from: classes2.dex */
public class C17758b extends AbstractC4072b {
    public C17758b(Context context) {
        super(context, AbstractC17764e.f89938a, C4071a.d.f16181b, new C31216a());
    }

    /* renamed from: z */
    private final AbstractC22888j m93905z(zzba zzbaVar, AbstractC17762d abstractC17762d, Looper looper, InterfaceC17776k interfaceC17776k, int i11) {
        C4086d m19399a = C4089e.m19399a(abstractC17762d, AbstractC27541l.m140744a(looper), AbstractC17762d.class.getSimpleName());
        C17770h c17770h = new C17770h(this, m19399a);
        return m19240i(C4095g.m19409a().m19413b(new InterfaceC31230h(this, c17770h, abstractC17762d, interfaceC17776k, zzbaVar, m19399a) { // from class: d6.g

            /* renamed from: a */
            private final C17758b f89944a;

            /* renamed from: b */
            private final AbstractC17778m f89945b;

            /* renamed from: c */
            private final AbstractC17762d f89946c;

            /* renamed from: d */
            private final InterfaceC17776k f89947d;

            /* renamed from: e */
            private final zzba f89948e;

            /* renamed from: f */
            private final C4086d f89949f;

            public C17768g(C17758b this, AbstractC17778m c17770h2, AbstractC17762d abstractC17762d2, InterfaceC17776k interfaceC17776k2, zzba zzbaVar2, C4086d m19399a2) {
                this.f89944a = this;
                this.f89945b = c17770h2;
                this.f89946c = abstractC17762d2;
                this.f89947d = interfaceC17776k2;
                this.f89948e = zzbaVar2;
                this.f89949f = m19399a2;
            }

            @Override // p704z4.InterfaceC31230h
            /* renamed from: a */
            public final void mo16705a(Object obj, Object obj2) {
                this.f89944a.m93908y(this.f89945b, this.f89946c, this.f89947d, this.f89948e, this.f89949f, (C27536g) obj, (C22890k) obj2);
            }
        }).m19415d(c17770h2).m19416e(m19399a2).m19414c(i11).m19412a());
    }

    /* renamed from: w */
    public AbstractC22888j m93906w(AbstractC17762d abstractC17762d) {
        return AbstractC31238l.m152114c(m19241j(C4089e.m19400b(abstractC17762d, AbstractC17762d.class.getSimpleName())));
    }

    /* renamed from: x */
    public AbstractC22888j m93907x(LocationRequest locationRequest, AbstractC17762d abstractC17762d, Looper looper) {
        return m93905z(zzba.m28852t(null, locationRequest), abstractC17762d, looper, null, 2436);
    }

    /* renamed from: y */
    public final /* synthetic */ void m93908y(AbstractC17778m abstractC17778m, AbstractC17762d abstractC17762d, InterfaceC17776k interfaceC17776k, zzba zzbaVar, C4086d c4086d, C27536g c27536g, C22890k c22890k) {
        BinderC17774j binderC17774j = new BinderC17774j(c22890k, new InterfaceC17776k(this, abstractC17778m, abstractC17762d, interfaceC17776k) { // from class: d6.j0

            /* renamed from: a */
            private final C17758b f89960a;

            /* renamed from: b */
            private final AbstractC17778m f89961b;

            /* renamed from: c */
            private final AbstractC17762d f89962c;

            /* renamed from: d */
            private final InterfaceC17776k f89963d;

            public C17775j0(C17758b this, AbstractC17778m abstractC17778m2, AbstractC17762d abstractC17762d2, InterfaceC17776k interfaceC17776k2) {
                this.f89960a = this;
                this.f89961b = abstractC17778m2;
                this.f89962c = abstractC17762d2;
                this.f89963d = interfaceC17776k2;
            }

            @Override // p093d6.InterfaceC17776k
            public final void zza() {
                C17758b c17758b = this.f89960a;
                AbstractC17778m abstractC17778m2 = this.f89961b;
                AbstractC17762d abstractC17762d2 = this.f89962c;
                InterfaceC17776k interfaceC17776k2 = this.f89963d;
                abstractC17778m2.m93915c(false);
                c17758b.m93906w(abstractC17762d2);
                if (interfaceC17776k2 != null) {
                    interfaceC17776k2.zza();
                }
            }
        });
        zzbaVar.m28853F(m19247p());
        c27536g.m140741k(zzbaVar, c4086d, binderC17774j);
    }
}
