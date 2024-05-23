package k10;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* renamed from: k10.c */
/* loaded from: classes5.dex */
public final class C21436c {

    /* renamed from: a */
    private String f104454a;

    /* renamed from: b */
    private long f104455b;

    /* renamed from: c */
    private long f104456c;

    /* renamed from: d */
    private boolean f104457d;

    public C21436c(String str, long j11, long j12, boolean z11) {
        AbstractC19074t.m100208f(str, "trackId");
        this.f104454a = str;
        this.f104455b = j11;
        this.f104456c = j12;
        this.f104457d = z11;
    }

    /* renamed from: a */
    public final boolean m110970a() {
        return this.f104457d;
    }

    /* renamed from: b */
    public final void m110971b() {
        this.f104455b = 0L;
    }

    /* renamed from: c */
    public final void m110972c() {
        this.f104457d = false;
        this.f104454a = "";
        this.f104455b = 0L;
        this.f104456c = 0L;
    }

    /* renamed from: d */
    public final void m110973d(boolean z11) {
        this.f104457d = z11;
    }

    /* renamed from: e */
    public final void m110974e(long j11) {
        this.f104455b = j11;
    }

    /* renamed from: f */
    public final void m110975f(long j11) {
        this.f104456c = j11;
    }

    /* renamed from: g */
    public final void m110976g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f104454a = str;
    }

    /* renamed from: h */
    public final void m110977h() {
        this.f104457d = false;
    }

    /* renamed from: i */
    public final Object m110978i(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        if (this.f104457d) {
            long j11 = this.f104455b + 1000;
            this.f104455b = j11;
            if (j11 >= this.f104456c) {
                this.f104455b = 0L;
                Object mo240pC = interfaceC18509p.mo240pC(this.f104454a, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (mo240pC == m142578e) {
                    return mo240pC;
                }
                return C24848g0.f119245a;
            }
        }
        return C24848g0.f119245a;
    }

    public /* synthetic */ C21436c(String str, long j11, long j12, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) == 0 ? j12 : 0L, (i11 & 8) != 0 ? false : z11);
    }
}
