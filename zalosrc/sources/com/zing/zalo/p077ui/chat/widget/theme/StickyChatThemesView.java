package com.zing.zalo.p077ui.chat.widget.theme;

import am.C0943w;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.widget.theme.C11826a;
import com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3538f;
import p348mi.AbstractC23309i;
import p529tu.C26896a;
import p716zh.C31973j5;

/* loaded from: classes5.dex */
public class StickyChatThemesView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: A */
    private InterfaceC11825e f61521A;

    /* renamed from: B */
    private RobotoTextView f61522B;

    /* renamed from: C */
    private String f61523C;

    /* renamed from: p */
    public RecyclerView f61524p;

    /* renamed from: q */
    private LinearLayoutManager f61525q;

    /* renamed from: r */
    private C11826a f61526r;

    /* renamed from: s */
    private PhotoToggleButton f61527s;

    /* renamed from: t */
    private LinearLayout f61528t;

    /* renamed from: u */
    private LinearLayout f61529u;

    /* renamed from: v */
    private LinearLayout f61530v;

    /* renamed from: w */
    private RobotoTextView f61531w;

    /* renamed from: x */
    private RobotoTextView f61532x;

    /* renamed from: y */
    private Context f61533y;

    /* renamed from: z */
    private RelativeLayout f61534z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.StickyChatThemesView$a */
    /* loaded from: classes5.dex */
    public class C11821a extends RecyclerView.AbstractC1892s {
        C11821a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    StickyChatThemesView.this.f61526r.f61542t = false;
                    StickyChatThemesView.this.f61526r.m10008p();
                } else {
                    StickyChatThemesView.this.f61526r.f61542t = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (StickyChatThemesView.this.f61525q.m9740Y1() + StickyChatThemesView.this.f61525q.m10110a() >= StickyChatThemesView.this.f61525q.m10127i() - 1 && StickyChatThemesView.this.f61526r != null && !StickyChatThemesView.this.f61526r.f61539A && StickyChatThemesView.this.f61521A != null) {
                    StickyChatThemesView.this.f61521A.mo64845b();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.StickyChatThemesView$b */
    /* loaded from: classes5.dex */
    public class C11822b extends RecyclerView.AbstractC1887n {
        C11822b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            rect.bottom = AbstractC23136l9.m118742r(4.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.StickyChatThemesView$c */
    /* loaded from: classes5.dex */
    public class C11823c implements C11826a.a {
        C11823c() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.C11826a.a
        /* renamed from: a */
        public void mo65726a(C3538f c3538f) {
            if (c3538f != null) {
                try {
                    if (c3538f.f14925a.equals("-1")) {
                        if (StickyChatThemesView.this.f61521A != null) {
                            StickyChatThemesView.this.f61521A.mo64847d();
                        }
                    } else if (StickyChatThemesView.this.f61521A != null) {
                        StickyChatThemesView.this.f61521A.mo64846c(c3538f);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.C11826a.a
        /* renamed from: b */
        public void mo65727b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.StickyChatThemesView$d */
    /* loaded from: classes5.dex */
    public class C11824d extends C26896a.a {
        C11824d(int i11, int i12) {
            super(i11, i12);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC23152n3.m119050j0(StickyChatThemesView.this.getContext(), "https://app.laban.vn/use-app?utm_campaign=labankey&utm_source=Zalo");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.theme.StickyChatThemesView$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC11825e {
        /* renamed from: a */
        void mo64844a();

        /* renamed from: b */
        void mo64845b();

        /* renamed from: c */
        void mo64846c(C3538f c3538f);

        /* renamed from: d */
        void mo64847d();
    }

    public StickyChatThemesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65724g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m65720h(PhotoToggleButton photoToggleButton, boolean z11) {
        m65723f(z11);
    }

    /* renamed from: i */
    private SpannableString m65721i() {
        String string = getContext().getString(AbstractC8020f0.str_change_keyboard_theme);
        String str = string + " " + getContext().getString(AbstractC8020f0.str_install_labankey);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C11824d(C23212s8.m119607o(this.f61533y, AbstractC16781w.LinkColor), C23212s8.m119607o(this.f61533y, AbstractC16781w.LinkColor_alpha70)), string.length(), str.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f61533y, AbstractC16781w.LinkColor)), string.length(), str.length(), 33);
        return spannableString;
    }

    /* renamed from: e */
    public void m65722e(List list, C3538f c3538f, C3538f c3538f2, String str) {
        int i11;
        try {
            this.f61523C = str;
            if (this.f61522B != null) {
                Context appContext = MainApplication.getAppContext();
                if (!TextUtils.isEmpty(str)) {
                    i11 = AbstractC8020f0.str_sync_chat_theme_group_anounce;
                } else {
                    i11 = AbstractC8020f0.str_sync_chat_theme_anounce;
                }
                this.f61522B.setText(appContext.getString(i11));
            }
            if (this.f61527s != null) {
                boolean m122052jc = AbstractC23309i.m122052jc();
                if (TextUtils.isEmpty(str)) {
                    this.f61527s.setChecked(m122052jc);
                } else {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(str);
                    if (m4472f != null && (!m4472f.m153761g0() || m4472f.m153742T())) {
                        this.f61527s.setChecked(m122052jc);
                    } else {
                        this.f61527s.setChecked(false);
                    }
                }
            }
            ArrayList arrayList = new ArrayList(list);
            C3538f c3538f3 = new C3538f();
            c3538f3.f14925a = "0";
            c3538f3.f14930f = C3538f.f14924j;
            arrayList.add(0, c3538f3);
            try {
                String m121775c1 = AbstractC23309i.m121775c1();
                if (!TextUtils.isEmpty(m121775c1)) {
                    C3538f c3538f4 = new C3538f(new JSONObject(m121775c1));
                    c3538f4.m17984c();
                    if (AbstractC23041d2.m118194A(c3538f4.f14931g)) {
                        arrayList.add(0, c3538f4);
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            C3538f c3538f5 = new C3538f();
            c3538f5.f14925a = "-1";
            arrayList.add(0, c3538f5);
            this.f61526r.m65736T(arrayList);
            C11826a c11826a = this.f61526r;
            c11826a.f61545w = c3538f;
            c11826a.m65737U(c3538f2);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: f */
    void m65723f(boolean z11) {
        if (TextUtils.isEmpty(this.f61523C)) {
            AbstractC23309i.m122558wx(z11);
            return;
        }
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f61523C);
        if (z11 && m4472f != null && m4472f.m153761g0() && !m4472f.m153742T()) {
            this.f61527s.setChecked(false);
            ToastUtils.showMess(getContext().getString(AbstractC8020f0.str_only_change_background_by_admin));
        } else {
            AbstractC23309i.m122558wx(z11);
        }
    }

    /* renamed from: g */
    void m65724g(Context context) {
        try {
            this.f61533y = context;
            LayoutInflater.from(context).inflate(AbstractC7409c0.sticky_chat_themes_content, this);
            setClickable(true);
            this.f61524p = (RecyclerView) findViewById(AbstractC6918a0.gridBackgrounds);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f61533y);
            this.f61525q = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            this.f61524p.setLayoutManager(this.f61525q);
            this.f61524p.setOverScrollMode(2);
            this.f61524p.m9826E(new C11821a());
            this.f61524p.m9816A(new C11822b());
            C11826a c11826a = new C11826a(this.f61533y, new C11823c());
            this.f61526r = c11826a;
            this.f61524p.setAdapter(c11826a);
            this.f61529u = (LinearLayout) findViewById(AbstractC6918a0.layout_hint);
            RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.tvHint);
            this.f61522B = robotoTextView;
            robotoTextView.setOnClickListener(this);
            PhotoToggleButton photoToggleButton = (PhotoToggleButton) findViewById(AbstractC6918a0.cb_selected_sync);
            this.f61527s = photoToggleButton;
            photoToggleButton.setOnCheckedChangeListener(new PhotoToggleButton.InterfaceC11847c() { // from class: t60.f
                @Override // com.zing.zalo.p077ui.custom.PhotoToggleButton.InterfaceC11847c
                /* renamed from: a */
                public final void mo37055a(PhotoToggleButton photoToggleButton2, boolean z11) {
                    StickyChatThemesView.this.m65720h(photoToggleButton2, z11);
                }
            });
            this.f61528t = (LinearLayout) findViewById(AbstractC6918a0.layout_error);
            RobotoTextView robotoTextView2 = (RobotoTextView) findViewById(AbstractC6918a0.btn_retry);
            this.f61531w = robotoTextView2;
            robotoTextView2.setOnClickListener(this);
            this.f61530v = (LinearLayout) findViewById(AbstractC6918a0.ll_promote_labankey);
            RobotoTextView robotoTextView3 = (RobotoTextView) findViewById(AbstractC6918a0.tv_promote_labankey);
            this.f61532x = robotoTextView3;
            robotoTextView3.setText(m65721i());
            this.f61532x.setMovementMethod(C26896a.getInstance());
            this.f61534z = (RelativeLayout) findViewById(AbstractC6918a0.grid_chat_theme);
            if (AbstractC23309i.m122614yf() && !AbstractC23152n3.m119071u(getContext(), "com.vng.inputmethod.labankey")) {
                this.f61530v.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public boolean getCheckedSyncTheme() {
        PhotoToggleButton photoToggleButton = this.f61527s;
        if (photoToggleButton != null) {
            return photoToggleButton.isChecked();
        }
        return false;
    }

    public C3538f getCurrentThemeSelected() {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            return c11826a.f61545w;
        }
        return null;
    }

    public C3538f getThemeClick() {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            return c11826a.f61546x;
        }
        return null;
    }

    public C3538f getThemeLoading() {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            return c11826a.f61547y;
        }
        return null;
    }

    /* renamed from: j */
    public void m65725j(boolean z11, boolean z12) {
        try {
            C11826a c11826a = this.f61526r;
            if (c11826a != null) {
                c11826a.m65739W(z11);
                this.f61526r.m65738V(z12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.tvHint) {
                PhotoToggleButton photoToggleButton = this.f61527s;
                if (photoToggleButton != null) {
                    boolean z11 = !photoToggleButton.isChecked();
                    this.f61527s.setChecked(z11);
                    m65723f(z11);
                }
            } else if (id2 == AbstractC6918a0.btn_retry) {
                setLayoutFooterVisible(false);
                InterfaceC11825e interfaceC11825e = this.f61521A;
                if (interfaceC11825e != null) {
                    interfaceC11825e.mo64844a();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setChatThemeListener(InterfaceC11825e interfaceC11825e) {
        this.f61521A = interfaceC11825e;
    }

    public void setCurrentThemeSelected(C3538f c3538f) {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            c11826a.f61545w = c3538f;
        }
    }

    public void setLayoutFooterVisible(boolean z11) {
        int i11;
        int i12;
        try {
            LinearLayout linearLayout = this.f61529u;
            int i13 = 0;
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = this.f61530v;
            if (z11) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout2.setVisibility(i12);
            LinearLayout linearLayout3 = this.f61528t;
            if (!z11) {
                i13 = 8;
            }
            linearLayout3.setVisibility(i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setThemeClick(C3538f c3538f) {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            c11826a.m65737U(c3538f);
            this.f61526r.m10008p();
        }
    }

    public void setThemeLoading(C3538f c3538f) {
        C11826a c11826a = this.f61526r;
        if (c11826a != null) {
            c11826a.f61547y = c3538f;
            c11826a.m10008p();
        }
    }
}
