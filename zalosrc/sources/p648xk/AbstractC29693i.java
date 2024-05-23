package p648xk;

/* renamed from: xk.i */
/* loaded from: classes3.dex */
public abstract class AbstractC29693i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte m147687a(byte b11) {
        return (byte) (b11 & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte m147688b(byte b11) {
        return (byte) (b11 >> 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m147689c(byte b11) {
        switch (b11) {
            case 0:
                return "byte";
            case 1:
                return "boolean";
            case 2:
                return "int16";
            case 3:
                return "int32";
            case 4:
                return "int64";
            case 5:
                return "double";
            case 6:
                return "byte array";
            case 7:
                return "string";
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static byte m147690d(byte b11, byte b12) {
        return (byte) ((b11 << 3) | b12);
    }
}
