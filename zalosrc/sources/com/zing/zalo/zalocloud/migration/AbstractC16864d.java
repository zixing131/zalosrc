package com.zing.zalo.zalocloud.migration;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import ug0.EnumC27248c;
import ug0.EnumC27249d;
import wg0.EnumC28993p;
import wg0.InterfaceC28990m;

/* renamed from: com.zing.zalo.zalocloud.migration.d */
/* loaded from: classes7.dex */
public abstract class AbstractC16864d implements InterfaceC28990m {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final String f85814a;

    /* renamed from: b */
    private final float f85815b;

    /* renamed from: com.zing.zalo.zalocloud.migration.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, EnumC27249d enumC27249d, float f11) {
            super(str, EnumC27248c.f128035p, enumC27249d, true, f11);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final float m90090b(EnumC27249d enumC27249d, float f11) {
            float f12;
            float m116583f;
            float f13 = 0.1f;
            if (enumC27249d == EnumC27249d.f128041p) {
                f12 = 0.0f;
            } else {
                f12 = 0.1f;
                f13 = 0.9f;
            }
            m116583f = AbstractC22543l.m116583f(f12 + (f11 * f13), 1.0f);
            return m116583f;
        }

        /* renamed from: c */
        public final float m90091c(EnumC27249d enumC27249d, float f11) {
            float f12;
            AbstractC19074t.m100208f(enumC27249d, "step");
            float f13 = 0.1f;
            if (enumC27249d == EnumC27249d.f128041p) {
                f12 = 0.0f;
            } else {
                f12 = 0.1f;
                f13 = 0.9f;
            }
            return (f11 - f12) / f13;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, EnumC27249d enumC27249d, float f11) {
            super(str, EnumC27248c.f128037r, enumC27249d, false, f11);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, EnumC27249d enumC27249d, float f11) {
            super(str, EnumC27248c.f128036q, enumC27249d, true, f11);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$e */
    /* loaded from: classes7.dex */
    public static abstract class e extends AbstractC16864d {

        /* renamed from: c */
        private final EnumC27248c f85816c;

        /* renamed from: d */
        private final EnumC27249d f85817d;

        /* renamed from: e */
        private final boolean f85818e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, EnumC27248c enumC27248c, EnumC27249d enumC27249d, boolean z11, float f11) {
            super(str, AbstractC16864d.Companion.m90090b(enumC27249d, f11), null);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27248c, "reason");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
            this.f85816c = enumC27248c;
            this.f85817d = enumC27249d;
            this.f85818e = z11;
        }

        /* renamed from: j */
        public final boolean m90092j() {
            return this.f85818e;
        }

        /* renamed from: k */
        public final EnumC27249d m90093k() {
            return this.f85817d;
        }

        /* renamed from: l */
        public final EnumC27248c m90094l() {
            return this.f85816c;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC16864d {

        /* renamed from: c */
        private final EnumC27249d f85819c;

        /* renamed from: d */
        private final int f85820d;

        /* renamed from: e */
        private final int f85821e;

        /* renamed from: f */
        private final boolean f85822f;

        public /* synthetic */ f(String str, EnumC27249d enumC27249d, int i11, int i12, float f11, boolean z11, int i13, AbstractC19060k abstractC19060k) {
            this(str, enumC27249d, i11, i12, f11, (i13 & 32) != 0 ? false : z11);
        }

        /* renamed from: j */
        public final EnumC27249d m90095j() {
            return this.f85819c;
        }

        /* renamed from: k */
        public final boolean m90096k() {
            return this.f85822f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, EnumC27249d enumC27249d, int i11, int i12, float f11, boolean z11) {
            super(str, AbstractC16864d.Companion.m90090b(enumC27249d, f11), null);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "step");
            this.f85819c = enumC27249d;
            this.f85820d = i11;
            this.f85821e = i12;
            this.f85822f = z11;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$g */
    /* loaded from: classes7.dex */
    public static class g extends AbstractC16864d {

        /* renamed from: c */
        private final boolean f85823c;

        public /* synthetic */ g(String str, EnumC27249d enumC27249d, float f11, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, enumC27249d, f11, (i11 & 8) != 0 ? false : z11);
        }

        /* renamed from: j */
        public final boolean m90097j() {
            return this.f85823c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, EnumC27249d enumC27249d, float f11, boolean z11) {
            super(str, AbstractC16864d.Companion.m90090b(enumC27249d, f11), null);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
            this.f85823c = z11;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC16864d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(str, 0.0f, null);
            AbstractC19074t.m100208f(str, "id");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$i */
    /* loaded from: classes7.dex */
    public static final class i extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, EnumC27249d enumC27249d, float f11) {
            super(str, EnumC27248c.f128038s, enumC27249d, false, f11);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(enumC27249d, "currentStep");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC16864d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(str, 1.0f, null);
            AbstractC19074t.m100208f(str, "id");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC16864d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(str, 0.0f, null);
            AbstractC19074t.m100208f(str, "id");
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.d$l */
    /* loaded from: classes7.dex */
    public /* synthetic */ class l {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85824a;

        static {
            int[] iArr = new int[EnumC27248c.values().length];
            try {
                iArr[EnumC27248c.f128035p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27248c.f128036q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27248c.f128037r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27248c.f128038s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f85824a = iArr;
        }
    }

    public /* synthetic */ AbstractC16864d(String str, float f11, AbstractC19060k abstractC19060k) {
        this(str, f11);
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: a */
    public float mo90080a() {
        return this.f85815b;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: b */
    public boolean mo90081b() {
        return this instanceof g;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: c */
    public boolean mo90082c() {
        return this instanceof h;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: d */
    public boolean mo90083d() {
        return this instanceof e;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: e */
    public EnumC28993p mo90084e() {
        e eVar;
        EnumC27248c enumC27248c;
        int i11;
        if (this instanceof e) {
            eVar = (e) this;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            enumC27248c = eVar.m90094l();
        } else {
            enumC27248c = null;
        }
        if (enumC27248c == null) {
            i11 = -1;
        } else {
            i11 = l.f85824a[enumC27248c.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return EnumC28993p.f134271u;
                }
                return EnumC28993p.f134268r;
            }
            return EnumC28993p.f134267q;
        }
        return EnumC28993p.f134266p;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: f */
    public int mo90085f() {
        String str = this.f85814a;
        if (AbstractC19074t.m100204b(str, "cloud_media_migration")) {
            return 3;
        }
        if (AbstractC19074t.m100204b(str, "my_cloud_migration")) {
            return 2;
        }
        return -1;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: g */
    public boolean mo90086g() {
        return this instanceof k;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: h */
    public boolean mo90087h() {
        return this instanceof j;
    }

    /* renamed from: i */
    public final String m90088i() {
        return this.f85814a;
    }

    @Override // wg0.InterfaceC28990m
    public boolean isRunning() {
        return this instanceof f;
    }

    private AbstractC16864d(String str, float f11) {
        this.f85814a = str;
        this.f85815b = f11;
    }
}
