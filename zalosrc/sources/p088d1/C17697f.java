package p088d1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d1.f */
/* loaded from: classes2.dex */
public class C17697f implements InterfaceC17695d {

    /* renamed from: d */
    AbstractC17707p f89726d;

    /* renamed from: f */
    int f89728f;

    /* renamed from: g */
    public int f89729g;

    /* renamed from: a */
    public InterfaceC17695d f89723a = null;

    /* renamed from: b */
    public boolean f89724b = false;

    /* renamed from: c */
    public boolean f89725c = false;

    /* renamed from: e */
    a f89727e = a.UNKNOWN;

    /* renamed from: h */
    int f89730h = 1;

    /* renamed from: i */
    C17698g f89731i = null;

    /* renamed from: j */
    public boolean f89732j = false;

    /* renamed from: k */
    List f89733k = new ArrayList();

    /* renamed from: l */
    List f89734l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.f$a */
    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C17697f(AbstractC17707p abstractC17707p) {
        this.f89726d = abstractC17707p;
    }

    @Override // p088d1.InterfaceC17695d
    /* renamed from: a */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        Iterator it = this.f89734l.iterator();
        while (it.hasNext()) {
            if (!((C17697f) it.next()).f89732j) {
                return;
            }
        }
        this.f89725c = true;
        InterfaceC17695d interfaceC17695d2 = this.f89723a;
        if (interfaceC17695d2 != null) {
            interfaceC17695d2.mo93716a(this);
        }
        if (this.f89724b) {
            this.f89726d.mo93716a(this);
            return;
        }
        C17697f c17697f = null;
        int i11 = 0;
        for (C17697f c17697f2 : this.f89734l) {
            if (!(c17697f2 instanceof C17698g)) {
                i11++;
                c17697f = c17697f2;
            }
        }
        if (c17697f != null && i11 == 1 && c17697f.f89732j) {
            C17698g c17698g = this.f89731i;
            if (c17698g != null) {
                if (c17698g.f89732j) {
                    this.f89728f = this.f89730h * c17698g.f89729g;
                } else {
                    return;
                }
            }
            mo93738d(c17697f.f89729g + this.f89728f);
        }
        InterfaceC17695d interfaceC17695d3 = this.f89723a;
        if (interfaceC17695d3 != null) {
            interfaceC17695d3.mo93716a(this);
        }
    }

    /* renamed from: b */
    public void m93736b(InterfaceC17695d interfaceC17695d) {
        this.f89733k.add(interfaceC17695d);
        if (this.f89732j) {
            interfaceC17695d.mo93716a(interfaceC17695d);
        }
    }

    /* renamed from: c */
    public void m93737c() {
        this.f89734l.clear();
        this.f89733k.clear();
        this.f89732j = false;
        this.f89729g = 0;
        this.f89725c = false;
        this.f89724b = false;
    }

    /* renamed from: d */
    public void mo93738d(int i11) {
        if (this.f89732j) {
            return;
        }
        this.f89732j = true;
        this.f89729g = i11;
        for (InterfaceC17695d interfaceC17695d : this.f89733k) {
            interfaceC17695d.mo93716a(interfaceC17695d);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f89726d.f89777b.m16125v());
        sb2.append(":");
        sb2.append(this.f89727e);
        sb2.append("(");
        if (this.f89732j) {
            obj = Integer.valueOf(this.f89729g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f89734l.size());
        sb2.append(":d=");
        sb2.append(this.f89733k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
