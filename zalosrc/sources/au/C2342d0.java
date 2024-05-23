package au;

import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: au.d0 */
/* loaded from: classes4.dex */
public final class C2342d0 {

    /* renamed from: a */
    public static final C2342d0 f9844a = new C2342d0();

    /* renamed from: b */
    private static final InterfaceC24854k f9845b;

    /* renamed from: au.d0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f9846q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public final Object mo12V4() {
            return CoreUtility.getAppContext().getSystemService("vibrator");
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f9846q);
        f9845b = m129210a;
    }

    private C2342d0() {
    }

    /* renamed from: b */
    private final Object m12305b() {
        Object value = f9845b.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return value;
    }

    /* renamed from: a */
    public final Object m12306a(String str) {
        AbstractC19074t.m100208f(str, "serviceType");
        if (AbstractC19074t.m100204b(str, "VIBRATOR_SERVICE")) {
            return m12305b();
        }
        return new Object();
    }
}
