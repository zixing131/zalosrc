package lg0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: lg0.f */
/* loaded from: classes7.dex */
public class C22482f {

    /* renamed from: a */
    private final InterfaceC22477a f109942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f109943s;

        /* renamed from: t */
        Object f109944t;

        /* renamed from: u */
        /* synthetic */ Object f109945u;

        /* renamed from: w */
        int f109947w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109945u = obj;
            this.f109947w |= Integer.MIN_VALUE;
            return C22482f.this.m116237b(null, this);
        }
    }

    public C22482f(InterfaceC22477a interfaceC22477a) {
        AbstractC19074t.m100208f(interfaceC22477a, "repository");
        this.f109942a = interfaceC22477a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC22477a m116236a() {
        return this.f109942a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[PHI: r7
  0x0063: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116237b(String str, Continuation continuation) {
        a aVar;
        Object obj;
        Object m142578e;
        int i11;
        C22482f c22482f;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f109947w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f109947w = i12 - Integer.MIN_VALUE;
                obj = aVar.f109945u;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f109947w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar.f109944t;
                    c22482f = (C22482f) aVar.f109943s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC22477a interfaceC22477a = this.f109942a;
                    aVar.f109943s = this;
                    aVar.f109944t = str;
                    aVar.f109947w = 1;
                    if (AbstractC22478b.m116229a(interfaceC22477a, aVar) == m142578e) {
                        return m142578e;
                    }
                    c22482f = this;
                }
                InterfaceC22477a interfaceC22477a2 = c22482f.f109942a;
                aVar.f109943s = null;
                aVar.f109944t = null;
                aVar.f109947w = 2;
                obj = interfaceC22477a2.mo116225c(str, aVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        aVar = new a(continuation);
        obj = aVar.f109945u;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f109947w;
        if (i11 == 0) {
        }
        InterfaceC22477a interfaceC22477a22 = c22482f.f109942a;
        aVar.f109943s = null;
        aVar.f109944t = null;
        aVar.f109947w = 2;
        obj = interfaceC22477a22.mo116225c(str, aVar);
        if (obj != m142578e) {
        }
    }
}
