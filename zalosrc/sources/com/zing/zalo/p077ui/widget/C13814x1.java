package com.zing.zalo.p077ui.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23265y;

/* renamed from: com.zing.zalo.ui.widget.x1 */
/* loaded from: classes6.dex */
public final class C13814x1 {

    /* renamed from: h */
    private static final int f71468h = 0;

    /* renamed from: a */
    private int f71473a;

    /* renamed from: b */
    private String f71474b;

    /* renamed from: c */
    private int f71475c;

    /* renamed from: d */
    private float[] f71476d;

    /* renamed from: e */
    private LayerDrawable f71477e;

    /* renamed from: f */
    private int f71478f;

    /* renamed from: g */
    private final int f71479g;
    public static final a Companion = new a(null);

    /* renamed from: i */
    private static final int f71469i = 1;

    /* renamed from: j */
    private static final int f71470j = 2;

    /* renamed from: k */
    private static final int f71471k = 3;

    /* renamed from: l */
    private static final int f71472l = 4;

    /* renamed from: com.zing.zalo.ui.widget.x1$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m77075a() {
            return C13814x1.f71472l;
        }
    }

    public C13814x1(String str, int i11, int i12, float[] fArr, int i13) {
        AbstractC19074t.m100208f(str, "colorRGB");
        AbstractC19074t.m100208f(fArr, "radius");
        this.f71473a = 255;
        this.f71474b = "000000";
        this.f71476d = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f71478f = f71468h;
        this.f71479g = Color.parseColor("#00FFFFFF");
        this.f71474b = str;
        this.f71473a = i11;
        this.f71475c = i12;
        this.f71476d = fArr;
        this.f71478f = i13;
        m77072b();
    }

    /* renamed from: b */
    public final void m77072b() {
        try {
            InsetDrawable[] insetDrawableArr = new InsetDrawable[15];
            for (int i11 = 0; i11 < 15; i11++) {
                insetDrawableArr[i11] = null;
            }
            GradientDrawable.Orientation m77074d = m77074d(this.f71478f);
            for (int i12 = 0; i12 < 15; i12++) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(this.f71475c);
                gradientDrawable.setGradientType(this.f71475c);
                gradientDrawable.setOrientation(m77074d);
                gradientDrawable.setCornerRadii(this.f71476d);
                gradientDrawable.setColors(new int[]{Color.parseColor("#0" + AbstractC23265y.m120021h(i12) + this.f71474b), this.f71479g});
                insetDrawableArr[i12] = new InsetDrawable((Drawable) gradientDrawable, 1, 1, 1, 1);
            }
            LayerDrawable layerDrawable = new LayerDrawable(insetDrawableArr);
            this.f71477e = layerDrawable;
            layerDrawable.setAlpha(this.f71473a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public final Drawable m77073c() {
        return this.f71477e;
    }

    /* renamed from: d */
    public final GradientDrawable.Orientation m77074d(int i11) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        if (i11 == f71472l) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        if (i11 == f71469i) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (i11 == f71471k) {
            return GradientDrawable.Orientation.RIGHT_LEFT;
        }
        return orientation;
    }
}
