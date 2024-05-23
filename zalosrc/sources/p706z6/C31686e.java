package p706z6;

/* renamed from: z6.e */
/* loaded from: classes3.dex */
public class C31686e extends AbstractC31685d {

    /* renamed from: a */
    float f145532a = -1.0f;

    @Override // p706z6.AbstractC31685d
    /* renamed from: a */
    public void mo152393a(C31696o c31696o, float f11, float f12, float f13) {
        c31696o.m152566o(0.0f, f13 * f12, 180.0f, 180.0f - f11);
        double d11 = f13;
        double d12 = f12;
        c31696o.m152564m((float) (Math.sin(Math.toRadians(f11)) * d11 * d12), (float) (Math.sin(Math.toRadians(90.0f - f11)) * d11 * d12));
    }
}
