package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class iz2 implements py2 {

    /* renamed from: i */
    private static final iz2 f22564i = new iz2();

    /* renamed from: j */
    private static final Handler f22565j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private static Handler f22566k = null;

    /* renamed from: l */
    private static final Runnable f22567l = new gz2();

    /* renamed from: m */
    private static final Runnable f22568m = new hz2();

    /* renamed from: b */
    private int f22570b;

    /* renamed from: h */
    private long f22576h;

    /* renamed from: a */
    private final List f22569a = new ArrayList();

    /* renamed from: c */
    private boolean f22571c = false;

    /* renamed from: d */
    private final List f22572d = new ArrayList();

    /* renamed from: f */
    private final dz2 f22574f = new dz2();

    /* renamed from: e */
    private final ry2 f22573e = new ry2();

    /* renamed from: g */
    private final ez2 f22575g = new ez2(new lz2());

    iz2() {
    }

    /* renamed from: d */
    public static iz2 m23475d() {
        return f22564i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m23478g(iz2 iz2Var) {
        iz2Var.f22570b = 0;
        iz2Var.f22572d.clear();
        iz2Var.f22571c = false;
        for (xx2 xx2Var : iy2.m23465a().m23466b()) {
        }
        iz2Var.f22576h = System.nanoTime();
        iz2Var.f22574f.m21580i();
        long nanoTime = System.nanoTime();
        qy2 m26204a = iz2Var.f22573e.m26204a();
        if (iz2Var.f22574f.m21576e().size() > 0) {
            Iterator it = iz2Var.f22574f.m21576e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject m28388a = yy2.m28388a(0, 0, 0, 0);
                View m21572a = iz2Var.f22574f.m21572a(str);
                qy2 m26205b = iz2Var.f22573e.m26205b();
                String m21574c = iz2Var.f22574f.m21574c(str);
                if (m21574c != null) {
                    JSONObject zza = m26205b.zza(m21572a);
                    yy2.m28389b(zza, str);
                    yy2.m28393f(zza, m21574c);
                    yy2.m28390c(m28388a, zza);
                }
                yy2.m28396i(m28388a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                iz2Var.f22575g.m21835c(m28388a, hashSet, nanoTime);
            }
        }
        if (iz2Var.f22574f.m21577f().size() > 0) {
            JSONObject m28388a2 = yy2.m28388a(0, 0, 0, 0);
            iz2Var.m23479k(null, m26204a, m28388a2, 1, false);
            yy2.m28396i(m28388a2);
            iz2Var.f22575g.m21836d(m28388a2, iz2Var.f22574f.m21577f(), nanoTime);
        } else {
            iz2Var.f22575g.m21834b();
        }
        iz2Var.f22574f.m21578g();
        long nanoTime2 = System.nanoTime() - iz2Var.f22576h;
        if (iz2Var.f22569a.size() > 0) {
            Iterator it2 = iz2Var.f22569a.iterator();
            if (it2.hasNext()) {
                AbstractC30228a.m149044a(it2.next());
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
    }

    /* renamed from: k */
    private final void m23479k(View view, qy2 qy2Var, JSONObject jSONObject, int i11, boolean z11) {
        boolean z12;
        if (i11 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        qy2Var.mo25919a(view, jSONObject, this, z12, z11);
    }

    /* renamed from: l */
    private static final void m23480l() {
        Handler handler = f22566k;
        if (handler != null) {
            handler.removeCallbacks(f22568m);
            f22566k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.py2
    /* renamed from: a */
    public final void mo23481a(View view, qy2 qy2Var, JSONObject jSONObject, boolean z11) {
        int m21582k;
        boolean z12;
        boolean z13;
        if (bz2.m20774b(view) != null || (m21582k = this.f22574f.m21582k(view)) == 3) {
            return;
        }
        JSONObject zza = qy2Var.zza(view);
        yy2.m28390c(jSONObject, zza);
        String m21575d = this.f22574f.m21575d(view);
        if (m21575d != null) {
            yy2.m28389b(zza, m21575d);
            yy2.m28392e(zza, Boolean.valueOf(this.f22574f.m21581j(view)));
            this.f22574f.m21579h();
        } else {
            cz2 m21573b = this.f22574f.m21573b(view);
            if (m21573b != null) {
                yy2.m28391d(zza, m21573b);
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 || z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            m23479k(view, qy2Var, zza, m21582k, z13);
        }
        this.f22570b++;
    }

    /* renamed from: h */
    public final void m23482h() {
        m23480l();
    }

    /* renamed from: i */
    public final void m23483i() {
        if (f22566k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22566k = handler;
            handler.post(f22567l);
            f22566k.postDelayed(f22568m, 200L);
        }
    }

    /* renamed from: j */
    public final void m23484j() {
        m23480l();
        this.f22569a.clear();
        f22565j.post(new fz2(this));
    }
}
