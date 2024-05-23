package com.zing.zalo.p077ui.bottomsheet;

import ac.C0708i;
import ae.C0766k;
import ag0.AbstractC0852x;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bp0.C3080a0;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.bottomsheet.SettingViewBottomSheet;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ChooseMultiFriendsView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hf0.C20048j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kz.AbstractC21970a;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23046d7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23269y3;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nb0.C23673d;
import o70.C24099q0;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p398oo.C24380u;
import p458qr.C25487t;
import p509sp.C26354c;
import p542ub.InterfaceC27218a;
import p649xl.C29732bc;
import p649xl.C29775e1;
import p649xl.C29954o0;
import p716zh.C31849b1;
import pm0.C24848g0;
import pm0.C24860q;
import sd.C26231b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class SettingViewBottomSheet extends BottomSheet implements C23744a.c {

    /* renamed from: e1 */
    public C29732bc f56234e1;

    /* renamed from: f1 */
    private C29954o0 f56235f1;

    /* renamed from: g1 */
    private C29775e1 f56236g1;

    /* renamed from: h1 */
    private JSONArray f56237h1;

    /* renamed from: i1 */
    private int f56238i1;

    /* renamed from: l1 */
    private volatile boolean f56241l1;

    /* renamed from: o1 */
    private long f56244o1;

    /* renamed from: p1 */
    private boolean f56245p1;

    /* renamed from: q1 */
    private boolean f56246q1;

    /* renamed from: b1 */
    private final int f56231b1 = 1;

    /* renamed from: c1 */
    private final int f56232c1 = 2;

    /* renamed from: d1 */
    private final int f56233d1 = 3;

    /* renamed from: j1 */
    private boolean f56239j1 = true;

    /* renamed from: k1 */
    private boolean f56240k1 = true;

    /* renamed from: m1 */
    private final SensitiveData f56242m1 = new SensitiveData("phonebook_sync_scan_manual_in_setting", "phonebook_sync", null, 4, null);

    /* renamed from: n1 */
    private String f56243n1 = "";

    /* renamed from: r1 */
    private Integer[] f56247r1 = {Integer.valueOf(AbstractC16803z.ic_type_header_none_dark_mode_off_english_on), Integer.valueOf(AbstractC16803z.ic_type_header_none_dark_mode_off_english_on), Integer.valueOf(AbstractC16803z.ic_type_header_none_dark_mode_on_english_on), Integer.valueOf(AbstractC16803z.ic_type_header_none_dark_mode_on_english_on), Integer.valueOf(AbstractC16803z.ic_type_header_dark_mode_off_english_off), Integer.valueOf(AbstractC16803z.ic_type_header_dark_mode_off_english_on), Integer.valueOf(AbstractC16803z.ic_type_header_dark_mode_on_english_off), Integer.valueOf(AbstractC16803z.ic_type_header_dark_mode_on_english_on)};

    /* renamed from: s1 */
    private Integer[] f56248s1 = {Integer.valueOf(AbstractC16803z.ic_type_read_receipt_dark_mode_off_english_off), Integer.valueOf(AbstractC16803z.ic_type_read_receipt_dark_mode_off_english_on), Integer.valueOf(AbstractC16803z.ic_type_read_receipt_dark_mode_on_english_off), Integer.valueOf(AbstractC16803z.ic_type_read_receipt_dark_mode_on_english_on), Integer.valueOf(AbstractC16803z.ic_type_seen_receipt_dark_mode_off_english_off), Integer.valueOf(AbstractC16803z.ic_type_seen_receipt_dark_mode_off_english_on), Integer.valueOf(AbstractC16803z.ic_type_seen_receipt_dark_mode_on_english_off), Integer.valueOf(AbstractC16803z.ic_type_seen_receipt_dark_mode_on_english_on)};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.bottomsheet.SettingViewBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11180a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ List f56249q;

        /* renamed from: r */
        final /* synthetic */ SettingViewBottomSheet f56250r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11180a(List list, SettingViewBottomSheet settingViewBottomSheet) {
            super(1);
            this.f56249q = list;
            this.f56250r = settingViewBottomSheet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m58610c(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        /* renamed from: b */
        public final void m58611b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            try {
                try {
                    for (C24860q c24860q : this.f56249q) {
                        AbstractC23148n.m118848v(((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue());
                    }
                    if (this.f56250r.m58606eM() == 27) {
                        C21927m.m114302u().m114336h0();
                        AbstractC23309i.m121282Or(0L);
                    }
                    final SettingViewBottomSheet settingViewBottomSheet = this.f56250r;
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.bottomsheet.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingViewBottomSheet.C11180a.m58610c(SettingViewBottomSheet.this);
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("BottomSheetSettingView", e11);
                }
                this.f56250r.f56241l1 = false;
                this.f56250r.m91396q3();
            } catch (Throwable th2) {
                this.f56250r.f56241l1 = false;
                this.f56250r.m91396q3();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58611b((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.bottomsheet.SettingViewBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11181b extends AbstractC19075u implements InterfaceC18509p {
        C11181b() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m58613c(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        /* renamed from: b */
        public final void m58614b(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            try {
                try {
                    if (i11 == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    final SettingViewBottomSheet settingViewBottomSheet = SettingViewBottomSheet.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.bottomsheet.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingViewBottomSheet.C11181b.m58613c(SettingViewBottomSheet.this);
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("BottomSheetSettingView", e11);
                }
                SettingViewBottomSheet.this.f56241l1 = false;
                SettingViewBottomSheet.this.m91396q3();
            } catch (Throwable th2) {
                SettingViewBottomSheet.this.f56241l1 = false;
                SettingViewBottomSheet.this.m91396q3();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m58614b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.SettingViewBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C11182c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f56253b;

        C11182c(int i11) {
            this.f56253b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m58617e(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m58618f(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    final SettingViewBottomSheet settingViewBottomSheet = SettingViewBottomSheet.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: e50.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingViewBottomSheet.C11182c.m58618f(SettingViewBottomSheet.this);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingViewBottomSheet.this.m58600BM(false);
                SettingViewBottomSheet.this.m91396q3();
            } catch (Throwable th2) {
                SettingViewBottomSheet.this.m58600BM(false);
                SettingViewBottomSheet.this.m91396q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    AbstractC23148n.m118848v(SettingViewBottomSheet.this.m58606eM(), this.f56253b);
                    if (SettingViewBottomSheet.this.m58606eM() == 27) {
                        C21927m.m114302u().m114336h0();
                        AbstractC23309i.m121282Or(0L);
                    }
                    final SettingViewBottomSheet settingViewBottomSheet = SettingViewBottomSheet.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: e50.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingViewBottomSheet.C11182c.m58617e(SettingViewBottomSheet.this);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingViewBottomSheet.this.m58600BM(false);
                SettingViewBottomSheet.this.m91396q3();
            } catch (Throwable th2) {
                SettingViewBottomSheet.this.m58600BM(false);
                SettingViewBottomSheet.this.m91396q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.SettingViewBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C11183d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f56254a;

        /* renamed from: b */
        final /* synthetic */ int f56255b;

        /* renamed from: c */
        final /* synthetic */ SettingViewBottomSheet f56256c;

        C11183d(int i11, int i12, SettingViewBottomSheet settingViewBottomSheet) {
            this.f56254a = i11;
            this.f56255b = i12;
            this.f56256c = settingViewBottomSheet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m58623g(String[] strArr, int i11) {
            AbstractC19074t.m100208f(strArr, "$arrayCode");
            try {
                String str = strArr[i11];
                AbstractC19074t.m100207e(str, "get(...)");
                C23269y3.m120035a(str);
                AbstractC21970a.m114741j(0L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m58624h(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            BaseZaloActivity baseZaloActivity = (BaseZaloActivity) settingViewBottomSheet.m92648SI();
            AbstractC19074t.m100205c(baseZaloActivity);
            baseZaloActivity.recreate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m58625i(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58626j(SettingViewBottomSheet settingViewBottomSheet) {
            AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
            settingViewBottomSheet.m58596vM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (c20096c != null) {
                    try {
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                        final SettingViewBottomSheet settingViewBottomSheet = this.f56256c;
                        settingViewBottomSheet.mo70710wy(new Runnable() { // from class: e50.n0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingViewBottomSheet.C11183d.m58626j(SettingViewBottomSheet.this);
                            }
                        });
                        this.f56256c.f56246q1 = false;
                        this.f56256c.m91396q3();
                    }
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                final SettingViewBottomSheet settingViewBottomSheet2 = this.f56256c;
                settingViewBottomSheet2.mo70710wy(new Runnable() { // from class: e50.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingViewBottomSheet.C11183d.m58626j(SettingViewBottomSheet.this);
                    }
                });
                this.f56256c.f56246q1 = false;
                this.f56256c.m91396q3();
            } catch (Throwable th2) {
                this.f56256c.f56246q1 = false;
                this.f56256c.m91396q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    int i11 = this.f56254a;
                    AbstractC23148n.m118851y(i11, this.f56255b, i11);
                    int i12 = this.f56254a;
                    if (i12 == 11) {
                        final String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
                        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
                        final int i13 = this.f56255b;
                        AbstractC19444a.m101697e(new Runnable() { // from class: e50.k0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingViewBottomSheet.C11183d.m58623g(m118755v0, i13);
                            }
                        });
                        C23269y3.m120040i(this.f56256c.m92648SI());
                        AbstractC20826v0.m108770L0(true);
                        C25487t.f122084a.m132028c(C25487t.a.f122098v);
                        AbstractC0924m0.m2943Bm(true);
                        final SettingViewBottomSheet settingViewBottomSheet = this.f56256c;
                        AbstractC19444a.m101697e(new Runnable() { // from class: e50.l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingViewBottomSheet.C11183d.m58624h(SettingViewBottomSheet.this);
                            }
                        });
                    } else if (i12 == 47) {
                        this.f56256c.m58581hM(this.f56255b);
                    } else if (i12 == 17) {
                        C23744a.Companion.m124119a().m124116d(5118, new Object[0]);
                    }
                    final SettingViewBottomSheet settingViewBottomSheet2 = this.f56256c;
                    settingViewBottomSheet2.mo70710wy(new Runnable() { // from class: e50.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingViewBottomSheet.C11183d.m58625i(SettingViewBottomSheet.this);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f56256c.f56246q1 = false;
                this.f56256c.m91396q3();
            } catch (Throwable th2) {
                this.f56256c.f56246q1 = false;
                this.f56256c.m91396q3();
                throw th2;
            }
        }
    }

    /* renamed from: AM */
    private final void m58550AM(boolean z11) {
        int i11;
        ZAppCompatImageView zAppCompatImageView;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (C23212s8.m119602i()) {
            i11 += 2;
        }
        if (!AbstractC23059e9.m118342u()) {
            i11++;
        }
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (zAppCompatImageView = c29775e1.f137630r) != null) {
            zAppCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(zAppCompatImageView.getContext(), this.f56247r1[i11].intValue()));
        }
    }

    /* renamed from: CM */
    private final void m58551CM(String str, String str2) {
        View m92656bJ = m92656bJ();
        if (m92656bJ != null) {
            final Snackbar m90669d = Snackbar.Companion.m90669d(m92656bJ, str, 0);
            m90669d.m90638D(m58580gM());
            C0708i m58579fM = m58579fM();
            if (m58579fM != null) {
                m90669d.m90637C(m58579fM);
            }
            m90669d.m90636A(str2, new View.OnClickListener() { // from class: e50.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingViewBottomSheet.m58552DM(Snackbar.this, this, view);
                }
            });
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m90669d.m90645K(C27276c.m139648a(m92689tK, 12.0f));
            m90669d.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m58552DM(Snackbar snackbar, SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(snackbar, "$snackBar");
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        snackbar.m90655n();
        settingViewBottomSheet.m58595uM();
    }

    /* renamed from: EM */
    private final void m58553EM() {
        ListItemSetting listItemSetting;
        C0708i c0708i = new C0708i();
        Bundle m92642L3 = m92642L3();
        int i11 = 0;
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("EXTRA_SOURCE_FROM", 0);
        }
        c0708i.m1072c("src", i11);
        c0708i.m1072c("value", !C24380u.f117739a.mo127507a() ? 1 : 0);
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (listItemSetting = c29775e1.f137631s) != null) {
            listItemSetting.setTrackingExtraData(c0708i);
            Switch r12 = listItemSetting.getSwitch();
            if (r12 != null) {
                r12.setTrackingExtraData(c0708i);
            }
        }
    }

    /* renamed from: FM */
    private final void m58554FM(int i11) {
        ListItemSetting listItemSetting;
        ListItemSetting listItemSetting2;
        boolean z11;
        ListItemSetting listItemSetting3;
        boolean z12;
        C29954o0 c29954o0 = this.f56235f1;
        boolean z13 = false;
        if (c29954o0 != null && (listItemSetting3 = c29954o0.f138842q) != null) {
            if (i11 == this.f56231b1) {
                z12 = true;
            } else {
                z12 = false;
            }
            listItemSetting3.setTick(z12);
        }
        C29954o0 c29954o02 = this.f56235f1;
        if (c29954o02 != null && (listItemSetting2 = c29954o02.f138843r) != null) {
            if (i11 == this.f56232c1) {
                z11 = true;
            } else {
                z11 = false;
            }
            listItemSetting2.setTick(z11);
        }
        C29954o0 c29954o03 = this.f56235f1;
        if (c29954o03 != null && (listItemSetting = c29954o03.f138844s) != null) {
            if (i11 == this.f56233d1) {
                z13 = true;
            }
            listItemSetting.setTick(z13);
        }
    }

    /* renamed from: GM */
    private final void m58555GM() {
        ListItemSetting listItemSetting;
        m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f56243n1 = m118743r0;
        C29954o0 c29954o0 = this.f56235f1;
        if (c29954o0 != null) {
            listItemSetting = c29954o0.f138843r;
        } else {
            listItemSetting = null;
        }
        if (listItemSetting != null) {
            listItemSetting.setSubtitle(m118743r0);
        }
        if (System.currentTimeMillis() - this.f56244o1 > 3600000) {
            AbstractC23309i.m122105kr(0L);
            this.f56244o1 = System.currentTimeMillis();
        }
        AbstractC0852x.m2340Q(this.f56242m1);
        AbstractC23309i.m121139Kw(8);
        AbstractC23057e7.m118305l(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m58558JM(SettingViewBottomSheet settingViewBottomSheet) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58596vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:            com.zing.zalo.utils.ToastUtils.showMess(me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.txtUpdateSuccessful));     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:            return;     */
    /* renamed from: LM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m58561LM(boolean z11, SettingViewBottomSheet settingViewBottomSheet, String str, int i11) {
        String m119185C;
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        try {
            if (AbstractC23309i.m122353rd() == 0) {
                if (!AbstractC0852x.m2364u() && !AbstractC0852x.m2365v()) {
                    if (AbstractC23309i.m121261O6() == 0) {
                        m119185C = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdatePhoneBookStateNone);
                    } else {
                        m119185C = AbstractC23160o0.m119185C(AbstractC23309i.m121261O6());
                    }
                }
                m119185C = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            } else {
                m119185C = AbstractC23160o0.m119185C(AbstractC23309i.m122353rd());
            }
            AbstractC19074t.m100205c(m119185C);
            if (z11) {
                settingViewBottomSheet.m91393c4();
            }
            ListItemSetting listItemSetting = null;
            if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
                C29954o0 c29954o0 = settingViewBottomSheet.f56235f1;
                if (c29954o0 != null) {
                    listItemSetting = c29954o0.f138843r;
                }
                if (listItemSetting != null) {
                    listItemSetting.setSubtitle(m119185C);
                }
                if (z11 && settingViewBottomSheet.m92672lJ()) {
                    if (str != null && str.length() != 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        C29954o0 c29954o02 = settingViewBottomSheet.f56235f1;
                        if (c29954o02 != null && (robotoTextView = c29954o02.f138845t) != null) {
                            robotoTextView.setText(AbstractC23059e9.m118338q(jSONObject));
                            robotoTextView.setBackground(C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.bg_rounded_corner_error_text));
                            robotoTextView.setPadding(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(8.0f));
                            robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.error_text));
                            robotoTextView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (i11 == 50001) {
                        ToastUtils.m89262j();
                        return;
                    }
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_submit_contact_success_msg);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    ToastUtils.showMess(format);
                    return;
                }
                return;
            }
            C29954o0 c29954o03 = settingViewBottomSheet.f56235f1;
            if (c29954o03 != null) {
                listItemSetting = c29954o03.f138843r;
            }
            if (listItemSetting != null) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_book_status_unknown_exception);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                listItemSetting.setSubtitle(m118743r02);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    private final void m58563MM(boolean z11) {
        ListItemSetting listItemSetting;
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (listItemSetting = c29775e1.f137631s) != null) {
            listItemSetting.setSwitch(z11);
        }
    }

    /* renamed from: aM */
    private final void m58577aM(boolean z11) {
        int i11 = this.f56238i1;
        if (i11 != 11 && i11 != 27) {
            if (i11 == 47) {
                m58607o3(i11, z11 ? 1 : 0);
                return;
            }
            return;
        }
        m58601HM(z11 ? 1 : 0);
    }

    /* renamed from: bM */
    private final void m58578bM(int i11) {
        m58554FM(i11);
        int i12 = 1;
        if (this.f56239j1) {
            int i13 = this.f56238i1;
            if (i13 != 1) {
                if (i13 != 7) {
                    if (i13 == 25) {
                        if (i11 == this.f56231b1) {
                            m58601HM(2);
                            return;
                        } else if (i11 == this.f56232c1) {
                            m58601HM(4);
                            return;
                        } else {
                            if (i11 == this.f56233d1) {
                                m58601HM(3);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i11 == this.f56231b1 && C26231b.m134867m() && AbstractC0924m0.m4395z5() != 2) {
                    ArrayList arrayList = new ArrayList();
                    int i14 = i11 - 1;
                    arrayList.add(new C24860q(Integer.valueOf(this.f56238i1), Integer.valueOf(i14)));
                    arrayList.add(new C24860q(31, Integer.valueOf(i14)));
                    m58585lI(arrayList);
                    return;
                }
                m58601HM(i11 - 1);
                return;
            }
            if (i11 == this.f56231b1) {
                m58601HM(2);
                return;
            } else {
                if (i11 == this.f56232c1) {
                    m58601HM(1);
                    return;
                }
                return;
            }
        }
        int i15 = this.f56238i1;
        if (i15 != 14) {
            if (i15 != 17) {
                if (i15 != 40) {
                    if (i15 != 41) {
                        switch (i15) {
                            case 10:
                                if (i11 == this.f56231b1) {
                                    i12 = 0;
                                }
                                m58607o3(i15, i12);
                                return;
                            case 11:
                                if (i11 == this.f56231b1) {
                                    i12 = 0;
                                }
                                m58607o3(i15, i12);
                                return;
                            case 12:
                                if (i11 == this.f56231b1) {
                                    i12 = 0;
                                }
                                m58607o3(i15, i12);
                                return;
                            default:
                                return;
                        }
                    }
                    if (i11 == this.f56231b1) {
                        m58607o3(i15, 1);
                        return;
                    } else if (i11 == this.f56232c1) {
                        m58607o3(i15, 2);
                        return;
                    } else {
                        if (i11 == this.f56233d1) {
                            m58607o3(i15, 0);
                            return;
                        }
                        return;
                    }
                }
                if (i11 == this.f56231b1) {
                    m58607o3(i15, 0);
                    return;
                } else {
                    if (i11 == this.f56232c1) {
                        m58607o3(i15, 1);
                        return;
                    }
                    return;
                }
            }
            if (i11 == this.f56231b1) {
                m58607o3(i15, 1);
                return;
            } else if (i11 == this.f56232c1) {
                m58607o3(i15, 2);
                return;
            } else {
                if (i11 == this.f56233d1) {
                    m58607o3(i15, 0);
                    return;
                }
                return;
            }
        }
        JSONArray jSONArray = this.f56237h1;
        ArrayList arrayList2 = null;
        if (jSONArray != null && jSONArray.length() > 0) {
            arrayList2 = new ArrayList();
            int length = jSONArray.length();
            for (int i16 = 0; i16 < length; i16++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i16);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("userId");
                    if (!TextUtils.isEmpty(optString)) {
                        AbstractC19074t.m100205c(optString);
                        arrayList2.add(optString);
                    }
                }
            }
        }
        if (i11 == this.f56231b1) {
            m58602IM(this.f56238i1, 1, arrayList2);
            return;
        }
        if (i11 == this.f56232c1) {
            m58602IM(this.f56238i1, 0, arrayList2);
            return;
        }
        if (i11 == this.f56233d1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromSettingNotiFeed", true);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                bundle.putStringArrayList("fromSettingNotiFeedArrUid", new ArrayList<>(arrayList2));
            }
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35581q(ChooseMultiFriendsView.class, bundle, 1234, 1, true);
            }
        }
    }

    /* renamed from: fM */
    private final C0708i m58579fM() {
        if (this.f56238i1 == 47) {
            C0708i c0708i = new C0708i();
            Bundle m92642L3 = m92642L3();
            int i11 = 0;
            if (m92642L3 != null) {
                i11 = m92642L3.getInt("EXTRA_SOURCE_FROM", 0);
            }
            c0708i.m1072c("src", i11);
            return c0708i;
        }
        return null;
    }

    /* renamed from: gM */
    private final String m58580gM() {
        return this.f56238i1 == 47 ? "setting_filter_timeline_snack_bar" : "no_tracking";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final void m58581hM(int i11) {
        int m3129I5 = AbstractC0924m0.m3129I5();
        if (i11 == 1 && m3129I5 < 1) {
            final String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_filter_turned_on);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            final String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_go_to_timeline);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            mo70710wy(new Runnable() { // from class: e50.x
                @Override // java.lang.Runnable
                public final void run() {
                    SettingViewBottomSheet.m58582iM(SettingViewBottomSheet.this, m118743r0, m118743r02);
                }
            });
            AbstractC0924m0.m3700bo(m3129I5 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m58582iM(SettingViewBottomSheet settingViewBottomSheet, String str, String str2) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(str, "$descriptionText");
        AbstractC19074t.m100208f(str2, "$actionText");
        settingViewBottomSheet.m58551CM(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x03be, code lost:            if (r1 != 27) goto L412;     */
    /* renamed from: jM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m58583jM() {
        ListItemSetting listItemSetting;
        ListItemSetting listItemSetting2;
        ListItemSetting listItemSetting3;
        ListItemSetting listItemSetting4;
        ListItemSetting listItemSetting5;
        ListItemSetting listItemSetting6;
        ListItemSetting listItemSetting7;
        ListItemSetting listItemSetting8;
        ListItemSetting listItemSetting9;
        int i11;
        RobotoTextView robotoTextView;
        ListItemSetting listItemSetting10;
        ListItemSetting listItemSetting11;
        ListItemSetting listItemSetting12;
        RobotoTextView robotoTextView2;
        RobotoTextView robotoTextView3;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Drawable drawable;
        ListItemSetting listItemSetting13;
        Drawable drawable2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        ListItemSetting listItemSetting14;
        ListItemSetting listItemSetting15;
        ListItemSetting listItemSetting16;
        ListItemSetting listItemSetting17;
        RobotoTextView robotoTextView4;
        ListItemSetting listItemSetting18;
        ListItemSetting listItemSetting19;
        ListItemSetting listItemSetting20;
        ListItemSetting listItemSetting21;
        ListItemSetting listItemSetting22;
        ListItemSetting listItemSetting23;
        ListItemSetting listItemSetting24;
        ListItemSetting listItemSetting25;
        ListItemSetting listItemSetting26;
        ListItemSetting listItemSetting27;
        ListItemSetting listItemSetting28;
        ListItemSetting listItemSetting29;
        ListItemSetting listItemSetting30;
        ListItemSetting listItemSetting31;
        ListItemSetting listItemSetting32;
        ListItemSetting listItemSetting33;
        ListItemSetting listItemSetting34;
        ListItemSetting listItemSetting35;
        RobotoTextView robotoTextView5;
        ListItemSetting listItemSetting36;
        ListItemSetting listItemSetting37;
        ListItemSetting listItemSetting38;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        RobotoTextView robotoTextView6;
        RobotoTextView robotoTextView7;
        LinearLayout linearLayout7;
        ListItemSetting listItemSetting39;
        ListItemSetting listItemSetting40;
        ListItemSetting listItemSetting41;
        List<String> m127132B0;
        ListItemSetting listItemSetting42;
        LinearLayout linearLayout8;
        LinearLayout linearLayout9;
        ListItemSetting listItemSetting43;
        int i12 = 8;
        if (this.f56239j1) {
            int i13 = this.f56238i1;
            if (i13 != 1) {
                if (i13 != 7) {
                    if (i13 != 11) {
                        if (i13 != 25) {
                            if (i13 == 27) {
                                this.f56236g1 = C29775e1.m147880c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                                m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_online_status));
                                C29775e1 c29775e1 = this.f56236g1;
                                if (c29775e1 != null) {
                                    linearLayout8 = c29775e1.f137632t;
                                } else {
                                    linearLayout8 = null;
                                }
                                if (linearLayout8 != null) {
                                    linearLayout8.setClipToOutline(true);
                                }
                                C29775e1 c29775e12 = this.f56236g1;
                                if (c29775e12 != null) {
                                    linearLayout9 = c29775e12.f137633u;
                                } else {
                                    linearLayout9 = null;
                                }
                                if (linearLayout9 != null) {
                                    linearLayout9.setClipToOutline(true);
                                }
                                C29775e1 c29775e13 = this.f56236g1;
                                if (c29775e13 != null && (listItemSetting43 = c29775e13.f137631s) != null) {
                                    listItemSetting43.setIdTracking("recently_online_status_click");
                                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_online_status);
                                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                    listItemSetting43.setTitle(m118743r0);
                                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_sub_online_status);
                                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                    listItemSetting43.setSubtitle(m118743r02);
                                    listItemSetting43.m90592m(false);
                                }
                            }
                        } else {
                            this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                            m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title_allow_call));
                            C29954o0 c29954o0 = this.f56235f1;
                            if (c29954o0 != null && (listItemSetting42 = c29954o0.f138842q) != null) {
                                listItemSetting42.setIdTracking("accept_stranger_call_click");
                                C0708i c0708i = new C0708i();
                                c0708i.m1072c("status", 0);
                                listItemSetting42.setTrackingExtraData(c0708i);
                                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_friend);
                                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                                listItemSetting42.setTitle(m118743r03);
                                ListItemSetting.m74603F(listItemSetting42, AbstractC23322a.zds_ic_members_line_24, null, 0, 6, null);
                            }
                            C29954o0 c29954o02 = this.f56235f1;
                            if (c29954o02 != null && (listItemSetting41 = c29954o02.f138843r) != null) {
                                listItemSetting41.setIdTracking("accept_stranger_call_click");
                                C0708i c0708i2 = new C0708i();
                                c0708i2.m1072c("status", 1);
                                listItemSetting41.setTrackingExtraData(c0708i2);
                                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_friend_and_stranger);
                                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                                listItemSetting41.setTitle(m118743r04);
                                ListItemSetting.m74603F(listItemSetting41, AbstractC23322a.zds_ic_stranger_line_24, EnumC16952b0.TOP, 0, 4, null);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_sub_value_call);
                                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                                m127132B0 = AbstractC24342w.m127132B0(m118743r05, new String[]{"|"}, false, 0, 6, null);
                                for (String str : m127132B0) {
                                    C23673d c23673d = new C23673d(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(2.0f));
                                    int length = spannableStringBuilder.length();
                                    spannableStringBuilder.append((CharSequence) str);
                                    spannableStringBuilder.setSpan(c23673d, length, spannableStringBuilder.length(), 17);
                                }
                                listItemSetting41.setSubtitle(spannableStringBuilder);
                            }
                            C29954o0 c29954o03 = this.f56235f1;
                            if (c29954o03 != null && (listItemSetting40 = c29954o03.f138844s) != null) {
                                listItemSetting40.setIdTracking("accept_stranger_call_click");
                                C0708i c0708i3 = new C0708i();
                                c0708i3.m1072c("status", 2);
                                listItemSetting40.setTrackingExtraData(c0708i3);
                                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_all);
                                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                                listItemSetting40.setTitle(m118743r06);
                                ListItemSetting.m74603F(listItemSetting40, AbstractC23322a.zds_ic_group_line_24, null, 0, 6, null);
                                listItemSetting40.m90592m(false);
                            }
                        }
                    } else {
                        this.f56236g1 = C29775e1.m147880c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                        m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_seen_status));
                        C29775e1 c29775e14 = this.f56236g1;
                        if (c29775e14 != null) {
                            linearLayout5 = c29775e14.f137632t;
                        } else {
                            linearLayout5 = null;
                        }
                        if (linearLayout5 != null) {
                            linearLayout5.setClipToOutline(true);
                        }
                        C29775e1 c29775e15 = this.f56236g1;
                        if (c29775e15 != null) {
                            linearLayout6 = c29775e15.f137633u;
                        } else {
                            linearLayout6 = null;
                        }
                        if (linearLayout6 != null) {
                            linearLayout6.setClipToOutline(true);
                        }
                        C29775e1 c29775e16 = this.f56236g1;
                        if (c29775e16 != null) {
                            robotoTextView6 = c29775e16.f137634v;
                        } else {
                            robotoTextView6 = null;
                        }
                        if (robotoTextView6 != null) {
                            robotoTextView6.setVisibility(8);
                        }
                        C29775e1 c29775e17 = this.f56236g1;
                        if (c29775e17 != null) {
                            robotoTextView7 = c29775e17.f137635w;
                        } else {
                            robotoTextView7 = null;
                        }
                        if (robotoTextView7 != null) {
                            robotoTextView7.setVisibility(8);
                        }
                        C29775e1 c29775e18 = this.f56236g1;
                        if (c29775e18 != null) {
                            linearLayout7 = c29775e18.f137633u;
                        } else {
                            linearLayout7 = null;
                        }
                        if (linearLayout7 != null) {
                            linearLayout7.setVisibility(8);
                        }
                        C29775e1 c29775e19 = this.f56236g1;
                        if (c29775e19 != null && (listItemSetting39 = c29775e19.f137631s) != null) {
                            listItemSetting39.setIdTracking("display_seen_status_click");
                            String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_seen_status);
                            AbstractC19074t.m100207e(m118743r07, "getString(...)");
                            listItemSetting39.setTitle(m118743r07);
                            String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_sub_seen_status);
                            AbstractC19074t.m100207e(m118743r08, "getString(...)");
                            listItemSetting39.setSubtitle(m118743r08);
                            listItemSetting39.m90592m(false);
                        }
                    }
                } else {
                    this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                    m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_birthday));
                    String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_dob_mode);
                    AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
                    C29954o0 c29954o04 = this.f56235f1;
                    if (c29954o04 != null && (listItemSetting38 = c29954o04.f138842q) != null) {
                        listItemSetting38.setIdTracking("view_birthday_click");
                        C0708i c0708i4 = new C0708i();
                        c0708i4.m1072c("status", 3);
                        listItemSetting38.setTrackingExtraData(c0708i4);
                        String str2 = m118755v0[0];
                        AbstractC19074t.m100207e(str2, "get(...)");
                        listItemSetting38.setTitle(str2);
                    }
                    C29954o0 c29954o05 = this.f56235f1;
                    if (c29954o05 != null && (listItemSetting37 = c29954o05.f138843r) != null) {
                        listItemSetting37.setIdTracking("view_birthday_click");
                        C0708i c0708i5 = new C0708i();
                        c0708i5.m1072c("status", 4);
                        listItemSetting37.setTrackingExtraData(c0708i5);
                        String str3 = m118755v0[1];
                        AbstractC19074t.m100207e(str3, "get(...)");
                        listItemSetting37.setTitle(str3);
                    }
                    C29954o0 c29954o06 = this.f56235f1;
                    if (c29954o06 != null && (listItemSetting36 = c29954o06.f138844s) != null) {
                        listItemSetting36.setIdTracking("view_birthday_click");
                        C0708i c0708i6 = new C0708i();
                        c0708i6.m1072c("status", 5);
                        listItemSetting36.setTrackingExtraData(c0708i6);
                        String str4 = m118755v0[2];
                        AbstractC19074t.m100207e(str4, "get(...)");
                        listItemSetting36.setTitle(str4);
                        listItemSetting36.m90592m(false);
                    }
                    C29954o0 c29954o07 = this.f56235f1;
                    if (c29954o07 != null) {
                        robotoTextView5 = c29954o07.f138845t;
                    } else {
                        robotoTextView5 = null;
                    }
                    if (robotoTextView5 != null) {
                        if (this.f56240k1) {
                            i12 = 0;
                        }
                        robotoTextView5.setVisibility(i12);
                    }
                }
            } else {
                this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title_allow_msg));
                C29954o0 c29954o08 = this.f56235f1;
                if (c29954o08 != null && (listItemSetting31 = c29954o08.f138842q) != null) {
                    listItemSetting31.setIdTracking("receive_message_click");
                    C0708i c0708i7 = new C0708i();
                    c0708i7.m1072c("status", 0);
                    listItemSetting31.setTrackingExtraData(c0708i7);
                    String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_friend);
                    AbstractC19074t.m100207e(m118743r09, "getString(...)");
                    listItemSetting31.setTitle(m118743r09);
                    ListItemSetting.m74603F(listItemSetting31, AbstractC23322a.zds_ic_members_line_24, null, 0, 6, null);
                }
                C29954o0 c29954o09 = this.f56235f1;
                if (c29954o09 != null && (listItemSetting30 = c29954o09.f138843r) != null) {
                    listItemSetting30.setIdTracking("receive_message_click");
                    C0708i c0708i8 = new C0708i();
                    c0708i8.m1072c("status", 1);
                    listItemSetting30.setTrackingExtraData(c0708i8);
                    String m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_all);
                    AbstractC19074t.m100207e(m118743r010, "getString(...)");
                    listItemSetting30.setTitle(m118743r010);
                    ListItemSetting.m74603F(listItemSetting30, AbstractC23322a.zds_ic_group_line_24, null, 0, 6, null);
                    listItemSetting30.m90592m(false);
                }
                C29954o0 c29954o010 = this.f56235f1;
                if (c29954o010 != null) {
                    listItemSetting29 = c29954o010.f138844s;
                } else {
                    listItemSetting29 = null;
                }
                if (listItemSetting29 != null) {
                    listItemSetting29.setVisibility(8);
                }
            }
            int i14 = this.f56238i1;
            if (i14 != 1 && i14 != 7) {
                if (i14 != 11) {
                    if (i14 != 25) {
                    }
                }
                C29775e1 c29775e110 = this.f56236g1;
                if (c29775e110 != null && (listItemSetting35 = c29775e110.f137631s) != null) {
                    listItemSetting35.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.c0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            SettingViewBottomSheet.m58588nM(SettingViewBottomSheet.this, compoundButton, z11);
                        }
                    });
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            C29954o0 c29954o011 = this.f56235f1;
            if (c29954o011 != null && (listItemSetting34 = c29954o011.f138842q) != null) {
                listItemSetting34.setOnClickListener(new View.OnClickListener() { // from class: e50.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58584kM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
            C29954o0 c29954o012 = this.f56235f1;
            if (c29954o012 != null && (listItemSetting33 = c29954o012.f138843r) != null) {
                listItemSetting33.setOnClickListener(new View.OnClickListener() { // from class: e50.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58586lM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g03 = C24848g0.f119245a;
            }
            C29954o0 c29954o013 = this.f56235f1;
            if (c29954o013 != null && (listItemSetting32 = c29954o013.f138844s) != null) {
                listItemSetting32.setOnClickListener(new View.OnClickListener() { // from class: e50.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58587mM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g04 = C24848g0.f119245a;
            }
        } else {
            int i15 = this.f56238i1;
            if (i15 != 14) {
                if (i15 != 17) {
                    if (i15 != 47) {
                        if (i15 != 2000) {
                            if (i15 != 40) {
                                if (i15 != 41) {
                                    switch (i15) {
                                        case 10:
                                            this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                                            m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_show_contact_zalo));
                                            C29954o0 c29954o014 = this.f56235f1;
                                            if (c29954o014 != null && (listItemSetting22 = c29954o014.f138842q) != null) {
                                                C0708i c0708i9 = new C0708i();
                                                c0708i9.m1072c("status", 0);
                                                listItemSetting22.setTrackingExtraData(c0708i9);
                                                String m118743r011 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_state_all_contact);
                                                AbstractC19074t.m100207e(m118743r011, "getString(...)");
                                                listItemSetting22.setTitle(m118743r011);
                                            }
                                            C29954o0 c29954o015 = this.f56235f1;
                                            if (c29954o015 != null && (listItemSetting21 = c29954o015.f138843r) != null) {
                                                C0708i c0708i10 = new C0708i();
                                                c0708i10.m1072c("status", 1);
                                                listItemSetting21.setTrackingExtraData(c0708i10);
                                                String m118743r012 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_state_contact_use_zalo);
                                                AbstractC19074t.m100207e(m118743r012, "getString(...)");
                                                listItemSetting21.setTitle(m118743r012);
                                                listItemSetting21.m90592m(false);
                                            }
                                            C29954o0 c29954o016 = this.f56235f1;
                                            if (c29954o016 != null) {
                                                listItemSetting20 = c29954o016.f138844s;
                                            } else {
                                                listItemSetting20 = null;
                                            }
                                            if (listItemSetting20 != null) {
                                                listItemSetting20.setVisibility(8);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                                            m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting16));
                                            String[] m118755v02 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language);
                                            AbstractC19074t.m100207e(m118755v02, "getStringArray(...)");
                                            C29954o0 c29954o017 = this.f56235f1;
                                            if (c29954o017 != null && (listItemSetting25 = c29954o017.f138842q) != null) {
                                                listItemSetting25.setIconSetting(new ZAppCompatImageView(listItemSetting25.getContext()));
                                                ZAppCompatImageView iconSetting = listItemSetting25.getIconSetting();
                                                if (iconSetting != null) {
                                                    iconSetting.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_language_vn));
                                                    C24848g0 c24848g05 = C24848g0.f119245a;
                                                }
                                                ZAppCompatImageView iconSetting2 = listItemSetting25.getIconSetting();
                                                if (iconSetting2 != null) {
                                                    iconSetting2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                                                }
                                                ZAppCompatImageView iconSetting3 = listItemSetting25.getIconSetting();
                                                AbstractC19074t.m100205c(iconSetting3);
                                                listItemSetting25.m90587c(iconSetting3);
                                                listItemSetting25.setLeadingGravity(EnumC16952b0.CENTER);
                                                listItemSetting25.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
                                                C0708i c0708i11 = new C0708i();
                                                c0708i11.m1072c("status", 0);
                                                listItemSetting25.setTrackingExtraData(c0708i11);
                                                String str5 = m118755v02[0];
                                                AbstractC19074t.m100207e(str5, "get(...)");
                                                listItemSetting25.setTitle(str5);
                                            }
                                            C29954o0 c29954o018 = this.f56235f1;
                                            if (c29954o018 != null && (listItemSetting24 = c29954o018.f138843r) != null) {
                                                listItemSetting24.setIconSetting(new ZAppCompatImageView(listItemSetting24.getContext()));
                                                ZAppCompatImageView iconSetting4 = listItemSetting24.getIconSetting();
                                                if (iconSetting4 != null) {
                                                    iconSetting4.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_language_en));
                                                    C24848g0 c24848g06 = C24848g0.f119245a;
                                                }
                                                ZAppCompatImageView iconSetting5 = listItemSetting24.getIconSetting();
                                                if (iconSetting5 != null) {
                                                    iconSetting5.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                                                }
                                                ZAppCompatImageView iconSetting6 = listItemSetting24.getIconSetting();
                                                AbstractC19074t.m100205c(iconSetting6);
                                                listItemSetting24.m90587c(iconSetting6);
                                                listItemSetting24.setLeadingGravity(EnumC16952b0.CENTER);
                                                C0708i c0708i12 = new C0708i();
                                                c0708i12.m1072c("status", 1);
                                                listItemSetting24.setTrackingExtraData(c0708i12);
                                                String str6 = m118755v02[1];
                                                AbstractC19074t.m100207e(str6, "get(...)");
                                                listItemSetting24.setTitle(str6);
                                                listItemSetting24.m90592m(false);
                                            }
                                            C29954o0 c29954o019 = this.f56235f1;
                                            if (c29954o019 != null) {
                                                listItemSetting23 = c29954o019.f138844s;
                                            } else {
                                                listItemSetting23 = null;
                                            }
                                            if (listItemSetting23 != null) {
                                                listItemSetting23.setVisibility(8);
                                                break;
                                            }
                                            break;
                                        case 12:
                                            this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                                            m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_font_title));
                                            String[] m118755v03 = AbstractC23136l9.m118755v0(AbstractC16775v.array_font_setting);
                                            AbstractC19074t.m100207e(m118755v03, "getStringArray(...)");
                                            C29954o0 c29954o020 = this.f56235f1;
                                            if (c29954o020 != null && (listItemSetting28 = c29954o020.f138842q) != null) {
                                                C0708i c0708i13 = new C0708i();
                                                c0708i13.m1072c("status", 0);
                                                listItemSetting28.setTrackingExtraData(c0708i13);
                                                String str7 = m118755v03[0];
                                                AbstractC19074t.m100207e(str7, "get(...)");
                                                listItemSetting28.setTitle(str7);
                                            }
                                            C29954o0 c29954o021 = this.f56235f1;
                                            if (c29954o021 != null && (listItemSetting27 = c29954o021.f138843r) != null) {
                                                C0708i c0708i14 = new C0708i();
                                                c0708i14.m1072c("status", 1);
                                                listItemSetting27.setTrackingExtraData(c0708i14);
                                                String str8 = m118755v03[1];
                                                AbstractC19074t.m100207e(str8, "get(...)");
                                                listItemSetting27.setTitle(str8);
                                                listItemSetting27.m90592m(false);
                                            }
                                            C29954o0 c29954o022 = this.f56235f1;
                                            if (c29954o022 != null) {
                                                listItemSetting26 = c29954o022.f138844s;
                                            } else {
                                                listItemSetting26 = null;
                                            }
                                            if (listItemSetting26 != null) {
                                                listItemSetting26.setVisibility(8);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            } else {
                                this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                                m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_display_msg));
                                C29954o0 c29954o023 = this.f56235f1;
                                if (c29954o023 != null && (listItemSetting19 = c29954o023.f138842q) != null) {
                                    C0708i c0708i15 = new C0708i();
                                    c0708i15.m1072c("status", 0);
                                    listItemSetting19.setTrackingExtraData(c0708i15);
                                    String m118743r013 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_display_msg_newest);
                                    AbstractC19074t.m100207e(m118743r013, "getString(...)");
                                    listItemSetting19.setTitle(m118743r013);
                                }
                                C29954o0 c29954o024 = this.f56235f1;
                                if (c29954o024 != null && (listItemSetting18 = c29954o024.f138843r) != null) {
                                    C0708i c0708i16 = new C0708i();
                                    c0708i16.m1072c("status", 1);
                                    listItemSetting18.setTrackingExtraData(c0708i16);
                                    String m118743r014 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_display_msg_first_unread);
                                    AbstractC19074t.m100207e(m118743r014, "getString(...)");
                                    listItemSetting18.setTitle(m118743r014);
                                    listItemSetting18.m90592m(false);
                                }
                                C29954o0 c29954o025 = this.f56235f1;
                                if (c29954o025 != null) {
                                    listItemSetting17 = c29954o025.f138844s;
                                } else {
                                    listItemSetting17 = null;
                                }
                                if (listItemSetting17 != null) {
                                    listItemSetting17.setVisibility(8);
                                }
                                C29954o0 c29954o026 = this.f56235f1;
                                if (c29954o026 != null && (robotoTextView4 = c29954o026.f138845t) != null) {
                                    robotoTextView4.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_hint_display_msg));
                                    robotoTextView4.setVisibility(0);
                                }
                            }
                        } else {
                            this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                            m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_update_phonebook));
                            C29954o0 c29954o027 = this.f56235f1;
                            if (c29954o027 != null && (listItemSetting16 = c29954o027.f138842q) != null) {
                                C0708i c0708i17 = new C0708i();
                                c0708i17.m1072c("status", 0);
                                listItemSetting16.setTrackingExtraData(c0708i17);
                                String m118743r015 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_auto_submit_contact_title);
                                AbstractC19074t.m100207e(m118743r015, "getString(...)");
                                listItemSetting16.setTitle(m118743r015);
                                String m118743r016 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_auto_submit_contact_subtitle);
                                AbstractC19074t.m100207e(m118743r016, "getString(...)");
                                listItemSetting16.setSubtitle(m118743r016);
                            }
                            C29954o0 c29954o028 = this.f56235f1;
                            if (c29954o028 != null && (listItemSetting15 = c29954o028.f138843r) != null) {
                                C0708i c0708i18 = new C0708i();
                                c0708i18.m1072c("status", 1);
                                listItemSetting15.setTrackingExtraData(c0708i18);
                                String m118743r017 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_last_time_submit_contact_title);
                                AbstractC19074t.m100207e(m118743r017, "getString(...)");
                                listItemSetting15.setTitle(m118743r017);
                                listItemSetting15.m90592m(false);
                            }
                            C29954o0 c29954o029 = this.f56235f1;
                            if (c29954o029 != null) {
                                listItemSetting14 = c29954o029.f138844s;
                            } else {
                                listItemSetting14 = null;
                            }
                            if (listItemSetting14 != null) {
                                listItemSetting14.setVisibility(8);
                            }
                        }
                    } else {
                        this.f56236g1 = C29775e1.m147880c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                        m58605dM().f137350q.setText("");
                        C29775e1 c29775e111 = this.f56236g1;
                        if (c29775e111 != null) {
                            robotoTextView2 = c29775e111.f137634v;
                        } else {
                            robotoTextView2 = null;
                        }
                        if (robotoTextView2 != null) {
                            robotoTextView2.setVisibility(8);
                        }
                        C29775e1 c29775e112 = this.f56236g1;
                        if (c29775e112 != null) {
                            robotoTextView3 = c29775e112.f137635w;
                        } else {
                            robotoTextView3 = null;
                        }
                        if (robotoTextView3 != null) {
                            robotoTextView3.setVisibility(8);
                        }
                        C29775e1 c29775e113 = this.f56236g1;
                        if (c29775e113 != null) {
                            linearLayout = c29775e113.f137633u;
                        } else {
                            linearLayout = null;
                        }
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                        C29775e1 c29775e114 = this.f56236g1;
                        if (c29775e114 != null) {
                            linearLayout2 = c29775e114.f137632t;
                        } else {
                            linearLayout2 = null;
                        }
                        if (linearLayout2 != null) {
                            linearLayout2.setClipToOutline(true);
                        }
                        C29775e1 c29775e115 = this.f56236g1;
                        if (c29775e115 != null && (linearLayout4 = c29775e115.f137632t) != null) {
                            drawable = linearLayout4.getBackground();
                        } else {
                            drawable = null;
                        }
                        if (drawable instanceof GradientDrawable) {
                            C29775e1 c29775e116 = this.f56236g1;
                            if (c29775e116 != null && (linearLayout3 = c29775e116.f137632t) != null) {
                                drawable2 = linearLayout3.getBackground();
                            } else {
                                drawable2 = null;
                            }
                            AbstractC19074t.m100206d(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                            ((GradientDrawable) drawable2).setCornerRadius(AbstractC23222t7.f112582r);
                        }
                        C29775e1 c29775e117 = this.f56236g1;
                        if (c29775e117 != null && (listItemSetting13 = c29775e117.f137631s) != null) {
                            if (c29775e117 != null && listItemSetting13 != null) {
                                listItemSetting13.setIdTracking("setting_filter_timeline_toggle");
                                Switch r12 = listItemSetting13.getSwitch();
                                if (r12 != null) {
                                    r12.setIdTracking("setting_filter_timeline_toggle");
                                    C24848g0 c24848g07 = C24848g0.f119245a;
                                }
                            }
                            m58553EM();
                            m58563MM(C24380u.f117739a.mo127507a());
                            String m118743r018 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_filter_timeline_title);
                            AbstractC19074t.m100207e(m118743r018, "getString(...)");
                            listItemSetting13.setTitle(m118743r018);
                            String m118743r019 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_filter_timeline_desc);
                            AbstractC19074t.m100207e(m118743r019, "getString(...)");
                            listItemSetting13.setSubtitle(m118743r019);
                            listItemSetting13.m90592m(false);
                        }
                    }
                }
                this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                RobotoTextView robotoTextView8 = m58605dM().f137350q;
                if (this.f56238i1 == 17) {
                    i11 = AbstractC8020f0.str_setting_video_auto_play;
                } else {
                    i11 = AbstractC8020f0.str_music_setting_auto_play_title;
                }
                robotoTextView8.setText(AbstractC23136l9.m118743r0(i11));
                C29954o0 c29954o030 = this.f56235f1;
                if (c29954o030 != null && (listItemSetting12 = c29954o030.f138842q) != null) {
                    C0708i c0708i19 = new C0708i();
                    c0708i19.m1072c("status", 0);
                    listItemSetting12.setTrackingExtraData(c0708i19);
                    String m118743r020 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_video_mode_auto_play_always);
                    AbstractC19074t.m100207e(m118743r020, "getString(...)");
                    listItemSetting12.setTitle(m118743r020);
                }
                C29954o0 c29954o031 = this.f56235f1;
                if (c29954o031 != null && (listItemSetting11 = c29954o031.f138843r) != null) {
                    C0708i c0708i20 = new C0708i();
                    c0708i20.m1072c("status", 1);
                    listItemSetting11.setTrackingExtraData(c0708i20);
                    String m118743r021 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_video_mode_auto_play_with_wifi);
                    AbstractC19074t.m100207e(m118743r021, "getString(...)");
                    listItemSetting11.setTitle(m118743r021);
                }
                C29954o0 c29954o032 = this.f56235f1;
                if (c29954o032 != null && (listItemSetting10 = c29954o032.f138844s) != null) {
                    C0708i c0708i21 = new C0708i();
                    c0708i21.m1072c("status", 2);
                    listItemSetting10.setTrackingExtraData(c0708i21);
                    String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_video_mode_auto_play_off);
                    AbstractC19074t.m100207e(m118743r022, "getString(...)");
                    listItemSetting10.setTitle(m118743r022);
                    listItemSetting10.m90592m(false);
                }
                C29954o0 c29954o033 = this.f56235f1;
                if (c29954o033 != null) {
                    robotoTextView = c29954o033.f138845t;
                } else {
                    robotoTextView = null;
                }
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(8);
                }
            } else {
                this.f56235f1 = C29954o0.m148299c(LayoutInflater.from(m58605dM().getRoot().getContext()), m58605dM().getRoot(), true);
                m58605dM().f137350q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title_noti_feed));
                C29954o0 c29954o034 = this.f56235f1;
                if (c29954o034 != null && (listItemSetting3 = c29954o034.f138842q) != null) {
                    C0708i c0708i22 = new C0708i();
                    c0708i22.m1072c("status", 0);
                    listItemSetting3.setTrackingExtraData(c0708i22);
                    String m118743r023 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_noti_feed_option_enable);
                    AbstractC19074t.m100207e(m118743r023, "getString(...)");
                    listItemSetting3.setTitle(m118743r023);
                }
                C29954o0 c29954o035 = this.f56235f1;
                if (c29954o035 != null && (listItemSetting2 = c29954o035.f138843r) != null) {
                    C0708i c0708i23 = new C0708i();
                    c0708i23.m1072c("status", 1);
                    listItemSetting2.setTrackingExtraData(c0708i23);
                    String m118743r024 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_noti_feed_option_disable);
                    AbstractC19074t.m100207e(m118743r024, "getString(...)");
                    listItemSetting2.setTitle(m118743r024);
                }
                C29954o0 c29954o036 = this.f56235f1;
                if (c29954o036 != null && (listItemSetting = c29954o036.f138844s) != null) {
                    C0708i c0708i24 = new C0708i();
                    c0708i24.m1072c("status", 2);
                    listItemSetting.setTrackingExtraData(c0708i24);
                    String m118743r025 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_noti_feed_option_except);
                    AbstractC19074t.m100207e(m118743r025, "getString(...)");
                    listItemSetting.setTitle(m118743r025);
                    listItemSetting.m90592m(false);
                }
            }
            int i16 = this.f56238i1;
            if (i16 != 14 && i16 != 17) {
                if (i16 != 47) {
                    if (i16 != 2000) {
                        if (i16 != 40 && i16 != 41) {
                            switch (i16) {
                            }
                        }
                    } else {
                        C29954o0 c29954o037 = this.f56235f1;
                        if (c29954o037 != null && (listItemSetting9 = c29954o037.f138842q) != null) {
                            listItemSetting9.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.g0
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                    SettingViewBottomSheet.m58592rM(SettingViewBottomSheet.this, compoundButton, z11);
                                }
                            });
                            C24848g0 c24848g08 = C24848g0.f119245a;
                        }
                        Context context = getContext();
                        AbstractC19074t.m100205c(context);
                        final Button button = new Button(context);
                        button.setIdTracking("btnSyncContact");
                        button.m90539c(AbstractC2814h.ButtonSmall_Secondary);
                        button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.btnUpdatePhoneBook));
                        button.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                        button.setOnClickListener(new View.OnClickListener() { // from class: e50.h0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SettingViewBottomSheet.m58593sM(SettingViewBottomSheet.this, button, view);
                            }
                        });
                        C29954o0 c29954o038 = this.f56235f1;
                        if (c29954o038 != null && (listItemSetting8 = c29954o038.f138843r) != null) {
                            listItemSetting8.m90589e(button);
                            listItemSetting8.setTrailingGravity(EnumC16952b0.CENTER);
                        }
                    }
                } else {
                    C29775e1 c29775e118 = this.f56236g1;
                    if (c29775e118 != null && (listItemSetting7 = c29775e118.f137631s) != null) {
                        listItemSetting7.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.v
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                SettingViewBottomSheet.m58594tM(SettingViewBottomSheet.this, compoundButton, z11);
                            }
                        });
                        C24848g0 c24848g09 = C24848g0.f119245a;
                    }
                }
            }
            C29954o0 c29954o039 = this.f56235f1;
            if (c29954o039 != null && (listItemSetting6 = c29954o039.f138842q) != null) {
                listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: e50.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58589oM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g010 = C24848g0.f119245a;
            }
            C29954o0 c29954o040 = this.f56235f1;
            if (c29954o040 != null && (listItemSetting5 = c29954o040.f138843r) != null) {
                listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: e50.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58590pM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g011 = C24848g0.f119245a;
            }
            C29954o0 c29954o041 = this.f56235f1;
            if (c29954o041 != null && (listItemSetting4 = c29954o041.f138844s) != null) {
                listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: e50.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingViewBottomSheet.m58591qM(SettingViewBottomSheet.this, view);
                    }
                });
                C24848g0 c24848g012 = C24848g0.f119245a;
            }
        }
        m58596vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public static final void m58584kM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56231b1);
    }

    /* renamed from: lI */
    private final void m58585lI(List list) {
        try {
            if (this.f56241l1) {
                return;
            }
            if (C23055e5.m118272g(true)) {
                m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f56241l1 = true;
                AbstractC23306f.m120714t1().m123883c(list, new C11180a(list, this), new C11181b());
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                m58596vM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("BottomSheetSettingView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m58586lM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56232c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m58587mM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56233d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m58588nM(SettingViewBottomSheet settingViewBottomSheet, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58577aM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m58589oM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56231b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m58590pM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56232c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m58591qM(SettingViewBottomSheet settingViewBottomSheet, View view) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58578bM(settingViewBottomSheet.f56233d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m58592rM(SettingViewBottomSheet settingViewBottomSheet, CompoundButton compoundButton, boolean z11) {
        String str;
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        AbstractC23309i.m121139Kw(4);
        AbstractC23057e7.m118305l(z11);
        if (z11 && settingViewBottomSheet.m58604cM(true)) {
            if (C8937j0.m47663l("phonebook_sync_scan_on_auto_submit")) {
                AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_scan_on_auto_submit", "phonebook_sync", null, 4, null));
            } else {
                Context context = settingViewBottomSheet.getContext();
                if (context != null) {
                    C23046d7.m118242e(context).mo13822K();
                }
            }
        }
        if (z11) {
            str = "37501";
        } else {
            str = "37502";
        }
        AbstractC23647d.m123897g(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m58593sM(SettingViewBottomSheet settingViewBottomSheet, Button button, View view) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(button, "$this_apply");
        if (!AbstractC0852x.m2364u() && !AbstractC0852x.m2365v() && settingViewBottomSheet.m58604cM(true)) {
            if (C8937j0.m47663l(settingViewBottomSheet.f56242m1.m35528c())) {
                C29954o0 c29954o0 = settingViewBottomSheet.f56235f1;
                if (c29954o0 != null) {
                    robotoTextView = c29954o0.f138845t;
                } else {
                    robotoTextView = null;
                }
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(8);
                }
                settingViewBottomSheet.m58555GM();
                return;
            }
            Context context = button.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C23046d7.m118242e(context).mo13822K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m58594tM(SettingViewBottomSheet settingViewBottomSheet, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingViewBottomSheet, "this$0");
        settingViewBottomSheet.m58577aM(z11);
    }

    /* renamed from: uM */
    private final void m58595uM() {
        C17487o0 m92662fJ;
        if (this.f56238i1 == 47) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            MainTabView.m67645lM().m67674JN(C24099q0.Companion.m125984a().m125977u());
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
                m92662fJ.m93069k2(MainTabView.class, bundle, 2, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public final void m58596vM() {
        int i11;
        ListItemSetting listItemSetting;
        JSONObject optJSONObject;
        int i12;
        ListItemSetting listItemSetting2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (this.f56239j1) {
            int i19 = this.f56238i1;
            if (i19 != 1) {
                if (i19 != 7) {
                    if (i19 != 11) {
                        if (i19 != 25) {
                            if (i19 == 27) {
                                boolean m121308Pg = AbstractC23309i.m121308Pg();
                                m58563MM(m121308Pg);
                                m58550AM(m121308Pg);
                                m58599zM(m121308Pg);
                                return;
                            }
                            return;
                        }
                        int m15415f = C3080a0.f13112a.m15415f();
                        if (m15415f != 2) {
                            if (m15415f != 3) {
                                if (m15415f == 4) {
                                    i18 = this.f56232c1;
                                }
                            } else {
                                i18 = this.f56233d1;
                            }
                        } else {
                            i18 = this.f56231b1;
                        }
                        m58554FM(i18);
                        return;
                    }
                    boolean m121490Ud = AbstractC23309i.m121490Ud();
                    m58563MM(m121490Ud);
                    m58598yM(m121490Ud);
                    return;
                }
                m58554FM(AbstractC23309i.m122646za() + 1);
                return;
            }
            if (AbstractC23309i.m122609ya() == 1) {
                i17 = this.f56232c1;
            } else {
                i17 = this.f56231b1;
            }
            m58554FM(i17);
            return;
        }
        int i21 = this.f56238i1;
        if (i21 != 14) {
            if (i21 != 17) {
                if (i21 != 47) {
                    if (i21 != 2000) {
                        if (i21 != 40) {
                            if (i21 != 41) {
                                switch (i21) {
                                    case 10:
                                        if (AbstractC23309i.m122127lb() == 1) {
                                            i14 = this.f56232c1;
                                        } else {
                                            i14 = this.f56231b1;
                                        }
                                        m58554FM(i14);
                                        return;
                                    case 11:
                                        String[] stringArray = m92651WI().getStringArray(AbstractC16775v.array_language_as_code);
                                        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
                                        int length = stringArray.length;
                                        while (true) {
                                            if (i18 < length) {
                                                if (AbstractC18458a.f93019a.equals(stringArray[i18])) {
                                                    if (i18 == 1) {
                                                        i15 = this.f56232c1;
                                                    }
                                                } else {
                                                    i18++;
                                                }
                                            }
                                        }
                                        i15 = this.f56231b1;
                                        m58554FM(i15);
                                        return;
                                    case 12:
                                        if (AbstractC23309i.m122089kb() == 1) {
                                            i16 = this.f56232c1;
                                        } else {
                                            i16 = this.f56231b1;
                                        }
                                        m58554FM(i16);
                                        return;
                                    default:
                                        return;
                                }
                            }
                            int m135672c = C26354c.f125196a.m135672c();
                            if (m135672c != 0) {
                                if (m135672c != 2) {
                                    i13 = this.f56231b1;
                                } else {
                                    i13 = this.f56232c1;
                                }
                            } else {
                                i13 = this.f56233d1;
                            }
                            m58554FM(i13);
                            return;
                        }
                        if (AbstractC23306f.m120562A().m2525T()) {
                            m58554FM(this.f56232c1);
                            return;
                        } else {
                            m58554FM(this.f56231b1);
                            return;
                        }
                    }
                    C29954o0 c29954o0 = this.f56235f1;
                    if (c29954o0 != null && (listItemSetting2 = c29954o0.f138842q) != null) {
                        listItemSetting2.setSwitch(AbstractC23057e7.m118297d());
                    }
                    m58603KM(0, false, "");
                    return;
                }
                boolean mo127507a = C24380u.f117739a.mo127507a();
                m58553EM();
                m58563MM(mo127507a);
                m58597xM(mo127507a);
                return;
            }
            int m104104c = C20048j.f98580a.m104104c();
            if (m104104c != 0) {
                if (m104104c != 2) {
                    i12 = this.f56231b1;
                } else {
                    i12 = this.f56232c1;
                }
            } else {
                i12 = this.f56233d1;
            }
            m58554FM(i12);
            return;
        }
        String m120822Cb = AbstractC23309i.m120822Cb();
        if (m120822Cb != null && m120822Cb.length() != 0) {
            JSONObject jSONObject = new JSONObject(m120822Cb);
            int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f56237h1 = jSONObject.optJSONArray("list_uid");
            StringBuilder sb2 = new StringBuilder();
            JSONArray jSONArray = this.f56237h1;
            if (jSONArray != null && jSONArray.length() > 0 && (optJSONObject = jSONArray.optJSONObject(0)) != null) {
                ContactProfile m98552o = C18644n.m98531l().m98552o(optJSONObject.optString("userId"));
                if (m98552o != null) {
                    sb2.append(m98552o.m40383Q(true, false));
                } else {
                    sb2.append(optJSONObject.optString("displayName"));
                }
                if (jSONArray.length() > 1) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(1);
                    if (optJSONObject2 != null) {
                        ContactProfile m98552o2 = C18644n.m98531l().m98552o(optJSONObject2.optString("userId"));
                        if (m98552o2 != null) {
                            sb2.append(", ");
                            sb2.append(m98552o2.m40383Q(true, false));
                        } else {
                            sb2.append(", ");
                            sb2.append(optJSONObject2.optString("displayName"));
                        }
                    }
                    if (jSONArray.length() > 2) {
                        sb2.append(" ");
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select_n_friend);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length() - 2)}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        sb2.append(format);
                    }
                }
            }
            C29954o0 c29954o02 = this.f56235f1;
            if (c29954o02 != null) {
                listItemSetting = c29954o02.f138844s;
            } else {
                listItemSetting = null;
            }
            if (listItemSetting != null) {
                String sb3 = sb2.toString();
                AbstractC19074t.m100207e(sb3, "toString(...)");
                listItemSetting.setSubtitle(sb3);
            }
            i18 = optInt;
        }
        if (i18 != 1) {
            if (i18 != 2) {
                i11 = this.f56232c1;
            } else {
                i11 = this.f56233d1;
            }
        } else {
            i11 = this.f56231b1;
        }
        m58554FM(i11);
    }

    /* renamed from: xM */
    private final void m58597xM(boolean z11) {
        int i11;
        ZAppCompatImageView zAppCompatImageView;
        if (z11) {
            if (C23212s8.m119602i()) {
                if (AbstractC23059e9.m118342u()) {
                    i11 = AbstractC16803z.setting_filter_timeline_illus_on_dm_vi;
                } else {
                    i11 = AbstractC16803z.setting_filter_timeline_illus_on_dm_en;
                }
            } else if (AbstractC23059e9.m118342u()) {
                i11 = AbstractC16803z.setting_filter_timeline_illus_on_lm_vi;
            } else {
                i11 = AbstractC16803z.setting_filter_timeline_illus_on_lm_en;
            }
        } else if (C23212s8.m119602i()) {
            i11 = AbstractC16803z.setting_filter_timeline_illus_off_dm;
        } else {
            i11 = AbstractC16803z.setting_filter_timeline_illus_off_lm;
        }
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (zAppCompatImageView = c29775e1.f137629q) != null) {
            zAppCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(zAppCompatImageView.getContext(), i11));
        }
    }

    /* renamed from: yM */
    private final void m58598yM(boolean z11) {
        int i11;
        ZAppCompatImageView zAppCompatImageView;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (C23212s8.m119602i()) {
            i11 += 2;
        }
        if (!AbstractC23059e9.m118342u()) {
            i11++;
        }
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (zAppCompatImageView = c29775e1.f137629q) != null) {
            zAppCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(zAppCompatImageView.getContext(), this.f56248s1[i11].intValue()));
        }
    }

    /* renamed from: zM */
    private final void m58599zM(boolean z11) {
        int i11;
        ZAppCompatImageView zAppCompatImageView;
        if (C23212s8.m119602i()) {
            if (z11) {
                i11 = AbstractC16803z.ic_type_status_online_dark;
            } else {
                i11 = AbstractC16803z.ic_type_status_offline_dark;
            }
        } else if (z11) {
            i11 = AbstractC16803z.ic_type_status_online_light;
        } else {
            i11 = AbstractC16803z.ic_type_status_offline_light;
        }
        C29775e1 c29775e1 = this.f56236g1;
        if (c29775e1 != null && (zAppCompatImageView = c29775e1.f137629q) != null) {
            zAppCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(zAppCompatImageView.getContext(), i11));
        }
    }

    /* renamed from: BM */
    public final void m58600BM(boolean z11) {
        this.f56245p1 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f56238i1 = m92642L3.getInt("EXTRA_SETTING_ID", 0);
            this.f56239j1 = m92642L3.getBoolean("EXTRA_BOL_PRIVACY", true);
            this.f56240k1 = m92642L3.getBoolean("EXTRA_IS_SHOW_HINT_TEXT", true);
        }
    }

    /* renamed from: HM */
    public final void m58601HM(int i11) {
        try {
            if (this.f56245p1) {
                return;
            }
            if (C23055e5.m118272g(true)) {
                m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f56245p1 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C11182c(i11));
                c0766k.mo1545U3(this.f56238i1, i11, "");
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                m58596vM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IM */
    public final void m58602IM(int i11, int i12, List list) {
        try {
            if (this.f56246q1) {
                return;
            }
            if (C23055e5.m118272g(true)) {
                this.f56246q1 = true;
                m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C11183d(i11, i12, this));
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    c0766k.mo1562W4(i11, i12, list);
                }
                c0766k.mo1699o3(i11, i12);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                m91395kl(new Runnable() { // from class: e50.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingViewBottomSheet.m58558JM(SettingViewBottomSheet.this);
                    }
                }, 100L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 6060);
    }

    /* renamed from: KM */
    public final void m58603KM(final int i11, final boolean z11, final String str) {
        AbstractC19444a.m101697e(new Runnable() { // from class: e50.u
            @Override // java.lang.Runnable
            public final void run() {
                SettingViewBottomSheet.m58561LM(z11, this, str, i11);
            }
        });
    }

    /* renamed from: cM */
    public final boolean m58604cM(boolean z11) {
        Context context = getContext();
        if (context != null) {
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(context, strArr) == 0) {
                return true;
            }
            if (z11) {
                AbstractC23034c6.m118184v0(this.f88762c0, strArr, 101);
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: dM */
    public final C29732bc m58605dM() {
        C29732bc c29732bc = this.f56234e1;
        if (c29732bc != null) {
            return c29732bc;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: eM */
    public final int m58606eM() {
        return this.f56238i1;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29732bc m147780c = C29732bc.m147780c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147780c, "inflate(...)");
        m58608wM(m147780c);
        m90525tL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m58583jM();
        C23744a.Companion.m124119a().m124115b(this, 6060);
    }

    /* renamed from: o3 */
    public final void m58607o3(int i11, int i12) {
        m58602IM(i11, i12, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1234) {
            m58596vM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 101 && m58604cM(false)) {
            if (C8937j0.m47663l(this.f56242m1.m35528c())) {
                m58555GM();
                C31849b1.m153097n().m153106h(true);
            } else {
                Context context = getContext();
                if (context != null) {
                    C23046d7.m118242e(context).mo13822K();
                }
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* renamed from: wM */
    public final void m58608wM(C29732bc c29732bc) {
        AbstractC19074t.m100208f(c29732bc, "<set-?>");
        this.f56234e1 = c29732bc;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        Integer num;
        int i12;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6060) {
            try {
                if (this.f56238i1 == 2000) {
                    if (objArr instanceof Integer) {
                        num = (Integer) objArr;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i12 = num.intValue();
                    } else {
                        i12 = 0;
                    }
                    String str = "";
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                        str = (String) obj;
                    }
                    m58603KM(i12, true, str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
