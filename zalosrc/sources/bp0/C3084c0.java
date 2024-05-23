package bp0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.HashMap;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: bp0.c0 */
/* loaded from: classes7.dex */
public final class C3084c0 {

    /* renamed from: a */
    public static final C3084c0 f13123a = new C3084c0();

    /* renamed from: b */
    private static final InterfaceC24854k f13124b;

    /* renamed from: bp0.c0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f13125q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f13125q);
        f13124b = m129210a;
    }

    private C3084c0() {
    }

    /* renamed from: a */
    public static final void m15433a(String str, Runnable runnable) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(runnable, "runnable");
        f13123a.m15435c().put(str, runnable);
    }

    /* renamed from: b */
    public static final void m15434b() {
        f13123a.m15435c().clear();
    }

    /* renamed from: c */
    private final HashMap m15435c() {
        return (HashMap) f13124b.getValue();
    }

    /* renamed from: d */
    public static final void m15436d(String str) {
        AbstractC19074t.m100208f(str, "key");
        f13123a.m15435c().remove(str);
    }

    /* renamed from: e */
    public static final void m15437e(String... strArr) {
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            try {
                Runnable runnable = (Runnable) f13123a.m15435c().remove(str);
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
