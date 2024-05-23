package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.b0 */
/* loaded from: classes.dex */
class C1908b0 {

    /* renamed from: a */
    final b f7957a;

    /* renamed from: b */
    a f7958b = new a();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        int f7959a = 0;

        /* renamed from: b */
        int f7960b;

        /* renamed from: c */
        int f7961c;

        /* renamed from: d */
        int f7962d;

        /* renamed from: e */
        int f7963e;

        a() {
        }

        /* renamed from: a */
        void m10412a(int i11) {
            this.f7959a = i11 | this.f7959a;
        }

        /* renamed from: b */
        boolean m10413b() {
            int i11 = this.f7959a;
            if ((i11 & 7) != 0 && (i11 & m10414c(this.f7962d, this.f7960b)) == 0) {
                return false;
            }
            int i12 = this.f7959a;
            if ((i12 & 112) != 0 && (i12 & (m10414c(this.f7962d, this.f7961c) << 4)) == 0) {
                return false;
            }
            int i13 = this.f7959a;
            if ((i13 & 1792) != 0 && (i13 & (m10414c(this.f7963e, this.f7960b) << 8)) == 0) {
                return false;
            }
            int i14 = this.f7959a;
            if ((i14 & 28672) != 0 && (i14 & (m10414c(this.f7963e, this.f7961c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        int m10414c(int i11, int i12) {
            if (i11 > i12) {
                return 1;
            }
            return i11 == i12 ? 2 : 4;
        }

        /* renamed from: d */
        void m10415d() {
            this.f7959a = 0;
        }

        /* renamed from: e */
        void m10416e(int i11, int i12, int i13, int i14) {
            this.f7960b = i11;
            this.f7961c = i12;
            this.f7962d = i13;
            this.f7963e = i14;
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$b */
    /* loaded from: classes2.dex */
    interface b {
        /* renamed from: a */
        int mo10167a(View view);

        /* renamed from: b */
        View mo10168b(int i11);

        /* renamed from: c */
        int mo10169c();

        /* renamed from: d */
        int mo10170d();

        /* renamed from: e */
        int mo10171e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1908b0(b bVar) {
        this.f7957a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m10410a(int i11, int i12, int i13, int i14) {
        int i15;
        int mo10169c = this.f7957a.mo10169c();
        int mo10170d = this.f7957a.mo10170d();
        if (i12 > i11) {
            i15 = 1;
        } else {
            i15 = -1;
        }
        View view = null;
        while (i11 != i12) {
            View mo10168b = this.f7957a.mo10168b(i11);
            this.f7958b.m10416e(mo10169c, mo10170d, this.f7957a.mo10167a(mo10168b), this.f7957a.mo10171e(mo10168b));
            if (i13 != 0) {
                this.f7958b.m10415d();
                this.f7958b.m10412a(i13);
                if (this.f7958b.m10413b()) {
                    return mo10168b;
                }
            }
            if (i14 != 0) {
                this.f7958b.m10415d();
                this.f7958b.m10412a(i14);
                if (this.f7958b.m10413b()) {
                    view = mo10168b;
                }
            }
            i11 += i15;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m10411b(View view, int i11) {
        this.f7958b.m10416e(this.f7957a.mo10169c(), this.f7957a.mo10170d(), this.f7957a.mo10167a(view), this.f7957a.mo10171e(view));
        if (i11 != 0) {
            this.f7958b.m10415d();
            this.f7958b.m10412a(i11);
            return this.f7958b.m10413b();
        }
        return false;
    }
}
