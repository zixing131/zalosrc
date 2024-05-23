package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class mw2 implements kw2 {

    /* renamed from: a */
    private final Context f24882a;

    /* renamed from: l */
    private final int f24893l;

    /* renamed from: b */
    private long f24883b = 0;

    /* renamed from: c */
    private long f24884c = -1;

    /* renamed from: d */
    private boolean f24885d = false;

    /* renamed from: m */
    private int f24894m = 2;

    /* renamed from: n */
    private int f24895n = 2;

    /* renamed from: e */
    private int f24886e = 0;

    /* renamed from: f */
    private String f24887f = "";

    /* renamed from: g */
    private String f24888g = "";

    /* renamed from: h */
    private String f24889h = "";

    /* renamed from: i */
    private String f24890i = "";

    /* renamed from: j */
    private boolean f24891j = false;

    /* renamed from: k */
    private boolean f24892k = false;

    public mw2(Context context, int i11) {
        this.f24882a = context;
        this.f24893l = i11;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ kw2 mo23063a(zze zzeVar) {
        m24764j(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ kw2 mo23064b(sq2 sq2Var) {
        m24765k(sq2Var);
        return this;
    }

    /* renamed from: c */
    public final synchronized mw2 m24763c(int i11) {
        this.f24894m = i11;
        return this;
    }

    /* renamed from: j */
    public final synchronized mw2 m24764j(zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder == null) {
                return this;
            }
            o71 o71Var = (o71) iBinder;
            String zzk = o71Var.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.f24887f = zzk;
            }
            String zzi = o71Var.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.f24888g = zzi;
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:            r2.f24888g = r0.f22318c0;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized mw2 m24765k(sq2 sq2Var) {
        try {
            if (!TextUtils.isEmpty(sq2Var.f27823b.f24014b)) {
                this.f24887f = sq2Var.f27823b.f24014b;
            }
            Iterator it = sq2Var.f27822a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                iq2 iq2Var = (iq2) it.next();
                if (!TextUtils.isEmpty(iq2Var.f22318c0)) {
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* renamed from: l */
    public final synchronized mw2 m24766l(String str) {
        this.f24889h = str;
        return this;
    }

    /* renamed from: m */
    public final synchronized mw2 m24767m(String str) {
        this.f24890i = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ kw2 mo23065n(int i11) {
        m24763c(i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ kw2 mo23066o(String str) {
        m24767m(str);
        return this;
    }

    /* renamed from: p */
    public final synchronized mw2 m24768p(boolean z11) {
        this.f24885d = z11;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ kw2 mo23067q(boolean z11) {
        m24768p(z11);
        return this;
    }

    /* renamed from: r */
    public final synchronized mw2 m24769r() {
        Configuration configuration;
        this.f24886e = zzt.zzq().zzl(this.f24882a);
        Resources resources = this.f24882a.getResources();
        int i11 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i11 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f24895n = i11;
        this.f24883b = zzt.zzB().mo105914b();
        this.f24892k = true;
        return this;
    }

    /* renamed from: s */
    public final synchronized mw2 m24770s() {
        this.f24884c = zzt.zzB().mo105914b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ kw2 mo23068t(String str) {
        m24766l(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    public final /* bridge */ /* synthetic */ kw2 zzf() {
        m24769r();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    public final /* bridge */ /* synthetic */ kw2 zzg() {
        m24770s();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    public final synchronized boolean zzh() {
        return this.f24892k;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    public final boolean zzi() {
        if (!TextUtils.isEmpty(this.f24889h)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kw2
    public final synchronized ow2 zzj() {
        try {
            if (this.f24891j) {
                return null;
            }
            this.f24891j = true;
            if (!this.f24892k) {
                m24769r();
            }
            if (this.f24884c < 0) {
                m24770s();
            }
            return new ow2(this, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
