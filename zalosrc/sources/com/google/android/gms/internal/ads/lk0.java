package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p229i5.InterfaceC20285f;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class lk0 implements InterfaceC4657jq {

    /* renamed from: b */
    private final zzg f23957b;

    /* renamed from: d */
    final ik0 f23959d;

    /* renamed from: a */
    private final Object f23956a = new Object();

    /* renamed from: e */
    final HashSet f23960e = new HashSet();

    /* renamed from: f */
    final HashSet f23961f = new HashSet();

    /* renamed from: g */
    private boolean f23962g = false;

    /* renamed from: c */
    private final kk0 f23958c = new kk0();

    public lk0(String str, zzg zzgVar) {
        this.f23959d = new ik0(str, zzgVar);
        this.f23957b = zzgVar;
    }

    /* renamed from: a */
    public final ak0 m24311a(InterfaceC20285f interfaceC20285f, String str) {
        return new ak0(interfaceC20285f, this, this.f23958c.m23954a(), str);
    }

    /* renamed from: b */
    public final void m24312b(ak0 ak0Var) {
        synchronized (this.f23956a) {
            this.f23960e.add(ak0Var);
        }
    }

    /* renamed from: c */
    public final void m24313c() {
        synchronized (this.f23956a) {
            this.f23959d.m23280b();
        }
    }

    /* renamed from: d */
    public final void m24314d() {
        synchronized (this.f23956a) {
            this.f23959d.m23281c();
        }
    }

    /* renamed from: e */
    public final void m24315e() {
        synchronized (this.f23956a) {
            this.f23959d.m23282d();
        }
    }

    /* renamed from: f */
    public final void m24316f() {
        synchronized (this.f23956a) {
            this.f23959d.m23283e();
        }
    }

    /* renamed from: g */
    public final void m24317g(zzl zzlVar, long j11) {
        synchronized (this.f23956a) {
            this.f23959d.m23284f(zzlVar, j11);
        }
    }

    /* renamed from: h */
    public final void m24318h(HashSet hashSet) {
        synchronized (this.f23956a) {
            this.f23960e.addAll(hashSet);
        }
    }

    /* renamed from: i */
    public final boolean m24319i() {
        return this.f23962g;
    }

    /* renamed from: j */
    public final Bundle m24320j(Context context, is2 is2Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f23956a) {
            hashSet.addAll(this.f23960e);
            this.f23960e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f23959d.m23279a(context, this.f23958c.m23955b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f23961f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ak0) it2.next()).m20151a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            is2Var.m23386c(hashSet);
            return bundle;
        }
        AbstractC30228a.m149044a(it.next());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4657jq
    public final void zza(boolean z11) {
        long mo105913a = zzt.zzB().mo105913a();
        if (z11) {
            if (mo105913a - this.f23957b.zzd() > ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21062N0)).longValue()) {
                this.f23959d.f22197d = -1;
            } else {
                this.f23959d.f22197d = this.f23957b.zzc();
            }
            this.f23962g = true;
            return;
        }
        this.f23957b.zzt(mo105913a);
        this.f23957b.zzJ(this.f23959d.f22197d);
    }
}
