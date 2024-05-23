package com.zing.zalo.zbrowser.cache;

import java.nio.ByteBuffer;

/* renamed from: com.zing.zalo.zbrowser.cache.a */
/* loaded from: classes7.dex */
public class C16897a {

    /* renamed from: a */
    public int f86041a;

    /* renamed from: b */
    public String f86042b;

    /* renamed from: c */
    public byte[] f86043c;

    /* renamed from: d */
    public String f86044d;

    public C16897a(int i11, String str, byte[] bArr, String str2) {
        this.f86041a = i11;
        this.f86042b = str;
        this.f86043c = bArr;
        this.f86044d = str2;
    }

    /* renamed from: a */
    public static C16897a m90360a(ByteBuffer byteBuffer) {
        try {
            byteBuffer.rewind();
            int i11 = byteBuffer.getInt();
            byte[] bArr = new byte[byteBuffer.getInt()];
            byteBuffer.get(bArr);
            byte[] bArr2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(bArr2);
            byte[] bArr3 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr3);
            return new C16897a(i11, new String(bArr), bArr3, new String(bArr2));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public ByteBuffer m90361b() {
        byte[] bytes = this.f86042b.getBytes();
        int length = bytes.length;
        byte[] bytes2 = this.f86044d.getBytes();
        int length2 = bytes2.length;
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 12 + bytes2.length + this.f86043c.length);
        allocate.putInt(this.f86041a);
        allocate.putInt(length);
        allocate.put(bytes);
        allocate.putInt(length2);
        allocate.put(bytes2);
        allocate.put(this.f86043c);
        allocate.rewind();
        return allocate;
    }
}
