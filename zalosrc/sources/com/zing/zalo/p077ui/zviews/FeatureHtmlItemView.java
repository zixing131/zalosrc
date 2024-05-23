package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.webview.C16792j;
import com.zing.zalo.zview.C17487o0;
import ho0.AbstractC20110a;
import jf0.C21238a;
import jf0.C21242e;
import me0.AbstractC23152n3;
import me0.C23177p6;
import me0.C23278z2;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18613b;
import p140ev.C18618g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class FeatureHtmlItemView extends LinearLayout implements View.OnClickListener {

    /* renamed from: A */
    ImageView f73239A;

    /* renamed from: B */
    InterfaceC27218a f73240B;

    /* renamed from: C */
    C17487o0 f73241C;

    /* renamed from: D */
    C23528a f73242D;

    /* renamed from: p */
    C21238a f73243p;

    /* renamed from: q */
    C18613b f73244q;

    /* renamed from: r */
    View f73245r;

    /* renamed from: s */
    View f73246s;

    /* renamed from: t */
    View f73247t;

    /* renamed from: u */
    RecyclingImageView f73248u;

    /* renamed from: v */
    RobotoTextView f73249v;

    /* renamed from: w */
    RobotoTextView f73250w;

    /* renamed from: x */
    View f73251x;

    /* renamed from: y */
    View f73252y;

    /* renamed from: z */
    RecyclingImageView f73253z;

    /* renamed from: com.zing.zalo.ui.zviews.FeatureHtmlItemView$a */
    /* loaded from: classes6.dex */
    class C14251a extends C23999j {
        C14251a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null) {
                try {
                    FeatureHtmlItemView.this.f73248u.setImageInfo(c3979l);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public FeatureHtmlItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73244q = new C18613b(1);
    }

    /* renamed from: a */
    public void m79492a(InterfaceC27218a interfaceC27218a, C21238a c21238a) {
        C17487o0 c17487o0;
        try {
            this.f73240B = interfaceC27218a;
            this.f73242D = new C23528a(getContext());
            if (interfaceC27218a != null) {
                c17487o0 = interfaceC27218a.mo35579p();
            } else {
                c17487o0 = null;
            }
            this.f73241C = c17487o0;
            this.f73243p = c21238a;
            if (c21238a == null) {
                setVisibility(8);
                return;
            }
            this.f73244q = new C18613b(this.f73243p.f103521b);
            if (C21242e.m110039d() != null && !TextUtils.isEmpty(this.f73243p.f103522c)) {
                ((C23528a) this.f73242D.m123612r(this.f73248u)).m123579C(this.f73243p.f103522c, C23278z2.m120143n(), new C14251a());
            }
            if (!TextUtils.isEmpty(this.f73243p.f103523d)) {
                this.f73249v.setText(this.f73243p.f103523d);
            }
            C21242e.m110039d().f103530b.set(false);
            m79504m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    void m79493b() {
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93602u;
        if (c18613b.equals(c18613b2) && this.f73241C != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FEATURE_ID", c18613b2);
            bundle.putString("EXTRA_SOURCE_PARAM", "");
            bundle.putInt("EXTRA_SOURCE_LINK", 262);
            if (C23177p6.m119386c().m119391d(this.f73244q) != null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                bundle.putString("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
            }
            bundle.putBoolean("MORE_TAB_VIEW_CLASS", true);
            this.f73241C.m93066i2(ZaloWebView.class, bundle, 205, 1, true);
        }
    }

    /* renamed from: c */
    void m79494c() {
        if (this.f73241C != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FEATURE_ID", this.f73244q);
            bundle.putString("EXTRA_SOURCE_PARAM", "");
            bundle.putInt("EXTRA_SOURCE_LINK", 262);
            if (C23177p6.m119386c().m119391d(this.f73244q) != null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                bundle.putString("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
            }
            bundle.putBoolean("MORE_TAB_VIEW_CLASS", true);
            this.f73241C.m93066i2(ZaloWebView.class, bundle, 205, 1, true);
        }
    }

    /* renamed from: d */
    void m79495d() {
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93600s;
        if (!c18613b.equals(c18613b2)) {
            return;
        }
        AbstractC23647d.m123907q("5500", "");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FEATURE_ID", c18613b2);
        int i11 = 130;
        if (C23177p6.m119386c().m119391d(this.f73244q) != null) {
            if (C23177p6.m119386c().m119391d(this.f73244q).f112369b > 0) {
                intent.putExtra("extra_zapp_id", C23177p6.m119386c().m119391d(this.f73244q).f112369b);
                i11 = 132;
            }
            if (C23177p6.m119386c().m119391d(this.f73244q).f112370c > 0) {
                intent.putExtra("extra_news_id", C23177p6.m119386c().m119391d(this.f73244q).f112370c);
                i11 = 133;
            }
            if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                intent.putExtra("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
            }
        }
        intent.putExtra("EXTRA_SOURCE_LINK", i11);
        if (this.f73241C != null) {
            intent.putExtra("MORE_TAB_VIEW_CLASS", true);
            this.f73241C.m93066i2(ZaloWebView.class, intent.getExtras(), 202, 1, true);
        }
        AbstractC23647d.m123893c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(6:7|(1:36)(2:11|(1:13))|14|(6:24|(1:28)|29|30|31|32)(3:18|(1:20)|21)|22|23)|37|14|(1:16)|24|(2:26|28)|29|30|31|32|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012b, code lost:            r1 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012c, code lost:            ho0.AbstractC20110a.m104539h(r1);     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m79496e() {
        int i11;
        Intent intent;
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93601t;
        if (!c18613b.equals(c18613b2)) {
            return;
        }
        AbstractC23647d.m123907q("1300", "");
        if (C23177p6.m119386c().m119391d(this.f73244q) != null) {
            if (TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112368a) && TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                if (C23177p6.m119386c().m119391d(this.f73244q).f112374g > 0) {
                    i11 = 253;
                }
            } else {
                i11 = 254;
            }
            if (C23177p6.m119386c().m119391d(this.f73244q) == null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112368a)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("MORE_TAB_VIEW_CLASS", true);
                if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                    bundle.putString("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
                }
                AbstractC23152n3.m119068s0(this.f73240B, Integer.parseInt(C23177p6.m119386c().m119391d(this.f73244q).f112368a), C23177p6.m119386c().m119391d(this.f73244q).f112371d, i11, "", bundle, 203, 0);
            } else {
                intent = new Intent();
                intent.putExtra("EXTRA_FEATURE_ID", c18613b2);
                intent.putExtra("SOURCE_ACTION", "1300");
                if (C23177p6.m119386c().m119391d(this.f73244q) != null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
                    intent.putExtra("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
                }
                intent.putExtra("EXTRA_SOURCE_LINK", i11);
                intent.putExtra("MORE_TAB_VIEW_CLASS", true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_source", 0);
                intent.putExtra("extra_param_info", jSONObject.toString());
                this.f73241C.m93066i2(ZaloWebView.class, intent.getExtras(), 203, 1, true);
            }
            AbstractC23647d.m123893c();
        }
        i11 = 252;
        if (C23177p6.m119386c().m119391d(this.f73244q) == null) {
        }
        intent = new Intent();
        intent.putExtra("EXTRA_FEATURE_ID", c18613b2);
        intent.putExtra("SOURCE_ACTION", "1300");
        if (C23177p6.m119386c().m119391d(this.f73244q) != null) {
            intent.putExtra("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
        }
        intent.putExtra("EXTRA_SOURCE_LINK", i11);
        intent.putExtra("MORE_TAB_VIEW_CLASS", true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open_source", 0);
        intent.putExtra("extra_param_info", jSONObject2.toString());
        this.f73241C.m93066i2(ZaloWebView.class, intent.getExtras(), 203, 1, true);
        AbstractC23647d.m123893c();
    }

    /* renamed from: f */
    void m79497f() {
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93599r;
        if (!c18613b.equals(c18613b2)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FEATURE_ID", c18613b2);
        intent.putExtra("EXTRA_SOURCE_LINK", 262);
        if (C23177p6.m119386c().m119391d(this.f73244q) != null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
            intent.putExtra("EXTRA_WEB_URL", C23177p6.m119386c().m119391d(this.f73244q).f112371d);
        }
        if (this.f73241C != null) {
            intent.putExtra("MORE_TAB_VIEW_CLASS", true);
            this.f73241C.m93066i2(ZaloWebView.class, intent.getExtras(), 204, 1, true);
        }
    }

    /* renamed from: g */
    public C18618g m79498g() {
        if (C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
            return null;
        }
        int m98348a = this.f73244q.m98348a();
        if (m98348a != 2) {
            if (m98348a != 3) {
                if (m98348a != 4) {
                    if (m98348a != 5) {
                        return m79500i();
                    }
                    return m79499h();
                }
                return m79502k();
            }
            return m79501j();
        }
        return m79503l();
    }

    public C18613b getFeatureId() {
        return this.f73244q;
    }

    /* renamed from: h */
    C18618g m79499h() {
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93602u;
        if (!c18613b.equals(c18613b2) || C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            return null;
        }
        return new C18618g(c18613b2, C23177p6.m119386c().m119391d(c18613b2).f112371d, "", C16792j.m89700i().m89702b(c18613b2), C16792j.m89700i().m89701a(c18613b2), 262, "");
    }

    /* renamed from: i */
    C18618g m79500i() {
        if (C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112371d)) {
            return null;
        }
        return new C18618g(this.f73244q, C23177p6.m119386c().m119391d(this.f73244q).f112371d, "", C16792j.m89700i().m89702b(this.f73244q), C16792j.m89700i().m89701a(this.f73244q), 262, "");
    }

    /* renamed from: j */
    C18618g m79501j() {
        int i11;
        int i12;
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93600s;
        if (!c18613b.equals(c18613b2) || C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            return null;
        }
        Intent intent = new Intent();
        if (C23177p6.m119386c().m119391d(c18613b2).f112369b > 0) {
            intent.putExtra("extra_zapp_id", C23177p6.m119386c().m119391d(c18613b2).f112369b);
            i11 = 132;
        } else {
            i11 = 130;
        }
        if (C23177p6.m119386c().m119391d(c18613b2).f112370c > 0) {
            intent.putExtra("extra_news_id", C23177p6.m119386c().m119391d(c18613b2).f112370c);
            i12 = 133;
        } else {
            i12 = i11;
        }
        if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            intent.putExtra("PATH", C23177p6.m119386c().m119391d(c18613b2).f112371d);
        }
        intent.putExtra("EXTRA_SOURCE_LINK", i12);
        String m86651XN = WebBaseView.m86651XN(c18613b2, intent.getExtras(), "");
        return new C18618g(c18613b2, C23177p6.m119386c().m119391d(c18613b2).f112371d, m86651XN, C16792j.m89700i().m89702b(c18613b2), C16792j.m89700i().m89701a(c18613b2), i12, m86651XN);
    }

    /* renamed from: k */
    C18618g m79502k() {
        int i11;
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93601t;
        if (!c18613b.equals(c18613b2) || C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            return null;
        }
        if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            i11 = 254;
        } else if (C23177p6.m119386c().m119391d(c18613b2).f112374g > 0) {
            i11 = 253;
        } else {
            i11 = 252;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_LINK", i11);
        bundle.putSerializable("EXTRA_FEATURE_ID", c18613b2);
        if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112368a)) {
            bundle.putInt("extra_cate_id", Integer.parseInt(C23177p6.m119386c().m119391d(c18613b2).f112368a));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_source", 0);
            bundle.putString("extra_param_info", jSONObject.toString());
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        C18613b c18613b3 = C18613b.f93601t;
        String m86651XN = WebBaseView.m86651XN(c18613b3, bundle, "");
        return new C18618g(c18613b3, C23177p6.m119386c().m119391d(c18613b3).f112371d, m86651XN, C16792j.m89700i().m89702b(c18613b3), C16792j.m89700i().m89701a(c18613b3), i11, m86651XN);
    }

    /* renamed from: l */
    C18618g m79503l() {
        C18613b c18613b = this.f73244q;
        C18613b c18613b2 = C18613b.f93599r;
        if (!c18613b.equals(c18613b2) || C23177p6.m119386c().m119391d(this.f73244q) == null || TextUtils.isEmpty(C23177p6.m119386c().m119391d(c18613b2).f112371d)) {
            return null;
        }
        return new C18618g(c18613b2, C23177p6.m119386c().m119391d(c18613b2).f112371d, "", C16792j.m89700i().m89702b(c18613b2), C16792j.m89700i().m89701a(c18613b2), 262, "");
    }

    /* renamed from: m */
    public void m79504m() {
        this.f73244q.m98348a();
        if (C23177p6.m119386c().m119391d(this.f73244q) == null) {
            return;
        }
        if (!C23177p6.m119386c().m119391d(this.f73244q).m119398b()) {
            this.f73251x.setVisibility(8);
            this.f73252y.setVisibility(8);
            this.f73250w.setText("");
            this.f73250w.setVisibility(4);
            return;
        }
        if (C23177p6.m119386c().m119391d(this.f73244q) != null && !TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112372e)) {
            this.f73250w.setText(C23177p6.m119386c().m119391d(this.f73244q).f112372e);
            this.f73250w.setVisibility(0);
        } else {
            this.f73250w.setText("");
            this.f73250w.setVisibility(4);
        }
        if (C23177p6.m119386c().m119391d(this.f73244q).f112374g > 0) {
            if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112373f)) {
                this.f73251x.setVisibility(8);
                this.f73252y.setVisibility(0);
                this.f73239A.setVisibility(0);
                this.f73253z.setVisibility(0);
                ((C23528a) this.f73242D.m123612r(this.f73253z)).m123618x(C23177p6.m119386c().m119391d(this.f73244q).f112373f, C23278z2.m120137l());
                return;
            }
            this.f73251x.setVisibility(0);
            this.f73252y.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(C23177p6.m119386c().m119391d(this.f73244q).f112373f)) {
            this.f73251x.setVisibility(8);
            this.f73252y.setVisibility(0);
            this.f73239A.setVisibility(8);
            this.f73253z.setVisibility(0);
            ((C23528a) this.f73242D.m123612r(this.f73253z)).m123618x(C23177p6.m119386c().m119391d(this.f73244q).f112373f, C23278z2.m120137l());
            return;
        }
        this.f73251x.setVisibility(8);
        this.f73252y.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f73244q.equals(C18613b.f93599r)) {
            m79497f();
        } else if (this.f73244q.equals(C18613b.f93601t)) {
            m79496e();
        } else if (this.f73244q.equals(C18613b.f93600s)) {
            m79495d();
        } else if (this.f73244q.equals(C18613b.f93602u)) {
            m79493b();
        } else {
            m79494c();
        }
        C23177p6.m119386c().m119392e(this.f73244q);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f73245r = findViewById(AbstractC6918a0.feature_html_item_container);
        this.f73246s = findViewById(AbstractC6918a0.moretab_item_separate_line);
        this.f73247t = findViewById(AbstractC6918a0.moretab_item_container);
        this.f73248u = (RecyclingImageView) findViewById(AbstractC6918a0.moretab_item_icon);
        this.f73249v = (RobotoTextView) findViewById(AbstractC6918a0.moretab_item_tv_title);
        this.f73250w = (RobotoTextView) findViewById(AbstractC6918a0.moretab_item_tv_description);
        this.f73251x = findViewById(AbstractC6918a0.moretab_item_view_new_notify);
        this.f73252y = findViewById(AbstractC6918a0.moretab_item_layout_notify_container);
        this.f73253z = (RecyclingImageView) findViewById(AbstractC6918a0.moretab_item_img_notify);
        this.f73239A = (ImageView) findViewById(AbstractC6918a0.moretab_item_reddot_img);
        setOnClickListener(this);
    }

    public FeatureHtmlItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f73244q = new C18613b(1);
    }
}
