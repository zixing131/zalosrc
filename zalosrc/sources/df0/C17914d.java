package df0;

import android.content.Context;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import df0.C17914d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import p173fz.C19172a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import ti0.C26705d;
import ti0.C26708g;
import vg.C28211v5;

/* renamed from: df0.d */
/* loaded from: classes4.dex */
public final class C17914d {

    /* renamed from: a */
    public static final C17914d f90441a = new C17914d();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: df0.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f90442a;

        /* renamed from: b */
        private final String f90443b;

        /* renamed from: c */
        private final String f90444c;

        /* renamed from: d */
        private final String f90445d;

        public a(String str) {
            AbstractC19074t.m100208f(str, "root");
            this.f90442a = str + "@consent_title";
            this.f90443b = str + "@consent_description";
            this.f90444c = str + "@find_more_enable";
            this.f90445d = str + "@find_more_link";
        }

        /* renamed from: a */
        public final String m94502a() {
            return this.f90443b;
        }

        /* renamed from: b */
        public final String m94503b() {
            return this.f90444c;
        }

        /* renamed from: c */
        public final String m94504c() {
            return this.f90445d;
        }

        /* renamed from: d */
        public final String m94505d() {
            return this.f90442a;
        }
    }

    /* renamed from: df0.d$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final int f90446a;

        /* renamed from: b */
        private final String f90447b;

        /* renamed from: c */
        private String f90448c;

        /* renamed from: d */
        private String f90449d;

        /* renamed from: e */
        private boolean f90450e;

        /* renamed from: f */
        private String f90451f;

        /* renamed from: g */
        private final int f90452g;

        public b(int i11, String str) {
            Object m129218b;
            int i12;
            AbstractC19074t.m100208f(str, "logChatType");
            this.f90446a = i11;
            this.f90447b = str;
            this.f90448c = "";
            this.f90449d = "";
            this.f90451f = "";
            try {
                C24861r.a aVar = C24861r.f119264q;
                String str2 = i11 == 1 ? "voice_to_text" : "";
                if (str2.length() > 0) {
                    a aVar2 = new a(str2);
                    String c28211v5 = new C28211v5(C19172a.m100604o(aVar2.m94505d(), null, 2, null)).toString();
                    if (c28211v5.length() == 0) {
                        c28211v5 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_e2ee_consent_title);
                        AbstractC19074t.m100207e(c28211v5, "getString(...)");
                    }
                    this.f90448c = c28211v5;
                    String c28211v52 = new C28211v5(C19172a.m100604o(aVar2.m94502a(), null, 2, null)).toString();
                    if (c28211v52.length() == 0) {
                        c28211v52 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_e2ee_consent_des);
                        AbstractC19074t.m100207e(c28211v52, "getString(...)");
                    }
                    this.f90449d = c28211v52;
                    this.f90450e = C19172a.m100600k(aVar2.m94503b(), 0) == 1;
                    this.f90451f = C19172a.m100607r(aVar2.m94504c(), "https://help.zalo.me/huong-dan/chuyen-muc/nhan-tin-va-goi/nhan-tin/gui-tin-nhan-giong-noi/");
                }
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            } catch (Throwable th2) {
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            Throwable m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
                AbstractC20110a.f98889a.mo104552e(m129221e);
            }
            if (this.f90446a == 1) {
                i12 = 68;
            } else {
                i12 = -1;
            }
            this.f90452g = i12;
        }

        /* renamed from: a */
        public final String m94506a() {
            return this.f90449d;
        }

        /* renamed from: b */
        public final boolean m94507b() {
            return this.f90450e;
        }

        /* renamed from: c */
        public final String m94508c() {
            return this.f90451f;
        }

        /* renamed from: d */
        public final String m94509d() {
            return this.f90447b;
        }

        /* renamed from: e */
        public final int m94510e() {
            return this.f90452g;
        }

        /* renamed from: f */
        public final String m94511f() {
            return this.f90448c;
        }

        /* renamed from: g */
        public final int m94512g() {
            return this.f90446a;
        }
    }

    private C17914d() {
    }

    /* renamed from: d */
    public static final void m94499d(InterfaceC17463d.d dVar, b bVar, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(dVar, "$onAllow");
        AbstractC19074t.m100208f(bVar, "$data");
        dVar.mo605K8(interfaceC17463d, i11);
        C17915e.f90453a.m94514b(bVar.m94509d(), bVar.m94510e());
    }

    /* renamed from: e */
    public static final void m94500e(Context context, b bVar, View view) {
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(bVar, "$data");
        AbstractC23152n3.m119050j0(context, bVar.m94508c());
        C17915e.f90453a.m94516d(bVar.m94509d(), bVar.m94510e());
    }

    /* renamed from: c */
    public final C16972e0 m94501c(Context context, b bVar, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(bVar, "data");
        AbstractC19074t.m100208f(dVar, "onAllow");
        AbstractC19074t.m100208f(dVar2, "onDeny");
        C16972e0.a m90933j = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(bVar.m94511f()).m90949z(bVar.m94506a()).m90942s(AbstractC8020f0.str_btn_agree, new InterfaceC17463d.d() { // from class: df0.b

            /* renamed from: q */
            public final /* synthetic */ C17914d.b f90438q;

            public /* synthetic */ C17912b(C17914d.b bVar2) {
                r2 = bVar2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C17914d.m94499d(InterfaceC17463d.d.this, r2, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_mem_decline, dVar2);
        if (bVar2.m94507b() && bVar2.m94508c().length() > 0) {
            RobotoTextView robotoTextView = new RobotoTextView(context);
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_normal_m));
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more));
            robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.cta_link));
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: df0.c

                /* renamed from: p */
                public final /* synthetic */ Context f90439p;

                /* renamed from: q */
                public final /* synthetic */ C17914d.b f90440q;

                public /* synthetic */ ViewOnClickListenerC17913c(Context context2, C17914d.b bVar2) {
                    r1 = context2;
                    r2 = bVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17914d.m94500e(r1, r2, view);
                }
            });
            m90933j.m90929f(robotoTextView);
        }
        return m90933j.m90927d();
    }
}
