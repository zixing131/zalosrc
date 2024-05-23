package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class xx2 extends tx2 {

    /* renamed from: i */
    private static final Pattern f30663i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final vx2 f30664a;

    /* renamed from: b */
    private final ux2 f30665b;

    /* renamed from: d */
    private pz2 f30667d;

    /* renamed from: e */
    private uy2 f30668e;

    /* renamed from: c */
    private final List f30666c = new ArrayList();

    /* renamed from: f */
    private boolean f30669f = false;

    /* renamed from: g */
    private boolean f30670g = false;

    /* renamed from: h */
    private final String f30671h = UUID.randomUUID().toString();

    public xx2(ux2 ux2Var, vx2 vx2Var) {
        this.f30665b = ux2Var;
        this.f30664a = vx2Var;
        m28058k(null);
        if (vx2Var.m27431d() != wx2.HTML && vx2Var.m27431d() != wx2.JAVASCRIPT) {
            this.f30668e = new xy2(vx2Var.m27436i(), null);
        } else {
            this.f30668e = new vy2(vx2Var.m27430a());
        }
        this.f30668e.mo27097j();
        iy2.m23465a().m23468d(this);
        ny2.m25043a().m25046d(this.f30668e.m27088a(), ux2Var.m27087b());
    }

    /* renamed from: k */
    private final void m28058k(View view) {
        this.f30667d = new pz2(view);
    }

    @Override // com.google.android.gms.internal.ads.tx2
    /* renamed from: b */
    public final void mo26793b(View view, zx2 zx2Var, String str) {
        ky2 ky2Var;
        if (!this.f30670g) {
            if (f30663i.matcher("Ad overlay").matches()) {
                Iterator it = this.f30666c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ky2Var = (ky2) it.next();
                        if (ky2Var.m24093b().get() == view) {
                            break;
                        }
                    } else {
                        ky2Var = null;
                        break;
                    }
                }
                if (ky2Var == null) {
                    this.f30666c.add(new ky2(view, zx2Var, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    @Override // com.google.android.gms.internal.ads.tx2
    /* renamed from: c */
    public final void mo26794c() {
        if (this.f30670g) {
            return;
        }
        this.f30667d.clear();
        if (!this.f30670g) {
            this.f30666c.clear();
        }
        this.f30670g = true;
        ny2.m25043a().m25045c(this.f30668e.m27088a());
        iy2.m23465a().m23469e(this);
        this.f30668e.mo27090c();
        this.f30668e = null;
    }

    @Override // com.google.android.gms.internal.ads.tx2
    /* renamed from: d */
    public final void mo26795d(View view) {
        if (this.f30670g || m28059f() == view) {
            return;
        }
        m28058k(view);
        this.f30668e.m27089b();
        Collection<xx2> m23467c = iy2.m23465a().m23467c();
        if (m23467c != null && !m23467c.isEmpty()) {
            for (xx2 xx2Var : m23467c) {
                if (xx2Var != this && xx2Var.m28059f() == view) {
                    xx2Var.f30667d.clear();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tx2
    /* renamed from: e */
    public final void mo26796e() {
        if (this.f30669f) {
            return;
        }
        this.f30669f = true;
        iy2.m23465a().m23470f(this);
        this.f30668e.m27095h(oy2.m25357b().m25358a());
        this.f30668e.mo27093f(this, this.f30664a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final View m28059f() {
        return (View) this.f30667d.get();
    }

    /* renamed from: g */
    public final uy2 m28060g() {
        return this.f30668e;
    }

    /* renamed from: h */
    public final String m28061h() {
        return this.f30671h;
    }

    /* renamed from: i */
    public final List m28062i() {
        return this.f30666c;
    }

    /* renamed from: j */
    public final boolean m28063j() {
        return this.f30669f && !this.f30670g;
    }
}
