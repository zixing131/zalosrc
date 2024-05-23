package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5329cf;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* loaded from: classes.dex */
public final class C6039k4 implements InterfaceC5329cf {

    /* renamed from: a */
    final /* synthetic */ C6061m4 f34134a;

    public C6039k4(C6061m4 c6061m4) {
        this.f34134a = c6061m4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5329cf
    /* renamed from: a */
    public final void mo29032a(int i11, String str, List list, boolean z11, boolean z12) {
        C6060m3 m31196p;
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        m31196p = this.f34134a.f34158a.mo31033c().m31200t();
                    } else if (z11) {
                        m31196p = this.f34134a.f34158a.mo31033c().m31204y();
                    } else if (!z12) {
                        m31196p = this.f34134a.f34158a.mo31033c().m31203x();
                    } else {
                        m31196p = this.f34134a.f34158a.mo31033c().m31202w();
                    }
                } else {
                    m31196p = this.f34134a.f34158a.mo31033c().m31201u();
                }
            } else if (z11) {
                m31196p = this.f34134a.f34158a.mo31033c().m31199s();
            } else if (!z12) {
                m31196p = this.f34134a.f34158a.mo31033c().m31198r();
            } else {
                m31196p = this.f34134a.f34158a.mo31033c().m31197q();
            }
        } else {
            m31196p = this.f34134a.f34158a.mo31033c().m31196p();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    m31196p.m31108a(str);
                    return;
                } else {
                    m31196p.m31111d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            m31196p.m31110c(str, list.get(0), list.get(1));
            return;
        }
        m31196p.m31109b(str, list.get(0));
    }
}
