package p448qh;

import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import gg0.AbstractC19444a;
import hf0.C20040b;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: qh.e */
/* loaded from: classes3.dex */
public abstract class AbstractC25280e {

    /* renamed from: c */
    protected int f121249c;

    /* renamed from: d */
    protected String f121250d;

    /* renamed from: a */
    private final ArrayList f121247a = new ArrayList();

    /* renamed from: b */
    private final SparseIntArray f121248b = new SparseIntArray();

    /* renamed from: e */
    protected int f121251e = -1;

    /* renamed from: f */
    boolean f121252f = false;

    /* renamed from: g */
    int f121253g = 0;

    /* renamed from: h */
    boolean f121254h = false;

    /* renamed from: i */
    protected DataSetObserver f121255i = new a();

    /* renamed from: j */
    protected RecyclerView.AbstractC1882i f121256j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.e$a */
    /* loaded from: classes3.dex */
    public class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            AbstractC25280e.this.m130842t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.e$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1882i {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            super.mo10026a();
            AbstractC25280e.this.m130842t();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: b */
        public void mo10027b(int i11, int i12) {
            super.mo10027b(i11, i12);
            AbstractC25280e.this.m130842t();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: c */
        public void mo10028c(int i11, int i12, Object obj) {
            super.mo10028c(i11, i12, obj);
            AbstractC25280e.this.m130842t();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
            super.mo10029d(i11, i12);
            AbstractC25280e.this.m130842t();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: e */
        public void mo10030e(int i11, int i12, int i13) {
            super.mo10030e(i11, i12, i13);
            AbstractC25280e.this.m130842t();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: f */
        public void mo10031f(int i11, int i12) {
            super.mo10031f(i11, i12);
            AbstractC25280e.this.m130842t();
        }
    }

    /* renamed from: qh.e$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo130822a(List list, SparseIntArray sparseIntArray);
    }

    public AbstractC25280e(int i11, String str) {
        this.f121249c = i11;
        this.f121250d = str;
        AbstractC19444a.m101694b(new Runnable() { // from class: qh.b
            public /* synthetic */ RunnableC25277b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25280e.this.m130842t();
            }
        }, 500L);
    }

    /* renamed from: e */
    public static void m130826e(List list, int i11) {
        int i12;
        if (list == null) {
            return;
        }
        try {
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i13 = 0; i13 < list.size(); i13++) {
                ZMediaPlayer.HLSItem hLSItem = (ZMediaPlayer.HLSItem) list.get(i13);
                if (i13 == i11) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i14 = hLSItem.mSession;
                int i15 = sparseIntArray.get(i14, -1) + 1;
                sparseIntArray.put(i14, i15);
                ZMediaPlayer.precache(ZMediaPlayerSettings.getVideoConfig(hLSItem.mSession), hLSItem.mUrl, hLSItem.mUid, i15, hLSItem.mSession, i12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    private void m130827h() {
        try {
            synchronized (this.f121247a) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m130828i() {
        m130836n(this.f121253g);
    }

    /* renamed from: j */
    public /* synthetic */ void m130829j(int i11, int i12, C20040b.b bVar, int i13) {
        synchronized (this.f121247a) {
            try {
                if (!TextUtils.isEmpty(this.f121250d)) {
                    int i14 = this.f121248b.get(i13, -1);
                    if (i14 >= 0) {
                        m130836n(i14);
                        return;
                    }
                    if (bVar == C20040b.b.f98514q) {
                        int i15 = (i11 + i12) - 1;
                        while (true) {
                            if (i15 < 0) {
                                break;
                            }
                            int i16 = this.f121248b.get(i15, -1);
                            if (i16 >= 0) {
                                i14 = i16;
                                break;
                            }
                            i15--;
                        }
                    } else if (bVar == C20040b.b.f98513p) {
                        int mo130832f = mo130832f();
                        while (true) {
                            if (i11 >= mo130832f) {
                                break;
                            }
                            int i17 = this.f121248b.get(i11, -1);
                            if (i17 >= 0) {
                                i14 = i17;
                                break;
                            }
                            i11++;
                        }
                    }
                    m130836n(i14);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m130830k(List list, SparseIntArray sparseIntArray) {
        try {
            synchronized (this.f121247a) {
                try {
                    this.f121247a.clear();
                    this.f121248b.clear();
                    this.f121247a.addAll(list);
                    for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                        this.f121248b.put(sparseIntArray.keyAt(i11), sparseIntArray.valueAt(i11));
                    }
                    m130827h();
                    if (!this.f121252f) {
                        m130836n(this.f121253g);
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    protected abstract void mo130831d(c cVar);

    /* renamed from: f */
    public abstract int mo130832f();

    /* renamed from: g */
    public abstract RecyclerView.AbstractC1880g mo130833g();

    /* renamed from: l */
    public void m130834l() {
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: qh.a
            public /* synthetic */ RunnableC25276a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25280e.this.m130828i();
            }
        });
    }

    /* renamed from: m */
    public void m130835m(int i11, int i12, C20040b.b bVar, int i13) {
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: qh.d

            /* renamed from: q */
            public final /* synthetic */ int f121243q;

            /* renamed from: r */
            public final /* synthetic */ int f121244r;

            /* renamed from: s */
            public final /* synthetic */ C20040b.b f121245s;

            /* renamed from: t */
            public final /* synthetic */ int f121246t;

            public /* synthetic */ RunnableC25279d(int i112, int i122, C20040b.b bVar2, int i132) {
                r2 = i112;
                r3 = i122;
                r4 = bVar2;
                r5 = i132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25280e.this.m130829j(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: n */
    void m130836n(int i11) {
        try {
            this.f121252f = true;
            this.f121253g = i11;
            synchronized (this.f121247a) {
                try {
                    if (!TextUtils.isEmpty(this.f121250d)) {
                        int i12 = 0;
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        if (!this.f121247a.isEmpty()) {
                            int size = this.f121247a.size() - 1;
                            int i13 = this.f121251e;
                            if (i13 > 0 && i13 < this.f121247a.size()) {
                                int i14 = this.f121251e;
                                int i15 = i11 - (i14 / 2);
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                size = (i14 + i15) - 1;
                                if (size > this.f121247a.size() - 1) {
                                    size = this.f121247a.size() - 1;
                                }
                                i11 -= i15;
                                i12 = i15;
                                if (i11 < 0) {
                                    i11 = 0;
                                }
                            }
                            m130826e(this.f121247a.subList(i12, size + 1), i11);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    public void m130837o() {
        try {
            if (!this.f121254h && mo130833g() != null && mo130833g().m10006n()) {
                mo130833g().m9998I(this.f121256j);
                this.f121254h = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public void mo130838p() {
        try {
            m130841s();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: q */
    public void m130839q(int i11) {
        this.f121251e = i11;
    }

    /* renamed from: r */
    public void m130840r(String str) {
        this.f121250d = str;
    }

    /* renamed from: s */
    public void m130841s() {
        try {
            if (this.f121254h && mo130833g() != null) {
                mo130833g().m10000K(this.f121256j);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t */
    public final void m130842t() {
        m130837o();
        mo130831d(new c() { // from class: qh.c
            public /* synthetic */ C25278c() {
            }

            @Override // p448qh.AbstractC25280e.c
            /* renamed from: a */
            public final void mo130822a(List list, SparseIntArray sparseIntArray) {
                AbstractC25280e.this.m130830k(list, sparseIntArray);
            }
        });
    }
}
