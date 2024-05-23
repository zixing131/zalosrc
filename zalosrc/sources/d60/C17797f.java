package d60;

import ag0.AbstractC0837p0;
import android.os.SystemClock;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p212hj.AbstractC20070a;
import p248iy.AbstractC20887g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: d60.f */
/* loaded from: classes5.dex */
public final class C17797f {

    /* renamed from: a */
    public static final C17797f f90007a = new C17797f();

    /* renamed from: b */
    private static final AtomicInteger f90008b = new AtomicInteger(0);

    /* renamed from: c */
    private static final InterfaceC24854k f90009c;

    /* renamed from: d60.f$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private long f90010a;

        /* renamed from: b */
        private int f90011b;

        /* renamed from: c */
        private int f90012c;

        /* renamed from: a */
        public final int m94006a() {
            return this.f90011b;
        }

        /* renamed from: b */
        public final int m94007b() {
            return this.f90012c;
        }

        /* renamed from: c */
        public final long m94008c() {
            return this.f90010a;
        }

        /* renamed from: d */
        public final void m94009d(int i11) {
            this.f90011b = i11;
        }

        /* renamed from: e */
        public final void m94010e(int i11) {
            this.f90012c = i11;
        }

        /* renamed from: f */
        public final void m94011f(long j11) {
            this.f90010a = j11;
        }
    }

    /* renamed from: d60.f$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f90013q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f90013q);
        f90009c = m129210a;
    }

    private C17797f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m93999d(long j11, a aVar) {
        AbstractC19074t.m100208f(aVar, "$log");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("undoDeleteCount", aVar.m94006a());
            String jSONObject2 = jSONObject.toString();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109235m(20410, jSONObject2, str, 0, j11, CoreUtility.f89236l);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    private final Map m94000f() {
        Object value = f90009c.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Map) value;
    }

    /* renamed from: b */
    public final void m94001b(long j11, int i11, int i12) {
        if (j11 < 0 || i12 < 48) {
            return;
        }
        try {
            if (!AbstractC20070a.m104315e(i11) || f90008b.getAndIncrement() >= 3) {
                return;
            }
            Map m94000f = m94000f();
            Long valueOf = Long.valueOf(j11);
            a aVar = new a();
            aVar.m94011f(SystemClock.elapsedRealtime());
            aVar.m94010e(i12);
            m94000f.put(valueOf, aVar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m94002c(long j11) {
        final a aVar = (a) m94000f().remove(Long.valueOf(j11));
        if (aVar != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - aVar.m94008c();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: d60.e
                @Override // java.lang.Runnable
                public final void run() {
                    C17797f.m93999d(elapsedRealtime, aVar);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m94003e(long j11) {
        a aVar = (a) m94000f().get(Long.valueOf(j11));
        if (aVar != null && aVar.m94006a() == aVar.m94007b()) {
            m94002c(j11);
        }
    }

    /* renamed from: g */
    public final void m94004g() {
        f90008b.set(0);
    }

    /* renamed from: h */
    public final void m94005h(long j11, int i11) {
        a aVar = (a) m94000f().get(Long.valueOf(j11));
        if (aVar != null) {
            aVar.m94009d(aVar.m94006a() + i11);
        }
    }
}
