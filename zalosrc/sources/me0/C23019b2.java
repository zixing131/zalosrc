package me0;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: me0.b2 */
/* loaded from: classes4.dex */
public final class C23019b2 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final int f111983a;

    /* renamed from: b */
    public final boolean f111984b;

    /* renamed from: me0.b2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m118018a() {
            b.f111985a.m118019a(new C23019b2(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.b2$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f111985a = new b();

        /* renamed from: b */
        private static C23019b2 f111986b = new C23019b2(null);

        private b() {
        }

        /* renamed from: a */
        public final void m118019a(C23019b2 c23019b2) {
            AbstractC19074t.m100208f(c23019b2, "<set-?>");
            f111986b = c23019b2;
        }
    }

    public /* synthetic */ C23019b2(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public static final void m118017a() {
        Companion.m118018a();
    }

    private C23019b2() {
        ZMediaPlayerSettings.ENABLE_FEATURE_BLUR_TOP_BOTTOM = false;
        this.f111984b = false;
        this.f111983a = 1;
    }
}
