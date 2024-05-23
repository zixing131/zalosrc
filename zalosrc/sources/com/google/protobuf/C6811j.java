package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.j */
/* loaded from: classes3.dex */
public class C6811j {

    /* renamed from: b */
    private static boolean f37351b = true;

    /* renamed from: c */
    private static volatile C6811j f37352c;

    /* renamed from: d */
    static final C6811j f37353d = new C6811j(true);

    /* renamed from: a */
    private final Map f37354a = Collections.emptyMap();

    C6811j(boolean z11) {
    }

    /* renamed from: a */
    public static C6811j m34986a() {
        C6811j c6811j = f37352c;
        if (c6811j == null) {
            synchronized (C6811j.class) {
                try {
                    c6811j = f37352c;
                    if (c6811j == null) {
                        if (f37351b) {
                            c6811j = AbstractC6808i.m34974a();
                        } else {
                            c6811j = f37353d;
                        }
                        f37352c = c6811j;
                    }
                } finally {
                }
            }
        }
        return c6811j;
    }
}
