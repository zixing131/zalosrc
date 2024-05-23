package com.zing.zalo.camera.photocrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import me0.AbstractC23170p;

/* loaded from: classes3.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    private Paint f41442A;

    /* renamed from: B */
    private Paint f41443B;

    /* renamed from: C */
    private final Path f41444C;

    /* renamed from: D */
    private final float[] f41445D;

    /* renamed from: E */
    private final RectF f41446E;

    /* renamed from: F */
    private int f41447F;

    /* renamed from: G */
    private int f41448G;

    /* renamed from: H */
    private float f41449H;

    /* renamed from: I */
    private float f41450I;

    /* renamed from: J */
    private float f41451J;

    /* renamed from: K */
    private boolean f41452K;

    /* renamed from: L */
    private int f41453L;

    /* renamed from: M */
    private int f41454M;

    /* renamed from: N */
    private float f41455N;

    /* renamed from: O */
    private EnumC7714c f41456O;

    /* renamed from: P */
    private EnumC7713b f41457P;

    /* renamed from: Q */
    private final Rect f41458Q;

    /* renamed from: R */
    private boolean f41459R;

    /* renamed from: S */
    public boolean f41460S;

    /* renamed from: p */
    private final RectF f41461p;

    /* renamed from: q */
    private final RectF f41462q;

    /* renamed from: r */
    private float f41463r;

    /* renamed from: s */
    private float f41464s;

    /* renamed from: t */
    private float f41465t;

    /* renamed from: u */
    private float f41466u;

    /* renamed from: v */
    private final PointF f41467v;

    /* renamed from: w */
    private EnumC7715d f41468w;

    /* renamed from: x */
    private final RectF f41469x;

    /* renamed from: y */
    private Paint f41470y;

    /* renamed from: z */
    private Paint f41471z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.photocrop.CropOverlayView$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C7712a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41472a;

        static {
            int[] iArr = new int[EnumC7715d.values().length];
            f41472a = iArr;
            try {
                iArr[EnumC7715d.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41472a[EnumC7715d.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41472a[EnumC7715d.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41472a[EnumC7715d.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41472a[EnumC7715d.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41472a[EnumC7715d.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41472a[EnumC7715d.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41472a[EnumC7715d.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41472a[EnumC7715d.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.photocrop.CropOverlayView$b */
    /* loaded from: classes3.dex */
    public enum EnumC7713b {
        RECTANGLE,
        OVAL
    }

    /* renamed from: com.zing.zalo.camera.photocrop.CropOverlayView$c */
    /* loaded from: classes3.dex */
    public enum EnumC7714c {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: com.zing.zalo.camera.photocrop.CropOverlayView$d */
    /* loaded from: classes3.dex */
    public enum EnumC7715d {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41461p = new RectF();
        this.f41462q = new RectF();
        this.f41467v = new PointF();
        this.f41469x = new RectF();
        this.f41444C = new Path();
        this.f41445D = new float[8];
        this.f41446E = new RectF();
        this.f41455N = this.f41453L / this.f41454M;
        this.f41458Q = new Rect();
        this.f41460S = false;
    }

    /* renamed from: B */
    private static boolean m39428B(float f11, float f12, float f13, float f14, float f15, float f16) {
        return f11 > f13 && f11 < f15 && f12 > f14 && f12 < f16;
    }

    /* renamed from: C */
    private static boolean m39429C(float f11, float f12, float f13, float f14, float f15) {
        if (Math.abs(f11 - f13) <= f15 && Math.abs(f12 - f14) <= f15) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private static boolean m39430D(float f11, float f12, float f13, float f14, float f15, float f16) {
        if (f11 > f13 && f11 < f14 && Math.abs(f12 - f15) <= f16) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private static boolean m39431E(float f11, float f12, float f13, float f14, float f15, float f16) {
        if (Math.abs(f11 - f13) <= f16 && f12 > f14 && f12 < f15) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private boolean m39432F() {
        float[] fArr = this.f41445D;
        if (fArr == null || fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:            if ((r0 + r9) <= r10.bottom) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:4:0x0018, B:6:0x0021, B:8:0x0028, B:11:0x003c, B:13:0x0044, B:15:0x004d, B:17:0x0054, B:19:0x0065, B:23:0x005b, B:24:0x0032), top: B:1:0x0000 }] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m39433H(RectF rectF, float f11, float f12, RectF rectF2, int i11, int i12, float f13) {
        float f14;
        try {
            float centerX = f11 - rectF.centerX();
            float centerY = f12 - rectF.centerY();
            float f15 = rectF.left;
            if (f15 + centerX >= 0.0f) {
                float f16 = rectF.right;
                if (f16 + centerX <= i11) {
                    if (f15 + centerX >= rectF2.left) {
                        if (f16 + centerX > rectF2.right) {
                        }
                        f14 = rectF.top;
                        if (f14 + centerY >= 0.0f) {
                            float f17 = rectF.bottom;
                            if (f17 + centerY <= i12) {
                                if (f14 + centerY >= rectF2.top) {
                                }
                            }
                        }
                        centerY /= 1.05f;
                        this.f41467v.y -= centerY / 2.0f;
                        rectF.offset(centerX, centerY);
                        m39439R(rectF, rectF2, f13);
                    }
                }
            }
            centerX /= 1.05f;
            this.f41467v.x -= centerX / 2.0f;
            f14 = rectF.top;
            if (f14 + centerY >= 0.0f) {
            }
            centerY /= 1.05f;
            this.f41467v.y -= centerY / 2.0f;
            rectF.offset(centerX, centerY);
            m39439R(rectF, rectF2, f13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    private void m39434I(RectF rectF, float f11, float f12, RectF rectF2, int i11, int i12, float f13, float f14) {
        try {
            switch (C7712a.f41472a[this.f41468w.ordinal()]) {
                case 1:
                    if (m39450k(f11, f12, rectF.right, rectF.bottom) < f14) {
                        m39447h(rectF, f12, rectF2, f13, f14, true, false);
                        m39443d(rectF, f14);
                        break;
                    } else {
                        m39442c(rectF, f11, rectF2, f13, f14, true, false);
                        m39449j(rectF, f14);
                        break;
                    }
                case 2:
                    if (m39450k(rectF.left, f12, f11, rectF.bottom) < f14) {
                        m39447h(rectF, f12, rectF2, f13, f14, false, true);
                        m39446g(rectF, f14);
                        break;
                    } else {
                        m39445f(rectF, f11, rectF2, i11, f13, f14, true, false);
                        m39449j(rectF, f14);
                        break;
                    }
                case 3:
                    if (m39450k(f11, rectF.top, rectF.right, f12) < f14) {
                        m39440a(rectF, f12, rectF2, i12, f13, f14, true, false);
                        m39443d(rectF, f14);
                        break;
                    } else {
                        m39442c(rectF, f11, rectF2, f13, f14, false, true);
                        m39441b(rectF, f14);
                        break;
                    }
                case 4:
                    if (m39450k(rectF.left, rectF.top, f11, f12) < f14) {
                        m39440a(rectF, f12, rectF2, i12, f13, f14, false, true);
                        m39446g(rectF, f14);
                        break;
                    } else {
                        m39445f(rectF, f11, rectF2, i11, f13, f14, false, true);
                        m39441b(rectF, f14);
                        break;
                    }
                case 5:
                    m39442c(rectF, f11, rectF2, f13, f14, true, true);
                    m39448i(rectF, rectF2, f14);
                    break;
                case 6:
                    m39447h(rectF, f12, rectF2, f13, f14, true, true);
                    m39444e(rectF, rectF2, f14);
                    break;
                case 7:
                    m39445f(rectF, f11, rectF2, i11, f13, f14, true, true);
                    m39448i(rectF, rectF2, f14);
                    break;
                case 8:
                    m39440a(rectF, f12, rectF2, i12, f13, f14, true, true);
                    m39444e(rectF, rectF2, f14);
                    break;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    private void m39435J(RectF rectF, float f11, float f12, RectF rectF2, int i11, int i12, float f13) {
        try {
        } catch (Exception e11) {
            e = e11;
        }
        try {
            switch (C7712a.f41472a[this.f41468w.ordinal()]) {
                case 1:
                    m39447h(rectF, f12, rectF2, f13, 0.0f, false, false);
                    m39442c(rectF, f11, rectF2, f13, 0.0f, false, false);
                    break;
                case 2:
                    m39447h(rectF, f12, rectF2, f13, 0.0f, false, false);
                    m39445f(rectF, f11, rectF2, i11, f13, 0.0f, false, false);
                    break;
                case 3:
                    m39440a(rectF, f12, rectF2, i12, f13, 0.0f, false, false);
                    m39442c(rectF, f11, rectF2, f13, 0.0f, false, false);
                    break;
                case 4:
                    m39440a(rectF, f12, rectF2, i12, f13, 0.0f, false, false);
                    m39445f(rectF, f11, rectF2, i11, f13, 0.0f, false, false);
                    break;
                case 5:
                    m39442c(rectF, f11, rectF2, f13, 0.0f, false, false);
                    break;
                case 6:
                    m39447h(rectF, f12, rectF2, f13, 0.0f, false, false);
                    break;
                case 7:
                    m39445f(rectF, f11, rectF2, i11, f13, 0.0f, false, false);
                    break;
                case 8:
                    m39440a(rectF, f12, rectF2, i12, f13, 0.0f, false, false);
                    break;
            }
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
        }
    }

    /* renamed from: K */
    private void m39436K(float f11, float f12) {
        EnumC7715d m39462y;
        try {
            if (this.f41457P == EnumC7713b.OVAL) {
                m39462y = m39461x(f11, f12);
            } else {
                m39462y = m39462y(f11, f12, this.f41450I);
            }
            this.f41468w = m39462y;
            if (m39462y != null) {
                m39452m(getRect(), f11, f12);
            }
            invalidate();
            this.f41460S = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    private void m39437L(float f11, float f12) {
        float f13;
        try {
            if (this.f41468w != null) {
                float f14 = this.f41451J;
                RectF rect = getRect();
                if (m39451l(rect)) {
                    f13 = 0.0f;
                } else {
                    f13 = f14;
                }
                m39465G(rect, f11, f12, this.f41446E, this.f41447F, this.f41448G, f13, this.f41452K, this.f41455N);
                setRect(rect);
                invalidate();
                this.f41460S = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    private void m39438M() {
        try {
            if (this.f41468w != null) {
                this.f41468w = null;
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    private void m39439R(RectF rectF, RectF rectF2, float f11) {
        try {
            float f12 = rectF.left;
            float f13 = rectF2.left;
            if (f12 < f13 + f11) {
                rectF.offset(f13 - f12, 0.0f);
            }
            float f14 = rectF.top;
            float f15 = rectF2.top;
            if (f14 < f15 + f11) {
                rectF.offset(0.0f, f15 - f14);
            }
            float f16 = rectF.right;
            float f17 = rectF2.right;
            if (f16 > f17 - f11) {
                rectF.offset(f17 - f16, 0.0f);
            }
            float f18 = rectF.bottom;
            float f19 = rectF2.bottom;
            if (f18 > f19 - f11) {
                rectF.offset(0.0f, f19 - f18);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m39440a(RectF rectF, float f11, RectF rectF2, int i11, float f12, float f13, boolean z11, boolean z12) {
        float f14 = i11;
        if (f11 > f14) {
            f11 = ((f11 - f14) / 1.05f) + f14;
            try {
                this.f41467v.y -= (f11 - f14) / 1.1f;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        float f15 = rectF2.bottom;
        if (f11 > f15) {
            this.f41467v.y -= (f11 - f15) / 2.0f;
        }
        if (f15 - f11 < f12) {
            f11 = f15;
        }
        float f16 = rectF.top;
        float f17 = f11 - f16;
        float f18 = this.f41464s;
        if (f17 < f18) {
            f11 = f16 + f18;
        }
        float f19 = f11 - f16;
        float f21 = this.f41466u;
        if (f19 > f21) {
            f11 = f16 + f21;
        }
        if (f15 - f11 < f12) {
            f11 = f15;
        }
        if (f13 > 0.0f) {
            float f22 = (f11 - f16) * f13;
            float f23 = this.f41463r;
            if (f22 < f23) {
                f11 = Math.min(f15, f16 + (f23 / f13));
                f22 = (f11 - rectF.top) * f13;
            }
            float f24 = this.f41465t;
            if (f22 > f24) {
                f11 = Math.min(rectF2.bottom, rectF.top + (f24 / f13));
                f22 = (f11 - rectF.top) * f13;
            }
            if (z11 && z12) {
                f11 = Math.min(f11, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f13)));
            } else {
                if (z11) {
                    float f25 = rectF.right;
                    float f26 = f25 - f22;
                    float f27 = rectF2.left;
                    if (f26 < f27) {
                        f11 = Math.min(rectF2.bottom, rectF.top + ((f25 - f27) / f13));
                        f22 = (f11 - rectF.top) * f13;
                    }
                }
                if (z12) {
                    float f28 = rectF.left;
                    float f29 = f22 + f28;
                    float f31 = rectF2.right;
                    if (f29 > f31) {
                        f11 = Math.min(f11, Math.min(rectF2.bottom, rectF.top + ((f31 - f28) / f13)));
                    }
                }
            }
        }
        rectF.bottom = f11;
    }

    /* renamed from: b */
    private void m39441b(RectF rectF, float f11) {
        rectF.bottom = rectF.top + (rectF.width() / f11);
    }

    /* renamed from: c */
    private void m39442c(RectF rectF, float f11, RectF rectF2, float f12, float f13, boolean z11, boolean z12) {
        if (f11 < 0.0f) {
            f11 /= 1.05f;
            try {
                this.f41467v.x -= f11 / 1.1f;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        float f14 = rectF2.left;
        if (f11 < f14) {
            this.f41467v.x -= (f11 - f14) / 2.0f;
        }
        if (f11 - f14 < f12) {
            f11 = f14;
        }
        float f15 = rectF.right;
        float f16 = f15 - f11;
        float f17 = this.f41463r;
        if (f16 < f17) {
            f11 = f15 - f17;
        }
        float f18 = f15 - f11;
        float f19 = this.f41465t;
        if (f18 > f19) {
            f11 = f15 - f19;
        }
        if (f11 - f14 < f12) {
            f11 = f14;
        }
        if (f13 > 0.0f) {
            float f21 = (f15 - f11) / f13;
            float f22 = this.f41464s;
            if (f21 < f22) {
                f11 = Math.max(f14, f15 - (f22 * f13));
                f21 = (rectF.right - f11) / f13;
            }
            float f23 = this.f41466u;
            if (f21 > f23) {
                f11 = Math.max(rectF2.left, rectF.right - (f23 * f13));
                f21 = (rectF.right - f11) / f13;
            }
            if (z11 && z12) {
                f11 = Math.max(f11, Math.max(rectF2.left, rectF.right - (rectF2.height() * f13)));
            } else {
                if (z11) {
                    float f24 = rectF.bottom;
                    float f25 = f24 - f21;
                    float f26 = rectF2.top;
                    if (f25 < f26) {
                        f11 = Math.max(rectF2.left, rectF.right - ((f24 - f26) * f13));
                        f21 = (rectF.right - f11) / f13;
                    }
                }
                if (z12) {
                    float f27 = rectF.top;
                    float f28 = f21 + f27;
                    float f29 = rectF2.bottom;
                    if (f28 > f29) {
                        f11 = Math.max(f11, Math.max(rectF2.left, rectF.right - ((f29 - f27) * f13)));
                    }
                }
            }
        }
        rectF.left = f11;
    }

    /* renamed from: d */
    private void m39443d(RectF rectF, float f11) {
        rectF.left = rectF.right - (rectF.height() * f11);
    }

    /* renamed from: e */
    private void m39444e(RectF rectF, RectF rectF2, float f11) {
        rectF.inset((rectF.width() - (rectF.height() * f11)) / 2.0f, 0.0f);
        float f12 = rectF.left;
        float f13 = rectF2.left;
        if (f12 < f13) {
            rectF.offset(f13 - f12, 0.0f);
        }
        float f14 = rectF.right;
        float f15 = rectF2.right;
        if (f14 > f15) {
            rectF.offset(f15 - f14, 0.0f);
        }
    }

    /* renamed from: f */
    private void m39445f(RectF rectF, float f11, RectF rectF2, int i11, float f12, float f13, boolean z11, boolean z12) {
        float f14 = i11;
        if (f11 > f14) {
            f11 = ((f11 - f14) / 1.05f) + f14;
            try {
                this.f41467v.x -= (f11 - f14) / 1.1f;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        float f15 = rectF2.right;
        if (f11 > f15) {
            this.f41467v.x -= (f11 - f15) / 2.0f;
        }
        if (f15 - f11 < f12) {
            f11 = f15;
        }
        float f16 = rectF.left;
        float f17 = f11 - f16;
        float f18 = this.f41463r;
        if (f17 < f18) {
            f11 = f16 + f18;
        }
        float f19 = f11 - f16;
        float f21 = this.f41465t;
        if (f19 > f21) {
            f11 = f16 + f21;
        }
        if (f15 - f11 < f12) {
            f11 = f15;
        }
        if (f13 > 0.0f) {
            float f22 = (f11 - f16) / f13;
            float f23 = this.f41464s;
            if (f22 < f23) {
                f11 = Math.min(f15, f16 + (f23 * f13));
                f22 = (f11 - rectF.left) / f13;
            }
            float f24 = this.f41466u;
            if (f22 > f24) {
                f11 = Math.min(rectF2.right, rectF.left + (f24 * f13));
                f22 = (f11 - rectF.left) / f13;
            }
            if (z11 && z12) {
                f11 = Math.min(f11, Math.min(rectF2.right, rectF.left + (rectF2.height() * f13)));
            } else {
                if (z11) {
                    float f25 = rectF.bottom;
                    float f26 = f25 - f22;
                    float f27 = rectF2.top;
                    if (f26 < f27) {
                        f11 = Math.min(rectF2.right, rectF.left + ((f25 - f27) * f13));
                        f22 = (f11 - rectF.left) / f13;
                    }
                }
                if (z12) {
                    float f28 = rectF.top;
                    float f29 = f22 + f28;
                    float f31 = rectF2.bottom;
                    if (f29 > f31) {
                        f11 = Math.min(f11, Math.min(rectF2.right, rectF.left + ((f31 - f28) * f13)));
                    }
                }
            }
        }
        rectF.right = f11;
    }

    /* renamed from: g */
    private void m39446g(RectF rectF, float f11) {
        rectF.right = rectF.left + (rectF.height() * f11);
    }

    /* renamed from: h */
    private void m39447h(RectF rectF, float f11, RectF rectF2, float f12, float f13, boolean z11, boolean z12) {
        if (f11 < 0.0f) {
            f11 /= 1.05f;
            try {
                this.f41467v.y -= f11 / 1.1f;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        float f14 = rectF2.top;
        if (f11 < f14) {
            this.f41467v.y -= (f11 - f14) / 2.0f;
        }
        if (f11 - f14 < f12) {
            f11 = f14;
        }
        float f15 = rectF.bottom;
        float f16 = f15 - f11;
        float f17 = this.f41464s;
        if (f16 < f17) {
            f11 = f15 - f17;
        }
        float f18 = f15 - f11;
        float f19 = this.f41466u;
        if (f18 > f19) {
            f11 = f15 - f19;
        }
        if (f11 - f14 < f12) {
            f11 = f14;
        }
        if (f13 > 0.0f) {
            float f21 = (f15 - f11) * f13;
            float f22 = this.f41463r;
            if (f21 < f22) {
                f11 = Math.max(f14, f15 - (f22 / f13));
                f21 = (rectF.bottom - f11) * f13;
            }
            float f23 = this.f41465t;
            if (f21 > f23) {
                f11 = Math.max(rectF2.top, rectF.bottom - (f23 / f13));
                f21 = (rectF.bottom - f11) * f13;
            }
            if (z11 && z12) {
                f11 = Math.max(f11, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f13)));
            } else {
                if (z11) {
                    float f24 = rectF.right;
                    float f25 = f24 - f21;
                    float f26 = rectF2.left;
                    if (f25 < f26) {
                        f11 = Math.max(rectF2.top, rectF.bottom - ((f24 - f26) / f13));
                        f21 = (rectF.bottom - f11) * f13;
                    }
                }
                if (z12) {
                    float f27 = rectF.left;
                    float f28 = f21 + f27;
                    float f29 = rectF2.right;
                    if (f28 > f29) {
                        f11 = Math.max(f11, Math.max(rectF2.top, rectF.bottom - ((f29 - f27) / f13)));
                    }
                }
            }
        }
        rectF.top = f11;
    }

    /* renamed from: i */
    private void m39448i(RectF rectF, RectF rectF2, float f11) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f11)) / 2.0f);
        float f12 = rectF.top;
        float f13 = rectF2.top;
        if (f12 < f13) {
            rectF.offset(0.0f, f13 - f12);
        }
        float f14 = rectF.bottom;
        float f15 = rectF2.bottom;
        if (f14 > f15) {
            rectF.offset(0.0f, f15 - f14);
        }
    }

    /* renamed from: j */
    private void m39449j(RectF rectF, float f11) {
        rectF.top = rectF.bottom - (rectF.width() / f11);
    }

    /* renamed from: k */
    private static float m39450k(float f11, float f12, float f13, float f14) {
        return (f13 - f11) / (f14 - f12);
    }

    /* renamed from: l */
    private boolean m39451l(RectF rectF) {
        float f11;
        float f12;
        float f13;
        try {
            float m119362t = AbstractC23170p.m119362t(this.f41445D);
            float m119364v = AbstractC23170p.m119364v(this.f41445D);
            float m119363u = AbstractC23170p.m119363u(this.f41445D);
            float m119361s = AbstractC23170p.m119361s(this.f41445D);
            if (!m39432F()) {
                this.f41446E.set(m119362t, m119364v, m119363u, m119361s);
                return false;
            }
            float[] fArr = this.f41445D;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[4];
            float f17 = fArr[5];
            float f18 = fArr[6];
            float f19 = fArr[7];
            if (f19 < f15) {
                float f21 = fArr[3];
                if (f15 < f21) {
                    float f22 = fArr[2];
                    f15 = f17;
                    f12 = f18;
                    f17 = f21;
                    f11 = f19;
                    f16 = f22;
                    f14 = f16;
                } else {
                    f14 = fArr[2];
                    f12 = f16;
                    f16 = f14;
                    f17 = f15;
                    f15 = f21;
                    f11 = f17;
                }
            } else {
                f11 = fArr[3];
                if (f15 > f11) {
                    f12 = fArr[2];
                    f16 = f18;
                    f17 = f19;
                } else {
                    f12 = f14;
                    f11 = f15;
                    f14 = f18;
                    f15 = f19;
                }
            }
            float f23 = (f15 - f11) / (f14 - f12);
            float f24 = (-1.0f) / f23;
            float f25 = f11 - (f23 * f12);
            float f26 = f11 - (f12 * f24);
            float f27 = f17 - (f23 * f16);
            float f28 = f17 - (f16 * f24);
            float centerY = rectF.centerY() - rectF.top;
            float centerX = rectF.centerX();
            float f29 = rectF.left;
            float f31 = centerY / (centerX - f29);
            float f32 = -f31;
            float f33 = rectF.top;
            float f34 = f33 - (f29 * f31);
            try {
                float f35 = rectF.right;
                float f36 = f33 - (f32 * f35);
                float f37 = f23 - f31;
                float f38 = (f34 - f25) / f37;
                if (f38 < f35) {
                    f13 = f38;
                } else {
                    f13 = m119362t;
                }
                float max = Math.max(m119362t, f13);
                float f39 = (f34 - f26) / (f24 - f31);
                if (f39 >= rectF.right) {
                    f39 = max;
                }
                float max2 = Math.max(max, f39);
                float f41 = f24 - f32;
                float f42 = (f36 - f28) / f41;
                if (f42 >= rectF.right) {
                    f42 = max2;
                }
                float max3 = Math.max(max2, f42);
                float f43 = (f36 - f26) / f41;
                if (f43 <= rectF.left) {
                    f43 = m119363u;
                }
                float min = Math.min(m119363u, f43);
                float f44 = (f36 - f27) / (f23 - f32);
                if (f44 <= rectF.left) {
                    f44 = min;
                }
                float min2 = Math.min(min, f44);
                float f45 = (f34 - f27) / f37;
                if (f45 <= rectF.left) {
                    f45 = min2;
                }
                float min3 = Math.min(min2, f45);
                float max4 = Math.max(m119364v, Math.max((f23 * max3) + f25, (f24 * min3) + f26));
                float min4 = Math.min(m119361s, Math.min((f24 * max3) + f28, (f23 * min3) + f27));
                try {
                    RectF rectF2 = this.f41446E;
                    rectF2.left = max3;
                    rectF2.top = max4;
                    rectF2.right = min3;
                    rectF2.bottom = min4;
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    return true;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* renamed from: m */
    private void m39452m(RectF rectF, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        try {
            float f16 = 0.0f;
            switch (C7712a.f41472a[this.f41468w.ordinal()]) {
                case 1:
                    f16 = rectF.left - f11;
                    f13 = rectF.top;
                    f15 = f13 - f12;
                    break;
                case 2:
                    f16 = rectF.right - f11;
                    f13 = rectF.top;
                    f15 = f13 - f12;
                    break;
                case 3:
                    f16 = rectF.left - f11;
                    f13 = rectF.bottom;
                    f15 = f13 - f12;
                    break;
                case 4:
                    f16 = rectF.right - f11;
                    f13 = rectF.bottom;
                    f15 = f13 - f12;
                    break;
                case 5:
                    f14 = rectF.left;
                    f16 = f14 - f11;
                    f15 = 0.0f;
                    break;
                case 6:
                    f13 = rectF.top;
                    f15 = f13 - f12;
                    break;
                case 7:
                    f14 = rectF.right;
                    f16 = f14 - f11;
                    f15 = 0.0f;
                    break;
                case 8:
                    f13 = rectF.bottom;
                    f15 = f13 - f12;
                    break;
                case 9:
                    f16 = rectF.centerX() - f11;
                    f13 = rectF.centerY();
                    f15 = f13 - f12;
                    break;
                default:
                    f15 = 0.0f;
                    break;
            }
            PointF pointF = this.f41467v;
            pointF.x = f16;
            pointF.y = f15;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    private void m39453n(Canvas canvas) {
        try {
            RectF rect = getRect();
            float max = Math.max(AbstractC23170p.m119362t(this.f41445D), 0.0f);
            float max2 = Math.max(AbstractC23170p.m119364v(this.f41445D), 0.0f);
            float min = Math.min(AbstractC23170p.m119363u(this.f41445D), getWidth());
            float min2 = Math.min(AbstractC23170p.m119361s(this.f41445D), getHeight());
            if (this.f41457P == EnumC7713b.RECTANGLE) {
                if (!m39432F()) {
                    canvas.save();
                    if (Build.VERSION.SDK_INT >= 28) {
                        canvas.clipOutRect(rect);
                    } else {
                        canvas.clipRect(rect, Region.Op.DIFFERENCE);
                    }
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f41443B);
                    canvas.restore();
                    return;
                }
                this.f41444C.reset();
                Path path = this.f41444C;
                float[] fArr = this.f41445D;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f41444C;
                float[] fArr2 = this.f41445D;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f41444C;
                float[] fArr3 = this.f41445D;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f41444C;
                float[] fArr4 = this.f41445D;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f41444C.close();
                canvas.save();
                canvas.clipPath(this.f41444C, Region.Op.INTERSECT);
                if (Build.VERSION.SDK_INT >= 28) {
                    canvas.clipOutRect(rect);
                } else {
                    canvas.clipRect(rect, Region.Op.XOR);
                }
                canvas.drawRect(max, max2, min, min2, this.f41443B);
                canvas.restore();
                return;
            }
            this.f41444C.reset();
            this.f41469x.set(rect.left, rect.top, rect.right, rect.bottom);
            this.f41444C.addOval(this.f41469x, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 28) {
                canvas.clipOutPath(this.f41444C);
            } else {
                canvas.clipPath(this.f41444C, Region.Op.DIFFERENCE);
            }
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f41443B);
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m39454p(Canvas canvas) {
        try {
            Paint paint = this.f41470y;
            if (paint != null) {
                float strokeWidth = paint.getStrokeWidth();
                RectF rect = getRect();
                float f11 = strokeWidth / 2.0f;
                rect.inset(f11, f11);
                if (this.f41457P == EnumC7713b.RECTANGLE) {
                    canvas.drawRect(rect, this.f41470y);
                } else {
                    canvas.drawOval(rect, this.f41470y);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private void m39455q(Canvas canvas) {
        float f11;
        try {
            if (this.f41471z != null) {
                Paint paint = this.f41470y;
                if (paint != null) {
                    f11 = paint.getStrokeWidth();
                } else {
                    f11 = 0.0f;
                }
                RectF rect = getRect();
                rect.inset(f11, f11);
                float f12 = rect.left;
                float f13 = rect.top;
                canvas.drawLine(f12, f13 - f11, f12, f13 + this.f41449H, this.f41471z);
                float f14 = rect.left;
                float f15 = rect.top;
                canvas.drawLine(f14 - f11, f15, f14 + this.f41449H, f15, this.f41471z);
                float f16 = rect.right;
                float f17 = rect.top;
                canvas.drawLine(f16, f17 - f11, f16, f17 + this.f41449H, this.f41471z);
                float f18 = rect.right;
                float f19 = rect.top;
                canvas.drawLine(f18 + f11, f19, f18 - this.f41449H, f19, this.f41471z);
                float f21 = rect.left;
                float f22 = rect.bottom;
                canvas.drawLine(f21, f22 + f11, f21, f22 - this.f41449H, this.f41471z);
                float f23 = rect.left;
                float f24 = rect.bottom;
                canvas.drawLine(f23 - f11, f24, f23 + this.f41449H, f24, this.f41471z);
                float f25 = rect.right;
                float f26 = rect.bottom;
                canvas.drawLine(f25, f26 + f11, f25, f26 - this.f41449H, this.f41471z);
                float f27 = rect.right;
                float f28 = rect.bottom;
                canvas.drawLine(f27 + f11, f28, f27 - this.f41449H, f28, this.f41471z);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m39456r(Canvas canvas) {
        float f11;
        try {
            if (this.f41442A != null) {
                Paint paint = this.f41470y;
                if (paint != null) {
                    f11 = paint.getStrokeWidth();
                } else {
                    f11 = 0.0f;
                }
                RectF rect = getRect();
                rect.inset(f11, f11);
                float width = rect.width() / 3.0f;
                float height = rect.height() / 3.0f;
                if (this.f41457P == EnumC7713b.OVAL) {
                    float width2 = (rect.width() / 2.0f) - f11;
                    float height2 = (rect.height() / 2.0f) - f11;
                    float f12 = rect.left + width;
                    float f13 = rect.right - width;
                    float sin = (float) (height2 * Math.sin(Math.acos((width2 - width) / width2)));
                    canvas.drawLine(f12, (rect.top + height2) - sin, f12, (rect.bottom - height2) + sin, this.f41442A);
                    canvas.drawLine(f13, (rect.top + height2) - sin, f13, (rect.bottom - height2) + sin, this.f41442A);
                    float f14 = rect.top + height;
                    float f15 = rect.bottom - height;
                    float cos = (float) (width2 * Math.cos(Math.asin((height2 - height) / height2)));
                    canvas.drawLine((rect.left + width2) - cos, f14, (rect.right - width2) + cos, f14, this.f41442A);
                    canvas.drawLine((rect.left + width2) - cos, f15, (rect.right - width2) + cos, f15, this.f41442A);
                    return;
                }
                float f16 = rect.left + width;
                float f17 = rect.right - width;
                canvas.drawLine(f16, rect.top, f16, rect.bottom, this.f41442A);
                canvas.drawLine(f17, rect.top, f17, rect.bottom, this.f41442A);
                float f18 = rect.top + height;
                float f19 = rect.bottom - height;
                canvas.drawLine(rect.left, f18, rect.right, f18, this.f41442A);
                canvas.drawLine(rect.left, f19, rect.right, f19, this.f41442A);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    private void m39457s(RectF rectF) {
        try {
            float width = rectF.width();
            float f11 = this.f41463r;
            if (width < f11) {
                float width2 = (f11 - rectF.width()) / 2.0f;
                rectF.left -= width2;
                rectF.right += width2;
            }
            float height = rectF.height();
            float f12 = this.f41464s;
            if (height < f12) {
                float height2 = (f12 - rectF.height()) / 2.0f;
                rectF.top -= height2;
                rectF.bottom += height2;
            }
            if (rectF.width() > this.f41465t) {
                float width3 = (rectF.width() - this.f41465t) / 2.0f;
                rectF.left += width3;
                rectF.right -= width3;
            }
            if (rectF.height() > this.f41466u) {
                float height3 = (rectF.height() - this.f41466u) / 2.0f;
                rectF.top += height3;
                rectF.bottom -= height3;
            }
            m39451l(rectF);
            if (this.f41446E.width() > 0.0f && this.f41446E.height() > 0.0f) {
                float max = Math.max(this.f41446E.left, 0.0f);
                float max2 = Math.max(this.f41446E.top, 0.0f);
                float min = Math.min(this.f41446E.right, getWidth());
                float min2 = Math.min(this.f41446E.bottom, getHeight());
                if (rectF.left < max) {
                    rectF.left = max;
                }
                if (rectF.top < max2) {
                    rectF.top = max2;
                }
                if (rectF.right > min) {
                    rectF.right = min;
                }
                if (rectF.bottom > min2) {
                    rectF.bottom = min2;
                }
            }
            if (this.f41452K && Math.abs(rectF.width() - (rectF.height() * this.f41455N)) > 0.1d) {
                if (rectF.width() > rectF.height() * this.f41455N) {
                    float abs = Math.abs((rectF.height() * this.f41455N) - rectF.width()) / 2.0f;
                    rectF.left += abs;
                    rectF.right -= abs;
                } else {
                    float abs2 = Math.abs((rectF.width() / this.f41455N) - rectF.height()) / 2.0f;
                    rectF.top += abs2;
                    rectF.bottom -= abs2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    private boolean m39458u() {
        return !m39469Q();
    }

    /* renamed from: v */
    private static Paint m39459v(int i11) {
        Paint paint = new Paint();
        paint.setColor(i11);
        return paint;
    }

    /* renamed from: w */
    private static Paint m39460w(float f11, int i11) {
        if (f11 > 0.0f) {
            Paint paint = new Paint();
            paint.setColor(i11);
            paint.setStrokeWidth(f11);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    /* renamed from: x */
    private EnumC7715d m39461x(float f11, float f12) {
        float width = this.f41461p.width() / 6.0f;
        RectF rectF = this.f41461p;
        float f13 = rectF.left;
        float f14 = f13 + width;
        float f15 = f13 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f16 = this.f41461p.top;
        float f17 = f16 + height;
        float f18 = f16 + (height * 5.0f);
        if (f11 < f14) {
            if (f12 < f17) {
                return EnumC7715d.TOP_LEFT;
            }
            if (f12 < f18) {
                return EnumC7715d.LEFT;
            }
            return EnumC7715d.BOTTOM_LEFT;
        }
        if (f11 < f15) {
            if (f12 < f17) {
                return EnumC7715d.TOP;
            }
            if (f12 < f18) {
                return EnumC7715d.CENTER;
            }
            return EnumC7715d.BOTTOM;
        }
        if (f12 < f17) {
            return EnumC7715d.TOP_RIGHT;
        }
        if (f12 < f18) {
            return EnumC7715d.RIGHT;
        }
        return EnumC7715d.BOTTOM_RIGHT;
    }

    /* renamed from: y */
    private EnumC7715d m39462y(float f11, float f12, float f13) {
        RectF rectF = this.f41461p;
        if (m39429C(f11, f12, rectF.left, rectF.top, f13)) {
            return EnumC7715d.TOP_LEFT;
        }
        RectF rectF2 = this.f41461p;
        if (m39429C(f11, f12, rectF2.right, rectF2.top, f13)) {
            return EnumC7715d.TOP_RIGHT;
        }
        RectF rectF3 = this.f41461p;
        if (m39429C(f11, f12, rectF3.left, rectF3.bottom, f13)) {
            return EnumC7715d.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f41461p;
        if (m39429C(f11, f12, rectF4.right, rectF4.bottom, f13)) {
            return EnumC7715d.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f41461p;
        if (m39428B(f11, f12, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m39458u()) {
            return EnumC7715d.CENTER;
        }
        RectF rectF6 = this.f41461p;
        if (m39430D(f11, f12, rectF6.left, rectF6.right, rectF6.top, f13)) {
            return EnumC7715d.TOP;
        }
        RectF rectF7 = this.f41461p;
        if (m39430D(f11, f12, rectF7.left, rectF7.right, rectF7.bottom, f13)) {
            return EnumC7715d.BOTTOM;
        }
        RectF rectF8 = this.f41461p;
        if (m39431E(f11, f12, rectF8.left, rectF8.top, rectF8.bottom, f13)) {
            return EnumC7715d.LEFT;
        }
        RectF rectF9 = this.f41461p;
        if (m39431E(f11, f12, rectF9.right, rectF9.top, rectF9.bottom, f13)) {
            return EnumC7715d.RIGHT;
        }
        RectF rectF10 = this.f41461p;
        if (m39428B(f11, f12, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m39458u()) {
            return EnumC7715d.CENTER;
        }
        return null;
    }

    /* renamed from: z */
    private void m39463z() {
        try {
            float max = Math.max(AbstractC23170p.m119362t(this.f41445D), 0.0f);
            float max2 = Math.max(AbstractC23170p.m119364v(this.f41445D), 0.0f);
            float min = Math.min(AbstractC23170p.m119363u(this.f41445D), getWidth());
            float min2 = Math.min(AbstractC23170p.m119361s(this.f41445D), getHeight());
            if (min > max && min2 > max2) {
                RectF rectF = new RectF();
                this.f41459R = true;
                if (this.f41458Q.width() > 0 && this.f41458Q.height() > 0) {
                    Rect rect = this.f41458Q;
                    float f11 = rect.left + max;
                    rectF.left = f11;
                    rectF.top = rect.top + max2;
                    rectF.right = f11 + rect.width();
                    rectF.bottom = rectF.top + this.f41458Q.height();
                    rectF.left = Math.max(max, rectF.left);
                    rectF.top = Math.max(max2, rectF.top);
                    rectF.right = Math.min(min, rectF.right);
                    rectF.bottom = Math.min(min2, rectF.bottom);
                } else if (this.f41452K && min > max && min2 > max2) {
                    if ((min - max) / (min2 - max2) > this.f41455N) {
                        rectF.top = max2;
                        rectF.bottom = min2;
                        float width = getWidth() / 2.0f;
                        this.f41455N = this.f41453L / this.f41454M;
                        float max3 = Math.max(this.f41463r, rectF.height() * this.f41455N) / 2.0f;
                        rectF.left = width - max3;
                        rectF.right = width + max3;
                    } else {
                        rectF.left = max;
                        rectF.right = min;
                        float height = getHeight() / 2.0f;
                        float max4 = Math.max(this.f41464s, rectF.width() / this.f41455N) / 2.0f;
                        rectF.top = height - max4;
                        rectF.bottom = height + max4;
                    }
                } else {
                    rectF.left = max;
                    rectF.top = max2;
                    rectF.right = min;
                    rectF.bottom = min2;
                }
                m39457s(rectF);
                setRect(rectF);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public boolean m39464A() {
        return this.f41452K;
    }

    /* renamed from: G */
    public void m39465G(RectF rectF, float f11, float f12, RectF rectF2, int i11, int i12, float f13, boolean z11, float f14) {
        try {
            PointF pointF = this.f41467v;
            float f15 = f11 + pointF.x;
            float f16 = f12 + pointF.y;
            if (this.f41468w == EnumC7715d.CENTER) {
                m39433H(rectF, f15, f16, rectF2, i11, i12, f13);
            } else if (z11) {
                m39434I(rectF, f15, f16, rectF2, i11, i12, f13, f14);
            } else {
                m39435J(rectF, f15, f16, rectF2, i11, i12, f13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    public void m39466N(MotionEvent motionEvent) {
        if (isEnabled()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return;
                        }
                    } else {
                        m39437L(motionEvent.getX(), motionEvent.getY());
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                m39438M();
                return;
            }
            m39436K(motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: O */
    public void m39467O(float[] fArr, int i11, int i12) {
        if (fArr != null) {
            try {
                if (Arrays.equals(this.f41445D, fArr)) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (fArr == null) {
            Arrays.fill(this.f41445D, 0.0f);
        } else {
            System.arraycopy(fArr, 0, this.f41445D, 0, fArr.length);
        }
        this.f41447F = i11;
        this.f41448G = i12;
        this.f41459R = true;
        invalidate();
    }

    /* renamed from: P */
    public void m39468P(float f11, float f12) {
        this.f41465t = f11;
        this.f41466u = f12;
    }

    /* renamed from: Q */
    public boolean m39469Q() {
        RectF rectF = this.f41461p;
        if (rectF != null && rectF.width() >= 100.0f && this.f41461p.height() >= 100.0f) {
            return true;
        }
        return false;
    }

    public RectF getBoundBox() {
        return new RectF(Math.max(AbstractC23170p.m119362t(this.f41445D), 0.0f), Math.max(AbstractC23170p.m119364v(this.f41445D), 0.0f), Math.min(AbstractC23170p.m119363u(this.f41445D), this.f41447F), Math.min(AbstractC23170p.m119361s(this.f41445D), this.f41448G));
    }

    public RectF getRect() {
        this.f41462q.set(this.f41461p);
        return this.f41462q;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            m39453n(canvas);
            if (m39469Q()) {
                EnumC7714c enumC7714c = this.f41456O;
                if (enumC7714c == EnumC7714c.ON) {
                    m39456r(canvas);
                } else if (enumC7714c == EnumC7714c.ON_TOUCH && this.f41468w != null) {
                    m39456r(canvas);
                }
            }
            m39454p(canvas);
            if (this.f41457P != EnumC7713b.OVAL) {
                m39455q(canvas);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setAspectRatioX(int i11) {
        if (i11 > 0) {
            if (this.f41453L != i11) {
                this.f41453L = i11;
                this.f41455N = i11 / this.f41454M;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setAspectRatioY(int i11) {
        if (i11 > 0) {
            if (this.f41454M != i11) {
                this.f41454M = i11;
                this.f41455N = this.f41453L / i11;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setCropShape(EnumC7713b enumC7713b) {
        try {
            if (this.f41457P != enumC7713b) {
                this.f41457P = enumC7713b;
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setFixedAspectRatio(boolean z11) {
        if (this.f41452K != z11) {
            this.f41452K = z11;
            if (this.f41459R) {
                m39463z();
                invalidate();
            }
        }
    }

    public void setGuidelines(EnumC7714c enumC7714c) {
        if (this.f41456O != enumC7714c) {
            this.f41456O = enumC7714c;
            if (this.f41459R) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        try {
            this.f41463r = cropImageOptions.f41429H;
            this.f41464s = cropImageOptions.f41430I;
            setCropShape(cropImageOptions.f41431p);
            this.f41451J = cropImageOptions.f41432q;
            setGuidelines(cropImageOptions.f41434s);
            setFixedAspectRatio(cropImageOptions.f41438w);
            setAspectRatioX(cropImageOptions.f41439x);
            setAspectRatioY(cropImageOptions.f41440y);
            this.f41450I = cropImageOptions.f41433r;
            this.f41470y = m39460w(cropImageOptions.f41441z, cropImageOptions.f41422A);
            this.f41449H = cropImageOptions.f41424C;
            this.f41471z = m39460w(cropImageOptions.f41423B, cropImageOptions.f41425D);
            this.f41442A = m39460w(cropImageOptions.f41426E, cropImageOptions.f41427F);
            this.f41443B = m39459v(cropImageOptions.f41428G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setRect(RectF rectF) {
        this.f41461p.set(rectF);
    }
}
