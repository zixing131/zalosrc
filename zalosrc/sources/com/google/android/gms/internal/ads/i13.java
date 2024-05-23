package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class i13 {

    /* renamed from: a */
    private final C4721lg f22013a;

    /* renamed from: b */
    private final File f22014b;

    /* renamed from: c */
    private final File f22015c;

    /* renamed from: d */
    private final File f22016d;

    /* renamed from: e */
    private byte[] f22017e;

    public i13(C4721lg c4721lg, File file, File file2, File file3) {
        this.f22013a = c4721lg;
        this.f22014b = file;
        this.f22015c = file3;
        this.f22016d = file2;
    }

    /* renamed from: a */
    public final C4721lg m23110a() {
        return this.f22013a;
    }

    /* renamed from: b */
    public final File m23111b() {
        return this.f22015c;
    }

    /* renamed from: c */
    public final File m23112c() {
        return this.f22014b;
    }

    /* renamed from: d */
    public final boolean m23113d(long j11) {
        if (this.f22013a.m24281G() - (System.currentTimeMillis() / 1000) < 3600) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m23114e() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.f22017e == null) {
            try {
                fileInputStream = new FileInputStream(this.f22016d);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bArr2 = mt3.m24729L(fileInputStream).m24738k();
                AbstractC20291l.m105939a(fileInputStream);
            } catch (IOException unused2) {
                AbstractC20291l.m105939a(fileInputStream);
                bArr2 = null;
                this.f22017e = bArr2;
                bArr = this.f22017e;
                if (bArr != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                AbstractC20291l.m105939a(fileInputStream2);
                throw th;
            }
            this.f22017e = bArr2;
        }
        bArr = this.f22017e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
