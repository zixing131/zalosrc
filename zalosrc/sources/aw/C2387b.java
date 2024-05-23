package aw;

import am.AbstractC0924m0;
import com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata;
import fn0.AbstractC19074t;

/* renamed from: aw.b */
/* loaded from: classes.dex */
public final class C2387b implements InterfaceC2386a {

    /* renamed from: a */
    private ModelMetadata f9961a;

    @Override // aw.InterfaceC2386a
    /* renamed from: a */
    public void mo12450a(ModelMetadata modelMetadata) {
        String str;
        if (modelMetadata == null || (str = modelMetadata.m48229f()) == null) {
            str = "";
        }
        AbstractC0924m0.m3906ik(str);
        this.f9961a = modelMetadata;
    }

    @Override // aw.InterfaceC2386a
    /* renamed from: b */
    public ModelMetadata mo12451b() {
        ModelMetadata modelMetadata = this.f9961a;
        if (modelMetadata == null) {
            String m3919j3 = AbstractC0924m0.m3919j3();
            AbstractC19074t.m100205c(m3919j3);
            if (m3919j3.length() > 0) {
                modelMetadata = ModelMetadata.Companion.m48230a(m3919j3);
            } else {
                modelMetadata = null;
            }
        }
        if (modelMetadata == null) {
            return null;
        }
        this.f9961a = modelMetadata;
        return modelMetadata;
    }
}
