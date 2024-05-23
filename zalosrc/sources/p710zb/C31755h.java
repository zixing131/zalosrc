package p710zb;

import ag0.AbstractC0852x;
import ag0.C0815e1;
import am.AbstractC0906d0;
import am.C0927o;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.alias.C7291a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23046d7;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p142ey.C18631a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19969h;
import p304ks.AbstractC21935u;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p458qr.C25470c;
import p710zb.C31755h;
import p716zh.C31901e8;
import vg.C28203u6;

/* renamed from: zb.h */
/* loaded from: classes3.dex */
public final class C31755h extends AbstractC19962a implements InterfaceC31751d {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private String f145836A;

    /* renamed from: B */
    private boolean f145837B;

    /* renamed from: C */
    private boolean f145838C;

    /* renamed from: D */
    private volatile boolean f145839D;

    /* renamed from: t */
    private final InterfaceC31748a f145840t;

    /* renamed from: u */
    private final ExecutorService f145841u;

    /* renamed from: v */
    private ContactProfile f145842v;

    /* renamed from: w */
    private int f145843w;

    /* renamed from: x */
    private String f145844x;

    /* renamed from: y */
    private C31901e8 f145845y;

    /* renamed from: z */
    private String f145846z;

    /* renamed from: zb.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zb.h$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f145847a;

        /* renamed from: b */
        final /* synthetic */ String f145848b;

        /* renamed from: c */
        final /* synthetic */ int f145849c;

        /* renamed from: d */
        final /* synthetic */ C31755h f145850d;

        /* renamed from: e */
        final /* synthetic */ boolean f145851e;

        b(String str, String str2, int i11, C31755h c31755h, boolean z11) {
            this.f145847a = str;
            this.f145848b = str2;
            this.f145849c = i11;
            this.f145850d = c31755h;
            this.f145851e = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m152762e(C31755h c31755h) {
            AbstractC19074t.m100208f(c31755h, "this$0");
            ((InterfaceC31752e) c31755h.m103742Dp()).mo37131g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m152763f(C31755h c31755h, String str) {
            AbstractC19074t.m100208f(c31755h, "this$0");
            AbstractC19074t.m100208f(str, "$fMsgError");
            ((InterfaceC31752e) c31755h.m103742Dp()).mo37134me(true, str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m119316a;
            final String m127114D;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    int m104491c = c20096c.m104491c();
                    String m104492d = c20096c.m104492d();
                    if (m104491c == 50001) {
                        m119316a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alias_network_error);
                    } else {
                        m119316a = AbstractC23161o1.m119316a(m104491c, m104492d);
                    }
                    String str = m119316a;
                    if (!TextUtils.isEmpty(str)) {
                        AbstractC19074t.m100205c(str);
                        m127114D = AbstractC24341v.m127114D(str, "\n", "", false, 4, null);
                        InterfaceC31752e interfaceC31752e = (InterfaceC31752e) this.f145850d.m103742Dp();
                        final C31755h c31755h = this.f145850d;
                        interfaceC31752e.mo70710wy(new Runnable() { // from class: zb.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                C31755h.b.m152763f(C31755h.this, m127114D);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo37114Iy();
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo78960q3();
                this.f145850d.f145839D = false;
            } catch (Throwable th2) {
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo37114Iy();
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo78960q3();
                this.f145850d.f145839D = false;
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC31752e interfaceC31752e;
            Runnable runnable;
            int i11;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    if (((JSONObject) obj).optInt("error_code") == 0) {
                        C18631a.m98446i().m98452e(this.f145847a, this.f145848b);
                        C18631a.m98446i().m98460r();
                        if (this.f145849c == 1) {
                            i11 = AbstractC8020f0.str_change_alias_success_msg;
                        } else {
                            i11 = AbstractC8020f0.str_imp_alias_remove_alias_success;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                        C19637j.f97466a.m102841Z(this.f145847a);
                    }
                    ((InterfaceC31752e) this.f145850d.m103742Dp()).mo37114Iy();
                    ((InterfaceC31752e) this.f145850d.m103742Dp()).mo78960q3();
                    if (this.f145849c == 1) {
                        ContactProfile contactProfile = this.f145850d.f145842v;
                        AbstractC19074t.m100205c(contactProfile);
                        C18631a.m98451x(contactProfile.f42434r, this.f145851e);
                        this.f145850d.m152759Xp(this.f145848b, this.f145851e);
                    }
                    this.f145850d.f145839D = false;
                    interfaceC31752e = (InterfaceC31752e) this.f145850d.m103742Dp();
                    final C31755h c31755h = this.f145850d;
                    runnable = new Runnable() { // from class: zb.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C31755h.b.m152762e(C31755h.this);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    ((InterfaceC31752e) this.f145850d.m103742Dp()).mo37114Iy();
                    ((InterfaceC31752e) this.f145850d.m103742Dp()).mo78960q3();
                    if (this.f145849c == 1) {
                        ContactProfile contactProfile2 = this.f145850d.f145842v;
                        AbstractC19074t.m100205c(contactProfile2);
                        C18631a.m98451x(contactProfile2.f42434r, this.f145851e);
                        this.f145850d.m152759Xp(this.f145848b, this.f145851e);
                    }
                    this.f145850d.f145839D = false;
                    interfaceC31752e = (InterfaceC31752e) this.f145850d.m103742Dp();
                    final C31755h c31755h2 = this.f145850d;
                    runnable = new Runnable() { // from class: zb.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C31755h.b.m152762e(C31755h.this);
                        }
                    };
                }
                interfaceC31752e.mo70710wy(runnable);
            } catch (Throwable th2) {
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo37114Iy();
                ((InterfaceC31752e) this.f145850d.m103742Dp()).mo78960q3();
                if (this.f145849c == 1) {
                    ContactProfile contactProfile3 = this.f145850d.f145842v;
                    AbstractC19074t.m100205c(contactProfile3);
                    C18631a.m98451x(contactProfile3.f42434r, this.f145851e);
                    this.f145850d.m152759Xp(this.f145848b, this.f145851e);
                }
                this.f145850d.f145839D = false;
                InterfaceC31752e interfaceC31752e2 = (InterfaceC31752e) this.f145850d.m103742Dp();
                final C31755h c31755h3 = this.f145850d;
                interfaceC31752e2.mo70710wy(new Runnable() { // from class: zb.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31755h.b.m152762e(C31755h.this);
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31755h(InterfaceC31752e interfaceC31752e, InterfaceC31748a interfaceC31748a) {
        super(interfaceC31752e);
        AbstractC19074t.m100208f(interfaceC31752e, "mvpView");
        AbstractC19074t.m100208f(interfaceC31748a, "aliasRepo");
        this.f145840t = interfaceC31748a;
        this.f145841u = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ChangeAlias"));
        this.f145843w = C18631a.m98446i().m98456k();
        this.f145844x = "";
        this.f145846z = "";
        this.f145836A = "";
        this.f145838C = true;
    }

    /* renamed from: Op */
    private final void m152751Op(String str, String str2, boolean z11) {
        m152758Np(1, str, str2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pp */
    public static final void m152752Pp(final C31755h c31755h, String str) {
        AbstractC19074t.m100208f(c31755h, "this$0");
        AbstractC19074t.m100208f(str, "$currentInputAlias");
        if (c31755h.m152759Xp(str, true)) {
            ToastUtils.m89266n(AbstractC8020f0.str_alias_save_contact_name_success, new Object[0]);
        }
        ((InterfaceC31752e) c31755h.m103742Dp()).mo70710wy(new Runnable() { // from class: zb.g
            @Override // java.lang.Runnable
            public final void run() {
                C31755h.m152753Qp(C31755h.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qp */
    public static final void m152753Qp(C31755h c31755h) {
        AbstractC19074t.m100208f(c31755h, "this$0");
        ((InterfaceC31752e) c31755h.m103742Dp()).mo37131g();
    }

    /* renamed from: Rp */
    private final void m152754Rp(String str) {
        m152758Np(2, str, "", false);
    }

    /* renamed from: Sp */
    private final boolean m152755Sp(String str) {
        if (m152756Tp(str) && ((InterfaceC31752e) m103742Dp()).mo37130ff()) {
            return true;
        }
        return false;
    }

    /* renamed from: Tp */
    private final boolean m152756Tp(String str) {
        if (this.f145845y != null && this.f145837B && str.length() > 0 && !AbstractC19074t.m100204b(str, this.f145836A) && this.f145838C) {
            return true;
        }
        return false;
    }

    /* renamed from: Wp */
    private final void m152757Wp(String str) {
        int i11;
        if (str.length() == 0) {
            i11 = IMediaPlayer.MEDIA_INFO_BUFFERING_START;
        } else {
            i11 = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("199%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        AbstractC23647d.m123906p(format);
        AbstractC23647d.m123893c();
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: B5 */
    public void mo152733B5() {
        C18631a m98446i = C18631a.m98446i();
        ContactProfile contactProfile = this.f145842v;
        AbstractC19074t.m100205c(contactProfile);
        String m98454g = m98446i.m98454g(contactProfile.f42434r);
        if (m98454g == null) {
            m98454g = "";
        }
        this.f145846z = m98454g;
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: Bh */
    public void mo152734Bh(String str) {
        AbstractC19074t.m100208f(str, "currentAliasInput");
        if (m152756Tp(str)) {
            ((InterfaceC31752e) m103742Dp()).mo37119Uz(str);
        } else {
            ((InterfaceC31752e) m103742Dp()).mo37137yn();
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: E6 */
    public void mo152735E6(String str) {
        AbstractC19074t.m100208f(str, "contactName");
        int length = str.length();
        int i11 = this.f145843w;
        if (length > i11) {
            str = str.substring(0, i11);
            AbstractC19074t.m100207e(str, "substring(...)");
        }
        ((InterfaceC31752e) m103742Dp()).mo37113H6(str);
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: Gl */
    public void mo152736Gl() {
        if (this.f145845y != null && ((InterfaceC31752e) m103742Dp()).mo37124ZC()) {
            ContactProfile contactProfile = this.f145842v;
            AbstractC19074t.m100205c(contactProfile);
            ((InterfaceC31752e) m103742Dp()).mo37123ZA(C18631a.m98448n(contactProfile.f42434r));
            return;
        }
        ContactProfile contactProfile2 = this.f145842v;
        AbstractC19074t.m100205c(contactProfile2);
        C18631a.m98451x(contactProfile2.f42434r, false);
        ((InterfaceC31752e) m103742Dp()).mo37123ZA(false);
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: M4 */
    public void mo152737M4() {
        this.f145837B = ((InterfaceC31752e) m103742Dp()).mo37124ZC();
    }

    /* renamed from: Np */
    public final void m152758Np(int i11, String str, String str2, boolean z11) {
        String m127114D;
        int i12;
        boolean z12;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "aliasName");
        try {
            if (!C18631a.m98447m(str)) {
                ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_unsupport));
                ((InterfaceC31752e) m103742Dp()).mo37131g();
                return;
            }
            if (this.f145839D) {
                return;
            }
            ((InterfaceC31752e) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f145839D = true;
            m127114D = AbstractC24341v.m127114D(str2, "\n", "", false, 4, null);
            int length = m127114D.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                if (!z13) {
                    i12 = i13;
                } else {
                    i12 = length;
                }
                if (AbstractC19074t.m100209g(m127114D.charAt(i12), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = m127114D.subSequence(i13, length + 1).toString();
            this.f145840t.mo152726a(str, obj, new b(str, obj, i11, this, z11));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: Tl */
    public void mo152738Tl() {
        InterfaceC19969h m103744Fp = m103744Fp();
        AbstractC19074t.m100205c(m103744Fp);
        Integer m37142a = ((C7291a) m103744Fp).m37142a();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("199%03d", Arrays.copyOf(new Object[]{m37142a}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        if ((m37142a != null && m37142a.intValue() == 691) || ((m37142a != null && m37142a.intValue() == 690) || (m37142a != null && m37142a.intValue() == 704))) {
            InterfaceC19969h m103744Fp2 = m103744Fp();
            AbstractC19074t.m100205c(m103744Fp2);
            String m37148g = ((C7291a) m103744Fp2).m37148g();
            AbstractC19074t.m100205c(m37148g);
            if (AbstractC21935u.m114515E(m37148g)) {
                format = format + "1";
            }
        }
        AbstractC23647d.m123906p(format);
        AbstractC23647d.m123893c();
        InterfaceC19969h m103744Fp3 = m103744Fp();
        AbstractC19074t.m100205c(m103744Fp3);
        String m37146e = ((C7291a) m103744Fp3).m37146e();
        InterfaceC19969h m103744Fp4 = m103744Fp();
        AbstractC19074t.m100205c(m103744Fp4);
        C0815e1.m2075D().m2100V(new C23648e(9, m37146e, 1, "change_alias", ((C7291a) m103744Fp4).m37143b()), false);
    }

    /* renamed from: Xp */
    public final synchronized boolean m152759Xp(String str, boolean z11) {
        SensitiveData sensitiveData;
        try {
            AbstractC19074t.m100208f(str, "aliasName");
            boolean z12 = false;
            if (!z11 || str.length() <= 0) {
                return false;
            }
            C7291a c7291a = (C7291a) m103744Fp();
            if (c7291a != null) {
                sensitiveData = c7291a.m37145d();
            } else {
                sensitiveData = null;
            }
            SensitiveData m118247j = C23046d7.m118247j(sensitiveData, "phonebook");
            MainApplication.C6895a c6895a = MainApplication.Companion;
            Context m35500c = c6895a.m35500c();
            ContactProfile contactProfile = this.f145842v;
            AbstractC19074t.m100205c(contactProfile);
            C31901e8 m2801g = AbstractC0906d0.m2801g(m35500c, contactProfile.f42434r);
            if (m2801g == null) {
                ContactProfile contactProfile2 = this.f145842v;
                AbstractC19074t.m100205c(contactProfile2);
                String str2 = contactProfile2.f42455y;
                if (str2 != null && str2.length() != 0) {
                    Context m35500c2 = c6895a.m35500c();
                    ContactProfile contactProfile3 = this.f145842v;
                    AbstractC19074t.m100205c(contactProfile3);
                    m2801g = AbstractC0906d0.m2800f(m35500c2, contactProfile3.f42455y);
                }
            }
            if (AbstractC0852x.m2343T(c6895a.m35500c(), m2801g, str, m118247j) == 0) {
                z12 = true;
            }
            return z12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: b */
    public void mo152739b(C25470c c25470c) {
        AbstractC19074t.m100208f(c25470c, "dataRetain");
        try {
            if (c25470c.m131938a("input_alias")) {
                InterfaceC31752e interfaceC31752e = (InterfaceC31752e) m103742Dp();
                String m131944g = c25470c.m131944g("input_alias", "");
                AbstractC19074t.m100207e(m131944g, "getString(...)");
                interfaceC31752e.mo37113H6(m131944g);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: c */
    public C25470c mo152740c() {
        C25470c c25470c = new C25470c();
        c25470c.m131950m("input_alias", ((InterfaceC31752e) m103742Dp()).mo37115NB());
        return c25470c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:            if (r1.length() != 0) goto L22;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:2:0x0000, B:4:0x0025, B:6:0x002b, B:7:0x0039, B:9:0x0046, B:10:0x005f, B:12:0x0073, B:15:0x007a, B:18:0x009d, B:20:0x00b0, B:21:0x00b9, B:26:0x0091, B:28:0x0097), top: B:1:0x0000 }] */
    @Override // p710zb.InterfaceC31751d
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo152741d() {
        String str;
        int m116584g;
        SensitiveData m37145d;
        try {
            InterfaceC19969h m103744Fp = m103744Fp();
            AbstractC19074t.m100205c(m103744Fp);
            String m37148g = ((C7291a) m103744Fp).m37148g();
            AbstractC19074t.m100205c(m37148g);
            InterfaceC19969h m103744Fp2 = m103744Fp();
            AbstractC19074t.m100205c(m103744Fp2);
            String m37147f = ((C7291a) m103744Fp2).m37147f();
            C7291a c7291a = (C7291a) m103744Fp();
            if (c7291a != null && (m37145d = c7291a.m37145d()) != null) {
                this.f145838C = C8937j0.m47663l(m37145d.m35528c());
            }
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, m37148g, false, 2, null);
            this.f145842v = m141800i;
            if (m141800i == null) {
                ContactProfile contactProfile = new ContactProfile(m37148g);
                this.f145842v = contactProfile;
                AbstractC19074t.m100205c(contactProfile);
                InterfaceC19969h m103744Fp3 = m103744Fp();
                AbstractC19074t.m100205c(m103744Fp3);
                contactProfile.f42437s = ((C7291a) m103744Fp3).m37144c();
            }
            mo152744k5();
            C18631a m98446i = C18631a.m98446i();
            ContactProfile contactProfile2 = this.f145842v;
            AbstractC19074t.m100205c(contactProfile2);
            String m98454g = m98446i.m98454g(contactProfile2.f42434r);
            if (m98454g != null && m98454g.length() != 0) {
                m116584g = AbstractC22543l.m116584g(m98454g.length(), this.f145843w);
                m37147f = m98454g.substring(0, m116584g);
                AbstractC19074t.m100207e(m37147f, "substring(...)");
                m98454g = m37147f;
                if (m98454g == null) {
                    m98454g = "";
                }
                this.f145846z = m98454g;
                str = this.f145844x;
                ((InterfaceC31752e) m103742Dp()).mo37113H6(m37147f);
                if (str.length() > 0) {
                    ((InterfaceC31752e) m103742Dp()).mo37112EE(str);
                }
                mo152736Gl();
            }
            m37147f = this.f145844x;
            if (m98454g == null) {
            }
            this.f145846z = m98454g;
            str = this.f145844x;
            ((InterfaceC31752e) m103742Dp()).mo37113H6(m37147f);
            if (str.length() > 0) {
            }
            mo152736Gl();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_data_error));
            ((InterfaceC31752e) m103742Dp()).mo37131g();
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: i7 */
    public void mo152742i7(final String str) {
        AbstractC19074t.m100208f(str, "currentInputAlias");
        try {
            if (!AbstractC19074t.m100204b(str, this.f145846z)) {
                if (this.f145846z.length() > 0 && str.length() == 0) {
                    ContactProfile contactProfile = this.f145842v;
                    AbstractC19074t.m100205c(contactProfile);
                    String str2 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    m152754Rp(str2);
                } else {
                    ((InterfaceC31752e) m103742Dp()).mo37133go();
                    ContactProfile contactProfile2 = this.f145842v;
                    AbstractC19074t.m100205c(contactProfile2);
                    String str3 = contactProfile2.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    m152751Op(str3, str, m152755Sp(str));
                }
                m152757Wp(str);
                return;
            }
            ContactProfile contactProfile3 = this.f145842v;
            AbstractC19074t.m100205c(contactProfile3);
            C18631a.m98451x(contactProfile3.f42434r, ((InterfaceC31752e) m103742Dp()).mo37130ff());
            if (m152755Sp(str)) {
                this.f145841u.execute(new Runnable() { // from class: zb.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31755h.m152752Pp(C31755h.this, str);
                    }
                });
            } else {
                ((InterfaceC31752e) m103742Dp()).mo37131g();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: j9 */
    public void mo152743j9(String str) {
        AbstractC19074t.m100208f(str, "currentAliasInput");
        if (this.f145845y != null && this.f145836A.length() > 0) {
            ((InterfaceC31752e) m103742Dp()).mo37126bG(this.f145836A, !AbstractC19074t.m100204b(this.f145836A, str));
        } else {
            ((InterfaceC31752e) m103742Dp()).mo37121X9();
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: k5 */
    public void mo152744k5() {
        String m40385R;
        C31901e8 c31901e8;
        ContactProfile contactProfile = this.f145842v;
        AbstractC19074t.m100205c(contactProfile);
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        String str2 = (String) AbstractC0852x.f3060e.get(str);
        if (str2 != null && str2.length() != 0) {
            m40385R = str2;
        } else {
            ContactProfile contactProfile2 = this.f145842v;
            AbstractC19074t.m100205c(contactProfile2);
            m40385R = contactProfile2.m40385R(true, false, false);
        }
        String str3 = "";
        if (m40385R == null) {
            m40385R = "";
        }
        this.f145844x = m40385R;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        C31901e8 m2801g = AbstractC0906d0.m2801g(c6895a.m35500c(), str);
        this.f145845y = m2801g;
        if (m2801g == null) {
            ContactProfile contactProfile3 = this.f145842v;
            AbstractC19074t.m100205c(contactProfile3);
            String str4 = contactProfile3.f42455y;
            if (str4 != null && str4.length() != 0) {
                Context m35500c = c6895a.m35500c();
                ContactProfile contactProfile4 = this.f145842v;
                AbstractC19074t.m100205c(contactProfile4);
                this.f145845y = AbstractC0906d0.m2800f(m35500c, contactProfile4.f42455y);
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f145836A = str2;
        if (str2.length() == 0 && (c31901e8 = this.f145845y) != null) {
            AbstractC19074t.m100205c(c31901e8);
            String m153295h = c31901e8.m153295h();
            if (m153295h != null) {
                str3 = m153295h;
            }
            this.f145836A = str3;
        }
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: md */
    public boolean mo152745md(String str) {
        AbstractC19074t.m100208f(str, "currentAliasInput");
        if (!AbstractC19074t.m100204b(this.f145846z, str) || m152755Sp(str)) {
            return true;
        }
        return false;
    }

    @Override // p710zb.InterfaceC31751d
    /* renamed from: sc */
    public int mo152746sc() {
        return this.f145843w;
    }
}
