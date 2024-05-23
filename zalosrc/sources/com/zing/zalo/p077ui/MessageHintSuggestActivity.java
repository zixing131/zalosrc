package com.zing.zalo.p077ui;

import ac.C0697c0;
import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0906d0;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.AbstractC2351i;
import c30.C3237e;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7096i5;
import com.zing.zalo.adapters.C7240v6;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.MessageHintSuggestActivity;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.widget.ViewPagerFakeDragFixed;
import com.zing.zalo.p077ui.widget.recyclerview.CustomRecyclerView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fi.C18953k;
import g30.AbstractC19215a;
import gi.EnumC19450c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p683yj.C30997b;
import p716zh.C31901e8;
import p716zh.C31902e9;
import p716zh.C31917f9;
import p716zh.C31986k3;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28203u6;
import xd0.C29599o;

/* loaded from: classes5.dex */
public class MessageHintSuggestActivity extends BaseZaloActivity implements TextWatcher {

    /* renamed from: H0 */
    static ArrayList f55266H0 = new ArrayList();

    /* renamed from: I0 */
    static MessageHintSuggestActivity f55267I0 = null;

    /* renamed from: J0 */
    static boolean f55268J0 = false;

    /* renamed from: D0 */
    private C18953k f55272D0;

    /* renamed from: i0 */
    EditText f55276i0;

    /* renamed from: j0 */
    ImageButton f55277j0;

    /* renamed from: k0 */
    AppCompatImageView f55278k0;

    /* renamed from: l0 */
    C23528a f55279l0;

    /* renamed from: m0 */
    C10946c f55280m0;

    /* renamed from: n0 */
    ViewPagerFakeDragFixed f55281n0;

    /* renamed from: o0 */
    SlidingTabLayout f55282o0;

    /* renamed from: p0 */
    LinearLayout f55283p0;

    /* renamed from: q0 */
    LinearLayout f55284q0;

    /* renamed from: r0 */
    TextView f55285r0;

    /* renamed from: t0 */
    CustomRecyclerView f55287t0;

    /* renamed from: u0 */
    LinearLayoutManager f55288u0;

    /* renamed from: v0 */
    C11815a f55289v0;

    /* renamed from: w0 */
    C7240v6 f55290w0;

    /* renamed from: z0 */
    C7096i5 f55293z0;

    /* renamed from: s0 */
    boolean f55286s0 = false;

    /* renamed from: x0 */
    int f55291x0 = 0;

    /* renamed from: y0 */
    int f55292y0 = 0;

    /* renamed from: A0 */
    int f55269A0 = 1;

    /* renamed from: B0 */
    boolean f55270B0 = false;

    /* renamed from: C0 */
    boolean f55271C0 = false;

    /* renamed from: E0 */
    private final C29599o f55273E0 = AbstractC23306f.m120694n1();

    /* renamed from: F0 */
    long f55274F0 = 0;

    /* renamed from: G0 */
    long f55275G0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessageHintSuggestActivity$a */
    /* loaded from: classes5.dex */
    public class C10944a extends ViewPager.C6879n {
        C10944a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            MessageHintSuggestActivity.this.f55292y0 = i11;
            try {
                ArrayList arrayList = MessageHintSuggestActivity.f55266H0;
                if (arrayList != null) {
                    ContentMessagePopup contentMessagePopup = (ContentMessagePopup) arrayList.get(i11);
                    C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), contentMessagePopup.f42526x);
                    String str = contentMessagePopup.f42519q;
                    if (m2800f != null && !TextUtils.isEmpty(m2800f.m153295h())) {
                        str = m2800f.m153295h();
                    }
                    MessageHintSuggestActivity messageHintSuggestActivity = MessageHintSuggestActivity.this;
                    messageHintSuggestActivity.f55285r0.setText(String.format(messageHintSuggestActivity.getString(AbstractC8020f0.hint_popup_suggest_friend), str));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessageHintSuggestActivity$b */
    /* loaded from: classes5.dex */
    public class C10945b implements C11815a.g {
        C10945b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: I2 */
        public void mo56865I2(C31902e9 c31902e9) {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: a */
        public boolean mo56866a() {
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: b */
        public void mo56867b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: c */
        public void mo56868c() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: d */
        public void mo56869d(C31902e9 c31902e9, int i11, int i12, int i13) {
            if (c31902e9 != null) {
                try {
                    if (c31902e9.m153321m() != null) {
                        MessageHintSuggestActivity.this.m56858M5(c31902e9.m153321m());
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: e */
        public void mo56870e() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: f */
        public void mo56871f(C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a) {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: i3 */
        public void mo56872i3(C31902e9 c31902e9) {
        }
    }

    /* renamed from: com.zing.zalo.ui.MessageHintSuggestActivity$c */
    /* loaded from: classes5.dex */
    class C10946c extends BroadcastReceiver {
        public C10946c(Context context) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.ui.MessageHintSuggestActivityIntent");
            AbstractC2351i.m12327a(context, this, intentFilter, true);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction()) && intent.getAction().equals("com.zing.zalo.ui.MessageHintSuggestActivityIntent")) {
                try {
                    ArrayList arrayList = MessageHintSuggestActivity.f55266H0;
                    if (arrayList != null && arrayList.size() > 0) {
                        MessageHintSuggestActivity.this.f55291x0 = MessageHintSuggestActivity.f55266H0.size();
                        MessageHintSuggestActivity messageHintSuggestActivity = MessageHintSuggestActivity.this;
                        if (!messageHintSuggestActivity.f55270B0) {
                            messageHintSuggestActivity.f55292y0 = messageHintSuggestActivity.f55291x0 - 1;
                        }
                        messageHintSuggestActivity.f55293z0.m36177y(MessageHintSuggestActivity.f55266H0);
                        MessageHintSuggestActivity messageHintSuggestActivity2 = MessageHintSuggestActivity.this;
                        messageHintSuggestActivity2.f55281n0.setAdapter(messageHintSuggestActivity2.f55293z0);
                        MessageHintSuggestActivity messageHintSuggestActivity3 = MessageHintSuggestActivity.this;
                        messageHintSuggestActivity3.f55281n0.setCurrentItem(messageHintSuggestActivity3.f55292y0);
                        MessageHintSuggestActivity.this.f55282o0.m75891d();
                        MessageHintSuggestActivity.this.f55282o0.getTabStrip().m75896b(MessageHintSuggestActivity.this.f55292y0);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: E5 */
    private void m56834E5() {
        String str;
        ArrayList arrayList;
        int i11;
        try {
            EditText editText = this.f55276i0;
            if (editText == null) {
                str = "";
            } else {
                str = editText.getText().toString().trim();
            }
            if (!TextUtils.isEmpty(str) && (arrayList = f55266H0) != null && !arrayList.isEmpty() && (i11 = this.f55292y0) >= 0 && i11 < f55266H0.size()) {
                String str2 = ((ContentMessagePopup) f55266H0.get(this.f55292y0)).f42518p;
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str2, CoreUtility.f89233i), 0).m95382r(str).m95365a();
                m95365a.m94951M9();
                if (C28203u6.f131407a.m141809c(str2) != null) {
                    this.f55273E0.m101500a(new C29599o.a(str2, m95365a));
                    C28023b6.m141250h0().m141293J(str2);
                    m56864v4(false);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R5 */
    public static void m56835R5(boolean z11) {
        f55268J0 = z11;
    }

    /* renamed from: V4 */
    public static boolean m56837V4() {
        return f55268J0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a5 */
    public /* synthetic */ void m56840a5(List list) {
        int i11;
        if (((C31902e9) list.get(0)).m153322n() == 4) {
            i11 = 7;
        } else if (!m56860O4(list) && !m56859N4(list)) {
            i11 = 2;
        } else {
            i11 = 5;
        }
        if (this.f55290w0 == null) {
            this.f55290w0 = new C7240v6();
        }
        this.f55290w0.m36957l(i11);
        this.f55287t0.m9816A(this.f55290w0);
        this.f55287t0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f55288u0.m9723C2(0);
        this.f55288u0.mo9756v1(0);
        this.f55287t0.setLayoutManager(this.f55288u0);
        this.f55289v0.m65705w0(list);
        this.f55287t0.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d5 */
    public /* synthetic */ void m56841d5(int i11, C31917f9 c31917f9) {
        if (c31917f9 != null) {
            try {
                if (c31917f9.f146629a.size() > 0) {
                    final List m99380A = this.f55272D0.m99380A(EnumC19450c.f96561x, new ArrayList(c31917f9.f146629a));
                    runOnUiThread(new Runnable() { // from class: h40.x0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageHintSuggestActivity.this.m56840a5(m99380A);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public /* synthetic */ void m56843e5(View view) {
        AbstractC23647d.m123907q("16200", "");
        m56864v4(true);
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5 */
    public /* synthetic */ void m56844i5() {
        try {
            Rect rect = new Rect();
            AppCompatImageView appCompatImageView = this.f55278k0;
            appCompatImageView.getHitRect(rect);
            rect.top -= 20;
            rect.bottom += 20;
            rect.left -= 20;
            rect.right += 20;
            TouchDelegate touchDelegate = new TouchDelegate(rect, appCompatImageView);
            if (View.class.isInstance(appCompatImageView.getParent())) {
                ((View) appCompatImageView.getParent()).setTouchDelegate(touchDelegate);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public /* synthetic */ void m56846o5(View view, boolean z11) {
        this.f55270B0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public /* synthetic */ void m56847s5(View view) {
        try {
            AbstractC23647d.m123907q("16300", "");
            int i11 = this.f55269A0;
            if (i11 == 2) {
                m56834E5();
            } else if (i11 == 1) {
                this.f55283p0.setVisibility(0);
                if (!this.f55286s0) {
                    this.f55285r0.setVisibility(0);
                }
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u5 */
    public /* synthetic */ void m56850u5(int i11) {
        int i12;
        try {
            String str = ((ContentMessagePopup) f55266H0.get(this.f55292y0)).f42518p;
            if (!AbstractC25495a.m132079d(str) && System.currentTimeMillis() - this.f55274F0 >= 12000 && System.currentTimeMillis() - this.f55275G0 >= 3000) {
                this.f55274F0 = System.currentTimeMillis();
                C0766k c0766k = new C0766k();
                if (AbstractC21935u.m114518H(str)) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                c0766k.mo1573X7(str, i11, i12, C31986k3.f147083a.m154105P1(str));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y4 */
    public static MessageHintSuggestActivity m56851y4() {
        return f55267I0;
    }

    /* renamed from: z4 */
    public static ArrayList m56852z4() {
        return f55266H0;
    }

    /* renamed from: B5 */
    public void m56853B5(String str) {
        try {
            C30997b m99403g0 = this.f55272D0.m99403g0(str, C18953k.m99327D0(str), C18953k.m99323B(null));
            if (m99403g0 != null) {
                m56855F4(m99403g0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D5 */
    void m56854D5() {
        this.f55274F0 = 0L;
        this.f55275G0 = System.currentTimeMillis();
    }

    /* renamed from: F4 */
    public synchronized void m56855F4(C30997b c30997b) {
        if (c30997b != null) {
            try {
                if (!TextUtils.isEmpty(c30997b.m150661e())) {
                    new C3237e(c30997b, false, C18953k.m99323B(null), new C3237e.a() { // from class: h40.w0
                        @Override // c30.C3237e.a
                        /* renamed from: a */
                        public final void mo16447a(int i11, C31917f9 c31917f9) {
                            MessageHintSuggestActivity.this.m56841d5(i11, c31917f9);
                        }
                    }).start();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: H4 */
    void m56856H4(String str) {
        try {
            if (this.f55287t0 == null) {
                this.f55288u0 = new NoPredictiveItemAnimLinearLayoutMngr(this);
                CustomRecyclerView customRecyclerView = new CustomRecyclerView(getContext());
                this.f55287t0 = customRecyclerView;
                customRecyclerView.setId(AbstractC6918a0.search_inline_listview);
                this.f55287t0.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.suggest_sticker_bg_color));
                this.f55287t0.setItemAnimator(null);
                this.f55287t0.setLayoutAnimation(null);
                this.f55288u0.m9723C2(0);
                this.f55287t0.setLayoutManager(this.f55288u0);
                this.f55287t0.setOverScrollMode(2);
                C11815a c11815a = new C11815a(getContext(), 0, new C10945b(), C28020b3.f130648a.m141208y("SUGGEST_VIEW_", this));
                this.f55289v0 = c11815a;
                this.f55287t0.setAdapter(c11815a);
                View view = new View(getContext());
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, 1));
                view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor));
                this.f55284q0.addView(view);
                this.f55284q0.addView(this.f55287t0, new LinearLayout.LayoutParams(-1, -2));
                m56853B5(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H5 */
    void m56857H5(final int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: h40.r0
            @Override // java.lang.Runnable
            public final void run() {
                MessageHintSuggestActivity.this.m56850u5(i11);
            }
        });
    }

    /* renamed from: M5 */
    public void m56858M5(C25630b c25630b) {
        ArrayList arrayList;
        int i11;
        try {
            if (c25630b.m132400H() && (arrayList = f55266H0) != null && !arrayList.isEmpty() && (i11 = this.f55292y0) >= 0 && i11 < f55266H0.size()) {
                String str = ((ContentMessagePopup) f55266H0.get(this.f55292y0)).f42518p;
                String str2 = CoreUtility.f89233i;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    m56854D5();
                    if (C28203u6.f131407a.m141809c(str) != null) {
                        AbstractC23112j7.m118530g0(str, c25630b, null, "chat_send");
                        C28023b6.m141250h0().m141293J(str);
                        m56864v4(false);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N4 */
    boolean m56859N4(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            if (((C31902e9) list.get(i11)).m153322n() != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O4 */
    boolean m56860O4(List list) {
        if (list != null && list.size() > 1) {
            int m153322n = ((C31902e9) list.get(0)).m153322n();
            for (int i11 = 1; i11 < list.size() - 1; i11++) {
                if (((C31902e9) list.get(i11)).m153322n() != m153322n) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: S5 */
    void m56861S5() {
        if (this.f55276i0 != null) {
            try {
                int i11 = this.f55269A0;
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f55277j0.setImageResource(AbstractC16803z.btn_send_normal);
                    }
                } else {
                    this.f55277j0.setImageResource(AbstractC16803z.btn_send_disable);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Vf */
    void m56862Vf() {
        try {
            this.f55276i0.setVisibility(0);
            this.f55276i0.requestFocus();
            this.f55269A0 = 2;
            this.f55277j0.setImageResource(AbstractC16803z.btn_send_normal);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            if (!this.f55276i0.getText().toString().trim().equals("")) {
                m56857H5(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119599f(getContext(), true, AbstractC8915g0.ThemeDefault_TranslucentDark, AbstractC8915g0.ThemeDefault_TranslucentLight);
    }

    /* renamed from: oi */
    void m56863oi() {
        try {
            this.f55276i0.setVisibility(0);
            this.f55276i0.requestFocus();
            this.f55269A0 = 1;
            this.f55277j0.setImageResource(AbstractC16803z.btn_send_disable);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (bundle == null) {
            try {
                AbstractC23647d.m123907q("16100", "");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        setContentView(LayoutInflater.from(this).inflate(AbstractC7409c0.popup_suggest_friend, (ViewGroup) null));
        this.f55271C0 = true;
        try {
            this.f55279l0 = new C23528a((Activity) this);
            f55267I0 = this;
            this.f55272D0 = C18953k.m99340R();
            if (f55266H0 == null) {
                f55266H0 = new ArrayList();
            }
            onNewIntent(getIntent());
            if (AbstractC23309i.m121564Wd()) {
                Window window = getWindow();
                window.addFlags(4718592);
                if (!((PowerManager) getSystemService("power")).isScreenOn()) {
                    window.addFlags(2097152);
                }
            }
        } catch (Exception unused) {
            m56864v4(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f55268J0 = false;
        ArrayList arrayList = f55266H0;
        if (arrayList != null) {
            arrayList.clear();
        }
        f55267I0 = null;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m56864v4(true);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        ContentMessagePopup contentMessagePopup;
        try {
            if (f55266H0 == null) {
                f55266H0 = new ArrayList();
            }
            int size = f55266H0.size();
            this.f55291x0 = size;
            if (size > 0 && !TextUtils.isEmpty(((ContentMessagePopup) f55266H0.get(size - 1)).f42518p)) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(AbstractC6918a0.btn_close_dialog);
                this.f55278k0 = appCompatImageView;
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: h40.s0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessageHintSuggestActivity.this.m56843e5(view);
                    }
                });
                ((LinearLayout) findViewById(AbstractC6918a0.msgpop_top)).post(new Runnable() { // from class: h40.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageHintSuggestActivity.this.m56844i5();
                    }
                });
                EditText editText = (EditText) findViewById(AbstractC6918a0.chatinput_text);
                this.f55276i0 = editText;
                editText.addTextChangedListener(this);
                this.f55276i0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: h40.u0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z11) {
                        MessageHintSuggestActivity.this.m56846o5(view, z11);
                    }
                });
                ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.chatinput_send);
                this.f55277j0 = imageButton;
                AbstractC23136l9.m118696b1(imageButton, AbstractC23136l9.m118718j(this));
                this.f55277j0.setImageDrawable(AbstractC23136l9.m118665N(this, AbstractC16803z.btn_chat_input_send));
                this.f55277j0.setOnClickListener(new View.OnClickListener() { // from class: h40.v0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessageHintSuggestActivity.this.m56847s5(view);
                    }
                });
                m56861S5();
                ViewPagerFakeDragFixed viewPagerFakeDragFixed = (ViewPagerFakeDragFixed) findViewById(AbstractC6918a0.viewpager);
                this.f55281n0 = viewPagerFakeDragFixed;
                viewPagerFakeDragFixed.setDrawingCacheEnabled(true);
                this.f55281n0.setAlwaysDrawnWithCacheEnabled(true);
                this.f55281n0.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
                int color = getResources().getColor(AbstractC16801x.circle_indicator_active);
                this.f55293z0 = new C7096i5(this, f55266H0, this.f55279l0);
                if (this.f55281n0.getAdapter() == null) {
                    this.f55281n0.setAdapter(this.f55293z0);
                    this.f55281n0.setCurrentItem(f55266H0.size() - 1);
                } else {
                    int i11 = this.f55292y0;
                    if (i11 >= 0 && i11 < f55266H0.size()) {
                        this.f55281n0.setAdapter(this.f55293z0);
                        this.f55281n0.setCurrentItem(this.f55292y0);
                    }
                }
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(AbstractC6918a0.sliding_tabs);
                this.f55282o0 = slidingTabLayout;
                slidingTabLayout.setViewPager(this.f55281n0);
                this.f55282o0.setSelectedIndicatorColors(color);
                this.f55282o0.setEnableDivider(true);
                this.f55282o0.setDividerColors(0);
                this.f55282o0.setOnPageChangeListener(new C10944a());
                if (this.f55271C0) {
                    this.f55271C0 = false;
                    int i12 = this.f55291x0;
                    if (i12 > 0) {
                        this.f55292y0 = i12 - 1;
                    }
                } else {
                    int i13 = this.f55291x0;
                    if (i13 > 0 && !this.f55270B0) {
                        this.f55292y0 = i13 - 1;
                    }
                }
                this.f55283p0 = (LinearLayout) findViewById(AbstractC6918a0.layoutQuickStickerContainer);
                this.f55284q0 = (LinearLayout) findViewById(AbstractC6918a0.layoutQuickSticker);
                this.f55285r0 = (TextView) findViewById(AbstractC6918a0.tvQuickStickerCover);
                try {
                    ArrayList arrayList = f55266H0;
                    if (arrayList != null && arrayList.size() > 0) {
                        ArrayList arrayList2 = f55266H0;
                        ContentMessagePopup contentMessagePopup2 = (ContentMessagePopup) arrayList2.get(arrayList2.size() - 1);
                        C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), contentMessagePopup2.f42526x);
                        String str = contentMessagePopup2.f42519q;
                        if (m2800f != null && !TextUtils.isEmpty(m2800f.m153295h())) {
                            str = m2800f.m153295h();
                        }
                        this.f55285r0.setText(String.format(getString(AbstractC8020f0.hint_popup_suggest_friend), str));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ArrayList arrayList3 = f55266H0;
                if (arrayList3 != null && !arrayList3.isEmpty() && (contentMessagePopup = (ContentMessagePopup) f55266H0.get(0)) != null && !TextUtils.isEmpty(contentMessagePopup.f42527y)) {
                    m56856H4(contentMessagePopup.f42527y);
                    return;
                }
                return;
            }
            m56864v4(false);
        } catch (Exception e12) {
            e12.printStackTrace();
            m56864v4(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        C10946c c10946c = this.f55280m0;
        if (c10946c != null) {
            unregisterReceiver(c10946c);
            this.f55280m0 = null;
        }
        f55268J0 = false;
        C0697c0.Companion.m1048b().m1035h("MessageHintSuggestView");
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        try {
            f55267I0 = this;
            f55268J0 = true;
            ArrayList arrayList = f55266H0;
            if (arrayList != null) {
                int size = arrayList.size();
                this.f55291x0 = size;
                if (size > 0 && this.f55293z0 != null) {
                    if (!this.f55270B0) {
                        this.f55292y0 = size - 1;
                    }
                    ViewPagerFakeDragFixed viewPagerFakeDragFixed = this.f55281n0;
                    if (viewPagerFakeDragFixed != null && viewPagerFakeDragFixed.getCurrentItem() != this.f55292y0) {
                        this.f55293z0.m36177y(f55266H0);
                        this.f55293z0.mo35341m();
                        this.f55281n0.setAdapter(this.f55293z0);
                        this.f55281n0.setCurrentItem(this.f55292y0);
                    }
                }
            }
            if (this.f55280m0 == null) {
                this.f55280m0 = new C10946c(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C0697c0.Companion.m1048b().m1043u("MessageHintSuggestView");
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        f55268J0 = false;
        C0697c0.Companion.m1048b().m1035h("MessageHintSuggestView");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                m56863oi();
                return;
            }
            m56862Vf();
            if (charSequence.length() >= 300) {
                ToastUtils.showMess(getString(AbstractC8020f0.limit_input_text));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.analytics.ZaloTrackingActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            C0697c0.Companion.m1048b().m1043u("MessageHintSuggestView");
        }
    }

    /* renamed from: v4 */
    public void m56864v4(boolean z11) {
        ArrayList arrayList = f55266H0;
        if (arrayList != null) {
            arrayList.clear();
        }
        f55268J0 = false;
        AbstractC23304d.f113350Y0 = System.currentTimeMillis();
        finish();
    }
}
