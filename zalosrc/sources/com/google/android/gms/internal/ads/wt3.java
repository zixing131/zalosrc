package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wt3 implements kw3 {

    /* renamed from: a */
    private final vt3 f30100a;

    /* renamed from: b */
    private int f30101b;

    /* renamed from: c */
    private int f30102c;

    /* renamed from: d */
    private int f30103d = 0;

    private wt3(vt3 vt3Var) {
        dv3.m21551f(vt3Var, "input");
        this.f30100a = vt3Var;
        vt3Var.f29486c = this;
    }

    /* renamed from: A */
    private static final void m27717A(int i11) {
        if ((i11 & 7) == 0) {
        } else {
            throw zzgrq.m28823g();
        }
    }

    /* renamed from: B */
    public static wt3 m27718B(vt3 vt3Var) {
        wt3 wt3Var = vt3Var.f29486c;
        if (wt3Var != null) {
            return wt3Var;
        }
        return new wt3(vt3Var);
    }

    /* renamed from: v */
    private final Object m27719v(tw3 tw3Var, gu3 gu3Var) {
        int i11 = this.f30102c;
        this.f30102c = ((this.f30101b >>> 3) << 3) | 4;
        try {
            Object zze = tw3Var.zze();
            tw3Var.mo21230e(zze, this, gu3Var);
            tw3Var.mo21226a(zze);
            if (this.f30101b == this.f30102c) {
                return zze;
            }
            throw zzgrq.m28823g();
        } finally {
            this.f30102c = i11;
        }
    }

    /* renamed from: w */
    private final Object m27720w(tw3 tw3Var, gu3 gu3Var) {
        int mo25282s = this.f30100a.mo25282s();
        vt3 vt3Var = this.f30100a;
        if (vt3Var.f29484a < vt3Var.f29485b) {
            int mo25275l = vt3Var.mo25275l(mo25282s);
            Object zze = tw3Var.zze();
            this.f30100a.f29484a++;
            tw3Var.mo21230e(zze, this, gu3Var);
            tw3Var.mo21226a(zze);
            this.f30100a.mo25260B(0);
            r5.f29484a--;
            this.f30100a.mo25268a(mo25275l);
            return zze;
        }
        throw new zzgrq("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: x */
    private final void m27721x(int i11) {
        if (this.f30100a.mo25274k() == i11) {
        } else {
            throw zzgrq.m28825j();
        }
    }

    /* renamed from: y */
    private final void m27722y(int i11) {
        if ((this.f30101b & 7) == i11) {
        } else {
            throw zzgrq.m28817a();
        }
    }

    /* renamed from: z */
    private static final void m27723z(int i11) {
        if ((i11 & 3) == 0) {
        } else {
            throw zzgrq.m28823g();
        }
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: a */
    public final String mo24054a() {
        m27722y(2);
        return this.f30100a.mo25259A();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: b */
    public final void mo24055b(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        uu3Var.mo27068f(this.f30100a.mo25276m());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                uu3Var.mo27068f(this.f30100a.mo25276m());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Integer.valueOf(this.f30100a.mo25276m()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Integer.valueOf(this.f30100a.mo25276m()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: c */
    public final void mo24056c(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        pv3Var.m25559j(this.f30100a.mo25284u());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                pv3Var.m25559j(this.f30100a.mo25284u());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Long.valueOf(this.f30100a.mo25284u()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Long.valueOf(this.f30100a.mo25284u()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: d */
    public final void mo24057d(List list) {
        int mo25281r;
        if (list instanceof du3) {
            int i11 = this.f30101b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzgrq.m28817a();
                }
                m27717A(this.f30100a.mo25282s());
                this.f30100a.mo25274k();
                this.f30100a.mo25272i();
                throw null;
            }
            this.f30100a.mo25272i();
            throw null;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int mo25282s = this.f30100a.mo25282s();
                m27717A(mo25282s);
                int mo25274k = this.f30100a.mo25274k() + mo25282s;
                do {
                    list.add(Double.valueOf(this.f30100a.mo25272i()));
                } while (this.f30100a.mo25274k() < mo25274k);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Double.valueOf(this.f30100a.mo25272i()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: e */
    public final void mo24058e(List list) {
        int mo25281r;
        if ((this.f30101b & 7) != 2) {
            throw zzgrq.m28817a();
        }
        do {
            list.add(zzp());
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: f */
    public final void mo24059f(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        uu3Var.mo27068f(this.f30100a.mo25278o());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                uu3Var.mo27068f(this.f30100a.mo25278o());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Integer.valueOf(this.f30100a.mo25278o()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Integer.valueOf(this.f30100a.mo25278o()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: g */
    public final void mo24060g(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int mo25282s = this.f30100a.mo25282s();
                    m27717A(mo25282s);
                    int mo25274k = this.f30100a.mo25274k() + mo25282s;
                    do {
                        pv3Var.m25559j(this.f30100a.mo25285v());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                pv3Var.m25559j(this.f30100a.mo25285v());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int mo25282s2 = this.f30100a.mo25282s();
                m27717A(mo25282s2);
                int mo25274k2 = this.f30100a.mo25274k() + mo25282s2;
                do {
                    list.add(Long.valueOf(this.f30100a.mo25285v()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Long.valueOf(this.f30100a.mo25285v()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: h */
    public final void mo24061h(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzgrq.m28817a();
                }
                do {
                    uu3Var.mo27068f(this.f30100a.mo25279p());
                    if (this.f30100a.mo25269b()) {
                        return;
                    } else {
                        mo25281r2 = this.f30100a.mo25281r();
                    }
                } while (mo25281r2 == this.f30101b);
                this.f30103d = mo25281r2;
                return;
            }
            int mo25282s = this.f30100a.mo25282s();
            m27723z(mo25282s);
            int mo25274k = this.f30100a.mo25274k() + mo25282s;
            do {
                uu3Var.mo27068f(this.f30100a.mo25279p());
            } while (this.f30100a.mo25274k() < mo25274k);
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                throw zzgrq.m28817a();
            }
            do {
                list.add(Integer.valueOf(this.f30100a.mo25279p()));
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r = this.f30100a.mo25281r();
                }
            } while (mo25281r == this.f30101b);
            this.f30103d = mo25281r;
            return;
        }
        int mo25282s2 = this.f30100a.mo25282s();
        m27723z(mo25282s2);
        int mo25274k2 = this.f30100a.mo25274k() + mo25282s2;
        do {
            list.add(Integer.valueOf(this.f30100a.mo25279p()));
        } while (this.f30100a.mo25274k() < mo25274k2);
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: i */
    public final void mo24062i(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzgrq.m28817a();
                }
                do {
                    uu3Var.mo27068f(this.f30100a.mo25277n());
                    if (this.f30100a.mo25269b()) {
                        return;
                    } else {
                        mo25281r2 = this.f30100a.mo25281r();
                    }
                } while (mo25281r2 == this.f30101b);
                this.f30103d = mo25281r2;
                return;
            }
            int mo25282s = this.f30100a.mo25282s();
            m27723z(mo25282s);
            int mo25274k = this.f30100a.mo25274k() + mo25282s;
            do {
                uu3Var.mo27068f(this.f30100a.mo25277n());
            } while (this.f30100a.mo25274k() < mo25274k);
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                throw zzgrq.m28817a();
            }
            do {
                list.add(Integer.valueOf(this.f30100a.mo25277n()));
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r = this.f30100a.mo25281r();
                }
            } while (mo25281r == this.f30101b);
            this.f30103d = mo25281r;
            return;
        }
        int mo25282s2 = this.f30100a.mo25282s();
        m27723z(mo25282s2);
        int mo25274k2 = this.f30100a.mo25274k() + mo25282s2;
        do {
            list.add(Integer.valueOf(this.f30100a.mo25277n()));
        } while (this.f30100a.mo25274k() < mo25274k2);
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: j */
    public final void mo24063j(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int mo25282s = this.f30100a.mo25282s();
                    m27717A(mo25282s);
                    int mo25274k = this.f30100a.mo25274k() + mo25282s;
                    do {
                        pv3Var.m25559j(this.f30100a.mo25283t());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                pv3Var.m25559j(this.f30100a.mo25283t());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int mo25282s2 = this.f30100a.mo25282s();
                m27717A(mo25282s2);
                int mo25274k2 = this.f30100a.mo25274k() + mo25282s2;
                do {
                    list.add(Long.valueOf(this.f30100a.mo25283t()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Long.valueOf(this.f30100a.mo25283t()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: k */
    public final void mo24064k(List list) {
        int mo25281r;
        if (list instanceof at3) {
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgrq.m28817a();
                }
                this.f30100a.mo25282s();
                this.f30100a.mo25274k();
                this.f30100a.mo25270c();
                throw null;
            }
            this.f30100a.mo25270c();
            throw null;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Boolean.valueOf(this.f30100a.mo25270c()));
                } while (this.f30100a.mo25274k() < mo25274k);
                m27721x(mo25274k);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Boolean.valueOf(this.f30100a.mo25270c()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: l */
    public final void mo24065l(List list) {
        int mo25281r;
        if (list instanceof mu3) {
            int i11 = this.f30101b & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzgrq.m28817a();
                }
                this.f30100a.mo25273j();
                throw null;
            }
            m27723z(this.f30100a.mo25282s());
            this.f30100a.mo25274k();
            this.f30100a.mo25273j();
            throw null;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                throw zzgrq.m28817a();
            }
            do {
                list.add(Float.valueOf(this.f30100a.mo25273j()));
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r = this.f30100a.mo25281r();
                }
            } while (mo25281r == this.f30101b);
            this.f30103d = mo25281r;
            return;
        }
        int mo25282s = this.f30100a.mo25282s();
        m27723z(mo25282s);
        int mo25274k = this.f30100a.mo25274k() + mo25282s;
        do {
            list.add(Float.valueOf(this.f30100a.mo25273j()));
        } while (this.f30100a.mo25274k() < mo25274k);
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: m */
    public final Object mo24066m(tw3 tw3Var, gu3 gu3Var) {
        m27722y(2);
        return m27720w(tw3Var, gu3Var);
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: n */
    public final void mo24067n(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        pv3Var.m25559j(this.f30100a.mo25287x());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                pv3Var.m25559j(this.f30100a.mo25287x());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Long.valueOf(this.f30100a.mo25287x()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Long.valueOf(this.f30100a.mo25287x()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: o */
    public final Object mo24068o(tw3 tw3Var, gu3 gu3Var) {
        m27722y(3);
        return m27719v(tw3Var, gu3Var);
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: p */
    public final void mo24069p(List list, tw3 tw3Var, gu3 gu3Var) {
        int mo25281r;
        int i11 = this.f30101b;
        if ((i11 & 7) != 3) {
            throw zzgrq.m28817a();
        }
        do {
            list.add(m27719v(tw3Var, gu3Var));
            if (!this.f30100a.mo25269b() && this.f30103d == 0) {
                mo25281r = this.f30100a.mo25281r();
            } else {
                return;
            }
        } while (mo25281r == i11);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: q */
    public final void mo24070q(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        pv3Var.m25559j(this.f30100a.mo25286w());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                pv3Var.m25559j(this.f30100a.mo25286w());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Long.valueOf(this.f30100a.mo25286w()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Long.valueOf(this.f30100a.mo25286w()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: r */
    public final void mo24071r(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        uu3Var.mo27068f(this.f30100a.mo25280q());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                uu3Var.mo27068f(this.f30100a.mo25280q());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Integer.valueOf(this.f30100a.mo25280q()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Integer.valueOf(this.f30100a.mo25280q()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: s */
    public final void mo24072s(List list) {
        int mo25281r;
        int mo25281r2;
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            int i11 = this.f30101b & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    int mo25274k = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                    do {
                        uu3Var.mo27068f(this.f30100a.mo25282s());
                    } while (this.f30100a.mo25274k() < mo25274k);
                    m27721x(mo25274k);
                    return;
                }
                throw zzgrq.m28817a();
            }
            do {
                uu3Var.mo27068f(this.f30100a.mo25282s());
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r2 = this.f30100a.mo25281r();
                }
            } while (mo25281r2 == this.f30101b);
            this.f30103d = mo25281r2;
            return;
        }
        int i12 = this.f30101b & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int mo25274k2 = this.f30100a.mo25274k() + this.f30100a.mo25282s();
                do {
                    list.add(Integer.valueOf(this.f30100a.mo25282s()));
                } while (this.f30100a.mo25274k() < mo25274k2);
                m27721x(mo25274k2);
                return;
            }
            throw zzgrq.m28817a();
        }
        do {
            list.add(Integer.valueOf(this.f30100a.mo25282s()));
            if (this.f30100a.mo25269b()) {
                return;
            } else {
                mo25281r = this.f30100a.mo25281r();
            }
        } while (mo25281r == this.f30101b);
        this.f30103d = mo25281r;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    /* renamed from: t */
    public final void mo24073t(List list, tw3 tw3Var, gu3 gu3Var) {
        int mo25281r;
        int i11 = this.f30101b;
        if ((i11 & 7) != 2) {
            throw zzgrq.m28817a();
        }
        do {
            list.add(m27720w(tw3Var, gu3Var));
            if (!this.f30100a.mo25269b() && this.f30103d == 0) {
                mo25281r = this.f30100a.mo25281r();
            } else {
                return;
            }
        } while (mo25281r == i11);
        this.f30103d = mo25281r;
    }

    /* renamed from: u */
    public final void m27724u(List list, boolean z11) {
        String zzt;
        int mo25281r;
        int mo25281r2;
        if ((this.f30101b & 7) == 2) {
            if ((list instanceof hv3) && !z11) {
                hv3 hv3Var = (hv3) list;
                do {
                    hv3Var.mo21565R(zzp());
                    if (this.f30100a.mo25269b()) {
                        return;
                    } else {
                        mo25281r2 = this.f30100a.mo25281r();
                    }
                } while (mo25281r2 == this.f30101b);
                this.f30103d = mo25281r2;
                return;
            }
            do {
                if (z11) {
                    zzt = mo24054a();
                } else {
                    zzt = zzt();
                }
                list.add(zzt);
                if (this.f30100a.mo25269b()) {
                    return;
                } else {
                    mo25281r = this.f30100a.mo25281r();
                }
            } while (mo25281r == this.f30101b);
            this.f30103d = mo25281r;
            return;
        }
        throw zzgrq.m28817a();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final boolean zzN() {
        m27722y(0);
        return this.f30100a.mo25270c();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final boolean zzO() {
        int i11;
        if (!this.f30100a.mo25269b() && (i11 = this.f30101b) != this.f30102c) {
            return this.f30100a.mo25271d(i11);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final double zza() {
        m27722y(1);
        return this.f30100a.mo25272i();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final float zzb() {
        m27722y(5);
        return this.f30100a.mo25273j();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzc() {
        int i11 = this.f30103d;
        if (i11 != 0) {
            this.f30101b = i11;
            this.f30103d = 0;
        } else {
            i11 = this.f30100a.mo25281r();
            this.f30101b = i11;
        }
        if (i11 != 0 && i11 != this.f30102c) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzd() {
        return this.f30101b;
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zze() {
        m27722y(0);
        return this.f30100a.mo25276m();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzf() {
        m27722y(5);
        return this.f30100a.mo25277n();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzg() {
        m27722y(0);
        return this.f30100a.mo25278o();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzh() {
        m27722y(5);
        return this.f30100a.mo25279p();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzi() {
        m27722y(0);
        return this.f30100a.mo25280q();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final int zzj() {
        m27722y(0);
        return this.f30100a.mo25282s();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final long zzk() {
        m27722y(1);
        return this.f30100a.mo25283t();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final long zzl() {
        m27722y(0);
        return this.f30100a.mo25284u();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final long zzm() {
        m27722y(1);
        return this.f30100a.mo25285v();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final long zzn() {
        m27722y(0);
        return this.f30100a.mo25286w();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final long zzo() {
        m27722y(0);
        return this.f30100a.mo25287x();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final mt3 zzp() {
        m27722y(2);
        return this.f30100a.mo25288y();
    }

    @Override // com.google.android.gms.internal.ads.kw3
    public final String zzt() {
        m27722y(2);
        return this.f30100a.mo25289z();
    }
}
