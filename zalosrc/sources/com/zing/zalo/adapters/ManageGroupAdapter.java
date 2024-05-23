package com.zing.zalo.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ManageGroupAdapter;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseChatSettingItemModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseHeaderTitleModuleView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import th.AbstractC26689j;

/* loaded from: classes3.dex */
public final class ManageGroupAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final InterfaceC6975b f38150r;

    /* renamed from: s */
    private final boolean f38151s;

    /* renamed from: t */
    private final ArrayList f38152t;

    /* renamed from: u */
    public boolean f38153u;

    /* loaded from: classes3.dex */
    public static final class HeaderItemModuleView extends BaseHeaderTitleModuleView implements InterfaceC6974a {
        public HeaderItemModuleView(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.adapters.ManageGroupAdapter.InterfaceC6974a
        /* renamed from: B */
        public void mo35741B(C6976c c6976c, int i11, boolean z11) {
            int i12;
            if (!(c6976c instanceof C6978e)) {
                return;
            }
            C6978e c6978e = (C6978e) c6976c;
            this.f64546M.m111959G1(c6978e.m35750e());
            C16719g c16719g = this.f64544K;
            if (c6978e.m35749d()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c16719g.mo44614b1(i12);
        }
    }

    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes3.dex */
    public static final class SettingItemModuleView extends BaseChatSettingItemModuleView implements InterfaceC6974a {

        /* renamed from: V */
        private final InterfaceC6975b f38154V;

        /* renamed from: W */
        private final boolean f38155W;

        public SettingItemModuleView(Context context, InterfaceC6975b interfaceC6975b, boolean z11) {
            super(context);
            this.f38154V = interfaceC6975b;
            this.f38155W = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public static final void m35743W(SettingItemModuleView settingItemModuleView, C6976c c6976c, View view) {
            AbstractC19074t.m100208f(settingItemModuleView, "this$0");
            InterfaceC6975b interfaceC6975b = settingItemModuleView.f38154V;
            if (interfaceC6975b != null) {
                C6979f c6979f = (C6979f) c6976c;
                interfaceC6975b.mo35744a(c6979f.m35755h(), !c6979f.m35756i(), c6979f);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
        @Override // com.zing.zalo.adapters.ManageGroupAdapter.InterfaceC6974a
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo35741B(final C6976c c6976c, int i11, boolean z11) {
            int i12;
            int m35755h;
            int i13;
            int m35755h2;
            int i14;
            int i15;
            if (!(c6976c instanceof C6979f)) {
                return;
            }
            C6979f c6979f = (C6979f) c6976c;
            boolean m35758k = c6979f.m35758k();
            int i16 = 8;
            if (c6979f.m35755h() == 8) {
                this.f64531N.m111959G1(AbstractC23136l9.m118746s0(c6979f.m35757j(), Integer.valueOf(c6979f.m35754g())));
            } else {
                this.f64531N.m111958F1(c6979f.m35757j());
            }
            if (m35758k) {
                int m35755h3 = c6979f.m35755h();
                if (m35755h3 != 7 && m35755h3 != 18) {
                    this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
                } else {
                    this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1));
                }
            } else {
                this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.DisableSubText));
            }
            int m35755h4 = c6979f.m35755h();
            if (m35755h4 != 0 && m35755h4 != 1) {
                if (m35755h4 != 3) {
                    if (m35755h4 != 9) {
                        if (m35755h4 != 24) {
                            if (m35755h4 != 11 && m35755h4 != 12) {
                                if (m35755h4 != 15) {
                                    if (m35755h4 != 16) {
                                        if (m35755h4 != 19) {
                                            if (m35755h4 != 20) {
                                                switch (m35755h4) {
                                                    case 27:
                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                        break;
                                                    case 28:
                                                        this.f64532O.mo44614b1(0);
                                                        this.f64532O.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_save_media_captured_by_zalo_camera_desc));
                                                        break;
                                                    case 29:
                                                        this.f64532O.mo44614b1(0);
                                                        this.f64532O.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_new_photo_suggest_desc));
                                                        break;
                                                    default:
                                                        if (c6979f.f38163e.length() > 0) {
                                                            this.f64532O.mo44614b1(0);
                                                            this.f64532O.m111959G1(c6979f.f38163e);
                                                            break;
                                                        } else {
                                                            this.f64532O.mo44614b1(8);
                                                            break;
                                                        }
                                                }
                                            }
                                        } else {
                                            this.f64532O.mo44614b1(0);
                                            this.f64532O.m111958F1(AbstractC8020f0.str_des_create_shortcut_call);
                                        }
                                    } else {
                                        this.f64532O.m111958F1(AbstractC8020f0.str_general_setting_create_shortcut_subtitle);
                                    }
                                } else {
                                    this.f64532O.mo44614b1(0);
                                    this.f64532O.m111958F1(AbstractC8020f0.str_general_setting_show_emoji_subtitle);
                                }
                            }
                        } else if (AbstractC26689j.m137085L()) {
                            this.f64532O.mo44614b1(8);
                        } else {
                            this.f64532O.mo44614b1(0);
                            this.f64532O.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_recommend_send_photo_hd_setting_description));
                        }
                    } else {
                        this.f64532O.mo44614b1(8);
                        if (!c6979f.m35756i()) {
                            this.f64532O.m111958F1(AbstractC8020f0.str_admin_tool_new_member_approval_subtitle);
                        } else if (c6979f.m35753f().length() > 0) {
                            this.f64532O.m111953A1(2);
                            this.f64532O.m111959G1(c6979f.m35753f());
                        } else {
                            this.f64532O.m111958F1(AbstractC8020f0.str_no_question_asked);
                        }
                    }
                } else {
                    this.f64532O.mo44614b1(8);
                    this.f64532O.m111958F1(AbstractC8020f0.str_setting_chat_history_subtitle);
                }
                C22126c0 c22126c0 = this.f64532O;
                Context context = getContext();
                if (!m35758k) {
                    i12 = AbstractC21196a.TextColor2;
                } else {
                    i12 = AbstractC16781w.DisableSubText;
                }
                c22126c0.m111962J1(C23212s8.m119607o(context, i12));
                this.f64533P.mo44614b1(8);
                this.f64537T.mo44614b1(8);
                this.f64538U.mo44614b1(8);
                m35755h = c6979f.m35755h();
                if (m35755h == 9) {
                    if (m35755h != 13) {
                        if (m35755h == 19 && c6979f.m35754g() > 0) {
                            this.f64538U.mo44614b1(0);
                        }
                    } else {
                        this.f64533P.mo44614b1(0);
                        C22126c0 c22126c02 = this.f64533P;
                        if (c6979f.m35754g() > 1) {
                            i15 = AbstractC8020f0.str_num_people;
                        } else {
                            i15 = AbstractC8020f0.str_num_person;
                        }
                        c22126c02.m111959G1(AbstractC23136l9.m118746s0(i15, Integer.valueOf(c6979f.m35754g())));
                    }
                } else if (!c6979f.m35756i()) {
                    this.f64533P.mo44614b1(0);
                    this.f64533P.m111958F1(AbstractC8020f0.str_switch_text_off);
                } else if (c6979f.m35754g() > 0) {
                    this.f64537T.mo44614b1(0);
                    C22126c0 c22126c03 = this.f64537T;
                    int m35754g = c6979f.m35754g();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m35754g);
                    c22126c03.m111959G1(sb2.toString());
                } else {
                    this.f64533P.mo44614b1(0);
                    this.f64533P.m111958F1(AbstractC8020f0.str_switch_text_on);
                }
                C22126c0 c22126c04 = this.f64533P;
                Context context2 = getContext();
                if (!m35758k) {
                    i13 = AbstractC21196a.TextColor2;
                } else {
                    i13 = AbstractC16781w.DisableSubText;
                }
                c22126c04.m111962J1(C23212s8.m119607o(context2, i13));
                this.f64534Q.mo89107L0(null);
                m35755h2 = c6979f.m35755h();
                if (m35755h2 == 3 && m35755h2 != 4 && m35755h2 != 15 && m35755h2 != 17 && m35755h2 != 24 && m35755h2 != 21 && m35755h2 != 22 && m35755h2 != 28 && m35755h2 != 29) {
                    this.f64534Q.mo44614b1(8);
                } else {
                    this.f64534Q.mo44614b1(0);
                    this.f64534Q.mo89091D0(c6979f.m35756i());
                }
                if (!c6979f.m35751d()) {
                    setOnClickListener(null);
                } else {
                    setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.l3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ManageGroupAdapter.SettingItemModuleView.m35743W(ManageGroupAdapter.SettingItemModuleView.this, c6976c, view);
                        }
                    });
                }
                if (!c6979f.f38166h) {
                    this.f64528K.mo44614b1(8);
                    this.f64529L.mo44614b1(8);
                    return;
                }
                C16719g c16719g = this.f64528K;
                if (c6979f.m35752e()) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                c16719g.mo44614b1(i14);
                C16719g c16719g2 = this.f64529L;
                if (c6979f.m35752e()) {
                    i16 = 0;
                }
                c16719g2.mo44614b1(i16);
                return;
            }
            this.f64532O.mo44614b1(0);
            this.f64532O.m111959G1(AbstractC23184q2.m119454l(c6979f.m35756i(), this.f38155W));
            C22126c0 c22126c05 = this.f64532O;
            Context context3 = getContext();
            if (!m35758k) {
            }
            c22126c05.m111962J1(C23212s8.m119607o(context3, i12));
            this.f64533P.mo44614b1(8);
            this.f64537T.mo44614b1(8);
            this.f64538U.mo44614b1(8);
            m35755h = c6979f.m35755h();
            if (m35755h == 9) {
            }
            C22126c0 c22126c042 = this.f64533P;
            Context context22 = getContext();
            if (!m35758k) {
            }
            c22126c042.m111962J1(C23212s8.m119607o(context22, i13));
            this.f64534Q.mo89107L0(null);
            m35755h2 = c6979f.m35755h();
            if (m35755h2 == 3) {
            }
            this.f64534Q.mo44614b1(0);
            this.f64534Q.mo89091D0(c6979f.m35756i());
            if (!c6979f.m35751d()) {
            }
            if (!c6979f.f38166h) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6974a {
        /* renamed from: B */
        void mo35741B(C6976c c6976c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6975b {
        /* renamed from: a */
        void mo35744a(int i11, boolean z11, C6979f c6979f);
    }

    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$c */
    /* loaded from: classes3.dex */
    public static class C6976c {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final int f38156a;

        /* renamed from: b */
        private String f38157b = "";

        /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C6976c(int i11) {
            this.f38156a = i11;
        }

        /* renamed from: a */
        public final String m35745a() {
            return this.f38157b;
        }

        /* renamed from: b */
        public final int m35746b() {
            return this.f38156a;
        }

        /* renamed from: c */
        public final void m35747c(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f38157b = str;
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$d */
    /* loaded from: classes3.dex */
    public static final class C6977d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ModulesView f38158I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6977d(ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "moduleView");
            this.f38158I = modulesView;
        }

        /* renamed from: i0 */
        public final void m35748i0(C6976c c6976c, int i11, boolean z11) {
            ViewParent viewParent = this.f38158I;
            if (viewParent instanceof InterfaceC6974a) {
                AbstractC19074t.m100206d(viewParent, "null cannot be cast to non-null type com.zing.zalo.adapters.ManageGroupAdapter.BindDataInterface");
                ((InterfaceC6974a) viewParent).mo35741B(c6976c, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$e */
    /* loaded from: classes3.dex */
    public static final class C6978e extends C6976c {

        /* renamed from: c */
        private String f38159c;

        /* renamed from: d */
        private boolean f38160d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6978e(String str, boolean z11) {
            super(1);
            AbstractC19074t.m100208f(str, "text");
            this.f38159c = str;
            this.f38160d = z11;
        }

        /* renamed from: d */
        public final boolean m35749d() {
            return this.f38160d;
        }

        /* renamed from: e */
        public final String m35750e() {
            return this.f38159c;
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$f */
    /* loaded from: classes3.dex */
    public static final class C6979f extends C6976c {
        public static final a Companion = new a(null);

        /* renamed from: c */
        private final int f38161c;

        /* renamed from: d */
        private int f38162d;

        /* renamed from: e */
        public String f38163e;

        /* renamed from: f */
        private boolean f38164f;

        /* renamed from: g */
        private boolean f38165g;

        /* renamed from: h */
        public boolean f38166h;

        /* renamed from: i */
        private boolean f38167i;

        /* renamed from: j */
        private boolean f38168j;

        /* renamed from: k */
        private int f38169k;

        /* renamed from: l */
        private String f38170l;

        /* renamed from: com.zing.zalo.adapters.ManageGroupAdapter$f$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C6979f(int i11, int i12, boolean z11) {
            super(0);
            this.f38163e = "";
            this.f38165g = true;
            this.f38168j = true;
            this.f38170l = "";
            this.f38161c = i11;
            this.f38162d = i12;
            this.f38164f = z11;
        }

        /* renamed from: d */
        public final boolean m35751d() {
            return this.f38167i;
        }

        /* renamed from: e */
        public final boolean m35752e() {
            return this.f38165g;
        }

        /* renamed from: f */
        public final String m35753f() {
            return this.f38170l;
        }

        /* renamed from: g */
        public final int m35754g() {
            return this.f38169k;
        }

        /* renamed from: h */
        public final int m35755h() {
            return this.f38161c;
        }

        /* renamed from: i */
        public final boolean m35756i() {
            return this.f38164f;
        }

        /* renamed from: j */
        public final int m35757j() {
            return this.f38162d;
        }

        /* renamed from: k */
        public final boolean m35758k() {
            return this.f38168j;
        }

        /* renamed from: l */
        public final void m35759l(boolean z11) {
            this.f38165g = z11;
        }

        /* renamed from: m */
        public final void m35760m(boolean z11) {
            this.f38168j = z11;
        }

        /* renamed from: n */
        public final void m35761n(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f38170l = str;
        }

        /* renamed from: o */
        public final void m35762o(int i11) {
            this.f38169k = i11;
        }

        public C6979f(int i11, int i12, boolean z11, int i13) {
            super(0);
            this.f38163e = "";
            this.f38165g = true;
            this.f38168j = true;
            this.f38170l = "";
            this.f38161c = i11;
            this.f38162d = i12;
            this.f38164f = z11;
            this.f38169k = i13;
        }
    }

    public ManageGroupAdapter(InterfaceC6975b interfaceC6975b, boolean z11) {
        AbstractC19074t.m100208f(interfaceC6975b, "groupMemberListener");
        this.f38150r = interfaceC6975b;
        this.f38151s = z11;
        this.f38152t = new ArrayList();
    }

    /* renamed from: L */
    public final int m35736L(String str) {
        AbstractC19074t.m100208f(str, "id");
        if (this.f38152t.isEmpty()) {
            return -1;
        }
        Iterator it = this.f38152t.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (AbstractC19074t.m100204b(((C6976c) it.next()).m35745a(), str)) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: M */
    public final C6976c m35737M(int i11) {
        if (i11 >= 0 && i11 < this.f38152t.size()) {
            return (C6976c) this.f38152t.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C6977d c6977d, int i11) {
        AbstractC19074t.m100208f(c6977d, "holder");
        try {
            c6977d.m35748i0(m35737M(i11), i11, this.f38153u);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public C6977d mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        if (i11 != 0) {
            if (i11 != 1) {
                return new C6977d(new ModulesView(context));
            }
            return new C6977d(new HeaderItemModuleView(context));
        }
        return new C6977d(new SettingItemModuleView(context, this.f38150r, this.f38151s));
    }

    /* renamed from: P */
    public final void m35740P(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "itemList");
        this.f38152t.clear();
        this.f38152t.addAll(arrayList);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38152t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C6976c m35737M = m35737M(i11);
        if (m35737M != null) {
            return m35737M.m35746b();
        }
        return -1;
    }
}
