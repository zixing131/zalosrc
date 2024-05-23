package md0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* renamed from: md0.c */
/* loaded from: classes4.dex */
public class C22990c {

    /* renamed from: C */
    private static final LruCache f111792C = new LruCache(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);

    /* renamed from: A */
    private boolean f111793A;

    /* renamed from: b */
    private int f111796b;

    /* renamed from: g */
    private int f111801g;

    /* renamed from: h */
    private CharSequence f111802h;

    /* renamed from: l */
    private TextUtils.TruncateAt f111806l;

    /* renamed from: o */
    private Layout.Alignment f111809o;

    /* renamed from: p */
    private Typeface f111810p;

    /* renamed from: q */
    private int f111811q;

    /* renamed from: r */
    private boolean f111812r;

    /* renamed from: s */
    private float f111813s;

    /* renamed from: t */
    private float f111814t;

    /* renamed from: u */
    private float f111815u;

    /* renamed from: v */
    private int f111816v;

    /* renamed from: z */
    private Layout f111820z;

    /* renamed from: a */
    private boolean f111795a = false;

    /* renamed from: c */
    private int f111797c = 0;

    /* renamed from: d */
    private int f111798d = 2;

    /* renamed from: e */
    private int f111799e = Integer.MAX_VALUE;

    /* renamed from: f */
    private int f111800f = 2;

    /* renamed from: i */
    float f111803i = 1.0f;

    /* renamed from: j */
    float f111804j = 0.0f;

    /* renamed from: k */
    boolean f111805k = true;

    /* renamed from: m */
    private boolean f111807m = false;

    /* renamed from: n */
    private int f111808n = Integer.MAX_VALUE;

    /* renamed from: w */
    private int f111817w = 0;

    /* renamed from: x */
    private boolean f111818x = false;

    /* renamed from: y */
    private boolean f111819y = true;

    /* renamed from: B */
    private TextPaint f111794B = new TextPaint(1);

    /* renamed from: B */
    private void m117763B() {
        int i11;
        int i12;
        m117764b();
        Typeface typeface = this.f111810p;
        if (typeface != null && (i12 = this.f111811q) != 0) {
            typeface = Typeface.create(typeface, i12);
            this.f111794B.setTypeface(typeface);
        } else {
            int i13 = this.f111811q;
            if (i13 != 0) {
                typeface = Typeface.defaultFromStyle(i13);
                this.f111794B.setTypeface(Typeface.defaultFromStyle(this.f111811q));
            } else {
                this.f111794B.setTypeface(typeface);
            }
        }
        boolean z11 = false;
        if (typeface != null) {
            i11 = typeface.getStyle();
        } else {
            i11 = 0;
        }
        int i14 = (~i11) & this.f111811q;
        float f11 = 0.0f;
        if (i14 != 0) {
            TextPaint textPaint = this.f111794B;
            if ((i14 & 1) != 0) {
                z11 = true;
            }
            textPaint.setFakeBoldText(z11);
            TextPaint textPaint2 = this.f111794B;
            if ((i14 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint2.setTextSkewX(f11);
            return;
        }
        this.f111794B.setFakeBoldText(false);
        this.f111794B.setTextSkewX(0.0f);
    }

    /* renamed from: b */
    private void m117764b() {
        if (this.f111793A) {
            this.f111794B = new TextPaint(this.f111794B);
            this.f111793A = false;
        }
    }

    /* renamed from: A */
    public C22990c m117765A(boolean z11) {
        if (this.f111818x != z11) {
            this.f111818x = z11;
            this.f111820z = null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Layout m117766a() {
        Layout layout;
        int i11;
        BoringLayout.Metrics metrics;
        int i12;
        int min;
        int max;
        int i13;
        int i14;
        Layout layout2;
        if (this.f111819y && (layout2 = this.f111820z) != null) {
            return layout2;
        }
        CharSequence charSequence = this.f111802h;
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        int m117769e = m117769e();
        if (this.f111819y) {
            layout = (Layout) f111792C.get(Integer.valueOf(m117769e));
            if (layout != null) {
                CharSequence text = layout.getText();
                int min2 = Math.min(text.length() - 1, 3);
                if (min2 < charSequence2.length()) {
                    if (min2 >= 0) {
                        for (int i15 = 0; i15 < min2; i15++) {
                            if (text.charAt(i15) == charSequence2.charAt(i15)) {
                            }
                        }
                    }
                }
            }
            if (layout == null) {
                if (this.f111807m) {
                    i11 = 1;
                } else {
                    i11 = this.f111808n;
                }
                try {
                    metrics = BoringLayout.isBoring(charSequence2, this.f111794B);
                } catch (Exception unused) {
                    metrics = null;
                }
                if (this.f111801g == 1) {
                    i12 = this.f111796b;
                } else {
                    if (metrics != null) {
                        i12 = metrics.width;
                    } else {
                        i12 = -1;
                    }
                    if (i12 < 0) {
                        try {
                            i12 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, this.f111794B));
                        } catch (Exception unused2) {
                            i12 = (int) this.f111794B.measureText(charSequence2.toString());
                        }
                    }
                    if (this.f111801g == 2) {
                        i12 = Math.min(i12, this.f111796b);
                    }
                }
                if (this.f111800f == 1) {
                    min = Math.min(i12, this.f111799e * m117770f());
                } else {
                    min = Math.min(i12, this.f111799e);
                }
                if (this.f111798d == 1) {
                    max = Math.max(min, this.f111797c * m117770f());
                } else {
                    max = Math.max(min, this.f111797c);
                }
                int i16 = max;
                Layout.Alignment alignment = this.f111809o;
                if (alignment == null) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                Layout.Alignment alignment2 = alignment;
                if (Build.VERSION.SDK_INT >= 23 && (i14 = this.f111817w) != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                    layout = AbstractC22989b.m117759c(charSequence2, this.f111794B, i16, alignment2, this.f111803i, this.f111804j, this.f111805k, this.f111806l, i16, i11, i13, this.f111818x, metrics);
                    if (this.f111819y) {
                        LruCache lruCache = f111792C;
                        lruCache.put(Integer.valueOf(m117769e), layout);
                        this.f111793A = true;
                        if (this.f111795a && this.f111801g != 1) {
                            this.f111801g = 1;
                            int width = layout.getWidth();
                            this.f111796b = width;
                            this.f111799e = width;
                            lruCache.put(Integer.valueOf(m117769e()), layout);
                        }
                    }
                }
                i13 = 0;
                layout = AbstractC22989b.m117759c(charSequence2, this.f111794B, i16, alignment2, this.f111803i, this.f111804j, this.f111805k, this.f111806l, i16, i11, i13, this.f111818x, metrics);
                if (this.f111819y) {
                }
            }
            if (this.f111819y) {
                this.f111820z = layout;
            }
            return layout;
        }
        layout = null;
        if (layout == null) {
        }
        if (this.f111819y) {
        }
        return layout;
    }

    /* renamed from: c */
    public Layout.Alignment m117767c() {
        return this.f111809o;
    }

    /* renamed from: d */
    public Paint.FontMetrics m117768d() {
        return this.f111794B.getFontMetrics();
    }

    /* renamed from: e */
    public int m117769e() {
        int i11;
        int i12;
        int i13;
        int floatToIntBits = (((((((((((((((((((this.f111796b + 31) * 31) + this.f111797c) * 31) + this.f111798d) * 31) + this.f111799e) * 31) + this.f111800f) * 31) + this.f111801g) * 31) + Float.floatToIntBits(this.f111803i)) * 31) + Float.floatToIntBits(this.f111804j)) * 31) + Float.floatToIntBits(this.f111794B.getLetterSpacing())) * 31) + (this.f111805k ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.f111806l;
        int i14 = 0;
        if (truncateAt != null) {
            i11 = truncateAt.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (((((floatToIntBits + i11) * 31) + (this.f111807m ? 1 : 0)) * 31) + this.f111808n) * 31;
        Layout.Alignment alignment = this.f111809o;
        if (alignment != null) {
            i12 = alignment.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Typeface typeface = this.f111810p;
        if (typeface != null) {
            i13 = typeface.hashCode();
        } else {
            i13 = 0;
        }
        int color = (((((((((((((((((((((((i16 + i13) * 31) + this.f111811q) * 31) + (this.f111812r ? 1 : 0)) * 31) + this.f111794B.getColor()) * 31) + Float.floatToIntBits(m117772h())) * 31) + this.f111816v) * 31) + Float.floatToIntBits(this.f111814t)) * 31) + Float.floatToIntBits(this.f111815u)) * 31) + Float.floatToIntBits(this.f111813s)) * 31) + this.f111816v) * 31) + this.f111817w) * 31) + (this.f111818x ? 1 : 0)) * 31;
        CharSequence charSequence = this.f111802h;
        if (charSequence != null) {
            i14 = charSequence.hashCode();
        }
        return color + i14;
    }

    /* renamed from: f */
    public int m117770f() {
        return Math.round((this.f111794B.getFontMetricsInt(null) * this.f111803i) + this.f111804j);
    }

    /* renamed from: g */
    public int m117771g() {
        return this.f111794B.getColor();
    }

    /* renamed from: h */
    public float m117772h() {
        return this.f111794B.getTextSize();
    }

    /* renamed from: i */
    public C22990c m117773i(Layout.Alignment alignment) {
        if (this.f111809o != alignment) {
            this.f111809o = alignment;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: j */
    public C22990c m117774j(TextUtils.TruncateAt truncateAt) {
        if (this.f111806l != truncateAt) {
            this.f111806l = truncateAt;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: k */
    public C22990c m117775k(boolean z11) {
        if (this.f111805k != z11) {
            this.f111805k = z11;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: l */
    public C22990c m117776l(float f11) {
        m117764b();
        if (this.f111794B.getLetterSpacing() != f11) {
            this.f111794B.setLetterSpacing(f11);
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: m */
    public C22990c m117777m(int i11) {
        if (this.f111808n != i11) {
            this.f111808n = i11;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: n */
    public C22990c m117778n(int i11) {
        if (this.f111799e != i11 || this.f111798d != 2) {
            this.f111799e = i11;
            this.f111800f = 2;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: o */
    public C22990c m117779o(float f11, float f12, float f13, int i11) {
        m117764b();
        if (f11 != this.f111813s || f12 != this.f111814t || f13 != this.f111815u || i11 != this.f111816v) {
            this.f111813s = f11;
            this.f111814t = f12;
            this.f111815u = f13;
            this.f111816v = i11;
            this.f111794B.setShadowLayer(f11, f12, f13, i11);
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: p */
    public C22990c m117780p(boolean z11) {
        if (this.f111807m != z11) {
            this.f111807m = z11;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: q */
    public C22990c m117781q(CharSequence charSequence) {
        this.f111802h = charSequence;
        this.f111820z = null;
        return this;
    }

    /* renamed from: r */
    public C22990c m117782r(int i11) {
        m117764b();
        if (m117771g() != i11) {
            this.f111794B.setColor(i11);
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: s */
    public C22990c m117783s(float f11) {
        if (this.f111794B.getTextSize() != f11) {
            m117764b();
            this.f111794B.setTextSize(f11);
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: t */
    public C22990c m117784t(float f11) {
        if (this.f111804j != f11) {
            this.f111804j = f11;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: u */
    public C22990c m117785u(float f11) {
        if (this.f111803i != f11) {
            this.f111803i = f11;
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: v */
    public C22990c m117786v(int i11) {
        if (this.f111811q != i11) {
            this.f111811q = i11;
            m117763B();
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: w */
    public C22990c m117787w(Typeface typeface) {
        if (this.f111810p != typeface) {
            this.f111810p = typeface;
            m117763B();
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: x */
    public C22990c m117788x(boolean z11) {
        m117764b();
        if (this.f111812r != z11) {
            this.f111812r = z11;
            if (z11) {
                TextPaint textPaint = this.f111794B;
                textPaint.setFlags(textPaint.getFlags() | 8);
            } else {
                TextPaint textPaint2 = this.f111794B;
                textPaint2.setFlags(textPaint2.getFlags() & (-9));
            }
            this.f111820z = null;
        }
        return this;
    }

    /* renamed from: y */
    public C22990c m117789y(int i11) {
        int i12;
        if (i11 <= 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        return m117790z(i11, i12);
    }

    /* renamed from: z */
    public C22990c m117790z(int i11, int i12) {
        if (this.f111796b != i11 || this.f111801g != i12) {
            this.f111796b = i11;
            this.f111801g = i12;
            this.f111820z = null;
        }
        return this;
    }
}
