package p382o6;

import android.animation.TypeEvaluator;

/* renamed from: o6.c */
/* loaded from: classes3.dex */
public class C24043c implements TypeEvaluator {

    /* renamed from: a */
    private static final C24043c f116363a = new C24043c();

    /* renamed from: b */
    public static C24043c m125914b() {
        return f116363a;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f11, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f12 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f13 = f12 + (((((intValue2 >> 24) & 255) / 255.0f) - f12) * f11);
        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f11);
        float pow6 = pow3 + (f11 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f11), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f13 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
