package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* loaded from: classes2.dex */
public final class C5332d1 {

    /* renamed from: a */
    final C5572r3 f32324a;

    /* renamed from: b */
    C5590s4 f32325b;

    /* renamed from: c */
    final C5313c f32326c;

    /* renamed from: d */
    private final C5720zf f32327d;

    public C5332d1() {
        C5572r3 c5572r3 = new C5572r3();
        this.f32324a = c5572r3;
        this.f32325b = c5572r3.f32764b.m29588a();
        this.f32326c = new C5313c();
        this.f32327d = new C5720zf();
        c5572r3.f32766d.m29982a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            public /* synthetic */ CallableC5279a() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5332d1.this.m29037b();
            }
        });
        c5572r3.f32766d.m29982a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            public /* synthetic */ CallableC5297b0() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C5662w8(C5332d1.this.f32326c);
            }
        });
    }

    /* renamed from: a */
    public final C5313c m29036a() {
        return this.f32326c;
    }

    /* renamed from: b */
    public final /* synthetic */ AbstractC5432j m29037b() {
        return new C5652vf(this.f32327d);
    }

    /* renamed from: c */
    public final void m29038c(C5489m5 c5489m5) {
        AbstractC5432j abstractC5432j;
        try {
            this.f32325b = this.f32324a.f32764b.m29588a();
            if (!(this.f32324a.m29571a(this.f32325b, (C5574r5[]) c5489m5.m29440C().toArray(new C5574r5[0])) instanceof C5398h)) {
                for (C5455k5 c5455k5 : c5489m5.m29439A().m29209D()) {
                    List m29361C = c5455k5.m29361C();
                    String m29360B = c5455k5.m29360B();
                    Iterator it = m29361C.iterator();
                    while (it.hasNext()) {
                        InterfaceC5551q m29571a = this.f32324a.m29571a(this.f32325b, (C5574r5) it.next());
                        if (m29571a instanceof C5500n) {
                            C5590s4 c5590s4 = this.f32325b;
                            if (!c5590s4.m29595h(m29360B)) {
                                abstractC5432j = null;
                            } else {
                                InterfaceC5551q m29591d = c5590s4.m29591d(m29360B);
                                if (m29591d instanceof AbstractC5432j) {
                                    abstractC5432j = (AbstractC5432j) m29591d;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(m29360B)));
                                }
                            }
                            if (abstractC5432j != null) {
                                abstractC5432j.mo28891a(this.f32325b, Collections.singletonList(m29571a));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(m29360B)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* renamed from: d */
    public final void m29039d(String str, Callable callable) {
        this.f32324a.f32766d.m29982a(str, callable);
    }

    /* renamed from: e */
    public final boolean m29040e(C5296b c5296b) {
        try {
            this.f32326c.m28957d(c5296b);
            this.f32324a.f32765c.m29594g("runtime.counter", new C5415i(Double.valueOf(0.0d)));
            this.f32327d.m30116b(this.f32325b.m29588a(), this.f32326c);
            if (!m29042g()) {
                if (!m29041f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* renamed from: f */
    public final boolean m29041f() {
        if (!this.f32326c.m28956c().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m29042g() {
        C5313c c5313c = this.f32326c;
        if (!c5313c.m28955b().equals(c5313c.m28954a())) {
            return true;
        }
        return false;
    }
}
