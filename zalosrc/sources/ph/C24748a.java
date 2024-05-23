package ph;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p173fz.C19172a;

/* renamed from: ph.a */
/* loaded from: classes.dex */
public final class C24748a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f118829a;

    /* renamed from: b */
    private boolean f118830b;

    /* renamed from: c */
    private boolean f118831c;

    /* renamed from: d */
    private boolean f118832d;

    /* renamed from: e */
    private boolean f118833e;

    /* renamed from: f */
    private int f118834f;

    /* renamed from: ph.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24748a m128552a() {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            if (C19172a.m100600k("reaction_ui@enable", 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (C19172a.m100600k("reaction_ui@enable_undo_reaction_message_type", 0) > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (C19172a.m100600k("reaction_ui@enable_system", 0) > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (C19172a.m100600k("reaction_ui@show_reaction_on_detail", 0) > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (C19172a.m100600k("reaction_ui@show_remove_in_detail", 0) > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            return new C24748a(z11, z12, z13, z14, z15, C19172a.m100600k("reaction_ui@load_by_range", 0));
        }
    }

    public C24748a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        this.f118829a = z11;
        this.f118830b = z12;
        this.f118831c = z13;
        this.f118832d = z14;
        this.f118833e = z15;
        this.f118834f = i11;
    }

    /* renamed from: a */
    public final void m128543a(C24748a c24748a) {
        AbstractC19074t.m100208f(c24748a, "customReactionConfig");
        this.f118829a = c24748a.f118829a;
        this.f118830b = c24748a.f118830b;
        this.f118831c = c24748a.f118831c;
        this.f118832d = c24748a.f118832d;
        this.f118833e = c24748a.f118833e;
        this.f118834f = c24748a.f118834f;
    }

    /* renamed from: b */
    public final boolean m128544b() {
        return this.f118829a;
    }

    /* renamed from: c */
    public final boolean m128545c() {
        if (m128544b() && !this.f118832d) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m128546d() {
        if (m128544b() && this.f118831c) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m128547e() {
        if (m128544b() && this.f118833e) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m128548f() {
        if (m128547e() && this.f118830b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m128549g() {
        return this.f118834f >= 2;
    }

    /* renamed from: h */
    public final boolean m128550h() {
        int i11 = this.f118834f;
        return i11 == 1 || i11 == 3;
    }

    /* renamed from: i */
    public final boolean m128551i() {
        return this.f118834f <= 3;
    }

    public /* synthetic */ C24748a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? 0 : i11);
    }
}
