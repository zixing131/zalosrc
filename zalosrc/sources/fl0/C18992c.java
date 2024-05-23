package fl0;

import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.utils.C17206r;
import fn0.AbstractC19060k;
import jk0.C21282a;

/* renamed from: fl0.c */
/* loaded from: classes7.dex */
public final class C18992c {

    /* renamed from: a */
    private final int f94804a;

    /* renamed from: b */
    private final int f94805b;

    /* renamed from: c */
    private final int f94806c;

    /* renamed from: d */
    private final int f94807d;

    /* renamed from: e */
    private final String f94808e;

    /* renamed from: f */
    private final int f94809f;

    /* renamed from: g */
    private final InterfaceC17139d f94810g;

    /* renamed from: h */
    private final float f94811h;

    /* renamed from: i */
    private final float f94812i;

    /* renamed from: j */
    private final float f94813j;

    /* renamed from: k */
    private final int f94814k;

    public C18992c(int i11, int i12, int i13, int i14, String str, int i15, InterfaceC17139d interfaceC17139d, float f11, float f12, float f13, int i16) {
        this.f94804a = i11;
        this.f94805b = i12;
        this.f94806c = i13;
        this.f94807d = i14;
        this.f94808e = str;
        this.f94809f = i15;
        this.f94810g = interfaceC17139d;
        this.f94811h = f11;
        this.f94812i = f12;
        this.f94813j = f13;
        this.f94814k = i16;
    }

    /* renamed from: a */
    public final boolean m99716a() {
        C21282a m110239a = C21282a.Companion.m110239a();
        if (C17206r.m91844b(m110239a.m110232c(), this.f94811h, 0.0d, 4, null) && C17206r.m91844b(m110239a.m110234e(), this.f94812i, 0.0d, 4, null) && C17206r.m91844b(m110239a.m110233d(), this.f94813j, 0.0d, 4, null) && m110239a.m110231a() == this.f94814k) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final float m99717b() {
        return this.f94811h;
    }

    /* renamed from: c */
    public final float m99718c() {
        return this.f94813j;
    }

    /* renamed from: d */
    public final int m99719d() {
        return this.f94814k;
    }

    /* renamed from: e */
    public final int m99720e() {
        return this.f94805b;
    }

    /* renamed from: f */
    public final InterfaceC17139d m99721f() {
        return this.f94810g;
    }

    /* renamed from: g */
    public final String m99722g() {
        return this.f94808e;
    }

    /* renamed from: h */
    public final int m99723h() {
        return this.f94806c;
    }

    /* renamed from: i */
    public final int m99724i() {
        return this.f94807d;
    }

    /* renamed from: j */
    public final float m99725j() {
        return this.f94812i;
    }

    /* renamed from: k */
    public final int m99726k() {
        return this.f94809f;
    }

    /* renamed from: l */
    public final int m99727l() {
        return this.f94804a;
    }

    public /* synthetic */ C18992c(int i11, int i12, int i13, int i14, String str, int i15, InterfaceC17139d interfaceC17139d, float f11, float f12, float f13, int i16, int i17, AbstractC19060k abstractC19060k) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? null : str, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) == 0 ? interfaceC17139d : null, (i17 & 128) != 0 ? 1.0f : f11, (i17 & 256) != 0 ? 1.0f : f12, (i17 & 512) == 0 ? f13 : 1.0f, (i17 & 1024) == 0 ? i16 : 0);
    }
}
