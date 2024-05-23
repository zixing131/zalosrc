package com.zing.zalo.utils.systemui;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.utils.systemui.g */
/* loaded from: classes.dex */
public final class C16769g {

    /* renamed from: a */
    private final int f85063a;

    /* renamed from: b */
    private final boolean f85064b;

    /* renamed from: c */
    private final Integer f85065c;

    /* renamed from: d */
    private final Integer f85066d;

    /* renamed from: e */
    private final Integer f85067e;

    /* renamed from: f */
    private final Boolean f85068f;

    /* renamed from: g */
    private final Boolean f85069g;

    /* renamed from: h */
    private final Boolean f85070h;

    /* renamed from: i */
    private final Boolean f85071i;

    /* renamed from: j */
    private final Integer f85072j;

    /* renamed from: k */
    private final String f85073k;

    /* renamed from: com.zing.zalo.utils.systemui.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private int f85074a;

        /* renamed from: b */
        private boolean f85075b;

        /* renamed from: c */
        private Integer f85076c;

        /* renamed from: d */
        private Integer f85077d;

        /* renamed from: e */
        private Integer f85078e;

        /* renamed from: f */
        private Boolean f85079f;

        /* renamed from: g */
        private Boolean f85080g;

        /* renamed from: h */
        private Boolean f85081h;

        /* renamed from: i */
        private Boolean f85082i;

        /* renamed from: j */
        private Integer f85083j;

        /* renamed from: k */
        private String f85084k;

        public a(int i11, boolean z11, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num4, String str) {
            this.f85074a = i11;
            this.f85075b = z11;
            this.f85076c = num;
            this.f85077d = num2;
            this.f85078e = num3;
            this.f85079f = bool;
            this.f85080g = bool2;
            this.f85081h = bool3;
            this.f85082i = bool4;
            this.f85083j = num4;
            this.f85084k = str;
        }

        /* renamed from: a */
        public final C16769g m89501a() {
            return new C16769g(this.f85074a, this.f85075b, this.f85076c, this.f85077d, this.f85078e, this.f85079f, this.f85080g, this.f85081h, this.f85082i, this.f85083j, this.f85084k);
        }

        /* renamed from: b */
        public final a m89502b(Boolean bool) {
            this.f85081h = bool;
            return this;
        }

        /* renamed from: c */
        public final a m89503c(Boolean bool) {
            this.f85080g = bool;
            return this;
        }

        /* renamed from: d */
        public final a m89504d(Integer num) {
            this.f85077d = num;
            return this;
        }

        /* renamed from: e */
        public final a m89505e(Integer num) {
            this.f85078e = num;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C16769g c16769g) {
            this(c16769g.m89491b(), c16769g.m89496g(), c16769g.m89494e(), c16769g.m89492c(), c16769g.m89493d(), c16769g.m89500k(), c16769g.m89499j(), c16769g.m89498i(), c16769g.m89497h(), c16769g.m89495f(), c16769g.m89490a());
            AbstractC19074t.m100208f(c16769g, "fromState");
        }
    }

    public C16769g(int i11, boolean z11, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num4, String str) {
        this.f85063a = i11;
        this.f85064b = z11;
        this.f85065c = num;
        this.f85066d = num2;
        this.f85067e = num3;
        this.f85068f = bool;
        this.f85069g = bool2;
        this.f85070h = bool3;
        this.f85071i = bool4;
        this.f85072j = num4;
        this.f85073k = str;
    }

    /* renamed from: a */
    public final String m89490a() {
        return this.f85073k;
    }

    /* renamed from: b */
    public final int m89491b() {
        return this.f85063a;
    }

    /* renamed from: c */
    public final Integer m89492c() {
        return this.f85066d;
    }

    /* renamed from: d */
    public final Integer m89493d() {
        return this.f85067e;
    }

    /* renamed from: e */
    public final Integer m89494e() {
        return this.f85065c;
    }

    /* renamed from: f */
    public final Integer m89495f() {
        return this.f85072j;
    }

    /* renamed from: g */
    public final boolean m89496g() {
        return this.f85064b;
    }

    /* renamed from: h */
    public final Boolean m89497h() {
        return this.f85071i;
    }

    /* renamed from: i */
    public final Boolean m89498i() {
        return this.f85070h;
    }

    /* renamed from: j */
    public final Boolean m89499j() {
        return this.f85069g;
    }

    /* renamed from: k */
    public final Boolean m89500k() {
        return this.f85068f;
    }

    public /* synthetic */ C16769g(int i11, boolean z11, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num4, String str, int i12, AbstractC19060k abstractC19060k) {
        this(i11, z11, num, num2, num3, bool, bool2, bool3, bool4, num4, (i12 & 1024) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16769g(int i11, SystemUI systemUI) {
        this(i11, systemUI.m89417F(), systemUI.m89414B(), systemUI.m89436y(), systemUI.m89437z(), systemUI.m89422M(), systemUI.m89421K(), systemUI.m89420J(), systemUI.m89419I(), systemUI.m89415C(), systemUI.m89434u());
        AbstractC19074t.m100208f(systemUI, "systemUI");
    }
}
