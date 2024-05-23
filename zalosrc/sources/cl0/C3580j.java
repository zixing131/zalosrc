package cl0;

import bl0.AbstractC2838d;
import bl0.C2839e;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.node.ZOMExternalScriptDataArray;
import com.zing.zalo.zinstant.zom.node.ZOMFontFace;
import fn0.AbstractC19074t;
import ik0.C20590m;
import ik0.C20591n;
import java.util.LinkedList;
import kotlin.coroutines.Continuation;
import pj0.InterfaceC24775a;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vk0.C28284f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import zk0.InterfaceC32222a;

/* renamed from: cl0.j */
/* loaded from: classes7.dex */
public final class C3580j extends AbstractC2838d {

    /* renamed from: cl0.j$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private final C28284f f15138a;

        public a(C28284f c28284f) {
            this.f15138a = c28284f;
        }

        /* renamed from: a */
        public final C28284f m18184a() {
            return this.f15138a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f15138a, ((a) obj).f15138a);
        }

        public int hashCode() {
            C28284f c28284f = this.f15138a;
            if (c28284f == null) {
                return 0;
            }
            return c28284f.hashCode();
        }

        public String toString() {
            return "VerifiedStatus(error=" + this.f15138a + ')';
        }
    }

    /* renamed from: cl0.j$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC24775a {

        /* renamed from: b */
        final /* synthetic */ Continuation f15140b;

        b(Continuation continuation) {
            this.f15140b = continuation;
        }

        /* renamed from: a */
        public void m18185a(boolean z11) {
            try {
                Continuation continuation = this.f15140b;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new a(null)));
            } catch (Exception e11) {
                C3580j c3580j = C3580j.this;
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c3580j.m142533d(message);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            try {
                this.f15140b.mo112492g(C24861r.m129218b(new a(new C28284f(402, exc.getMessage()))));
            } catch (Exception e11) {
                C3580j c3580j = C3580j.this;
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c3580j.m142533d(message);
            }
        }

        @Override // pj0.InterfaceC24775a
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            m18185a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: cl0.j$c */
    /* loaded from: classes7.dex */
    public static final class c implements InterfaceC24775a {

        /* renamed from: b */
        final /* synthetic */ Continuation f15142b;

        c(Continuation continuation) {
            this.f15142b = continuation;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            try {
                Continuation continuation = this.f15142b;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new a(null)));
            } catch (Exception e11) {
                C3580j c3580j = C3580j.this;
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c3580j.m142533d(message);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            try {
                this.f15142b.mo112492g(C24861r.m129218b(new a(new C28284f(403, exc.getMessage()))));
            } catch (Exception e11) {
                C3580j c3580j = C3580j.this;
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c3580j.m142533d(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.j$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f15143s;

        /* renamed from: t */
        Object f15144t;

        /* renamed from: u */
        /* synthetic */ Object f15145u;

        /* renamed from: w */
        int f15147w;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15145u = obj;
            this.f15147w |= Integer.MIN_VALUE;
            return C3580j.this.mo13718g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3580j(C3579i c3579i, InterfaceC32222a interfaceC32222a) {
        super(c3579i, interfaceC32222a);
        AbstractC19074t.m100208f(c3579i, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo13718g(Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        ZOMDocument zOMDocument;
        C3580j c3580j;
        C3580j c3580j2;
        C28284f m18184a;
        C28284f m18184a2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f15147w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f15147w = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f15145u;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f15147w;
                int i13 = 1;
                ZOMDocument zOMDocument2 = null;
                byte b11 = 0;
                byte b12 = 0;
                byte b13 = 0;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c3580j = (C3580j) dVar.f15143s;
                            AbstractC24862s.m129228b(obj);
                            m18184a2 = ((a) obj).m18184a();
                            if (m18184a2 != null) {
                                return new C2839e(zOMDocument2, m18184a2, i13, b13 == true ? 1 : 0);
                            }
                            return ((C3579i) c3580j.m142531b()).m18181x();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zOMDocument = (ZOMDocument) dVar.f15144t;
                    c3580j2 = (C3580j) dVar.f15143s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    zOMDocument = (ZOMDocument) ((C3579i) m142531b()).m18181x().m142538c();
                    if (zOMDocument != null) {
                        dVar.f15143s = this;
                        dVar.f15144t = zOMDocument;
                        dVar.f15147w = 1;
                        obj = m18182h(zOMDocument, dVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c3580j2 = this;
                    } else {
                        c3580j = this;
                        return ((C3579i) c3580j.m142531b()).m18181x();
                    }
                }
                m18184a = ((a) obj).m18184a();
                if (m18184a == null) {
                    return new C2839e(b12 == true ? 1 : 0, m18184a, i13, b11 == true ? 1 : 0);
                }
                dVar.f15143s = c3580j2;
                dVar.f15144t = null;
                dVar.f15147w = 2;
                obj = c3580j2.m18183i(zOMDocument, dVar);
                if (obj == m142578e) {
                    return m142578e;
                }
                c3580j = c3580j2;
                m18184a2 = ((a) obj).m18184a();
                if (m18184a2 != null) {
                }
                return ((C3579i) c3580j.m142531b()).m18181x();
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f15145u;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f15147w;
        int i132 = 1;
        ZOMDocument zOMDocument22 = null;
        byte b112 = 0;
        byte b122 = 0;
        byte b132 = 0;
        if (i11 == 0) {
        }
        m18184a = ((a) obj2).m18184a();
        if (m18184a == null) {
        }
    }

    /* renamed from: h */
    public final Object m18182h(ZOMDocument zOMDocument, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        ZOMFontFace zOMFontFace = zOMDocument.mFontFace;
        ZOMExternalScriptDataArray zOMExternalScriptDataArray = zOMDocument.mExternalScript;
        LinkedList linkedList = new LinkedList();
        if (zOMFontFace != null) {
            linkedList.add(new C20591n(zOMFontFace, 5));
        }
        if (zOMExternalScriptDataArray != null) {
            linkedList.add(new C20591n(zOMExternalScriptDataArray, 6));
        }
        C20590m.m107143e(linkedList, new b(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: i */
    public final Object m18183i(ZOMDocument zOMDocument, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        zOMDocument.onRequestResourcesCompleted(new c(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
