package gu;

import android.os.Build;
import fn0.AbstractC19060k;

/* renamed from: gu.a */
/* loaded from: classes.dex */
public abstract class AbstractC19601a {
    public static final a Companion = new a(null);

    /* renamed from: gu.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m102573a(int i11) {
            return Build.VERSION.SDK_INT >= 23 ? i11 | 67108864 : i11;
        }

        /* renamed from: b */
        public final int m102574b(int i11) {
            return Build.VERSION.SDK_INT >= 23 ? i11 | 33554432 : i11;
        }
    }

    /* renamed from: a */
    public static final int m102571a(int i11) {
        return Companion.m102573a(i11);
    }

    /* renamed from: b */
    public static final int m102572b(int i11) {
        return Companion.m102574b(i11);
    }
}
