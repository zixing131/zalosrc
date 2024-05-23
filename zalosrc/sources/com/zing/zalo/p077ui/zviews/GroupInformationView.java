package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0943w;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.GroupInformationView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C18005u0;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p227i3.C20215s;
import p227i3.C20218v;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29814g4;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class GroupInformationView extends SlidableZaloView implements C23744a.c, View.OnClickListener {
    public static final C14349a Companion = new C14349a(null);

    /* renamed from: P0 */
    private String f73765P0;

    /* renamed from: Q0 */
    private C31973j5 f73766Q0;

    /* renamed from: R0 */
    private boolean f73767R0;

    /* renamed from: S0 */
    private Typeface f73768S0;

    /* renamed from: T0 */
    public C29814g4 f73769T0;

    /* renamed from: U0 */
    private C20500d f73770U0 = new C20500d(true);

    /* renamed from: V0 */
    private int f73771V0 = 1;

    /* renamed from: W0 */
    private boolean f73772W0;

    /* renamed from: com.zing.zalo.ui.zviews.GroupInformationView$a */
    /* loaded from: classes6.dex */
    public static final class C14349a {
        private C14349a() {
        }

        public /* synthetic */ C14349a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInformationView$b */
    /* loaded from: classes6.dex */
    public static final class C14350b extends AbstractC18391a {
        C14350b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            if (editable.toString().length() <= 1000) {
                C28652r.m143349v().m143361W(editable);
                C31884d6 m153209a = C31884d6.m153209a();
                AbstractC19074t.m100207e(m153209a, "getLinkOptionsType1(...)");
                C31944h6.m153538d(editable, 8, m153209a);
                GroupInformationView.this.m80161qM();
                return;
            }
            RobotoEditText robotoEditText = GroupInformationView.this.m80162jM().f137846r;
            GroupInformationView groupInformationView = GroupInformationView.this;
            String substring = editable.toString().substring(0, 1000);
            AbstractC19074t.m100207e(substring, "substring(...)");
            robotoEditText.setText(substring);
            robotoEditText.setSelection(String.valueOf(groupInformationView.m80162jM().f137846r.getText()).length());
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 1000));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInformationView$c */
    /* loaded from: classes6.dex */
    public static final class C14351c extends C20500d.a {
        C14351c() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: b */
        public void mo80168b(String str) {
            AbstractC19074t.m100208f(str, "hashtag");
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC23184q2.m119465w(str, GroupInformationView.this.f72421L0.getContext(), GroupInformationView.this.f72421L0.m92676n2());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInformationView$d */
    /* loaded from: classes6.dex */
    public static final class C14352d extends ZdsActionBar.AbstractC16987c {
        C14352d() {
        }

        /* renamed from: d */
        private final void m80169d() {
            if (GroupInformationView.this.m80163kM() == 1) {
                GroupInformationView.this.finish();
            } else if (GroupInformationView.this.m80163kM() == 2) {
                GroupInformationView.this.m80166pM(1);
            }
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            m80169d();
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            m80169d();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInformationView$e */
    /* loaded from: classes6.dex */
    public static final class C14353e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31973j5 f73776a;

        /* renamed from: b */
        final /* synthetic */ GroupInformationView f73777b;

        /* renamed from: c */
        final /* synthetic */ String f73778c;

        C14353e(C31973j5 c31973j5, GroupInformationView groupInformationView, String str) {
            this.f73776a = c31973j5;
            this.f73777b = groupInformationView;
            this.f73778c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80171d(GroupInformationView groupInformationView) {
            AbstractC19074t.m100208f(groupInformationView, "this$0");
            groupInformationView.m80166pM(1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                AbstractC23161o1.m119321f(c20096c, this.f73776a.m153747Y());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f73777b.f72421L0.mo49315c4();
            this.f73777b.m80165oM(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            int m127178g0;
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                int i12 = jSONObject.getInt("error_code");
                if (i12 == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        str = this.f73778c;
                        if (optJSONObject.has("desc")) {
                            str = optJSONObject.optString("desc");
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = this.f73778c;
                    }
                    if (!AbstractC19074t.m100204b(str, this.f73776a.m153765j())) {
                        if (TextUtils.isEmpty(str)) {
                            AbstractC19646n0.m103002m0(this.f73776a);
                        } else {
                            AbstractC19646n0.m102994k0(this.f73776a);
                        }
                        if (this.f73776a.m153747Y()) {
                            i11 = AbstractC8020f0.str_community_info_updated_successfully;
                        } else {
                            i11 = AbstractC8020f0.str_group_info_updated_successfully;
                        }
                        ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
                    }
                    C31973j5 c31973j5 = this.f73776a;
                    ArrayList m119748l = AbstractC23244v8.m119748l(str);
                    AbstractC19074t.m100207e(m119748l, "getUniqueHashTags(...)");
                    if (!c31973j5.m153749a(m119748l)) {
                        C18005u0.a aVar = new C18005u0.a();
                        GroupInformationView groupInformationView = this.f73777b;
                        C31973j5 c31973j52 = this.f73776a;
                        aVar.m95727i(2);
                        ArrayList m119748l2 = AbstractC23244v8.m119748l(str);
                        AbstractC19074t.m100207e(m119748l2, "getUniqueHashTags(...)");
                        if (m119748l2.isEmpty()) {
                            AbstractC19646n0.m102971e1(groupInformationView.m92652XI(AbstractC8020f0.str_msg_info_remove_group_hashtag), aVar.m95721c(), c31973j52, true);
                        } else {
                            int size = m119748l2.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                m119748l2.set(i13, "#" + m119748l2.get(i13));
                            }
                            String join = TextUtils.join(", ", m119748l2);
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String m92652XI = groupInformationView.m92652XI(AbstractC8020f0.str_msg_info_change_group_hashtag);
                            AbstractC19074t.m100207e(m92652XI, "getString(...)");
                            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{join}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                            C7907e c7907e = new C7907e();
                            AbstractC19074t.m100205c(join);
                            m127178g0 = AbstractC24342w.m127178g0(format, join, 0, false, 6, null);
                            c7907e.m40852b(new C7907e.a(m127178g0, join.length()));
                            aVar.m95725g(c7907e);
                            AbstractC19646n0.m102971e1(format, aVar.m95721c(), c31973j52, true);
                        }
                    }
                    this.f73776a.m153712D0(str);
                    C0943w.f3447a.m4482v(this.f73776a);
                    AbstractC23184q2.m119438C(this.f73776a.m153781r());
                } else {
                    ToastUtils.m89260h(i12, this.f73776a.m153747Y());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            final GroupInformationView groupInformationView2 = this.f73777b;
            groupInformationView2.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.fk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupInformationView.C14353e.m80171d(GroupInformationView.this);
                }
            });
            this.f73777b.f72421L0.mo49315c4();
            this.f73777b.m80165oM(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m80159lM(GroupInformationView groupInformationView, View view) {
        AbstractC19074t.m100208f(groupInformationView, "this$0");
        groupInformationView.m80166pM(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m80160mM(GroupInformationView groupInformationView, View view) {
        String str;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        AbstractC19074t.m100208f(groupInformationView, "this$0");
        C31973j5 c31973j5 = groupInformationView.f73766Q0;
        if (c31973j5 != null) {
            String m153765j = c31973j5.m153765j();
            if (m153765j != null) {
                int length = m153765j.length() - 1;
                int i13 = 0;
                boolean z13 = false;
                while (i13 <= length) {
                    if (!z13) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(m153765j.charAt(i12), 32) <= 0) {
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
                str = m153765j.subSequence(i13, length + 1).toString();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(groupInformationView.m80162jM().f137846r.getText());
            int length2 = valueOf.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length2) {
                if (!z14) {
                    i11 = i14;
                } else {
                    i11 = length2;
                }
                if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z14) {
                    if (!z11) {
                        z14 = true;
                    } else {
                        i14++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length2--;
                }
            }
            if (!AbstractC19074t.m100204b(str, valueOf.subSequence(i14, length2 + 1).toString())) {
                groupInformationView.m80167rM();
            } else {
                groupInformationView.m80166pM(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final void m80161qM() {
        Button trailingButton;
        ZdsActionBar m87077NK = m87077NK();
        if (this.f73771V0 == 2 && m87077NK != null && m87077NK.getTrailingButton() != null && (trailingButton = m87077NK.getTrailingButton()) != null) {
            trailingButton.setEnabled(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_IS_COMMUNITY")) {
            this.f73767R0 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY");
        }
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && m92676n2.getWindow() != null) {
            m92676n2.mo35554O(16);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f73768S0 = C13718q1.m76694c(m92689tK, 7);
        C29814g4 m147979a = C29814g4.m147979a(layoutInflater.inflate(AbstractC7409c0.group_information_view, viewGroup, false));
        AbstractC19074t.m100207e(m147979a, "bind(...)");
        m80164nM(m147979a);
        if (this.f73767R0) {
            m80162jM().f137846r.setHint(AbstractC8020f0.str_community_description_hint);
        }
        m80162jM().f137846r.addTextChangedListener(new C14350b());
        this.f73770U0.m106538e(new C14351c());
        LinearLayout root = m80162jM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:            if (r2.m153761g0() == false) goto L23;     */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo39896OK() {
        int i11;
        ZdsActionBar m87077NK;
        super.mo39896OK();
        if (this.f73767R0 && (m87077NK = m87077NK()) != null) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_description);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m87077NK.setMiddleTitle(m118743r0);
        }
        ZdsActionBar m87077NK2 = m87077NK();
        if (m87077NK2 != null) {
            m87077NK2.setLeadingFunctionCallback(new C14352d());
            if (this.f73771V0 == 1) {
                m87077NK2.setLeadingType(ZdsActionBar.EnumC16988d.CLOSE.m91015c());
                m87077NK2.setTrailingType(ZdsActionBar.EnumC16990f.ICON.m91019c());
                m87077NK2.setTrailingButton1Style(AbstractC2814h.ButtonMedium_TertiaryNeutral);
                Context context = m87077NK2.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Drawable m139658a = C27280g.m139658a(context, AbstractC23322a.zds_ic_edit_line_24);
                if (m139658a != null) {
                    m87077NK2.setTrailingIconButton(m139658a);
                }
                Button trailingButton = m87077NK2.getTrailingButton();
                if (trailingButton != null) {
                    C31973j5 c31973j5 = this.f73766Q0;
                    if (c31973j5 != null) {
                        AbstractC19074t.m100205c(c31973j5);
                        if (!c31973j5.m153742T()) {
                            C31973j5 c31973j52 = this.f73766Q0;
                            AbstractC19074t.m100205c(c31973j52);
                        }
                        i11 = 0;
                        trailingButton.setVisibility(i11);
                    }
                    i11 = 4;
                    trailingButton.setVisibility(i11);
                }
                m87077NK2.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.dk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupInformationView.m80159lM(GroupInformationView.this, view);
                    }
                });
                return;
            }
            m87077NK2.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
            m87077NK2.setTrailingType(ZdsActionBar.EnumC16990f.TEXT.m91019c());
            m87077NK2.setTrailingButton1Style(AbstractC2814h.ButtonMedium_Tertiary);
            String m92652XI = m92652XI(AbstractC8020f0.str_saved);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m87077NK2.setTrailingButtonText(m92652XI);
            m87077NK2.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ek
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupInformationView.m80160mM(GroupInformationView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.Companion.m124119a().m124117e(this, 52);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupInformationView";
    }

    /* renamed from: jM */
    public final C29814g4 m80162jM() {
        C29814g4 c29814g4 = this.f73769T0;
        if (c29814g4 != null) {
            return c29814g4;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: kM */
    public final int m80163kM() {
        return this.f73771V0;
    }

    /* renamed from: nM */
    public final void m80164nM(C29814g4 c29814g4) {
        AbstractC19074t.m100208f(c29814g4, "<set-?>");
        this.f73769T0 = c29814g4;
    }

    /* renamed from: oM */
    public final void m80165oM(boolean z11) {
        this.f73772W0 = z11;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            int i12 = this.f73771V0;
            if (i12 == 1) {
                finish();
                return true;
            }
            if (i12 == 2) {
                m80166pM(1);
                return false;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.Companion.m124119a().m124115b(this, 52);
    }

    /* renamed from: pM */
    public final void m80166pM(int i11) {
        String str;
        C31973j5 c31973j5 = this.f73766Q0;
        if (c31973j5 != null) {
            this.f73771V0 = i11;
            int i12 = 0;
            if (i11 != 1) {
                if (i11 == 2) {
                    m80162jM().f137848t.setVisibility(8);
                    RobotoEditText robotoEditText = m80162jM().f137846r;
                    robotoEditText.setText(c31973j5.m153765j());
                    robotoEditText.setVisibility(0);
                    robotoEditText.requestFocus();
                    Editable text = robotoEditText.getText();
                    if (text != null) {
                        i12 = text.length();
                    }
                    robotoEditText.setSelection(i12);
                    AbstractC2379w.m12432f(robotoEditText);
                }
            } else {
                C28652r m143349v = C28652r.m143349v();
                if (!TextUtils.isEmpty(c31973j5.m153765j())) {
                    str = c31973j5.m153765j();
                } else {
                    str = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m143349v.m143357H(str));
                try {
                    C31884d6 m153209a = C31884d6.m153209a();
                    AbstractC19074t.m100207e(m153209a, "getLinkOptionsType1(...)");
                    C31944h6.m153538d(spannableStringBuilder, 15, m153209a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                RobotoTextView robotoTextView = m80162jM().f137848t;
                robotoTextView.setVisibility(0);
                robotoTextView.setText(spannableStringBuilder);
                robotoTextView.setMovementMethod(this.f73770U0);
                RobotoEditText robotoEditText2 = m80162jM().f137846r;
                robotoEditText2.setVisibility(8);
                AbstractC2379w.m12430d(robotoEditText2);
            }
            mo39896OK();
        }
    }

    /* renamed from: rM */
    public final void m80167rM() {
        int i11;
        boolean z11;
        C31973j5 c31973j5 = this.f73766Q0;
        if (c31973j5 != null) {
            String valueOf = String.valueOf(m80162jM().f137846r.getText());
            int length = valueOf.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
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
            String obj = valueOf.subSequence(i12, length + 1).toString();
            if (this.f73772W0) {
                return;
            }
            this.f73772W0 = true;
            mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14353e(c31973j5, this, obj));
            c0766k.mo1582Y8(c31973j5.m153781r(), null, obj, -1, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (AbstractC23184q2.m119459q(this.f73765P0, i11, Arrays.copyOf(objArr, objArr.length))) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_group_id")) {
                this.f73765P0 = m92642L3.getString("extra_group_id");
                z11 = m92642L3.getBoolean("BOL_IS_EDIT_MODE");
                this.f73766Q0 = C0943w.f3447a.m4472f(this.f73765P0);
            } else {
                z11 = false;
            }
            C31973j5 c31973j5 = this.f73766Q0;
            if (c31973j5 != null) {
                GroupAvatarView groupAvatarView = m80162jM().f137845q;
                if (c31973j5.m153786t0()) {
                    groupAvatarView.m75732d(c31973j5.m153756e());
                } else {
                    groupAvatarView.setImageResource(AbstractC16803z.ic_ava_group);
                }
                m80162jM().f137849u.setText(c31973j5.m153793y());
                if (z11) {
                    m80166pM(2);
                    m80161qM();
                    return;
                } else {
                    AbstractC23647d.m123897g("1591012");
                    m80166pM(1);
                    return;
                }
            }
        }
        finish();
    }
}
