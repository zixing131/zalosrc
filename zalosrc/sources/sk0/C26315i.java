package sk0;

import android.view.animation.Interpolator;
import com.zing.zalo.zinstant.renderer.internal.animation.timingfunction.InvalidParamsException;
import com.zing.zalo.zinstant.zom.properties.ZOMTimingFunction;
import com.zing.zalo.zinstant.zom.properties.ZOMTimingFunctionCubicBezier;
import com.zing.zalo.zinstant.zom.properties.ZOMTimingFunctionSteps;
import ho0.AbstractC20110a;

/* renamed from: sk0.i */
/* loaded from: classes7.dex */
public final class C26315i {

    /* renamed from: a */
    public static final C26315i f124969a = new C26315i();

    /* renamed from: b */
    private static final C26307a f124970b = new C26307a(0.25f, 0.1f, 0.25f, 1.0f);

    private C26315i() {
    }

    /* renamed from: a */
    public final Interpolator m135443a(ZOMTimingFunction zOMTimingFunction) {
        ZOMTimingFunctionSteps zOMTimingFunctionSteps;
        if (zOMTimingFunction != null) {
            try {
                ZOMTimingFunctionCubicBezier zOMTimingFunctionCubicBezier = zOMTimingFunction.mCubicBezier;
                if (zOMTimingFunctionCubicBezier != null) {
                    return C26313g.f124965a.m135437d(zOMTimingFunctionCubicBezier.mX1, zOMTimingFunctionCubicBezier.mY1, zOMTimingFunctionCubicBezier.mX2, zOMTimingFunctionCubicBezier.mY2);
                }
            } catch (InvalidParamsException e11) {
                AbstractC20110a.f98889a.mo104548a(e11.getMessage(), new Object[0]);
            }
        }
        if (zOMTimingFunction != null && (zOMTimingFunctionSteps = zOMTimingFunction.mStepsFunction) != null) {
            return C26314h.f124967a.m135440d(zOMTimingFunctionSteps.mNumOfIntervals, zOMTimingFunctionSteps.mJumpTerm);
        }
        return f124970b;
    }

    /* renamed from: b */
    public final C26307a m135444b() {
        return f124970b;
    }
}
