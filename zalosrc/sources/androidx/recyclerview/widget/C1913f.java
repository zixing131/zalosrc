package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C1913f {

    /* renamed from: a */
    final b f8000a;

    /* renamed from: b */
    final a f8001b = new a();

    /* renamed from: c */
    final List f8002c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f8003a = 0;

        /* renamed from: b */
        a f8004b;

        a() {
        }

        /* renamed from: c */
        private void m10470c() {
            if (this.f8004b == null) {
                this.f8004b = new a();
            }
        }

        /* renamed from: a */
        void m10471a(int i11) {
            if (i11 >= 64) {
                a aVar = this.f8004b;
                if (aVar != null) {
                    aVar.m10471a(i11 - 64);
                    return;
                }
                return;
            }
            this.f8003a &= ~(1 << i11);
        }

        /* renamed from: b */
        int m10472b(int i11) {
            a aVar = this.f8004b;
            if (aVar == null) {
                if (i11 >= 64) {
                    return Long.bitCount(this.f8003a);
                }
                return Long.bitCount(this.f8003a & ((1 << i11) - 1));
            }
            if (i11 < 64) {
                return Long.bitCount(this.f8003a & ((1 << i11) - 1));
            }
            return aVar.m10472b(i11 - 64) + Long.bitCount(this.f8003a);
        }

        /* renamed from: d */
        boolean m10473d(int i11) {
            if (i11 >= 64) {
                m10470c();
                return this.f8004b.m10473d(i11 - 64);
            }
            if ((this.f8003a & (1 << i11)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        void m10474e(int i11, boolean z11) {
            boolean z12;
            if (i11 >= 64) {
                m10470c();
                this.f8004b.m10474e(i11 - 64, z11);
                return;
            }
            long j11 = this.f8003a;
            if ((Long.MIN_VALUE & j11) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            long j12 = (1 << i11) - 1;
            this.f8003a = ((j11 & (~j12)) << 1) | (j11 & j12);
            if (z11) {
                m10477h(i11);
            } else {
                m10471a(i11);
            }
            if (z12 || this.f8004b != null) {
                m10470c();
                this.f8004b.m10474e(0, z12);
            }
        }

        /* renamed from: f */
        boolean m10475f(int i11) {
            boolean z11;
            if (i11 >= 64) {
                m10470c();
                return this.f8004b.m10475f(i11 - 64);
            }
            long j11 = 1 << i11;
            long j12 = this.f8003a;
            if ((j12 & j11) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j13 = j12 & (~j11);
            this.f8003a = j13;
            long j14 = j11 - 1;
            this.f8003a = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
            a aVar = this.f8004b;
            if (aVar != null) {
                if (aVar.m10473d(0)) {
                    m10477h(63);
                }
                this.f8004b.m10475f(0);
            }
            return z11;
        }

        /* renamed from: g */
        void m10476g() {
            this.f8003a = 0L;
            a aVar = this.f8004b;
            if (aVar != null) {
                aVar.m10476g();
            }
        }

        /* renamed from: h */
        void m10477h(int i11) {
            if (i11 >= 64) {
                m10470c();
                this.f8004b.m10477h(i11 - 64);
            } else {
                this.f8003a |= 1 << i11;
            }
        }

        public String toString() {
            if (this.f8004b == null) {
                return Long.toBinaryString(this.f8003a);
            }
            return this.f8004b.toString() + "xx" + Long.toBinaryString(this.f8003a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        int mo9970a();

        /* renamed from: b */
        View mo9971b(int i11);

        /* renamed from: c */
        void mo9972c(View view);

        /* renamed from: d */
        RecyclerView.AbstractC1876c0 mo9973d(View view);

        /* renamed from: e */
        void mo9974e(int i11);

        /* renamed from: f */
        void mo9975f(View view, int i11);

        /* renamed from: g */
        void mo9976g();

        /* renamed from: h */
        int mo9977h(View view);

        /* renamed from: i */
        void mo9978i(View view);

        /* renamed from: j */
        void mo9979j(int i11);

        /* renamed from: k */
        void mo9980k(View view, int i11, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1913f(b bVar) {
        this.f8000a = bVar;
    }

    /* renamed from: h */
    private int m10450h(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int mo9970a = this.f8000a.mo9970a();
        int i12 = i11;
        while (i12 < mo9970a) {
            int m10472b = i11 - (i12 - this.f8001b.m10472b(i12));
            if (m10472b == 0) {
                while (this.f8001b.m10473d(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += m10472b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m10451l(View view) {
        this.f8002c.add(view);
        this.f8000a.mo9972c(view);
    }

    /* renamed from: t */
    private boolean m10452t(View view) {
        if (this.f8002c.remove(view)) {
            this.f8000a.mo9978i(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10453a(View view, int i11, boolean z11) {
        int m10450h;
        if (i11 < 0) {
            m10450h = this.f8000a.mo9970a();
        } else {
            m10450h = m10450h(i11);
        }
        this.f8001b.m10474e(m10450h, z11);
        if (z11) {
            m10451l(view);
        }
        this.f8000a.mo9975f(view, m10450h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10454b(View view, boolean z11) {
        m10453a(view, -1, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10455c(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        int m10450h;
        if (i11 < 0) {
            m10450h = this.f8000a.mo9970a();
        } else {
            m10450h = m10450h(i11);
        }
        this.f8001b.m10474e(m10450h, z11);
        if (z11) {
            m10451l(view);
        }
        this.f8000a.mo9980k(view, m10450h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10456d(int i11) {
        int m10450h = m10450h(i11);
        this.f8001b.m10475f(m10450h);
        this.f8000a.mo9974e(m10450h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m10457e(int i11) {
        int size = this.f8002c.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f8002c.get(i12);
            RecyclerView.AbstractC1876c0 mo9973d = this.f8000a.mo9973d(view);
            if (mo9973d.m9932F() == i11 && !mo9973d.m9939O() && !mo9973d.m9941Q()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m10458f(int i11) {
        return this.f8000a.mo9971b(m10450h(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m10459g() {
        return this.f8000a.mo9970a() - this.f8002c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m10460i(int i11) {
        return this.f8000a.mo9971b(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m10461j() {
        return this.f8000a.mo9970a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m10462k(View view) {
        int mo9977h = this.f8000a.mo9977h(view);
        if (mo9977h >= 0) {
            this.f8001b.m10477h(mo9977h);
            m10451l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m10463m(View view) {
        int mo9977h = this.f8000a.mo9977h(view);
        if (mo9977h == -1 || this.f8001b.m10473d(mo9977h)) {
            return -1;
        }
        return mo9977h - this.f8001b.m10472b(mo9977h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m10464n(View view) {
        return this.f8002c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m10465o() {
        this.f8001b.m10476g();
        for (int size = this.f8002c.size() - 1; size >= 0; size--) {
            this.f8000a.mo9978i((View) this.f8002c.get(size));
            this.f8002c.remove(size);
        }
        this.f8000a.mo9976g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10466p(View view) {
        int mo9977h = this.f8000a.mo9977h(view);
        if (mo9977h < 0) {
            return;
        }
        if (this.f8001b.m10475f(mo9977h)) {
            m10452t(view);
        }
        this.f8000a.mo9979j(mo9977h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m10467q(int i11) {
        int m10450h = m10450h(i11);
        View mo9971b = this.f8000a.mo9971b(m10450h);
        if (mo9971b == null) {
            return;
        }
        if (this.f8001b.m10475f(m10450h)) {
            m10452t(mo9971b);
        }
        this.f8000a.mo9979j(m10450h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m10468r(View view) {
        int mo9977h = this.f8000a.mo9977h(view);
        if (mo9977h == -1) {
            m10452t(view);
            return true;
        }
        if (this.f8001b.m10473d(mo9977h)) {
            this.f8001b.m10475f(mo9977h);
            m10452t(view);
            this.f8000a.mo9979j(mo9977h);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m10469s(View view) {
        int mo9977h = this.f8000a.mo9977h(view);
        if (mo9977h >= 0) {
            if (this.f8001b.m10473d(mo9977h)) {
                this.f8001b.m10471a(mo9977h);
                m10452t(view);
                return;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f8001b.toString() + ", hidden list:" + this.f8002c.size();
    }
}
