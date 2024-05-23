package w50;

import dj.C17945a0;
import fg0.ThreadFactoryC18928a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import me0.C23055e5;

/* renamed from: w50.b */
/* loaded from: classes5.dex */
public class C28770b {

    /* renamed from: e */
    private static final BlockingQueue f133331e;

    /* renamed from: f */
    private static final Map f133332f;

    /* renamed from: g */
    private static final ExecutorService f133333g;

    /* renamed from: a */
    private boolean f133334a;

    /* renamed from: b */
    private boolean f133335b;

    /* renamed from: c */
    private boolean f133336c;

    /* renamed from: d */
    private boolean f133337d;

    /* renamed from: w50.b$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: p */
        void mo61097p(C17945a0 c17945a0, boolean z11);
    }

    /* renamed from: w50.b$b */
    /* loaded from: classes5.dex */
    public static class b implements Runnable {

        /* renamed from: p */
        C28770b f133338p;

        /* renamed from: q */
        public C17945a0 f133339q;

        /* renamed from: r */
        public int f133340r;

        /* renamed from: s */
        a f133341s;

        /* renamed from: t */
        int f133342t;

        public b(C28770b c28770b, C17945a0 c17945a0, int i11, a aVar) {
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z11;
            boolean z12;
            boolean z13;
            this.f133338p = c28770b;
            this.f133339q = c17945a0;
            this.f133340r = i11;
            this.f133341s = aVar;
            int i16 = this.f133342t;
            if ((i11 & 1) != 0 && c28770b.f133334a) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i17 = i16 | i12;
            this.f133342t = i17;
            if ((this.f133340r & 2) != 0 && c28770b.f133335b) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            int i18 = i17 | i13;
            this.f133342t = i18;
            if ((this.f133340r & 4) != 0 && c28770b.f133336c) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            int i19 = i18 | i14;
            this.f133342t = i19;
            if ((this.f133340r & 8) != 0 && c28770b.f133337d) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            int i21 = i19 | i15;
            this.f133342t = i21;
            if ((i21 & 1) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c28770b.f133334a = z11;
            if ((this.f133342t & 2) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            c28770b.f133335b = z12;
            if ((this.f133342t & 4) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            c28770b.f133336c = z13;
            c28770b.f133337d = (this.f133342t & 8) != 0;
        }

        /* renamed from: a */
        private void m143927a(int i11) {
            boolean z11;
            synchronized (C28770b.f133332f) {
                try {
                    if (this.f133341s != null) {
                        if (((b) C28770b.f133332f.get(this.f133339q)) == this) {
                            C28770b.f133332f.remove(this.f133339q);
                        } else {
                            this.f133341s = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a aVar = this.f133341s;
            if (aVar != null) {
                C17945a0 c17945a0 = this.f133339q;
                if (i11 != this.f133342t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar.mo61097p(c17945a0, z11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int i11;
            try {
                char c11 = 0;
                if ((this.f133340r & 1) != 0) {
                    this.f133338p.f133334a = AbstractC23041d2.m118194A(this.f133339q.m94983Q3());
                    i11 = this.f133338p.f133334a;
                } else {
                    i11 = 0;
                }
                char c12 = 2;
                int i12 = i11;
                if ((this.f133340r & 2) != 0) {
                    this.f133338p.f133335b = C23055e5.m118271f();
                    if (!this.f133338p.f133335b) {
                        c12 = 0;
                    }
                    i12 = (i11 == true ? 1 : 0) | c12;
                }
                char c13 = 4;
                int i13 = i12;
                if ((this.f133340r & 4) != 0) {
                    this.f133338p.f133336c = AbstractC23238v2.m119727l();
                    if (!this.f133338p.f133336c) {
                        c13 = 0;
                    }
                    i13 = (i12 == true ? 1 : 0) | c13;
                }
                int i14 = i13;
                if ((this.f133340r & 8) != 0) {
                    this.f133339q.m95166j1(this.f133338p);
                    this.f133338p.f133337d = this.f133339q.m94917I7();
                    if (this.f133338p.f133337d) {
                        c11 = '\b';
                    }
                    i14 = (i13 == true ? 1 : 0) | c11;
                }
                m143927a(i14);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f133331e = linkedBlockingQueue;
        f133332f = Collections.synchronizedMap(new HashMap());
        f133333g = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, new ThreadFactoryC18928a("MessageExternalStates"));
    }

    public C28770b() {
        m143923p();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28770b)) {
            return false;
        }
        C28770b c28770b = (C28770b) obj;
        if (this.f133334a == c28770b.f133334a && this.f133335b == c28770b.f133335b && this.f133336c == c28770b.f133336c && this.f133337d == c28770b.f133337d) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m143917j(C28770b c28770b) {
        if (c28770b != null) {
            this.f133335b = c28770b.f133335b;
            this.f133334a = c28770b.f133334a;
            this.f133336c = c28770b.f133336c;
            this.f133337d = c28770b.f133337d;
            return;
        }
        m143923p();
    }

    /* renamed from: k */
    public boolean m143918k() {
        return this.f133334a;
    }

    /* renamed from: l */
    public boolean m143919l() {
        return this.f133335b;
    }

    /* renamed from: m */
    public boolean m143920m() {
        return this.f133337d;
    }

    /* renamed from: n */
    public boolean m143921n() {
        return this.f133336c;
    }

    /* renamed from: o */
    public void m143922o(C17945a0 c17945a0) {
    }

    /* renamed from: p */
    public void m143923p() {
        this.f133334a = true;
        this.f133335b = true;
        this.f133336c = true;
        this.f133337d = true;
    }

    /* renamed from: q */
    public void m143924q(C17945a0 c17945a0, int i11, a aVar) {
        if (c17945a0 != null && i11 != 0 && aVar != null) {
            try {
                Map map = f133332f;
                synchronized (map) {
                    try {
                        b bVar = (b) map.get(c17945a0);
                        if (bVar != null) {
                            if (bVar.f133340r != i11) {
                                map.remove(c17945a0);
                                f133331e.remove(bVar);
                                bVar.f133341s = null;
                                bVar = null;
                            } else {
                                bVar.f133341s = aVar;
                            }
                        }
                        if (bVar == null) {
                            b bVar2 = new b(this, c17945a0, i11, aVar);
                            map.put(c17945a0, bVar2);
                            f133333g.execute(bVar2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: r */
    public void m143925r(boolean z11) {
        this.f133334a = z11;
    }

    /* renamed from: s */
    public void m143926s(boolean z11) {
        this.f133337d = z11;
    }
}
