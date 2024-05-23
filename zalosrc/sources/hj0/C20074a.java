package hj0;

import android.app.Activity;
import bj0.C2826e;
import fj0.AbstractC18986c;
import fn0.AbstractC19074t;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: hj0.a */
/* loaded from: classes7.dex */
public final class C20074a extends AbstractC18986c {

    /* renamed from: b */
    private final String f98694b;

    /* renamed from: c */
    private final C22501b f98695c;

    public C20074a(String str, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f98694b = str;
        this.f98695c = c22501b;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        if (c29673d.m147557L() != 2) {
            c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.DEVICE_UNSUPPORTED, this.f98694b);
            this.f98695c.m116345w("Check billing setup failed.", new Object[0]);
            return AbstractC29094b.m145339a(false);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
