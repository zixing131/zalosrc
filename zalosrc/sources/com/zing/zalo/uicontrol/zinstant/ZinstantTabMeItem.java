package com.zing.zalo.uicontrol.zinstant;

import android.content.Context;
import android.view.View;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.me.C12158a;
import com.zing.zalo.p077ui.maintab.me.C12159b;
import com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import nj0.AbstractC23803b;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p716zh.C31877d;
import pj0.AbstractC24788n;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24785k;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.AbstractC28207v1;

/* loaded from: classes4.dex */
public final class ZinstantTabMeItem extends ZaloZinstantLayout {

    /* renamed from: g0 */
    private C12158a f84644g0;

    /* renamed from: h0 */
    private View f84645h0;

    /* renamed from: i0 */
    private int f84646i0;

    /* renamed from: j0 */
    private final InterfaceC24854k f84647j0;

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$a */
    /* loaded from: classes4.dex */
    static final class C16702a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$a$a */
        /* loaded from: classes4.dex */
        public static final class a extends C17170o {

            /* renamed from: b */
            final /* synthetic */ ZinstantTabMeItem f84649b;

            a(ZinstantTabMeItem zinstantTabMeItem) {
                this.f84649b = zinstantTabMeItem;
            }

            @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
            /* renamed from: c */
            public int mo35797c() {
                return this.f84649b.getTargetWidth();
            }

            @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
            /* renamed from: l */
            public String mo44290l() {
                return this.f84649b.getIdentifyKey();
            }
        }

        C16702a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(ZinstantTabMeItem.this);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$b */
    /* loaded from: classes4.dex */
    public static final class C16703b extends AbstractC23803b {
        C16703b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: a */
        public void mo61861a() {
            try {
                ZinstantTabMeItem.this.performLongClick();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            C31877d c31877d;
            InterfaceC27218a interfaceC27218a;
            AbstractC19074t.m100208f(zinstantLayout, "thisLayout");
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str3, "action");
            try {
                c31877d = new C31877d();
                c31877d.f146422h = 11;
                MainTabView m67645lM = MainTabView.m67645lM();
                if (m67645lM != null) {
                    interfaceC27218a = m67645lM.m92676n2();
                } else {
                    interfaceC27218a = null;
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                AbstractC28207v1.m141989h3(str3, -1, interfaceC27218a, MainTabView.m67645lM(), str4, ZinstantTabMeItem.this.m91448V0(str3, str4, null), "", null, c31877d);
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$c */
    /* loaded from: classes4.dex */
    public static final class C16704c extends AbstractC24788n {
        C16704c() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            InterfaceC27218a interfaceC27218a;
            super.mo61862a(str, str2, z11, interfaceC24785k);
            try {
                C31877d c31877d = new C31877d();
                c31877d.f146422h = 11;
                MainTabView m67645lM = MainTabView.m67645lM();
                if (m67645lM != null) {
                    interfaceC27218a = m67645lM.m92676n2();
                } else {
                    interfaceC27218a = null;
                }
                AbstractC28207v1.m141989h3(str, -1, interfaceC27218a, MainTabView.m67645lM(), str2, ZinstantTabMeItem.this.m91448V0(str, str2, interfaceC24785k), "", null, c31877d);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$d */
    /* loaded from: classes4.dex */
    public static final class C16705d implements InterfaceC24775a {

        /* renamed from: b */
        final /* synthetic */ C12159b.a f84653b;

        C16705d(C12159b.a aVar) {
            this.f84653b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m88979d(ZinstantTabMeItem zinstantTabMeItem) {
            int i11;
            AbstractC19074t.m100208f(zinstantTabMeItem, "this$0");
            zinstantTabMeItem.onStart();
            View lineView = zinstantTabMeItem.getLineView();
            if (lineView != null) {
                C12158a itemZinstant = zinstantTabMeItem.getItemZinstant();
                if (itemZinstant != null && itemZinstant.m67995e()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                lineView.setVisibility(i11);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            final ZinstantTabMeItem zinstantTabMeItem = ZinstantTabMeItem.this;
            zinstantTabMeItem.m91975K0(new Runnable() { // from class: gd0.m
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantTabMeItem.C16705d.m88979d(ZinstantTabMeItem.this);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            ZinstantTabMeItem.this.setErrorItem(this.f84653b);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem$e */
    /* loaded from: classes4.dex */
    public static final class C16706e implements InterfaceC20083a {

        /* renamed from: b */
        final /* synthetic */ C12158a f84655b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC22508f f84656c;

        C16706e(C12158a c12158a, InterfaceC22508f interfaceC22508f) {
            this.f84655b = c12158a;
            this.f84656c = interfaceC22508f;
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            AbstractC19074t.m100208f(interfaceC20578a0, "zinstantTree");
            if (AbstractC19074t.m100204b(ZinstantTabMeItem.this.getItemZinstant(), this.f84655b)) {
                ZinstantTabMeItem.this.m91447b1(this.f84656c, interfaceC20578a0);
                ZinstantTabMeItem.this.m88974h1(this.f84655b.m67994d());
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            ZinstantTabMeItem.this.setErrorItem(this.f84655b.m67994d());
        }
    }

    public ZinstantTabMeItem(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C16702a());
        this.f84647j0 = m129210a;
        m88973g1();
        this.f84646i0 = AbstractC23136l9.m118725l0(getContext());
    }

    /* renamed from: g1 */
    private final void m88973g1() {
        setOnZinstantClickListener(new C16703b());
        setExternalScriptListener(new C16704c());
    }

    private final C16702a.a getContextProvider() {
        return (C16702a.a) this.f84647j0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getIdentifyKey() {
        Integer num;
        C12159b.a m67994d;
        try {
            C12158a c12158a = this.f84644g0;
            if (c12158a != null && (m67994d = c12158a.m67994d()) != null) {
                num = Integer.valueOf(m67994d.m68000a());
            } else {
                num = null;
            }
            return String.valueOf(num);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public final void m88974h1(C12159b.a aVar) {
        m91445Y0(getContextProvider(), new C16705d(aVar));
    }

    /* renamed from: i1 */
    private final void m88975i1(C12158a c12158a) {
        InterfaceC22508f interfaceC22508f;
        C12159b.a m67994d;
        C17244x0 m68001b;
        C12159b.a aVar = null;
        if (c12158a != null && (m67994d = c12158a.m67994d()) != null && (m68001b = m67994d.m68001b()) != null) {
            interfaceC22508f = m68001b.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (interfaceC22508f == null) {
            if (c12158a != null) {
                aVar = c12158a.m67994d();
            }
            setErrorItem(aVar);
            return;
        }
        int m118725l0 = AbstractC23136l9.m118725l0(getContext());
        this.f84646i0 = m118725l0;
        try {
            AbstractC17148f0.m91694m(interfaceC22508f, m118725l0, new C16706e(c12158a, interfaceC22508f));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104549b(e11);
            setErrorItem(c12158a.m67994d());
        }
    }

    /* renamed from: f1 */
    public final void m88976f1(C12158a c12158a, View view) {
        try {
            this.f84644g0 = c12158a;
            this.f84645h0 = view;
            setUseProgressLoading(false);
            m88975i1(c12158a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final C12158a getItemZinstant() {
        return this.f84644g0;
    }

    public final View getLineView() {
        return this.f84645h0;
    }

    public final int getTargetWidth() {
        return this.f84646i0;
    }

    public final void setErrorItem(C12159b.a aVar) {
        if (aVar != null) {
            aVar.m68003d(true);
        }
        C23744a.Companion.m124119a().m124116d(6090, new Object[0]);
    }

    public final void setItemZinstant(C12158a c12158a) {
        this.f84644g0 = c12158a;
    }

    public final void setLineView(View view) {
        this.f84645h0 = view;
    }

    public final void setTargetWidth(int i11) {
        this.f84646i0 = i11;
    }
}
