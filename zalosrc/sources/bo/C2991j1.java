package bo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: bo.j1 */
/* loaded from: classes4.dex */
public final class C2991j1 {

    /* renamed from: a */
    private String f11816a;

    /* renamed from: b */
    private String f11817b;

    /* renamed from: c */
    private boolean f11818c;

    /* renamed from: d */
    private boolean f11819d;

    /* renamed from: e */
    private boolean f11820e;

    /* renamed from: f */
    private String f11821f;

    public C2991j1(String str, String str2, boolean z11, boolean z12, boolean z13, String str3) {
        AbstractC19074t.m100208f(str, "friendID");
        AbstractC19074t.m100208f(str2, "friendName");
        AbstractC19074t.m100208f(str3, "description");
        this.f11816a = str;
        this.f11817b = str2;
        this.f11818c = z11;
        this.f11819d = z12;
        this.f11820e = z13;
        this.f11821f = str3;
    }

    /* renamed from: a */
    public final String m14179a() {
        return this.f11821f;
    }

    /* renamed from: b */
    public final boolean m14180b() {
        return this.f11819d;
    }

    /* renamed from: c */
    public final boolean m14181c() {
        return this.f11818c;
    }

    /* renamed from: d */
    public final void m14182d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11821f = str;
    }

    /* renamed from: e */
    public final void m14183e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11816a = str;
    }

    /* renamed from: f */
    public final void m14184f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11817b = str;
    }

    /* renamed from: g */
    public final void m14185g(boolean z11) {
        this.f11819d = z11;
    }

    /* renamed from: h */
    public final void m14186h(boolean z11) {
        this.f11818c = z11;
    }

    /* renamed from: i */
    public final void m14187i(boolean z11) {
        this.f11820e = z11;
    }

    public /* synthetic */ C2991j1(String str, String str2, boolean z11, boolean z12, boolean z13, String str3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? "" : str3);
    }
}
