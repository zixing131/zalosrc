package p378o2;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: o2.f */
/* loaded from: classes2.dex */
public abstract class AbstractC23985f {

    /* renamed from: a */
    public static final a f116070a = new a(null);

    /* renamed from: o2.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AbstractC23985f m125496b(a aVar, Object obj, String str, b bVar, InterfaceC23984e interfaceC23984e, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                bVar = C23982c.f116061a.m125492a();
            }
            if ((i11 & 4) != 0) {
                interfaceC23984e = C23980a.f116056a;
            }
            return aVar.m125497a(obj, str, bVar, interfaceC23984e);
        }

        /* renamed from: a */
        public final AbstractC23985f m125497a(Object obj, String str, b bVar, InterfaceC23984e interfaceC23984e) {
            AbstractC19074t.m100208f(obj, "<this>");
            AbstractC19074t.m100208f(str, "tag");
            AbstractC19074t.m100208f(bVar, "verificationMode");
            AbstractC19074t.m100208f(interfaceC23984e, "logger");
            return new C23986g(obj, str, bVar, interfaceC23984e);
        }
    }

    /* renamed from: o2.f$b */
    /* loaded from: classes2.dex */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    /* renamed from: a */
    public abstract Object mo125493a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m125495b(Object obj, String str) {
        AbstractC19074t.m100208f(obj, "value");
        AbstractC19074t.m100208f(str, "message");
        return str + " value: " + obj;
    }

    /* renamed from: c */
    public abstract AbstractC23985f mo125494c(String str, InterfaceC18505l interfaceC18505l);
}
