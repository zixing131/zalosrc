package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.AbstractC1425i;
import androidx.core.util.AbstractC1487i;

/* renamed from: androidx.core.provider.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1460g {

    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final int f6317a;

        /* renamed from: b */
        private final b[] f6318b;

        public a(int i11, b[] bVarArr) {
            this.f6317a = i11;
            this.f6318b = bVarArr;
        }

        /* renamed from: a */
        public static a m7405a(int i11, b[] bVarArr) {
            return new a(i11, bVarArr);
        }

        /* renamed from: b */
        public b[] m7406b() {
            return this.f6318b;
        }

        /* renamed from: c */
        public int m7407c() {
            return this.f6317a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f6319a;

        /* renamed from: b */
        private final int f6320b;

        /* renamed from: c */
        private final int f6321c;

        /* renamed from: d */
        private final boolean f6322d;

        /* renamed from: e */
        private final int f6323e;

        public b(Uri uri, int i11, int i12, boolean z11, int i13) {
            this.f6319a = (Uri) AbstractC1487i.m7492g(uri);
            this.f6320b = i11;
            this.f6321c = i12;
            this.f6322d = z11;
            this.f6323e = i13;
        }

        /* renamed from: a */
        public static b m7408a(Uri uri, int i11, int i12, boolean z11, int i13) {
            return new b(uri, i11, i12, z11, i13);
        }

        /* renamed from: b */
        public int m7409b() {
            return this.f6323e;
        }

        /* renamed from: c */
        public int m7410c() {
            return this.f6320b;
        }

        /* renamed from: d */
        public Uri m7411d() {
            return this.f6319a;
        }

        /* renamed from: e */
        public int m7412e() {
            return this.f6321c;
        }

        /* renamed from: f */
        public boolean m7413f() {
            return this.f6322d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: classes2.dex */
    public static class c {
        /* renamed from: a */
        public abstract void mo7262a(int i11);

        /* renamed from: b */
        public abstract void mo7263b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m7402a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return AbstractC1425i.m7256b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static a m7403b(Context context, CancellationSignal cancellationSignal, C1458e c1458e) {
        return AbstractC1457d.m7380e(context, c1458e, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m7404c(Context context, C1458e c1458e, int i11, boolean z11, int i12, Handler handler, c cVar) {
        C1454a c1454a = new C1454a(cVar, handler);
        if (z11) {
            return AbstractC1459f.m7396e(context, c1458e, c1454a, i11, i12);
        }
        return AbstractC1459f.m7395d(context, c1458e, i11, null, c1454a);
    }
}
