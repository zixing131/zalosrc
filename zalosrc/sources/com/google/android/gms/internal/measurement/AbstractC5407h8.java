package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* loaded from: classes.dex */
public abstract class AbstractC5407h8 implements InterfaceC5647va {
    protected int zzb = 0;

    /* renamed from: e */
    public static void m29186e(Iterable iterable, List list) {
        byte[] bArr = AbstractC5290aa.f32259d;
        iterable.getClass();
        if (iterable instanceof InterfaceC5341da) {
            List zzh = ((InterfaceC5341da) iterable).zzh();
            InterfaceC5341da interfaceC5341da = (InterfaceC5341da) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC5341da.size() - size) + " is null.";
                    int size2 = interfaceC5341da.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC5341da.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC5679x8) {
                    interfaceC5341da.mo28991N((AbstractC5679x8) obj);
                } else {
                    interfaceC5341da.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC5325cb)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    /* renamed from: d */
    public abstract int mo29187d(InterfaceC5393gb interfaceC5393gb);

    /* renamed from: f */
    public final byte[] m29188f() {
        try {
            int mo29645a = mo29645a();
            byte[] bArr = new byte[mo29645a];
            AbstractC5357e9 m29083A = AbstractC5357e9.m29083A(bArr, 0, mo29645a);
            mo29646b(m29083A);
            m29083A.m29091a();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e11);
        }
    }
}
