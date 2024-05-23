package sk0;

import android.view.animation.Interpolator;
import com.zing.zalo.zinstant.renderer.internal.animation.timingfunction.InvalidParamsException;
import fn0.AbstractC19074t;
import sk0.AbstractC26308b;

/* renamed from: sk0.g */
/* loaded from: classes7.dex */
public final class C26313g extends AbstractC26308b {

    /* renamed from: a */
    public static final C26313g f124965a = new C26313g();

    /* renamed from: sk0.g$a */
    /* loaded from: classes7.dex */
    private static final class a implements AbstractC26308b.a {

        /* renamed from: a */
        public static final a f124966a = new a();

        private a() {
        }

        @Override // sk0.AbstractC26308b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float[] mo135436a(Float[] fArr) {
            AbstractC19074t.m100208f(fArr, "params");
            if (fArr.length == 4) {
                float floatValue = fArr[0].floatValue();
                float floatValue2 = fArr[2].floatValue();
                if (floatValue >= 0.0f && floatValue <= 1.0f && floatValue2 >= 0.0f && floatValue2 <= 1.0f) {
                    return fArr;
                }
                throw new InvalidParamsException("x1 or X2 is invalid. x1 and x2 must in [0-1]");
            }
            throw new InvalidParamsException("Need 4 params for CubicBezier TimingFunction");
        }
    }

    private C26313g() {
    }

    @Override // sk0.AbstractC26308b
    /* renamed from: c */
    protected AbstractC26308b.a mo135435c() {
        return a.f124966a;
    }

    /* renamed from: d */
    public final Interpolator m135437d(float f11, float f12, float f13, float f14) {
        return m135433a(new Float[]{Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Float.valueOf(f14)});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sk0.AbstractC26308b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Interpolator mo135434b(Float[] fArr) {
        AbstractC19074t.m100208f(fArr, "params");
        return new C26307a(fArr[0].floatValue(), fArr[1].floatValue(), fArr[2].floatValue(), fArr[3].floatValue());
    }
}
