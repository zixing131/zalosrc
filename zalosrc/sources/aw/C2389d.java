package aw;

import com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata;
import fn0.AbstractC19074t;

/* renamed from: aw.d */
/* loaded from: classes.dex */
public final class C2389d implements InterfaceC2388c {

    /* renamed from: a */
    private final InterfaceC2386a f9962a;

    public C2389d(InterfaceC2386a interfaceC2386a) {
        AbstractC19074t.m100208f(interfaceC2386a, "mpModelInfoDataSource");
        this.f9962a = interfaceC2386a;
    }

    @Override // aw.InterfaceC2388c
    /* renamed from: a */
    public void mo12452a(ModelMetadata modelMetadata) {
        this.f9962a.mo12450a(modelMetadata);
    }

    @Override // aw.InterfaceC2388c
    /* renamed from: b */
    public ModelMetadata mo12453b() {
        return this.f9962a.mo12451b();
    }
}
