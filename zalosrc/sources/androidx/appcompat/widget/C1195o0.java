package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p175g0.AbstractC19187j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
public class C1195o0 {

    /* renamed from: l */
    private static final RectF f4668l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap f4669m = new ConcurrentHashMap();

    /* renamed from: n */
    private static ConcurrentHashMap f4670n = new ConcurrentHashMap();

    /* renamed from: a */
    private int f4671a = 0;

    /* renamed from: b */
    private boolean f4672b = false;

    /* renamed from: c */
    private float f4673c = -1.0f;

    /* renamed from: d */
    private float f4674d = -1.0f;

    /* renamed from: e */
    private float f4675e = -1.0f;

    /* renamed from: f */
    private int[] f4676f = new int[0];

    /* renamed from: g */
    private boolean f4677g = false;

    /* renamed from: h */
    private TextPaint f4678h;

    /* renamed from: i */
    private final TextView f4679i;

    /* renamed from: j */
    private final Context f4680j;

    /* renamed from: k */
    private final c f4681k;

    /* renamed from: androidx.appcompat.widget.o0$a */
    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.C1195o0.c
        /* renamed from: a */
        void mo5651a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1195o0.m5631o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.C1195o0.a, androidx.appcompat.widget.C1195o0.c
        /* renamed from: a */
        void mo5651a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C1195o0.c
        /* renamed from: b */
        boolean mo5652b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.o0$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        void mo5651a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo5652b(TextView textView) {
            return ((Boolean) C1195o0.m5631o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1195o0(TextView textView) {
        this.f4679i = textView;
        this.f4680j = textView.getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.f4681k = new b();
        } else if (i11 >= 23) {
            this.f4681k = new a();
        } else {
            this.f4681k = new c();
        }
    }

    /* renamed from: A */
    private boolean m5623A() {
        return !(this.f4679i instanceof AppCompatEditText);
    }

    /* renamed from: B */
    private void m5624B(float f11, float f12, float f13) {
        if (f11 > 0.0f) {
            if (f12 > f11) {
                if (f13 > 0.0f) {
                    this.f4671a = 1;
                    this.f4674d = f11;
                    this.f4675e = f12;
                    this.f4673c = f13;
                    this.f4677g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f13 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f12 + "px) is less or equal to minimum auto-size text size (" + f11 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f11 + "px) is less or equal to (0px)");
    }

    /* renamed from: b */
    private int[] m5625b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m5626c() {
        this.f4671a = 0;
        this.f4674d = -1.0f;
        this.f4675e = -1.0f;
        this.f4673c = -1.0f;
        this.f4676f = new int[0];
        this.f4672b = false;
    }

    /* renamed from: e */
    private StaticLayout m5627e(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout build;
        obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f4678h, i11);
        alignment2 = obtain.setAlignment(alignment);
        lineSpacing = alignment2.setLineSpacing(this.f4679i.getLineSpacingExtra(), this.f4679i.getLineSpacingMultiplier());
        includePad = lineSpacing.setIncludePad(this.f4679i.getIncludeFontPadding());
        breakStrategy = this.f4679i.getBreakStrategy();
        breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
        hyphenationFrequency = this.f4679i.getHyphenationFrequency();
        hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
        if (i12 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        hyphenationFrequency2.setMaxLines(i12);
        try {
            this.f4681k.mo5651a(obtain, this.f4679i);
        } catch (ClassCastException unused) {
        }
        build = obtain.build();
        return build;
    }

    /* renamed from: f */
    private StaticLayout m5628f(CharSequence charSequence, Layout.Alignment alignment, int i11) {
        return new StaticLayout(charSequence, this.f4678h, i11, alignment, this.f4679i.getLineSpacingMultiplier(), this.f4679i.getLineSpacingExtra(), this.f4679i.getIncludeFontPadding());
    }

    /* renamed from: g */
    private int m5629g(RectF rectF) {
        int length = this.f4676f.length;
        if (length != 0) {
            int i11 = 1;
            int i12 = length - 1;
            int i13 = 0;
            while (i11 <= i12) {
                int i14 = (i11 + i12) / 2;
                if (m5636z(this.f4676f[i14], rectF)) {
                    int i15 = i14 + 1;
                    i13 = i11;
                    i11 = i15;
                } else {
                    i13 = i14 - 1;
                    i12 = i13;
                }
            }
            return this.f4676f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: m */
    private static Method m5630m(String str) {
        try {
            Method method = (Method) f4669m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f4669m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to retrieve TextView#");
            sb2.append(str);
            sb2.append("() method");
            return null;
        }
    }

    /* renamed from: o */
    static Object m5631o(Object obj, String str, Object obj2) {
        try {
            return m5630m(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to invoke TextView#");
            sb2.append(str);
            sb2.append("() method");
            return obj2;
        }
    }

    /* renamed from: u */
    private void m5632u(float f11) {
        if (f11 != this.f4679i.getPaint().getTextSize()) {
            this.f4679i.getPaint().setTextSize(f11);
            boolean isInLayout = this.f4679i.isInLayout();
            if (this.f4679i.getLayout() != null) {
                this.f4672b = false;
                try {
                    Method m5630m = m5630m("nullLayouts");
                    if (m5630m != null) {
                        m5630m.invoke(this.f4679i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f4679i.requestLayout();
                } else {
                    this.f4679i.forceLayout();
                }
                this.f4679i.invalidate();
            }
        }
    }

    /* renamed from: w */
    private boolean m5633w() {
        if (m5623A() && this.f4671a == 1) {
            if (!this.f4677g || this.f4676f.length == 0) {
                int floor = ((int) Math.floor((this.f4675e - this.f4674d) / this.f4673c)) + 1;
                int[] iArr = new int[floor];
                for (int i11 = 0; i11 < floor; i11++) {
                    iArr[i11] = Math.round(this.f4674d + (i11 * this.f4673c));
                }
                this.f4676f = m5625b(iArr);
            }
            this.f4672b = true;
        } else {
            this.f4672b = false;
        }
        return this.f4672b;
    }

    /* renamed from: x */
    private void m5634x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = typedArray.getDimensionPixelSize(i11, -1);
            }
            this.f4676f = m5625b(iArr);
            m5635y();
        }
    }

    /* renamed from: y */
    private boolean m5635y() {
        boolean z11;
        if (this.f4676f.length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f4677g = z11;
        if (z11) {
            this.f4671a = 1;
            this.f4674d = r0[0];
            this.f4675e = r0[r1 - 1];
            this.f4673c = -1.0f;
        }
        return z11;
    }

    /* renamed from: z */
    private boolean m5636z(int i11, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f4679i.getText();
        TransformationMethod transformationMethod = this.f4679i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f4679i)) != null) {
            text = transformation;
        }
        int maxLines = this.f4679i.getMaxLines();
        m5644n(i11);
        StaticLayout m5638d = m5638d(text, (Layout.Alignment) m5631o(this.f4679i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if ((maxLines != -1 && (m5638d.getLineCount() > maxLines || m5638d.getLineEnd(m5638d.getLineCount() - 1) != text.length())) || m5638d.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5637a() {
        int measuredWidth;
        if (!m5645p()) {
            return;
        }
        if (this.f4672b) {
            if (this.f4679i.getMeasuredHeight() > 0 && this.f4679i.getMeasuredWidth() > 0) {
                if (this.f4681k.mo5652b(this.f4679i)) {
                    measuredWidth = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                } else {
                    measuredWidth = (this.f4679i.getMeasuredWidth() - this.f4679i.getTotalPaddingLeft()) - this.f4679i.getTotalPaddingRight();
                }
                int height = (this.f4679i.getHeight() - this.f4679i.getCompoundPaddingBottom()) - this.f4679i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f4668l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float m5629g = m5629g(rectF);
                            if (m5629g != this.f4679i.getTextSize()) {
                                m5650v(0, m5629g);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f4672b = true;
    }

    /* renamed from: d */
    StaticLayout m5638d(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m5627e(charSequence, alignment, i11, i12);
        }
        return m5628f(charSequence, alignment, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m5639h() {
        return Math.round(this.f4675e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m5640i() {
        return Math.round(this.f4674d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m5641j() {
        return Math.round(this.f4673c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m5642k() {
        return this.f4676f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m5643l() {
        return this.f4671a;
    }

    /* renamed from: n */
    void m5644n(int i11) {
        TextPaint textPaint = this.f4678h;
        if (textPaint == null) {
            this.f4678h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f4678h.set(this.f4679i.getPaint());
        this.f4678h.setTextSize(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m5645p() {
        if (m5623A() && this.f4671a != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5646q(AttributeSet attributeSet, int i11) {
        float f11;
        float f12;
        float f13;
        int resourceId;
        TypedArray obtainStyledAttributes = this.f4680j.obtainStyledAttributes(attributeSet, AbstractC19187j.AppCompatTextView, i11, 0);
        TextView textView = this.f4679i;
        AbstractC1579n0.m7912y0(textView, textView.getContext(), AbstractC19187j.AppCompatTextView, attributeSet, obtainStyledAttributes, i11, 0);
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTextView_autoSizeTextType)) {
            this.f4671a = obtainStyledAttributes.getInt(AbstractC19187j.AppCompatTextView_autoSizeTextType, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTextView_autoSizeStepGranularity)) {
            f11 = obtainStyledAttributes.getDimension(AbstractC19187j.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTextView_autoSizeMinTextSize)) {
            f12 = obtainStyledAttributes.getDimension(AbstractC19187j.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTextView_autoSizeMaxTextSize)) {
            f13 = obtainStyledAttributes.getDimension(AbstractC19187j.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        } else {
            f13 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(AbstractC19187j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m5634x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m5623A()) {
            if (this.f4671a == 1) {
                if (!this.f4677g) {
                    DisplayMetrics displayMetrics = this.f4680j.getResources().getDisplayMetrics();
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f13 == -1.0f) {
                        f13 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f11 == -1.0f) {
                        f11 = 1.0f;
                    }
                    m5624B(f12, f13, f11);
                }
                m5633w();
                return;
            }
            return;
        }
        this.f4671a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m5647r(int i11, int i12, int i13, int i14) {
        if (m5623A()) {
            DisplayMetrics displayMetrics = this.f4680j.getResources().getDisplayMetrics();
            m5624B(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (m5633w()) {
                m5637a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m5648s(int[] iArr, int i11) {
        if (m5623A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i11 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f4680j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr2[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                this.f4676f = m5625b(iArr2);
                if (!m5635y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f4677g = false;
            }
            if (m5633w()) {
                m5637a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m5649t(int i11) {
        if (m5623A()) {
            if (i11 != 0) {
                if (i11 == 1) {
                    DisplayMetrics displayMetrics = this.f4680j.getResources().getDisplayMetrics();
                    m5624B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m5633w()) {
                        m5637a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i11);
            }
            m5626c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m5650v(int i11, float f11) {
        Resources resources;
        Context context = this.f4680j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m5632u(TypedValue.applyDimension(i11, f11, resources.getDisplayMetrics()));
    }
}
