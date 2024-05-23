package fe0;

import au.EnumC2381y;
import ci.C3499e0;
import ci.C3521p0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23309i;

/* renamed from: fe0.a */
/* loaded from: classes4.dex */
public final class C18892a extends AbstractC19383g {

    /* renamed from: a */
    private final C3521p0 f94324a;

    /* renamed from: fe0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3499e0 f94325a;

        /* renamed from: b */
        private final EnumC2381y f94326b;

        /* renamed from: c */
        private final boolean f94327c;

        public a(C3499e0 c3499e0, EnumC2381y enumC2381y, boolean z11) {
            this.f94325a = c3499e0;
            this.f94326b = enumC2381y;
            this.f94327c = z11;
        }

        /* renamed from: a */
        public final EnumC2381y m99052a() {
            return this.f94326b;
        }

        /* renamed from: b */
        public final C3499e0 m99053b() {
            return this.f94325a;
        }

        /* renamed from: c */
        public final boolean m99054c() {
            return this.f94327c;
        }

        public /* synthetic */ a(C3499e0 c3499e0, EnumC2381y enumC2381y, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : c3499e0, (i11 & 2) != 0 ? null : enumC2381y, (i11 & 4) != 0 ? true : z11);
        }
    }

    /* renamed from: fe0.a$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94328a;

        static {
            int[] iArr = new int[EnumC2381y.values().length];
            try {
                iArr[EnumC2381y.f9940q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2381y.f9941r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2381y.f9939p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94328a = iArr;
        }
    }

    public C18892a(C3521p0 c3521p0) {
        AbstractC19074t.m100208f(c3521p0, "msRepository");
        this.f94324a = c3521p0;
    }

    /* renamed from: c */
    private final void m99049c(EnumC2381y enumC2381y, boolean z11) {
        this.f94324a.m17788j(enumC2381y);
        if (z11) {
            AbstractC23309i.m122591xt(enumC2381y.ordinal());
            AbstractC23309i.m122554wt(true);
        }
    }

    /* renamed from: d */
    private final EnumC2381y m99050d(C3499e0 c3499e0) {
        EnumC2381y enumC2381y;
        if (c3499e0 == null || (enumC2381y = c3499e0.m17616U()) == null) {
            for (EnumC2381y enumC2381y2 : EnumC2381y.values()) {
                if (enumC2381y2.ordinal() == AbstractC23309i.m121374R8()) {
                    enumC2381y = enumC2381y2;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        int i11 = b.f94328a[enumC2381y.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return EnumC2381y.f9940q;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC2381y.f9939p;
        }
        return EnumC2381y.f9941r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        EnumC2381y m99052a = aVar.m99052a();
        if (m99052a == null) {
            m99052a = m99050d(aVar.m99053b());
        }
        m99049c(m99052a, aVar.m99054c());
    }
}
