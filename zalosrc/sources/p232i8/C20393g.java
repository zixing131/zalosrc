package p232i8;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.g */
/* loaded from: classes.dex */
public class C20393g {

    /* renamed from: a */
    private static final AtomicLong f100435a = new AtomicLong(0);

    /* renamed from: b */
    private static String f100436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20393g(C20422w c20422w) {
        byte[] bArr = new byte[10];
        m106199e(bArr);
        m106198d(bArr);
        m106197c(bArr);
        String m106203C = AbstractC20395h.m106203C(c20422w.mo106427a());
        String m106227w = AbstractC20395h.m106227w(bArr);
        Locale locale = Locale.US;
        f100436b = String.format(locale, "%s%s%s%s", m106227w.substring(0, 12), m106227w.substring(12, 16), m106227w.subSequence(16, 20), m106203C.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m106195a(long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j11);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m106196b(long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j11);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m106197c(byte[] bArr) {
        byte[] m106196b = m106196b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m106196b[0];
        bArr[9] = m106196b[1];
    }

    /* renamed from: d */
    private void m106198d(byte[] bArr) {
        byte[] m106196b = m106196b(f100435a.incrementAndGet());
        bArr[6] = m106196b[0];
        bArr[7] = m106196b[1];
    }

    /* renamed from: e */
    private void m106199e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m106195a = m106195a(time / 1000);
        bArr[0] = m106195a[0];
        bArr[1] = m106195a[1];
        bArr[2] = m106195a[2];
        bArr[3] = m106195a[3];
        byte[] m106196b = m106196b(time % 1000);
        bArr[4] = m106196b[0];
        bArr[5] = m106196b[1];
    }

    public String toString() {
        return f100436b;
    }
}
