package com.google.gson;

import ca.C3382c;
import java.io.IOException;
import java.io.StringWriter;
import p674y9.AbstractC30855l;

/* renamed from: com.google.gson.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6745f {
    /* renamed from: d */
    public C6744e m34548d() {
        if (m34551j()) {
            return (C6744e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C6747h m34549e() {
        if (m34553l()) {
            return (C6747h) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C6748i m34550g() {
        if (m34554m()) {
            return (C6748i) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: j */
    public boolean m34551j() {
        return this instanceof C6744e;
    }

    /* renamed from: k */
    public boolean m34552k() {
        return this instanceof C6746g;
    }

    /* renamed from: l */
    public boolean m34553l() {
        return this instanceof C6747h;
    }

    /* renamed from: m */
    public boolean m34554m() {
        return this instanceof C6748i;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C3382c c3382c = new C3382c(stringWriter);
            c3382c.m17028K(true);
            AbstractC30855l.m149993a(this, c3382c);
            return stringWriter.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
