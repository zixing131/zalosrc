package aj0;

import java.util.List;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: aj0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC0878a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f3257s;

        /* renamed from: t */
        Object f3258t;

        /* renamed from: u */
        Object f3259u;

        /* renamed from: v */
        /* synthetic */ Object f3260v;

        /* renamed from: x */
        int f3262x;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f3260v = obj;
            this.f3262x |= Integer.MIN_VALUE;
            return AbstractC0878a.this.m2661a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2661a(String str, String str2, C22501b c22501b, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        int i12;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f3262x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f3262x = i13 - Integer.MIN_VALUE;
                Object obj = aVar.f3260v;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f3262x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c22501b = (C22501b) aVar.f3259u;
                            str2 = (String) aVar.f3258t;
                            str = (String) aVar.f3257s;
                            AbstractC24862s.m129228b(obj);
                            i12 = ((Number) obj).intValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        c22501b = (C22501b) aVar.f3259u;
                        str2 = (String) aVar.f3258t;
                        str = (String) aVar.f3257s;
                        AbstractC24862s.m129228b(obj);
                        i12 = ((Number) obj).intValue();
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (str2.length() > 0) {
                        aVar.f3257s = str;
                        aVar.f3258t = str2;
                        aVar.f3259u = c22501b;
                        aVar.f3262x = 1;
                        obj = mo2662b(str2, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i12 = ((Number) obj).intValue();
                    } else if (str.length() > 0) {
                        aVar.f3257s = str;
                        aVar.f3258t = str2;
                        aVar.f3259u = c22501b;
                        aVar.f3262x = 2;
                        obj = mo2663c(str, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i12 = ((Number) obj).intValue();
                    } else {
                        i12 = 0;
                    }
                }
                c22501b.m116346x(true, "Delete BillingItem with tranxId: " + str + ", purchaseToken: " + str2 + ". Affected row: " + i12, new Object[0]);
                return AbstractC29094b.m145341c(i12);
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f3260v;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f3262x;
        if (i11 == 0) {
        }
        c22501b.m116346x(true, "Delete BillingItem with tranxId: " + str + ", purchaseToken: " + str2 + ". Affected row: " + i12, new Object[0]);
        return AbstractC29094b.m145341c(i12);
    }

    /* renamed from: b */
    public abstract Object mo2662b(String str, Continuation continuation);

    /* renamed from: c */
    public abstract Object mo2663c(String str, Continuation continuation);

    /* renamed from: d */
    public abstract Object mo2664d(long j11, String str, String str2, Continuation continuation);

    /* renamed from: e */
    public abstract Object mo2665e(long j11, String str, Continuation continuation);

    /* renamed from: f */
    public abstract Object mo2666f(String str, Continuation continuation);

    /* renamed from: g */
    public abstract Object mo2667g(String str, Continuation continuation);

    /* renamed from: h */
    public final Object m2668h(C0880c c0880c, C22501b c22501b, Continuation continuation) {
        c22501b.m116346x(true, "BillingDao: insert BillingItem: " + c0880c, new Object[0]);
        return mo2670j(c0880c, continuation);
    }

    /* renamed from: i */
    public abstract List mo2669i(List list);

    /* renamed from: j */
    protected abstract Object mo2670j(C0880c c0880c, Continuation continuation);

    /* renamed from: k */
    public abstract Object mo2671k(String str, String str2, Continuation continuation);

    /* renamed from: l */
    public abstract Object mo2672l(String str, String str2, String str3, String str4, Continuation continuation);

    /* renamed from: m */
    public abstract Object mo2673m(String str, int i11, Continuation continuation);
}
