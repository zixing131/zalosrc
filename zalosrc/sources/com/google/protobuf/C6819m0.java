package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p664y.AbstractC30228a;

/* renamed from: com.google.protobuf.m0 */
/* loaded from: classes3.dex */
final class C6819m0 implements InterfaceC6839w0 {

    /* renamed from: a */
    private final InterfaceC6809i0 f37379a;

    /* renamed from: b */
    private final AbstractC6792c1 f37380b;

    /* renamed from: c */
    private final boolean f37381c;

    /* renamed from: d */
    private final AbstractC6814k f37382d;

    private C6819m0(AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6809i0 interfaceC6809i0) {
        this.f37380b = abstractC6792c1;
        this.f37381c = abstractC6814k.mo34991d(interfaceC6809i0);
        this.f37382d = abstractC6814k;
        this.f37379a = interfaceC6809i0;
    }

    /* renamed from: h */
    private int m35055h(AbstractC6792c1 abstractC6792c1, Object obj) {
        return abstractC6792c1.mo34754c(abstractC6792c1.mo34752a(obj));
    }

    /* renamed from: i */
    public static C6819m0 m35056i(AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6809i0 interfaceC6809i0) {
        return new C6819m0(abstractC6792c1, abstractC6814k, interfaceC6809i0);
    }

    /* renamed from: j */
    private void m35057j(AbstractC6792c1 abstractC6792c1, Object obj, InterfaceC6813j1 interfaceC6813j1) {
        abstractC6792c1.mo34758g(abstractC6792c1.mo34752a(obj), interfaceC6813j1);
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: a */
    public void mo35045a(Object obj, Object obj2) {
        AbstractC6843y0.m35171E(this.f37380b, obj, obj2);
        if (this.f37381c) {
            AbstractC6843y0.m35169C(this.f37382d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: b */
    public void mo35046b(Object obj, InterfaceC6813j1 interfaceC6813j1) {
        Iterator m35076n = this.f37382d.mo34989b(obj).m35076n();
        if (!m35076n.hasNext()) {
            m35057j(this.f37380b, obj, interfaceC6813j1);
        } else {
            AbstractC30228a.m149044a(((Map.Entry) m35076n.next()).getKey());
            throw null;
        }
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: c */
    public void mo35047c(Object obj) {
        this.f37380b.mo34755d(obj);
        this.f37382d.mo34992e(obj);
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: d */
    public final boolean mo35048d(Object obj) {
        return this.f37382d.mo34989b(obj).m35075k();
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: e */
    public int mo35049e(Object obj) {
        int m35055h = m35055h(this.f37380b, obj);
        if (this.f37381c) {
            return m35055h + this.f37382d.mo34989b(obj).m35072f();
        }
        return m35055h;
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: f */
    public int mo35050f(Object obj) {
        int hashCode = this.f37380b.mo34752a(obj).hashCode();
        if (this.f37381c) {
            return (hashCode * 53) + this.f37382d.mo34989b(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: g */
    public boolean mo35051g(Object obj, Object obj2) {
        if (!this.f37380b.mo34752a(obj).equals(this.f37380b.mo34752a(obj2))) {
            return false;
        }
        if (this.f37381c) {
            return this.f37382d.mo34989b(obj).equals(this.f37382d.mo34989b(obj2));
        }
        return true;
    }
}
