package n10;

import bn0.AbstractC2933b;
import bn0.AbstractC2943l;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.GZIPInputStream;
import on0.C24321d;

/* renamed from: n10.a */
/* loaded from: classes5.dex */
public final class C23518a implements InterfaceC23519b {
    /* renamed from: c */
    private final String m123436c(byte[] bArr) {
        BufferedReader bufferedReader;
        Reader inputStreamReader = new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), C24321d.f117408b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String m13931c = AbstractC2943l.m13931c(bufferedReader);
            AbstractC2933b.m13890a(bufferedReader, null);
            return m13931c;
        } finally {
        }
    }

    @Override // n10.InterfaceC23519b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo123437a(byte[] bArr) {
        String str;
        String str2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            str = m123436c(bArr);
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            try {
                str2 = new String(bArr, C24321d.f117408b);
            } catch (Exception unused2) {
            }
            return str2;
        }
        return str;
    }
}
