package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.s9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4975s9 implements InterfaceC5012t9 {

    /* renamed from: b */
    private static final Logger f27592b = Logger.getLogger(AbstractC4975s9.class.getName());

    /* renamed from: a */
    final ThreadLocal f27593a = new C4938r9(this);

    @Override // com.google.android.gms.internal.ads.InterfaceC5012t9
    /* renamed from: a */
    public final InterfaceC5123w9 mo26261a(uz3 uz3Var, InterfaceC5161x9 interfaceC5161x9) {
        int mo26634A0;
        long j11;
        String str;
        long zzb = uz3Var.zzb();
        ((ByteBuffer) this.f27593a.get()).rewind().limit(8);
        do {
            mo26634A0 = uz3Var.mo26634A0((ByteBuffer) this.f27593a.get());
            if (mo26634A0 == 8) {
                ((ByteBuffer) this.f27593a.get()).rewind();
                long m27189e = AbstractC5086v9.m27189e((ByteBuffer) this.f27593a.get());
                byte[] bArr = null;
                if (m27189e < 8 && m27189e > 1) {
                    Logger logger = f27592b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(m27189e);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f27593a.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (m27189e == 1) {
                        ((ByteBuffer) this.f27593a.get()).limit(16);
                        uz3Var.mo26634A0((ByteBuffer) this.f27593a.get());
                        ((ByteBuffer) this.f27593a.get()).position(8);
                        j11 = AbstractC5086v9.m27190f((ByteBuffer) this.f27593a.get()) - 16;
                    } else if (m27189e == 0) {
                        j11 = uz3Var.zzc() - uz3Var.zzb();
                    } else {
                        j11 = m27189e - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.f27593a.get()).limit(((ByteBuffer) this.f27593a.get()).limit() + 16);
                        uz3Var.mo26634A0((ByteBuffer) this.f27593a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.f27593a.get()).position() - 16; position < ((ByteBuffer) this.f27593a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.f27593a.get()).position() - 16)] = ((ByteBuffer) this.f27593a.get()).get(position);
                        }
                        j11 -= 16;
                    }
                    long j12 = j11;
                    if (interfaceC5161x9 instanceof InterfaceC5123w9) {
                        str = ((InterfaceC5123w9) interfaceC5161x9).zza();
                    } else {
                        str = "";
                    }
                    InterfaceC5123w9 mo26262b = mo26262b(str2, bArr, str);
                    mo26262b.mo25623c(interfaceC5161x9);
                    ((ByteBuffer) this.f27593a.get()).rewind();
                    mo26262b.mo25622a(uz3Var, (ByteBuffer) this.f27593a.get(), j12, this);
                    return mo26262b;
                } catch (UnsupportedEncodingException e11) {
                    throw new RuntimeException(e11);
                }
            }
        } while (mo26634A0 >= 0);
        uz3Var.mo26636j(zzb);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract InterfaceC5123w9 mo26262b(String str, byte[] bArr, String str2);
}
