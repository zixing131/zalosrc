package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.AbstractC1401h;
import p193h0.AbstractC19694b;

/* renamed from: androidx.appcompat.widget.t1 */
/* loaded from: classes.dex */
public class C1211t1 {

    /* renamed from: a */
    private final Context f4722a;

    /* renamed from: b */
    private final TypedArray f4723b;

    /* renamed from: c */
    private TypedValue f4724c;

    private C1211t1(Context context, TypedArray typedArray) {
        this.f4722a = context;
        this.f4723b = typedArray;
    }

    /* renamed from: t */
    public static C1211t1 m5714t(Context context, int i11, int[] iArr) {
        return new C1211t1(context, context.obtainStyledAttributes(i11, iArr));
    }

    /* renamed from: u */
    public static C1211t1 m5715u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1211t1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C1211t1 m5716v(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12) {
        return new C1211t1(context, context.obtainStyledAttributes(attributeSet, iArr, i11, i12));
    }

    /* renamed from: a */
    public boolean m5717a(int i11, boolean z11) {
        return this.f4723b.getBoolean(i11, z11);
    }

    /* renamed from: b */
    public int m5718b(int i11, int i12) {
        return this.f4723b.getColor(i11, i12);
    }

    /* renamed from: c */
    public ColorStateList m5719c(int i11) {
        int resourceId;
        ColorStateList m103335c;
        if (this.f4723b.hasValue(i11) && (resourceId = this.f4723b.getResourceId(i11, 0)) != 0 && (m103335c = AbstractC19694b.m103335c(this.f4722a, resourceId)) != null) {
            return m103335c;
        }
        return this.f4723b.getColorStateList(i11);
    }

    /* renamed from: d */
    public float m5720d(int i11, float f11) {
        return this.f4723b.getDimension(i11, f11);
    }

    /* renamed from: e */
    public int m5721e(int i11, int i12) {
        return this.f4723b.getDimensionPixelOffset(i11, i12);
    }

    /* renamed from: f */
    public int m5722f(int i11, int i12) {
        return this.f4723b.getDimensionPixelSize(i11, i12);
    }

    /* renamed from: g */
    public Drawable m5723g(int i11) {
        int resourceId;
        if (this.f4723b.hasValue(i11) && (resourceId = this.f4723b.getResourceId(i11, 0)) != 0) {
            return AbstractC19694b.m103336d(this.f4722a, resourceId);
        }
        return this.f4723b.getDrawable(i11);
    }

    /* renamed from: h */
    public Drawable m5724h(int i11) {
        int resourceId;
        if (this.f4723b.hasValue(i11) && (resourceId = this.f4723b.getResourceId(i11, 0)) != 0) {
            return C1167f.m5528b().m5533d(this.f4722a, resourceId, true);
        }
        return null;
    }

    /* renamed from: i */
    public float m5725i(int i11, float f11) {
        return this.f4723b.getFloat(i11, f11);
    }

    /* renamed from: j */
    public Typeface m5726j(int i11, int i12, AbstractC1401h.e eVar) {
        int resourceId = this.f4723b.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f4724c == null) {
            this.f4724c = new TypedValue();
        }
        return AbstractC1401h.m7084h(this.f4722a, resourceId, this.f4724c, i12, eVar);
    }

    /* renamed from: k */
    public int m5727k(int i11, int i12) {
        return this.f4723b.getInt(i11, i12);
    }

    /* renamed from: l */
    public int m5728l(int i11, int i12) {
        return this.f4723b.getInteger(i11, i12);
    }

    /* renamed from: m */
    public int m5729m(int i11, int i12) {
        return this.f4723b.getLayoutDimension(i11, i12);
    }

    /* renamed from: n */
    public int m5730n(int i11, int i12) {
        return this.f4723b.getResourceId(i11, i12);
    }

    /* renamed from: o */
    public String m5731o(int i11) {
        return this.f4723b.getString(i11);
    }

    /* renamed from: p */
    public CharSequence m5732p(int i11) {
        return this.f4723b.getText(i11);
    }

    /* renamed from: q */
    public CharSequence[] m5733q(int i11) {
        return this.f4723b.getTextArray(i11);
    }

    /* renamed from: r */
    public TypedArray m5734r() {
        return this.f4723b;
    }

    /* renamed from: s */
    public boolean m5735s(int i11) {
        return this.f4723b.hasValue(i11);
    }

    /* renamed from: w */
    public void m5736w() {
        this.f4723b.recycle();
    }
}
