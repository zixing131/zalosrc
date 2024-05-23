package com.zing.zalo.report_v2.reportsummary;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nz.AbstractC23968e;

/* renamed from: com.zing.zalo.report_v2.reportsummary.e */
/* loaded from: classes4.dex */
public abstract class AbstractC9350e {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private final int f49495a;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC9350e {

        /* renamed from: b */
        private String f49496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(5, null);
            AbstractC19074t.m100208f(str, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
            this.f49496b = str;
        }

        /* renamed from: a */
        public final String m50340a() {
            return this.f49496b;
        }

        /* renamed from: b */
        public final void m50341b(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f49496b = str;
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC9350e {

        /* renamed from: b */
        public static final b f49497b = new b();

        private b() {
            super(6, null);
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC9350e {

        /* renamed from: b */
        public static final d f49498b = new d();

        private d() {
            super(2, null);
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC9350e {

        /* renamed from: b */
        private String f49499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1, null);
            AbstractC19074t.m100208f(str, "title");
            this.f49499b = str;
        }

        /* renamed from: a */
        public final String m50342a() {
            return this.f49499b;
        }

        /* renamed from: b */
        public final void m50343b(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f49499b = str;
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.e$f */
    /* loaded from: classes4.dex */
    public static abstract class f extends AbstractC9350e {

        /* renamed from: b */
        private final AbstractC23968e f49500b;

        /* renamed from: c */
        private final String f49501c;

        /* renamed from: d */
        private boolean f49502d;

        /* renamed from: e */
        private boolean f49503e;

        /* renamed from: f */
        private boolean f49504f;

        /* renamed from: com.zing.zalo.report_v2.reportsummary.e$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC23968e abstractC23968e, String str) {
                super(3, abstractC23968e, str, null);
                AbstractC19074t.m100208f(abstractC23968e, "reportReason");
                AbstractC19074t.m100208f(str, "title");
            }
        }

        /* renamed from: com.zing.zalo.report_v2.reportsummary.e$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends f {

            /* renamed from: g */
            private boolean f49505g;

            /* renamed from: h */
            private boolean f49506h;

            /* renamed from: i */
            private String f49507i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC23968e.c cVar, String str) {
                super(4, cVar, str, null);
                AbstractC19074t.m100208f(cVar, "reportReason");
                AbstractC19074t.m100208f(str, "title");
                this.f49505g = true;
            }

            /* renamed from: i */
            public final String m50352i() {
                return this.f49507i;
            }

            /* renamed from: j */
            public final boolean m50353j() {
                return this.f49506h;
            }

            /* renamed from: k */
            public final boolean m50354k() {
                return this.f49505g;
            }

            /* renamed from: l */
            public final void m50355l(String str) {
                this.f49507i = str;
            }

            /* renamed from: m */
            public final void m50356m(boolean z11) {
                this.f49506h = z11;
            }

            /* renamed from: n */
            public final void m50357n(boolean z11) {
                this.f49505g = z11;
            }
        }

        public /* synthetic */ f(int i11, AbstractC23968e abstractC23968e, String str, AbstractC19060k abstractC19060k) {
            this(i11, abstractC23968e, str);
        }

        /* renamed from: a */
        public final boolean m50344a() {
            return this.f49503e;
        }

        /* renamed from: b */
        public final boolean m50345b() {
            return this.f49502d;
        }

        /* renamed from: c */
        public final AbstractC23968e m50346c() {
            return this.f49500b;
        }

        /* renamed from: d */
        public final String m50347d() {
            return this.f49501c;
        }

        /* renamed from: e */
        public final boolean m50348e() {
            return this.f49504f;
        }

        /* renamed from: f */
        public final void m50349f(boolean z11) {
            this.f49503e = z11;
        }

        /* renamed from: g */
        public final void m50350g(boolean z11) {
            this.f49502d = z11;
        }

        /* renamed from: h */
        public final void m50351h(boolean z11) {
            this.f49504f = z11;
        }

        private f(int i11, AbstractC23968e abstractC23968e, String str) {
            super(i11, null);
            this.f49500b = abstractC23968e;
            this.f49501c = str;
            this.f49502d = true;
        }
    }

    public /* synthetic */ AbstractC9350e(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    private AbstractC9350e(int i11) {
        this.f49495a = i11;
    }
}
