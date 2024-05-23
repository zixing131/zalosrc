package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
/* loaded from: classes3.dex */
abstract class AbstractC6793d {

    /* renamed from: a */
    private static boolean f37250a;

    /* renamed from: b */
    private static final Class f37251b = m34760a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f37252c;

    static {
        boolean z11;
        if (!f37250a && m34760a("org.robolectric.Robolectric") != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        f37252c = z11;
    }

    /* renamed from: a */
    private static Class m34760a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class m34761b() {
        return f37251b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m34762c() {
        return f37250a || !(f37251b == null || f37252c);
    }
}
