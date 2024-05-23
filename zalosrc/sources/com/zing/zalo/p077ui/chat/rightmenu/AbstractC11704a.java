package com.zing.zalo.p077ui.chat.rightmenu;

import ag0.AbstractC0837p0;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import ci.C3514m;
import ci.C3516n;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p056cj.C3535c;
import p131ei.C18434b;
import p205hc.AbstractC19962a;
import p241ij.C20568e;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p664y.AbstractC30228a;
import p716zh.C31862c;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11704a extends AbstractC19962a implements InterfaceC11706c {

    /* renamed from: A */
    private int f60861A;

    /* renamed from: B */
    private int f60862B;

    /* renamed from: C */
    private int f60863C;

    /* renamed from: D */
    private boolean f60864D;

    /* renamed from: E */
    private ChatInfoAdapter.C11688c f60865E;

    /* renamed from: F */
    private C3514m f60866F;

    /* renamed from: t */
    private ChatInfoView.InterfaceC11697a f60867t;

    /* renamed from: u */
    public C3535c f60868u;

    /* renamed from: v */
    private C31862c f60869v;

    /* renamed from: w */
    private boolean f60870w;

    /* renamed from: x */
    private boolean f60871x;

    /* renamed from: y */
    private boolean f60872y;

    /* renamed from: z */
    private int f60873z;

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements C3516n.a {
        a() {
        }

        @Override // ci.C3516n.a
        /* renamed from: a */
        public void mo17761a(C3514m c3514m) {
            AbstractC11704a.this.m65234fq(c3514m);
            ChatInfoAdapter.C11688c m65218Np = AbstractC11704a.this.m65218Np();
            if (m65218Np != null) {
                m65218Np.f60807b = c3514m;
            }
            ((InterfaceC11707d) AbstractC11704a.this.m103742Dp()).mo65183d0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11704a(InterfaceC11707d interfaceC11707d) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
        this.f60873z = -1;
        this.f60861A = -1;
        this.f60862B = -1;
        this.f60863C = -1;
        this.f60864D = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public static final void m65207Sp(AbstractC11704a abstractC11704a, MessageId messageId) {
        AbstractC19074t.m100208f(abstractC11704a, "this$0");
        AbstractC19074t.m100208f(messageId, "$messageId");
        C3514m c3514m = abstractC11704a.f60866F;
        if (c3514m != null) {
            Iterator it = c3514m.m17755a().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(messageId, ((MediaStoreItem) it.next()).m40571M())) {
                    c3514m.m17757c(c3514m.m17756b() - 1);
                    it.remove();
                    z11 = true;
                }
            }
            if (c3514m.m17756b() < 0) {
                c3514m.m17757c(0);
            }
            if (z11) {
                ((InterfaceC11707d) abstractC11704a.m103742Dp()).mo65183d0();
                abstractC11704a.mo65217N8();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bq */
    public static final void m65208bq(final AbstractC11704a abstractC11704a, final Runnable runnable) {
        boolean z11;
        boolean m118442j;
        AbstractC19074t.m100208f(abstractC11704a, "this$0");
        AbstractC19074t.m100208f(runnable, "$postRenderingRunnable");
        try {
            abstractC11704a.f60870w = AbstractC23309i.m121160Lg();
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && C21927m.m114302u().m114345m(abstractC11704a.m65221Qp().m17944I0())) {
                z11 = true;
            } else {
                z11 = false;
            }
            abstractC11704a.f60871x = z11;
            final ArrayList arrayList = new ArrayList();
            abstractC11704a.f60872y = false;
            abstractC11704a.f60863C = -1;
            arrayList.addAll(abstractC11704a.mo65220Pp());
            if (!abstractC11704a.f60872y && (m118442j = AbstractC23089h6.m118442j(abstractC11704a.m65221Qp().m17944I0()))) {
                ChatInfoAdapter.C11692g c11692g = new ChatInfoAdapter.C11692g(46, AbstractC8020f0.str_pin_message_title, false, true);
                c11692g.m65120f(true, m118442j);
                int i11 = abstractC11704a.f60863C;
                if (i11 >= 0 && i11 <= arrayList.size()) {
                    arrayList.add(abstractC11704a.f60863C, c11692g);
                } else {
                    arrayList.add(c11692g);
                }
            }
            if (abstractC11704a.f60865E != null && abstractC11704a.f60866F == null && abstractC11704a.m65221Qp().m136048N()) {
                abstractC11704a.mo65217N8();
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: h60.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC11704a.m65209cq(AbstractC11704a.this, arrayList, runnable);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cq */
    public static final void m65209cq(AbstractC11704a abstractC11704a, List list, Runnable runnable) {
        AbstractC19074t.m100208f(abstractC11704a, "this$0");
        AbstractC19074t.m100208f(list, "$items");
        AbstractC19074t.m100208f(runnable, "$postRenderingRunnable");
        ((InterfaceC11707d) abstractC11704a.m103742Dp()).mo65174Ws(list);
        abstractC11704a.mo65229Zp();
        abstractC11704a.mo65230aq();
        runnable.run();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: B3 */
    public void mo65210B3(C31862c c31862c) {
        if (c31862c != null) {
            C18434b.Companion.m97695b().m97691w(c31862c);
        }
        this.f60869v = null;
        ((InterfaceC11707d) m103742Dp()).mo65182ce();
        ChatInfoView.InterfaceC11697a interfaceC11697a = this.f60867t;
        if (interfaceC11697a != null) {
            AbstractC19074t.m100205c(interfaceC11697a);
            interfaceC11697a.mo64107Hg();
        }
        ((InterfaceC11707d) m103742Dp()).mo65183d0();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: B7 */
    public String mo65211B7() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: F0 */
    public void mo65212F0(String str, String str2) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(str2, "cameraLog");
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Fg */
    public void mo65213Fg() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Fh */
    public void mo65214Fh(C31862c c31862c, boolean z11) {
        if (this.f60869v != c31862c) {
            this.f60869v = c31862c;
            ((InterfaceC11707d) m103742Dp()).mo65182ce();
            if (z11) {
                ((InterfaceC11707d) m103742Dp()).mo65183d0();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: I7 */
    public void mo65215I7(ChatInfoView.InterfaceC11697a interfaceC11697a) {
        AbstractC19074t.m100208f(interfaceC11697a, "chatInfoViewListener");
        this.f60867t = interfaceC11697a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Mp */
    public final void m65216Mp(List list, boolean z11) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(list, "items");
        try {
            if (new JSONObject(AbstractC23309i.m121295P3()).optInt("photo", 1) != 1) {
                return;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_v4);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        SpannableString spannableString = new SpannableString(m118743r0);
        C3514m c3514m = this.f60866F;
        if (c3514m != null) {
            i11 = c3514m.m17756b();
        } else {
            i11 = 0;
        }
        if (z11 && i11 > 0) {
            i12 = m118743r0.length() + 1;
            String str = m118743r0 + " (" + i11 + ")";
            i13 = str.length();
            spannableString = new SpannableString(str);
        } else {
            i12 = -1;
            i13 = -1;
        }
        ChatInfoAdapter.C11692g c11692g = new ChatInfoAdapter.C11692g(28, AbstractC16803z.ic_shared_media_right_menu, (Spannable) spannableString, false);
        c11692g.m65119e(((InterfaceC11707d) m103742Dp()).mo65180a3(), i12, i13);
        c11692g.f60818i = mo65224Tp();
        list.add(c11692g);
        ChatInfoAdapter.C11688c c11688c = new ChatInfoAdapter.C11688c();
        c11688c.f60807b = this.f60866F;
        list.add(c11688c);
        this.f60865E = c11688c;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: N8 */
    public void mo65217N8() {
        if (!this.f60864D) {
            return;
        }
        C3516n.f14745a.m17760c(m65221Qp().m17944I0(), new a());
    }

    /* renamed from: Np */
    protected final ChatInfoAdapter.C11688c m65218Np() {
        return this.f60865E;
    }

    /* renamed from: Op */
    public final ChatInfoView.InterfaceC11697a m65219Op() {
        return this.f60867t;
    }

    /* renamed from: Pp */
    protected abstract List mo65220Pp();

    /* renamed from: Qp */
    public final C3535c m65221Qp() {
        C3535c c3535c = this.f60868u;
        if (c3535c != null) {
            return c3535c;
        }
        AbstractC19074t.m100223u("mCurrentChat");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:20:0x000c, B:22:0x0012, B:4:0x001a, B:6:0x0020, B:9:0x002a, B:13:0x002e, B:15:0x0032), top: B:19:0x000c }] */
    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Rm */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo65222Rm(C31862c c31862c, String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        if (c31862c != null) {
            try {
                if (c31862c.m153153e()) {
                    mo65210B3(c31862c);
                    z11 = true;
                    if (TextUtils.isEmpty(str)) {
                        if (AbstractC19074t.m100204b(str, "action.window.close")) {
                            if (!z11) {
                                mo65210B3(c31862c);
                                return;
                            }
                            return;
                        } else {
                            ChatInfoView.InterfaceC11697a interfaceC11697a = this.f60867t;
                            if (interfaceC11697a != null) {
                                AbstractC19074t.m100205c(interfaceC11697a);
                                interfaceC11697a.mo64170l4(c31862c, str, str2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        z11 = false;
        if (TextUtils.isEmpty(str)) {
        }
    }

    /* renamed from: Rp */
    public final C31862c m65223Rp() {
        return this.f60869v;
    }

    /* renamed from: Tp */
    protected boolean mo65224Tp() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Vb */
    public void mo65225Vb(String str) {
        AbstractC19074t.m100208f(str, "name");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Wp */
    public final boolean m65226Wp() {
        return this.f60872y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Xp */
    public final boolean m65227Xp() {
        return this.f60870w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Yp */
    public final boolean m65228Yp() {
        return this.f60871x;
    }

    /* renamed from: Zp */
    protected void mo65229Zp() {
    }

    /* renamed from: aq */
    protected abstract void mo65230aq();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: dq */
    public final void m65231dq(boolean z11) {
        this.f60864D = z11;
    }

    /* renamed from: eq */
    public final void m65232eq(C3535c c3535c) {
        AbstractC19074t.m100208f(c3535c, "<set-?>");
        this.f60868u = c3535c;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: fb */
    public void mo65233fb(final MessageId messageId, C20568e c20568e) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19444a.m101697e(new Runnable() { // from class: h60.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11704a.m65207Sp(AbstractC11704a.this, messageId);
            }
        });
    }

    /* renamed from: fq */
    protected final void m65234fq(C3514m c3514m) {
        this.f60866F = c3514m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: gq */
    public final void m65235gq(boolean z11) {
        this.f60872y = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: hq */
    public final void m65236hq(int i11) {
        this.f60861A = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: im */
    public int mo65237im() {
        return this.f60862B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: iq */
    public final void m65238iq(int i11) {
        this.f60862B = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: jq */
    public final void m65239jq(int i11) {
        this.f60863C = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: kq */
    public final void m65240kq(int i11) {
        this.f60873z = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: mk */
    public void mo65241mk() {
        ChatInfoView.InterfaceC11697a interfaceC11697a = this.f60867t;
        if (interfaceC11697a != null) {
            interfaceC11697a.mo64153db();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nj */
    public void mo65242nj() {
        ((InterfaceC11707d) m103742Dp()).mo65183d0();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nm */
    public void mo65243nm() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: o4 */
    public void mo65244o4(C3535c c3535c) {
        AbstractC19074t.m100208f(c3535c, "chat");
        m65232eq(c3535c);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: o5 */
    public void mo65245o5(final Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "postRenderingRunnable");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h60.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11704a.m65208bq(AbstractC11704a.this, runnable);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: rl */
    public void mo65246rl() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: um */
    public void mo65247um(ChatInfoAdapter.C11690e c11690e) {
        C31862c c31862c;
        if (c11690e == null) {
            return;
        }
        switch (c11690e.m65115b()) {
            case 1:
                int m65118d = ((ChatInfoAdapter.C11692g) c11690e).m65118d();
                ChatInfoView.InterfaceC11697a interfaceC11697a = this.f60867t;
                if (interfaceC11697a != null) {
                    AbstractC19074t.m100205c(interfaceC11697a);
                    interfaceC11697a.mo64137V(m65118d);
                    AbstractC23647d.m123897g("1591025");
                    return;
                }
                return;
            case 2:
                ChatInfoView.InterfaceC11697a interfaceC11697a2 = this.f60867t;
                if (interfaceC11697a2 != null) {
                    AbstractC19074t.m100205c(interfaceC11697a2);
                    interfaceC11697a2.mo64137V(41);
                    return;
                }
                return;
            case 3:
                AbstractC30228a.m149044a(c11690e);
                throw null;
            case 4:
            default:
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if ((c11690e instanceof ChatInfoAdapter.C11691f) && (c31862c = ((ChatInfoAdapter.C11691f) c11690e).f60809b) != null) {
                    if (!TextUtils.isEmpty(c31862c.f146318k)) {
                        String str = c31862c.f146318k;
                        AbstractC19074t.m100207e(str, "backgroundAction");
                        String str2 = c31862c.f146317j;
                        AbstractC19074t.m100207e(str2, "backgroundData");
                        mo65222Rm(c31862c, str, str2);
                    }
                    if (c31862c.m153153e()) {
                        mo65210B3(c31862c);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
