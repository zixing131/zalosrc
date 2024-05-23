package ge0;

import af0.C0774b;
import android.content.ClipDescription;
import android.os.Bundle;
import android.text.TextUtils;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gs.C19592b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import me0.AbstractC23280z4;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p716zh.C32205z8;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: ge0.b */
/* loaded from: classes4.dex */
public final class C19429b extends AbstractC19377a {

    /* renamed from: ge0.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C32205z8.c f96382a;

        /* renamed from: b */
        private final ClipDescription f96383b;

        /* renamed from: c */
        private final Bundle f96384c;

        /* renamed from: d */
        private final int f96385d;

        public a(C32205z8.c cVar, ClipDescription clipDescription, Bundle bundle, int i11) {
            AbstractC19074t.m100208f(cVar, "uri");
            this.f96382a = cVar;
            this.f96383b = clipDescription;
            this.f96384c = bundle;
            this.f96385d = i11;
        }

        /* renamed from: a */
        public final ClipDescription m101576a() {
            return this.f96383b;
        }

        /* renamed from: b */
        public final C32205z8.c m101577b() {
            return this.f96382a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f96382a, aVar.f96382a) && AbstractC19074t.m100204b(this.f96383b, aVar.f96383b) && AbstractC19074t.m100204b(this.f96384c, aVar.f96384c) && this.f96385d == aVar.f96385d;
        }

        public int hashCode() {
            int hashCode = this.f96382a.hashCode() * 31;
            ClipDescription clipDescription = this.f96383b;
            int hashCode2 = (hashCode + (clipDescription == null ? 0 : clipDescription.hashCode())) * 31;
            Bundle bundle = this.f96384c;
            return ((hashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.f96385d;
        }

        public String toString() {
            return "Param(uri=" + this.f96382a + ", description=" + this.f96383b + ", opt=" + this.f96384c + ", src=" + this.f96385d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ge0.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f96386s;

        /* renamed from: t */
        /* synthetic */ Object f96387t;

        /* renamed from: v */
        int f96389v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96387t = obj;
            this.f96389v |= Integer.MIN_VALUE;
            return C19429b.this.mo451b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ge0.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96390t;

        /* renamed from: u */
        final /* synthetic */ a f96391u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f96391u = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f96391u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean m127127w;
            AbstractC28298d.m142578e();
            if (this.f96390t == 0) {
                AbstractC24862s.m129228b(obj);
                m127127w = AbstractC24341v.m127127w(AbstractC23280z4.m120353t(this.f96391u.m101577b().m155304b()), "image/gif", false, 2, null);
                return AbstractC29094b.m145339a(m127127w);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:(1:(8:13|14|15|16|(1:18)(1:31)|19|20|(2:22|23)(2:25|(1:29)(2:27|28)))(2:32|33))(8:34|35|36|16|(0)(0)|19|20|(0)(0)))(2:37|38))(4:47|48|(2:53|(2:56|(2:61|(1:63))(2:60|(8:41|(1:43)|36|16|(0)(0)|19|20|(0)(0))(8:44|(1:46)|15|16|(0)(0)|19|20|(0)(0))))(4:55|19|20|(0)(0)))|64)|39|(0)(0)))|67|6|7|8|(0)(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0037, code lost:            r11 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0119, code lost:            r12 = pm0.C24861r.f119264q;        r11 = pm0.C24861r.m129218b(pm0.AbstractC24862s.m129227a(r11));     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:15:0x00f8, B:16:0x00fa, B:18:0x0100, B:19:0x0113, B:35:0x0046, B:36:0x00d9, B:38:0x004f, B:39:0x00b9, B:41:0x00c1, B:44:0x00e0, B:48:0x0056, B:50:0x0066, B:53:0x006e, B:56:0x0088, B:58:0x008e, B:60:0x0098, B:61:0x00a3), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:15:0x00f8, B:16:0x00fa, B:18:0x0100, B:19:0x0113, B:35:0x0046, B:36:0x00d9, B:38:0x004f, B:39:0x00b9, B:41:0x00c1, B:44:0x00e0, B:48:0x0056, B:50:0x0066, B:53:0x006e, B:56:0x0088, B:58:0x008e, B:60:0x0098, B:61:0x00a3), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:15:0x00f8, B:16:0x00fa, B:18:0x0100, B:19:0x0113, B:35:0x0046, B:36:0x00d9, B:38:0x004f, B:39:0x00b9, B:41:0x00c1, B:44:0x00e0, B:48:0x0056, B:50:0x0066, B:53:0x006e, B:56:0x0088, B:58:0x008e, B:60:0x0098, B:61:0x00a3), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        Throwable m129221e;
        String m102564a;
        boolean hasMimeType;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f96389v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f96389v = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f96387t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar2.f96389v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                aVar = (a) bVar2.f96386s;
                                AbstractC24862s.m129228b(obj);
                                m102564a = (String) obj;
                                if (TextUtils.isEmpty(m102564a)) {
                                    C19592b.f97337a.m102565b(aVar.m101577b().m155304b().getPath(), m102564a);
                                } else {
                                    m102564a = null;
                                }
                                Object m129218b = C24861r.m129218b(m102564a);
                                m129221e = C24861r.m129221e(m129218b);
                                if (m129221e != null) {
                                    AbstractC23350e.m122778h(m129221e);
                                    return null;
                                }
                                if (C24861r.m129223g(m129218b)) {
                                    return null;
                                }
                                return m129218b;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) bVar2.f96386s;
                        AbstractC24862s.m129228b(obj);
                        m102564a = AbstractC19430c.m101580b((String) obj);
                        if (TextUtils.isEmpty(m102564a)) {
                        }
                        Object m129218b2 = C24861r.m129218b(m102564a);
                        m129221e = C24861r.m129221e(m129218b2);
                        if (m129221e != null) {
                        }
                    } else {
                        aVar = (a) bVar2.f96386s;
                        AbstractC24862s.m129228b(obj);
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C24861r.a aVar2 = C24861r.f119264q;
                    String path = aVar.m101577b().m155304b().getPath();
                    if (path != null && path.length() != 0) {
                        m102564a = C19592b.f97337a.m102564a(aVar.m101577b().m155304b().getPath());
                        if (TextUtils.isEmpty(m102564a)) {
                            if (aVar.m101576a() != null && aVar.m101576a().getMimeTypeCount() > 0) {
                                hasMimeType = aVar.m101576a().hasMimeType("image/gif");
                                if (hasMimeType) {
                                    C0774b c0774b = C0774b.f2680a;
                                    C32205z8.c m101577b = aVar.m101577b();
                                    bVar2.f96386s = aVar;
                                    bVar2.f96389v = 2;
                                    obj = C0774b.m1913k(c0774b, m101577b, true, null, false, bVar2, 12, null);
                                    if (obj == m142578e) {
                                        return m142578e;
                                    }
                                    m102564a = AbstractC19430c.m101580b((String) obj);
                                    if (TextUtils.isEmpty(m102564a)) {
                                    }
                                    Object m129218b22 = C24861r.m129218b(m102564a);
                                    m129221e = C24861r.m129221e(m129218b22);
                                    if (m129221e != null) {
                                    }
                                } else {
                                    C0774b c0774b2 = C0774b.f2680a;
                                    C32205z8.c m101577b2 = aVar.m101577b();
                                    bVar2.f96386s = aVar;
                                    bVar2.f96389v = 3;
                                    obj = C0774b.m1913k(c0774b2, m101577b2, true, null, false, bVar2, 12, null);
                                    if (obj == m142578e) {
                                        return m142578e;
                                    }
                                    m102564a = (String) obj;
                                    if (TextUtils.isEmpty(m102564a)) {
                                    }
                                    Object m129218b222 = C24861r.m129218b(m102564a);
                                    m129221e = C24861r.m129221e(m129218b222);
                                    if (m129221e != null) {
                                    }
                                }
                            } else {
                                ExecutorCoroutineDispatcher m1927o = C0774b.f2680a.m1927o();
                                c cVar = new c(aVar, null);
                                bVar2.f96386s = aVar;
                                bVar2.f96389v = 1;
                                obj = BuildersKt.m112534g(m1927o, cVar, bVar2);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                            }
                        } else {
                            Object m129218b2222 = C24861r.m129218b(m102564a);
                            m129221e = C24861r.m129221e(m129218b2222);
                            if (m129221e != null) {
                            }
                        }
                    }
                    return null;
                }
                hasMimeType = ((Boolean) obj).booleanValue();
                if (hasMimeType) {
                }
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f96387t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar22.f96389v;
        if (i11 == 0) {
        }
        hasMimeType = ((Boolean) obj2).booleanValue();
        if (hasMimeType) {
        }
    }
}
