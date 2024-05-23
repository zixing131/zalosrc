package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class tz3 implements Iterator, Closeable, InterfaceC5161x9 {

    /* renamed from: v */
    private static final InterfaceC5123w9 f28667v = new sz3("eof ");

    /* renamed from: w */
    private static final b04 f28668w = b04.m20367b(tz3.class);

    /* renamed from: p */
    protected InterfaceC5012t9 f28669p;

    /* renamed from: q */
    protected uz3 f28670q;

    /* renamed from: r */
    InterfaceC5123w9 f28671r = null;

    /* renamed from: s */
    long f28672s = 0;

    /* renamed from: t */
    long f28673t = 0;

    /* renamed from: u */
    private final List f28674u = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: d */
    public final InterfaceC5123w9 next() {
        InterfaceC5123w9 mo26261a;
        InterfaceC5123w9 interfaceC5123w9 = this.f28671r;
        if (interfaceC5123w9 != null && interfaceC5123w9 != f28667v) {
            this.f28671r = null;
            return interfaceC5123w9;
        }
        uz3 uz3Var = this.f28670q;
        if (uz3Var != null && this.f28672s < this.f28673t) {
            try {
                synchronized (uz3Var) {
                    this.f28670q.mo26636j(this.f28672s);
                    mo26261a = this.f28669p.mo26261a(this.f28670q, this);
                    this.f28672s = this.f28670q.zzb();
                }
                return mo26261a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.f28671r = f28667v;
        throw new NoSuchElementException();
    }

    /* renamed from: f */
    public final List m26807f() {
        if (this.f28670q != null && this.f28671r != f28667v) {
            return new zz3(this.f28674u, this);
        }
        return this.f28674u;
    }

    /* renamed from: h */
    public final void m26808h(uz3 uz3Var, long j11, InterfaceC5012t9 interfaceC5012t9) {
        this.f28670q = uz3Var;
        this.f28672s = uz3Var.zzb();
        uz3Var.mo26636j(uz3Var.zzb() + j11);
        this.f28673t = uz3Var.zzb();
        this.f28669p = interfaceC5012t9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC5123w9 interfaceC5123w9 = this.f28671r;
        if (interfaceC5123w9 == f28667v) {
            return false;
        }
        if (interfaceC5123w9 != null) {
            return true;
        }
        try {
            this.f28671r = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f28671r = f28667v;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i11 = 0; i11 < this.f28674u.size(); i11++) {
            if (i11 > 0) {
                sb2.append(";");
            }
            sb2.append(((InterfaceC5123w9) this.f28674u.get(i11)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
