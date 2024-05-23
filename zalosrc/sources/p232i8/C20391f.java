package p232i8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p292k8.AbstractC21569b0;

/* renamed from: i8.f */
/* loaded from: classes3.dex */
class C20391f implements InterfaceC20425z {

    /* renamed from: a */
    private final byte[] f100432a;

    /* renamed from: b */
    private final String f100433b;

    /* renamed from: c */
    private final String f100434c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20391f(String str, String str2, byte[] bArr) {
        this.f100433b = str;
        this.f100434c = str2;
        this.f100432a = bArr;
    }

    /* renamed from: d */
    private byte[] m106189d() {
        if (m106190e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f100432a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m106190e() {
        byte[] bArr = this.f100432a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: a */
    public AbstractC21569b0.d.b mo106191a() {
        byte[] m106189d = m106189d();
        if (m106189d == null) {
            return null;
        }
        return AbstractC21569b0.d.b.m111303a().mo111307b(m106189d).mo111308c(this.f100433b).mo111306a();
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: b */
    public String mo106192b() {
        return this.f100434c;
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: c */
    public InputStream mo106193c() {
        if (m106190e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f100432a);
    }
}
