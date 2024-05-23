package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.C5300b3;
import com.google.android.gms.internal.measurement.C5334d3;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5539p4;
import com.google.android.gms.internal.measurement.C5649vc;
import java.util.HashSet;
import java.util.Iterator;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.measurement.internal.aa */
/* loaded from: classes2.dex */
public final class C5932aa extends AbstractC5944ba {

    /* renamed from: g */
    private final C5300b3 f33775g;

    /* renamed from: h */
    final /* synthetic */ C5933b f33776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5932aa(C5933b c5933b, String str, int i11, C5300b3 c5300b3) {
        super(str, i11);
        this.f33776h = c5933b;
        this.f33775g = c5300b3;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: a */
    public final int mo30795a() {
        return this.f33775g.m28910B();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: b */
    public final boolean mo30796b() {
        return this.f33775g.m28918O();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: c */
    public final boolean mo30797c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f1  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m30798k(Long l11, Long l12, C5471l4 c5471l4, long j11, C6100q c6100q, boolean z11) {
        Boolean m30812i;
        C5649vc.m29807b();
        boolean m30913B = this.f33776h.f34158a.m31401z().m30913B(this.f33796a, AbstractC5972e3.f33908a0);
        long j12 = this.f33775g.m28917N() ? c6100q.f34347e : j11;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.f33776h.f34158a.mo31033c().m31194D(), 2)) {
            this.f33776h.f34158a.mo31033c().m31201u().m31111d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f33797b), this.f33775g.m28919P() ? Integer.valueOf(this.f33775g.m28910B()) : null, this.f33776h.f34158a.m31372D().m30964d(this.f33775g.m28913G()));
            this.f33776h.f34158a.mo31033c().m31201u().m31109b("Filter definition", this.f33776h.f34628b.m31085g0().m31170E(this.f33775g));
        }
        if (!this.f33775g.m28919P() || this.f33775g.m28910B() > 256) {
            this.f33776h.f34158a.mo31033c().m31202w().m31110c("Invalid event filter ID. appId, id", C6082o3.m31193z(this.f33796a), String.valueOf(this.f33775g.m28919P() ? Integer.valueOf(this.f33775g.m28910B()) : null));
            return false;
        }
        boolean z12 = this.f33775g.m28915L() || this.f33775g.m28916M() || this.f33775g.m28917N();
        if (z11 && !z12) {
            this.f33776h.f34158a.mo31033c().m31201u().m31110c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f33797b), this.f33775g.m28919P() ? Integer.valueOf(this.f33775g.m28910B()) : null);
            return true;
        }
        C5300b3 c5300b3 = this.f33775g;
        String m29398H = c5471l4.m29398H();
        if (c5300b3.m28918O()) {
            Boolean m30811h = AbstractC5944ba.m30811h(j12, c5300b3.m28912F());
            if (m30811h != null) {
                if (!m30811h.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            this.f33776h.f34158a.mo31033c().m31201u().m31109b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f33798c = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.f33799d = bool2;
            if (z12 && c5471l4.m29402U()) {
                Long valueOf = Long.valueOf(c5471l4.m29396D());
                if (this.f33775g.m28916M()) {
                    if (m30913B && this.f33775g.m28918O()) {
                        valueOf = l11;
                    }
                    this.f33801f = valueOf;
                } else {
                    if (m30913B && this.f33775g.m28918O()) {
                        valueOf = l12;
                    }
                    this.f33800e = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = c5300b3.m28914H().iterator();
        while (true) {
            if (it.hasNext()) {
                C5334d3 c5334d3 = (C5334d3) it.next();
                if (c5334d3.m29048E().isEmpty()) {
                    this.f33776h.f34158a.mo31033c().m31202w().m31109b("null or empty param name in filter. event", this.f33776h.f34158a.m31372D().m30964d(m29398H));
                    break;
                }
                hashSet.add(c5334d3.m29048E());
            } else {
                C30239a c30239a = new C30239a();
                Iterator it2 = c5471l4.m29399I().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C5539p4 c5539p4 = (C5539p4) it2.next();
                        if (hashSet.contains(c5539p4.m29518G())) {
                            if (c5539p4.m29523W()) {
                                c30239a.put(c5539p4.m29518G(), c5539p4.m29523W() ? Long.valueOf(c5539p4.m29517D()) : null);
                            } else if (c5539p4.m29521U()) {
                                c30239a.put(c5539p4.m29518G(), c5539p4.m29521U() ? Double.valueOf(c5539p4.m29514A()) : null);
                            } else if (c5539p4.m29525Y()) {
                                c30239a.put(c5539p4.m29518G(), c5539p4.m29519H());
                            } else {
                                this.f33776h.f34158a.mo31033c().m31202w().m31110c("Unknown value for param. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(c5539p4.m29518G()));
                                break;
                            }
                        }
                    } else {
                        Iterator it3 = c5300b3.m28914H().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            C5334d3 c5334d32 = (C5334d3) it3.next();
                            boolean z13 = c5334d32.m29050H() && c5334d32.m29049G();
                            String m29048E = c5334d32.m29048E();
                            if (m29048E.isEmpty()) {
                                this.f33776h.f34158a.mo31033c().m31202w().m31109b("Event has empty param name. event", this.f33776h.f34158a.m31372D().m30964d(m29398H));
                                break;
                            }
                            Object obj = c30239a.get(m29048E);
                            if (obj instanceof Long) {
                                if (!c5334d32.m29051I()) {
                                    this.f33776h.f34158a.mo31033c().m31202w().m31110c("No number filter for long param. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                                    break;
                                }
                                Boolean m30811h2 = AbstractC5944ba.m30811h(((Long) obj).longValue(), c5334d32.m29046C());
                                if (m30811h2 == null) {
                                    break;
                                }
                                if (m30811h2.booleanValue() == z13) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!c5334d32.m29051I()) {
                                    this.f33776h.f34158a.mo31033c().m31202w().m31110c("No number filter for double param. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                                    break;
                                }
                                Boolean m30810g = AbstractC5944ba.m30810g(((Double) obj).doubleValue(), c5334d32.m29046C());
                                if (m30810g == null) {
                                    break;
                                }
                                if (m30810g.booleanValue() == z13) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (c5334d32.m29053L()) {
                                    m30812i = AbstractC5944ba.m30809f((String) obj, c5334d32.m29047D(), this.f33776h.f34158a.mo31033c());
                                } else if (c5334d32.m29051I()) {
                                    String str = (String) obj;
                                    if (C6077n9.m31154N(str)) {
                                        m30812i = AbstractC5944ba.m30812i(str, c5334d32.m29046C());
                                    } else {
                                        this.f33776h.f34158a.mo31033c().m31202w().m31110c("Invalid param value for number filter. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                                        break;
                                    }
                                } else {
                                    this.f33776h.f34158a.mo31033c().m31202w().m31110c("No filter for String param. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                                    break;
                                }
                                if (m30812i == null) {
                                    break;
                                }
                                if (m30812i.booleanValue() == z13) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj == null) {
                                this.f33776h.f34158a.mo31033c().m31201u().m31110c("Missing param for filter. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                                bool = Boolean.FALSE;
                            } else {
                                this.f33776h.f34158a.mo31033c().m31202w().m31110c("Unknown param type. event, param", this.f33776h.f34158a.m31372D().m30964d(m29398H), this.f33776h.f34158a.m31372D().m30965e(m29048E));
                            }
                        }
                    }
                }
            }
        }
        this.f33776h.f34158a.mo31033c().m31201u().m31109b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
