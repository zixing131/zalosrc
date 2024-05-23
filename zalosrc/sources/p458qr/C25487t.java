package p458qr;

import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: qr.t */
/* loaded from: classes4.dex */
public final class C25487t {

    /* renamed from: a */
    public static final C25487t f122084a = new C25487t();

    /* renamed from: b */
    private static a f122085b = a.f122093q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: qr.t$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: F */
        private static final /* synthetic */ a[] f122091F;

        /* renamed from: G */
        private static final /* synthetic */ InterfaceC30165a f122092G;

        /* renamed from: p */
        private final int f122103p;

        /* renamed from: q */
        public static final a f122093q = new a("UNDEFINED", 0, 0);

        /* renamed from: r */
        public static final a f122094r = new a("PULL_REFRESH", 1, 1);

        /* renamed from: s */
        public static final a f122095s = new a("CLICK_BADGE_NEW_FEED", 2, 2);

        /* renamed from: t */
        public static final a f122096t = new a("CLICK_TAB_TIMELINE_OR_SWITCH_TAB_MAIN_AND_OTHER", 3, 3);

        /* renamed from: u */
        public static final a f122097u = new a("SCROLL_TOP_TIMELINE_WITH_BADGE_NEW_FEED", 4, 4);

        /* renamed from: v */
        public static final a f122098v = new a("CHANGE_LANGUAGE", 5, 5);

        /* renamed from: w */
        public static final a f122099w = new a("HIDE_OR_UNHIDE_FRIEND_FEED", 6, 6);

        /* renamed from: x */
        public static final a f122100x = new a("ADD_OR_REMOVE_FRIEND", 7, 7);

        /* renamed from: y */
        public static final a f122101y = new a("LOAD_MORE_TIMELINE", 8, 8);

        /* renamed from: z */
        public static final a f122102z = new a("CHANGE_USERNAME", 9, 9);

        /* renamed from: A */
        public static final a f122086A = new a("CHANGE_AVATAR", 10, 10);

        /* renamed from: B */
        public static final a f122087B = new a("MOVE_USER_TO_DIFFERENT_TAB", 11, 11);

        /* renamed from: C */
        public static final a f122088C = new a("CHANGE_SETTING_ENABLE_FILTER_TIMELINE", 12, 12);

        /* renamed from: D */
        public static final a f122089D = new a("CLICK_BADGE_NEW_STORY", 13, 13);

        /* renamed from: E */
        public static final a f122090E = new a("FORCE_REFRESH_CONTENT_TIMELINE", 14, 15);

        static {
            a[] m132029b = m132029b();
            f122091F = m132029b;
            f122092G = AbstractC30166b.m148796a(m132029b);
        }

        private a(String str, int i11, int i12) {
            this.f122103p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m132029b() {
            return new a[]{f122093q, f122094r, f122095s, f122096t, f122097u, f122098v, f122099w, f122100x, f122101y, f122102z, f122086A, f122087B, f122088C, f122089D, f122090E};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f122091F.clone();
        }

        /* renamed from: c */
        public final int m132030c() {
            return this.f122103p;
        }
    }

    private C25487t() {
    }

    /* renamed from: a */
    public final a m132026a() {
        return f122085b;
    }

    /* renamed from: b */
    public final void m132027b() {
        f122085b = a.f122093q;
    }

    /* renamed from: c */
    public final void m132028c(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        f122085b = aVar;
    }
}
