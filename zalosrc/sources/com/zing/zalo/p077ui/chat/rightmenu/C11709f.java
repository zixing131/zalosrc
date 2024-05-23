package com.zing.zalo.p077ui.chat.rightmenu;

import b90.EnumC2667d;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ke0.C21699a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kw.C21956b;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.C23250w4;
import mw.AbstractC23463h;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import p130eh.C18430a;
import p162fh.C18932a;
import p162fh.C18935d;
import p210hh.C20060c;
import p236ic.AbstractC20504a;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p487rl.C25826g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25361o0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.f */
/* loaded from: classes5.dex */
public final class C11709f extends AbstractC11704a {

    /* renamed from: G */
    private final CoroutineDispatcher f60878G;

    /* renamed from: H */
    private final boolean f60879H;

    /* renamed from: I */
    private long f60880I;

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f60881t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32755a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f60883t;

            /* renamed from: u */
            final /* synthetic */ C11709f f60884u;

            /* renamed from: v */
            final /* synthetic */ boolean f60885v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32755a(C11709f c11709f, boolean z11, Continuation continuation) {
                super(2, continuation);
                this.f60884u = c11709f;
                this.f60885v = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32755a(this.f60884u, this.f60885v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f60883t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ((InterfaceC11707d) this.f60884u.m103742Dp()).mo65188iA(this.f60885v);
                    if (this.f60885v) {
                        ((InterfaceC11707d) this.f60884u.m103742Dp()).mo65183d0();
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32755a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map m131401f;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f60881t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
                C21699a c21699a = new C21699a(m120679j2);
                m131401f = AbstractC25361o0.m131401f(new C24860q(EnumC24251b.f117147r, new C25826g(true)));
                this.f60881t = 1;
                obj = c21699a.m101498a(m131401f, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = false;
            }
            CoroutineDispatcher coroutineDispatcher = C11709f.this.f60878G;
            C32755a c32755a = new C32755a(C11709f.this, z11, null);
            this.f60881t = 2;
            if (BuildersKt.m112534g(coroutineDispatcher, c32755a, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f60887t;

            /* renamed from: u */
            final /* synthetic */ ZCloudQuotaUsage f60888u;

            /* renamed from: v */
            final /* synthetic */ C11709f f60889v;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32756a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f60890t;

                /* renamed from: u */
                final /* synthetic */ C11709f f60891u;

                /* renamed from: v */
                final /* synthetic */ ZCloudQuotaUsage f60892v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32756a(C11709f c11709f, ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
                    super(2, continuation);
                    this.f60891u = c11709f;
                    this.f60892v = zCloudQuotaUsage;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32756a(this.f60891u, this.f60892v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f60890t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f60891u.m65260sq(this.f60892v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32756a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZCloudQuotaUsage zCloudQuotaUsage, C11709f c11709f, Continuation continuation) {
                super(2, continuation);
                this.f60888u = zCloudQuotaUsage;
                this.f60889v = c11709f;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f60888u, this.f60889v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f60887t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ZCloudQuotaUsage m124833u = AbstractC23306f.m120679j2().m124833u(this.f60888u);
                    CoroutineDispatcher coroutineDispatcher = this.f60889v.f60878G;
                    C32756a c32756a = new C32756a(this.f60889v, m124833u, null);
                    this.f60887t = 1;
                    if (BuildersKt.m112534g(coroutineDispatcher, c32756a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m65265a(ZCloudQuotaUsage zCloudQuotaUsage) {
            AbstractC19074t.m100208f(zCloudQuotaUsage, "it");
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(C11709f.this), null, null, new a(zCloudQuotaUsage, C11709f.this, null), 3, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m65265a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m65268a(CloudQuotaUsage cloudQuotaUsage) {
            AbstractC19074t.m100208f(cloudQuotaUsage, "it");
            C11709f.this.m65259rq(cloudQuotaUsage);
            if (((InterfaceC11707d) C11709f.this.m103742Dp()).mo65168QC() && cloudQuotaUsage.m41236l()) {
                C21956b.m114663m(System.currentTimeMillis() - C11709f.this.f60880I, cloudQuotaUsage);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m65268a((CloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.rightmenu.f$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {
        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m65269a(CharSequence charSequence, CharSequence charSequence2) {
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(charSequence2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
            ((InterfaceC11707d) C11709f.this.m103742Dp()).mo65187hf(charSequence, false);
            ((InterfaceC11707d) C11709f.this.m103742Dp()).mo65184db(true, charSequence2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m65269a((CharSequence) obj, (CharSequence) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11709f(InterfaceC11707d interfaceC11707d, CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
        AbstractC19074t.m100208f(coroutineDispatcher, "mainDispatcher");
        this.f60878G = coroutineDispatcher;
        this.f60879H = C16805b.Companion.m89811a().m89809x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public final void m65259rq(CloudQuotaUsage cloudQuotaUsage) {
        EnumC2667d m123181i = AbstractC23463h.m123181i(cloudQuotaUsage, false, 2, null);
        if (((InterfaceC11707d) m103742Dp()).mo65168QC()) {
            C21956b.m114661k(m123181i, C21956b.a.f108075s);
        }
        m123181i.mo13108g(new d());
        ((InterfaceC11707d) m103742Dp()).mo65165Mv(m123181i);
        ((InterfaceC11707d) m103742Dp()).mo65197v9(cloudQuotaUsage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sq */
    public final void m65260sq(ZCloudQuotaUsage zCloudQuotaUsage) {
        ((InterfaceC11707d) m103742Dp()).mo65155Ac(zCloudQuotaUsage);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Pp */
    protected List mo65220Pp() {
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        if (C21373a.f104231a.m110802n()) {
            m65231dq(false);
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (m65227Xp()) {
                arrayList2.add(new ChatInfoAdapter.C11692g(26, AbstractC8020f0.chat_menu_popup_search_message_v2, false, true));
            }
            arrayList2.add(new ChatInfoAdapter.C11692g(14, AbstractC8020f0.str_optionM_bg_v2, false, true));
            arrayList.add(new ChatInfoAdapter.C11693h(arrayList2, false));
            if (!C23250w4.m119814r(m65221Qp().m17944I0())) {
                m65216Mp(arrayList, true);
            } else {
                m65231dq(false);
            }
        }
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99182f()) {
            C7860a.b bVar = C7860a.Companion;
            ArrayList m40274R = bVar.m40303b().m40274R(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g = new ChatInfoAdapter.C11692g(69, AbstractC16803z.ic_setting_chat_label, AbstractC8020f0.str_right_menu_setting_chat_labbel, false, true);
            if (!m40274R.isEmpty()) {
                c11692g.f60814e = bVar.m40303b().m40272P(((C18430a) m40274R.get(0)).m97661a());
                z11 = false;
            } else {
                c11692g.f60814e = bVar.m40303b().m40272P(-1);
                z11 = true;
            }
            arrayList.add(c11692g);
            z12 = true;
        } else {
            z11 = true;
            z12 = false;
        }
        if (c18932a.m99184h()) {
            List m99228p = C18935d.Companion.m99234a().m99228p(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g2 = new ChatInfoAdapter.C11692g(73, AbstractC16803z.ic_setting_chat_tag, AbstractC8020f0.str_right_menu_setting_chat_tag, z12, !z12);
            if (!m99228p.isEmpty()) {
                c11692g2.f60814e = ((C20060c) m99228p.get(0)).m104216e();
            } else {
                c11692g2.f60814e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_right_menu_setting_chat_tag_desc_empty);
            }
            arrayList.add(c11692g2);
            z12 = true;
        }
        if (z11) {
            boolean m118442j = AbstractC23089h6.m118442j(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g3 = new ChatInfoAdapter.C11692g(46, AbstractC16803z.ic_pin, AbstractC8020f0.str_pin_message_title, z12, !z12);
            c11692g3.m65120f(true, m118442j);
            arrayList.add(c11692g3);
            m65235gq(true);
            z13 = true;
        } else {
            z13 = z12;
        }
        m65239jq(arrayList.size());
        if (m65226Wp() || !z11) {
            z14 = true;
        }
        m65235gq(z14);
        arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_optionM_clearallMsg_v3, z13, !z13));
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Ql */
    public void mo65253Ql(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: aq */
    protected void mo65230aq() {
        int i11;
        boolean z11;
        Conversation m17971y0 = m65221Qp().m17971y0();
        ((InterfaceC11707d) m103742Dp()).mo65190jp(m17971y0.f42895s);
        if (AbstractC3489d.m17513u() && C24252c.f117152a.m126600f(EnumC24251b.f117147r)) {
            this.f60880I = System.currentTimeMillis();
            InterfaceC11707d interfaceC11707d = (InterfaceC11707d) m103742Dp();
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            interfaceC11707d.mo65187hf(m114547n, false);
            InterfaceC11707d interfaceC11707d2 = (InterfaceC11707d) m103742Dp();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC11707d2.mo65184db(true, m118743r0);
            ((InterfaceC11707d) m103742Dp()).mo65163K6();
            m65262qq();
            return;
        }
        if (this.f60879H) {
            this.f60880I = System.currentTimeMillis();
            InterfaceC11707d interfaceC11707d3 = (InterfaceC11707d) m103742Dp();
            String m114547n2 = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n2, "getSendToMeDPN(...)");
            interfaceC11707d3.mo65187hf(m114547n2, false);
            InterfaceC11707d interfaceC11707d4 = (InterfaceC11707d) m103742Dp();
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            interfaceC11707d4.mo65184db(true, m118743r02);
            ((InterfaceC11707d) m103742Dp()).mo65163K6();
            AbstractC23306f.m120679j2().m124844y0(AbstractC20504a.m106544a(this), new c());
            return;
        }
        InterfaceC11707d interfaceC11707d5 = (InterfaceC11707d) m103742Dp();
        String m40990d = Conversation.m40990d(m17971y0, true, false, false, 4, null);
        int length = m40990d.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m40990d.charAt(i11), 32) <= 0) {
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
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        interfaceC11707d5.mo65187hf(m40990d.subSequence(i12, length + 1).toString(), false);
        ((InterfaceC11707d) m103742Dp()).mo65184db(false, "");
        ((InterfaceC11707d) m103742Dp()).mo65194sI(true);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: lk */
    public void mo65254lk() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nj */
    public void mo65242nj() {
        AbstractC23306f.m120679j2().m124814j1();
        super.mo65242nj();
    }

    /* renamed from: pq */
    public final void m65261pq() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new a(null), 3, null);
    }

    /* renamed from: qq */
    public final void m65262qq() {
        AbstractC23306f.m120679j2().m124771H0(false, AbstractC20504a.m106544a(this), new b());
    }

    public /* synthetic */ C11709f(InterfaceC11707d interfaceC11707d, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC11707d, (i11 & 2) != 0 ? Dispatchers.m112681c() : coroutineDispatcher);
    }
}
