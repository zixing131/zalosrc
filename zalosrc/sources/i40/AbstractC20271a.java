package i40;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.ArrayList;

/* renamed from: i40.a */
/* loaded from: classes5.dex */
public abstract class AbstractC20271a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.a$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public Keyframe[] f100171a;

        /* renamed from: b */
        public float f100172b;

        a() {
        }
    }

    /* renamed from: a */
    public static ObjectAnimator m105843a(Object obj) {
        return m105844b(m105846d(0.1d, 10.0d, 0.9d, 0.1d, 0.2d), obj, 1);
    }

    /* renamed from: b */
    private static ObjectAnimator m105844b(a aVar, Object obj, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            Keyframe[] keyframeArr = aVar.f100171a;
            if (i12 < keyframeArr.length) {
                float fraction = keyframeArr[i12].getFraction();
                float floatValue = (((Float) aVar.f100171a[i12].getValue()).floatValue() * 0.6f * i11) + 1.0f;
                if (fraction >= 0.0f && fraction <= 0.508489f) {
                    arrayList.add(Keyframe.ofFloat((fraction - 0.0f) / 0.508489f, floatValue));
                }
                i12++;
            } else {
                ((Keyframe) arrayList.get(arrayList.size() - 1)).setFraction(1.0f);
                float f11 = aVar.f100172b;
                long round = Math.round((f11 - (0.508489f * f11)) * 1000.0f * 0.5f);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofKeyframe("scaleX", (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()])), PropertyValuesHolder.ofKeyframe("scaleY", (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()])));
                ofPropertyValuesHolder.setDuration(round);
                return ofPropertyValuesHolder;
            }
        }
    }

    /* renamed from: c */
    public static ObjectAnimator m105845c(Object obj) {
        return m105844b(m105846d(0.1d, 10.0d, 0.9d, 0.1d, 0.2d), obj, -1);
    }

    /* renamed from: d */
    private static a m105846d(double d11, double d12, double d13, double d14, double d15) {
        a aVar = new a();
        double sqrt = Math.sqrt(d12 / d14);
        double sqrt2 = d13 / Math.sqrt((d14 * 2.0d) * d12);
        double sqrt3 = Math.sqrt(1.0d - Math.pow(sqrt2, 2.0d)) * sqrt;
        double d16 = d15 + (sqrt * d11);
        double d17 = sqrt2 * sqrt;
        float f11 = (float) ((-Math.log(0.01d / (d11 + d16))) / d17);
        aVar.f100172b = f11;
        double d18 = 2.0d * sqrt3;
        double d19 = 1.0d / d18;
        int ceil = (int) Math.ceil(d18 * f11);
        aVar.f100171a = new Keyframe[ceil + 1];
        int i11 = 0;
        double d21 = 0.0d;
        while (d21 < aVar.f100172b) {
            double d22 = sqrt3 * d21;
            aVar.f100171a[i11] = Keyframe.ofFloat((float) (d21 / aVar.f100172b), (float) (Math.exp(-(d21 * d17)) * ((Math.cos(d22) * d11) + (Math.sin(d22) * d16))));
            i11++;
            d21 += d19;
            sqrt3 = sqrt3;
        }
        aVar.f100171a[ceil] = Keyframe.ofFloat(1.0f, 0.0f);
        return aVar;
    }
}
