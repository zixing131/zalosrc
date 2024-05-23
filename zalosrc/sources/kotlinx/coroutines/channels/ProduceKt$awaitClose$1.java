package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ProduceKt", m145345f = "Produce.kt", m145346l = {153}, m145347m = "awaitClose")
/* loaded from: classes7.dex */
public final class ProduceKt$awaitClose$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106296s;

    /* renamed from: t */
    Object f106297t;

    /* renamed from: u */
    /* synthetic */ Object f106298u;

    /* renamed from: v */
    int f106299v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProduceKt$awaitClose$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106298u = obj;
        this.f106299v |= Integer.MIN_VALUE;
        return ProduceKt.m113184a(null, null, this);
    }
}
