package j90;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import bg0.C2797c;
import bg0.InterfaceC2798d;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ve.C27989h;

/* renamed from: j90.v */
/* loaded from: classes6.dex */
public final class C21141v {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f103217b;

    /* renamed from: a */
    private final InterfaceC2798d f103218a;

    /* renamed from: j90.v$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f103219q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21141v mo12V4() {
            return c.f103220a.m109637a();
        }
    }

    /* renamed from: j90.v$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21141v m109636a() {
            return (C21141v) C21141v.f103217b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j90.v$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f103220a = new c();

        /* renamed from: b */
        private static final C21141v f103221b = new C21141v(null);

        private c() {
        }

        /* renamed from: a */
        public final C21141v m109637a() {
            return f103221b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f103219q);
        f103217b = m129210a;
    }

    public /* synthetic */ C21141v(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public static final C21141v m109632c() {
        return Companion.m109636a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m109633e(String str, WeakReference weakReference, C27989h.a aVar) {
        AbstractC19074t.m100208f(str, "$taskId");
        AbstractC19074t.m100208f(weakReference, "$weakRefImageDecorView");
        String name = Thread.currentThread().getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread [");
        sb2.append(name);
        sb2.append("] executing task ");
        sb2.append(str);
        ImageDecorView imageDecorView = (ImageDecorView) weakReference.get();
        if (imageDecorView == null) {
            return;
        }
        Bitmap screenBitmap = imageDecorView.getScreenBitmap();
        if (aVar != null) {
            aVar.mo39367a(screenBitmap);
        }
    }

    /* renamed from: d */
    public final void m109634d(ImageDecorView imageDecorView, final C27989h.a aVar) {
        AbstractC19074t.m100208f(imageDecorView, "imgDecorView");
        final String str = "@" + imageDecorView.hashCode() + "_" + System.currentTimeMillis();
        final WeakReference weakReference = new WeakReference(imageDecorView);
        String name = Thread.currentThread().getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread [");
        sb2.append(name);
        sb2.append("] queued task ");
        sb2.append(str);
        this.f103218a.mo13474a(new Runnable() { // from class: j90.u
            @Override // java.lang.Runnable
            public final void run() {
                C21141v.m109633e(str, weakReference, aVar);
            }
        });
    }

    private C21141v() {
        this.f103218a = new C2797c(AbstractC0837p0.Companion.m2236a());
    }
}
