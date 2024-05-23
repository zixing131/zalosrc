package ya0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.util.Collection;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26702a;

/* renamed from: ya0.c */
/* loaded from: classes6.dex */
public final class C30878c extends C16719g {
    public static final a Companion = new a(null);

    /* renamed from: J0 */
    private static final int f142460J0 = AbstractC23222t7.f112586t;

    /* renamed from: D0 */
    private final RectF f142461D0;

    /* renamed from: E0 */
    private final RectF f142462E0;

    /* renamed from: F0 */
    private final Path f142463F0;

    /* renamed from: G0 */
    private final C26702a f142464G0;

    /* renamed from: H0 */
    private C30877b f142465H0;

    /* renamed from: I0 */
    private final C26702a f142466I0;

    /* renamed from: ya0.c$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30878c(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f142461D0 = new RectF();
        this.f142462E0 = new RectF();
        this.f142463F0 = new Path();
        this.f142464G0 = new C26702a(context, 1);
        this.f142466I0 = new C26702a(context, 1);
        m150090h1();
    }

    /* renamed from: g1 */
    private final int m150089g1(int i11) {
        int i12;
        List m150087a;
        C30876a c30876a;
        int i13;
        int m118639A;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List m150087a2;
        Paint.FontMetrics fontMetrics = this.f142466I0.getFontMetrics();
        int ceil = (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
        C30877b c30877b = this.f142465H0;
        if (c30877b != null && (m150087a2 = c30877b.m150087a()) != null) {
            i12 = m150087a2.size();
        } else {
            i12 = 0;
        }
        float f11 = 0.0f;
        for (int i19 = 0; i19 < i12; i19++) {
            C30877b c30877b2 = this.f142465H0;
            if (c30877b2 != null && (m150087a = c30877b2.m150087a()) != null && (c30876a = (C30876a) m150087a.get(i19)) != null) {
                if (c30876a.m150082c()) {
                    i13 = AbstractC23222t7.f112586t;
                } else {
                    i13 = 0;
                }
                float f12 = i13 + f11;
                if (c30876a.m150083d()) {
                    String m150086g = c30876a.m150086g();
                    C26702a c26702a = this.f142466I0;
                    if (c30876a.m150085f() == -1) {
                        m118639A = C23212s8.m119606n(AbstractC2807a.text_02);
                    } else {
                        m118639A = AbstractC23136l9.m118639A(c30876a.m150085f());
                    }
                    c26702a.setColor(m118639A);
                    if (c30876a.m150082c()) {
                        i14 = AbstractC23222t7.f112556e;
                    } else {
                        i14 = 0;
                    }
                    float f13 = f12 + i14;
                    if (c30876a.m150081b() != null) {
                        i15 = c30876a.m150081b().getIntrinsicWidth() + AbstractC23222t7.f112566j;
                    } else {
                        i15 = 0;
                    }
                    float f14 = f13 + i15;
                    float measureText = this.f142466I0.measureText(m150086g);
                    if (AbstractC23222t7.f112586t + f14 + measureText > i11) {
                        if (c30876a.m150082c()) {
                            i16 = AbstractC23222t7.f112586t;
                        } else {
                            i16 = 0;
                        }
                        float f15 = i16;
                        if (c30876a.m150082c()) {
                            i17 = AbstractC23222t7.f112556e;
                        } else {
                            i17 = 0;
                        }
                        float f16 = f15 + i17;
                        if (c30876a.m150081b() != null) {
                            i18 = c30876a.m150081b().getIntrinsicWidth() + AbstractC23222t7.f112566j;
                        } else {
                            i18 = 0;
                        }
                        f14 = f16 + i18;
                        ceil += AbstractC23222t7.f112576o + ceil;
                    }
                    f11 = measureText + f14 + AbstractC23222t7.f112586t;
                }
            }
        }
        return ceil;
    }

    /* renamed from: h1 */
    private final void m150090h1() {
        this.f142466I0.setTextSize(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
    }

    /* renamed from: i1 */
    public final void m150091i1(C30877b c30877b) {
        AbstractC19074t.m100208f(c30877b, "storageBreakdown");
        this.f142465H0 = c30877b;
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        int i11;
        int i12;
        int i13;
        List m150087a;
        C30876a c30876a;
        long j11;
        float f11;
        int i14;
        int m118639A;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        List m150087a2;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        C30877b c30877b = this.f142465H0;
        if (c30877b != null && c30877b.m150088b() == 0) {
            return;
        }
        canvas.clipPath(this.f142463F0);
        C30877b c30877b2 = this.f142465H0;
        if (c30877b2 != null && (m150087a2 = c30877b2.m150087a()) != null) {
            i11 = m150087a2.size();
        } else {
            i11 = 0;
        }
        int m89114P = m89114P();
        Paint.FontMetrics fontMetrics = this.f142466I0.getFontMetrics();
        int ceil = (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
        int i21 = AbstractC23222t7.f112556e;
        float f12 = this.f142462E0.top + (ceil / 2);
        int i22 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (i22 < i11) {
            C30877b c30877b3 = this.f142465H0;
            if (c30877b3 != null && (m150087a = c30877b3.m150087a()) != null && (c30876a = (C30876a) m150087a.get(i22)) != null) {
                this.f142464G0.setColor(AbstractC23136l9.m118639A(c30876a.m150080a()));
                float m150084e = (float) c30876a.m150084e();
                C30877b c30877b4 = this.f142465H0;
                if (c30877b4 != null) {
                    j11 = c30877b4.m150088b();
                } else {
                    j11 = 1;
                }
                float f15 = m150084e / ((float) j11);
                if (i22 < i11 - 1) {
                    f11 = (m89114P * f15) + f13;
                } else {
                    f11 = m89114P;
                }
                RectF rectF = this.f142461D0;
                rectF.left = f13;
                rectF.right = f11;
                canvas.drawRect(rectF, this.f142464G0);
                if (c30876a.m150082c()) {
                    i14 = AbstractC23222t7.f112586t;
                } else {
                    i14 = 0;
                }
                float f16 = i14 + f14;
                float f17 = (f14 + f16) / 2;
                Drawable m150081b = c30876a.m150081b();
                if (m150081b != null) {
                    int i23 = (int) f16;
                    i12 = i11;
                    int intrinsicHeight = ((int) f12) - (m150081b.getIntrinsicHeight() / 2);
                    i13 = m89114P;
                    m150081b.setBounds(i23, intrinsicHeight, m150081b.getIntrinsicWidth() + i23, intrinsicHeight + m150081b.getIntrinsicHeight());
                    m150081b.draw(canvas);
                } else {
                    i12 = i11;
                    i13 = m89114P;
                }
                if (c30876a.m150083d()) {
                    String m150086g = c30876a.m150086g();
                    C26702a c26702a = this.f142466I0;
                    if (c30876a.m150085f() == -1) {
                        m118639A = C23212s8.m119606n(AbstractC2807a.text_02);
                    } else {
                        m118639A = AbstractC23136l9.m118639A(c30876a.m150085f());
                    }
                    c26702a.setColor(m118639A);
                    if (c30876a.m150082c()) {
                        i15 = AbstractC23222t7.f112556e;
                    } else {
                        i15 = 0;
                    }
                    float f18 = f16 + i15;
                    if (c30876a.m150081b() != null) {
                        i16 = c30876a.m150081b().getIntrinsicWidth() + AbstractC23222t7.f112566j;
                    } else {
                        i16 = 0;
                    }
                    float f19 = f18 + i16;
                    float measureText = this.f142466I0.measureText(m150086g);
                    if (AbstractC23222t7.f112586t + f19 + measureText > canvas.getWidth()) {
                        if (c30876a.m150082c()) {
                            i17 = AbstractC23222t7.f112586t;
                        } else {
                            i17 = 0;
                        }
                        float f21 = i17;
                        if (c30876a.m150082c()) {
                            i18 = AbstractC23222t7.f112556e;
                        } else {
                            i18 = 0;
                        }
                        float f22 = f21 + i18;
                        if (c30876a.m150081b() != null) {
                            i19 = c30876a.m150081b().getIntrinsicWidth() + AbstractC23222t7.f112566j;
                        } else {
                            i19 = 0;
                        }
                        f19 = f22 + i19;
                        if (c30876a.m150082c()) {
                            f17 = AbstractC23222t7.f112586t / 2.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        f12 += AbstractC23222t7.f112576o + ceil;
                    }
                    if (c30876a.m150082c()) {
                        canvas.drawCircle(f17, f12, i21, this.f142464G0);
                    }
                    canvas.drawText(m150086g, f19, i21 + f12, this.f142466I0);
                    f14 = f19 + AbstractC23222t7.f112586t + measureText;
                }
                f13 = f11;
            } else {
                i12 = i11;
                i13 = m89114P;
            }
            i22++;
            i11 = i12;
            m89114P = i13;
        }
        super.mo44775o0(canvas);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int m104529e;
        List m150087a;
        float f11 = f142460J0;
        C30877b c30877b = this.f142465H0;
        if (c30877b != null && (m150087a = c30877b.m150087a()) != null) {
            List<C30876a> list = m150087a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C30876a c30876a : list) {
                    if (c30876a.m150083d() || c30876a.m150082c()) {
                        i15 = AbstractC23222t7.f112572m;
                        i16 = m150089g1(i11);
                        break;
                    }
                }
            }
        }
        i15 = 0;
        i16 = 0;
        float f12 = i15 + f11;
        float f13 = i16 + f12;
        float f14 = AbstractC23222t7.f112552c;
        float f15 = i11;
        this.f142461D0.set(0.0f, 0.0f, f15, f11);
        this.f142462E0.set(0.0f, f12, f15, f13);
        this.f142463F0.reset();
        Path path = this.f142463F0;
        RectF rectF = this.f142461D0;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f14, f14, direction);
        this.f142463F0.addRect(this.f142462E0, direction);
        m104529e = AbstractC20104d.m104529e(f13);
        m89097G0(i11, m104529e);
    }
}
