package com.androidquery.util;

import java.io.ByteArrayOutputStream;

/* renamed from: com.androidquery.util.p */
/* loaded from: classes2.dex */
public class C3983p extends ByteArrayOutputStream {
    public C3983p(int i11) {
        super(i11);
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        int i11 = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (i11 == bArr.length) {
            return bArr;
        }
        return super.toByteArray();
    }
}
