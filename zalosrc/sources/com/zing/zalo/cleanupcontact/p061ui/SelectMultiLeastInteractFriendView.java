package com.zing.zalo.cleanupcontact.p061ui;

import ac.C0697c0;
import am.AbstractC0906d0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.cleanupcontact.p061ui.SelectMultiLeastInteractFriendView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23212s8;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21932r;
import p348mi.AbstractC23309i;
import p447qg.C25258a;
import p482rg.C25779i;
import p482rg.InterfaceC25774d;
import p482rg.InterfaceC25775e;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p649xl.C29785eb;
import p716zh.C31901e8;
import p716zh.C32002l4;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import sg.C26244d;

/* loaded from: classes3.dex */
public final class SelectMultiLeastInteractFriendView extends SlidableZaloView implements InterfaceC25775e {

    /* renamed from: P0 */
    public C29785eb f42097P0;

    /* renamed from: Q0 */
    private C25258a f42098Q0 = new C25258a();

    /* renamed from: R0 */
    private boolean f42099R0;

    /* renamed from: S0 */
    private C16972e0 f42100S0;

    /* renamed from: T0 */
    private InterfaceC25774d f42101T0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$a */
    /* loaded from: classes3.dex */
    public static final class C7841a extends AbstractC19075u implements InterfaceC18505l {
        C7841a() {
            super(1);
        }

        /* renamed from: a */
        public final void m39909a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "it");
            SelectMultiLeastInteractFriendView.this.m39905uM("711360", contactProfile);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m39909a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$b */
    /* loaded from: classes3.dex */
    public static final class C7842b extends AbstractC19075u implements InterfaceC18505l {
        C7842b() {
            super(1);
        }

        /* renamed from: a */
        public final void m39910a(ContactProfile contactProfile) {
            ArrayList m131500h;
            AbstractC19074t.m100208f(contactProfile, "it");
            SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView = SelectMultiLeastInteractFriendView.this;
            m131500h = AbstractC25368s.m131500h(contactProfile);
            selectMultiLeastInteractFriendView.m39883oM(m131500h);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m39910a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$c */
    /* loaded from: classes3.dex */
    public static final class C7843c extends AbstractC19075u implements InterfaceC18505l {
        C7843c() {
            super(1);
        }

        /* renamed from: a */
        public final void m39911a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "it");
            SelectMultiLeastInteractFriendView.this.m39895HM(contactProfile);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m39911a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$d */
    /* loaded from: classes3.dex */
    public static final class C7844d extends AbstractC19075u implements InterfaceC18494a {
        C7844d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m39912a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m39912a() {
            SelectMultiLeastInteractFriendView.this.mo39891Au();
            SelectMultiLeastInteractFriendView.this.mo39899n9();
        }
    }

    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$e */
    /* loaded from: classes3.dex */
    public static final class C7845e extends ZdsActionBar.AbstractC16987c {
        C7845e() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            SelectMultiLeastInteractFriendView.this.m39908zM();
        }
    }

    /* renamed from: com.zing.zalo.cleanupcontact.ui.SelectMultiLeastInteractFriendView$f */
    /* loaded from: classes3.dex */
    public static final class C7846f extends ZdsActionBar.AbstractC16987c {
        C7846f() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            SelectMultiLeastInteractFriendView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m39873BM(SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, View view) {
        AbstractC19074t.m100208f(selectMultiLeastInteractFriendView, "this$0");
        selectMultiLeastInteractFriendView.m39907yM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m39874FM(SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, View view) {
        AbstractC19074t.m100208f(selectMultiLeastInteractFriendView, "this$0");
        selectMultiLeastInteractFriendView.m39883oM(selectMultiLeastInteractFriendView.f42098Q0.m130701Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m39875GM(SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, String str) {
        AbstractC19074t.m100208f(selectMultiLeastInteractFriendView, "this$0");
        AbstractC19074t.m100208f(str, "$msg");
        ToastUtils.m89276x(selectMultiLeastInteractFriendView, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: oM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m39883oM(final List list) {
        boolean z11;
        String m118746s0;
        Object obj;
        C31901e8 m2800f;
        String m153297j;
        if (m92648SI() != null) {
            Context m92648SI = m92648SI();
            AbstractC19074t.m100205c(m92648SI);
            if (AbstractC23034c6.m118167n(m92648SI, AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_on_cleanup_relation")) {
                z11 = true;
                if (z11) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ContactProfile contactProfile = (ContactProfile) it.next();
                            String str = contactProfile.f42455y;
                            if (str != null && str.length() != 0 && (m2800f = AbstractC0906d0.m2800f(getContext(), contactProfile.f42455y)) != null && (m153297j = m2800f.m153297j()) != null && m153297j.length() != 0) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (list.size() >= 2) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_delete_contact_dialog, m39887tM(this, (ContactProfile) list.get(0), false, 2, null));
                } else if (list.size() == 2) {
                    int i11 = AbstractC8020f0.str_hint_delete_contact_dialog;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("%s %s %s", Arrays.copyOf(new Object[]{m39887tM(this, (ContactProfile) list.get(0), false, 2, null), AbstractC23136l9.m118743r0(AbstractC8020f0.str_and), m39887tM(this, (ContactProfile) list.get(1), false, 2, null)}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    m118746s0 = AbstractC23136l9.m118746s0(i11, format);
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_delete_multiple_contact_dialog, m39887tM(this, (ContactProfile) list.get(0), false, 2, null), Integer.valueOf(list.size() - 1));
                }
                AbstractC19074t.m100205c(m118746s0);
                final C19059j0 c19059j0 = new C19059j0();
                if (z11) {
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    CheckBox checkBox = new CheckBox(m92689tK);
                    c19059j0.f94941p = checkBox;
                    checkBox.setTextColor(C23212s8.m119606n(AbstractC2807a.TextColor1));
                    if (list.size() == 1) {
                        String m118282h = AbstractC23056e6.m118282h(((ContactProfile) list.get(0)).f42455y, AbstractC23309i.m121704a5(), false);
                        if (m118282h == null || m118282h.length() == 0 || AbstractC19074t.m100204b(m118282h, AbstractC23056e6.f112062a)) {
                            m118282h = ((ContactProfile) list.get(0)).f42455y;
                        }
                        String str2 = m39886sM((ContactProfile) list.get(0), false) + " (" + m118282h + ")";
                        ((CheckBox) c19059j0.f94941p).setText(AbstractC23217t2.m119658j(AbstractC23136l9.m118746s0(AbstractC8020f0.str_delete_from_phonebook_single, str2), str2, C23212s8.m119607o(getContext(), AbstractC2807a.TextColor1), 7));
                    } else {
                        ((CheckBox) c19059j0.f94941p).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_from_phonebook));
                    }
                }
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                C16972e0.a aVar = new C16972e0.a(m92689tK2);
                aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
                aVar.m90918B(m118746s0);
                aVar.m90921E(true);
                obj = c19059j0.f94941p;
                if (obj != null) {
                    aVar.m90924a((CheckBox) obj);
                }
                aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
                String string = m92651WI().getString(AbstractC8020f0.str_btn_delete_contact_dialog);
                AbstractC19074t.m100207e(string, "getString(...)");
                aVar.m90943t(string, new InterfaceC17463d.d() { // from class: rg.o
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SelectMultiLeastInteractFriendView.m39884pM(list, this, c19059j0, interfaceC17463d, i12);
                    }
                });
                aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
                String string2 = m92651WI().getString(AbstractC8020f0.str_cancel);
                AbstractC19074t.m100207e(string2, "getString(...)");
                aVar.m90934k(string2, new InterfaceC17463d.d() { // from class: rg.p
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SelectMultiLeastInteractFriendView.m39885qM(interfaceC17463d, i12);
                    }
                });
                this.f42100S0 = aVar.m90923G();
            }
        }
        z11 = false;
        if (z11) {
        }
        if (list.size() >= 2) {
        }
        AbstractC19074t.m100205c(m118746s0);
        final C19059j0 c19059j02 = new C19059j0();
        if (z11) {
        }
        Context m92689tK22 = m92689tK();
        AbstractC19074t.m100207e(m92689tK22, "requireContext(...)");
        C16972e0.a aVar2 = new C16972e0.a(m92689tK22);
        aVar2.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar2.m90918B(m118746s0);
        aVar2.m90921E(true);
        obj = c19059j02.f94941p;
        if (obj != null) {
        }
        aVar2.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
        String string3 = m92651WI().getString(AbstractC8020f0.str_btn_delete_contact_dialog);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar2.m90943t(string3, new InterfaceC17463d.d() { // from class: rg.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SelectMultiLeastInteractFriendView.m39884pM(list, this, c19059j02, interfaceC17463d, i12);
            }
        });
        aVar2.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String string22 = m92651WI().getString(AbstractC8020f0.str_cancel);
        AbstractC19074t.m100207e(string22, "getString(...)");
        aVar2.m90934k(string22, new InterfaceC17463d.d() { // from class: rg.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SelectMultiLeastInteractFriendView.m39885qM(interfaceC17463d, i12);
            }
        });
        this.f42100S0 = aVar2.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m39884pM(List list, SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, C19059j0 c19059j0, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(list, "$listUnfriend");
        AbstractC19074t.m100208f(selectMultiLeastInteractFriendView, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$checkBox");
        InterfaceC25774d interfaceC25774d = null;
        boolean z11 = false;
        if (list.size() == 1) {
            InterfaceC25774d interfaceC25774d2 = selectMultiLeastInteractFriendView.f42101T0;
            if (interfaceC25774d2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC25774d = interfaceC25774d2;
            }
            ContactProfile contactProfile = (ContactProfile) list.get(0);
            CheckBox checkBox = (CheckBox) c19059j0.f94941p;
            if (checkBox != null) {
                z11 = checkBox.isChecked();
            }
            interfaceC25774d.mo132908B0(contactProfile, z11);
        } else {
            InterfaceC25774d interfaceC25774d3 = selectMultiLeastInteractFriendView.f42101T0;
            if (interfaceC25774d3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC25774d = interfaceC25774d3;
            }
            CheckBox checkBox2 = (CheckBox) c19059j0.f94941p;
            if (checkBox2 != null) {
                z11 = checkBox2.isChecked();
            }
            interfaceC25774d.mo132910eo(z11, selectMultiLeastInteractFriendView.f42098Q0.m130701Z());
        }
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m39885qM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: sM */
    private final String m39886sM(ContactProfile contactProfile, boolean z11) {
        String m40385R;
        if (contactProfile != null && (m40385R = contactProfile.m40385R(true, false, z11)) != null) {
            if (m40385R.length() > 40) {
                String substring = m40385R.substring(0, 40);
                AbstractC19074t.m100207e(substring, "substring(...)");
                return substring + "...";
            }
            return m40385R;
        }
        return "";
    }

    /* renamed from: tM */
    static /* synthetic */ String m39887tM(SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, ContactProfile contactProfile, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return selectMultiLeastInteractFriendView.m39886sM(contactProfile, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m39888wM(SelectMultiLeastInteractFriendView selectMultiLeastInteractFriendView, View view) {
        AbstractC19074t.m100208f(selectMultiLeastInteractFriendView, "this$0");
        selectMultiLeastInteractFriendView.f42098Q0.m130706e0(!r3.m130702a0(), true);
        if (selectMultiLeastInteractFriendView.f42098Q0.m130702a0()) {
            selectMultiLeastInteractFriendView.m39903rM().f137683q.setText(selectMultiLeastInteractFriendView.m92652XI(AbstractC8020f0.str_tool_storage_deselect_all));
        } else {
            selectMultiLeastInteractFriendView.m39903rM().f137683q.setText(selectMultiLeastInteractFriendView.m92652XI(AbstractC8020f0.str_tool_storage_select_all));
        }
        selectMultiLeastInteractFriendView.mo39891Au();
    }

    /* renamed from: xM */
    private final void m39889xM() {
        C21932r c21932r = C21932r.f107858a;
        List m114400e = c21932r.m114400e();
        if (m114400e != null && !m114400e.isEmpty()) {
            List m114400e2 = c21932r.m114400e();
            AbstractC19074t.m100205c(m114400e2);
            mo39901ol(m114400e2);
            mo39904tz(false);
        }
        m39903rM().f137686t.setLayoutManager(new LinearLayoutManager(m92689tK()));
        m39903rM().f137686t.setAdapter(this.f42098Q0);
        this.f42098Q0.m130708g0(new C7844d());
        List m114400e3 = c21932r.m114400e();
        if (m114400e3 == null || m114400e3.isEmpty()) {
            InterfaceC25774d interfaceC25774d = this.f42101T0;
            if (interfaceC25774d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC25774d = null;
            }
            interfaceC25774d.mo132909H1();
        }
    }

    /* renamed from: AM */
    public void m39890AM(ZdsActionBar zdsActionBar) {
        AbstractC19074t.m100208f(zdsActionBar, "<this>");
        zdsActionBar.setLeadingType(ZdsActionBar.EnumC16988d.CLOSE.m91015c());
        zdsActionBar.setLeadingFunctionCallback(new C7846f());
        zdsActionBar.setEnableTrailingButton(true);
        zdsActionBar.setIdTrailingButton("suggest_cleanup_relation_multiunfriend");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_least_interacted_with);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        zdsActionBar.setMiddleTitle(m118743r0);
        String string = zdsActionBar.getResources().getString(AbstractC8020f0.str_multi_unfriend);
        AbstractC19074t.m100207e(string, "getString(...)");
        zdsActionBar.setTrailingButtonText(string);
        zdsActionBar.setTrailingButton1Style(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: rg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMultiLeastInteractFriendView.m39873BM(SelectMultiLeastInteractFriendView.this, view);
            }
        });
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: Au */
    public void mo39891Au() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_delete_contact);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(this.f42098Q0.m130701Z().size())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m87077NK.setTrailingButtonText(format);
            if (this.f42098Q0.m130701Z().isEmpty()) {
                m39893DM(m87077NK);
            } else {
                m39894EM(m87077NK);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f42101T0 = new C25779i(this);
    }

    /* renamed from: CM */
    public final void m39892CM(C29785eb c29785eb) {
        AbstractC19074t.m100208f(c29785eb, "<set-?>");
        this.f42097P0 = c29785eb;
    }

    /* renamed from: DM */
    public void m39893DM(ZdsActionBar zdsActionBar) {
        AbstractC19074t.m100208f(zdsActionBar, "<this>");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_unfriend);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        zdsActionBar.setMiddleTitle(m118743r0);
        zdsActionBar.setEnableTrailingButton(false);
        String string = zdsActionBar.getResources().getString(AbstractC8020f0.str_btn_delete_contact_dialog);
        AbstractC19074t.m100207e(string, "getString(...)");
        zdsActionBar.setTrailingButtonText(string);
        zdsActionBar.setTrailingButton1Style(AbstractC2814h.ButtonMedium_TertiaryNeutral);
    }

    /* renamed from: EM */
    public void m39894EM(ZdsActionBar zdsActionBar) {
        AbstractC19074t.m100208f(zdsActionBar, "<this>");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_unfriend);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        zdsActionBar.setMiddleTitle(m118743r0);
        zdsActionBar.setEnableTrailingButton(true);
        zdsActionBar.setIdTrailingButton("suggest_cleanup_relation_multiunfriend");
        zdsActionBar.setTrailingButton1Style(AbstractC2814h.ButtonMedium_TertiaryDanger);
        zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: rg.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMultiLeastInteractFriendView.m39874FM(SelectMultiLeastInteractFriendView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29785eb m147904c = C29785eb.m147904c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147904c, "inflate(...)");
        m39892CM(m147904c);
        RelativeLayout root = m39903rM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: HM */
    public void m39895HM(ContactProfile contactProfile) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(contactProfile, "profileContact");
        try {
            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                C21927m.m114302u().m114330e0(contactProfile.f42434r, new TrackingSource(49));
                if (this.f72421L0.m92676n2() != null) {
                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                    AbstractC19074t.m100205c(m92676n2);
                    c17487o0 = m92676n2.mo35579p();
                } else {
                    c17487o0 = null;
                }
                C26365a m135743b = new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(9)).m135739F("3250").m135743b();
                if (c17487o0 != null) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), m135743b, 0, 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m39890AM(m87077NK);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m39889xM();
        m39906vM();
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: e0 */
    public void mo39897e0(final String str) {
        AbstractC19074t.m100208f(str, "msg");
        mo70710wy(new Runnable() { // from class: rg.q
            @Override // java.lang.Runnable
            public final void run() {
                SelectMultiLeastInteractFriendView.m39875GM(SelectMultiLeastInteractFriendView.this, str);
            }
        });
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: g */
    public void mo39898g() {
        finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "suggest_cleanup_relation_list";
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: n9 */
    public void mo39899n9() {
        if (this.f42098Q0.m130701Z().size() < this.f42098Q0.m130696U().size()) {
            m39903rM().f137683q.setText(m92652XI(AbstractC8020f0.str_tool_storage_select_all));
        } else {
            m39903rM().f137683q.setText(m92652XI(AbstractC8020f0.str_tool_storage_deselect_all));
        }
    }

    /* renamed from: nM */
    public void m39900nM(boolean z11) {
        this.f42098Q0.m130695T(z11);
        C26244d c26244d = C26244d.f124646a;
        FrameLayout frameLayout = m39903rM().f137684r;
        AbstractC19074t.m100207e(frameLayout, "llBottomPanel");
        c26244d.m134937d(frameLayout, z11);
        this.f42099R0 = z11;
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: ol */
    public void mo39901ol(List list) {
        AbstractC19074t.m100208f(list, "lst");
        int size = list.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (!AbstractC21935u.m114554u(((ContactProfile) list.get(size)).f42434r)) {
                    list.remove(size);
                }
            } else {
                this.f42098Q0.m130707f0(list);
                return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        int i11;
        C21932r c21932r;
        List m114400e;
        super.onResume();
        if (!this.f42099R0 && (m114400e = (c21932r = C21932r.f107858a).m114400e()) != null && !m114400e.isEmpty()) {
            List m114400e2 = c21932r.m114400e();
            AbstractC19074t.m100205c(m114400e2);
            mo39901ol(m114400e2);
        }
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1050d(this, "suggest_size_total", C18644n.m98531l().m98553p().size());
        List m114400e3 = C21932r.f107858a.m114400e();
        if (m114400e3 != null) {
            i11 = m114400e3.size();
        } else {
            i11 = 0;
        }
        bVar.m1050d(this, "suggest_size_cur", i11);
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: qc */
    public void mo39902qc() {
        this.f42098Q0.m130694S();
    }

    /* renamed from: rM */
    public final C29785eb m39903rM() {
        C29785eb c29785eb = this.f42097P0;
        if (c29785eb != null) {
            return c29785eb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // p482rg.InterfaceC25775e
    /* renamed from: tz */
    public void mo39904tz(boolean z11) {
        if (z11) {
            m39903rM().f137685s.setState(MultiStateView.EnumC15914e.LOADING);
            m39903rM().f137685s.setVisibility(0);
        } else {
            m39903rM().f137685s.setVisibility(8);
        }
    }

    /* renamed from: uM */
    public void m39905uM(String str, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "currentSelectedContact");
        try {
            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                AbstractC23059e9.m118318G(3);
                Bundle bundle = new Bundle();
                bundle.putString("extra_chat_profile_uid", contactProfile.f42434r);
                bundle.putString("extra_chat_profile_dpn", contactProfile.f42437s);
                bundle.putString("extra_chat_profile_avt", contactProfile.f42446v);
                bundle.putInt("extra_chat_profile_type_contact", contactProfile.f42352K0);
                bundle.putLong("extra_chat_profile_last_action", 0L);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.putExtra("SOURCE_ACTION", str);
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                AbstractC19074t.m100205c(m92676n2);
                m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: vM */
    public void m39906vM() {
        m39903rM().f137683q.setOnClickListener(new View.OnClickListener() { // from class: rg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMultiLeastInteractFriendView.m39888wM(SelectMultiLeastInteractFriendView.this, view);
            }
        });
        this.f42098Q0.m130711j0(new C7841a());
        this.f42098Q0.m130710i0(new C7842b());
        this.f42098Q0.m130709h0(new C7843c());
    }

    /* renamed from: yM */
    public void m39907yM() {
        if (!this.f42099R0) {
            m39900nM(true);
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m39893DM(m87077NK);
                m87077NK.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
                m87077NK.setLeadingFunctionCallback(new C7845e());
            }
        }
    }

    /* renamed from: zM */
    public void m39908zM() {
        m39900nM(false);
        this.f42098Q0.m130694S();
        mo39899n9();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m39890AM(m87077NK);
        }
    }
}
