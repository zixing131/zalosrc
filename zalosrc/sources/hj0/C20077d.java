package hj0;

import android.app.Activity;
import bj0.C2826e;
import com.android.billingclient.api.C3934p;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import java.util.List;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import xi0.C29673d;

/* renamed from: hj0.d */
/* loaded from: classes7.dex */
public final class C20077d extends AbstractC18986c {

    /* renamed from: b */
    private final String f98709b;

    /* renamed from: c */
    private final C18984a f98710c;

    /* renamed from: d */
    private final C22501b f98711d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj0.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f98712s;

        /* renamed from: t */
        Object f98713t;

        /* renamed from: u */
        Object f98714u;

        /* renamed from: v */
        Object f98715v;

        /* renamed from: w */
        int f98716w;

        /* renamed from: x */
        /* synthetic */ Object f98717x;

        /* renamed from: z */
        int f98719z;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f98717x = obj;
            this.f98719z |= Integer.MIN_VALUE;
            return C20077d.this.mo99651a(null, null, null, this);
        }
    }

    public C20077d(String str, C18984a c18984a, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f98709b = str;
        this.f98710c = c18984a;
        this.f98711d = c22501b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:            if (r15.equals("consumable") == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:            r15 = "inapp";     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0088, code lost:            if (r15.equals("non-consumable") == false) goto L32;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        String str;
        int i12;
        C20077d c20077d;
        List list;
        Object m131205e0;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f98719z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f98719z = i13 - Integer.MIN_VALUE;
                Object obj = aVar.f98717x;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f98719z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = aVar.f98716w;
                    activity = (Activity) aVar.f98715v;
                    c29673d = (C29673d) aVar.f98714u;
                    C2826e c2826e2 = (C2826e) aVar.f98713t;
                    c20077d = (C20077d) aVar.f98712s;
                    AbstractC24862s.m129228b(obj);
                    i12 = i14;
                    c2826e = c2826e2;
                } else {
                    AbstractC24862s.m129228b(obj);
                    String m13655b = c2826e.m13655b();
                    int hashCode = m13655b.hashCode();
                    if (hashCode != -390443677) {
                        if (hashCode != -166371741) {
                            if (hashCode == 341203229 && m13655b.equals("subscription")) {
                                str = "subs";
                            }
                        }
                        str = "";
                    }
                    if (!c29673d.m147562X("fff")) {
                        c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.PRODUCT_DETAILS_NOT_SUPPORTED, this.f98709b);
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    if (i12 != 0 && AbstractC19074t.m100204b(str, "subs") && !c29673d.m147562X("subscriptions")) {
                        c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.SUBSCRIPTIONS_NOT_SUPPORTED, this.f98709b);
                        i12 = 0;
                    }
                    if (i12 != 0) {
                        String m13654a = c2826e.m13654a();
                        aVar.f98712s = this;
                        aVar.f98713t = c2826e;
                        aVar.f98714u = c29673d;
                        aVar.f98715v = activity;
                        aVar.f98716w = i12;
                        aVar.f98719z = 1;
                        obj = c29673d.m147569l0(m13654a, str, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c20077d = this;
                    } else {
                        c20077d = this;
                        if (i12 != 0) {
                            aVar.f98712s = null;
                            aVar.f98713t = null;
                            aVar.f98714u = null;
                            aVar.f98715v = null;
                            aVar.f98719z = 2;
                            obj = c20077d.m99652b(c2826e, c29673d, activity, aVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            return obj;
                        }
                        return AbstractC29094b.m145339a(false);
                    }
                }
                list = (List) obj;
                if (list.isEmpty()) {
                    m131205e0 = AbstractC25332a0.m131205e0(list);
                    C3934p c3934p = (C3934p) m131205e0;
                    c20077d.f98710c.m99649i(c3934p);
                    c20077d.f98710c.m99646f().m18629c(c3934p);
                } else {
                    c20077d.f98711d.mo104551d("Cannot query productDetails with id: " + c2826e.m13654a(), new Object[0]);
                    c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.PRODUCT_DETAILS_NOT_FOUND, c20077d.f98709b);
                    i12 = 0;
                }
                if (i12 != 0) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f98717x;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f98719z;
        if (i11 == 0) {
        }
        list = (List) obj2;
        if (list.isEmpty()) {
        }
        if (i12 != 0) {
        }
    }
}
