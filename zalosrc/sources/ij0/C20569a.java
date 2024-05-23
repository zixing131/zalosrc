package ij0;

import android.app.Activity;
import bj0.C2822a;
import bj0.C2826e;
import fj0.AbstractC18986c;
import fn0.AbstractC19074t;
import java.util.List;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: ij0.a */
/* loaded from: classes7.dex */
public final class C20569a extends AbstractC18986c {

    /* renamed from: b */
    private final String f101142b;

    /* renamed from: c */
    private final C20573e f101143c;

    /* renamed from: d */
    private final C22501b f101144d;

    public C20569a(String str, C20573e c20573e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c20573e, "validateSubIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f101142b = str;
        this.f101143c = c20573e;
        this.f101144d = c22501b;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        List m107024a = this.f101143c.m107024a();
        AbstractC19074t.m100205c(m107024a);
        C2822a m13656c = c2826e.m13656c();
        AbstractC19074t.m100205c(m13656c);
        if (m13656c.m13643e().length() > 0 && m107024a.isEmpty()) {
            this.f101144d.m116345w("Request payment has oldPurchaseToken, but this GG account doesn't has any active purchase.", new Object[0]);
            c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.SWITCH_FROM_ANOTHER_GG_ACC, this.f101142b);
            return AbstractC29094b.m145339a(false);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
