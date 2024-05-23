package p321le;

import ag0.C0815e1;
import bp0.AbstractC3082b0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ie.C20525a;
import je.C21228a;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import p185gc.AbstractC19377a;
import p361nb.C23648e;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: le.c */
/* loaded from: classes3.dex */
public final class C22452c extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC21698a f109818a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f109819s;

        /* renamed from: t */
        /* synthetic */ Object f109820t;

        /* renamed from: v */
        int f109822v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109820t = obj;
            this.f109822v |= Integer.MIN_VALUE;
            return C22452c.this.m116090c(0, this);
        }
    }

    public /* synthetic */ C22452c(InterfaceC21698a interfaceC21698a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a);
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo451b(Object obj, Continuation continuation) {
        return m116090c(((Number) obj).intValue(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object m116090c(int i11, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i12;
        C22452c c22452c;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f109822v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f109822v = i13 - Integer.MIN_VALUE;
                Object obj = aVar.f109820t;
                m142578e = AbstractC28298d.m142578e();
                i12 = aVar.f109822v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c22452c = (C22452c) aVar.f109819s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                            AbstractC3082b0.m15424f(c22452c.getClass().getName(), "ex " + e);
                            C0815e1.m2075D().m2100V(new C23648e(45, "in_call", 1, "play_rbt_in_call_screen", "2"), false);
                            return null;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        InterfaceC21698a interfaceC21698a = this.f109818a;
                        aVar.f109819s = this;
                        aVar.f109822v = 1;
                        obj = interfaceC21698a.mo106621b(i11, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c22452c = this;
                    } catch (Exception e12) {
                        e = e12;
                        c22452c = this;
                        e.printStackTrace();
                        AbstractC3082b0.m15424f(c22452c.getClass().getName(), "ex " + e);
                        C0815e1.m2075D().m2100V(new C23648e(45, "in_call", 1, "play_rbt_in_call_screen", "2"), false);
                        return null;
                    }
                }
                return (C21228a) obj;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f109820t;
        m142578e = AbstractC28298d.m142578e();
        i12 = aVar.f109822v;
        if (i12 == 0) {
        }
        return (C21228a) obj2;
    }

    public C22452c(InterfaceC21698a interfaceC21698a) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        this.f109818a = interfaceC21698a;
    }
}
