package p502s3;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mm0.AbstractC23350e;

/* renamed from: s3.e */
/* loaded from: classes2.dex */
public class C26119e implements InterfaceC26116b {

    /* renamed from: k */
    private static final Bitmap.Config f124341k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC26121g f124342a;

    /* renamed from: b */
    private final Set f124343b;

    /* renamed from: c */
    private final int f124344c;

    /* renamed from: d */
    private final a f124345d;

    /* renamed from: e */
    private int f124346e;

    /* renamed from: f */
    private int f124347f;

    /* renamed from: g */
    private int f124348g;

    /* renamed from: h */
    private int f124349h;

    /* renamed from: i */
    private int f124350i;

    /* renamed from: j */
    private int f124351j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.e$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo134476a(Bitmap bitmap);

        /* renamed from: b */
        void mo134477b(Bitmap bitmap);
    }

    /* renamed from: s3.e$b */
    /* loaded from: classes2.dex */
    private static class b implements a {
        private b() {
        }

        @Override // p502s3.C26119e.a
        /* renamed from: a */
        public void mo134476a(Bitmap bitmap) {
        }

        @Override // p502s3.C26119e.a
        /* renamed from: b */
        public void mo134477b(Bitmap bitmap) {
        }
    }

    C26119e(int i11, InterfaceC26121g interfaceC26121g, Set set) {
        this.f124344c = i11;
        this.f124346e = i11;
        this.f124342a = interfaceC26121g;
        this.f124343b = set;
        this.f124345d = new b();
    }

    /* renamed from: e */
    private void m134469e() {
        if (AbstractC23350e.m122781k("LruBitmapPool", 2)) {
            m134470f();
        }
    }

    /* renamed from: f */
    private void m134470f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hits=");
        sb2.append(this.f124348g);
        sb2.append(", misses=");
        sb2.append(this.f124349h);
        sb2.append(", puts=");
        sb2.append(this.f124350i);
        sb2.append(", evictions=");
        sb2.append(this.f124351j);
        sb2.append(", currentSize=");
        sb2.append(this.f124347f);
        sb2.append(", maxSize=");
        sb2.append(this.f124346e);
        sb2.append("\nStrategy=");
        sb2.append(this.f124342a);
    }

    /* renamed from: g */
    private void m134471g() {
        m134474k(this.f124346e);
    }

    /* renamed from: h */
    private static Set m134472h() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: i */
    private static InterfaceC26121g m134473i() {
        return new C26123i();
    }

    /* renamed from: k */
    private synchronized void m134474k(int i11) {
        while (this.f124347f > i11) {
            try {
                Bitmap removeLast = this.f124342a.removeLast();
                if (removeLast == null) {
                    if (AbstractC23350e.m122781k("LruBitmapPool", 5)) {
                        m134470f();
                    }
                    this.f124347f = 0;
                    return;
                }
                this.f124345d.mo134476a(removeLast);
                this.f124347f -= this.f124342a.mo134482e(removeLast);
                this.f124351j++;
                if (AbstractC23350e.m122781k("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    sb2.append(this.f124342a.mo134480c(removeLast));
                }
                m134469e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p502s3.InterfaceC26116b
    /* renamed from: a */
    public synchronized boolean mo134448a(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f124342a.mo134482e(bitmap) <= this.f124346e && this.f124343b.contains(bitmap.getConfig())) {
                        int mo134482e = this.f124342a.mo134482e(bitmap);
                        this.f124342a.mo134478a(bitmap);
                        this.f124345d.mo134477b(bitmap);
                        this.f124350i++;
                        this.f124347f += mo134482e;
                        if (AbstractC23350e.m122781k("LruBitmapPool", 2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Put bitmap in pool=");
                            sb2.append(this.f124342a.mo134480c(bitmap));
                        }
                        m134469e();
                        m134471g();
                        return true;
                    }
                    if (AbstractC23350e.m122781k("LruBitmapPool", 2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Reject bitmap from pool, bitmap: ");
                        sb3.append(this.f124342a.mo134480c(bitmap));
                        sb3.append(", is mutable: ");
                        sb3.append(bitmap.isMutable());
                        sb3.append(", is allowed config: ");
                        sb3.append(this.f124343b.contains(bitmap.getConfig()));
                    }
                    return false;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p502s3.InterfaceC26116b
    /* renamed from: b */
    public synchronized Bitmap mo134449b(int i11, int i12, Bitmap.Config config) {
        Bitmap m134475j;
        m134475j = m134475j(i11, i12, config);
        if (m134475j != null) {
            m134475j.eraseColor(0);
        }
        return m134475j;
    }

    @Override // p502s3.InterfaceC26116b
    /* renamed from: c */
    public void mo134450c(int i11) {
        if (AbstractC23350e.m122781k("LruBitmapPool", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trimMemory, level=");
            sb2.append(i11);
        }
        if (i11 >= 60) {
            mo134451d();
        } else if (i11 >= 40) {
            m134474k(this.f124346e / 2);
        }
    }

    @Override // p502s3.InterfaceC26116b
    /* renamed from: d */
    public void mo134451d() {
        m134474k(0);
    }

    /* renamed from: j */
    public synchronized Bitmap m134475j(int i11, int i12, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap mo134479b;
        try {
            InterfaceC26121g interfaceC26121g = this.f124342a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f124341k;
            }
            mo134479b = interfaceC26121g.mo134479b(i11, i12, config2);
            if (mo134479b == null) {
                if (AbstractC23350e.m122781k("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing bitmap=");
                    sb2.append(this.f124342a.mo134481d(i11, i12, config));
                }
                this.f124349h++;
            } else {
                this.f124348g++;
                this.f124347f -= this.f124342a.mo134482e(mo134479b);
                this.f124345d.mo134476a(mo134479b);
                mo134479b.setHasAlpha(true);
            }
            if (AbstractC23350e.m122781k("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Get bitmap=");
                sb3.append(this.f124342a.mo134481d(i11, i12, config));
            }
            m134469e();
        } catch (Throwable th2) {
            throw th2;
        }
        return mo134479b;
    }

    public C26119e(int i11) {
        this(i11, m134473i(), m134472h());
    }
}
