package p138ep;

import bo.C3023p3;
import bo.C3028q3;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: ep.e */
/* loaded from: classes4.dex */
public final class C18535e implements InterfaceC18531a, InterfaceC18532b {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private static volatile C18535e f93210s;

    /* renamed from: p */
    private final InterfaceC18531a f93211p;

    /* renamed from: q */
    private final InterfaceC18532b f93212q;

    /* renamed from: r */
    private final C18538h f93213r;

    /* renamed from: ep.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18535e m97930a() {
            C18535e c18535e = C18535e.f93210s;
            if (c18535e == null) {
                synchronized (this) {
                    c18535e = new C18535e(new C18533c(), new C18534d(), new C18538h());
                    C18535e.f93210s = c18535e;
                }
            }
            return c18535e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ep.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f93214s;

        /* renamed from: t */
        Object f93215t;

        /* renamed from: u */
        /* synthetic */ Object f93216u;

        /* renamed from: w */
        int f93218w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93216u = obj;
            this.f93218w |= Integer.MIN_VALUE;
            return C18535e.this.mo97923b(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ep.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f93219s;

        /* renamed from: t */
        Object f93220t;

        /* renamed from: u */
        /* synthetic */ Object f93221u;

        /* renamed from: w */
        int f93223w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93221u = obj;
            this.f93223w |= Integer.MIN_VALUE;
            return C18535e.this.mo97922a(null, this);
        }
    }

    public C18535e(InterfaceC18531a interfaceC18531a, InterfaceC18532b interfaceC18532b, C18538h c18538h) {
        AbstractC19074t.m100208f(interfaceC18531a, "zShortVideoAPI");
        AbstractC19074t.m100208f(interfaceC18532b, "zShortVideoInfoCache");
        AbstractC19074t.m100208f(c18538h, "zShortVideoRedirectCache");
        this.f93211p = interfaceC18531a;
        this.f93212q = interfaceC18532b;
        this.f93213r = c18538h;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p138ep.InterfaceC18531a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97922a(String str, Continuation continuation) {
        c cVar;
        Object obj;
        Object m142578e;
        int i11;
        C3023p3 mo97925f;
        C18535e c18535e;
        C3023p3 c3023p3;
        C3023p3 c3023p32;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f93223w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f93223w = i12 - Integer.MIN_VALUE;
                obj = cVar.f93221u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f93223w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c3023p3 = (C3023p3) cVar.f93220t;
                            c3023p32 = (C3023p3) cVar.f93219s;
                            AbstractC24862s.m129228b(obj);
                            c3023p3.m14562s(((C3028q3) obj).m14577a());
                            return c3023p32;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.f93220t;
                    c18535e = (C18535e) cVar.f93219s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    mo97925f = this.f93212q.mo97925f(str);
                    if (mo97925f != null && mo97925f.m14558o() && !mo97925f.m14557n()) {
                        c18535e = this;
                        C3023p3 c3023p33 = mo97925f;
                        String str2 = str;
                        c3023p3 = c3023p33;
                        String m14550g = c3023p3.m14550g();
                        cVar.f93219s = c3023p3;
                        cVar.f93220t = c3023p3;
                        cVar.f93223w = 2;
                        obj = c18535e.mo97923b(str2, m14550g, cVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c3023p32 = c3023p3;
                        c3023p3.m14562s(((C3028q3) obj).m14577a());
                        return c3023p32;
                    }
                    InterfaceC18531a interfaceC18531a = this.f93211p;
                    cVar.f93219s = this;
                    cVar.f93220t = str;
                    cVar.f93223w = 1;
                    obj = interfaceC18531a.mo97922a(str, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c18535e = this;
                }
                mo97925f = (C3023p3) obj;
                c18535e.f93212q.mo97924c(mo97925f);
                C3023p3 c3023p332 = mo97925f;
                String str22 = str;
                c3023p3 = c3023p332;
                String m14550g2 = c3023p3.m14550g();
                cVar.f93219s = c3023p3;
                cVar.f93220t = c3023p3;
                cVar.f93223w = 2;
                obj = c18535e.mo97923b(str22, m14550g2, cVar);
                if (obj == m142578e) {
                }
            }
        }
        cVar = new c(continuation);
        obj = cVar.f93221u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f93223w;
        if (i11 == 0) {
        }
        mo97925f = (C3023p3) obj;
        c18535e.f93212q.mo97924c(mo97925f);
        C3023p3 c3023p3322 = mo97925f;
        String str222 = str;
        c3023p3 = c3023p3322;
        String m14550g22 = c3023p3.m14550g();
        cVar.f93219s = c3023p3;
        cVar.f93220t = c3023p3;
        cVar.f93223w = 2;
        obj = c18535e.mo97923b(str222, m14550g22, cVar);
        if (obj == m142578e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p138ep.InterfaceC18531a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97923b(String str, String str2, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C18535e c18535e;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f93218w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f93218w = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f93216u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f93218w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str = (String) bVar.f93215t;
                        c18535e = (C18535e) bVar.f93214s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C3028q3 m97944A = this.f93213r.m97944A(str);
                    if (m97944A == null || !m97944A.m14578b()) {
                        InterfaceC18531a interfaceC18531a = this.f93211p;
                        bVar.f93214s = this;
                        bVar.f93215t = str;
                        bVar.f93218w = 1;
                        obj = interfaceC18531a.mo97923b(str, str2, bVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c18535e = this;
                    } else {
                        return m97944A;
                    }
                }
                C3028q3 c3028q3 = (C3028q3) obj;
                c18535e.f93213r.m97945B(str, c3028q3);
                return c3028q3;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f93216u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f93218w;
        if (i11 == 0) {
        }
        C3028q3 c3028q32 = (C3028q3) obj2;
        c18535e.f93213r.m97945B(str, c3028q32);
        return c3028q32;
    }

    @Override // p138ep.InterfaceC18532b
    /* renamed from: c */
    public void mo97924c(C3023p3 c3023p3) {
        AbstractC19074t.m100208f(c3023p3, "video");
        this.f93212q.mo97924c(c3023p3);
    }

    @Override // p138ep.InterfaceC18532b
    /* renamed from: f */
    public C3023p3 mo97925f(String str) {
        AbstractC19074t.m100208f(str, "zVidId");
        return this.f93212q.mo97925f(str);
    }
}
