package fo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.AbstractC18522f;
import p137eo.C18521e;
import p137eo.InterfaceC18520d;
import p185gc.AbstractC19377a;
import p368nq.C23926a;
import p455qo.C25410g0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: fo.a */
/* loaded from: classes4.dex */
public final class C19081a extends AbstractC19377a implements InterfaceC18520d {

    /* renamed from: a */
    private final C18521e f94955a;

    /* renamed from: b */
    public a f94956b;

    /* renamed from: fo.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f94957a;

        /* renamed from: b */
        private final long f94958b;

        /* renamed from: c */
        private final int f94959c;

        public a(String str, long j11, int i11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f94957a = str;
            this.f94958b = j11;
            this.f94959c = i11;
        }

        /* renamed from: a */
        public final long m100229a() {
            return this.f94958b;
        }

        /* renamed from: b */
        public final int m100230b() {
            return this.f94959c;
        }

        /* renamed from: c */
        public final String m100231c() {
            return this.f94957a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f94957a, aVar.f94957a) && this.f94958b == aVar.f94958b && this.f94959c == aVar.f94959c;
        }

        public int hashCode() {
            return (((this.f94957a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f94958b)) * 31) + this.f94959c;
        }

        public String toString() {
            return "Param(userId=" + this.f94957a + ", albumId=" + this.f94958b + ", albumType=" + this.f94959c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fo.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f94960s;

        /* renamed from: t */
        /* synthetic */ Object f94961t;

        /* renamed from: v */
        int f94963v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f94961t = obj;
            this.f94963v |= Integer.MIN_VALUE;
            return C19081a.this.mo451b(null, this);
        }
    }

    public C19081a(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f94955a = c18521e;
    }

    /* renamed from: e */
    private final Object m100224e(Continuation continuation) {
        Object m142578e;
        C23926a.f115594a.m125055d();
        new C25410g0(null, 1, null).m101508a(new C25410g0.a(m100226d().m100229a()));
        m100225c(m100226d().m100231c(), m100226d().m100229a());
        Object mo97899c = this.f94955a.mo97899c(m100226d().m100231c(), m100226d().m100229a(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97899c == m142578e) {
            return mo97899c;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    public void m100225c(String str, long j11) {
        InterfaceC18520d.a.m97896c(this, str, j11);
    }

    /* renamed from: d */
    public final a m100226d() {
        a aVar = this.f94956b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC19074t.m100223u("params");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        C19081a c19081a;
        Object obj2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f94963v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f94963v = i12 - Integer.MIN_VALUE;
                obj = bVar.f94961t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f94963v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj2 = bVar.f94960s;
                            AbstractC24862s.m129228b(obj);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19081a = (C19081a) bVar.f94960s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m100228g(aVar);
                    C18521e c18521e = this.f94955a;
                    String m100231c = aVar.m100231c();
                    long m100229a = aVar.m100229a();
                    int m100230b = aVar.m100230b();
                    bVar.f94960s = this;
                    bVar.f94963v = 1;
                    obj = c18521e.mo97891j(m100231c, m100229a, m100230b, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19081a = this;
                }
                if (!(((AbstractC18522f) obj) instanceof AbstractC18522f.b)) {
                    bVar.f94960s = obj;
                    bVar.f94963v = 2;
                    if (c19081a.m100224e(bVar) == m142578e) {
                        return m142578e;
                    }
                    obj2 = obj;
                    return obj2;
                }
                return obj;
            }
        }
        bVar = new b(continuation);
        obj = bVar.f94961t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f94963v;
        if (i11 == 0) {
        }
        if (!(((AbstractC18522f) obj) instanceof AbstractC18522f.b)) {
        }
    }

    /* renamed from: g */
    public final void m100228g(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f94956b = aVar;
    }

    public /* synthetic */ C19081a(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
