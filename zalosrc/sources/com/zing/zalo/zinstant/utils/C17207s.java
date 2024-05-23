package com.zing.zalo.zinstant.utils;

import java.io.File;
import java.io.InputStream;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;

/* renamed from: com.zing.zalo.zinstant.utils.s */
/* loaded from: classes7.dex */
public final class C17207s {

    /* renamed from: a */
    public static final C17207s f87765a = new C17207s();

    private C17207s() {
    }

    /* renamed from: a */
    public static final String m91846a(File file) {
        return AbstractC23352g.m122785a(file);
    }

    /* renamed from: b */
    public static final String m91847b(InputStream inputStream) {
        return AbstractC23352g.m122786b(inputStream);
    }

    /* renamed from: c */
    public static final boolean m91848c(String str, File file) {
        boolean m127126v;
        if (str != null && str.length() > 0 && file != null && file.exists()) {
            m127126v = AbstractC24341v.m127126v(m91846a(file), str, true);
            return m127126v;
        }
        return false;
    }
}
