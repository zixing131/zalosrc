package yj0;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: yj0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC31001d extends C1923p {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private final int f143028q;

    /* renamed from: yj0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final RecyclerView.AbstractC1898y m150726a(Context context, boolean z11, int i11) {
            if (z11) {
                return new b(context, i11);
            }
            return new c(context, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yj0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC31001d {
        public b(Context context, int i11) {
            super(context, i11, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yj0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC31001d {
        public c(Context context, int i11) {
            super(context, i11, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public /* synthetic */ AbstractC31001d(Context context, int i11, AbstractC19060k abstractC19060k) {
        this(context, i11);
    }

    /* renamed from: D */
    public static final RecyclerView.AbstractC1898y m150725D(Context context, boolean z11, int i11) {
        return Companion.m150726a(context, z11, i11);
    }

    @Override // androidx.recyclerview.widget.C1923p
    /* renamed from: s */
    public int mo10620s(int i11, int i12, int i13, int i14, int i15) {
        if (i15 != 1) {
            if (i15 != 2) {
                return i13 - i11;
            }
            return i14 - i12;
        }
        return (((i14 - i13) / 2) - ((i12 - i11) / 2)) - i11;
    }

    @Override // androidx.recyclerview.widget.C1923p
    /* renamed from: z */
    protected int mo10625z() {
        return this.f143028q;
    }

    private AbstractC31001d(Context context, int i11) {
        super(context);
        this.f143028q = i11;
    }
}
