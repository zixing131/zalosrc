package hj0;

import android.app.Activity;
import bj0.C2822a;
import bj0.C2826e;
import bj0.InterfaceC2825d;
import com.android.billingclient.api.C3914j;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import xi0.C29673d;

/* renamed from: hj0.e */
/* loaded from: classes7.dex */
public final class C20078e extends AbstractC18986c {

    /* renamed from: b */
    private final C18984a f98720b;

    public C20078e(C18984a c18984a) {
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        this.f98720b = c18984a;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        if (AbstractC19074t.m100204b(c2826e.m13655b(), "subscription")) {
            C2822a m13656c = c2826e.m13656c();
            AbstractC19074t.m100205c(m13656c);
            C3914j.c.a m18630a = C3914j.c.m18630a();
            AbstractC19074t.m100207e(m18630a, "newBuilder()");
            if (m13656c.m13643e().length() > 0) {
                m18630a.m18642b(m13656c.m13643e());
                if (m13656c.m13644f() != null) {
                    m18630a.m18646f(InterfaceC2825d.Companion.m13653a(m13656c.m13644f()));
                }
                this.f98720b.m99643c().m18621d(m18630a.m18641a());
            }
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
