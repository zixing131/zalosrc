package h70;

import ae.C0766k;
import am.C0927o;
import am.C0943w;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.utils.ToastUtils;
import dj.C18005u0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import h70.C19914h;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p131ei.C18434b;
import p363nh.C23744a;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p495rx.C25994h;
import p495rx.C26000n;
import p534u1.AbstractC26941a;
import p588vw.C28652r;
import p665y0.C30240b;
import p716zh.C31862c;
import p716zh.C31961i8;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25376w;
import vg.C28176r6;
import vg.C28203u6;

/* renamed from: h70.h */
/* loaded from: classes5.dex */
public final class C19914h extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f98116A;

    /* renamed from: B */
    private final LiveData f98117B;

    /* renamed from: C */
    private C19909c f98118C;

    /* renamed from: D */
    private C31862c f98119D;

    /* renamed from: E */
    private final ArrayList f98120E;

    /* renamed from: F */
    private final ArrayList f98121F;

    /* renamed from: G */
    private final C30240b f98122G;

    /* renamed from: H */
    private final C30240b f98123H;

    /* renamed from: I */
    private final C1761c0 f98124I;

    /* renamed from: J */
    private final LiveData f98125J;

    /* renamed from: K */
    private final C1761c0 f98126K;

    /* renamed from: L */
    private final LiveData f98127L;

    /* renamed from: M */
    private final AtomicBoolean f98128M;

    /* renamed from: N */
    private final C1761c0 f98129N;

    /* renamed from: O */
    private final LiveData f98130O;

    /* renamed from: P */
    private final C1761c0 f98131P;

    /* renamed from: Q */
    private final LiveData f98132Q;

    /* renamed from: R */
    private final Handler f98133R;

    /* renamed from: S */
    private final LinkedHashSet f98134S;

    /* renamed from: s */
    private String f98135s;

    /* renamed from: t */
    private final AtomicBoolean f98136t = new AtomicBoolean(false);

    /* renamed from: u */
    private final C1761c0 f98137u;

    /* renamed from: v */
    private final LiveData f98138v;

    /* renamed from: w */
    private C31961i8 f98139w;

    /* renamed from: x */
    private final C1761c0 f98140x;

    /* renamed from: y */
    private final LiveData f98141y;

    /* renamed from: z */
    private final ArrayList f98142z;

    /* renamed from: h70.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: h70.h$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo80430a(C19909c c19909c);

        /* renamed from: b */
        void mo80431b();
    }

    /* renamed from: h70.h$c */
    /* loaded from: classes5.dex */
    public static final class c implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C19914h();
        }
    }

    /* renamed from: h70.h$d */
    /* loaded from: classes5.dex */
    public interface d {
        /* renamed from: a */
        void mo80433a(C31961i8 c31961i8);

        /* renamed from: b */
        void mo80434b(int i11);

        /* renamed from: c */
        void mo80435c(C31961i8 c31961i8);
    }

    /* renamed from: h70.h$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                C1761c0 c1761c0 = C19914h.this.f98126K;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                c1761c0.mo9221n(new C19908b(false, m104491c, m104492d));
                if (c20096c.m104491c() == -17212) {
                    C19914h.this.m103660r0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C19914h.this.f98128M.compareAndSet(true, false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            int m127178g0;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19914h.this.f98126K.mo9221n(new C19908b(false, 0, null, 6, null));
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    C31961i8 c31961i8 = new C31961i8(optJSONObject);
                    C28176r6.m141702d().m141711l(c31961i8);
                    String m153669g = c31961i8.m153669g();
                    int i11 = AbstractC8020f0.str_msg_info_close_poll;
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    String m118746s0 = AbstractC23136l9.m118746s0(i11, c6895a.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g);
                    AbstractC19074t.m100207e(m118746s0, "getString(...)");
                    C7907e c7907e = new C7907e();
                    AbstractC19074t.m100205c(m153669g);
                    m127178g0 = AbstractC24342w.m127178g0(m118746s0, m153669g, 0, false, 6, null);
                    c7907e.m40852b(new C7907e.a(m127178g0, m153669g.length()));
                    AbstractC19646n0.m102983h1(m118746s0, new C18005u0.a().m95727i(9).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), c6895a.m35500c().getString(AbstractC8020f0.str_view)).m95725g(c7907e).m95729k(c31961i8.f146880a, c31961i8.f146895p).m95722d("share"), C0943w.f3447a.m4472f(c31961i8.f146883d), -1L);
                    C25490c.m132054j().m132060f(c31961i8);
                    C23744a.Companion.m124119a().m124116d(66, new Object[0]);
                    C19914h.this.m103625W0(c31961i8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C19914h.this.f98128M.compareAndSet(true, false);
        }
    }

    /* renamed from: h70.h$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC20094a {
        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C19914h.this.f98136t.compareAndSet(true, false);
            C19914h.this.f98137u.mo9221n(new C19910d(false, c20096c.m104491c()));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            C19914h.this.f98136t.compareAndSet(true, false);
            try {
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    C19914h.this.f98137u.mo9221n(new C19910d(false, 0));
                    C31961i8 c31961i8 = new C31961i8(optJSONObject);
                    C19914h.this.m103625W0(c31961i8);
                    C28176r6.m141702d().m141711l(c31961i8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C19914h.this.f98137u.mo9221n(new C19910d(false, -1));
            }
        }
    }

    /* renamed from: h70.h$g */
    /* loaded from: classes5.dex */
    public static final class g implements C18434b.e {
        g() {
        }

        /* renamed from: c */
        public static final void m103667c(C19914h c19914h, C31862c c31862c) {
            AbstractC19074t.m100208f(c19914h, "this$0");
            if (c31862c == null || c31862c.m153154f() || c31862c.f146332y || !c31862c.m153155h() || !c31862c.m153149a()) {
                c31862c = null;
            }
            c19914h.f98119D = c31862c;
            c19914h.m103623V0();
            if (c19914h.f98118C != null) {
                C19909c c19909c = c19914h.f98118C;
                AbstractC19074t.m100205c(c19909c);
                c19914h.m103606D0(c19909c);
            }
        }

        @Override // p131ei.C18434b.e
        /* renamed from: a */
        public void mo64321a(int i11, C31862c c31862c) {
            AbstractC19444a.m101697e(new Runnable() { // from class: h70.i

                /* renamed from: q */
                public final /* synthetic */ C31862c f98157q;

                public /* synthetic */ RunnableC19915i(C31862c c31862c2) {
                    r2 = c31862c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19914h.g.m103667c(C19914h.this, r2);
                }
            });
        }
    }

    /* renamed from: h70.h$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f98147b;

        h(String str) {
            this.f98147b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                C1761c0 c1761c0 = C19914h.this.f98129N;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                c1761c0.mo9221n(new C19918l(false, m104491c, m104492d));
                if (c20096c.m104491c() == 17064) {
                    C25994h.f124017a.m133919h("group_" + this.f98147b).m133960l();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19914h.this.f98129N.mo9221n(new C19918l(false, 0, null, 6, null));
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    new C7904b(optJSONObject, "group_" + this.f98147b);
                    C0943w.f3447a.m4472f(this.f98147b);
                    AbstractC23184q2.m119438C(this.f98147b);
                    AbstractC19646n0.m102996k2();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: h70.h$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ List f98149b;

        /* renamed from: c */
        final /* synthetic */ boolean f98150c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f98151d;

        i(List list, boolean z11, WeakReference weakReference) {
            this.f98149b = list;
            this.f98150c = z11;
            this.f98151d = weakReference;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                C1761c0 c1761c0 = C19914h.this.f98124I;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                c1761c0.mo9221n(new C19920n(false, m104491c, m104492d));
                if (c20096c.m104491c() == -17212) {
                    C19914h.this.m103660r0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0005, B:5:0x0023, B:7:0x002b, B:9:0x0035, B:12:0x0048, B:14:0x0053, B:17:0x005a, B:19:0x006c, B:20:0x0076, B:23:0x00ff, B:24:0x011e, B:27:0x0128, B:28:0x0129, B:30:0x0136, B:36:0x0148, B:37:0x0149, B:40:0x0071, B:41:0x0074, B:26:0x011f), top: B:2:0x0005, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            boolean z11;
            boolean z12;
            int i11;
            int m127178g0;
            String str;
            C19914h c19914h;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19914h.this.f98124I.mo9221n(new C19920n(false, 0, null, 6, null));
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    if (C19914h.this.f98139w != null) {
                        C31961i8 c31961i8 = C19914h.this.f98139w;
                        AbstractC19074t.m100205c(c31961i8);
                        if (c31961i8.f146898s) {
                            z11 = true;
                            if (!(!this.f98149b.isEmpty()) && !this.f98150c) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            C31961i8 c31961i82 = new C31961i8(optJSONObject);
                            C28176r6.m141702d().m141711l(c31961i82);
                            String m153669g = c31961i82.m153669g();
                            if (!z12) {
                                i11 = AbstractC8020f0.str_msg_info_add_poll_option;
                            } else if (!z11) {
                                i11 = AbstractC8020f0.str_msg_info_vote_poll;
                            } else {
                                i11 = AbstractC8020f0.str_msg_info_update_poll;
                            }
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            MainApplication.C6895a c6895a = MainApplication.Companion;
                            String string = c6895a.m35500c().getString(i11);
                            AbstractC19074t.m100207e(string, "getString(...)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{c6895a.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g}, 2));
                            AbstractC19074t.m100207e(format, "format(...)");
                            C7907e c7907e = new C7907e();
                            AbstractC19074t.m100205c(m153669g);
                            m127178g0 = AbstractC24342w.m127178g0(format, m153669g, 0, false, 6, null);
                            c7907e.m40852b(new C7907e.a(m127178g0, m153669g.length()));
                            C18005u0.a m95729k = new C18005u0.a().m95727i(9).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i82.f146880a), c6895a.m35500c().getString(AbstractC8020f0.str_view)).m95725g(c7907e).m95729k(c31961i82.f146880a, c31961i82.f146895p);
                            C31973j5 m4472f = C0943w.f3447a.m4472f(c31961i82.f146883d);
                            if (z11) {
                                str = "vote";
                            } else {
                                str = "update";
                            }
                            AbstractC19646n0.m102983h1(format, m95729k.m95722d(str), m4472f, -1L);
                            C25490c.m132054j().m132060f(c31961i82);
                            C23744a.Companion.m124119a().m124116d(66, new Object[0]);
                            c19914h = C19914h.this;
                            synchronized (c19914h) {
                                c19914h.f98121F.clear();
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                            C19914h.this.m103625W0(c31961i82);
                            if (this.f98151d.get() != null) {
                                Object obj2 = this.f98151d.get();
                                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.ui.group.poll.PollDetailViewModel.SavePollCallback");
                                ((d) obj2).mo80435c(c31961i82);
                                return;
                            }
                            return;
                        }
                    }
                    z11 = false;
                    if (!(!this.f98149b.isEmpty())) {
                    }
                    z12 = false;
                    C31961i8 c31961i822 = new C31961i8(optJSONObject);
                    C28176r6.m141702d().m141711l(c31961i822);
                    String m153669g2 = c31961i822.m153669g();
                    if (!z12) {
                    }
                    C19067n0 c19067n02 = C19067n0.f94947a;
                    MainApplication.C6895a c6895a2 = MainApplication.Companion;
                    String string2 = c6895a2.m35500c().getString(i11);
                    AbstractC19074t.m100207e(string2, "getString(...)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{c6895a2.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g2}, 2));
                    AbstractC19074t.m100207e(format2, "format(...)");
                    C7907e c7907e2 = new C7907e();
                    AbstractC19074t.m100205c(m153669g2);
                    m127178g0 = AbstractC24342w.m127178g0(format2, m153669g2, 0, false, 6, null);
                    c7907e2.m40852b(new C7907e.a(m127178g0, m153669g2.length()));
                    C18005u0.a m95729k2 = new C18005u0.a().m95727i(9).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i822.f146880a), c6895a2.m35500c().getString(AbstractC8020f0.str_view)).m95725g(c7907e2).m95729k(c31961i822.f146880a, c31961i822.f146895p);
                    C31973j5 m4472f2 = C0943w.f3447a.m4472f(c31961i822.f146883d);
                    if (z11) {
                    }
                    AbstractC19646n0.m102983h1(format2, m95729k2.m95722d(str), m4472f2, -1L);
                    C25490c.m132054j().m132060f(c31961i822);
                    C23744a.Companion.m124119a().m124116d(66, new Object[0]);
                    c19914h = C19914h.this;
                    synchronized (c19914h) {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: h70.h$j */
    /* loaded from: classes5.dex */
    public static final class j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f98152a;

        /* renamed from: b */
        final /* synthetic */ C19914h f98153b;

        j(String str, C19914h c19914h) {
            this.f98152a = str;
            this.f98153b = c19914h;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C1761c0 c1761c0 = this.f98153b.f98131P;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            c1761c0.mo9221n(new C19921o(false, m104491c, m104492d));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C1761c0 c1761c0;
            C19921o c19921o;
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            String str = "";
            try {
                try {
                    JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                        AbstractC19646n0.m103014p0(new C31961i8(optJSONObject), this.f98152a);
                        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_poll_new_poll_is_added_to_group_chat_v2);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        str = string;
                    }
                    c1761c0 = this.f98153b.f98131P;
                    c19921o = new C19921o(false, 0, str);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    c1761c0 = this.f98153b.f98131P;
                    c19921o = new C19921o(false, 0, "");
                }
                c1761c0.mo9221n(c19921o);
            } catch (Throwable th2) {
                this.f98153b.f98131P.mo9221n(new C19921o(false, 0, ""));
                throw th2;
            }
        }
    }

    /* renamed from: h70.h$k */
    /* loaded from: classes5.dex */
    public static final class k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C26000n f98154a;

        k(C26000n c26000n) {
            this.f98154a = c26000n;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                this.f98154a.m133960l();
                ToastUtils.showMess(c20096c.m104492d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            AbstractC19646n0.m103000l2();
        }
    }

    /* renamed from: h70.h$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final l f98155q = new l();

        l() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(C31961i8.a aVar, C31961i8.a aVar2) {
            int i11;
            if (aVar != null && aVar2 != null) {
                i11 = aVar2.f146902b - aVar.f146902b;
            } else if (aVar != null) {
                i11 = -1;
            } else if (aVar2 != null) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    public C19914h() {
        C1761c0 c1761c0 = new C1761c0();
        this.f98137u = c1761c0;
        this.f98138v = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f98140x = c1761c02;
        this.f98141y = c1761c02;
        this.f98142z = new ArrayList();
        C1761c0 c1761c03 = new C1761c0();
        this.f98116A = c1761c03;
        this.f98117B = c1761c03;
        this.f98120E = new ArrayList();
        this.f98121F = new ArrayList();
        this.f98122G = new C30240b();
        this.f98123H = new C30240b();
        C1761c0 c1761c04 = new C1761c0();
        this.f98124I = c1761c04;
        this.f98125J = c1761c04;
        C1761c0 c1761c05 = new C1761c0();
        this.f98126K = c1761c05;
        this.f98127L = c1761c05;
        this.f98128M = new AtomicBoolean(false);
        C1761c0 c1761c06 = new C1761c0();
        this.f98129N = c1761c06;
        this.f98130O = c1761c06;
        C1761c0 c1761c07 = new C1761c0();
        this.f98131P = c1761c07;
        this.f98132Q = c1761c07;
        this.f98133R = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: h70.f
            public /* synthetic */ C19912f() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m103615Q0;
                m103615Q0 = C19914h.m103615Q0(C19914h.this, message);
                return m103615Q0;
            }
        });
        this.f98134S = new LinkedHashSet();
    }

    /* renamed from: B0 */
    private final void m103604B0() {
        String str;
        C18434b m97695b = C18434b.Companion.m97695b();
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 != null) {
            str = c31961i8.f146883d;
        } else {
            str = null;
        }
        m97695b.m97685n(21, str, null, new g());
    }

    /* renamed from: C0 */
    private final void m103605C0() {
        synchronized (this.f98134S) {
            try {
                Iterator it = this.f98134S.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).mo80431b();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D0 */
    public final void m103606D0(C19909c c19909c) {
        synchronized (this.f98134S) {
            try {
                Iterator it = this.f98134S.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).mo80430a(c19909c);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K0 */
    public static final void m103607K0(C31862c c31862c, C19914h c19914h) {
        AbstractC19074t.m100208f(c31862c, "$it");
        AbstractC19074t.m100208f(c19914h, "this$0");
        if (AbstractC19074t.m100204b(c31862c, c19914h.f98119D)) {
            c19914h.m103623V0();
            C19909c c19909c = c19914h.f98118C;
            if (c19909c != null) {
                AbstractC19074t.m100205c(c19909c);
                c19914h.m103606D0(c19909c);
            }
        }
    }

    /* renamed from: L0 */
    private final void m103608L0(List list, List list2, boolean z11, d dVar) {
        WeakReference weakReference = new WeakReference(dVar);
        this.f98124I.mo9221n(new C19920n(true, 0, null, 6, null));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i(list, z11, weakReference));
        c0766k.mo1731s3(this.f98135s, list, list2);
    }

    /* renamed from: N0 */
    private final void m103611N0(long j11) {
        this.f98133R.sendEmptyMessageDelayed(1, j11);
    }

    /* renamed from: Q0 */
    public static final boolean m103615Q0(C19914h c19914h, Message message) {
        AbstractC19074t.m100208f(c19914h, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        C31961i8 c31961i8 = c19914h.f98139w;
        if (c31961i8 != null) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c19914h.m103660r0();
                        c19914h.m103605C0();
                    }
                } else {
                    c19914h.m103619T0();
                }
            } else if (c31961i8.f146894o > 0 && !c31961i8.m153671i()) {
                long m103637y0 = c19914h.m103637y0(c31961i8);
                if (m103637y0 > 0) {
                    c19914h.m103611N0(m103637y0);
                } else {
                    c19914h.m103623V0();
                    C19909c c19909c = c19914h.f98118C;
                    if (c19909c != null) {
                        AbstractC19074t.m100205c(c19909c);
                        c19914h.m103606D0(c19909c);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: T0 */
    private final void m103619T0() {
        int i11;
        this.f98133R.removeMessages(2);
        synchronized (this) {
            try {
                this.f98142z.clear();
                this.f98120E.clear();
                C31961i8 c31961i8 = this.f98139w;
                if (c31961i8 != null) {
                    boolean z11 = false;
                    C19909c c19909c = new C19909c(0);
                    c19909c.m103600e(m103636s0());
                    this.f98142z.add(c19909c);
                    this.f98118C = c19909c;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = c31961i8.f146882c;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    arrayList.addAll(this.f98121F);
                    AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: h70.e
                        public /* synthetic */ C19911e() {
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m103621U0;
                            m103621U0 = C19914h.m103621U0(InterfaceC18509p.this, obj, obj2);
                            return m103621U0;
                        }
                    });
                    if (c31961i8.m153671i()) {
                        i11 = 2;
                    } else {
                        i11 = c31961i8.f146896q;
                    }
                    boolean m153672j = c31961i8.m153672j();
                    boolean m103654j0 = m103654j0();
                    int i12 = 1;
                    if (c31961i8.f146897r > 0) {
                        z11 = true;
                    }
                    boolean z12 = c31961i8.f146888i;
                    boolean z13 = c31961i8.f146890k;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C31961i8.a aVar = (C31961i8.a) it.next();
                        C19909c c19909c2 = new C19909c(i12);
                        AbstractC19074t.m100205c(aVar);
                        boolean contains = this.f98123H.contains(aVar.f146905e);
                        CharSequence m143357H = C28652r.m143349v().m143357H(aVar.f146901a);
                        AbstractC19074t.m100207e(m143357H, "getTextEmoticonParsed(...)");
                        boolean z14 = z13;
                        boolean z15 = z12;
                        c19909c2.m103601f(new C19917k(aVar, contains, m143357H, 0.0f, m153672j, m103654j0, i11, z11, z15, z14));
                        this.f98120E.add(c19909c2);
                        z13 = z14;
                        z12 = z15;
                        i12 = 1;
                    }
                    m103627X0();
                    this.f98142z.addAll(this.f98120E);
                    if (!c31961i8.m153671i() && m103654j0 && c31961i8.f146889j) {
                        this.f98142z.add(new C19909c(2));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f98116A.mo9221n(this.f98142z);
    }

    /* renamed from: U0 */
    public static final int m103621U0(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: V0 */
    public final void m103623V0() {
        C19909c c19909c;
        if (this.f98139w != null && (c19909c = this.f98118C) != null) {
            AbstractC19074t.m100205c(c19909c);
            c19909c.m103600e(m103636s0());
        }
    }

    /* renamed from: W0 */
    public final void m103625W0(C31961i8 c31961i8) {
        String str;
        String str2;
        String str3;
        this.f98139w = c31961i8;
        synchronized (this) {
            try {
                C30240b c30240b = new C30240b(this.f98122G);
                C30240b c30240b2 = new C30240b(this.f98123H);
                new C30240b(c30240b).m149115n(c30240b2);
                new C30240b(c30240b2).m149115n(c30240b);
                HashMap hashMap = new HashMap();
                this.f98122G.clear();
                this.f98123H.clear();
                C31961i8 c31961i82 = this.f98139w;
                if (c31961i82 != null) {
                    Iterator it = c31961i82.f146882c.iterator();
                    while (it.hasNext()) {
                        C31961i8.a aVar = (C31961i8.a) it.next();
                        String str4 = aVar.f146901a;
                        AbstractC19074t.m100207e(str4, "text");
                        AbstractC19074t.m100205c(aVar);
                        hashMap.put(str4, aVar);
                        if (aVar.f146903c) {
                            this.f98122G.add(aVar.f146905e);
                        }
                    }
                    this.f98123H.m149113d(this.f98122G);
                    if (c31961i82.m153671i()) {
                        this.f98121F.clear();
                    } else if (!c31961i82.f146892m && !this.f98122G.isEmpty()) {
                        Iterator it2 = this.f98121F.iterator();
                        AbstractC19074t.m100207e(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            AbstractC19074t.m100207e(next, "next(...)");
                            C31961i8.a aVar2 = (C31961i8.a) next;
                            if (((C31961i8.a) hashMap.get(aVar2.f146901a)) != null) {
                                it2.remove();
                            } else {
                                aVar2.f146903c = false;
                            }
                        }
                    } else if (!c31961i82.f146888i) {
                        String str5 = null;
                        if (!c30240b2.isEmpty()) {
                            str = (String) c30240b2.m149117r(0);
                        } else {
                            str = null;
                        }
                        if (!c30240b.isEmpty()) {
                            str2 = (String) c30240b.m149117r(0);
                        } else {
                            str2 = null;
                        }
                        if (!this.f98122G.isEmpty()) {
                            str3 = (String) this.f98122G.m149117r(0);
                        } else {
                            str3 = null;
                        }
                        Iterator it3 = this.f98121F.iterator();
                        AbstractC19074t.m100207e(it3, "iterator(...)");
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            AbstractC19074t.m100207e(next2, "next(...)");
                            C31961i8.a aVar3 = (C31961i8.a) next2;
                            C31961i8.a aVar4 = (C31961i8.a) hashMap.get(aVar3.f146901a);
                            if (aVar4 != null) {
                                if (AbstractC19074t.m100204b(str, aVar3.f146905e)) {
                                    str5 = aVar4.f146905e;
                                }
                                it3.remove();
                            }
                        }
                        if (str5 == null) {
                            if (!AbstractC19074t.m100204b(str3, str2) && AbstractC19074t.m100204b(str, str2)) {
                                str = str3;
                            }
                            str5 = str;
                        }
                        this.f98123H.clear();
                        if (str5 != null) {
                            this.f98123H.add(str5);
                        }
                    } else {
                        if ((!c30240b2.isEmpty()) || (!r1.isEmpty())) {
                            Iterator it4 = c31961i82.f146882c.iterator();
                            while (it4.hasNext()) {
                                C31961i8.a aVar5 = (C31961i8.a) it4.next();
                                if (aVar5.f146903c) {
                                    if (c30240b.contains(aVar5.f146905e)) {
                                        if (c30240b2.contains(aVar5.f146905e)) {
                                            this.f98123H.add(aVar5.f146905e);
                                        } else {
                                            this.f98123H.remove(aVar5.f146905e);
                                        }
                                    } else {
                                        this.f98123H.add(aVar5.f146905e);
                                    }
                                } else if (!c30240b.contains(aVar5.f146905e)) {
                                    if (c30240b2.contains(aVar5.f146905e)) {
                                        this.f98123H.add(aVar5.f146905e);
                                    } else {
                                        this.f98123H.remove(aVar5.f146905e);
                                    }
                                } else {
                                    this.f98123H.remove(aVar5.f146905e);
                                }
                            }
                        }
                        Iterator it5 = this.f98121F.iterator();
                        AbstractC19074t.m100207e(it5, "iterator(...)");
                        while (it5.hasNext()) {
                            Object next3 = it5.next();
                            AbstractC19074t.m100207e(next3, "next(...)");
                            C31961i8.a aVar6 = (C31961i8.a) next3;
                            C31961i8.a aVar7 = (C31961i8.a) hashMap.get(aVar6.f146901a);
                            if (aVar7 != null) {
                                if (!aVar7.f146903c && c30240b2.contains(aVar6.f146905e)) {
                                    this.f98123H.add(aVar7.f146905e);
                                }
                                it5.remove();
                            } else if (c30240b2.contains(aVar6.f146905e)) {
                                this.f98123H.add(aVar6.f146905e);
                            }
                        }
                    }
                }
                this.f98140x.mo9221n(this.f98139w);
                m103619T0();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X0 */
    private final void m103627X0() {
        int i11;
        C31961i8.a m103683c;
        synchronized (this) {
            try {
                C31961i8 c31961i8 = this.f98139w;
                if (c31961i8 != null) {
                    int m103638z0 = m103638z0();
                    Iterator it = this.f98120E.iterator();
                    while (it.hasNext()) {
                        C19909c c19909c = (C19909c) it.next();
                        if (m103638z0 <= 0) {
                            C19917k m103599d = c19909c.m103599d();
                            if (m103599d != null) {
                                m103599d.m103690j(0.0f);
                            }
                        } else {
                            C19917k m103599d2 = c19909c.m103599d();
                            if (m103599d2 != null) {
                                C19917k m103599d3 = c19909c.m103599d();
                                if (m103599d3 != null && (m103683c = m103599d3.m103683c()) != null) {
                                    i11 = m103683c.f146902b;
                                } else {
                                    i11 = 0;
                                }
                                m103599d2.m103690j(i11 / m103638z0);
                            }
                        }
                        C19917k m103599d4 = c19909c.m103599d();
                        if (m103599d4 != null) {
                            m103599d4.m103689i(c31961i8.m153672j());
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f0 */
    private final boolean m103633f0(String str) {
        ArrayList arrayList;
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 != null) {
            arrayList = c31961i8.f146882c;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(str, ((C31961i8.a) it.next()).f146901a)) {
                return true;
            }
        }
        synchronized (this) {
            Iterator it2 = this.f98121F.iterator();
            while (it2.hasNext()) {
                if (AbstractC19074t.m100204b(str, ((C31961i8.a) it2.next()).f146901a)) {
                    return true;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return false;
        }
    }

    /* renamed from: k0 */
    private final boolean m103634k0() {
        synchronized (this) {
            C30240b c30240b = new C30240b(this.f98123H);
            if (c30240b.size() != this.f98122G.size()) {
                return true;
            }
            c30240b.m149115n(this.f98122G);
            if (!c30240b.isEmpty()) {
                return true;
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return false;
        }
    }

    /* renamed from: n0 */
    private final String m103635n0(long j11, long j12) {
        if (j12 - j11 > 0) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_prefix_count_down_end_time_poll_text, AbstractC23160o0.m119198I0(j11, j12));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            return m118746s0;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* renamed from: s0 */
    private final C19916j m103636s0() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        String str5;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_multivote_disable_text);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C31961i8 c31961i8 = this.f98139w;
        String str6 = "";
        if (c31961i8 != null) {
            ?? m143357H = C28652r.m143349v().m143357H(c31961i8.f146881b);
            AbstractC19074t.m100207e(m143357H, "getTextEmoticonParsed(...)");
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c31961i8.f146884e, null, 2, null);
            StringBuilder sb2 = new StringBuilder();
            if (m141798e != null) {
                sb2.append(AbstractC23028c0.m118085e(m141798e, false, AbstractC8020f0.str_me));
                sb2.append(" • ");
                sb2.append(AbstractC23160o0.m119181A(c31961i8.f146893n));
                str2 = sb2.toString();
                AbstractC19074t.m100207e(str2, "toString(...)");
            } else {
                String str7 = c31961i8.f146885f;
                AbstractC19074t.m100207e(str7, "creatorName");
                if (str7.length() <= 0) {
                    str2 = "";
                } else {
                    sb2.append(c31961i8.f146885f);
                    sb2.append(" • ");
                    sb2.append(AbstractC23160o0.m119181A(c31961i8.f146893n));
                    str2 = sb2.toString();
                    AbstractC19074t.m100207e(str2, "toString(...)");
                }
            }
            if (c31961i8.f146894o > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                str5 = "";
                z12 = false;
            } else {
                z12 = c31961i8.m153671i();
                if (z12) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(c31961i8.f146894o);
                    str5 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_prefix_ended_on_poll_text, AbstractC23160o0.m119190E0(calendar, true));
                    AbstractC19074t.m100207e(str5, "getString(...)");
                } else {
                    str5 = m103635n0(AbstractC23160o0.m119186C0(), c31961i8.f146894o);
                }
            }
            if (c31961i8.f146888i) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_multivote_enable_text);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
            boolean z16 = c31961i8.f146890k;
            boolean z17 = c31961i8.f146891l;
            boolean m153664a = c31961i8.m153664a();
            int m103638z0 = m103638z0();
            if (m103638z0 > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_num_member_voted);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(m103638z0);
                if (m103638z0 > 1) {
                    str6 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr[1] = str6;
                str6 = String.format(m118743r02, Arrays.copyOf(objArr, 2));
                AbstractC19074t.m100207e(str6, "format(...)");
            }
            str4 = str6;
            str6 = m143357H;
            str3 = str5;
            z13 = z16;
            z14 = z17;
            i11 = m103638z0;
            str = m118743r0;
            z15 = m153664a;
        } else {
            str = m118743r0;
            str2 = "";
            str3 = str2;
            str4 = str3;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = true;
            i11 = 0;
        }
        C19916j c19916j = new C19916j(str6, str2, z11, z12, str3, z13, z14, z15, str, i11, str4);
        c19916j.m103680l(this.f98119D);
        return c19916j;
    }

    /* renamed from: y0 */
    private final long m103637y0(C31961i8 c31961i8) {
        long m119186C0 = AbstractC23160o0.m119186C0();
        long j11 = c31961i8.f146894o - m119186C0;
        long j12 = 60000;
        if (j11 > 60000) {
            if (j11 <= 3600000) {
                long j13 = j11 % 60000;
                if (j13 != 0) {
                    return j13;
                }
            } else {
                j12 = 86400000;
                if (j11 <= 86400000) {
                    long j14 = j11 % 3600000;
                    if (j14 == 0) {
                        return 3600000L;
                    }
                    return j14;
                }
                if (j11 - 86400000 < 86400000) {
                    long j15 = j11 % 86400000;
                    if (j15 != 0) {
                        return j15;
                    }
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(86400000 + m119186C0);
                    AbstractC23160o0.m119301w1(calendar);
                    return calendar.getTimeInMillis() - m119186C0;
                }
            }
            return j12;
        }
        return j11;
    }

    /* renamed from: z0 */
    private final int m103638z0() {
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 == null || c31961i8 == null) {
            return 0;
        }
        return c31961i8.f146897r;
    }

    /* renamed from: A0 */
    public final void m103639A0(String str) {
        this.f98135s = str;
        m103604B0();
    }

    /* renamed from: E0 */
    public final void m103640E0(C31961i8.a aVar) {
        AbstractC19074t.m100208f(aVar, "selectedOption");
        C31961i8 c31961i8 = this.f98139w;
        AbstractC19074t.m100205c(c31961i8);
        boolean z11 = c31961i8.f146888i;
        synchronized (this) {
            try {
                boolean contains = this.f98123H.contains(aVar.f146905e);
                if (z11) {
                    if (contains) {
                        this.f98123H.remove(aVar.f146905e);
                    } else {
                        this.f98123H.add(aVar.f146905e);
                    }
                } else if (!contains) {
                    this.f98123H.clear();
                    this.f98123H.add(aVar.f146905e);
                } else {
                    this.f98123H.clear();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m103619T0();
    }

    /* renamed from: F0 */
    public final void m103641F0(String str) {
        AbstractC19074t.m100208f(str, "groupId");
        if (this.f98135s == null) {
            return;
        }
        this.f98129N.mo9221n(new C19918l(true, 0, null, 6, null));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h(str));
        c0766k.mo1476L6(str, 3, this.f98135s);
    }

    /* renamed from: G0 */
    public final void m103642G0(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        synchronized (this.f98134S) {
            this.f98134S.add(bVar);
        }
    }

    /* renamed from: I0 */
    public final void m103643I0(C31961i8.a aVar) {
        AbstractC19074t.m100208f(aVar, "option");
        synchronized (this) {
            this.f98121F.remove(aVar);
        }
        m103619T0();
    }

    /* renamed from: J0 */
    public final void m103644J0(C31862c c31862c) {
        if (c31862c != null) {
            C18434b.Companion.m97695b().m97691w(c31862c);
            AbstractC19444a.m101697e(new Runnable() { // from class: h70.g

                /* renamed from: q */
                public final /* synthetic */ C19914h f98115q;

                public /* synthetic */ RunnableC19913g(C19914h this) {
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19914h.m103607K0(C31862c.this, r2);
                }
            });
        }
    }

    /* renamed from: M0 */
    public final void m103645M0(boolean z11, d dVar) {
        AbstractC19074t.m100208f(dVar, "callback");
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 == null) {
            return;
        }
        if (!m103655l0()) {
            dVar.mo80433a(c31961i8);
            return;
        }
        ArrayList<C31961i8.a> arrayList = new ArrayList();
        synchronized (this) {
            try {
                arrayList.addAll(this.f98121F);
                for (C31961i8.a aVar : arrayList) {
                    aVar.f146903c = this.f98123H.contains(aVar.f146905e);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c31961i8.f146882c.iterator();
        while (it.hasNext()) {
            C31961i8.a aVar2 = (C31961i8.a) it.next();
            if (this.f98123H.contains(aVar2.f146905e)) {
                String str = aVar2.f146905e;
                AbstractC19074t.m100207e(str, "optionId");
                arrayList2.add(str);
            }
        }
        boolean m103634k0 = m103634k0();
        if (!c31961i8.f146892m && m103634k0) {
            if (this.f98122G.isEmpty()) {
                if (!z11) {
                    dVar.mo80434b(1);
                    return;
                }
            } else {
                C1761c0 c1761c0 = this.f98124I;
                String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_poll_error_cannot_change_votes);
                AbstractC19074t.m100207e(string, "getString(...)");
                c1761c0.mo9221n(new C19920n(false, -1, string));
                return;
            }
        }
        m103608L0(arrayList, arrayList2, m103634k0, dVar);
    }

    /* renamed from: O0 */
    public final void m103646O0(String str, String str2) {
        AbstractC19074t.m100208f(str, "pollId");
        AbstractC19074t.m100208f(str2, "groupId");
        this.f98131P.mo9221n(new C19921o(true, 0, null, 6, null));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new j(str2, this));
        c0766k.mo1408D3(str);
    }

    /* renamed from: P0 */
    public final void m103647P0() {
        this.f98133R.removeMessages(1);
    }

    /* renamed from: R0 */
    public final void m103648R0(C7904b c7904b, String str) {
        AbstractC19074t.m100208f(c7904b, "topicInfo");
        AbstractC19074t.m100208f(str, "conversationId");
        C26000n m133919h = C25994h.f124017a.m133919h(str);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new k(m133919h));
        if (AbstractC25495a.m132079d(str)) {
            c0766k.mo1551U9(AbstractC25495a.m132088m(str), c7904b.f42715C, c7904b.f42729a);
        } else {
            c0766k.mo1694n6(str, m133919h.m133961m(), c7904b.f42715C, c7904b.f42729a);
        }
    }

    /* renamed from: S0 */
    public final void m103649S0(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        synchronized (this.f98134S) {
            this.f98134S.remove(bVar);
        }
    }

    /* renamed from: e0 */
    public final boolean m103650e0(String str) {
        String m127114D;
        String m127114D2;
        C31961i8.a aVar;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(str, "addOption");
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 != null) {
            m127114D = AbstractC24341v.m127114D(str, "\r\n", " ", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
            int length = m127114D2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String obj = m127114D2.subSequence(i12, length + 1).toString();
            if (!m103633f0(obj)) {
                if (!c31961i8.f146888i && !this.f98123H.isEmpty()) {
                    aVar = new C31961i8.a(obj, 0, false);
                } else {
                    aVar = new C31961i8.a(obj, 0, true);
                }
                aVar.f146905e = obj;
                aVar.f146908h = true;
                synchronized (this) {
                    try {
                        this.f98121F.add(aVar);
                        if (aVar.f146903c) {
                            this.f98123H.add(aVar.f146905e);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                m103619T0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public final void m103651g0() {
        C31961i8 c31961i8;
        if (!this.f98133R.hasMessages(1) && (c31961i8 = this.f98139w) != null && c31961i8.f146894o > 0 && !c31961i8.m153671i()) {
            this.f98133R.sendEmptyMessage(1);
        }
    }

    /* renamed from: h0 */
    public final void m103652h0(C31961i8 c31961i8) {
        String str;
        long j11;
        AbstractC19074t.m100208f(c31961i8, "newPollInfo");
        try {
            if (!AbstractC19074t.m100204b(c31961i8, this.f98139w)) {
                String str2 = c31961i8.f146880a;
                C31961i8 c31961i82 = this.f98139w;
                if (c31961i82 != null) {
                    str = c31961i82.f146880a;
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str2, str)) {
                    long j12 = c31961i8.f146895p;
                    C31961i8 c31961i83 = this.f98139w;
                    if (c31961i83 != null) {
                        j11 = c31961i83.f146895p;
                    } else {
                        j11 = 0;
                    }
                    if (j12 > j11) {
                        if (c31961i8.m153670h() && !c31961i8.f146900u) {
                            this.f98133R.removeMessages(3);
                            m103625W0(c31961i8);
                        } else {
                            if (this.f98133R.hasMessages(3)) {
                                return;
                            }
                            this.f98133R.sendEmptyMessageDelayed(3, 2000L);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i0 */
    public final void m103653i0(int i11) {
        if (i11 == 21) {
            m103604B0();
        }
    }

    /* renamed from: j0 */
    public final boolean m103654j0() {
        C31961i8 c31961i8 = this.f98139w;
        if (c31961i8 == null || c31961i8.m153671i()) {
            return false;
        }
        if (c31961i8.m153672j() && !c31961i8.f146892m) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public final boolean m103655l0() {
        if (this.f98139w == null) {
            return false;
        }
        synchronized (this) {
            if (!this.f98121F.isEmpty()) {
                return true;
            }
            return m103634k0();
        }
    }

    /* renamed from: m0 */
    public final void m103656m0() {
        if (!this.f98128M.compareAndSet(false, true)) {
            return;
        }
        this.f98126K.mo9221n(new C19908b(true, 0, null, 6, null));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e());
        c0766k.mo1760v8(this.f98135s);
    }

    /* renamed from: o0 */
    public final LiveData m103657o0() {
        return this.f98138v;
    }

    /* renamed from: p0 */
    public final LiveData m103658p0() {
        return this.f98127L;
    }

    /* renamed from: q0 */
    public final LiveData m103659q0() {
        return this.f98117B;
    }

    /* renamed from: r0 */
    public final void m103660r0() {
        if (!this.f98136t.compareAndSet(false, true)) {
            return;
        }
        this.f98137u.mo9221n(new C19910d(true, 0));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f());
        c0766k.mo1506P4(this.f98135s);
    }

    /* renamed from: t0 */
    public final LiveData m103661t0() {
        return this.f98141y;
    }

    /* renamed from: u0 */
    public final int m103662u0() {
        int size;
        synchronized (this) {
            size = this.f98120E.size();
        }
        return size;
    }

    /* renamed from: v0 */
    public final LiveData m103663v0() {
        return this.f98130O;
    }

    /* renamed from: w0 */
    public final LiveData m103664w0() {
        return this.f98125J;
    }

    /* renamed from: x0 */
    public final LiveData m103665x0() {
        return this.f98132Q;
    }
}
