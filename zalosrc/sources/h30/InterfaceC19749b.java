package h30;

import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterfaceC24498e;

/* renamed from: h30.b */
/* loaded from: classes5.dex */
public interface InterfaceC19749b {
    InterfaceC24498e createInterpreter(ByteBuffer byteBuffer, InterfaceC24498e.a aVar);

    InterfaceC24498e.a createInterpreterOptions();

    void runSignature(InterfaceC24498e interfaceC24498e, Map map, Map map2, String str);
}
