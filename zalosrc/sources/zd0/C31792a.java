package zd0;

import android.graphics.Bitmap;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23009a3;
import mm0.AbstractC23350e;
import p185gc.AbstractC19377a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import th.AbstractC26689j;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: zd0.a */
/* loaded from: classes4.dex */
public final class C31792a extends AbstractC19377a {
    public static final a Companion = new a(null);

    /* renamed from: zd0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zd0.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final Bitmap f145934a;

        /* renamed from: b */
        private final boolean f145935b;

        public b(Bitmap bitmap, boolean z11) {
            AbstractC19074t.m100208f(bitmap, "bitmap");
            this.f145934a = bitmap;
            this.f145935b = z11;
        }

        /* renamed from: a */
        public final Bitmap m152819a() {
            return this.f145934a;
        }

        /* renamed from: b */
        public final boolean m152820b() {
            return this.f145935b;
        }
    }

    /* renamed from: zd0.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final Bitmap f145936a;

        /* renamed from: b */
        private final String f145937b;

        /* renamed from: c */
        private final int f145938c;

        public c(Bitmap bitmap, String str, int i11) {
            AbstractC19074t.m100208f(str, "path");
            this.f145936a = bitmap;
            this.f145937b = str;
            this.f145938c = i11;
        }

        /* renamed from: a */
        public final Bitmap m152821a() {
            return this.f145936a;
        }

        /* renamed from: b */
        public final int m152822b() {
            return this.f145938c;
        }

        /* renamed from: c */
        public final String m152823c() {
            return this.f145937b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zd0.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f145939t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f145940u;

        /* renamed from: v */
        final /* synthetic */ C31792a f145941v;

        /* renamed from: w */
        final /* synthetic */ b f145942w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19059j0 c19059j0, C31792a c31792a, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f145940u = c19059j0;
            this.f145941v = c31792a;
            this.f145942w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f145940u, this.f145941v, this.f145942w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f145939t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    int m137110s = AbstractC26689j.m137110s();
                    if (((Bitmap) this.f145940u.f94941p).getWidth() < m137110s) {
                        if (((Bitmap) this.f145940u.f94941p).getHeight() >= m137110s) {
                        }
                        String m152815f = this.f145941v.m152815f();
                        this.f145941v.m152817i((Bitmap) this.f145940u.f94941p, m152815f, this.f145942w.m152820b());
                        return new c((Bitmap) this.f145940u.f94941p, m152815f, 0);
                    }
                    int width = ((Bitmap) this.f145940u.f94941p).getWidth();
                    int height = ((Bitmap) this.f145940u.f94941p).getHeight();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Resize doodle. Original size: (");
                    sb2.append(width);
                    sb2.append(", ");
                    sb2.append(height);
                    sb2.append(")");
                    C19059j0 c19059j0 = this.f145940u;
                    c19059j0.f94941p = this.f145941v.m152816g((Bitmap) c19059j0.f94941p, m137110s);
                    int width2 = ((Bitmap) this.f145940u.f94941p).getWidth();
                    int height2 = ((Bitmap) this.f145940u.f94941p).getHeight();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Resize doodle. After resize: (");
                    sb3.append(width2);
                    sb3.append(", ");
                    sb3.append(height2);
                    sb3.append(")");
                    String m152815f2 = this.f145941v.m152815f();
                    this.f145941v.m152817i((Bitmap) this.f145940u.f94941p, m152815f2, this.f145942w.m152820b());
                    return new c((Bitmap) this.f145940u.f94941p, m152815f2, 0);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SaveDoodleToFile", e11);
                    return new c(null, "", -1);
                } catch (OutOfMemoryError e12) {
                    AbstractC23350e.m122776f("SaveDoodleToFile", e12);
                    return new c(null, "", 78001);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final String m152815f() {
        return AbstractC20130d.m104871f0() + System.currentTimeMillis() + ".png";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final Bitmap m152816g(Bitmap bitmap, int i11) {
        Bitmap m117965p = AbstractC23009a3.m117965p(bitmap, i11, i11);
        bitmap.recycle();
        AbstractC19074t.m100205c(m117965p);
        return m117965p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m152817i(Bitmap bitmap, String str, boolean z11) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (z11) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
        } else {
            bitmap.compress(Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), fileOutputStream);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo451b(b bVar, Continuation continuation) {
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = bVar.m152819a();
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(c19059j0, this, bVar, null), continuation);
    }
}
