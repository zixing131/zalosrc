package com.zing.zalo.p077ui.zviews;

import am.C0943w;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7153n7;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import oc0.C24221a;
import org.json.JSONObject;
import p227i3.C20218v;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31973j5;
import v50.C27870vb;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public final class ChatPickerView extends ShareView implements ZaloView.InterfaceC17421f {
    public static final C14148a Companion = new C14148a(null);

    /* renamed from: f3 */
    private View f72690f3;

    /* renamed from: g3 */
    private JSONObject f72691g3;

    /* renamed from: h3 */
    private String f72692h3 = "";

    /* renamed from: i3 */
    private String f72693i3 = "";

    /* renamed from: j3 */
    private int f72694j3 = Integer.MIN_VALUE;

    /* renamed from: com.zing.zalo.ui.zviews.ChatPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C14148a {
        private C14148a() {
        }

        public /* synthetic */ C14148a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChatPickerView$b */
    /* loaded from: classes6.dex */
    public static final class C14149b extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f72696m1;

        C14149b(RecyclingImageView recyclingImageView) {
            this.f72696m1 = recyclingImageView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (AbstractC19074t.m100204b(ChatPickerView.this.f72692h3, str) && c3979l != null && c3979l.m18839c() != null) {
                this.f72696m1.setImageBitmap(c3979l.m18839c());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChatPickerView$c */
    /* loaded from: classes6.dex */
    public static final class C14150c extends RecyclerView.AbstractC1887n {
        C14150c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            if (((ShareView) ChatPickerView.this).f82008Y0.m10112b(view) == ((ShareView) ChatPickerView.this).f81984Q0.mo10003k() - 1) {
                if (((ShareView) ChatPickerView.this).f82068z1 != null && ((ShareView) ChatPickerView.this).f82068z1.getAlpha() > 0.0f && ((ShareView) ChatPickerView.this).f82068z1.getVisibility() == 0) {
                    rect.bottom = (AbstractC23222t7.f112514B * 2) + ((ShareView) ChatPickerView.this).f82068z1.getHeight();
                } else {
                    rect.bottom = 0;
                }
            }
        }
    }

    /* renamed from: qP */
    private final void m78774qP() {
        View inflate;
        RecyclingImageView recyclingImageView;
        View view = this.f72690f3;
        if (view == null) {
            AbstractC19074t.m100223u("mRootView");
            view = null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(AbstractC6918a0.vs_header);
        if (viewStub != null && (inflate = viewStub.inflate()) != null) {
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC23136l9.m118737p0();
            }
            if (!TextUtils.isEmpty(this.f72692h3) && (recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.header_icon)) != null) {
                ((C23528a) new C23528a(getContext()).m123612r(recyclingImageView)).m123579C(this.f72692h3, C23278z2.m120126f0(), new C14149b(recyclingImageView));
            }
            if (!TextUtils.isEmpty(this.f72693i3)) {
                ((RobotoTextView) inflate.findViewById(AbstractC6918a0.header_title)).setText(this.f72693i3);
            }
            ((AppCompatImageView) inflate.findViewById(AbstractC6918a0.btn_close)).setOnClickListener(this);
        }
    }

    /* renamed from: rP */
    private final void m78775rP(InviteContactProfile inviteContactProfile, int i11) {
        if (inviteContactProfile.m40374K0()) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(inviteContactProfile.f42434r);
            if (m4472f != null) {
                String mo2478b = inviteContactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                Bundle m140776b = new C27870vb(mo2478b).m140780g(inviteContactProfile).m140776b();
                m140776b.putString("groupId", m4472f.m153781r());
                m140776b.putString("groupName", m4472f.m153793y());
                m140776b.putInt("SHOW_WITH_FLAGS", 7340032);
                m140776b.putInt("INT_EXTRA_ATTACHMENT_ID_HIGHLIGHT", i11);
                m92693xK().m93069k2(ChatView.class, m140776b, 0, true);
                return;
            }
            return;
        }
        if (inviteContactProfile.m40382P0()) {
            String mo2478b2 = inviteContactProfile.mo2478b();
            AbstractC19074t.m100207e(mo2478b2, "getUid(...)");
            Bundle m140776b2 = new C27870vb(mo2478b2).m140780g(inviteContactProfile).m140776b();
            m140776b2.putInt("INT_EXTRA_ATTACHMENT_ID_HIGHLIGHT", i11);
            m92693xK().m93069k2(ChatView.class, m140776b2, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        String str2;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            try {
                String str3 = "";
                if (!m92642L3.containsKey("EXTRA_DATA_JSON")) {
                    str = "";
                } else {
                    str = m92642L3.getString("EXTRA_DATA_JSON");
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    JSONObject jSONObject = new JSONObject(str);
                    this.f72691g3 = jSONObject;
                    AbstractC19074t.m100205c(jSONObject);
                    if (jSONObject.isNull("title")) {
                        str2 = "";
                    } else {
                        JSONObject jSONObject2 = this.f72691g3;
                        AbstractC19074t.m100205c(jSONObject2);
                        str2 = jSONObject2.optString("title");
                    }
                    this.f72693i3 = str2;
                    JSONObject jSONObject3 = this.f72691g3;
                    AbstractC19074t.m100205c(jSONObject3);
                    if (!jSONObject3.isNull("icon")) {
                        JSONObject jSONObject4 = this.f72691g3;
                        AbstractC19074t.m100205c(jSONObject4);
                        str3 = jSONObject4.optString("icon");
                        AbstractC19074t.m100207e(str3, "optString(...)");
                    }
                    this.f72692h3 = str3;
                    JSONObject jSONObject5 = this.f72691g3;
                    AbstractC19074t.m100205c(jSONObject5);
                    this.f72694j3 = jSONObject5.optInt("attachmentId", Integer.MIN_VALUE);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C24221a c24221a = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_LIST_RECENT") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_LIST_RECENT")) {
                z11 = false;
            } else {
                z11 = true;
            }
            c24221a.m126337L(z11);
            C24221a c24221a2 = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_TITLE_RECENT") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_TITLE_RECENT")) {
                z12 = false;
            } else {
                z12 = true;
            }
            c24221a2.m126343R(z12);
            C24221a c24221a3 = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_LIST_CONTACT") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_LIST_CONTACT")) {
                z13 = false;
            } else {
                z13 = true;
            }
            c24221a3.m126338M(z13);
            C24221a c24221a4 = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_TITLE_CONTACT") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_TITLE_CONTACT")) {
                z14 = false;
            } else {
                z14 = true;
            }
            c24221a4.m126340O(z14);
            C24221a c24221a5 = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_FULL_CONTACT") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_FULL_CONTACT")) {
                z15 = false;
            } else {
                z15 = true;
            }
            c24221a5.m126333H(z15);
            C24221a c24221a6 = this.f82063w2;
            if (m92642L3.containsKey("EXTRA_CONFIG_SHOW_TITLE_GROUP") && !m92642L3.getBoolean("EXTRA_CONFIG_SHOW_TITLE_GROUP")) {
                z16 = false;
            } else {
                z16 = true;
            }
            c24221a6.m126342Q(z16);
        }
        this.f82063w2.m126339N(!this.f81968I2);
        this.f82063w2.m126330E(false);
        this.f82063w2.m126341P(false);
        this.f82063w2.m126345T(true);
        this.f81960E2 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        AbstractC19074t.m100205c(mo37483GJ);
        this.f72690f3 = mo37483GJ;
        AbstractC23136l9.m118744r1(this.f81996U0, 8);
        AbstractC23136l9.m118744r1(this.f81999V0, 8);
        View view = this.f72690f3;
        if (view == null) {
            AbstractC19074t.m100223u("mRootView");
            view = null;
        }
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_continue);
        this.f82068z1 = robotoTextView;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(this);
        }
        m78774qP();
        this.f81981P0.m9816A(new C14150c());
        if (bundle != null) {
            AbstractC19074t.m100207e(this.f81988R1, "mSelectedList");
            if (!r3.isEmpty()) {
                this.f81960E2 = false;
                this.f81990S0.m35846M(this.f81988R1);
                this.f81990S0.m10008p();
                this.f81987R0.setVisibility(0);
                this.f82069z2.start();
            }
        }
        View view2 = this.f72690f3;
        if (view2 == null) {
            AbstractC19074t.m100223u("mRootView");
            return null;
        }
        return view2;
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView, com.zing.zalo.adapters.C7153n7.a
    /* renamed from: P */
    public void mo36377P(ContactProfile contactProfile) {
        int i11;
        boolean z11;
        try {
            AbstractC2379w.m12430d(this.f82011Z0);
            this.f81956C2 = false;
            if (contactProfile != null) {
                m87572HO(contactProfile);
                if (this.f81994T1.containsKey(contactProfile.f42434r)) {
                    this.f81994T1.clear();
                    this.f81988R1.clear();
                } else {
                    this.f81994T1.clear();
                    this.f81988R1.clear();
                    Map map = this.f81994T1;
                    AbstractC19074t.m100207e(map, "mapSelectItem");
                    map.put(contactProfile.f42434r, contactProfile);
                    this.f81988R1.add(new InviteContactProfile(contactProfile));
                }
                this.f81984Q0.f39125w = "";
                this.f81990S0.m35846M(this.f81988R1);
                C7005a5 c7005a5 = this.f81990S0;
                if (c7005a5 != null) {
                    c7005a5.m10008p();
                }
                C7153n7 c7153n7 = this.f81984Q0;
                if (c7153n7 != null) {
                    c7153n7.m10008p();
                }
                String valueOf = String.valueOf(this.f82011Z0.getText());
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
                AbstractC23309i.m122620yl(!TextUtils.isEmpty(valueOf.subSequence(i12, length + 1).toString()));
            }
            if (this.f81994T1.isEmpty()) {
                if (this.f82017b1.isFocused()) {
                    AbstractC32232i.m155458f(this.f82017b1);
                }
                this.f81993T0.m75685a(false);
                if (this.f82069z2.isRunning()) {
                    this.f82069z2.cancel();
                }
                if (!this.f82067y2.isRunning() && this.f82068z1.getAlpha() > 0.0f) {
                    this.f82067y2.start();
                    return;
                }
                return;
            }
            AbstractC32232i.m155458f(this.f82017b1);
            if (!this.f82061v2) {
                if (this.f82067y2.isRunning()) {
                    this.f82067y2.cancel();
                }
                if (!this.f82069z2.isRunning()) {
                    if (this.f82068z1.getAlpha() != 1.0f || this.f82068z1.getVisibility() != 0) {
                        this.f82069z2.start();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView, com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        AbstractC23136l9.m118744r1(this.f88760a0, 8);
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView
    /* renamed from: lN */
    protected boolean mo78776lN() {
        RobotoTextView robotoTextView;
        if (!this.f82069z2.isRunning() && (robotoTextView = this.f82068z1) != null && (robotoTextView.getAlpha() != 1.0f || this.f82068z1.getVisibility() != 0)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView
    /* renamed from: mN */
    protected boolean mo78777mN() {
        RobotoTextView robotoTextView;
        if (!this.f82067y2.isRunning() && (robotoTextView = this.f82068z1) != null && robotoTextView.getAlpha() != 0.0f && this.f82068z1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.share.ShareView, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        super.onClick(view);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_close) {
            this.f72421L0.finish();
            AbstractC32232i.m155458f(this.f82017b1);
        } else if (id2 == AbstractC6918a0.btn_continue && this.f81988R1.size() > 0) {
            Object obj = this.f81988R1.get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            m78775rP((InviteContactProfile) obj, this.f72694j3);
        }
    }
}
