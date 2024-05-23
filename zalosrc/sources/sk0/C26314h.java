package sk0;

import android.view.animation.Interpolator;
import com.zing.zalo.zinstant.renderer.internal.animation.timingfunction.InvalidParamsException;
import fn0.AbstractC19074t;
import sk0.AbstractC26308b;

/* renamed from: sk0.h */
/* loaded from: classes7.dex */
public final class C26314h extends AbstractC26308b {

    /* renamed from: a */
    public static final C26314h f124967a = new C26314h();

    /* renamed from: sk0.h$a */
    /* loaded from: classes7.dex */
    private static final class a implements AbstractC26308b.a {

        /* renamed from: a */
        public static final a f124968a = new a();

        private a() {
        }

        @Override // sk0.AbstractC26308b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer[] mo135436a(Integer[] numArr) {
            AbstractC19074t.m100208f(numArr, "params");
            if (numArr.length == 2) {
                int intValue = numArr[1].intValue();
                if (intValue != 1 && intValue != 2 && intValue != 0 && intValue != 3) {
                    throw new InvalidParamsException("JumpTerm value must be start, end, none or both");
                }
                return numArr;
            }
            throw new InvalidParamsException("Need 2 params for StepsFunction");
        }
    }

    private C26314h() {
    }

    @Override // sk0.AbstractC26308b
    /* renamed from: c */
    protected AbstractC26308b.a mo135435c() {
        return a.f124968a;
    }

    /* renamed from: d */
    public final Interpolator m135440d(int i11, int i12) {
        return m135433a(new Integer[]{Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sk0.AbstractC26308b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Interpolator mo135434b(Integer[] numArr) {
        AbstractC19074t.m100208f(numArr, "params");
        int intValue = numArr[1].intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        return new InterpolatorC26309c(numArr[0].intValue());
                    }
                    throw new InvalidParamsException("JumpTerm type must be start or end");
                }
                return new InterpolatorC26310d(numArr[0].intValue());
            }
            return new InterpolatorC26312f(numArr[0].intValue());
        }
        return new InterpolatorC26311e(numArr[0].intValue());
    }
}
