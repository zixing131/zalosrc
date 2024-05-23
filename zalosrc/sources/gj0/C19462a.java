package gj0;

import android.app.Activity;
import bj0.C2826e;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import p248iy.AbstractC20887g;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: gj0.a */
/* loaded from: classes7.dex */
public final class C19462a extends AbstractC18986c {

    /* renamed from: b */
    private final String f96591b;

    /* renamed from: c */
    private final C18984a f96592c;

    public C19462a(String str, C18984a c18984a) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        this.f96591b = str;
        this.f96592c = c18984a;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        if (this.f96592c.m99644d().m18652b() != 0) {
            AbstractC20887g.m109244v(79920, null, 2, null);
            c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.GOOGLE_ERR, this.f96591b);
            return AbstractC29094b.m145339a(false);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
