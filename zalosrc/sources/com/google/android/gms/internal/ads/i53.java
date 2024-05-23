package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class i53 {

    /* renamed from: a */
    private static final Logger f22082a = Logger.getLogger(i53.class.getName());

    /* renamed from: b */
    private static final h53 f22083b = new h53(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m23128a(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m23129b(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
