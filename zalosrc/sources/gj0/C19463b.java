package gj0;

import aj0.AbstractC0878a;
import android.app.Activity;
import bj0.C2826e;
import cj0.AbstractC3559c;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import nh0.InterfaceC23792b;
import p248iy.AbstractC20887g;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import xi0.C29673d;

/* renamed from: gj0.b */
/* loaded from: classes7.dex */
public final class C19463b extends AbstractC18986c {

    /* renamed from: b */
    private final String f96593b;

    /* renamed from: c */
    private final InterfaceC23792b f96594c;

    /* renamed from: d */
    private final AbstractC0878a f96595d;

    /* renamed from: e */
    private final C18984a f96596e;

    /* renamed from: f */
    private final C22501b f96597f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gj0.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f96598s;

        /* renamed from: t */
        Object f96599t;

        /* renamed from: u */
        Object f96600u;

        /* renamed from: v */
        Object f96601v;

        /* renamed from: w */
        /* synthetic */ Object f96602w;

        /* renamed from: y */
        int f96604y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96602w = obj;
            this.f96604y |= Integer.MIN_VALUE;
            return C19463b.this.mo99651a(null, null, null, this);
        }
    }

    public C19463b(String str, InterfaceC23792b interfaceC23792b, AbstractC0878a abstractC0878a, C18984a c18984a, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(abstractC0878a, "billingDao");
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f96593b = str;
        this.f96594c = interfaceC23792b;
        this.f96595d = abstractC0878a;
        this.f96596e = c18984a;
        this.f96597f = c22501b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7 A[PHI: r12
  0x00b7: PHI (r12v9 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:17:0x00b4, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        a aVar;
        Object obj;
        Object m142578e;
        int i11;
        C19463b c19463b;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f96604y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f96604y = i12 - Integer.MIN_VALUE;
                obj = aVar.f96602w;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f96604y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activity = (Activity) aVar.f96601v;
                    c29673d = (C29673d) aVar.f96600u;
                    c2826e = (C2826e) aVar.f96599t;
                    c19463b = (C19463b) aVar.f96598s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    c2826e.m13662i(this.f96594c.mo124311f());
                    c29673d.m147574s0(c2826e);
                    c29673d.m147552B(c2826e);
                    c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.SUCCESS, this.f96593b);
                    AbstractC20887g.m109217D(79920, null, 2, null);
                    this.f96597f.m116346x(true, "Request transaction data: " + c2826e, new Object[0]);
                    AbstractC3559c m147558Q = c29673d.m147558Q();
                    AbstractC0878a abstractC0878a = this.f96595d;
                    C18984a c18984a = this.f96596e;
                    aVar.f96598s = this;
                    aVar.f96599t = c2826e;
                    aVar.f96600u = c29673d;
                    aVar.f96601v = activity;
                    aVar.f96604y = 1;
                    if (m147558Q.m18085e(abstractC0878a, c2826e, c18984a, aVar) == m142578e) {
                        return m142578e;
                    }
                    c19463b = this;
                }
                aVar.f96598s = null;
                aVar.f96599t = null;
                aVar.f96600u = null;
                aVar.f96601v = null;
                aVar.f96604y = 2;
                obj = c19463b.m99652b(c2826e, c29673d, activity, aVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        aVar = new a(continuation);
        obj = aVar.f96602w;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f96604y;
        if (i11 == 0) {
        }
        aVar.f96598s = null;
        aVar.f96599t = null;
        aVar.f96600u = null;
        aVar.f96601v = null;
        aVar.f96604y = 2;
        obj = c19463b.m99652b(c2826e, c29673d, activity, aVar);
        if (obj != m142578e) {
        }
    }
}
