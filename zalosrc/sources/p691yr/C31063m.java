package p691yr;

import android.content.Context;
import com.zing.zalo.feed.data.NumberTheme;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: yr.m */
/* loaded from: classes4.dex */
public final class C31063m {

    /* renamed from: a */
    public static final C31063m f143208a = new C31063m();

    /* renamed from: b */
    private static final C31058h f143209b = new C31058h(1, null, true, "16691", "/-heart", new NumberTheme(-9253, -11403264), new NumberTheme(-14393, -9764864), null, null, null, 898, null);

    /* renamed from: yr.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f143210p = new a("VIEW_FULL", 0);

        /* renamed from: q */
        public static final a f143211q = new a("TIMELINE", 1);

        /* renamed from: r */
        public static final a f143212r = new a("TIMELINE_GROUP", 2);

        /* renamed from: s */
        public static final a f143213s = new a("FEED_DETAIL", 3);

        /* renamed from: t */
        public static final a f143214t = new a("PROFILE", 4);

        /* renamed from: u */
        public static final a f143215u = new a("DEFAULT", 5);

        /* renamed from: v */
        private static final /* synthetic */ a[] f143216v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f143217w;

        static {
            a[] m150964b = m150964b();
            f143216v = m150964b;
            f143217w = AbstractC30166b.m148796a(m150964b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m150964b() {
            return new a[]{f143210p, f143211q, f143212r, f143213s, f143214t, f143215u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f143216v.clone();
        }
    }

    /* renamed from: yr.m$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f143218a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f143210p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f143213s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f143211q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f143212r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f143218a = iArr;
        }
    }

    private C31063m() {
    }

    /* renamed from: a */
    public final AbstractC31062l m150961a(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        int i11 = b.f143218a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                return new C31053c(context);
            }
            return new C31054d(context);
        }
        return new C31067q(context);
    }

    /* renamed from: b */
    public final C31058h m150962b() {
        return f143209b;
    }

    /* renamed from: c */
    public final AbstractC31062l m150963c(Context context, a aVar, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        int i11 = b.f143218a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                if (z11) {
                    return new C31055e(context);
                }
                return new C31056f(context);
            }
            if (z11) {
                return new C31055e(context);
            }
            return new C31057g(context);
        }
        if (z11) {
            return new C31068r(context);
        }
        return new C31069s(context);
    }
}
