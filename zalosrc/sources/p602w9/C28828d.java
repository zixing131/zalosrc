package p602w9;

import java.nio.ByteBuffer;
import p602w9.AbstractC28827c;

/* renamed from: w9.d */
/* loaded from: classes.dex */
public final class C28828d extends AbstractC28827c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w9.d$a */
    /* loaded from: classes3.dex */
    public static class a extends IllegalArgumentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        a(int i11, int i12) {
            super(r0.toString());
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("Unpaired surrogate at index ");
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(i12);
        }
    }

    /* renamed from: f */
    private static int m144133f(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt < 2048) {
                    i12 += (127 - charAt) >>> 31;
                    i11++;
                } else {
                    i12 += m144138k(charSequence, i11);
                    break;
                }
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        long j11 = i12 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public static String m144134g(byte[] bArr, int i11, int i12) {
        if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!AbstractC28827c.a.m144128g(b11)) {
                    break;
                }
                i11++;
                AbstractC28827c.a.m144123b(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (AbstractC28827c.a.m144128g(b12)) {
                    int i17 = i15 + 1;
                    AbstractC28827c.a.m144123b(b12, cArr, i15);
                    while (i16 < i13) {
                        byte b13 = bArr[i16];
                        if (!AbstractC28827c.a.m144128g(b13)) {
                            break;
                        }
                        i16++;
                        AbstractC28827c.a.m144123b(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i16;
                } else if (AbstractC28827c.a.m144130i(b12)) {
                    if (i16 < i13) {
                        i11 += 2;
                        AbstractC28827c.a.m144125d(b12, bArr[i16], cArr, i15);
                        i15++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (AbstractC28827c.a.m144129h(b12)) {
                    if (i16 < i13 - 1) {
                        int i18 = i11 + 2;
                        i11 += 3;
                        AbstractC28827c.a.m144124c(b12, bArr[i16], bArr[i18], cArr, i15);
                        i15++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i16 < i13 - 2) {
                    byte b14 = bArr[i16];
                    int i19 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    AbstractC28827c.a.m144122a(b12, b14, b15, bArr[i19], cArr, i15);
                    i15 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: h */
    public static String m144135h(ByteBuffer byteBuffer, int i11, int i12) {
        if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = byteBuffer.get(i11);
                if (!AbstractC28827c.a.m144128g(b11)) {
                    break;
                }
                i11++;
                AbstractC28827c.a.m144123b(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = byteBuffer.get(i11);
                if (AbstractC28827c.a.m144128g(b12)) {
                    int i17 = i15 + 1;
                    AbstractC28827c.a.m144123b(b12, cArr, i15);
                    while (i16 < i13) {
                        byte b13 = byteBuffer.get(i16);
                        if (!AbstractC28827c.a.m144128g(b13)) {
                            break;
                        }
                        i16++;
                        AbstractC28827c.a.m144123b(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i16;
                } else if (AbstractC28827c.a.m144130i(b12)) {
                    if (i16 < i13) {
                        i11 += 2;
                        AbstractC28827c.a.m144125d(b12, byteBuffer.get(i16), cArr, i15);
                        i15++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (AbstractC28827c.a.m144129h(b12)) {
                    if (i16 < i13 - 1) {
                        int i18 = i11 + 2;
                        i11 += 3;
                        AbstractC28827c.a.m144124c(b12, byteBuffer.get(i16), byteBuffer.get(i18), cArr, i15);
                        i15++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i16 < i13 - 2) {
                    byte b14 = byteBuffer.get(i16);
                    int i19 = i11 + 3;
                    byte b15 = byteBuffer.get(i11 + 2);
                    i11 += 4;
                    AbstractC28827c.a.m144122a(b12, b14, b15, byteBuffer.get(i19), cArr, i15);
                    i15 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r9 + r0;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m144136i(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i12 + i11;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i11) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                bArr[i17] = (byte) charAt2;
                i17++;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                int i19 = i17 + 2;
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            } else {
                if (i17 <= i15 - 4) {
                    int i21 = i16 + 1;
                    if (i21 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i21);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i22 = i17 + 3;
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i22] = (byte) ((codePoint & 63) | 128);
                            i16 = i21;
                        } else {
                            i16 = i21;
                        }
                    }
                    throw new a(i16 - 1, length);
                }
                if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                    throw new a(i16, length);
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i17);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i16++;
        }
        return i17;
    }

    /* renamed from: j */
    private static void m144137j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i11, (byte) charAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1);
                char charAt2 = charSequence.charAt(i11);
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(position2);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i11 == length) {
            byteBuffer.position(position + i11);
            return;
        }
        position += i11;
        while (i11 < length) {
            char charAt3 = charSequence.charAt(i11);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                int i12 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i12, (byte) ((charAt3 & '?') | 128));
                    position = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i12;
                    int position22 = byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1);
                    char charAt22 = charSequence.charAt(i11);
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Failed writing ");
                    sb22.append(charAt22);
                    sb22.append(" at index ");
                    sb22.append(position22);
                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else {
                if (charAt3 >= 55296 && 57343 >= charAt3) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char charAt4 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                int i14 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i15 = position + 2;
                                    try {
                                        byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i15, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i11 = i13;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i11 = i13;
                                        position = i15;
                                        int position222 = byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1);
                                        char charAt222 = charSequence.charAt(i11);
                                        StringBuilder sb222 = new StringBuilder(37);
                                        sb222.append("Failed writing ");
                                        sb222.append(charAt222);
                                        sb222.append(" at index ");
                                        sb222.append(position222);
                                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    position = i14;
                                    i11 = i13;
                                    int position2222 = byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1);
                                    char charAt2222 = charSequence.charAt(i11);
                                    StringBuilder sb2222 = new StringBuilder(37);
                                    sb2222.append("Failed writing ");
                                    sb2222.append(charAt2222);
                                    sb2222.append(" at index ");
                                    sb2222.append(position2222);
                                    throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new a(i11, length);
                }
                int i16 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i16, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            }
            i11++;
            position++;
        }
        byteBuffer.position(position);
    }

    /* renamed from: k */
    private static int m144138k(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) >= 65536) {
                        i11++;
                    } else {
                        throw new a(i11, length);
                    }
                }
            }
            i11++;
        }
        return i12;
    }

    @Override // p602w9.AbstractC28827c
    /* renamed from: a */
    public String mo101931a(ByteBuffer byteBuffer, int i11, int i12) {
        if (byteBuffer.hasArray()) {
            return m144134g(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
        }
        return m144135h(byteBuffer, i11, i12);
    }

    @Override // p602w9.AbstractC28827c
    /* renamed from: b */
    public void mo101932b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m144136i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else {
            m144137j(charSequence, byteBuffer);
        }
    }

    @Override // p602w9.AbstractC28827c
    /* renamed from: c */
    public int mo101933c(CharSequence charSequence) {
        return m144133f(charSequence);
    }
}
