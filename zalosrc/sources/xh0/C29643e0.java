package xh0;

import am.C0928o0;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: xh0.e0 */
/* loaded from: classes7.dex */
public final class C29643e0 {

    /* renamed from: a */
    public static final C29643e0 f136888a = new C29643e0();

    /* renamed from: b */
    private static final InterfaceC24854k f136889b;

    /* renamed from: c */
    private static int f136890c;

    /* renamed from: xh0.e0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f136891q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            return Boolean.valueOf(m147398a());
        }

        /* renamed from: a */
        public final boolean m147398a() {
            return C0928o0.m4433b("CAMERA_SHARE_SURFACE", false, false, 4, null);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f136891q);
        f136889b = m129210a;
        f136890c = -1;
    }

    private C29643e0() {
    }

    /* renamed from: a */
    public static final int m147392a() {
        return f136890c;
    }

    /* renamed from: b */
    private final boolean m147393b() {
        return ((Boolean) f136889b.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final boolean m147394c() {
        return false;
    }

    /* renamed from: d */
    public static final boolean m147395d() {
        return f136888a.m147393b();
    }

    /* renamed from: e */
    public static final void m147396e(int i11) {
        f136890c = i11;
    }

    /* renamed from: f */
    public final void m147397f(boolean z11) {
        C0928o0.m4442k("CAMERA_SHARE_SURFACE", z11, false, 4, null);
    }
}
