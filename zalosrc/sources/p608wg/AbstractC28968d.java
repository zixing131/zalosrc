package p608wg;

import com.zing.zalo.biometric.C7321d;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jm.AbstractC21290b;
import org.json.JSONException;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.C28090i3;
import yf0.C30943h0;
import yf0.InterfaceC30928a;

/* renamed from: wg.d */
/* loaded from: classes3.dex */
public abstract class AbstractC28968d implements InterfaceC28970f {

    /* renamed from: a */
    private final String f134072a;

    /* renamed from: b */
    private final InterfaceC27218a f134073b;

    /* renamed from: c */
    private final InterfaceC25792a.c f134074c;

    /* renamed from: d */
    private final InterfaceC25792a.b f134075d;

    /* renamed from: e */
    private final String f134076e;

    /* renamed from: f */
    private final String f134077f;

    /* renamed from: g */
    private boolean f134078g;

    /* renamed from: h */
    private JSONObject f134079h;

    /* renamed from: i */
    private final InterfaceC24854k f134080i;

    /* renamed from: j */
    private C30943h0 f134081j;

    /* renamed from: wg.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: wg.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33024a implements InterfaceC30928a {

            /* renamed from: a */
            final /* synthetic */ AbstractC28968d f134083a;

            C33024a(AbstractC28968d abstractC28968d) {
                this.f134083a = abstractC28968d;
            }

            @Override // yf0.InterfaceC30928a
            /* renamed from: a */
            public String mo144677a(String str, String str2) {
                AbstractC19074t.m100208f(str, "action");
                return this.f134083a.m144674g(str, str2);
            }

            @Override // yf0.InterfaceC30928a
            /* renamed from: b */
            public String mo144678b(int i11, String str, String str2) {
                AbstractC19074t.m100208f(str2, "action");
                return this.f134083a.m144673f(i11, str, str2);
            }

            @Override // yf0.InterfaceC30928a
            /* renamed from: c */
            public void mo144679c(int i11, String str, JSONObject jSONObject) {
                AbstractC19074t.m100208f(str, "result");
                AbstractC19074t.m100208f(jSONObject, "data");
                AbstractC28968d.m144670j(this.f134083a, i11, str, jSONObject, null, 8, null);
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C33024a mo12V4() {
            return new C33024a(AbstractC28968d.this);
        }
    }

    /* renamed from: wg.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m144680a(int i11) {
            if (i11 == 1) {
                AbstractC28968d.this.m144671l();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144680a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    public AbstractC28968d(String str, InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, InterfaceC25792a.b bVar, String str2, String str3) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        this.f134072a = str;
        this.f134073b = interfaceC27218a;
        this.f134074c = cVar;
        this.f134075d = bVar;
        this.f134076e = str2;
        this.f134077f = str3;
        this.f134078g = true;
        this.f134079h = new JSONObject();
        m129210a = AbstractC24856m.m129210a(new a());
        this.f134080i = m129210a;
    }

    /* renamed from: e */
    public static /* synthetic */ void m144667e(AbstractC28968d abstractC28968d, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                interfaceC18505l = null;
            }
            abstractC28968d.m144672c(interfaceC18505l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAuthenticate");
    }

    /* renamed from: h */
    private final InterfaceC30928a m144668h() {
        return (InterfaceC30928a) this.f134080i.getValue();
    }

    /* renamed from: i */
    private final void m144669i(int i11, String str, JSONObject jSONObject, InterfaceC18505l interfaceC18505l) {
        InterfaceC25792a.b bVar;
        InterfaceC25792a.c cVar = this.f134074c;
        if (cVar != null) {
            InterfaceC25792a.c.a.m132932a(cVar, str, null, 2, null);
        }
        if (jSONObject != null && (bVar = this.f134075d) != null) {
            bVar.mo40741f(this.f134072a, i11, jSONObject, this.f134077f);
        }
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m144670j(AbstractC28968d abstractC28968d, int i11, String str, JSONObject jSONObject, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                jSONObject = null;
            }
            if ((i12 & 8) != 0) {
                interfaceC18505l = null;
            }
            abstractC28968d.m144669i(i11, str, jSONObject, interfaceC18505l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m144671l() {
        InterfaceC25792a.b bVar = this.f134075d;
        if (bVar != null) {
            bVar.mo40741f(this.f134072a, 2, this.f134079h, this.f134077f);
        }
        if (AbstractC21290b.m110255d()) {
            m144670j(this, -106, m144673f(-106, "Device is rooted", this.f134072a), this.f134079h, null, 8, null);
            return;
        }
        C30943h0 c30943h0 = this.f134081j;
        if (c30943h0 != null) {
            c30943h0.m150500j();
        }
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    /* renamed from: c */
    public final void m144672c(InterfaceC18505l interfaceC18505l) {
        boolean z11;
        if (C28967c.f134071a.m144665a() < 23) {
            m144670j(this, -1, m144673f(-1, "This action isn't supported android < M", this.f134072a), null, interfaceC18505l, 4, null);
            return;
        }
        String str = this.f134076e;
        if (str != null && str.length() != 0) {
            try {
                JSONObject m131571b = AbstractC25384a.m131571b(this.f134076e);
                if (m131571b == null) {
                    m131571b = new JSONObject();
                }
                this.f134079h = m131571b;
                if (m131571b.optInt("require_fingerprint", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f134078g = z11;
            } catch (JSONException unused) {
            }
        }
        C7321d m37305c = C7321d.m37305c(this.f134073b.getContext());
        AbstractC19074t.m100207e(m37305c, "from(...)");
        int m37306a = m37305c.m37306a(true);
        if (m37306a != 0) {
            if (m37306a != 1) {
                if (m37306a != 11) {
                    if (m37306a == 12) {
                        m144670j(this, -1, m144673f(-1, "Device not support", this.f134072a), null, interfaceC18505l, 4, null);
                        return;
                    }
                    return;
                }
                m144670j(this, -107, m144673f(-107, "No identities are enrolled", this.f134072a), null, interfaceC18505l, 4, null);
                return;
            }
            m144670j(this, IMediaPlayer.MEDIA_ERROR_TIMED_OUT, m144673f(IMediaPlayer.MEDIA_ERROR_TIMED_OUT, "The hardware is unavailable. Try again later.", this.f134072a), null, interfaceC18505l, 4, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bio_state", C28090i3.f131039a.m141553a());
        } catch (JSONException unused2) {
        }
        if (interfaceC18505l == null) {
            m144670j(this, 1, m144674g(this.f134072a, jSONObject.toString()), null, null, 12, null);
        } else {
            interfaceC18505l.mo205i9(1);
        }
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        String str = this.f134072a;
        if (AbstractC19074t.m100204b(str, "action.prompt.authentication.check_state")) {
            m144667e(this, null, 1, null);
        } else if (AbstractC19074t.m100204b(str, "action.prompt.authentication")) {
            m144672c(new b());
        }
    }

    /* renamed from: f */
    public String m144673f(int i11, String str, String str2) {
        return InterfaceC28970f.a.m144681a(this, i11, str, str2);
    }

    /* renamed from: g */
    public String m144674g(String str, String str2) {
        return InterfaceC28970f.a.m144683c(this, str, str2);
    }

    /* renamed from: k */
    public final void m144675k(C30943h0 c30943h0) {
        if (c30943h0 == null) {
            InterfaceC27218a interfaceC27218a = this.f134073b;
            String str = this.f134072a;
            JSONObject m131571b = AbstractC25384a.m131571b(this.f134076e);
            if (m131571b == null) {
                m131571b = new JSONObject();
            }
            this.f134081j = new C30943h0(interfaceC27218a, str, m131571b, m144668h());
            return;
        }
        this.f134081j = c30943h0;
    }

    public /* synthetic */ AbstractC28968d(String str, InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, InterfaceC25792a.b bVar, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
        this(str, interfaceC27218a, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : bVar, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3);
    }
}
