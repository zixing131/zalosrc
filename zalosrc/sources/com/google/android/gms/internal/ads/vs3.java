package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vs3 implements zv3 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m27345i(Iterable iterable, List list) {
        dv3.m21550e(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        list.remove(size2);
                    }
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: a */
    public final byte[] mo27346a() {
        try {
            byte[] bArr = new byte[mo26776f()];
            bu3 m20735h = bu3.m20735h(bArr);
            mo26773c(m20735h);
            m20735h.m20742j();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e11);
        }
    }

    /* renamed from: d */
    public abstract int mo26774d();

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: h */
    public final mt3 mo27347h() {
        try {
            int mo26776f = mo26776f();
            mt3 mt3Var = mt3.f24751q;
            byte[] bArr = new byte[mo26776f];
            bu3 m20735h = bu3.m20735h(bArr);
            mo26773c(m20735h);
            m20735h.m20742j();
            return new it3(bArr);
        } catch (IOException e11) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e11);
        }
    }

    /* renamed from: j */
    public abstract void mo26778j(int i11);

    /* renamed from: k */
    public final void m27348k(OutputStream outputStream) {
        bu3 m20736i = bu3.m20736i(outputStream, bu3.m20730c(mo26776f()));
        mo26773c(m20736i);
        m20736i.mo20744m();
    }
}
