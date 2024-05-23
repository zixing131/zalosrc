package androidx.recyclerview.widget;

import androidx.core.util.C1485g;
import androidx.core.util.InterfaceC1484f;
import androidx.recyclerview.widget.RecyclerView;
import p665y0.C30242d;
import p665y0.C30245g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.c0 */
/* loaded from: classes.dex */
public class C1910c0 {

    /* renamed from: a */
    final C30245g f7972a = new C30245g();

    /* renamed from: b */
    final C30242d f7973b = new C30242d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c0$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: d */
        static InterfaceC1484f f7974d = new C1485g(20);

        /* renamed from: a */
        int f7975a;

        /* renamed from: b */
        RecyclerView.AbstractC1885l.c f7976b;

        /* renamed from: c */
        RecyclerView.AbstractC1885l.c f7977c;

        private a() {
        }

        /* renamed from: a */
        static void m10439a() {
            do {
            } while (f7974d.mo7484b() != null);
        }

        /* renamed from: b */
        static a m10440b() {
            a aVar = (a) f7974d.mo7484b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        /* renamed from: c */
        static void m10441c(a aVar) {
            aVar.f7975a = 0;
            aVar.f7976b = null;
            aVar.f7977c = null;
            f7974d.mo7483a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo9966a(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2);

        /* renamed from: b */
        void mo9967b(RecyclerView.AbstractC1876c0 abstractC1876c0);

        /* renamed from: c */
        void mo9968c(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2);

        /* renamed from: d */
        void mo9969d(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC1885l.c m10422l(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        a aVar;
        RecyclerView.AbstractC1885l.c cVar;
        int m149160f = this.f7972a.m149160f(abstractC1876c0);
        if (m149160f >= 0 && (aVar = (a) this.f7972a.m149167o(m149160f)) != null) {
            int i12 = aVar.f7975a;
            if ((i12 & i11) != 0) {
                int i13 = (~i11) & i12;
                aVar.f7975a = i13;
                if (i11 == 4) {
                    cVar = aVar.f7976b;
                } else if (i11 == 8) {
                    cVar = aVar.f7977c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i13 & 12) == 0) {
                    this.f7972a.m149165l(m149160f);
                    a.m10441c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10423a(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar == null) {
            aVar = a.m10440b();
            this.f7972a.put(abstractC1876c0, aVar);
        }
        aVar.f7975a |= 2;
        aVar.f7976b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10424b(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar == null) {
            aVar = a.m10440b();
            this.f7972a.put(abstractC1876c0, aVar);
        }
        aVar.f7975a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10425c(long j11, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        this.f7973b.m149132j(j11, abstractC1876c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10426d(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar == null) {
            aVar = a.m10440b();
            this.f7972a.put(abstractC1876c0, aVar);
        }
        aVar.f7977c = cVar;
        aVar.f7975a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m10427e(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar == null) {
            aVar = a.m10440b();
            this.f7972a.put(abstractC1876c0, aVar);
        }
        aVar.f7976b = cVar;
        aVar.f7975a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m10428f() {
        this.f7972a.clear();
        this.f7973b.m149126b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC1876c0 m10429g(long j11) {
        return (RecyclerView.AbstractC1876c0) this.f7973b.m149128f(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m10430h(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar != null && (aVar.f7975a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m10431i(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar != null && (aVar.f7975a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m10432j() {
        a.m10439a();
    }

    /* renamed from: k */
    public void m10433k(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10437p(abstractC1876c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC1885l.c m10434m(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        return m10422l(abstractC1876c0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC1885l.c m10435n(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        return m10422l(abstractC1876c0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m10436o(b bVar) {
        for (int size = this.f7972a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) this.f7972a.m149163i(size);
            a aVar = (a) this.f7972a.m149165l(size);
            int i11 = aVar.f7975a;
            if ((i11 & 3) == 3) {
                bVar.mo9967b(abstractC1876c0);
            } else if ((i11 & 1) != 0) {
                RecyclerView.AbstractC1885l.c cVar = aVar.f7976b;
                if (cVar == null) {
                    bVar.mo9967b(abstractC1876c0);
                } else {
                    bVar.mo9968c(abstractC1876c0, cVar, aVar.f7977c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.mo9966a(abstractC1876c0, aVar.f7976b, aVar.f7977c);
            } else if ((i11 & 12) == 12) {
                bVar.mo9969d(abstractC1876c0, aVar.f7976b, aVar.f7977c);
            } else if ((i11 & 4) != 0) {
                bVar.mo9968c(abstractC1876c0, aVar.f7976b, null);
            } else if ((i11 & 8) != 0) {
                bVar.mo9966a(abstractC1876c0, aVar.f7976b, aVar.f7977c);
            }
            a.m10441c(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10437p(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        a aVar = (a) this.f7972a.get(abstractC1876c0);
        if (aVar == null) {
            return;
        }
        aVar.f7975a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m10438q(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        int m149135m = this.f7973b.m149135m() - 1;
        while (true) {
            if (m149135m < 0) {
                break;
            }
            if (abstractC1876c0 == this.f7973b.m149136n(m149135m)) {
                this.f7973b.m149134l(m149135m);
                break;
            }
            m149135m--;
        }
        a aVar = (a) this.f7972a.remove(abstractC1876c0);
        if (aVar != null) {
            a.m10441c(aVar);
        }
    }
}
