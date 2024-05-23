package com.zing.zalo.zalocloud.migration;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ug0.EnumC27250e;

/* renamed from: com.zing.zalo.zalocloud.migration.f */
/* loaded from: classes7.dex */
public abstract class AbstractC16866f {

    /* renamed from: a */
    private final float f85828a;

    /* renamed from: com.zing.zalo.zalocloud.migration.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85829b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC27250e enumC27250e, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85829b = enumC27250e;
        }

        /* renamed from: b */
        public final EnumC27250e m90102b() {
            return this.f85829b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC27250e enumC27250e, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85830b = enumC27250e;
        }

        /* renamed from: b */
        public final EnumC27250e m90103b() {
            return this.f85830b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85831b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC27250e enumC27250e, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85831b = enumC27250e;
        }

        /* renamed from: b */
        public final EnumC27250e m90104b() {
            return this.f85831b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85832b;

        /* renamed from: c */
        private final int f85833c;

        /* renamed from: d */
        private final int f85834d;

        /* renamed from: e */
        private final int f85835e;

        /* renamed from: f */
        private final int f85836f;

        /* renamed from: g */
        private final String f85837g;

        /* renamed from: h */
        private final int f85838h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC27250e enumC27250e, int i11, int i12, int i13, int i14, String str, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "step");
            AbstractC19074t.m100208f(str, "logMsg");
            this.f85832b = enumC27250e;
            this.f85833c = i11;
            this.f85834d = i12;
            this.f85835e = i13;
            this.f85836f = i14;
            this.f85837g = str;
            this.f85838h = i11 != i12 ? (int) ((i11 / i12) * 100) : 100;
        }

        /* renamed from: b */
        public final int m90105b() {
            return this.f85835e;
        }

        /* renamed from: c */
        public final EnumC27250e m90106c() {
            return this.f85832b;
        }

        /* renamed from: d */
        public final int m90107d() {
            return this.f85838h;
        }

        /* renamed from: e */
        public final int m90108e() {
            return this.f85836f;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85839b;

        /* renamed from: c */
        private final int f85840c;

        /* renamed from: d */
        private final int f85841d;

        /* renamed from: e */
        private final int f85842e;

        /* renamed from: f */
        private final int f85843f;

        /* renamed from: g */
        private final boolean f85844g;

        /* renamed from: h */
        private final boolean f85845h;

        public /* synthetic */ e(EnumC27250e enumC27250e, int i11, int i12, int i13, int i14, boolean z11, boolean z12, float f11, int i15, AbstractC19060k abstractC19060k) {
            this(enumC27250e, i11, i12, i13, i14, (i15 & 32) != 0 ? false : z11, (i15 & 64) != 0 ? false : z12, f11);
        }

        /* renamed from: b */
        public final int m90109b() {
            return this.f85842e;
        }

        /* renamed from: c */
        public final int m90110c() {
            return this.f85843f;
        }

        /* renamed from: d */
        public final EnumC27250e m90111d() {
            return this.f85839b;
        }

        /* renamed from: e */
        public final int m90112e() {
            return this.f85840c;
        }

        /* renamed from: f */
        public final int m90113f() {
            return this.f85841d;
        }

        /* renamed from: g */
        public final boolean m90114g() {
            return this.f85844g;
        }

        /* renamed from: h */
        public final boolean m90115h() {
            return this.f85845h;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC27250e enumC27250e, int i11, int i12, int i13, int i14, boolean z11, boolean z12, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85839b = enumC27250e;
            this.f85840c = i11;
            this.f85841d = i12;
            this.f85842e = i13;
            this.f85843f = i14;
            this.f85844g = z11;
            this.f85845h = z12;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC27250e enumC27250e, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85846b = enumC27250e;
        }

        /* renamed from: b */
        public final EnumC27250e m90116b() {
            return this.f85846b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC16866f {

        /* renamed from: b */
        private final EnumC27250e f85847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC27250e enumC27250e, float f11) {
            super(f11, null);
            AbstractC19074t.m100208f(enumC27250e, "lastProgressStep");
            this.f85847b = enumC27250e;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.f$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC16866f {

        /* renamed from: b */
        public static final h f85848b = new h();

        private h() {
            super(1.0f, null);
        }
    }

    public /* synthetic */ AbstractC16866f(float f11, AbstractC19060k abstractC19060k) {
        this(f11);
    }

    /* renamed from: a */
    public final float m90101a() {
        return this.f85828a;
    }

    private AbstractC16866f(float f11) {
        this.f85828a = f11;
    }
}
