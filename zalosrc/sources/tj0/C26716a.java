package tj0;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import com.zing.zalo.zinstant.zom.properties.ZOMCircularLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import ln0.AbstractC22543l;
import nk0.AbstractC23825g0;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: tj0.a */
/* loaded from: classes7.dex */
public final class C26716a extends AbstractC26719d {
    public static final c Companion = new c(null);

    /* renamed from: j0 */
    private static final ArrayList f126690j0;

    /* renamed from: k0 */
    private static final InterfaceC24854k f126691k0;

    /* renamed from: l0 */
    private static final InterfaceC24854k f126692l0;

    /* renamed from: d0 */
    private int f126693d0;

    /* renamed from: e0 */
    private float f126694e0;

    /* renamed from: f0 */
    private float f126695f0;

    /* renamed from: g0 */
    private float f126696g0;

    /* renamed from: h0 */
    private RectF f126697h0 = new RectF();

    /* renamed from: i0 */
    private Path f126698i0 = new Path();

    /* renamed from: tj0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f126699q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            ArrayList m131500h;
            m131500h = AbstractC25368s.m131500h(Float.valueOf(0.0f), Float.valueOf(360.0f));
            return m131500h;
        }
    }

    /* renamed from: tj0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f126700q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            ArrayList m131500h;
            c cVar = C26716a.Companion;
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((String) cVar.m137392a().get(0), 0.0f, 360.0f);
            AbstractC19074t.m100207e(ofFloat, "ofFloat(\n               …f, 360f\n                )");
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((String) cVar.m137392a().get(1), 0.0f, 90.0f, 360.0f);
            AbstractC19074t.m100207e(ofFloat2, "ofFloat(\n               …f, 360f\n                )");
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat((String) cVar.m137392a().get(2), 0.0f, 270.0f, 270.0f);
            AbstractC19074t.m100207e(ofFloat3, "ofFloat(\n               …f, 270f\n                )");
            m131500h = AbstractC25368s.m131500h(ofFloat, ofFloat2, ofFloat3);
            return m131500h;
        }
    }

    /* renamed from: tj0.a$c */
    /* loaded from: classes7.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ArrayList m137392a() {
            return C26716a.f126690j0;
        }

        /* renamed from: b */
        public final ArrayList m137393b() {
            return (ArrayList) C26716a.f126692l0.getValue();
        }

        /* renamed from: c */
        public final ArrayList m137394c() {
            return (ArrayList) C26716a.f126691k0.getValue();
        }
    }

    static {
        ArrayList m131500h;
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m131500h = AbstractC25368s.m131500h("0", "1", "2");
        f126690j0 = m131500h;
        m129210a = AbstractC24856m.m129210a(b.f126700q);
        f126691k0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f126699q);
        f126692l0 = m129210a2;
    }

    public C26716a() {
        m137423T(1);
        ValueAnimator m137425v = m137425v();
        c cVar = Companion;
        m137425v.setValues(((PropertyValuesHolder) cVar.m137394c().get(0)).clone(), ((PropertyValuesHolder) cVar.m137394c().get(1)).clone(), ((PropertyValuesHolder) cVar.m137394c().get(2)).clone());
        m137423T(1);
    }

    /* renamed from: a0 */
    private final void m137382a0(Canvas canvas) {
        RectF rectF = this.f126697h0;
        Object animatedValue = m137425v().getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        canvas.drawArc(rectF, -90.0f, ((Float) animatedValue).floatValue(), true, m137415C());
    }

    /* renamed from: b0 */
    private final void m137383b0(Canvas canvas) {
        ValueAnimator m137425v = m137425v();
        ArrayList arrayList = f126690j0;
        Object animatedValue = m137425v.getAnimatedValue((String) arrayList.get(0));
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Object animatedValue2 = m137425v().getAnimatedValue((String) arrayList.get(1));
        AbstractC19074t.m100206d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((Float) animatedValue2).floatValue();
        Object animatedValue3 = m137425v().getAnimatedValue((String) arrayList.get(2));
        AbstractC19074t.m100206d(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((Float) animatedValue3).floatValue();
        if (m137425v().getAnimatedFraction() >= 0.5d) {
            floatValue3 = (floatValue3 - floatValue2) + 90;
        }
        canvas.drawArc(this.f126697h0, floatValue2 + floatValue, floatValue3, true, m137415C());
    }

    /* renamed from: c0 */
    private final void m137384c0(int i11) {
        if (this.f126693d0 == i11) {
            return;
        }
        this.f126693d0 = i11;
        if (i11 != 0) {
            if (i11 == 1) {
                ValueAnimator m137425v = m137425v();
                c cVar = Companion;
                Object obj = cVar.m137393b().get(0);
                AbstractC19074t.m100207e(obj, "DETERMINATE_VALUES[0]");
                Object obj2 = cVar.m137393b().get(1);
                AbstractC19074t.m100207e(obj2, "DETERMINATE_VALUES[1]");
                m137425v.setFloatValues(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }
        } else {
            ValueAnimator m137425v2 = m137425v();
            c cVar2 = Companion;
            m137425v2.setValues(((PropertyValuesHolder) cVar2.m137394c().get(0)).clone(), ((PropertyValuesHolder) cVar2.m137394c().get(1)).clone(), ((PropertyValuesHolder) cVar2.m137394c().get(2)).clone());
        }
        m137422S(m137426w() | 512);
    }

    /* renamed from: d0 */
    private final void m137385d0(float f11) {
        if (this.f126694e0 == f11) {
            return;
        }
        this.f126694e0 = f11;
        m137422S(m137426w() | 1024);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: H */
    protected void mo137386H() {
        float m116583f;
        if (m137418F(4) || m137418F(8) || m137418F(1) || m137418F(1024)) {
            m116583f = AbstractC22543l.m116583f(m137417E(), m137413A());
            float f11 = m116583f / 2.0f;
            this.f126695f0 = f11;
            this.f126696g0 = f11 - this.f126694e0;
            float f12 = (getBounds().left + getBounds().right) / 2.0f;
            float f13 = (getBounds().top + getBounds().bottom) / 2.0f;
            RectF rectF = this.f126697h0;
            float f14 = this.f126695f0;
            rectF.set(f12 - f14, f13 - f14, f12 + f14, f14 + f13);
            this.f126698i0.reset();
            this.f126698i0.addCircle(f12, f13, this.f126696g0, Path.Direction.CW);
            m137422S(0);
        }
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: I */
    public void mo137387I(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (AbstractC23825g0.f115102E) {
            canvas.drawRect(this.f126697h0, m137428y());
        }
        canvas.clipPath(this.f126698i0, Region.Op.DIFFERENCE);
        int i11 = this.f126693d0;
        if (i11 != 0) {
            if (i11 == 1) {
                m137382a0(canvas);
                return;
            }
            return;
        }
        m137383b0(canvas);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: L */
    protected void mo137388L(ZOMLoading zOMLoading) {
        AbstractC19074t.m100208f(zOMLoading, "loading");
        ZOMCircularLoading zOMCircularLoading = zOMLoading.mCircularLoading;
        if (zOMCircularLoading != null) {
            m137384c0(zOMCircularLoading.mType);
            m137385d0(zOMCircularLoading.mThickness);
        }
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public int getOpacity() {
        return m137415C().getAlpha();
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj0.AbstractC26719d
    /* renamed from: u */
    public boolean mo137389u() {
        if (super.mo137389u() && this.f126694e0 > 0.0f && m137427x() != 0) {
            return true;
        }
        return false;
    }
}
