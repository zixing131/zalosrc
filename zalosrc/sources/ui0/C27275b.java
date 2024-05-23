package ui0;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2816j;
import fn0.AbstractC19074t;

/* renamed from: ui0.b */
/* loaded from: classes7.dex */
public final class C27275b {

    /* renamed from: a */
    public static final C27275b f128316a = new C27275b();

    /* renamed from: ui0.b$a */
    /* loaded from: classes7.dex */
    public enum a {
        GR60GR40(AbstractC2808b.gr60, AbstractC2808b.gr40),
        B60B40(AbstractC2808b.f150821b60, AbstractC2808b.f150819b40),
        PU60B50(AbstractC2808b.pu60, AbstractC2808b.f150820b50),
        SKB60GR50(AbstractC2808b.skb60, AbstractC2808b.gr50),
        OR60Y60(AbstractC2808b.or60, AbstractC2808b.f150839y60),
        PU60PK30(AbstractC2808b.pu60, AbstractC2808b.pk30),
        R60OR50(AbstractC2808b.f150830r60, AbstractC2808b.or50),
        PK60PK30(AbstractC2808b.pk60, AbstractC2808b.pk30);


        /* renamed from: p */
        private final int f128326p;

        /* renamed from: q */
        private final int f128327q;

        /* renamed from: r */
        private int f128328r;

        /* renamed from: s */
        private int f128329s;

        a(int i11, int i12) {
            this.f128326p = i11;
            this.f128327q = i12;
        }

        /* renamed from: c */
        public final int m139646c(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (this.f128329s == 0) {
                this.f128329s = AbstractC1401h.m7080d(context.getResources(), this.f128327q, context.getTheme());
            }
            return this.f128329s;
        }

        /* renamed from: d */
        public final int m139647d(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (this.f128328r == 0) {
                this.f128328r = AbstractC1401h.m7080d(context.getResources(), this.f128326p, context.getTheme());
            }
            return this.f128328r;
        }
    }

    private C27275b() {
    }

    /* renamed from: c */
    public static /* synthetic */ int m139639c(C27275b c27275b, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return c27275b.m139641b(context, i11, typedValue, z11);
    }

    /* renamed from: a */
    public final a m139640a(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        if (TextUtils.isEmpty(str)) {
            return a.B60B40;
        }
        a[] values = a.values();
        int abs = Math.abs(str.hashCode()) % values.length;
        if (abs >= 0 && abs < values.length) {
            int i11 = 0;
            int i12 = abs + (z11 ? 1 : 0);
            if (i12 < values.length) {
                i11 = i12;
            }
            return values[i11];
        }
        return a.B60B40;
    }

    /* renamed from: b */
    public final int m139641b(Context context, int i11, TypedValue typedValue, boolean z11) {
        AbstractC19074t.m100208f(context, "<this>");
        AbstractC19074t.m100208f(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    /* renamed from: d */
    public final int[] m139642d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        int m13592a = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.avatar_story_contour_color_seen);
        return new int[]{m13592a, m13592a};
    }

    /* renamed from: e */
    public final int[] m139643e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return new int[]{AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.old_avatar_stroke_start_color, context.getTheme()), AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.old_avatar_stroke_end_color, context.getTheme())};
    }

    /* renamed from: f */
    public final int[] m139644f(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return new int[]{AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.skb50_a0, context.getTheme()), AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.f150821b60, context.getTheme())};
    }
}
