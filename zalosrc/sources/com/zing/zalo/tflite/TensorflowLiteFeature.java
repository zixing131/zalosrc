package com.zing.zalo.tflite;

import androidx.annotation.Keep;
import com.zing.zalo.dynamic.features.base.Feature;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterfaceC24498e;

@Keep
/* loaded from: classes5.dex */
public interface TensorflowLiteFeature extends Feature {

    /* renamed from: com.zing.zalo.tflite.TensorflowLiteFeature$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10920a extends Feature.Provider {
    }

    InterfaceC24498e createInterpreter(File file, InterfaceC24498e.a aVar);

    InterfaceC24498e createInterpreter(ByteBuffer byteBuffer, InterfaceC24498e.a aVar);

    InterfaceC24498e.a createInterpreterOptions();

    boolean initialize();

    void runSignature(InterfaceC24498e interfaceC24498e, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, String str);
}
