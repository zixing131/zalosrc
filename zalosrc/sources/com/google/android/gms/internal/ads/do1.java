package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Arrays;
import java.util.List;
import p665y0.C30239a;
import p665y0.C30245g;

/* loaded from: classes2.dex */
public final class do1 extends d10 {

    /* renamed from: p */
    private final Context f19371p;

    /* renamed from: q */
    private final vj1 f19372q;

    /* renamed from: r */
    private wk1 f19373r;

    /* renamed from: s */
    private qj1 f19374s;

    public do1(Context context, vj1 vj1Var, wk1 wk1Var, qj1 qj1Var) {
        this.f19371p = context;
        this.f19372q = vj1Var;
        this.f19373r = wk1Var;
        this.f19374s = qj1Var;
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: B4 */
    public final String mo20780B4(String str) {
        return (String) this.f19372q.m27248Q().get(str);
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: Z */
    public final k00 mo20781Z(String str) {
        return (k00) this.f19372q.m27247P().get(str);
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: e1 */
    public final void mo20782e1(InterfaceC4271b interfaceC4271b) {
        qj1 qj1Var;
        Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
        if ((m19914Q instanceof View) && this.f19372q.m27262c0() != null && (qj1Var = this.f19374s) != null) {
            qj1Var.m25744j((View) m19914Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: r */
    public final boolean mo20783r(InterfaceC4271b interfaceC4271b) {
        wk1 wk1Var;
        Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
        if (!(m19914Q instanceof ViewGroup) || (wk1Var = this.f19373r) == null || !wk1Var.m27648f((ViewGroup) m19914Q)) {
            return false;
        }
        this.f19372q.m27257Z().mo26700k0(new co1(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        return this.f19372q.m27249R();
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final h00 zzf() {
        return this.f19374s.m25726C().m26338a();
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final InterfaceC4271b zzh() {
        return BinderC4273d.m19913I3(this.f19371p);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final String zzi() {
        return this.f19372q.m27270g0();
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final List zzk() {
        C30245g m27247P = this.f19372q.m27247P();
        C30245g m27248Q = this.f19372q.m27248Q();
        String[] strArr = new String[m27247P.size() + m27248Q.size()];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < m27247P.size()) {
            strArr[i13] = (String) m27247P.m149163i(i12);
            i12++;
            i13++;
        }
        while (i11 < m27248Q.size()) {
            strArr[i13] = (String) m27248Q.m149163i(i11);
            i11++;
            i13++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzl() {
        qj1 qj1Var = this.f19374s;
        if (qj1Var != null) {
            qj1Var.mo23795a();
        }
        this.f19374s = null;
        this.f19373r = null;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzm() {
        String m27258a = this.f19372q.m27258a();
        if ("Google".equals(m27258a)) {
            yk0.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(m27258a)) {
            yk0.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        qj1 qj1Var = this.f19374s;
        if (qj1Var != null) {
            qj1Var.m25732L(m27258a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzn(String str) {
        qj1 qj1Var = this.f19374s;
        if (qj1Var != null) {
            qj1Var.m25740T(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzo() {
        qj1 qj1Var = this.f19374s;
        if (qj1Var != null) {
            qj1Var.m25743i();
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final boolean zzq() {
        qj1 qj1Var = this.f19374s;
        if ((qj1Var != null && !qj1Var.m25756v()) || this.f19372q.m27256Y() == null || this.f19372q.m27257Z() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final boolean zzs() {
        InterfaceC4271b m27262c0 = this.f19372q.m27262c0();
        if (m27262c0 != null) {
            zzt.zzA().zzd(m27262c0);
            if (this.f19372q.m27256Y() != null) {
                this.f19372q.m27256Y().mo23552V("onSdkLoaded", new C30239a());
                return true;
            }
            return true;
        }
        yk0.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
