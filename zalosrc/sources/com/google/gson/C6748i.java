package com.google.gson;

import java.math.BigInteger;
import p674y9.AbstractC30844a;
import p674y9.C30850g;

/* renamed from: com.google.gson.i */
/* loaded from: classes3.dex */
public final class C6748i extends AbstractC6745f {

    /* renamed from: p */
    private final Object f37132p;

    public C6748i(Boolean bool) {
        this.f37132p = AbstractC30844a.m149929b(bool);
    }

    /* renamed from: t */
    private static boolean m34557t(C6748i c6748i) {
        Object obj = c6748i.f37132p;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6748i.class != obj.getClass()) {
            return false;
        }
        C6748i c6748i = (C6748i) obj;
        if (this.f37132p == null) {
            if (c6748i.f37132p == null) {
                return true;
            }
            return false;
        }
        if (m34557t(this) && m34557t(c6748i)) {
            if (m34559p().longValue() == c6748i.m34559p().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f37132p;
        if ((obj2 instanceof Number) && (c6748i.f37132p instanceof Number)) {
            double doubleValue = m34559p().doubleValue();
            double doubleValue2 = c6748i.m34559p().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(c6748i.f37132p);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f37132p == null) {
            return 31;
        }
        if (m34557t(this)) {
            doubleToLongBits = m34559p().longValue();
        } else {
            Object obj = this.f37132p;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m34559p().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: n */
    public boolean m34558n() {
        if (m34561s()) {
            return ((Boolean) this.f37132p).booleanValue();
        }
        return Boolean.parseBoolean(m34560r());
    }

    /* renamed from: p */
    public Number m34559p() {
        Object obj = this.f37132p;
        if (obj instanceof String) {
            return new C30850g((String) obj);
        }
        return (Number) obj;
    }

    /* renamed from: r */
    public String m34560r() {
        if (m34562u()) {
            return m34559p().toString();
        }
        if (m34561s()) {
            return ((Boolean) this.f37132p).toString();
        }
        return (String) this.f37132p;
    }

    /* renamed from: s */
    public boolean m34561s() {
        return this.f37132p instanceof Boolean;
    }

    /* renamed from: u */
    public boolean m34562u() {
        return this.f37132p instanceof Number;
    }

    /* renamed from: v */
    public boolean m34563v() {
        return this.f37132p instanceof String;
    }

    public C6748i(Number number) {
        this.f37132p = AbstractC30844a.m149929b(number);
    }

    public C6748i(String str) {
        this.f37132p = AbstractC30844a.m149929b(str);
    }
}
