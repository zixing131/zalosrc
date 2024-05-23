package com.zing.zalo.p077ui.settings;

import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C1483e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chattag.BottomSheetUnSupportEditChatTag;
import com.zing.zalo.p077ui.settings.ManageConversationLabelSetting;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import la0.C22229g7;
import la0.RunnableC22204e0;
import la0.RunnableC22213f0;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p162fh.C18932a;
import p162fh.C18935d;
import p210hh.C20058a;
import p542ub.InterfaceC27218a;
import p649xl.C30104wb;
import qm0.AbstractC25368s;
import vl0.AbstractC28291a;

/* loaded from: classes6.dex */
public final class ManageConversationLabelSetting extends BaseSettingView {
    public static final C13112a Companion = new C13112a(null);

    /* renamed from: T0 */
    private C30104wb f67557T0;

    /* renamed from: V0 */
    private Switch f67559V0;

    /* renamed from: W0 */
    private Switch f67560W0;

    /* renamed from: X0 */
    private Switch f67561X0;

    /* renamed from: Y0 */
    private CheckBox f67562Y0;

    /* renamed from: Z0 */
    private volatile boolean f67563Z0;

    /* renamed from: U0 */
    private C20058a f67558U0 = C20058a.Companion.m104191a(C18932a.f94442a.m99179c());

    /* renamed from: a1 */
    private InterfaceC0765j f67564a1 = new C0766k();

    /* renamed from: com.zing.zalo.ui.settings.ManageConversationLabelSetting$a */
    /* loaded from: classes6.dex */
    public static final class C13112a {

        /* renamed from: com.zing.zalo.ui.settings.ManageConversationLabelSetting$a$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC27218a f67565a;

            a(InterfaceC27218a interfaceC27218a) {
                this.f67565a = interfaceC27218a;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                InterfaceC27218a interfaceC27218a = this.f67565a;
                if (interfaceC27218a != null) {
                    ToastUtils.showMess(AbstractC23136l9.m118749t0(interfaceC27218a.getContext(), AbstractC8020f0.network_error));
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                AbstractC19074t.m100208f(obj, "response");
                try {
                    if (((JSONObject) obj).optInt("error_code") == 0) {
                        AbstractC23148n.m118851y(45, 1, 45);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }

        private C13112a() {
        }

        public /* synthetic */ C13112a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m73586a(InterfaceC27218a interfaceC27218a) {
            ArrayList m131500h;
            m131500h = AbstractC25368s.m131500h(C1483e.m7482a(45, 1));
            a aVar = new a(interfaceC27218a);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(aVar);
            c0766k.mo1676k9(m131500h, new ArrayList());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.ManageConversationLabelSetting$b */
    /* loaded from: classes6.dex */
    public static final class C13113b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f67566a;

        /* renamed from: b */
        final /* synthetic */ ManageConversationLabelSetting f67567b;

        C13113b(List list, ManageConversationLabelSetting manageConversationLabelSetting) {
            this.f67566a = list;
            this.f67567b = manageConversationLabelSetting;
        }

        /* renamed from: e */
        public static final void m73589e(C19051f0 c19051f0, ManageConversationLabelSetting manageConversationLabelSetting) {
            AbstractC19074t.m100208f(c19051f0, "$needClearTagFilter");
            AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
            if (c19051f0.f94928p) {
                C18935d.Companion.m99234a().m99224h();
            }
            manageConversationLabelSetting.mo73526uM();
            manageConversationLabelSetting.m73577SM(manageConversationLabelSetting.f67558U0.m104184d(C18932a.f94442a.m99179c()));
        }

        /* renamed from: f */
        public static final void m73590f(ManageConversationLabelSetting manageConversationLabelSetting) {
            AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
            manageConversationLabelSetting.mo73526uM();
            manageConversationLabelSetting.m73577SM(manageConversationLabelSetting.f67558U0.m104184d(C18932a.f94442a.m99179c()));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RunnableC22204e0 runnableC22204e0;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    this.f67567b.m73585TM(false);
                    runnableC22204e0 = new Runnable() { // from class: la0.e0
                        public /* synthetic */ RunnableC22204e0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ManageConversationLabelSetting.C13113b.m73590f(ManageConversationLabelSetting.this);
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    this.f67567b.m73585TM(false);
                    runnableC22204e0 = new Runnable() { // from class: la0.e0
                        public /* synthetic */ RunnableC22204e0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ManageConversationLabelSetting.C13113b.m73590f(ManageConversationLabelSetting.this);
                        }
                    };
                }
                AbstractC19444a.m101697e(runnableC22204e0);
            } catch (Throwable th2) {
                this.f67567b.m73585TM(false);
                AbstractC19444a.m101697e(new Runnable() { // from class: la0.e0
                    public /* synthetic */ RunnableC22204e0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ManageConversationLabelSetting.C13113b.m73590f(ManageConversationLabelSetting.this);
                    }
                });
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RunnableC22213f0 runnableC22213f0;
            AbstractC19074t.m100208f(obj, "response");
            C19051f0 c19051f0 = new C19051f0();
            try {
                try {
                    if (((JSONObject) obj).optInt("error_code") == 0 && (!this.f67566a.isEmpty())) {
                        for (C1483e c1483e : this.f67566a) {
                            Object obj2 = c1483e.f6374a;
                            if (obj2 != null && c1483e.f6375b != null) {
                                AbstractC19074t.m100207e(obj2, "first");
                                int intValue = ((Number) obj2).intValue();
                                Object obj3 = c1483e.f6375b;
                                AbstractC19074t.m100207e(obj3, "second");
                                AbstractC23148n.m118851y(intValue, ((Number) obj3).intValue(), intValue);
                                if (intValue == 45) {
                                    c19051f0.f94928p = true;
                                }
                            }
                        }
                    }
                    this.f67567b.m73585TM(false);
                    runnableC22213f0 = new Runnable() { // from class: la0.f0

                        /* renamed from: q */
                        public final /* synthetic */ ManageConversationLabelSetting f109350q;

                        public /* synthetic */ RunnableC22213f0(ManageConversationLabelSetting manageConversationLabelSetting) {
                            r2 = manageConversationLabelSetting;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ManageConversationLabelSetting.C13113b.m73589e(C19051f0.this, r2);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    this.f67567b.m73585TM(false);
                    runnableC22213f0 = new Runnable() { // from class: la0.f0

                        /* renamed from: q */
                        public final /* synthetic */ ManageConversationLabelSetting f109350q;

                        public /* synthetic */ RunnableC22213f0(ManageConversationLabelSetting manageConversationLabelSetting) {
                            r2 = manageConversationLabelSetting;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ManageConversationLabelSetting.C13113b.m73589e(C19051f0.this, r2);
                        }
                    };
                }
                AbstractC19444a.m101697e(runnableC22213f0);
            } catch (Throwable th2) {
                this.f67567b.m73585TM(false);
                AbstractC19444a.m101697e(new Runnable() { // from class: la0.f0

                    /* renamed from: q */
                    public final /* synthetic */ ManageConversationLabelSetting f109350q;

                    public /* synthetic */ RunnableC22213f0(ManageConversationLabelSetting manageConversationLabelSetting) {
                        r2 = manageConversationLabelSetting;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ManageConversationLabelSetting.C13113b.m73589e(C19051f0.this, r2);
                    }
                });
                throw th2;
            }
        }
    }

    /* renamed from: IM */
    public static final void m73567IM(C30104wb c30104wb, View view) {
        AbstractC19074t.m100208f(c30104wb, "$this_apply");
        c30104wb.f139827v.callOnClick();
    }

    /* renamed from: JM */
    public static final void m73568JM(C30104wb c30104wb, View view) {
        AbstractC19074t.m100208f(c30104wb, "$this_apply");
        c30104wb.f139826u.callOnClick();
    }

    /* renamed from: KM */
    public static final void m73569KM(C30104wb c30104wb, View view) {
        AbstractC19074t.m100208f(c30104wb, "$this_apply");
        c30104wb.f139829x.callOnClick();
    }

    /* renamed from: LM */
    public static final void m73570LM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.CheckBox");
        manageConversationLabelSetting.m73576RM(((CheckBox) view).isChecked());
    }

    /* renamed from: MM */
    public static final void m73571MM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        ArrayList arrayList = new ArrayList();
        Switch r02 = manageConversationLabelSetting.f67559V0;
        if (r02 == null) {
            AbstractC19074t.m100223u("separateV1Switch");
            r02 = null;
        }
        arrayList.add(C1483e.m7482a(38, Integer.valueOf(!r02.isChecked() ? 1 : 0)));
        manageConversationLabelSetting.m73578UM(arrayList, new ArrayList());
    }

    /* renamed from: NM */
    public static final void m73572NM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        ArrayList arrayList = new ArrayList();
        Switch r02 = manageConversationLabelSetting.f67560W0;
        if (r02 == null) {
            AbstractC19074t.m100223u("separateSwitch");
            r02 = null;
        }
        arrayList.add(C1483e.m7482a(38, Integer.valueOf(!r02.isChecked() ? 1 : 0)));
        manageConversationLabelSetting.m73578UM(arrayList, new ArrayList());
    }

    /* renamed from: OM */
    public static final void m73573OM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        ArrayList arrayList = new ArrayList();
        Switch r02 = manageConversationLabelSetting.f67561X0;
        if (r02 == null) {
            AbstractC19074t.m100223u("useFiltersSwitch");
            r02 = null;
        }
        arrayList.add(C1483e.m7482a(45, Integer.valueOf(!r02.isChecked() ? 1 : 0)));
        manageConversationLabelSetting.m73578UM(arrayList, new ArrayList());
    }

    /* renamed from: PM */
    public static final void m73574PM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        CheckBox checkBox = manageConversationLabelSetting.f67562Y0;
        if (checkBox == null) {
            AbstractC19074t.m100223u("showLabelCheckBox");
            checkBox = null;
        }
        manageConversationLabelSetting.m73576RM(!checkBox.isChecked());
    }

    /* renamed from: QM */
    public static final void m73575QM(ManageConversationLabelSetting manageConversationLabelSetting, View view) {
        AbstractC19074t.m100208f(manageConversationLabelSetting, "this$0");
        C17487o0 m92662fJ = manageConversationLabelSetting.m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.mo89694j2(BottomSheetUnSupportEditChatTag.class, new Bundle(), 0, null, 2, true);
    }

    /* renamed from: RM */
    private final void m73576RM(boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1483e.m7482a(46, Integer.valueOf(z11 ? 1 : 0)));
        m73578UM(arrayList, new ArrayList());
    }

    /* renamed from: SM */
    public final void m73577SM(boolean z11) {
        int i11;
        try {
            Intent intent = new Intent();
            BaseZaloView baseZaloView = this.f72421L0;
            if (z11) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            baseZaloView.mo50035CK(i11, intent);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UM */
    private final void m73578UM(List list, List list2) {
        try {
            if (list.isEmpty() || this.f67563Z0) {
                return;
            }
            this.f67563Z0 = true;
            this.f67564a1.mo1704o8(new C13113b(list, this));
            this.f67564a1.mo1676k9(list, list2);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f67563Z0 = false;
        }
    }

    /* renamed from: VM */
    private final void m73579VM() {
        C30104wb c30104wb = this.f67557T0;
        Switch r12 = null;
        if (c30104wb == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30104wb = null;
        }
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99180d().m104197d()) {
            c30104wb.f139830y.setVisibility(0);
            c30104wb.f139827v.setVisibility(8);
            Switch r32 = this.f67561X0;
            if (r32 == null) {
                AbstractC19074t.m100223u("useFiltersSwitch");
                r32 = null;
            }
            r32.m90686i(c18932a.m99184h(), false);
            CheckBox checkBox = this.f67562Y0;
            if (checkBox == null) {
                AbstractC19074t.m100223u("showLabelCheckBox");
                checkBox = null;
            }
            checkBox.m90551f(c18932a.m99186j(), false);
            Switch r33 = this.f67560W0;
            if (r33 == null) {
                AbstractC19074t.m100223u("separateSwitch");
            } else {
                r12 = r33;
            }
            r12.m90686i(c18932a.m99182f(), false);
            c30104wb.f139828w.setEnabled(c18932a.m99184h());
        } else {
            Switch r34 = this.f67559V0;
            if (r34 == null) {
                AbstractC19074t.m100223u("separateV1Switch");
            } else {
                r12 = r34;
            }
            r12.m90686i(c18932a.m99182f(), false);
            c30104wb.f139830y.setVisibility(8);
            c30104wb.f139827v.setVisibility(0);
        }
        m73580WM();
    }

    /* renamed from: WM */
    private final void m73580WM() {
        int i11;
        int i12;
        int i13;
        int i14;
        C18932a c18932a = C18932a.f94442a;
        int i15 = 8;
        if (c18932a.m99183g()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        if (c18932a.m99186j()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        if (c18932a.m99184h()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        if (c18932a.m99182f()) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        if (c18932a.m99184h() && !c18932a.m99182f()) {
            i15 = 0;
        }
        C30104wb c30104wb = this.f67557T0;
        if (c30104wb == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30104wb = null;
        }
        c30104wb.f139813B.setVisibility(i11);
        c30104wb.f139820I.setVisibility(i15);
        c30104wb.f139814C.setVisibility(i14);
        c30104wb.f139822q.setVisibility(i13);
        c30104wb.f139818G.setVisibility(i12);
        c30104wb.f139819H.setVisibility(i12);
    }

    /* renamed from: XM */
    private final void m73581XM() {
        C30104wb c30104wb = this.f67557T0;
        if (c30104wb == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30104wb = null;
        }
        if (C23212s8.m119603k()) {
            c30104wb.f139831z.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_blue_action_bar_corner_top_8_light));
        } else {
            c30104wb.f139831z.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_blue_action_bar_corner_top_8_dark));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String m118749t0 = AbstractC23136l9.m118749t0(getContext(), AbstractC8020f0.str_setting_manage_conversation_label);
            AbstractC19074t.m100207e(m118749t0, "getString(...)");
            m87077NK.setMiddleTitle(m118749t0);
        }
    }

    /* renamed from: TM */
    public final void m73585TM(boolean z11) {
        this.f67563Z0 = z11;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        mo73526uM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageConversationLabelSetting";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 2020;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        C22229g7[] c22229g7Arr = new C22229g7[1];
        C30104wb c30104wb = this.f67557T0;
        if (c30104wb == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30104wb = null;
        }
        ListItem listItem = c30104wb.f139828w;
        AbstractC19074t.m100207e(listItem, "itemShowLabels");
        c22229g7Arr[0] = new C22229g7(listItem, 2021);
        return c22229g7Arr;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        C30104wb c30104wb = this.f67557T0;
        CheckBox checkBox = null;
        if (c30104wb == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30104wb = null;
        }
        if (getContext() != null) {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            Switch r22 = new Switch(context);
            this.f67559V0 = r22;
            r22.setOnClickListener(new View.OnClickListener() { // from class: la0.v
                public /* synthetic */ ViewOnClickListenerC22348v() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageConversationLabelSetting.m73567IM(C30104wb.this, view);
                }
            });
            ListItem listItem = c30104wb.f139827v;
            Switch r42 = this.f67559V0;
            if (r42 == null) {
                AbstractC19074t.m100223u("separateV1Switch");
                r42 = null;
            }
            listItem.m90589e(r42);
            c30104wb.f139827v.setSubtitleMaxLine(2);
            Context context2 = getContext();
            AbstractC19074t.m100205c(context2);
            Switch r23 = new Switch(context2);
            this.f67560W0 = r23;
            r23.setOnClickListener(new View.OnClickListener() { // from class: la0.w
                public /* synthetic */ ViewOnClickListenerC22356w() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageConversationLabelSetting.m73568JM(C30104wb.this, view);
                }
            });
            ListItem listItem2 = c30104wb.f139826u;
            Switch r43 = this.f67560W0;
            if (r43 == null) {
                AbstractC19074t.m100223u("separateSwitch");
                r43 = null;
            }
            listItem2.m90589e(r43);
            c30104wb.f139826u.setSubtitleMaxLine(2);
            Context context3 = getContext();
            AbstractC19074t.m100205c(context3);
            Switch r24 = new Switch(context3);
            this.f67561X0 = r24;
            r24.setOnClickListener(new View.OnClickListener() { // from class: la0.x
                public /* synthetic */ ViewOnClickListenerC22364x() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageConversationLabelSetting.m73569KM(C30104wb.this, view);
                }
            });
            ListItem listItem3 = c30104wb.f139829x;
            Switch r44 = this.f67561X0;
            if (r44 == null) {
                AbstractC19074t.m100223u("useFiltersSwitch");
                r44 = null;
            }
            listItem3.m90589e(r44);
            Context context4 = getContext();
            AbstractC19074t.m100205c(context4);
            CheckBox checkBox2 = new CheckBox(context4);
            this.f67562Y0 = checkBox2;
            checkBox2.setOnClickListener(new View.OnClickListener() { // from class: la0.y
                public /* synthetic */ ViewOnClickListenerC22372y() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageConversationLabelSetting.m73570LM(ManageConversationLabelSetting.this, view);
                }
            });
            ListItem listItem4 = c30104wb.f139828w;
            CheckBox checkBox3 = this.f67562Y0;
            if (checkBox3 == null) {
                AbstractC19074t.m100223u("showLabelCheckBox");
            } else {
                checkBox = checkBox3;
            }
            listItem4.m90589e(checkBox);
            c30104wb.f139825t.setTitleColor(C23212s8.m119606n(AbstractC28291a.list_item_title_disable));
        }
        c30104wb.f139827v.setOnClickListener(new View.OnClickListener() { // from class: la0.z
            public /* synthetic */ ViewOnClickListenerC22380z() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageConversationLabelSetting.m73571MM(ManageConversationLabelSetting.this, view);
            }
        });
        c30104wb.f139826u.setOnClickListener(new View.OnClickListener() { // from class: la0.a0
            public /* synthetic */ ViewOnClickListenerC22168a0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageConversationLabelSetting.m73572NM(ManageConversationLabelSetting.this, view);
            }
        });
        c30104wb.f139829x.setSubtitleMaxLine(2);
        c30104wb.f139829x.setTrailingGravity(EnumC16952b0.CENTER);
        c30104wb.f139829x.setOnClickListener(new View.OnClickListener() { // from class: la0.b0
            public /* synthetic */ ViewOnClickListenerC22177b0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageConversationLabelSetting.m73573OM(ManageConversationLabelSetting.this, view);
            }
        });
        c30104wb.f139828w.setOnClickListener(new View.OnClickListener() { // from class: la0.c0
            public /* synthetic */ ViewOnClickListenerC22186c0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageConversationLabelSetting.m73574PM(ManageConversationLabelSetting.this, view);
            }
        });
        c30104wb.f139825t.setOnClickListener(new View.OnClickListener() { // from class: la0.d0
            public /* synthetic */ ViewOnClickListenerC22195d0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageConversationLabelSetting.m73575QM(ManageConversationLabelSetting.this, view);
            }
        });
        c30104wb.f139812A.setClipToOutline(true);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30104wb m148662b = C30104wb.m148662b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148662b, "inflate(...)");
        this.f67557T0 = m148662b;
        if (m148662b == null) {
            AbstractC19074t.m100223u("viewBinding");
            m148662b = null;
        }
        View root = m148662b.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        m73579VM();
        m73581XM();
    }
}
