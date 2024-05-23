package tn0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.a1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26774a1 {
    /* renamed from: a */
    public static final void m137799a(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(iArr, "seenArray");
        AbstractC19074t.m100208f(iArr2, "goldenMaskArray");
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr2[i11] & (~iArr[i11]);
            if (i12 != 0) {
                for (int i13 = 0; i13 < 32; i13++) {
                    if ((i12 & 1) != 0) {
                        arrayList.add(serialDescriptor.mo113950f((i11 * 32) + i13));
                    }
                    i12 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, serialDescriptor.mo113953i());
    }

    /* renamed from: b */
    public static final void m137800b(int i11, int i12, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(serialDescriptor.mo113950f(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.mo113953i());
    }
}
