package fj0;

import android.app.Activity;
import bj0.C2826e;
import com.android.billingclient.api.C3914j;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import qm0.AbstractC25366r;
import xi0.C29673d;

/* renamed from: fj0.b */
/* loaded from: classes7.dex */
public final class C18985b extends AbstractC18986c {

    /* renamed from: b */
    private final C18984a f94776b;

    public C18985b(C18984a c18984a) {
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        this.f94776b = c18984a;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        List m131496e;
        C18984a c18984a = this.f94776b;
        C3914j.b.a m99641a = c18984a.m99641a();
        C3914j.a m99642b = c18984a.m99642b();
        m131496e = AbstractC25366r.m131496e(m99641a.m18627a());
        m99642b.m18620c(m131496e);
        m99642b.m18619b(c2826e.m13659f());
        C3914j m18618a = m99642b.m18618a();
        AbstractC19074t.m100207e(m18618a, "builder.build()");
        this.f94776b.m99648h(c29673d.m147564Z(activity, m18618a));
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
