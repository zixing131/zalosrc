package p374ny;

import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import tk.InterfaceC26722a;

/* renamed from: ny.a */
/* loaded from: classes4.dex */
public abstract class AbstractC23957a implements InterfaceC26722a {

    /* renamed from: ny.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC23957a {

        /* renamed from: a */
        public static final a f115946a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: ny.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC23957a {

        /* renamed from: a */
        private final AbstractC23958b f115947a;

        /* renamed from: b */
        private final long f115948b;

        /* renamed from: c */
        private final CharSequence f115949c;

        /* renamed from: d */
        private final CharSequence f115950d;

        /* renamed from: e */
        private final String f115951e;

        /* renamed from: f */
        private final c f115952f;

        /* renamed from: g */
        private boolean f115953g;

        /* renamed from: h */
        private boolean f115954h;

        /* renamed from: i */
        private String f115955i;

        public /* synthetic */ b(AbstractC23958b abstractC23958b, long j11, CharSequence charSequence, CharSequence charSequence2, String str, c cVar, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
            this(abstractC23958b, j11, charSequence, charSequence2, str, cVar, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? false : z12);
        }

        /* renamed from: a */
        public final String m125363a() {
            return this.f115955i;
        }

        /* renamed from: b */
        public final AbstractC23958b m125364b() {
            return this.f115947a;
        }

        /* renamed from: c */
        public final long m125365c() {
            return this.f115948b;
        }

        /* renamed from: d */
        public final c m125366d() {
            return this.f115952f;
        }

        /* renamed from: e */
        public final String m125367e() {
            return this.f115951e;
        }

        /* renamed from: f */
        public final CharSequence m125368f() {
            return this.f115950d;
        }

        /* renamed from: g */
        public final CharSequence m125369g() {
            return this.f115949c;
        }

        /* renamed from: h */
        public final boolean m125370h() {
            return this.f115953g;
        }

        /* renamed from: i */
        public final boolean m125371i() {
            return this.f115954h;
        }

        /* renamed from: j */
        public final void m125372j(String str) {
            this.f115955i = str;
        }

        /* renamed from: k */
        public final void m125373k(boolean z11) {
            this.f115953g = z11;
        }

        /* renamed from: l */
        public final void m125374l(boolean z11) {
            this.f115954h = z11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC23958b abstractC23958b, long j11, CharSequence charSequence, CharSequence charSequence2, String str, c cVar, boolean z11, boolean z12) {
            super(null);
            AbstractC19074t.m100208f(abstractC23958b, "data");
            AbstractC19074t.m100208f(charSequence, "topTitle");
            AbstractC19074t.m100208f(charSequence2, "title");
            this.f115947a = abstractC23958b;
            this.f115948b = j11;
            this.f115949c = charSequence;
            this.f115950d = charSequence2;
            this.f115951e = str;
            this.f115952f = cVar;
            this.f115953g = z11;
            this.f115954h = z12;
        }
    }

    /* renamed from: ny.a$c */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: a */
        private final int f115956a;

        /* renamed from: b */
        private final boolean f115957b;

        /* renamed from: c */
        private final int f115958c;

        /* renamed from: d */
        private final int f115959d;

        /* renamed from: ny.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends c {

            /* renamed from: e */
            public static final a f115960e = new a();

            private a() {
                super(AbstractC23322a.zds_ic_wifi_line_24, true, AbstractC2807a.icon_01, AbstractC16803z.ic_thumb_placeholder_normal, null);
            }
        }

        /* renamed from: ny.a$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends c {

            /* renamed from: e */
            public static final b f115961e = new b();

            private b() {
                super(AbstractC23322a.zds_ic_link_line_32, false, AbstractC2807a.icon_02, AbstractC16803z.ic_thumb_placeholder_pressed, null);
            }
        }

        /* renamed from: ny.a$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32911c extends c {

            /* renamed from: e */
            public static final C32911c f115962e = new C32911c();

            private C32911c() {
                super(AbstractC23322a.zds_ic_device_unknown_line_32, false, AbstractC2807a.icon_01, AbstractC16803z.ic_thumb_placeholder_normal, null);
            }
        }

        /* renamed from: ny.a$c$d */
        /* loaded from: classes4.dex */
        public static final class d extends c {

            /* renamed from: e */
            public static final d f115963e = new d();

            private d() {
                super(AbstractC16803z.ic_input_mode_text, true, AbstractC2807a.icon_01, AbstractC16803z.ic_thumb_placeholder_normal, null);
            }
        }

        public /* synthetic */ c(int i11, boolean z11, int i12, int i13, AbstractC19060k abstractC19060k) {
            this(i11, z11, i12, i13);
        }

        /* renamed from: a */
        public final int m125375a() {
            return this.f115959d;
        }

        /* renamed from: b */
        public final int m125376b() {
            return this.f115956a;
        }

        /* renamed from: c */
        public final boolean m125377c() {
            return this.f115957b;
        }

        /* renamed from: d */
        public final int m125378d() {
            return this.f115958c;
        }

        private c(int i11, boolean z11, int i12, int i13) {
            this.f115956a = i11;
            this.f115957b = z11;
            this.f115958c = i12;
            this.f115959d = i13;
        }
    }

    private AbstractC23957a() {
    }

    public /* synthetic */ AbstractC23957a(AbstractC19060k abstractC19060k) {
        this();
    }
}
