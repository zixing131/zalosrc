package com.zing.zalo.shortvideo.p072ui.widget;

import fn0.AbstractC19074t;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.zing.zalo.shortvideo.ui.widget.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10723c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m55826b(long j11, String str) {
        String format = new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j11));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }
}
