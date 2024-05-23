package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26339f;
import sn0.AbstractC26341h;

/* renamed from: tn0.b1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26778b1 {
    /* renamed from: a */
    public static final int m137806a(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int i11;
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.mo113953i().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable m135535a = AbstractC26339f.m135535a(serialDescriptor);
        Iterator it = m135535a.iterator();
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i15 = i13 * 31;
            String mo113953i = ((SerialDescriptor) it.next()).mo113953i();
            if (mo113953i != null) {
                i14 = mo113953i.hashCode();
            }
            i13 = i15 + i14;
        }
        Iterator it2 = m135535a.iterator();
        while (it2.hasNext()) {
            int i16 = i12 * 31;
            AbstractC26341h mo113948d = ((SerialDescriptor) it2.next()).mo113948d();
            if (mo113948d != null) {
                i11 = mo113948d.hashCode();
            } else {
                i11 = 0;
            }
            i12 = i16 + i11;
        }
        return (((hashCode * 31) + i13) * 31) + i12;
    }
}
