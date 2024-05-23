package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.g */
/* loaded from: classes2.dex */
public class C1339g {

    /* renamed from: a */
    private final b f5938a;

    /* renamed from: androidx.core.app.g$a */
    /* loaded from: classes2.dex */
    private static class a extends b {

        /* renamed from: e */
        private static HandlerThread f5939e;

        /* renamed from: f */
        private static Handler f5940f;

        /* renamed from: a */
        int f5941a;

        /* renamed from: b */
        SparseIntArray[] f5942b = new SparseIntArray[9];

        /* renamed from: c */
        private final ArrayList f5943c = new ArrayList();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f5944d = new WindowOnFrameMetricsAvailableListenerC32624a();

        /* renamed from: androidx.core.app.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class WindowOnFrameMetricsAvailableListenerC32624a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC32624a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f5941a & 1) != 0) {
                    aVar.m6725e(aVar.f5942b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f5941a & 2) != 0) {
                    aVar2.m6725e(aVar2.f5942b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f5941a & 4) != 0) {
                    aVar3.m6725e(aVar3.f5942b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f5941a & 8) != 0) {
                    aVar4.m6725e(aVar4.f5942b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f5941a & 16) != 0) {
                    aVar5.m6725e(aVar5.f5942b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f5941a & 64) != 0) {
                    aVar6.m6725e(aVar6.f5942b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f5941a & 32) != 0) {
                    aVar7.m6725e(aVar7.f5942b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f5941a & 128) != 0) {
                    aVar8.m6725e(aVar8.f5942b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f5941a & 256) != 0) {
                    aVar9.m6725e(aVar9.f5942b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f5941a = i11;
        }

        @Override // androidx.core.app.C1339g.b
        /* renamed from: a */
        public void mo6721a(Activity activity) {
            if (f5939e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f5939e = handlerThread;
                handlerThread.start();
                f5940f = new Handler(f5939e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f5942b;
                if (sparseIntArrayArr[i11] == null && (this.f5941a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f5944d, f5940f);
            this.f5943c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.C1339g.b
        /* renamed from: b */
        public SparseIntArray[] mo6722b() {
            return this.f5942b;
        }

        @Override // androidx.core.app.C1339g.b
        /* renamed from: c */
        public SparseIntArray[] mo6723c(Activity activity) {
            Iterator it = this.f5943c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f5943c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f5944d);
            return this.f5942b;
        }

        @Override // androidx.core.app.C1339g.b
        /* renamed from: d */
        public SparseIntArray[] mo6724d() {
            SparseIntArray[] sparseIntArrayArr = this.f5942b;
            this.f5942b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        void m6725e(SparseIntArray sparseIntArray, long j11) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j11) / 1000000);
                if (j11 >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.g$b */
    /* loaded from: classes2.dex */
    private static class b {
        b() {
        }

        /* renamed from: a */
        public void mo6721a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo6722b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo6723c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo6724d() {
            return null;
        }
    }

    public C1339g() {
        this(1);
    }

    /* renamed from: a */
    public void m6717a(Activity activity) {
        this.f5938a.mo6721a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m6718b() {
        return this.f5938a.mo6722b();
    }

    /* renamed from: c */
    public SparseIntArray[] m6719c(Activity activity) {
        return this.f5938a.mo6723c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m6720d() {
        return this.f5938a.mo6724d();
    }

    public C1339g(int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5938a = new a(i11);
        } else {
            this.f5938a = new b();
        }
    }
}
