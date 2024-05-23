package lt;

import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import lt.AbstractC22649e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: lt.e */
/* loaded from: classes4.dex */
public abstract class AbstractC22649e extends AbstractC22646b {

    /* renamed from: Y */
    private final String f111061Y;

    /* renamed from: Z */
    private final C23528a f111062Z;

    /* renamed from: a0 */
    private final C24003n f111063a0;

    /* renamed from: b0 */
    private final Context f111064b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lt.e$a */
    /* loaded from: classes4.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RecyclingImageView f111065l1;

        a(RecyclingImageView recyclingImageView) {
            this.f111065l1 = recyclingImageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public /* synthetic */ void m117231H3(C3979l c3979l, RecyclingImageView recyclingImageView) {
            AbstractC22649e.this.m117218A0(c3979l.m18839c());
            recyclingImageView.setImageInfo(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, final C3979l c3979l, C23995f c23995f) {
            if (str != null) {
                try {
                    if (str.equals(AbstractC22649e.this.f111061Y) && c3979l != null && c3979l.m18839c() != null) {
                        this.f111065l1.setImageInfo(c3979l, true);
                        AbstractC22649e abstractC22649e = AbstractC22649e.this;
                        final RecyclingImageView recyclingImageView = this.f111065l1;
                        abstractC22649e.m1952U(new Runnable() { // from class: lt.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC22649e.a.this.m117231H3(c3979l, recyclingImageView);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lt.e$b */
    /* loaded from: classes4.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RecyclingImageView f111067l1;

        /* renamed from: m1 */
        final /* synthetic */ AtomicBoolean f111068m1;

        b(RecyclingImageView recyclingImageView, AtomicBoolean atomicBoolean) {
            this.f111067l1 = recyclingImageView;
            this.f111068m1 = atomicBoolean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public /* synthetic */ void m117233H3(C3979l c3979l, RecyclingImageView recyclingImageView) {
            AbstractC22649e.this.m117218A0(c3979l.m18839c());
            recyclingImageView.setImageInfo(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, final C3979l c3979l, C23995f c23995f) {
            if (str != null) {
                try {
                    try {
                        if (str.equals(AbstractC22649e.this.f111061Y)) {
                            if (c3979l != null && c3979l.m18839c() != null) {
                                this.f111067l1.setImageInfo(c3979l, true);
                                AbstractC22649e abstractC22649e = AbstractC22649e.this;
                                final RecyclingImageView recyclingImageView = this.f111067l1;
                                abstractC22649e.m1952U(new Runnable() { // from class: lt.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC22649e.b.this.m117233H3(c3979l, recyclingImageView);
                                    }
                                });
                            }
                            synchronized (this.f111068m1) {
                                this.f111068m1.set(false);
                                this.f111068m1.notifyAll();
                            }
                            return;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        synchronized (this.f111068m1) {
                            this.f111068m1.set(false);
                            this.f111068m1.notifyAll();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.f111068m1) {
                        this.f111068m1.set(false);
                        this.f111068m1.notifyAll();
                        throw th2;
                    }
                }
            }
            synchronized (this.f111068m1) {
                this.f111068m1.set(false);
                this.f111068m1.notifyAll();
            }
        }
    }

    public AbstractC22649e(String str, Context context, C23528a c23528a, C24003n c24003n) {
        this.f111062Z = c23528a;
        this.f111061Y = str;
        this.f111063a0 = c24003n;
        this.f111064b0 = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        m117228D0();
    }

    /* renamed from: D0 */
    void m117228D0() {
        String str = this.f111061Y;
        if (!TextUtils.isEmpty(str) && this.f111062Z != null) {
            RecyclingImageView recyclingImageView = new RecyclingImageView(this.f111064b0);
            ((C23528a) this.f111062Z.m123612r(recyclingImageView)).m123579C(str, this.f111063a0, new a(recyclingImageView));
        }
    }

    /* renamed from: E0 */
    public void mo1901E0() {
        if (!TextUtils.isEmpty(this.f111061Y) && this.f111062Z != null) {
            RecyclingImageView recyclingImageView = new RecyclingImageView(this.f111064b0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            ((C23528a) this.f111062Z.m123612r(recyclingImageView)).m123579C(this.f111061Y, this.f111063a0, new b(recyclingImageView, atomicBoolean));
            synchronized (atomicBoolean) {
                try {
                    if (atomicBoolean.get()) {
                        atomicBoolean.wait(5000L);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: F0 */
    public void m117229F0(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f111061Y) && mo1997z()) {
            m117228D0();
        }
    }
}
