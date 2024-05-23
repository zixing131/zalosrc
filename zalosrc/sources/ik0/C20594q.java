package ik0;

import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import ik0.AbstractC20601x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p665y0.C30243e;

/* renamed from: ik0.q */
/* loaded from: classes.dex */
public class C20594q implements InterfaceC20584g {

    /* renamed from: a */
    private final a f101323a;

    /* renamed from: b */
    private final HashMap f101324b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ik0.q$a */
    /* loaded from: classes.dex */
    public static class a extends C30243e {

        /* renamed from: i */
        InterfaceC20584g f101325i;

        a(int i11, InterfaceC20584g interfaceC20584g) {
            super(i11);
            this.f101325i = interfaceC20584g;
        }

        @Override // p665y0.C30243e
        /* renamed from: k */
        public void mo90430b(boolean z11, String str, ZOMDocument zOMDocument, ZOMDocument zOMDocument2) {
            if (zOMDocument != null) {
                this.f101325i.mo107135a(str, zOMDocument);
            }
        }
    }

    public C20594q(int i11) {
        this.f101323a = new a(i11, this);
        this.f101324b = new HashMap(i11);
    }

    /* renamed from: d */
    private String m107187d(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, int i11) {
        AbstractC20601x.b mo107096o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(abstractC20601x.mo107090i());
        if (abstractC20601x.mo107091j() != null) {
            sb2.append(abstractC20601x.mo107091j());
        }
        sb2.append(abstractC20596s.mo107060g());
        boolean z11 = true;
        if (abstractC20596s.mo107062i() != 1) {
            z11 = false;
        }
        if (z11) {
            sb2.append(abstractC20596s.mo107061h());
        }
        if (i11 == 0 && (mo107096o = abstractC20601x.mo107096o()) != null) {
            sb2.append(mo107096o.mo107125j());
            sb2.append(mo107096o.mo107117b());
            sb2.append(mo107096o.mo107121f());
            sb2.append(mo107096o.mo107122g());
            if (z11) {
                sb2.append(mo107096o.mo107119d());
            }
        }
        sb2.trimToSize();
        return sb2.toString();
    }

    @Override // ik0.InterfaceC20584g
    /* renamed from: a */
    public void mo107135a(String str, ZOMDocument zOMDocument) {
        this.f101324b.put(str, new WeakReference(zOMDocument));
    }

    /* renamed from: b */
    public synchronized void m107188b() {
        this.f101323a.m149138c();
        this.f101324b.clear();
    }

    /* renamed from: c */
    public ZOMDocument m107189c(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, int i11) {
        ZOMDocument zOMDocument;
        String m107187d = m107187d(abstractC20601x, abstractC20596s, i11);
        synchronized (this.f101323a) {
            zOMDocument = (ZOMDocument) this.f101323a.m149139d(m107187d);
        }
        boolean z11 = false;
        if (zOMDocument == null) {
            synchronized (this.f101324b) {
                try {
                    WeakReference weakReference = (WeakReference) this.f101324b.get(m107187d);
                    if (weakReference != null) {
                        zOMDocument = (ZOMDocument) weakReference.get();
                        this.f101324b.remove(m107187d);
                        z11 = true;
                    }
                } finally {
                }
            }
        }
        if (z11 && zOMDocument != null && zOMDocument.isStrongCache()) {
            synchronized (this.f101323a) {
                this.f101323a.m149140e(m107187d, zOMDocument);
            }
        }
        return zOMDocument;
    }

    /* renamed from: e */
    public ZOMDocument m107190e(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, ZOMDocument zOMDocument, int i11, boolean z11) {
        String m107187d = m107187d(abstractC20601x, abstractC20596s, i11);
        if (!z11) {
            synchronized (this.f101324b) {
                try {
                    WeakReference weakReference = (WeakReference) this.f101324b.get(m107187d);
                    if (weakReference != null) {
                        if (!zOMDocument.equals(weakReference.get())) {
                        }
                    }
                    this.f101324b.put(m107187d, new WeakReference(zOMDocument));
                } finally {
                }
            }
            return zOMDocument;
        }
        synchronized (this.f101323a) {
            try {
                if (!zOMDocument.equals(this.f101323a.m149139d(m107187d))) {
                    this.f101323a.m149140e(m107187d, zOMDocument);
                }
            } finally {
            }
        }
        return zOMDocument;
    }

    /* renamed from: f */
    public void m107191f(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, int i11) {
        String m107187d = m107187d(abstractC20601x, abstractC20596s, i11);
        synchronized (this.f101323a) {
            this.f101323a.m149141f(m107187d);
        }
        synchronized (this.f101324b) {
            this.f101324b.remove(m107187d);
        }
    }

    /* renamed from: g */
    public void m107192g(ZOMDocument zOMDocument) {
        synchronized (this.f101324b) {
            try {
                LinkedList linkedList = new LinkedList();
                for (Map.Entry entry : this.f101324b.entrySet()) {
                    if (((ZOMDocument) ((WeakReference) entry.getValue()).get()) == zOMDocument) {
                        linkedList.add((String) entry.getKey());
                    }
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    this.f101324b.remove((String) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
