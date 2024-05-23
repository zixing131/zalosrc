package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.provider.AbstractC1460g;
import p665y0.C30243e;

/* renamed from: androidx.core.graphics.i */
/* loaded from: classes2.dex */
public abstract class AbstractC1425i {

    /* renamed from: a */
    private static final AbstractC1431o f6239a;

    /* renamed from: b */
    private static final C30243e f6240b;

    /* renamed from: androidx.core.graphics.i$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC1460g.c {

        /* renamed from: a */
        private AbstractC1401h.e f6241a;

        public a(AbstractC1401h.e eVar) {
            this.f6241a = eVar;
        }

        @Override // androidx.core.provider.AbstractC1460g.c
        /* renamed from: a */
        public void mo7262a(int i11) {
            AbstractC1401h.e eVar = this.f6241a;
            if (eVar != null) {
                eVar.m7098f(i11);
            }
        }

        @Override // androidx.core.provider.AbstractC1460g.c
        /* renamed from: b */
        public void mo7263b(Typeface typeface) {
            AbstractC1401h.e eVar = this.f6241a;
            if (eVar != null) {
                eVar.m7099g(typeface);
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f6239a = new C1430n();
        } else if (i11 >= 28) {
            f6239a = new C1429m();
        } else if (i11 >= 26) {
            f6239a = new C1428l();
        } else if (i11 >= 24 && C1427k.m7273j()) {
            f6239a = new C1427k();
        } else {
            f6239a = new C1426j();
        }
        f6240b = new C30243e(16);
    }

    /* renamed from: a */
    public static Typeface m7255a(Context context, Typeface typeface, int i11) {
        if (context != null) {
            return Typeface.create(typeface, i11);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m7256b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11) {
        return f6239a.mo7270b(context, cancellationSignal, bVarArr, i11);
    }

    /* renamed from: c */
    public static Typeface m7257c(Context context, AbstractC1398e.b bVar, Resources resources, int i11, String str, int i12, int i13, AbstractC1401h.e eVar, Handler handler, boolean z11) {
        Typeface mo7269a;
        boolean z12;
        int i14;
        if (bVar instanceof AbstractC1398e.e) {
            AbstractC1398e.e eVar2 = (AbstractC1398e.e) bVar;
            Typeface m7261g = m7261g(eVar2.m7068c());
            if (m7261g != null) {
                if (eVar != null) {
                    eVar.m7101d(m7261g, handler);
                }
                return m7261g;
            }
            if (!z11 ? eVar == null : eVar2.m7066a() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                i14 = eVar2.m7069d();
            } else {
                i14 = -1;
            }
            mo7269a = AbstractC1460g.m7404c(context, eVar2.m7067b(), i13, z12, i14, AbstractC1401h.e.m7097e(handler), new a(eVar));
        } else {
            mo7269a = f6239a.mo7269a(context, (AbstractC1398e.c) bVar, resources, i13);
            if (eVar != null) {
                if (mo7269a != null) {
                    eVar.m7101d(mo7269a, handler);
                } else {
                    eVar.m7100c(-3, handler);
                }
            }
        }
        if (mo7269a != null) {
            f6240b.m149140e(m7259e(resources, i11, str, i12, i13), mo7269a);
        }
        return mo7269a;
    }

    /* renamed from: d */
    public static Typeface m7258d(Context context, Resources resources, int i11, String str, int i12, int i13) {
        Typeface mo7281d = f6239a.mo7281d(context, resources, i11, str, i13);
        if (mo7281d != null) {
            f6240b.m149140e(m7259e(resources, i11, str, i12, i13), mo7281d);
        }
        return mo7281d;
    }

    /* renamed from: e */
    private static String m7259e(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    /* renamed from: f */
    public static Typeface m7260f(Resources resources, int i11, String str, int i12, int i13) {
        return (Typeface) f6240b.m149139d(m7259e(resources, i11, str, i12, i13));
    }

    /* renamed from: g */
    private static Typeface m7261g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
