package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.i */
/* loaded from: classes3.dex */
public abstract class AbstractC6808i {

    /* renamed from: a */
    static final Class f37314a = m34976c();

    /* renamed from: a */
    public static C6811j m34974a() {
        C6811j m34975b = m34975b("getEmptyRegistry");
        if (m34975b == null) {
            return C6811j.f37353d;
        }
        return m34975b;
    }

    /* renamed from: b */
    private static final C6811j m34975b(String str) {
        Class cls = f37314a;
        if (cls == null) {
            return null;
        }
        try {
            return (C6811j) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class m34976c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
