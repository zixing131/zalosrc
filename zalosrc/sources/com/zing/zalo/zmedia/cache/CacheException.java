package com.zing.zalo.zmedia.cache;

/* loaded from: classes7.dex */
public class CacheException extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private EnumC17296a f88129p;

    /* renamed from: com.zing.zalo.zmedia.cache.CacheException$a */
    /* loaded from: classes7.dex */
    public enum EnumC17296a {
        REDIRECT,
        TOO_MANY_REDIRECTS,
        INTERRUPTED,
        INCOMPLETE,
        FORBIDDEN,
        IOEXCEPTION,
        UNKNOWN
    }

    public CacheException(EnumC17296a enumC17296a) {
        super(enumC17296a.toString());
        this.f88129p = enumC17296a;
    }
}
