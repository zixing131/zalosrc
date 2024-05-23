package md0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: md0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC22989b {

    /* renamed from: a */
    private static Constructor f111787a = null;

    /* renamed from: b */
    private static Object[] f111788b = null;

    /* renamed from: c */
    private static Object f111789c = null;

    /* renamed from: d */
    private static boolean f111790d = false;

    /* renamed from: e */
    private static int f111791e = 8;

    /* renamed from: a */
    private static CharSequence m117757a(CharSequence charSequence) {
        if (charSequence instanceof Appendable) {
            ((Appendable) charSequence).append((char) 8230);
            return charSequence;
        }
        return ((Object) charSequence) + "…";
    }

    /* renamed from: b */
    public static StaticLayout m117758b(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i14, int i15, int i16) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, i11, i12, textPaint, i13);
            lineSpacing = obtain.setLineSpacing(f12, f11);
            alignment2 = lineSpacing.setAlignment(alignment);
            includePad = alignment2.setIncludePad(z11);
            ellipsize = includePad.setEllipsize(truncateAt);
            ellipsizedWidth = ellipsize.setEllipsizedWidth(i14);
            maxLines = ellipsizedWidth.setMaxLines(i15);
            breakStrategy = maxLines.setBreakStrategy(i16);
            staticLayout = breakStrategy.build();
        } else {
            staticLayout = null;
        }
        if (staticLayout == null) {
            if (i15 == Integer.MAX_VALUE) {
                staticLayout2 = new StaticLayout(charSequence, textPaint, i13, alignment, f11, f12, z11);
            } else {
                try {
                    m117760d();
                    Object[] objArr = f111788b;
                    objArr[0] = charSequence;
                    objArr[1] = Integer.valueOf(i11);
                    f111788b[2] = Integer.valueOf(i12);
                    Object[] objArr2 = f111788b;
                    objArr2[3] = textPaint;
                    objArr2[4] = Integer.valueOf(i13);
                    Object[] objArr3 = f111788b;
                    objArr3[5] = alignment;
                    objArr3[6] = f111789c;
                    objArr3[7] = Float.valueOf(f11);
                    f111788b[8] = Float.valueOf(f12);
                    f111788b[9] = Boolean.valueOf(z11);
                    Object[] objArr4 = f111788b;
                    objArr4[10] = truncateAt;
                    objArr4[11] = Integer.valueOf(i14);
                    f111788b[12] = Integer.valueOf(i15);
                    staticLayout2 = (StaticLayout) f111787a.newInstance(f111788b);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            staticLayout = staticLayout2;
        }
        return staticLayout == null ? new StaticLayout(charSequence, textPaint, i13, alignment, f11, f12, z11) : staticLayout;
    }

    /* renamed from: c */
    public static Layout m117759c(CharSequence charSequence, TextPaint textPaint, int i11, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, boolean z12, BoringLayout.Metrics metrics) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        CharSequence charSequence2;
        int i15;
        StaticLayout staticLayout3;
        int i16;
        int i17;
        if (metrics != null && (metrics.width <= i11 || i13 == 1)) {
            BoringLayout make = BoringLayout.make(charSequence, textPaint, i11, alignment, f11, f12, metrics, z11, truncateAt, i12);
            int max = Math.max(make.getLineCount() - 1, 0);
            if (z12 && max == i13 - 1 && truncateAt == TextUtils.TruncateAt.END) {
                CharSequence m117762f = m117762f(make, charSequence, i13);
                if (!TextUtils.equals(m117762f, make.getText())) {
                    make = BoringLayout.make(m117762f, textPaint, i11, alignment, f11, f12, metrics, z11, truncateAt, i12);
                }
            }
            BoringLayout boringLayout = make;
            if (max != i13 - 1) {
                return boringLayout;
            }
            try {
                return (truncateAt != TextUtils.TruncateAt.END || ((float) boringLayout.getWidth()) >= boringLayout.getLineWidth(max)) ? boringLayout : BoringLayout.make(m117761e(boringLayout, charSequence), textPaint, i11, alignment, f11, f12, metrics, z11, truncateAt, i12);
            } catch (Exception e11) {
                e11.printStackTrace();
                return boringLayout;
            }
        }
        boolean z13 = true;
        int i18 = 0;
        StaticLayout m117758b = m117758b(charSequence, 0, charSequence.length(), textPaint, i11, alignment, f11, f12, z11, truncateAt, i12, i13, i14);
        int max2 = Math.max(m117758b.getLineCount() - 1, 0);
        if (z12 && truncateAt == TextUtils.TruncateAt.END && max2 == i13 - 1) {
            CharSequence m117762f2 = m117762f(m117758b, charSequence, i13);
            if (TextUtils.equals(m117762f2, m117758b.getText())) {
                i18 = 0;
            } else {
                i18 = 0;
                m117758b = m117758b(m117762f2, 0, m117762f2.length(), textPaint, i11, alignment, f11, f12, z11, truncateAt, i12, i13, i14);
            }
        }
        StaticLayout staticLayout4 = m117758b;
        try {
            int max3 = Math.max(staticLayout4.getLineCount() - 1, i18);
            int i19 = i13 - 1;
            if (max3 == i19 && truncateAt == TextUtils.TruncateAt.END && staticLayout4.getWidth() < staticLayout4.getLineWidth(max3)) {
                charSequence2 = charSequence;
                CharSequence m117761e = m117761e(staticLayout4, charSequence2);
                i15 = i19;
                staticLayout = staticLayout4;
                try {
                    staticLayout3 = m117758b(m117761e, 0, m117761e.length(), textPaint, i11, alignment, f11, f12, z11, truncateAt, i12, i13, i14);
                } catch (Exception e12) {
                    e = e12;
                    staticLayout2 = staticLayout;
                    e.printStackTrace();
                    return staticLayout2;
                }
            } else {
                charSequence2 = charSequence;
                i15 = i19;
                staticLayout3 = staticLayout4;
            }
        } catch (Exception e13) {
            e = e13;
            staticLayout = staticLayout4;
        }
        try {
            if (staticLayout3.getLineCount() <= i13) {
                return staticLayout3;
            }
            if (truncateAt != TextUtils.TruncateAt.END) {
                z13 = false;
            }
            if (z13) {
                i16 = 0;
                i17 = staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0);
            } else {
                i16 = 0;
                i17 = 0;
            }
            int i21 = i15;
            CharSequence subSequence = charSequence2.subSequence(i16, staticLayout3.getOffsetForHorizontal(i21, (staticLayout3.getWidth() - i17) + staticLayout3.getLineLeft(i21)));
            if (z13) {
                subSequence = m117757a(subSequence);
            }
            return m117758b(subSequence, 0, subSequence.length(), textPaint, i11, alignment, f11, f12, z11, truncateAt, i12, i13, i14);
        } catch (Exception e14) {
            e = e14;
            staticLayout2 = staticLayout3;
            e.printStackTrace();
            return staticLayout2;
        }
    }

    /* renamed from: d */
    public static void m117760d() {
        if (f111790d) {
            return;
        }
        f111789c = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
        f111787a = declaredConstructor;
        declaredConstructor.setAccessible(true);
        f111788b = new Object[13];
        f111790d = true;
    }

    /* renamed from: e */
    private static CharSequence m117761e(Layout layout, CharSequence charSequence) {
        int lineCount = layout.getLineCount() - 1;
        CharSequence subSequence = charSequence.subSequence(0, layout.getOffsetForHorizontal(lineCount, (layout.getWidth() - (layout.getLineBottom(0) - layout.getLineTop(0))) + layout.getLineLeft(lineCount)));
        m117757a(subSequence);
        return subSequence;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 int, still in use, count: 1, list:
          (r3v3 int) from 0x0032: INVOKE (r4v0 java.lang.CharSequence), (r3v3 int) INTERFACE call: java.lang.CharSequence.charAt(int):char A[Catch: Exception -> 0x0053, MD:(int):char (c), WRAPPED] (LINE:51)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:95)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:79)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* renamed from: f */
    private static java.lang.CharSequence m117762f(android.text.Layout r3, java.lang.CharSequence r4, int r5) {
        /*
            java.lang.CharSequence r0 = r3.getText()
            int r1 = r3.getLineCount()     // Catch: java.lang.Exception -> L53
            int r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Exception -> L53
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L11
            return r0
        L11:
            int r1 = r3.getEllipsisCount(r5)     // Catch: java.lang.Exception -> L53
            if (r1 <= 0) goto L7a
            int r3 = r3.getLineEnd(r5)     // Catch: java.lang.Exception -> L53
            int r3 = r3 - r1
            int r5 = r3 + (-1)
            if (r5 <= 0) goto L7a
            int r1 = r4.length()     // Catch: java.lang.Exception -> L53
            int r1 = r1 + (-1)
            if (r5 >= r1) goto L7a
            char r1 = r4.charAt(r5)     // Catch: java.lang.Exception -> L53
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)     // Catch: java.lang.Exception -> L53
            if (r1 == 0) goto L7a
            char r3 = r4.charAt(r3)     // Catch: java.lang.Exception -> L53
            boolean r3 = java.lang.Character.isLetterOrDigit(r3)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L7a
            r3 = 0
            r1 = 0
        L3e:
            if (r5 < 0) goto L55
            int r2 = md0.AbstractC22989b.f111791e     // Catch: java.lang.Exception -> L53
            if (r1 >= r2) goto L55
            char r2 = r4.charAt(r5)     // Catch: java.lang.Exception -> L53
            boolean r2 = java.lang.Character.isLetterOrDigit(r2)     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L55
            int r5 = r5 + (-1)
            int r1 = r1 + 1
            goto L3e
        L53:
            r3 = move-exception
            goto L77
        L55:
            int r2 = md0.AbstractC22989b.f111791e     // Catch: java.lang.Exception -> L53
            if (r1 >= r2) goto L7a
            if (r5 <= 0) goto L7a
        L5b:
            if (r5 < 0) goto L6a
            char r1 = r4.charAt(r5)     // Catch: java.lang.Exception -> L53
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L6a
            int r5 = r5 + (-1)
            goto L5b
        L6a:
            if (r5 <= 0) goto L7a
            int r5 = r5 + 1
            java.lang.CharSequence r3 = r4.subSequence(r3, r5)     // Catch: java.lang.Exception -> L53
            java.lang.CharSequence r0 = m117757a(r3)     // Catch: java.lang.Exception -> L53
            goto L7a
        L77:
            r3.printStackTrace()
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: md0.AbstractC22989b.m117762f(android.text.Layout, java.lang.CharSequence, int):java.lang.CharSequence");
    }
}
