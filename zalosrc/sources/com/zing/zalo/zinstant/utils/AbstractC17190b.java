package com.zing.zalo.zinstant.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import me0.AbstractC23146m8;

/* renamed from: com.zing.zalo.zinstant.utils.b */
/* loaded from: classes7.dex */
public abstract class AbstractC17190b {
    /* renamed from: a */
    public static byte[] m91797a(InputStream inputStream) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC23146m8.m118825a(gZIPInputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
