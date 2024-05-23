package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7167p;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ToolConvertPhoneNumberView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p716zh.C31901e8;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ToolConvertPhoneNumberView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x, C23744a.c {

    /* renamed from: w1 */
    static int f78473w1 = 0;

    /* renamed from: x1 */
    static boolean f78474x1 = false;

    /* renamed from: y1 */
    static boolean f78475y1 = false;

    /* renamed from: P0 */
    MultiStateView f78476P0;

    /* renamed from: Q0 */
    RecyclerView f78477Q0;

    /* renamed from: R0 */
    C7167p f78478R0;

    /* renamed from: V0 */
    View f78482V0;

    /* renamed from: W0 */
    CheckBox f78483W0;

    /* renamed from: X0 */
    TextView f78484X0;

    /* renamed from: Y0 */
    TextView f78485Y0;

    /* renamed from: Z0 */
    TextView f78486Z0;

    /* renamed from: a1 */
    TextView f78487a1;

    /* renamed from: b1 */
    TextView f78488b1;

    /* renamed from: c1 */
    TextView f78489c1;

    /* renamed from: d1 */
    TextView f78490d1;

    /* renamed from: e1 */
    View f78491e1;

    /* renamed from: f1 */
    View f78492f1;

    /* renamed from: g1 */
    View f78493g1;

    /* renamed from: h1 */
    View f78494h1;

    /* renamed from: v1 */
    C15215c f78508v1;

    /* renamed from: S0 */
    List f78479S0 = new ArrayList();

    /* renamed from: T0 */
    Map f78480T0 = new HashMap();

    /* renamed from: U0 */
    boolean f78481U0 = false;

    /* renamed from: i1 */
    boolean f78495i1 = false;

    /* renamed from: j1 */
    boolean f78496j1 = false;

    /* renamed from: k1 */
    boolean f78497k1 = false;

    /* renamed from: l1 */
    List f78498l1 = new ArrayList();

    /* renamed from: m1 */
    List f78499m1 = new ArrayList();

    /* renamed from: n1 */
    List f78500n1 = new ArrayList();

    /* renamed from: o1 */
    List f78501o1 = new ArrayList();

    /* renamed from: p1 */
    Handler f78502p1 = new Handler(Looper.getMainLooper());

    /* renamed from: q1 */
    boolean f78503q1 = false;

    /* renamed from: r1 */
    long f78504r1 = 0;

    /* renamed from: s1 */
    Map f78505s1 = new HashMap();

    /* renamed from: t1 */
    Map f78506t1 = new HashMap();

    /* renamed from: u1 */
    int f78507u1 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ToolConvertPhoneNumberView$a */
    /* loaded from: classes6.dex */
    public class C15213a implements InterfaceC20094a {
        C15213a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m85482f(JSONObject jSONObject) {
            ToolConvertPhoneNumberView.this.m85476MM(jSONObject.optJSONObject("data"));
            View view = ToolConvertPhoneNumberView.this.f78493g1;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m85483g(JSONObject jSONObject) {
            ToolConvertPhoneNumberView.this.m85476MM(jSONObject.optJSONObject("data"));
            View view = ToolConvertPhoneNumberView.this.f78493g1;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m85484h(C20096c c20096c) {
            try {
                String m104490b = c20096c.m104490b();
                if (!TextUtils.isEmpty(m104490b)) {
                    ToolConvertPhoneNumberView.this.m85476MM(new JSONObject(m104490b).optJSONObject("data"));
                }
                if (c20096c.m104491c() == 2250) {
                    ToolConvertPhoneNumberView.this.f78493g1.setVisibility(0);
                    return;
                }
                ToolConvertPhoneNumberView.this.f78493g1.setVisibility(8);
                ToolConvertPhoneNumberView toolConvertPhoneNumberView = ToolConvertPhoneNumberView.this;
                toolConvertPhoneNumberView.f78485Y0.setText(String.format(toolConvertPhoneNumberView.m92652XI(AbstractC8020f0.error_message_with_code), Integer.valueOf(c20096c.m104491c())));
                ToolConvertPhoneNumberView toolConvertPhoneNumberView2 = ToolConvertPhoneNumberView.this;
                toolConvertPhoneNumberView2.f78486Z0.setText(toolConvertPhoneNumberView2.m92652XI(AbstractC8020f0.str_retry));
                ToolConvertPhoneNumberView.this.f78492f1.setVisibility(0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            ToolConvertPhoneNumberView toolConvertPhoneNumberView = ToolConvertPhoneNumberView.this;
            toolConvertPhoneNumberView.f78503q1 = false;
            toolConvertPhoneNumberView.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.cv0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.C15213a.this.m85484h(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ToolConvertPhoneNumberView.this.f78503q1 = false;
            try {
                final JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.optInt("error_code", -1) == 0) {
                    JSONArray optJSONArray = jSONObject.optJSONObject("data").optJSONArray("list");
                    ToolConvertPhoneNumberView.this.f78498l1.clear();
                    ToolConvertPhoneNumberView.this.f78499m1.clear();
                    ToolConvertPhoneNumberView.this.f78500n1.clear();
                    ToolConvertPhoneNumberView.this.f78501o1.clear();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        String optString = optJSONObject.optString("old", "");
                        String optString2 = optJSONObject.optString("new", "");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            ToolConvertPhoneNumberView.this.f78498l1.add(optString);
                            ToolConvertPhoneNumberView.this.f78499m1.add(optString2);
                        }
                    }
                    for (int i12 = 0; i12 < ToolConvertPhoneNumberView.this.f78498l1.size(); i12++) {
                        ToolConvertPhoneNumberView.this.f78500n1.add("84" + ((String) ToolConvertPhoneNumberView.this.f78498l1.get(i12)).substring(1));
                        ToolConvertPhoneNumberView.this.f78501o1.add("+84" + ((String) ToolConvertPhoneNumberView.this.f78499m1.get(i12)).substring(1));
                    }
                }
                if (ToolConvertPhoneNumberView.this.f78498l1.isEmpty()) {
                    ToolConvertPhoneNumberView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.dv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ToolConvertPhoneNumberView.C15213a.this.m85482f(jSONObject);
                        }
                    });
                } else {
                    ToolConvertPhoneNumberView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ev0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ToolConvertPhoneNumberView.C15213a.this.m85483g(jSONObject);
                        }
                    });
                    ToolConvertPhoneNumberView.this.m85473JM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ToolConvertPhoneNumberView$b */
    /* loaded from: classes6.dex */
    public class C15214b extends C10866e {
        public C15214b(InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110076k);
                ZaloWebView.m87105iS(ToolConvertPhoneNumberView.this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110076k, bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ToolConvertPhoneNumberView$c */
    /* loaded from: classes6.dex */
    public static class C15215c extends KeyEventCallbackC17462c {

        /* renamed from: I */
        TextView f78511I;

        /* renamed from: J */
        View f78512J;

        /* renamed from: K */
        View f78513K;

        /* renamed from: L */
        ImageView f78514L;

        /* renamed from: M */
        String f78515M;

        /* renamed from: N */
        int f78516N;

        public C15215c(Context context) {
            this(context, AbstractC8915g0.Theme_Dialog_Translucent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public /* synthetic */ void m85486M(View view) {
            dismiss();
        }

        /* renamed from: N */
        public final void m85487N(int i11, String str) {
            ImageView imageView;
            try {
                this.f78516N = i11;
                this.f78515M = str;
                View view = this.f78513K;
                if (view != null && (imageView = this.f78514L) != null) {
                    if (i11 == 0) {
                        view.setVisibility(0);
                        this.f78514L.setVisibility(8);
                        this.f78512J.setOnClickListener(null);
                        m92874z(false);
                    } else {
                        if (i11 == 1) {
                            imageView.setImageResource(AbstractC16803z.icn_done);
                        } else if (i11 == 2) {
                            imageView.setImageResource(AbstractC16803z.icn_error);
                        }
                        this.f78513K.setVisibility(8);
                        this.f78514L.setVisibility(0);
                        m92874z(true);
                        this.f78512J.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.fv0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ToolConvertPhoneNumberView.C15215c.this.m85486M(view2);
                            }
                        });
                    }
                }
                TextView textView = this.f78511I;
                if (textView != null) {
                    textView.setText(this.f78515M);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: p */
        public void mo13765p(Bundle bundle) {
            super.mo13765p(bundle);
            m92850A(AbstractC7409c0.dialog_progress_convert_phone_number);
            this.f78512J = m92864h(AbstractC6918a0.dialog_content);
            this.f78511I = (TextView) m92864h(AbstractC6918a0.progress_dialog_msg);
            this.f78513K = m92864h(AbstractC6918a0.progress_loading);
            this.f78514L = (ImageView) m92864h(AbstractC6918a0.icon_state_convert_phone);
            m85487N(this.f78516N, this.f78515M);
        }

        public C15215c(Context context, int i11) {
            super(context, i11);
            this.f78515M = "";
            this.f78516N = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static /* synthetic */ void m85446AM(InterfaceC17463d interfaceC17463d) {
        C23744a.m124114c().m124116d(6095, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m85447BM() {
        try {
            C15215c c15215c = this.f78508v1;
            if (c15215c != null && c15215c.m92868m()) {
                this.f78508v1.dismiss();
            }
            if (this.f78481U0) {
                m85474KM(true);
                m85473JM();
            } else if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                if (this.f78496j1 && !this.f78498l1.isEmpty()) {
                    this.f78492f1.setVisibility(8);
                    m85474KM(true);
                    m85473JM();
                }
                this.f78492f1.setVisibility(8);
                m85474KM(true);
                m85478uM();
            }
            m85472IM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m85448CM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f78481U0) {
            AbstractC23647d.m123906p("30001971");
            AbstractC23647d.m123893c();
        } else {
            AbstractC23647d.m123906p("30001941");
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m85449DM() {
        int i11;
        try {
            C15215c c15215c = new C15215c(this.f72421L0.getContext());
            this.f78508v1 = c15215c;
            if (this.f78481U0) {
                i11 = AbstractC8020f0.str_msg_loadding_restore_phone;
            } else {
                i11 = AbstractC8020f0.str_msg_loadding_convert_phone;
            }
            c15215c.m85487N(0, AbstractC23136l9.m118743r0(i11));
            this.f78508v1.mo13822K();
            m85477tM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m85450EM(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f78481U0) {
            AbstractC23647d.m123906p("30001972");
            AbstractC23647d.m123893c();
        } else {
            if (AbstractC23057e7.m118297d()) {
                AbstractC23647d.m123906p("3000194201");
                AbstractC23647d.m123893c();
            } else {
                AbstractC23647d.m123906p("3000194202");
                AbstractC23647d.m123893c();
            }
            if (this.f78480T0.size() <= 10) {
                AbstractC23647d.m123906p("300019421");
                AbstractC23647d.m123893c();
            } else if (this.f78480T0.size() <= 50) {
                AbstractC23647d.m123906p("300019422");
                AbstractC23647d.m123893c();
            } else {
                AbstractC23647d.m123906p("300019423");
                AbstractC23647d.m123893c();
            }
        }
        if (this.f78481U0) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        f78473w1 = i12;
        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.yu0
            @Override // java.lang.Runnable
            public final void run() {
                ToolConvertPhoneNumberView.this.m85449DM();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m85451FM() {
        try {
            if (this.f78483W0.isChecked()) {
                for (C31901e8 c31901e8 : this.f78479S0) {
                    this.f78480T0.put(Long.valueOf(c31901e8.m153294g()), c31901e8);
                }
            }
            List list = this.f78479S0;
            if (list != null) {
                this.f78478R0.m36457O(list);
            }
            m85474KM(false);
            if (!this.f78481U0 && this.f78495i1 && this.f78479S0.isEmpty()) {
                this.f78494h1.setVisibility(0);
                this.f78491e1.setVisibility(8);
            } else {
                if (!this.f78481U0) {
                    this.f78491e1.setVisibility(0);
                }
                this.f78494h1.setVisibility(8);
            }
            m85472IM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m85452GM(SensitiveData sensitiveData) {
        try {
            this.f78479S0 = new ArrayList();
            this.f78505s1.clear();
            this.f78506t1.clear();
            char c11 = '+';
            char c12 = '|';
            if (this.f78481U0) {
                String m121521V7 = AbstractC23309i.m121521V7();
                if (!TextUtils.isEmpty(m121521V7)) {
                    try {
                        JSONArray jSONArray = new JSONArray(m121521V7);
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                            long optLong = optJSONObject.optLong("id");
                            arrayList.add(Long.valueOf(optLong));
                            this.f78506t1.put(Long.valueOf(optLong), optJSONObject.optString("number"));
                        }
                        for (C31901e8 c31901e8 : AbstractC23028c0.m118094n(arrayList, sensitiveData)) {
                            String str = (String) this.f78506t1.get(Long.valueOf(c31901e8.m153294g()));
                            c31901e8.f146559u = str;
                            c31901e8.f146560v = str;
                            c31901e8.f146561w = c31901e8.m153297j();
                            c31901e8.f146563y = 0;
                            c31901e8.f146562x = 0;
                            String str2 = c31901e8.m153295h() + '|' + c31901e8.m153297j();
                            if (this.f78505s1.containsKey(str2)) {
                                ((List) this.f78505s1.get(str2)).add(c31901e8);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c31901e8);
                                this.f78505s1.put(str2, arrayList2);
                                this.f78479S0.add(c31901e8);
                            }
                            String m118082b = AbstractC23028c0.m118082b(c31901e8.f146559u);
                            String m118082b2 = AbstractC23028c0.m118082b(c31901e8.m153297j());
                            if (m118082b.startsWith("84") && m118082b.length() == 12) {
                                char[] charArray = m118082b.toCharArray();
                                if (charArray.length == 12) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append('+');
                                    sb2.append(charArray[0]);
                                    sb2.append(charArray[1]);
                                    sb2.append(' ');
                                    sb2.append(charArray[2]);
                                    sb2.append(charArray[3]);
                                    sb2.append(charArray[4]);
                                    sb2.append(' ');
                                    sb2.append(charArray[5]);
                                    sb2.append(charArray[6]);
                                    sb2.append(charArray[7]);
                                    sb2.append(' ');
                                    sb2.append(charArray[8]);
                                    sb2.append(charArray[9]);
                                    sb2.append(charArray[10]);
                                    sb2.append(charArray[11]);
                                    c31901e8.f146560v = sb2.toString();
                                }
                                c31901e8.f146563y = 7;
                                char[] charArray2 = m118082b2.toCharArray();
                                if (charArray2.length == 11) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append('+');
                                    sb3.append(charArray2[0]);
                                    sb3.append(charArray2[1]);
                                    sb3.append(' ');
                                    sb3.append(charArray2[2]);
                                    sb3.append(charArray2[3]);
                                    sb3.append(' ');
                                    sb3.append(charArray2[4]);
                                    sb3.append(charArray2[5]);
                                    sb3.append(charArray2[6]);
                                    sb3.append(' ');
                                    sb3.append(charArray2[7]);
                                    sb3.append(charArray2[8]);
                                    sb3.append(charArray2[9]);
                                    sb3.append(charArray2[10]);
                                    c31901e8.f146561w = sb3.toString();
                                    c31901e8.f146562x = 6;
                                } else {
                                    c31901e8.f146562x = 5;
                                }
                            } else {
                                char[] charArray3 = m118082b.toCharArray();
                                if (charArray3.length == 11) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(charArray3[0]);
                                    sb4.append(charArray3[1]);
                                    sb4.append(charArray3[2]);
                                    sb4.append(charArray3[3]);
                                    sb4.append(' ');
                                    sb4.append(charArray3[4]);
                                    sb4.append(charArray3[5]);
                                    sb4.append(charArray3[6]);
                                    sb4.append(' ');
                                    sb4.append(charArray3[7]);
                                    sb4.append(charArray3[8]);
                                    sb4.append(charArray3[9]);
                                    sb4.append(charArray3[10]);
                                    c31901e8.f146560v = sb4.toString();
                                }
                                c31901e8.f146563y = 4;
                                char[] charArray4 = m118082b2.toCharArray();
                                if (charArray4.length == 10) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(charArray4[0]);
                                    sb5.append(charArray4[1]);
                                    sb5.append(charArray4[2]);
                                    sb5.append(' ');
                                    sb5.append(charArray4[3]);
                                    sb5.append(charArray4[4]);
                                    sb5.append(charArray4[5]);
                                    sb5.append(' ');
                                    sb5.append(charArray4[6]);
                                    sb5.append(charArray4[7]);
                                    sb5.append(charArray4[8]);
                                    sb5.append(charArray4[9]);
                                    c31901e8.f146561w = sb5.toString();
                                }
                                c31901e8.f146562x = 3;
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            } else {
                List<C31901e8> m118093m = AbstractC23028c0.m118093m(sensitiveData);
                if (m118093m != null) {
                    for (C31901e8 c31901e82 : m118093m) {
                        String m118285k = AbstractC23056e6.m118285k(c31901e82.m153297j());
                        if (!TextUtils.isEmpty(m118285k) && !m118285k.equals(AbstractC23056e6.f112062a)) {
                            String m118082b3 = AbstractC23028c0.m118082b(c31901e82.m153297j());
                            if (m118082b3.startsWith("84") && m118082b3.length() == 12) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= this.f78500n1.size()) {
                                        break;
                                    }
                                    if (m118082b3.startsWith((String) this.f78500n1.get(i12))) {
                                        c31901e82.f146559u = m118082b3.replaceFirst((String) this.f78500n1.get(i12), (String) this.f78501o1.get(i12));
                                        c31901e82.f146561w = c31901e82.m153297j();
                                        c31901e82.f146560v = c31901e82.f146559u;
                                        c31901e82.f146563y = 0;
                                        c31901e82.f146562x = 0;
                                        String str3 = c31901e82.m153295h() + c12 + c31901e82.f146559u;
                                        if (this.f78505s1.containsKey(str3)) {
                                            ((List) this.f78505s1.get(str3)).add(c31901e82);
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add(c31901e82);
                                            this.f78505s1.put(str3, arrayList3);
                                            this.f78479S0.add(c31901e82);
                                        }
                                        char[] charArray5 = m118082b3.toCharArray();
                                        if (charArray5.length == 12) {
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(c11);
                                            sb6.append(charArray5[0]);
                                            sb6.append(charArray5[1]);
                                            sb6.append(' ');
                                            sb6.append(charArray5[2]);
                                            sb6.append(charArray5[3]);
                                            sb6.append(charArray5[4]);
                                            sb6.append(' ');
                                            sb6.append(charArray5[5]);
                                            sb6.append(charArray5[6]);
                                            sb6.append(charArray5[7]);
                                            sb6.append(' ');
                                            sb6.append(charArray5[8]);
                                            sb6.append(charArray5[9]);
                                            sb6.append(charArray5[10]);
                                            sb6.append(charArray5[11]);
                                            c31901e82.f146561w = sb6.toString();
                                        }
                                        c31901e82.f146562x = 7;
                                        char[] charArray6 = c31901e82.f146559u.toCharArray();
                                        if (charArray6.length == 12) {
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append(charArray6[0]);
                                            sb7.append(charArray6[1]);
                                            sb7.append(charArray6[2]);
                                            sb7.append(' ');
                                            sb7.append(charArray6[3]);
                                            sb7.append(charArray6[4]);
                                            sb7.append(' ');
                                            sb7.append(charArray6[5]);
                                            sb7.append(charArray6[6]);
                                            sb7.append(charArray6[7]);
                                            sb7.append(' ');
                                            sb7.append(charArray6[8]);
                                            sb7.append(charArray6[9]);
                                            sb7.append(charArray6[10]);
                                            sb7.append(charArray6[11]);
                                            c31901e82.f146560v = sb7.toString();
                                        }
                                        c31901e82.f146563y = 6;
                                    } else {
                                        i12++;
                                    }
                                }
                            } else if (m118082b3.length() == 11) {
                                int i13 = 0;
                                while (i13 < this.f78498l1.size()) {
                                    if (m118082b3.startsWith((String) this.f78498l1.get(i13))) {
                                        c31901e82.f146559u = m118082b3.replaceFirst((String) this.f78498l1.get(i13), (String) this.f78499m1.get(i13));
                                        c31901e82.f146561w = c31901e82.m153297j();
                                        c31901e82.f146560v = c31901e82.f146559u;
                                        c31901e82.f146563y = 0;
                                        c31901e82.f146562x = 0;
                                        String str4 = c31901e82.m153295h() + c12 + c31901e82.f146559u;
                                        if (this.f78505s1.containsKey(str4)) {
                                            ((List) this.f78505s1.get(str4)).add(c31901e82);
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            arrayList4.add(c31901e82);
                                            this.f78505s1.put(str4, arrayList4);
                                            this.f78479S0.add(c31901e82);
                                        }
                                        char[] charArray7 = m118082b3.toCharArray();
                                        if (charArray7.length == 11) {
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append(charArray7[0]);
                                            sb8.append(charArray7[1]);
                                            sb8.append(charArray7[2]);
                                            sb8.append(charArray7[3]);
                                            sb8.append(' ');
                                            sb8.append(charArray7[4]);
                                            sb8.append(charArray7[5]);
                                            sb8.append(charArray7[6]);
                                            sb8.append(' ');
                                            sb8.append(charArray7[7]);
                                            sb8.append(charArray7[8]);
                                            sb8.append(charArray7[9]);
                                            sb8.append(charArray7[10]);
                                            c31901e82.f146561w = sb8.toString();
                                        }
                                        c31901e82.f146562x = 4;
                                        char[] charArray8 = c31901e82.f146559u.toCharArray();
                                        if (charArray8.length == 10) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append(charArray8[0]);
                                            sb9.append(charArray8[1]);
                                            sb9.append(charArray8[2]);
                                            sb9.append(' ');
                                            sb9.append(charArray8[3]);
                                            sb9.append(charArray8[4]);
                                            sb9.append(charArray8[5]);
                                            sb9.append(' ');
                                            sb9.append(charArray8[6]);
                                            sb9.append(charArray8[7]);
                                            sb9.append(charArray8[8]);
                                            sb9.append(charArray8[9]);
                                            c31901e82.f146560v = sb9.toString();
                                        }
                                        c31901e82.f146563y = 3;
                                        c11 = '+';
                                        c12 = '|';
                                    } else {
                                        i13++;
                                        c12 = '|';
                                    }
                                }
                            } else {
                                c11 = '+';
                                c12 = '|';
                            }
                            c11 = '+';
                            c12 = '|';
                        }
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xu0
            @Override // java.lang.Runnable
            public final void run() {
                ToolConvertPhoneNumberView.this.m85451FM();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m85453HM(RecyclerView recyclerView, int i11, View view) {
        try {
            C7167p c7167p = this.f78478R0;
            if (c7167p != null) {
                C31901e8 m36454L = c7167p.m36454L(i11);
                if (this.f78480T0.containsKey(Long.valueOf(m36454L.m153294g()))) {
                    this.f78480T0.remove(Long.valueOf(m36454L.m153294g()));
                    this.f78483W0.setChecked(false);
                } else {
                    this.f78480T0.put(Long.valueOf(m36454L.m153294g()), m36454L);
                    if (this.f78480T0.size() == this.f78479S0.size()) {
                        this.f78483W0.setChecked(true);
                    }
                }
                m85472IM();
                this.f78478R0.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m85467vM() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        C15215c c15215c = this.f78508v1;
        if (c15215c != null && c15215c.m92868m()) {
            this.f78508v1.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.qu0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    ToolConvertPhoneNumberView.m85446AM(interfaceC17463d);
                }
            });
            this.f78508v1.dismiss();
        } else {
            C23744a.m124114c().m124116d(6095, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0001, B:6:0x000e, B:7:0x0022, B:9:0x0028, B:11:0x0057, B:12:0x006a, B:14:0x0070, B:21:0x0084, B:24:0x00a4, B:17:0x00af, B:28:0x00bd, B:29:0x00cc, B:31:0x00d2, B:33:0x0205, B:35:0x0219, B:36:0x021c, B:40:0x00ef, B:44:0x0106, B:45:0x010d, B:46:0x011a, B:48:0x0120, B:51:0x0136, B:54:0x014c, B:57:0x015a, B:64:0x015e, B:65:0x0167, B:67:0x016d, B:69:0x0197, B:70:0x01aa, B:72:0x01b0, B:79:0x01c4, B:82:0x01e2, B:75:0x01ed, B:92:0x0100, B:89:0x00f9), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0001, B:6:0x000e, B:7:0x0022, B:9:0x0028, B:11:0x0057, B:12:0x006a, B:14:0x0070, B:21:0x0084, B:24:0x00a4, B:17:0x00af, B:28:0x00bd, B:29:0x00cc, B:31:0x00d2, B:33:0x0205, B:35:0x0219, B:36:0x021c, B:40:0x00ef, B:44:0x0106, B:45:0x010d, B:46:0x011a, B:48:0x0120, B:51:0x0136, B:54:0x014c, B:57:0x015a, B:64:0x015e, B:65:0x0167, B:67:0x016d, B:69:0x0197, B:70:0x01aa, B:72:0x01b0, B:79:0x01c4, B:82:0x01e2, B:75:0x01ed, B:92:0x0100, B:89:0x00f9), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d A[Catch: Exception -> 0x0054, LOOP:4: B:65:0x0167->B:67:0x016d, LOOP_END, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0001, B:6:0x000e, B:7:0x0022, B:9:0x0028, B:11:0x0057, B:12:0x006a, B:14:0x0070, B:21:0x0084, B:24:0x00a4, B:17:0x00af, B:28:0x00bd, B:29:0x00cc, B:31:0x00d2, B:33:0x0205, B:35:0x0219, B:36:0x021c, B:40:0x00ef, B:44:0x0106, B:45:0x010d, B:46:0x011a, B:48:0x0120, B:51:0x0136, B:54:0x014c, B:57:0x015a, B:64:0x015e, B:65:0x0167, B:67:0x016d, B:69:0x0197, B:70:0x01aa, B:72:0x01b0, B:79:0x01c4, B:82:0x01e2, B:75:0x01ed, B:92:0x0100, B:89:0x00f9), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0001, B:6:0x000e, B:7:0x0022, B:9:0x0028, B:11:0x0057, B:12:0x006a, B:14:0x0070, B:21:0x0084, B:24:0x00a4, B:17:0x00af, B:28:0x00bd, B:29:0x00cc, B:31:0x00d2, B:33:0x0205, B:35:0x0219, B:36:0x021c, B:40:0x00ef, B:44:0x0106, B:45:0x010d, B:46:0x011a, B:48:0x0120, B:51:0x0136, B:54:0x014c, B:57:0x015a, B:64:0x015e, B:65:0x0167, B:67:0x016d, B:69:0x0197, B:70:0x01aa, B:72:0x01b0, B:79:0x01c4, B:82:0x01e2, B:75:0x01ed, B:92:0x0100, B:89:0x00f9), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* renamed from: wM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m85468wM(SensitiveData sensitiveData, SensitiveData sensitiveData2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        try {
            this.f78507u1 = 0;
            if (this.f78481U0) {
                ArrayList<C31901e8> arrayList = new ArrayList(this.f78480T0.values());
                ArrayList<C31901e8> arrayList2 = new ArrayList();
                for (C31901e8 c31901e8 : arrayList) {
                    arrayList2.addAll((List) this.f78505s1.get(c31901e8.m153295h() + '|' + c31901e8.m153297j()));
                }
                Map m2354k = AbstractC0852x.m2354k(this.f72421L0.getContext(), arrayList2, sensitiveData);
                HashMap hashMap = new HashMap();
                for (C31901e8 c31901e82 : arrayList2) {
                    if (m2354k.containsKey(Long.valueOf(c31901e82.m153294g()))) {
                        String str = c31901e82.m153295h() + '|' + c31901e82.m153297j();
                        if (!hashMap.containsKey(str)) {
                            this.f78507u1++;
                            hashMap.put(str, Boolean.TRUE);
                        }
                    } else {
                        this.f78506t1.remove(Long.valueOf(c31901e82.m153294g()));
                    }
                }
                jSONArray3 = new JSONArray();
                for (Map.Entry entry : this.f78506t1.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", entry.getKey());
                    jSONObject.put("number", entry.getValue());
                    jSONArray3.put(jSONObject);
                }
            } else {
                String m121521V7 = AbstractC23309i.m121521V7();
                if (!TextUtils.isEmpty(m121521V7)) {
                    try {
                        jSONArray = new JSONArray(m121521V7);
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    if (jSONArray != null) {
                        jSONArray2 = new JSONArray();
                    } else {
                        jSONArray2 = jSONArray;
                    }
                    List<C31901e8> m118093m = AbstractC23028c0.m118093m(sensitiveData2);
                    ArrayList<C31901e8> arrayList3 = new ArrayList();
                    for (C31901e8 c31901e83 : m118093m) {
                        if (this.f78480T0.containsKey(Long.valueOf(c31901e83.m153294g()))) {
                            C31901e8 c31901e84 = (C31901e8) this.f78480T0.get(Long.valueOf(c31901e83.m153294g()));
                            if (c31901e83.m153297j() != null && c31901e83.m153297j().equals(c31901e84.m153297j())) {
                                arrayList3.add(c31901e84);
                            }
                        }
                    }
                    ArrayList<C31901e8> arrayList4 = new ArrayList();
                    for (C31901e8 c31901e85 : arrayList3) {
                        arrayList4.addAll((List) this.f78505s1.get(c31901e85.m153295h() + '|' + c31901e85.f146559u));
                    }
                    Map m2354k2 = AbstractC0852x.m2354k(this.f72421L0.getContext(), arrayList4, sensitiveData);
                    HashMap hashMap2 = new HashMap();
                    for (C31901e8 c31901e86 : arrayList4) {
                        if (m2354k2.containsKey(Long.valueOf(c31901e86.m153294g()))) {
                            String str2 = c31901e86.m153295h() + '|' + c31901e86.f146559u;
                            if (!hashMap2.containsKey(str2)) {
                                this.f78507u1++;
                                hashMap2.put(str2, Boolean.TRUE);
                            }
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("id", c31901e86.m153294g());
                            jSONObject2.put("number", c31901e86.m153297j());
                            jSONArray2.put(jSONObject2);
                        }
                    }
                    jSONArray3 = jSONArray2;
                }
                jSONArray = null;
                if (jSONArray != null) {
                }
                List<C31901e8> m118093m2 = AbstractC23028c0.m118093m(sensitiveData2);
                ArrayList<C31901e8> arrayList32 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList<C31901e8> arrayList42 = new ArrayList();
                while (r7.hasNext()) {
                }
                Map m2354k22 = AbstractC0852x.m2354k(this.f72421L0.getContext(), arrayList42, sensitiveData);
                HashMap hashMap22 = new HashMap();
                while (r6.hasNext()) {
                }
                jSONArray3 = jSONArray2;
            }
            this.f78480T0.clear();
            AbstractC23309i.m122553ws(jSONArray3.toString());
            this.f78495i1 = true;
            if (AbstractC23057e7.m118297d()) {
                AbstractC0852x.m2340Q(sensitiveData2);
            }
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.av0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.this.m85471zM();
                }
            });
        } catch (Exception e12) {
            e12.printStackTrace();
            f78473w1 = 0;
            this.f78502p1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.bv0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.this.m85467vM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static /* synthetic */ void m85469xM(InterfaceC17463d interfaceC17463d) {
        C23744a.m124114c().m124116d(6095, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m85470yM() {
        C15215c c15215c = this.f78508v1;
        if (c15215c != null && c15215c.m92868m()) {
            this.f78508v1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0014, B:9:0x0018, B:11:0x002b, B:13:0x0039, B:15:0x003e, B:16:0x008d, B:18:0x0095, B:19:0x009a, B:20:0x00f8, B:24:0x0058, B:25:0x0072, B:27:0x0076, B:28:0x0082, B:29:0x001e, B:31:0x0010, B:33:0x00a7, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:39:0x00b9, B:40:0x00ed, B:41:0x00b6, B:42:0x00bd, B:44:0x00c1, B:45:0x00ea, B:46:0x00d6), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0014, B:9:0x0018, B:11:0x002b, B:13:0x0039, B:15:0x003e, B:16:0x008d, B:18:0x0095, B:19:0x009a, B:20:0x00f8, B:24:0x0058, B:25:0x0072, B:27:0x0076, B:28:0x0082, B:29:0x001e, B:31:0x0010, B:33:0x00a7, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:39:0x00b9, B:40:0x00ed, B:41:0x00b6, B:42:0x00bd, B:44:0x00c1, B:45:0x00ea, B:46:0x00d6), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0014, B:9:0x0018, B:11:0x002b, B:13:0x0039, B:15:0x003e, B:16:0x008d, B:18:0x0095, B:19:0x009a, B:20:0x00f8, B:24:0x0058, B:25:0x0072, B:27:0x0076, B:28:0x0082, B:29:0x001e, B:31:0x0010, B:33:0x00a7, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:39:0x00b9, B:40:0x00ed, B:41:0x00b6, B:42:0x00bd, B:44:0x00c1, B:45:0x00ea, B:46:0x00d6), top: B:1:0x0000 }] */
    /* renamed from: zM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m85471zM() {
        String format;
        int i11;
        C15215c c15215c;
        try {
            boolean z11 = this.f78481U0;
            if (z11) {
                if (!f78475y1) {
                }
                c15215c = this.f78508v1;
                if (c15215c != null || !c15215c.m92868m()) {
                    this.f78508v1 = new C15215c(this.f72421L0.getContext());
                }
                this.f78508v1.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.ru0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        ToolConvertPhoneNumberView.m85469xM(interfaceC17463d);
                    }
                });
                if (this.f78507u1 <= 0) {
                    if (this.f78481U0) {
                        this.f78508v1.m85487N(2, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_restore_phone_error), Integer.valueOf(this.f78507u1)));
                    } else {
                        this.f78508v1.m85487N(2, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_convert_phone_error), Integer.valueOf(this.f78507u1)));
                    }
                } else if (this.f78481U0) {
                    this.f78508v1.m85487N(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_restore_phone_done));
                } else {
                    this.f78508v1.m85487N(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_convert_phone_done));
                }
                if (!this.f78508v1.m92868m()) {
                    this.f78508v1.mo13822K();
                }
                this.f78502p1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.su0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ToolConvertPhoneNumberView.this.m85470yM();
                    }
                }, 2000L);
                f78473w1 = 0;
            }
            if (z11 || !f78474x1) {
                if (this.f78507u1 == 0) {
                    if (f78473w1 == 1) {
                        i11 = AbstractC8020f0.str_msg_convert_phone_done;
                    } else {
                        i11 = AbstractC8020f0.str_msg_restore_phone_done;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                } else {
                    if (f78473w1 == 1) {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_convert_phone_error), Integer.valueOf(this.f78507u1));
                    } else {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_restore_phone_error), Integer.valueOf(this.f78507u1));
                    }
                    ToastUtils.showMess(format);
                }
                C23744a.m124114c().m124116d(6095, new Object[0]);
                f78473w1 = 0;
            }
            c15215c = this.f78508v1;
            if (c15215c != null) {
            }
            this.f78508v1 = new C15215c(this.f72421L0.getContext());
            this.f78508v1.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.ru0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    ToolConvertPhoneNumberView.m85469xM(interfaceC17463d);
                }
            });
            if (this.f78507u1 <= 0) {
            }
            if (!this.f78508v1.m92868m()) {
            }
            this.f78502p1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.su0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.this.m85470yM();
                }
            }, 2000L);
            f78473w1 = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72421L0.m92637BK(true);
        if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().getBoolean("EXTRA_IS_REVERT", false)) {
            this.f78481U0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        String format;
        String m118743r02;
        if (i11 != 1) {
            return null;
        }
        try {
            if (this.f78481U0) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_confirm_restore_phone);
                format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_confirm_restore_phone), Integer.valueOf(this.f78480T0.size()));
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43842ok);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_confirm_convert_phone);
                format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_confirm_convert_phone), Integer.valueOf(this.f78480T0.size()));
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.confirm);
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43172u(m118743r0).m43162k(format).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.uu0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ToolConvertPhoneNumberView.this.m85448CM(interfaceC17463d, i12);
                }
            }).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.vu0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ToolConvertPhoneNumberView.this.m85450EM(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        if (!this.f78481U0 && AbstractC23309i.m121754bg()) {
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            Context context = getContext();
            int i11 = AbstractC8020f0.str_header_restore_phone_number;
            m92738e.m92774j(AbstractC23136l9.m118724l(context, i11, i11));
        }
        m85472IM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.tool_convert_phone_number_view, viewGroup, false);
        m85475LM(inflate);
        return inflate;
    }

    /* renamed from: IM */
    void m85472IM() {
        try {
            this.f78484X0.setEnabled(!this.f78480T0.isEmpty());
            if (this.f78479S0.isEmpty()) {
                this.f88760a0.setSubtitle(null);
            } else {
                this.f88760a0.setSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f78480T0.size())));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.m124114c().m124117e(this, 6095);
    }

    /* renamed from: JM */
    public void m85473JM() {
        if (!C8937j0.m47663l("phonebook_convert_11_scan")) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_phonebook_block_title));
            return;
        }
        final SensitiveData sensitiveData = new SensitiveData("phonebook_convert_11_scan", "phonebook_convert_11");
        this.f78497k1 = true;
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.tu0
            @Override // java.lang.Runnable
            public final void run() {
                ToolConvertPhoneNumberView.this.m85452GM(sensitiveData);
            }
        });
    }

    /* renamed from: KM */
    void m85474KM(boolean z11) {
        try {
            if (z11) {
                this.f78476P0.setVisibility(0);
                this.f78476P0.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                C7167p c7167p = this.f78478R0;
                if (c7167p != null && c7167p.mo10003k() > 0) {
                    this.f78478R0.m10008p();
                    this.f78482V0.setVisibility(0);
                    this.f78492f1.setVisibility(8);
                    this.f78476P0.setVisibility(8);
                } else {
                    this.f78482V0.setVisibility(8);
                    this.f78476P0.setVisibility(0);
                    this.f78476P0.setState(MultiStateView.EnumC15914e.EMPTY);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    void m85475LM(View view) {
        try {
            this.f78476P0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.recycle_view);
            this.f78477Q0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
            C7167p c7167p = new C7167p(this.f72421L0.getContext(), this.f78480T0);
            this.f78478R0 = c7167p;
            this.f78477Q0.setAdapter(c7167p);
            C31784b.m152808a(this.f78477Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.wu0
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView2, int i11, View view2) {
                    ToolConvertPhoneNumberView.this.m85453HM(recyclerView2, i11, view2);
                }
            });
            CheckBox checkBox = (CheckBox) view.findViewById(AbstractC6918a0.checkboxAll);
            this.f78483W0 = checkBox;
            checkBox.setOnClickListener(this);
            view.findViewById(AbstractC6918a0.tv_select_all).setOnClickListener(this);
            this.f78484X0 = (TextView) view.findViewById(AbstractC6918a0.btnConvert);
            this.f78485Y0 = (TextView) view.findViewById(AbstractC6918a0.tvError);
            this.f78484X0.setOnClickListener(this);
            this.f78482V0 = view.findViewById(AbstractC6918a0.layout_select_all);
            if (this.f78481U0) {
                this.f78484X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_restore_phone_number));
                this.f78483W0.setChecked(false);
            } else {
                this.f78484X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_convert_phone_number));
                this.f78483W0.setChecked(true);
            }
            this.f78491e1 = view.findViewById(AbstractC6918a0.layoutHint);
            this.f78492f1 = view.findViewById(AbstractC6918a0.layoutError);
            this.f78486Z0 = (TextView) view.findViewById(AbstractC6918a0.btnReload);
            this.f78493g1 = view.findViewById(AbstractC6918a0.layoutNotSupport);
            this.f78494h1 = view.findViewById(AbstractC6918a0.layoutSuccess);
            this.f78487a1 = (TextView) view.findViewById(AbstractC6918a0.tvTitleSuccess);
            this.f78488b1 = (TextView) view.findViewById(AbstractC6918a0.tvContentSuccess);
            this.f78489c1 = (TextView) view.findViewById(AbstractC6918a0.tvHintConvertPhone);
            this.f78490d1 = (TextView) view.findViewById(AbstractC6918a0.tvNotSupport);
            if (this.f78481U0) {
                this.f78489c1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_restore_phone_number));
                this.f78476P0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_restore_phone_number));
                this.f78491e1.setVisibility(0);
            } else {
                this.f78476P0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_convert_phone_number));
                this.f78491e1.setVisibility(8);
            }
            this.f78486Z0.setOnClickListener(this);
            m85474KM(true);
            Context m92648SI = this.f72421L0.m92648SI();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                this.f78485Y0.setText(m92652XI(AbstractC8020f0.str_content_dialog_permission_convert_phone));
                this.f78486Z0.setText(m92652XI(AbstractC8020f0.str_bt_reload));
                this.f78492f1.setVisibility(0);
                AbstractC23034c6.m118184v0(this, strArr, 108);
            }
            C23744a.m124114c().m124115b(this, 6095);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    void m85476MM(JSONObject jSONObject) {
        try {
            if (!this.f78481U0 && jSONObject != null) {
                this.f78491e1.setVisibility(0);
                this.f78476P0.setEmptyViewString(jSONObject.optString("emptySubtitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_convert_phone_number)));
                this.f78487a1.setText(jSONObject.optString("doneTitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_convert_phone_done)));
                this.f78488b1.setText(jSONObject.optString("doneSubtitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_convert_phone_number_success)));
                this.f78490d1.setText(jSONObject.optString("promoteSubtitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_convert_phone_number_not_support)));
                String str = jSONObject.optString("message", AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_convert_phone_number)) + " ";
                SpannableString spannableString = new SpannableString(str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_see_more_convert_phone_number));
                spannableString.setSpan(new C15214b(this.f72421L0.m92676n2(), str.length(), spannableString.length()), str.length(), spannableString.length(), 33);
                this.f78489c1.setMovementMethod(CustomMovementMethod.m56305e());
                this.f78489c1.setText(spannableString);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        int i12;
        try {
            if (i11 == AbstractC8020f0.str_header_restore_phone_number) {
                int i13 = f78473w1;
                if (i13 != 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("EXTRA_IS_REVERT", true);
                    this.f72421L0.m92662fJ().m93069k2(ToolRestorePhoneNumberView.class, bundle, 1, true);
                    AbstractC23647d.m123906p("3000195");
                    AbstractC23647d.m123893c();
                } else {
                    if (i13 == 1) {
                        i12 = AbstractC8020f0.str_msg_loadding_convert_phone;
                    } else {
                        i12 = AbstractC8020f0.str_msg_loadding_restore_phone;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(i12));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                if (this.f78481U0) {
                    this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_restore_phone_number));
                } else {
                    this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_convert_phone_number));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            if (this.f78481U0) {
                f78475y1 = false;
            } else {
                f78474x1 = false;
            }
            C15215c c15215c = this.f78508v1;
            if (c15215c != null && c15215c.m92868m()) {
                this.f78508v1.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolConvertPhoneNumberView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i11;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btnReload) {
                Context m92648SI = this.f72421L0.m92648SI();
                String[] strArr = AbstractC23034c6.f112032i;
                if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                    AbstractC23034c6.m118184v0(this, strArr, 108);
                    return;
                }
                View view2 = this.f78492f1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                if (this.f78481U0) {
                    m85473JM();
                    return;
                } else {
                    m85478uM();
                    return;
                }
            }
            if (id2 == AbstractC6918a0.tv_select_all) {
                this.f78483W0.setChecked(!r11.isChecked());
                if (System.currentTimeMillis() > this.f78504r1) {
                    this.f78504r1 = System.currentTimeMillis() + 200;
                    this.f78480T0.clear();
                    if (this.f78483W0.isChecked()) {
                        for (C31901e8 c31901e8 : this.f78479S0) {
                            this.f78480T0.put(Long.valueOf(c31901e8.m153294g()), c31901e8);
                        }
                    }
                    C7167p c7167p = this.f78478R0;
                    if (c7167p != null) {
                        c7167p.m10008p();
                    }
                    m85472IM();
                    if (this.f78481U0 && this.f78483W0.isChecked()) {
                        AbstractC23647d.m123906p("3000196");
                        AbstractC23647d.m123893c();
                        return;
                    } else {
                        if (!this.f78481U0 && !this.f78483W0.isChecked()) {
                            AbstractC23647d.m123906p("3000193");
                            AbstractC23647d.m123893c();
                            return;
                        }
                        return;
                    }
                }
                this.f78483W0.setChecked(!r11.isChecked());
                return;
            }
            if (id2 == AbstractC6918a0.checkboxAll) {
                if (System.currentTimeMillis() > this.f78504r1) {
                    this.f78504r1 = System.currentTimeMillis() + 200;
                    this.f78480T0.clear();
                    if (this.f78483W0.isChecked()) {
                        for (C31901e8 c31901e82 : this.f78479S0) {
                            this.f78480T0.put(Long.valueOf(c31901e82.m153294g()), c31901e82);
                        }
                    }
                    C7167p c7167p2 = this.f78478R0;
                    if (c7167p2 != null) {
                        c7167p2.m10008p();
                    }
                    m85472IM();
                    if (this.f78481U0 && this.f78483W0.isChecked()) {
                        AbstractC23647d.m123906p("3000196");
                        AbstractC23647d.m123893c();
                        return;
                    } else {
                        if (!this.f78481U0 && !this.f78483W0.isChecked()) {
                            AbstractC23647d.m123906p("3000193");
                            AbstractC23647d.m123893c();
                            return;
                        }
                        return;
                    }
                }
                this.f78483W0.setChecked(!r11.isChecked());
                return;
            }
            if (id2 == AbstractC6918a0.btnConvert && System.currentTimeMillis() > this.f78504r1) {
                this.f78504r1 = System.currentTimeMillis() + 200;
                int i12 = f78473w1;
                if (i12 == 0) {
                    this.f72421L0.showDialog(1);
                    if (this.f78481U0) {
                        AbstractC23647d.m123906p("3000197");
                        AbstractC23647d.m123893c();
                        return;
                    } else {
                        AbstractC23647d.m123906p("3000194");
                        AbstractC23647d.m123893c();
                        return;
                    }
                }
                if (i12 == 1) {
                    i11 = AbstractC8020f0.str_msg_loadding_convert_phone;
                } else {
                    i11 = AbstractC8020f0.str_msg_loadding_restore_phone;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 108 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
            View view = this.f78492f1;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.f78481U0) {
                m85473JM();
            } else {
                m85478uM();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        C15215c c15215c;
        super.onResume();
        try {
            if (this.f78481U0) {
                f78475y1 = true;
                if (f78473w1 == 2) {
                    C15215c c15215c2 = this.f78508v1;
                    if (c15215c2 != null) {
                        if (!c15215c2.m92868m()) {
                        }
                    }
                    C15215c c15215c3 = new C15215c(this.f72421L0.getContext());
                    this.f78508v1 = c15215c3;
                    c15215c3.m85487N(0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_loadding_restore_phone));
                    this.f78508v1.mo13822K();
                }
            } else {
                f78474x1 = true;
                if (f78473w1 == 1 && ((c15215c = this.f78508v1) == null || !c15215c.m92868m())) {
                    C15215c c15215c4 = new C15215c(this.f72421L0.getContext());
                    this.f78508v1 = c15215c4;
                    c15215c4.m85487N(0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_loadding_convert_phone));
                    this.f78508v1.mo13822K();
                }
            }
            if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                if (this.f78481U0) {
                    this.f78492f1.setVisibility(8);
                    m85474KM(true);
                    m85473JM();
                    return;
                }
                if (this.f78496j1 && !this.f78498l1.isEmpty()) {
                    if (!this.f78497k1) {
                        this.f78492f1.setVisibility(8);
                        m85474KM(true);
                        m85473JM();
                        return;
                    }
                    return;
                }
                this.f78492f1.setVisibility(8);
                m85474KM(true);
                m85478uM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m85477tM() {
        final SensitiveData sensitiveData = new SensitiveData("phonebook_convert_11_scan", "phonebook_convert_11");
        if (!C8937j0.m47663l(sensitiveData.m35528c())) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_phonebook_block_title));
            return;
        }
        final SensitiveData sensitiveData2 = new SensitiveData("phonebook_convert_11_update", "phonebook_convert_11");
        if (!C8937j0.m47663l(sensitiveData2.m35528c())) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_phonebook_block_title));
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.zu0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.this.m85468wM(sensitiveData2, sensitiveData);
                }
            });
        }
    }

    /* renamed from: uM */
    void m85478uM() {
        if (this.f78503q1) {
            return;
        }
        this.f78503q1 = true;
        this.f78496j1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15213a());
        c0766k.mo1795za();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6095) {
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.pu0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolConvertPhoneNumberView.this.m85447BM();
                }
            });
        }
    }
}
