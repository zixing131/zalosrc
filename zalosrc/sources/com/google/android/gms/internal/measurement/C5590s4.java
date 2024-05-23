package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
/* loaded from: classes2.dex */
public final class C5590s4 {

    /* renamed from: a */
    public final C5590s4 f32783a;

    /* renamed from: b */
    final C5687y f32784b;

    /* renamed from: c */
    final Map f32785c = new HashMap();

    /* renamed from: d */
    final Map f32786d = new HashMap();

    public C5590s4(C5590s4 c5590s4, C5687y c5687y) {
        this.f32783a = c5590s4;
        this.f32784b = c5687y;
    }

    /* renamed from: a */
    public final C5590s4 m29588a() {
        return new C5590s4(this, this.f32784b);
    }

    /* renamed from: b */
    public final InterfaceC5551q m29589b(InterfaceC5551q interfaceC5551q) {
        return this.f32784b.m30034a(this, interfaceC5551q);
    }

    /* renamed from: c */
    public final InterfaceC5551q m29590c(C5364f c5364f) {
        InterfaceC5551q interfaceC5551q = InterfaceC5551q.f32730d;
        Iterator m29106p = c5364f.m29106p();
        while (m29106p.hasNext()) {
            interfaceC5551q = this.f32784b.m30034a(this, c5364f.m29104m(((Integer) m29106p.next()).intValue()));
            if (interfaceC5551q instanceof C5398h) {
                break;
            }
        }
        return interfaceC5551q;
    }

    /* renamed from: d */
    public final InterfaceC5551q m29591d(String str) {
        if (this.f32785c.containsKey(str)) {
            return (InterfaceC5551q) this.f32785c.get(str);
        }
        C5590s4 c5590s4 = this.f32783a;
        if (c5590s4 != null) {
            return c5590s4.m29591d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m29592e(String str, InterfaceC5551q interfaceC5551q) {
        if (this.f32786d.containsKey(str)) {
            return;
        }
        if (interfaceC5551q == null) {
            this.f32785c.remove(str);
        } else {
            this.f32785c.put(str, interfaceC5551q);
        }
    }

    /* renamed from: f */
    public final void m29593f(String str, InterfaceC5551q interfaceC5551q) {
        m29592e(str, interfaceC5551q);
        this.f32786d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m29594g(String str, InterfaceC5551q interfaceC5551q) {
        C5590s4 c5590s4;
        if (!this.f32785c.containsKey(str) && (c5590s4 = this.f32783a) != null && c5590s4.m29595h(str)) {
            this.f32783a.m29594g(str, interfaceC5551q);
        } else {
            if (this.f32786d.containsKey(str)) {
                return;
            }
            if (interfaceC5551q == null) {
                this.f32785c.remove(str);
            } else {
                this.f32785c.put(str, interfaceC5551q);
            }
        }
    }

    /* renamed from: h */
    public final boolean m29595h(String str) {
        if (this.f32785c.containsKey(str)) {
            return true;
        }
        C5590s4 c5590s4 = this.f32783a;
        if (c5590s4 != null) {
            return c5590s4.m29595h(str);
        }
        return false;
    }
}
