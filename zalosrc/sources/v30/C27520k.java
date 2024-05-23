package v30;

import com.zing.zalo.dynamic.features.base.Feature;
import com.zing.zalo.tflite.TensorflowLiteFeature;
import fn0.AbstractC19074t;
import h30.InterfaceC19749b;
import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterfaceC24498e;
import p272jn.C21314e;
import p272jn.EnumC21310a;

/* renamed from: v30.k */
/* loaded from: classes5.dex */
public final class C27520k implements InterfaceC19749b {

    /* renamed from: a */
    private final TensorflowLiteFeature f129497a;

    public C27520k() {
        Feature m110361j = C21314e.Companion.m110366a().m110361j(EnumC21310a.f103787q, "default_feature", TensorflowLiteFeature.InterfaceC10920a.class);
        AbstractC19074t.m100205c(m110361j);
        this.f129497a = (TensorflowLiteFeature) m110361j;
    }

    @Override // h30.InterfaceC19749b
    public InterfaceC24498e createInterpreter(ByteBuffer byteBuffer, InterfaceC24498e.a aVar) {
        AbstractC19074t.m100208f(byteBuffer, "byteBuffer");
        AbstractC19074t.m100208f(aVar, "options");
        return this.f129497a.createInterpreter(byteBuffer, aVar);
    }

    @Override // h30.InterfaceC19749b
    public InterfaceC24498e.a createInterpreterOptions() {
        return this.f129497a.createInterpreterOptions();
    }

    @Override // h30.InterfaceC19749b
    public void runSignature(InterfaceC24498e interfaceC24498e, Map map, Map map2, String str) {
        AbstractC19074t.m100208f(interfaceC24498e, "interpreter");
        AbstractC19074t.m100208f(map, "inputs");
        AbstractC19074t.m100208f(map2, "outputs");
        AbstractC19074t.m100208f(str, "signatureKey");
        this.f129497a.runSignature(interfaceC24498e, map, map2, str);
    }
}
