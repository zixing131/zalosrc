package bp0;

import ae.C0766k;
import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: bp0.a0 */
/* loaded from: classes7.dex */
public final class C3080a0 {

    /* renamed from: a */
    public static final C3080a0 f13112a = new C3080a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.a0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f13113t;

        /* renamed from: u */
        final /* synthetic */ boolean f13114u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f13114u = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f13114u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f13113t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f13114u) {
                    this.f13113t = 1;
                    if (DelayKt.m112666b(3000L, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            C3080a0 c3080a0 = C3080a0.f13112a;
            if (c3080a0.m15410d(this.f13114u)) {
                if (AbstractC23304d.f113263C1 && !c3080a0.m15411h()) {
                    c3080a0.m15413k(c3080a0.m15415f());
                    if (this.f13114u) {
                        AbstractC0924m0.m3815fj(System.currentTimeMillis());
                    }
                } else if (!AbstractC23304d.f113263C1 && c3080a0.m15411h()) {
                    c3080a0.m15413k(c3080a0.m15417j() ? 1 : 0);
                    if (this.f13114u) {
                        AbstractC0924m0.m3815fj(System.currentTimeMillis());
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp0.a0$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f13115a;

        b(int i11) {
            this.f13115a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC3082b0.m15424f(toString(), "updatePrivacySetting onErrorData  " + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                AbstractC23148n.m118848v(25, this.f13115a);
            } catch (Exception e11) {
                e11.printStackTrace();
                AbstractC3082b0.m15422d(toString(), "updatePrivacySetting failed with " + e11);
            }
        }
    }

    private C3080a0() {
    }

    /* renamed from: d */
    public final boolean m15410d(boolean z11) {
        if (!z11) {
            return true;
        }
        if (AbstractC0924m0.m4279v5() == -1) {
            return false;
        }
        if (System.currentTimeMillis() - AbstractC0924m0.m3828g2() >= 43200000) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m15411h() {
        return m15412i(AbstractC0924m0.m4279v5());
    }

    /* renamed from: i */
    private final boolean m15412i(int i11) {
        return i11 == 2 || i11 == 3 || i11 == 4;
    }

    /* renamed from: k */
    public final void m15413k(int i11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(i11));
        c0766k.mo1545U3(25, i11, "");
    }

    /* renamed from: e */
    public final synchronized Job m15414e(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new a(z11, null), 3, null);
        return m112540d;
    }

    /* renamed from: f */
    public final int m15415f() {
        int m4279v5 = AbstractC0924m0.m4279v5();
        if (m4279v5 == 0) {
            return 2;
        }
        if (m4279v5 != 1) {
            if (m4279v5 == 2) {
                return 2;
            }
            if (m4279v5 != 3) {
                if (m4279v5 != 4 && !AbstractC23309i.m122239oa()) {
                    return 2;
                }
            } else {
                return 3;
            }
        }
        return 4;
    }

    /* renamed from: g */
    public final String m15416g() {
        int m15415f = m15415f();
        if (m15415f != 2) {
            if (m15415f != 3) {
                if (m15415f != 4) {
                    return "";
                }
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_friend_and_stranger);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_all);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_friend);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* renamed from: j */
    public final boolean m15417j() {
        int m15415f = m15415f();
        if (m15415f == 0 || m15415f == 2) {
            return false;
        }
        return true;
    }
}
