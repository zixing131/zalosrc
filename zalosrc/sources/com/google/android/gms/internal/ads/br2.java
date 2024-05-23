package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class br2 {

    /* renamed from: a */
    private zzl f17958a;

    /* renamed from: b */
    private zzq f17959b;

    /* renamed from: c */
    private String f17960c;

    /* renamed from: d */
    private zzff f17961d;

    /* renamed from: e */
    private boolean f17962e;

    /* renamed from: f */
    private ArrayList f17963f;

    /* renamed from: g */
    private ArrayList f17964g;

    /* renamed from: h */
    private zzbls f17965h;

    /* renamed from: i */
    private com.google.android.gms.ads.internal.client.zzw f17966i;

    /* renamed from: j */
    private AdManagerAdViewOptions f17967j;

    /* renamed from: k */
    private PublisherAdViewOptions f17968k;

    /* renamed from: l */
    private zzbz f17969l;

    /* renamed from: n */
    private zzbsc f17971n;

    /* renamed from: q */
    private na2 f17974q;

    /* renamed from: s */
    private zzcd f17976s;

    /* renamed from: m */
    private int f17970m = 1;

    /* renamed from: o */
    private final nq2 f17972o = new nq2();

    /* renamed from: p */
    private boolean f17973p = false;

    /* renamed from: r */
    private boolean f17975r = false;

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ zzff m20658A(br2 br2Var) {
        return br2Var.f17961d;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ zzbls m20659B(br2 br2Var) {
        return br2Var.f17965h;
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ zzbsc m20660C(br2 br2Var) {
        return br2Var.f17971n;
    }

    /* renamed from: D */
    public static /* bridge */ /* synthetic */ na2 m20661D(br2 br2Var) {
        return br2Var.f17974q;
    }

    /* renamed from: E */
    public static /* bridge */ /* synthetic */ nq2 m20662E(br2 br2Var) {
        return br2Var.f17972o;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ String m20663h(br2 br2Var) {
        return br2Var.f17960c;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ ArrayList m20664j(br2 br2Var) {
        return br2Var.f17963f;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ ArrayList m20665k(br2 br2Var) {
        return br2Var.f17964g;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m20666l(br2 br2Var) {
        return br2Var.f17973p;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m20667m(br2 br2Var) {
        return br2Var.f17975r;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m20668n(br2 br2Var) {
        return br2Var.f17962e;
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ zzcd m20669p(br2 br2Var) {
        return br2Var.f17976s;
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ int m20670r(br2 br2Var) {
        return br2Var.f17970m;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions m20671s(br2 br2Var) {
        return br2Var.f17967j;
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ PublisherAdViewOptions m20672t(br2 br2Var) {
        return br2Var.f17968k;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ zzl m20673u(br2 br2Var) {
        return br2Var.f17958a;
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ zzq m20674w(br2 br2Var) {
        return br2Var.f17959b;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw m20675y(br2 br2Var) {
        return br2Var.f17966i;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ zzbz m20676z(br2 br2Var) {
        return br2Var.f17969l;
    }

    /* renamed from: F */
    public final nq2 m20677F() {
        return this.f17972o;
    }

    /* renamed from: G */
    public final br2 m20678G(dr2 dr2Var) {
        this.f17972o.m24979a(dr2Var.f19409o.f26311a);
        this.f17958a = dr2Var.f19398d;
        this.f17959b = dr2Var.f19399e;
        this.f17976s = dr2Var.f19412r;
        this.f17960c = dr2Var.f19400f;
        this.f17961d = dr2Var.f19395a;
        this.f17963f = dr2Var.f19401g;
        this.f17964g = dr2Var.f19402h;
        this.f17965h = dr2Var.f19403i;
        this.f17966i = dr2Var.f19404j;
        m20679H(dr2Var.f19406l);
        m20692d(dr2Var.f19407m);
        this.f17973p = dr2Var.f19410p;
        this.f17974q = dr2Var.f19397c;
        this.f17975r = dr2Var.f19411q;
        return this;
    }

    /* renamed from: H */
    public final br2 m20679H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f17967j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f17962e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    /* renamed from: I */
    public final br2 m20680I(zzq zzqVar) {
        this.f17959b = zzqVar;
        return this;
    }

    /* renamed from: J */
    public final br2 m20681J(String str) {
        this.f17960c = str;
        return this;
    }

    /* renamed from: K */
    public final br2 m20682K(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.f17966i = zzwVar;
        return this;
    }

    /* renamed from: L */
    public final br2 m20683L(na2 na2Var) {
        this.f17974q = na2Var;
        return this;
    }

    /* renamed from: M */
    public final br2 m20684M(zzbsc zzbscVar) {
        this.f17971n = zzbscVar;
        this.f17961d = new zzff(false, true, false);
        return this;
    }

    /* renamed from: N */
    public final br2 m20685N(boolean z11) {
        this.f17973p = z11;
        return this;
    }

    /* renamed from: O */
    public final br2 m20686O(boolean z11) {
        this.f17975r = true;
        return this;
    }

    /* renamed from: P */
    public final br2 m20687P(boolean z11) {
        this.f17962e = z11;
        return this;
    }

    /* renamed from: Q */
    public final br2 m20688Q(int i11) {
        this.f17970m = i11;
        return this;
    }

    /* renamed from: a */
    public final br2 m20689a(zzbls zzblsVar) {
        this.f17965h = zzblsVar;
        return this;
    }

    /* renamed from: b */
    public final br2 m20690b(ArrayList arrayList) {
        this.f17963f = arrayList;
        return this;
    }

    /* renamed from: c */
    public final br2 m20691c(ArrayList arrayList) {
        this.f17964g = arrayList;
        return this;
    }

    /* renamed from: d */
    public final br2 m20692d(PublisherAdViewOptions publisherAdViewOptions) {
        this.f17968k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f17962e = publisherAdViewOptions.zzc();
            this.f17969l = publisherAdViewOptions.zza();
        }
        return this;
    }

    /* renamed from: e */
    public final br2 m20693e(zzl zzlVar) {
        this.f17958a = zzlVar;
        return this;
    }

    /* renamed from: f */
    public final br2 m20694f(zzff zzffVar) {
        this.f17961d = zzffVar;
        return this;
    }

    /* renamed from: g */
    public final dr2 m20695g() {
        AbstractC4205o.m19723l(this.f17960c, "ad unit must not be null");
        AbstractC4205o.m19723l(this.f17959b, "ad size must not be null");
        AbstractC4205o.m19723l(this.f17958a, "ad request must not be null");
        return new dr2(this, null);
    }

    /* renamed from: i */
    public final String m20696i() {
        return this.f17960c;
    }

    /* renamed from: o */
    public final boolean m20697o() {
        return this.f17973p;
    }

    /* renamed from: q */
    public final br2 m20698q(zzcd zzcdVar) {
        this.f17976s = zzcdVar;
        return this;
    }

    /* renamed from: v */
    public final zzl m20699v() {
        return this.f17958a;
    }

    /* renamed from: x */
    public final zzq m20700x() {
        return this.f17959b;
    }
}
