package p706z6;

/* renamed from: z6.g */
/* loaded from: classes3.dex */
public final class C31688g extends C31687f {

    /* renamed from: p */
    private final float f145533p;

    public C31688g(float f11) {
        this.f145533p = f11 - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p706z6.C31687f
    /* renamed from: a */
    public boolean mo152395a() {
        return true;
    }

    @Override // p706z6.C31687f
    /* renamed from: b */
    public void mo31806b(float f11, float f12, float f13, C31696o c31696o) {
        float sqrt = (float) ((this.f145533p * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f145533p, 2.0d) - Math.pow(sqrt, 2.0d));
        c31696o.m152565n(f12 - sqrt, ((float) (-((this.f145533p * Math.sqrt(2.0d)) - this.f145533p))) + sqrt2);
        c31696o.m152564m(f12, (float) (-((this.f145533p * Math.sqrt(2.0d)) - this.f145533p)));
        c31696o.m152564m(f12 + sqrt, ((float) (-((this.f145533p * Math.sqrt(2.0d)) - this.f145533p))) + sqrt2);
    }
}
