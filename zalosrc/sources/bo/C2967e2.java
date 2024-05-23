package bo;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import com.zing.zalo.feed.models.MemoryEntryTrackingData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.C24848g0;
import rn0.AbstractC25935a;
import un0.AbstractC27323a;

/* renamed from: bo.e2 */
/* loaded from: classes4.dex */
public final class C2967e2 {

    /* renamed from: a */
    public static final C2967e2 f11729a;

    /* renamed from: b */
    private static MemoryEntryTrackingData f11730b;

    /* renamed from: c */
    private static boolean f11731c;

    static {
        C2967e2 c2967e2 = new C2967e2();
        f11729a = c2967e2;
        f11730b = c2967e2.m14034d();
    }

    private C2967e2() {
    }

    /* renamed from: d */
    private final MemoryEntryTrackingData m14034d() {
        String m3040F3 = AbstractC0924m0.m3040F3();
        AbstractC19074t.m100205c(m3040F3);
        if (m3040F3.length() > 0) {
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            aVar.mo131586a();
            return (MemoryEntryTrackingData) aVar.m139867d(AbstractC25935a.m133630u(MemoryEntryTrackingData.Companion.serializer()), m3040F3);
        }
        return null;
    }

    /* renamed from: i */
    private final void m14035i() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: bo.d2
            @Override // java.lang.Runnable
            public final void run() {
                C2967e2.m14036j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m14036j() {
        C24848g0 c24848g0;
        if (f11730b != null) {
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            MemoryEntryTrackingData memoryEntryTrackingData = f11730b;
            aVar.mo131586a();
            AbstractC0924m0.m3086Gk(aVar.mo131597b(AbstractC25935a.m133630u(MemoryEntryTrackingData.Companion.serializer()), memoryEntryTrackingData));
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            AbstractC0924m0.m3086Gk("");
        }
    }

    /* renamed from: b */
    public final void m14037b() {
        f11731c = true;
    }

    /* renamed from: c */
    public final MemoryEntryTrackingData m14038c() {
        if (f11731c) {
            f11730b = m14034d();
            f11731c = false;
        }
        return f11730b;
    }

    /* renamed from: e */
    public final void m14039e(String str) {
        AbstractC19074t.m100208f(str, "memoryEntryId");
        MemoryEntryTrackingData memoryEntryTrackingData = f11730b;
        if (memoryEntryTrackingData != null && AbstractC19074t.m100204b(memoryEntryTrackingData.m45094a(), str)) {
            memoryEntryTrackingData.m45098e(true);
            f11729a.m14035i();
        }
    }

    /* renamed from: f */
    public final void m14040f(String str) {
        AbstractC19074t.m100208f(str, "memoryEntryId");
        MemoryEntryTrackingData memoryEntryTrackingData = f11730b;
        if (memoryEntryTrackingData != null && AbstractC19074t.m100204b(memoryEntryTrackingData.m45094a(), str)) {
            memoryEntryTrackingData.m45099f(memoryEntryTrackingData.m45095b() + 1);
            f11729a.m14035i();
        }
    }

    /* renamed from: g */
    public final void m14041g(String str) {
        AbstractC19074t.m100208f(str, "memoryEntryId");
        f11730b = new MemoryEntryTrackingData(str, 0, false, 0L, 14, (AbstractC19060k) null);
        m14035i();
    }

    /* renamed from: h */
    public final void m14042h() {
        f11730b = null;
        m14035i();
    }
}
