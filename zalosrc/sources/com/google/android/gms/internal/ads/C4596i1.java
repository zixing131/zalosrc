package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.i1 */
/* loaded from: classes2.dex */
public final class C4596i1 {

    /* renamed from: a */
    private final ByteArrayOutputStream f22008a;

    /* renamed from: b */
    private final DataOutputStream f22009b;

    public C4596i1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f22008a = byteArrayOutputStream;
        this.f22009b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m23105b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] m23106a(zzacf zzacfVar) {
        this.f22008a.reset();
        try {
            m23105b(this.f22009b, zzacfVar.f31741p);
            String str = zzacfVar.f31742q;
            if (str == null) {
                str = "";
            }
            m23105b(this.f22009b, str);
            this.f22009b.writeLong(zzacfVar.f31743r);
            this.f22009b.writeLong(zzacfVar.f31744s);
            this.f22009b.write(zzacfVar.f31745t);
            this.f22009b.flush();
            return this.f22008a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
