package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.a */
/* loaded from: classes7.dex */
public enum EnumC24496a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);


    /* renamed from: y */
    private static final EnumC24496a[] f118050y = values();

    /* renamed from: p */
    private final int f118052p;

    /* renamed from: org.tensorflow.lite.a$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f118053a;

        static {
            int[] iArr = new int[EnumC24496a.values().length];
            f118053a = iArr;
            try {
                iArr[EnumC24496a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118053a[EnumC24496a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118053a[EnumC24496a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f118053a[EnumC24496a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118053a[EnumC24496a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f118053a[EnumC24496a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118053a[EnumC24496a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f118053a[EnumC24496a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    EnumC24496a(int i11) {
        this.f118052p = i11;
    }

    /* renamed from: b */
    public int m127819b() {
        switch (a.f118053a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
