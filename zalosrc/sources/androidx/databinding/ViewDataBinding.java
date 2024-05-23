package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1669c;
import androidx.databinding.InterfaceC1674h;
import androidx.databinding.InterfaceC1676j;
import androidx.databinding.InterfaceC1677k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p338m2.InterfaceC22715a;
import p377o1.AbstractC23977a;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public abstract class ViewDataBinding extends AbstractC1667a implements InterfaceC22715a {

    /* renamed from: G */
    private static final int f6695G = 8;

    /* renamed from: A */
    private ViewDataBinding f6704A;

    /* renamed from: B */
    private InterfaceC1801w f6705B;

    /* renamed from: C */
    private OnStartListener f6706C;

    /* renamed from: D */
    private boolean f6707D;

    /* renamed from: E */
    protected boolean f6708E;

    /* renamed from: q */
    private final Runnable f6709q;

    /* renamed from: r */
    private boolean f6710r;

    /* renamed from: s */
    private boolean f6711s;

    /* renamed from: t */
    private C1682p[] f6712t;

    /* renamed from: u */
    private final View f6713u;

    /* renamed from: v */
    private AbstractC1669c f6714v;

    /* renamed from: w */
    private boolean f6715w;

    /* renamed from: x */
    private Choreographer f6716x;

    /* renamed from: y */
    private final Choreographer.FrameCallback f6717y;

    /* renamed from: z */
    private Handler f6718z;

    /* renamed from: F */
    static int f6694F = Build.VERSION.SDK_INT;

    /* renamed from: H */
    private static final boolean f6696H = true;

    /* renamed from: I */
    private static final InterfaceC1670d f6697I = new C1654a();

    /* renamed from: J */
    private static final InterfaceC1670d f6698J = new C1655b();

    /* renamed from: K */
    private static final InterfaceC1670d f6699K = new C1656c();

    /* renamed from: L */
    private static final InterfaceC1670d f6700L = new C1657d();

    /* renamed from: M */
    private static final AbstractC1669c.a f6701M = new C1658e();

    /* renamed from: N */
    private static final ReferenceQueue f6702N = new ReferenceQueue();

    /* renamed from: O */
    private static final View.OnAttachStateChangeListener f6703O = new ViewOnAttachStateChangeListenerC1659f();

    /* loaded from: classes2.dex */
    static class OnStartListener implements InterfaceC1799v {

        /* renamed from: p */
        final WeakReference f6719p;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C1654a c1654a) {
            this(viewDataBinding);
        }

        @InterfaceC1766e0(AbstractC1785o.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f6719p.get();
            if (viewDataBinding != null) {
                viewDataBinding.m8509o();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f6719p = new WeakReference(viewDataBinding);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    /* loaded from: classes2.dex */
    class C1654a implements InterfaceC1670d {
        C1654a() {
        }

        @Override // androidx.databinding.InterfaceC1670d
        /* renamed from: a */
        public C1682p mo8514a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            return new C1666m(viewDataBinding, i11, referenceQueue).m8533f();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    /* loaded from: classes2.dex */
    class C1655b implements InterfaceC1670d {
        C1655b() {
        }

        @Override // androidx.databinding.InterfaceC1670d
        /* renamed from: a */
        public C1682p mo8514a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            return new C1664k(viewDataBinding, i11, referenceQueue).m8526e();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    /* loaded from: classes2.dex */
    class C1656c implements InterfaceC1670d {
        C1656c() {
        }

        @Override // androidx.databinding.InterfaceC1670d
        /* renamed from: a */
        public C1682p mo8514a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            return new C1665l(viewDataBinding, i11, referenceQueue).m8529e();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    /* loaded from: classes2.dex */
    class C1657d implements InterfaceC1670d {
        C1657d() {
        }

        @Override // androidx.databinding.InterfaceC1670d
        /* renamed from: a */
        public C1682p mo8514a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            return new C1663j(viewDataBinding, i11, referenceQueue).m8522f();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    /* loaded from: classes2.dex */
    class C1658e extends AbstractC1669c.a {
        C1658e() {
        }

        @Override // androidx.databinding.AbstractC1669c.a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo8515a(Object obj, Object obj2, int i11, Object obj3) {
            AbstractC30228a.m149044a(obj);
            m8516b(null, (ViewDataBinding) obj2, i11, (Void) obj3);
        }

        /* renamed from: b */
        public void m8516b(AbstractC1679m abstractC1679m, ViewDataBinding viewDataBinding, int i11, Void r42) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    } else {
                        throw null;
                    }
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    /* loaded from: classes2.dex */
    class ViewOnAttachStateChangeListenerC1659f implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC1659f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m8496q(view).f6709q.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    /* loaded from: classes2.dex */
    class RunnableC1660g implements Runnable {
        RunnableC1660g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f6710r = false;
            }
            ViewDataBinding.m8486F();
            if (!ViewDataBinding.this.f6713u.isAttachedToWindow()) {
                ViewDataBinding.this.f6713u.removeOnAttachStateChangeListener(ViewDataBinding.f6703O);
                ViewDataBinding.this.f6713u.addOnAttachStateChangeListener(ViewDataBinding.f6703O);
            } else {
                ViewDataBinding.this.m8509o();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    /* loaded from: classes2.dex */
    class ChoreographerFrameCallbackC1661h implements Choreographer.FrameCallback {
        ChoreographerFrameCallbackC1661h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            ViewDataBinding.this.f6709q.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.databinding.ViewDataBinding$i */
    /* loaded from: classes2.dex */
    public static class C1662i {
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    /* loaded from: classes2.dex */
    private static class C1663j implements InterfaceC1764d0, InterfaceC1678l {

        /* renamed from: p */
        final C1682p f6722p;

        /* renamed from: q */
        WeakReference f6723q = null;

        public C1663j(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            this.f6722p = new C1682p(viewDataBinding, i11, this, referenceQueue);
        }

        /* renamed from: e */
        private InterfaceC1801w m8517e() {
            WeakReference weakReference = this.f6723q;
            if (weakReference == null) {
                return null;
            }
            return (InterfaceC1801w) weakReference.get();
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: a */
        public void mo8518a(InterfaceC1801w interfaceC1801w) {
            InterfaceC1801w m8517e = m8517e();
            LiveData liveData = (LiveData) this.f6722p.m8574b();
            if (liveData != null) {
                if (m8517e != null) {
                    liveData.mo9222o(this);
                }
                if (interfaceC1801w != null) {
                    liveData.m9219j(interfaceC1801w, this);
                }
            }
            if (interfaceC1801w != null) {
                this.f6723q = new WeakReference(interfaceC1801w);
            }
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo8520c(LiveData liveData) {
            InterfaceC1801w m8517e = m8517e();
            if (m8517e != null) {
                liveData.m9219j(m8517e, this);
            }
        }

        /* renamed from: f */
        public C1682p m8522f() {
            return this.f6722p;
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo8519b(LiveData liveData) {
            liveData.mo9222o(this);
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public void mo8524qp(Object obj) {
            ViewDataBinding m8573a = this.f6722p.m8573a();
            if (m8573a != null) {
                C1682p c1682p = this.f6722p;
                m8573a.m8511t(c1682p.f6745b, c1682p.m8574b(), 0);
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    /* loaded from: classes2.dex */
    private static class C1664k extends InterfaceC1676j.a implements InterfaceC1678l {

        /* renamed from: p */
        final C1682p f6724p;

        public C1664k(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            this.f6724p = new C1682p(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: a */
        public void mo8518a(InterfaceC1801w interfaceC1801w) {
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo8519b(Object obj) {
            AbstractC30228a.m149044a(obj);
            m8527f(null);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo8520c(Object obj) {
            AbstractC30228a.m149044a(obj);
            m8525d(null);
        }

        /* renamed from: d */
        public void m8525d(InterfaceC1676j interfaceC1676j) {
            interfaceC1676j.m8557g0(this);
        }

        /* renamed from: e */
        public C1682p m8526e() {
            return this.f6724p;
        }

        /* renamed from: f */
        public void m8527f(InterfaceC1676j interfaceC1676j) {
            interfaceC1676j.m8558i(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    /* loaded from: classes2.dex */
    private static class C1665l extends InterfaceC1677k.a implements InterfaceC1678l {

        /* renamed from: p */
        final C1682p f6725p;

        public C1665l(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            this.f6725p = new C1682p(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: a */
        public void mo8518a(InterfaceC1801w interfaceC1801w) {
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo8519b(Object obj) {
            AbstractC30228a.m149044a(obj);
            m8530f(null);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo8520c(Object obj) {
            AbstractC30228a.m149044a(obj);
            m8528d(null);
        }

        /* renamed from: d */
        public void m8528d(InterfaceC1677k interfaceC1677k) {
            interfaceC1677k.m8559j(this);
        }

        /* renamed from: e */
        public C1682p m8529e() {
            return this.f6725p;
        }

        /* renamed from: f */
        public void m8530f(InterfaceC1677k interfaceC1677k) {
            interfaceC1677k.m8560m(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    /* loaded from: classes2.dex */
    private static class C1666m extends InterfaceC1674h.a implements InterfaceC1678l {

        /* renamed from: p */
        final C1682p f6726p;

        public C1666m(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            this.f6726p = new C1682p(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: a */
        public void mo8518a(InterfaceC1801w interfaceC1801w) {
        }

        @Override // androidx.databinding.InterfaceC1674h.a
        /* renamed from: d */
        public void mo8531d(InterfaceC1674h interfaceC1674h, int i11) {
            ViewDataBinding m8573a = this.f6726p.m8573a();
            if (m8573a == null || ((InterfaceC1674h) this.f6726p.m8574b()) != interfaceC1674h) {
                return;
            }
            m8573a.m8511t(this.f6726p.f6745b, interfaceC1674h, i11);
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo8520c(InterfaceC1674h interfaceC1674h) {
            interfaceC1674h.mo8535a(this);
        }

        /* renamed from: f */
        public C1682p m8533f() {
            return this.f6726p;
        }

        @Override // androidx.databinding.InterfaceC1678l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo8519b(InterfaceC1674h interfaceC1674h) {
            interfaceC1674h.mo8536c(this);
        }
    }

    protected ViewDataBinding(InterfaceC1672f interfaceC1672f, View view, int i11) {
        this.f6709q = new RunnableC1660g();
        this.f6710r = false;
        this.f6711s = false;
        this.f6712t = new C1682p[i11];
        this.f6713u = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f6696H) {
            this.f6716x = Choreographer.getInstance();
            this.f6717y = new ChoreographerFrameCallbackC1661h();
        } else {
            this.f6717y = null;
            this.f6718z = new Handler(Looper.myLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public static Object[] m8484B(InterfaceC1672f interfaceC1672f, View view, int i11, C1662i c1662i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        m8499z(interfaceC1672f, view, objArr, c1662i, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: D */
    private static int m8485D(String str, int i11) {
        int i12 = 0;
        while (i11 < str.length()) {
            i12 = (i12 * 10) + (str.charAt(i11) - '0');
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static void m8486F() {
        while (true) {
            Reference poll = f6702N.poll();
            if (poll != null) {
                if (poll instanceof C1682p) {
                    ((C1682p) poll).m8577e();
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public static ViewDataBinding m8492j(Object obj, View view, int i11) {
        m8493k(obj);
        return AbstractC1673g.m8550a(null, view, i11);
    }

    /* renamed from: k */
    private static InterfaceC1672f m8493k(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: m */
    private void m8494m() {
        if (this.f6715w) {
            m8502I();
            return;
        }
        if (!mo8512u()) {
            return;
        }
        this.f6715w = true;
        this.f6711s = false;
        AbstractC1669c abstractC1669c = this.f6714v;
        if (abstractC1669c != null) {
            abstractC1669c.m8547e(this, 1, null);
            if (this.f6711s) {
                this.f6714v.m8547e(this, 2, null);
            }
        }
        if (!this.f6711s) {
            mo8508l();
            AbstractC1669c abstractC1669c2 = this.f6714v;
            if (abstractC1669c2 != null) {
                abstractC1669c2.m8547e(this, 3, null);
            }
        }
        this.f6715w = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static void m8495n(ViewDataBinding viewDataBinding) {
        viewDataBinding.m8494m();
    }

    /* renamed from: q */
    static ViewDataBinding m8496q(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(AbstractC23977a.dataBinding);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static ViewDataBinding m8497w(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11, Object obj) {
        m8493k(obj);
        return AbstractC1673g.m8555f(layoutInflater, i11, viewGroup, z11, null);
    }

    /* renamed from: y */
    private static boolean m8498y(String str, int i11) {
        int length = str.length();
        if (length == i11) {
            return false;
        }
        while (i11 < length) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }

    /* renamed from: z */
    private static void m8499z(InterfaceC1672f interfaceC1672f, View view, Object[] objArr, C1662i c1662i, SparseIntArray sparseIntArray, boolean z11) {
        String str;
        int id2;
        int i11;
        if (m8496q(view) != null) {
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        boolean z12 = true;
        if (z11 && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i12 = lastIndexOf + 1;
                if (m8498y(str, i12)) {
                    int m8485D = m8485D(str, i12);
                    if (objArr[m8485D] == null) {
                        objArr[m8485D] = view;
                    }
                }
            }
            z12 = false;
        } else {
            if (str != null && str.startsWith("binding_")) {
                int m8485D2 = m8485D(str, f6695G);
                if (objArr[m8485D2] == null) {
                    objArr[m8485D2] = view;
                }
            }
            z12 = false;
        }
        if (!z12 && (id2 = view.getId()) > 0 && sparseIntArray != null && (i11 = sparseIntArray.get(id2, -1)) >= 0 && objArr[i11] == null) {
            objArr[i11] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                m8499z(interfaceC1672f, viewGroup.getChildAt(i13), objArr, c1662i, sparseIntArray, false);
            }
        }
    }

    /* renamed from: C */
    protected abstract boolean mo8500C(int i11, Object obj, int i12);

    /* renamed from: H */
    protected void m8501H(int i11, Object obj, InterfaceC1670d interfaceC1670d) {
        if (obj == null) {
            return;
        }
        C1682p c1682p = this.f6712t[i11];
        if (c1682p == null) {
            c1682p = interfaceC1670d.mo8514a(this, i11, f6702N);
            this.f6712t[i11] = c1682p;
            InterfaceC1801w interfaceC1801w = this.f6705B;
            if (interfaceC1801w != null) {
                c1682p.m8575c(interfaceC1801w);
            }
        }
        c1682p.m8576d(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public void m8502I() {
        ViewDataBinding viewDataBinding = this.f6704A;
        if (viewDataBinding != null) {
            viewDataBinding.m8502I();
            return;
        }
        InterfaceC1801w interfaceC1801w = this.f6705B;
        if (interfaceC1801w != null && !interfaceC1801w.getLifecycle().mo9336b().m9345c(AbstractC1785o.b.STARTED)) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6710r) {
                    return;
                }
                this.f6710r = true;
                if (f6696H) {
                    this.f6716x.postFrameCallback(this.f6717y);
                } else {
                    this.f6718z.post(this.f6709q);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    public void m8503J(InterfaceC1801w interfaceC1801w) {
        boolean z11 = interfaceC1801w instanceof Fragment;
        InterfaceC1801w interfaceC1801w2 = this.f6705B;
        if (interfaceC1801w2 == interfaceC1801w) {
            return;
        }
        if (interfaceC1801w2 != null) {
            interfaceC1801w2.getLifecycle().mo9338d(this.f6706C);
        }
        this.f6705B = interfaceC1801w;
        if (interfaceC1801w != null) {
            if (this.f6706C == null) {
                this.f6706C = new OnStartListener(this, null);
            }
            interfaceC1801w.getLifecycle().mo9335a(this.f6706C);
        }
        for (C1682p c1682p : this.f6712t) {
            if (c1682p != null) {
                c1682p.m8575c(interfaceC1801w);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void m8504K(View view) {
        view.setTag(AbstractC23977a.dataBinding, this);
    }

    /* renamed from: M */
    protected boolean m8505M(int i11) {
        C1682p c1682p = this.f6712t[i11];
        if (c1682p != null) {
            return c1682p.m8577e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public boolean m8506N(int i11, LiveData liveData) {
        this.f6707D = true;
        try {
            return m8507O(i11, liveData, f6700L);
        } finally {
            this.f6707D = false;
        }
    }

    /* renamed from: O */
    protected boolean m8507O(int i11, Object obj, InterfaceC1670d interfaceC1670d) {
        if (obj == null) {
            return m8505M(i11);
        }
        C1682p c1682p = this.f6712t[i11];
        if (c1682p == null) {
            m8501H(i11, obj, interfaceC1670d);
            return true;
        }
        if (c1682p.m8574b() == obj) {
            return false;
        }
        m8505M(i11);
        m8501H(i11, obj, interfaceC1670d);
        return true;
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f6713u;
    }

    /* renamed from: l */
    protected abstract void mo8508l();

    /* renamed from: o */
    public void m8509o() {
        ViewDataBinding viewDataBinding = this.f6704A;
        if (viewDataBinding == null) {
            m8494m();
        } else {
            viewDataBinding.m8509o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m8510p() {
        mo8508l();
    }

    /* renamed from: t */
    protected void m8511t(int i11, Object obj, int i12) {
        if (!this.f6707D && !this.f6708E && mo8500C(i11, obj, i12)) {
            m8502I();
        }
    }

    /* renamed from: u */
    public abstract boolean mo8512u();

    /* renamed from: x */
    public abstract void mo8513x();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewDataBinding(Object obj, View view, int i11) {
        this((InterfaceC1672f) null, view, i11);
        m8493k(obj);
    }
}
