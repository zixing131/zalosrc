package hj0;

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

/* renamed from: hj0.b */
/* loaded from: classes7.dex */
public final class C20075b extends AbstractC18986c {

    /* renamed from: b */
    private final String f98696b;

    /* renamed from: c */
    private final C22501b f98697c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj0.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f98698s;

        /* renamed from: t */
        Object f98699t;

        /* renamed from: u */
        Object f98700u;

        /* renamed from: v */
        Object f98701v;

        /* renamed from: w */
        Object f98702w;

        /* renamed from: x */
        /* synthetic */ Object f98703x;

        /* renamed from: z */
        int f98705z;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f98703x = obj;
            this.f98705z |= Integer.MIN_VALUE;
            return C20075b.this.mo99651a(null, null, null, this);
        }
    }

    public C20075b(String str, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f98696b = str;
        this.f98697c = c22501b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        boolean z11;
        String str;
        C20075b c20075b;
        List list;
        C2826e c2826e2;
        List list2;
        C20075b c20075b2;
        C29673d c29673d2;
        Activity activity2;
        EnumC21279d enumC21279d;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f98705z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f98705z = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f98703x;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f98705z;
                z11 = true;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) aVar.f98702w;
                        activity2 = (Activity) aVar.f98701v;
                        c29673d2 = (C29673d) aVar.f98700u;
                        c2826e2 = (C2826e) aVar.f98699t;
                        c20075b2 = (C20075b) aVar.f98698s;
                        AbstractC24862s.m129228b(obj);
                        z11 = ((Boolean) obj).booleanValue();
                        list = list2;
                        c2826e = c2826e2;
                        c20075b = c20075b2;
                        C29673d c29673d3 = c29673d2;
                        activity = activity2;
                        c29673d = c29673d3;
                        if (z11) {
                            aVar.f98698s = null;
                            aVar.f98699t = null;
                            aVar.f98700u = null;
                            aVar.f98701v = null;
                            aVar.f98702w = null;
                            aVar.f98705z = 3;
                            obj = c20075b.m99652b(c2826e, c29673d, activity, aVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            return obj;
                        }
                        if (list == null) {
                            enumC21279d = EnumC21279d.CANNOT_QUERY_PURCHASE;
                        } else {
                            enumC21279d = EnumC21279d.HANDLE_LOST_PURCHASE_FAIL;
                        }
                        c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), enumC21279d, c20075b.f98696b);
                        c20075b.f98697c.m116345w("Handle lost purchase failed.", new Object[0]);
                        return AbstractC29094b.m145339a(false);
                    }
                    activity = (Activity) aVar.f98701v;
                    c29673d = (C29673d) aVar.f98700u;
                    c2826e = (C2826e) aVar.f98699t;
                    c20075b = (C20075b) aVar.f98698s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (AbstractC19074t.m100204b(c2826e.m13655b(), "subscription")) {
                        str = "subs";
                    } else {
                        str = "inapp";
                    }
                    aVar.f98698s = this;
                    aVar.f98699t = c2826e;
                    aVar.f98700u = c29673d;
                    aVar.f98701v = activity;
                    aVar.f98705z = 1;
                    obj = c29673d.m147570m0(str, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20075b = this;
                }
                list = (List) obj;
                if (list != null) {
                    z11 = false;
                } else if (!list.isEmpty()) {
                    aVar.f98698s = c20075b;
                    aVar.f98699t = c2826e;
                    aVar.f98700u = c29673d;
                    aVar.f98701v = activity;
                    aVar.f98702w = list;
                    aVar.f98705z = 2;
                    Object m147567j0 = c29673d.m147567j0(list, null, aVar);
                    if (m147567j0 == m142578e) {
                        return m142578e;
                    }
                    C20075b c20075b3 = c20075b;
                    c2826e2 = c2826e;
                    list2 = list;
                    obj = m147567j0;
                    c20075b2 = c20075b3;
                    Activity activity3 = activity;
                    c29673d2 = c29673d;
                    activity2 = activity3;
                    z11 = ((Boolean) obj).booleanValue();
                    list = list2;
                    c2826e = c2826e2;
                    c20075b = c20075b2;
                    C29673d c29673d32 = c29673d2;
                    activity = activity2;
                    c29673d = c29673d32;
                }
                if (z11) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f98703x;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f98705z;
        z11 = true;
        if (i11 == 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        if (z11) {
        }
    }
}
