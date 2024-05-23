package ij0;

import android.app.Activity;
import bj0.C2826e;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import xi0.C29673d;

/* renamed from: ij0.f */
/* loaded from: classes7.dex */
public final class C20574f extends AbstractC18986c {

    /* renamed from: b */
    private final C18984a f101163b;

    /* renamed from: c */
    private final C20573e f101164c;

    /* renamed from: d */
    private final List f101165d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ij0.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f101166s;

        /* renamed from: t */
        Object f101167t;

        /* renamed from: u */
        Object f101168u;

        /* renamed from: v */
        Object f101169v;

        /* renamed from: w */
        /* synthetic */ Object f101170w;

        /* renamed from: y */
        int f101172y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f101170w = obj;
            this.f101172y |= Integer.MIN_VALUE;
            return C20574f.this.mo99651a(null, null, null, this);
        }
    }

    public C20574f(String str, C18984a c18984a, C22501b c22501b) {
        List m131505m;
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f101163b = c18984a;
        C20573e c20573e = new C20573e(null, null, 3, null);
        this.f101164c = c20573e;
        m131505m = AbstractC25368s.m131505m(new C20571c(str, c20573e, c22501b), new C20569a(str, c20573e, c22501b), new C20570b(str, c20573e, c22501b), new C20572d(str, c20573e, c22501b));
        this.f101165d = m131505m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:            if (r12.equals("consumable") == false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:            r12 = "inapp";     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:            if (r12.equals("non-consumable") == false) goto L34;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
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
        C20574f c20574f;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f101172y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f101172y = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f101170w;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f101172y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            activity = (Activity) aVar.f101169v;
                            c29673d = (C29673d) aVar.f101168u;
                            c2826e = (C2826e) aVar.f101167t;
                            c20574f = (C20574f) aVar.f101166s;
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                c20574f.f101163b.m99650j(c20574f.f101164c.m107025b());
                                aVar.f101166s = null;
                                aVar.f101167t = null;
                                aVar.f101168u = null;
                                aVar.f101169v = null;
                                aVar.f101172y = 3;
                                obj = c20574f.m99652b(c2826e, c29673d, activity, aVar);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                            } else {
                                return AbstractC29094b.m145339a(false);
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        return obj;
                    }
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
                    if (!AbstractC19074t.m100204b(str, "subs")) {
                        aVar.f101172y = 1;
                        obj = m99652b(c2826e, c29673d, activity, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        return obj;
                    }
                    AbstractC18986c m99654a = AbstractC18986c.Companion.m99654a(this.f101165d);
                    aVar.f101166s = this;
                    aVar.f101167t = c2826e;
                    aVar.f101168u = c29673d;
                    aVar.f101169v = activity;
                    aVar.f101172y = 2;
                    obj = m99654a.mo99651a(c2826e, c29673d, activity, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20574f = this;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return obj;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f101170w;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f101172y;
        if (i11 == 0) {
        }
        return obj2;
    }
}
