package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.AbstractC1487i;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.material.internal.r */
/* loaded from: classes3.dex */
final class C6351r {

    /* renamed from: n */
    static final int f35574n;

    /* renamed from: o */
    private static boolean f35575o;

    /* renamed from: p */
    private static Constructor f35576p;

    /* renamed from: q */
    private static Object f35577q;

    /* renamed from: a */
    private CharSequence f35578a;

    /* renamed from: b */
    private final TextPaint f35579b;

    /* renamed from: c */
    private final int f35580c;

    /* renamed from: e */
    private int f35582e;

    /* renamed from: l */
    private boolean f35589l;

    /* renamed from: d */
    private int f35581d = 0;

    /* renamed from: f */
    private Layout.Alignment f35583f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f35584g = Integer.MAX_VALUE;

    /* renamed from: h */
    private float f35585h = 0.0f;

    /* renamed from: i */
    private float f35586i = 1.0f;

    /* renamed from: j */
    private int f35587j = f35574n;

    /* renamed from: k */
    private boolean f35588k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f35590m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.r$a */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        f35574n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private C6351r(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f35578a = charSequence;
        this.f35579b = textPaint;
        this.f35580c = i11;
        this.f35582e = charSequence.length();
    }

    /* renamed from: b */
    private void m32611b() {
        boolean z11;
        TextDirectionHeuristic textDirectionHeuristic;
        if (f35575o) {
            return;
        }
        try {
            if (this.f35589l && Build.VERSION.SDK_INT >= 23) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            f35577q = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f35576p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f35575o = true;
        } catch (Exception e11) {
            throw new a(e11);
        }
    }

    /* renamed from: c */
    public static C6351r m32612c(CharSequence charSequence, TextPaint textPaint, int i11) {
        return new C6351r(charSequence, textPaint, i11);
    }

    /* renamed from: a */
    public StaticLayout m32613a() {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.f35578a == null) {
            this.f35578a = "";
        }
        int max = Math.max(0, this.f35580c);
        CharSequence charSequence = this.f35578a;
        if (this.f35584g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f35579b, max, this.f35590m);
        }
        int min = Math.min(charSequence.length(), this.f35582e);
        this.f35582e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f35589l && this.f35584g == 1) {
                this.f35583f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, this.f35581d, min, this.f35579b, max);
            obtain.setAlignment(this.f35583f);
            obtain.setIncludePad(this.f35588k);
            if (this.f35589l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f35590m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f35584g);
            float f11 = this.f35585h;
            if (f11 != 0.0f || this.f35586i != 1.0f) {
                obtain.setLineSpacing(f11, this.f35586i);
            }
            if (this.f35584g > 1) {
                obtain.setHyphenationFrequency(this.f35587j);
            }
            build = obtain.build();
            return build;
        }
        m32611b();
        try {
            return (StaticLayout) ((Constructor) AbstractC1487i.m7492g(f35576p)).newInstance(charSequence, Integer.valueOf(this.f35581d), Integer.valueOf(this.f35582e), this.f35579b, Integer.valueOf(max), this.f35583f, AbstractC1487i.m7492g(f35577q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f35588k), null, Integer.valueOf(max), Integer.valueOf(this.f35584g));
        } catch (Exception e11) {
            throw new a(e11);
        }
    }

    /* renamed from: d */
    public C6351r m32614d(Layout.Alignment alignment) {
        this.f35583f = alignment;
        return this;
    }

    /* renamed from: e */
    public C6351r m32615e(TextUtils.TruncateAt truncateAt) {
        this.f35590m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C6351r m32616f(int i11) {
        this.f35587j = i11;
        return this;
    }

    /* renamed from: g */
    public C6351r m32617g(boolean z11) {
        this.f35588k = z11;
        return this;
    }

    /* renamed from: h */
    public C6351r m32618h(boolean z11) {
        this.f35589l = z11;
        return this;
    }

    /* renamed from: i */
    public C6351r m32619i(float f11, float f12) {
        this.f35585h = f11;
        this.f35586i = f12;
        return this;
    }

    /* renamed from: j */
    public C6351r m32620j(int i11) {
        this.f35584g = i11;
        return this;
    }
}
