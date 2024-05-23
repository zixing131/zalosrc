package tn0;

import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;

/* renamed from: tn0.z0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26849z0 {

    /* renamed from: a */
    private static final SerialDescriptor[] f127116a = new SerialDescriptor[0];

    /* renamed from: a */
    public static final Set m138014a(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC26803k) {
            return ((InterfaceC26803k) serialDescriptor).mo113962a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo113949e());
        int mo113949e = serialDescriptor.mo113949e();
        for (int i11 = 0; i11 < mo113949e; i11++) {
            hashSet.add(serialDescriptor.mo113950f(i11));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final SerialDescriptor[] m138015b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return f127116a;
        }
        return serialDescriptorArr;
    }

    /* renamed from: c */
    public static final String m138016c(String str) {
        AbstractC19074t.m100208f(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: d */
    public static final String m138017d(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "<this>");
        String mo100163c = interfaceC23364b.mo100163c();
        if (mo100163c == null) {
            mo100163c = "<local class name not available>";
        }
        return m138016c(mo100163c);
    }
}
