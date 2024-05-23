package uh0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: uh0.a */
/* loaded from: classes7.dex */
public class C27262a {

    /* renamed from: a */
    private ByteBuffer f128197a;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:            throw new java.io.IOException("CRLF expected at the end of chunk data");     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m139547a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f128197a;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f128197a.remaining() + bArr.length);
            allocate.put(this.f128197a);
            allocate.put(bArr);
            allocate.flip();
            bArr = allocate.array();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= bArr.length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 != 13) {
                sb2.append((char) b11);
                i11++;
            } else {
                int i13 = i11 + 1;
                if (i13 == bArr.length) {
                    this.f128197a = ByteBuffer.wrap(bArr, i12, bArr.length - i12);
                    break;
                }
                if (bArr[i13] == 10) {
                    try {
                        int parseInt = Integer.parseInt(sb2.toString(), 16);
                        StringBuilder sb3 = new StringBuilder();
                        int i14 = i11 + 2;
                        if (parseInt > 0) {
                            int i15 = i14 + parseInt;
                            int i16 = i15 + 2;
                            if (i16 > bArr.length) {
                                this.f128197a = ByteBuffer.wrap(bArr, i12, bArr.length - i12);
                                break;
                            }
                            byteArrayOutputStream.write(bArr, i14, parseInt);
                            if (bArr[i15] != 13 || bArr[i15 + 1] != 10) {
                                break;
                            }
                            sb2 = sb3;
                            i11 = i16;
                            i12 = i11;
                        } else if (parseInt == 0) {
                            int i17 = i11 + 4;
                            if (i17 <= bArr.length && byteArrayOutputStream.size() <= 0) {
                                if (i17 == bArr.length && bArr[i14] == 13 && bArr[i11 + 3] == 10) {
                                    return new byte[0];
                                }
                                throw new IOException("Invalid stream footer");
                            }
                            this.f128197a = ByteBuffer.wrap(bArr, i12, bArr.length - i12);
                        } else {
                            throw new IOException("Negative chunk length: " + parseInt);
                        }
                    } catch (NumberFormatException unused) {
                        throw new IOException("Invalid chunk length: " + sb2.toString());
                    }
                } else {
                    throw new IOException("CRLF expected at the end of chunk header");
                }
            }
        }
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
