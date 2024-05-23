package ij0;

import android.app.Activity;
import bj0.C2826e;
import fj0.AbstractC18986c;
import fn0.AbstractC19074t;
import java.util.List;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import xi0.C29673d;

/* renamed from: ij0.c */
/* loaded from: classes7.dex */
public final class C20571c extends AbstractC18986c {

    /* renamed from: b */
    private final String f101148b;

    /* renamed from: c */
    private final C20573e f101149c;

    /* renamed from: d */
    private final C22501b f101150d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ij0.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f101151s;

        /* renamed from: t */
        Object f101152t;

        /* renamed from: u */
        Object f101153u;

        /* renamed from: v */
        Object f101154v;

        /* renamed from: w */
        /* synthetic */ Object f101155w;

        /* renamed from: y */
        int f101157y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f101155w = obj;
            this.f101157y |= Integer.MIN_VALUE;
            return C20571c.this.mo99651a(null, null, null, this);
        }
    }

    public C20571c(String str, C20573e c20573e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c20573e, "validateSubIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f101148b = str;
        this.f101149c = c20573e;
        this.f101150d = c22501b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C20571c c20571c;
        List list;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f101157y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f101157y = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f101155w;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f101157y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activity = (Activity) aVar.f101154v;
                    c29673d = (C29673d) aVar.f101153u;
                    c2826e = (C2826e) aVar.f101152t;
                    c20571c = (C20571c) aVar.f101151s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f101151s = this;
                    aVar.f101152t = c2826e;
                    aVar.f101153u = c29673d;
                    aVar.f101154v = activity;
                    aVar.f101157y = 1;
                    obj = c29673d.m147571n0(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20571c = this;
                }
                list = (List) obj;
                c20571c.f101149c.m107026c(list);
                if (list != null) {
                    c20571c.f101150d.mo104551d("Cannot query active subscription purchase", new Object[0]);
                    c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.CANNOT_QUERY_ACTIVE_SUBSCRIPTION_PURCHASE, c20571c.f101148b);
                    return AbstractC29094b.m145339a(false);
                }
                aVar.f101151s = null;
                aVar.f101152t = null;
                aVar.f101153u = null;
                aVar.f101154v = null;
                aVar.f101157y = 2;
                obj = c20571c.m99652b(c2826e, c29673d, activity, aVar);
                if (obj == m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f101155w;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f101157y;
        if (i11 == 0) {
        }
        list = (List) obj2;
        c20571c.f101149c.m107026c(list);
        if (list != null) {
        }
    }
}
