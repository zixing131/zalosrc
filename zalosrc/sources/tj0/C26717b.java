package tj0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.zinstant.zom.properties.ZOMDotLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMRotate;
import com.zing.zalo.zinstant.zom.properties.ZOMScale;
import com.zing.zalo.zinstant.zom.properties.ZOMSkew;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ln0.AbstractC22543l;
import nk0.AbstractC23825g0;

/* renamed from: tj0.b */
/* loaded from: classes7.dex */
public final class C26717b extends AbstractC26719d {

    /* renamed from: d0 */
    private int f126701d0;

    /* renamed from: e0 */
    private float f126702e0;

    /* renamed from: f0 */
    private int f126703f0;

    /* renamed from: g0 */
    private final LinkedList f126704g0 = new LinkedList();

    /* renamed from: h0 */
    private RectF f126705h0 = new RectF();

    /* renamed from: i0 */
    private List f126706i0;

    /* renamed from: j0 */
    private float f126707j0;

    /* renamed from: k0 */
    private float f126708k0;

    public C26717b() {
        m137423T(3);
        m137425v().setFloatValues(0.0f, 1.0f);
    }

    /* renamed from: X */
    private final void m137395X(Canvas canvas, LinkedList linkedList, float f11) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ZOMTransformElement zOMTransformElement = (ZOMTransformElement) it.next();
            int type = zOMTransformElement.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMSkew");
                            ZOMSkew zOMSkew = (ZOMSkew) zOMTransformElement;
                            double d11 = f11;
                            canvas.skew((float) Math.tan(Math.toRadians(zOMSkew.mAngleX * d11)), (float) Math.tan(Math.toRadians(zOMSkew.mAngleY * d11)));
                        }
                    } else {
                        AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMRotate");
                        canvas.rotate(((ZOMRotate) zOMTransformElement).mAngle * f11);
                    }
                } else {
                    AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMScale");
                    ZOMScale zOMScale = (ZOMScale) zOMTransformElement;
                    float f12 = 1;
                    canvas.scale(((zOMScale.f88007mX - f12) * f11) + f12, ((zOMScale.f88008mY - f12) * f11) + f12);
                }
            } else {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMTranslate");
                ZOMTranslate zOMTranslate = (ZOMTranslate) zOMTransformElement;
                canvas.translate(zOMTranslate.f88010mX * f11, zOMTranslate.f88011mY * f11);
            }
        }
    }

    /* renamed from: Y */
    private final RectF m137396Y(float f11, float f12, Rect rect) {
        float f13 = (rect.left + rect.right) / 2.0f;
        float f14 = (rect.top + rect.bottom) / 2.0f;
        float f15 = 2;
        float f16 = f11 / f15;
        float f17 = f12 / f15;
        return new RectF(f13 - f16, f14 - f17, f13 + f16, f14 + f17);
    }

    /* renamed from: Z */
    private final void m137397Z(int i11) {
        if (this.f126703f0 == i11) {
            return;
        }
        this.f126703f0 = i11;
        m137422S(m137426w() | 524288);
    }

    /* renamed from: a0 */
    private final void m137398a0(int i11) {
        if (this.f126701d0 == i11) {
            return;
        }
        this.f126701d0 = i11;
        m137422S(m137426w() | 4194304);
    }

    /* renamed from: b0 */
    private final void m137399b0(float f11) {
        if (this.f126702e0 == f11) {
            return;
        }
        this.f126702e0 = f11;
        m137422S(m137426w() | 2097152);
    }

    /* renamed from: c0 */
    private final void m137400c0(ZOMTransformElement[] zOMTransformElementArr) {
        if (AbstractC19074t.m100204b(this.f126704g0, zOMTransformElementArr)) {
            return;
        }
        this.f126704g0.clear();
        for (ZOMTransformElement zOMTransformElement : zOMTransformElementArr) {
            this.f126704g0.add(zOMTransformElement);
        }
        m137422S(m137426w() | ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: H */
    protected void mo137386H() {
        if (m137418F(64)) {
            m137425v().setInterpolator(new LinearInterpolator());
        }
        if (m137418F(4) || m137418F(8) || m137418F(1)) {
            RectF rectF = this.f126705h0;
            float m137417E = m137417E();
            float m137413A = m137413A();
            Rect bounds = getBounds();
            AbstractC19074t.m100207e(bounds, "bounds");
            rectF.set(m137396Y(m137417E, m137413A, bounds));
        }
        if (m137418F(4194304) || m137418F(4) || m137418F(8) || m137418F(1)) {
            RectF rectF2 = this.f126705h0;
            float f11 = rectF2.top;
            this.f126707j0 = f11 + ((rectF2.bottom - f11) / 2.0f);
            int i11 = this.f126701d0;
            ArrayList arrayList = new ArrayList(i11);
            int i12 = 0;
            while (i12 < i11) {
                RectF rectF3 = this.f126705h0;
                float f12 = rectF3.left;
                i12++;
                arrayList.add(Float.valueOf(f12 + (((rectF3.right - f12) * i12) / (this.f126701d0 + 1))));
            }
            this.f126706i0 = arrayList;
        }
        if (m137418F(524288) || m137418F(32)) {
            this.f126708k0 = (this.f126703f0 * 1.0f) / m137429z();
        }
        m137422S(0);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: I */
    public void mo137387I(Canvas canvas) {
        float m116579b;
        AbstractC19074t.m100208f(canvas, "canvas");
        int i11 = this.f126701d0;
        for (int i12 = 0; i12 < i11; i12++) {
            m116579b = AbstractC22543l.m116579b(((((float) m137425v().getCurrentPlayTime()) * 1.0f) / m137429z()) - (this.f126708k0 * i12), 0.0f);
            float f11 = 2;
            float interpolation = m137414B().getInterpolation(m116579b - ((int) m116579b)) * f11;
            canvas.save();
            List list = this.f126706i0;
            List list2 = null;
            if (list == null) {
                AbstractC19074t.m100223u("cx");
                list = null;
            }
            canvas.translate(((Number) list.get(i12)).floatValue(), this.f126707j0);
            LinkedList linkedList = this.f126704g0;
            if (interpolation > 1.0f) {
                interpolation = f11 - interpolation;
            }
            m137395X(canvas, linkedList, interpolation);
            canvas.drawCircle(0.0f, 0.0f, this.f126702e0, m137415C());
            List list3 = this.f126706i0;
            if (list3 == null) {
                AbstractC19074t.m100223u("cx");
            } else {
                list2 = list3;
            }
            canvas.translate(-((Number) list2.get(i12)).floatValue(), -this.f126707j0);
            canvas.restore();
        }
        if (AbstractC23825g0.f115102E) {
            canvas.drawRect(this.f126705h0, m137428y());
        }
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: L */
    protected void mo137388L(ZOMLoading zOMLoading) {
        AbstractC19074t.m100208f(zOMLoading, "loading");
        ZOMDotLoading zOMDotLoading = zOMLoading.mDotLoading;
        if (zOMDotLoading != null) {
            m137397Z(zOMDotLoading.mDotDelay);
            m137398a0(zOMDotLoading.mNumDot);
            m137399b0(zOMDotLoading.mRadius);
            ZOMTransformElement[] zOMTransformElementArr = zOMDotLoading.mTransformElements;
            if (zOMTransformElementArr != null) {
                AbstractC19074t.m100207e(zOMTransformElementArr, "transform");
                m137400c0(zOMTransformElementArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj0.AbstractC26719d
    /* renamed from: u */
    public boolean mo137389u() {
        if (m137417E() > 0.0f && m137429z() > 0 && this.f126701d0 > 0 && this.f126702e0 > 0.0f && this.f126704g0.size() > 0) {
            return true;
        }
        return false;
    }
}
