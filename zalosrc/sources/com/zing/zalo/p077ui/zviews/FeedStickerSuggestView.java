package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7240v6;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.widget.recyclerview.CustomRecyclerView;
import com.zing.zalo.social.controls.MentionSpan;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zview.ZaloView;
import fi.C18953k;
import g30.AbstractC19215a;
import gi.EnumC19450c;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import java.util.List;
import me0.C23212s8;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p471r3.C25630b;
import p588vw.C28652r;
import p716zh.C31902e9;
import vg.C28020b3;

/* loaded from: classes6.dex */
public class FeedStickerSuggestView extends FrameLayout {

    /* renamed from: A */
    private InterfaceC14281b f73374A;

    /* renamed from: p */
    private final C15472bf f73375p;

    /* renamed from: q */
    private EnumC19450c f73376q;

    /* renamed from: r */
    private LinearLayoutManager f73377r;

    /* renamed from: s */
    private FrameLayout f73378s;

    /* renamed from: t */
    private RecyclerView f73379t;

    /* renamed from: u */
    private C11815a f73380u;

    /* renamed from: v */
    private C7240v6 f73381v;

    /* renamed from: w */
    ZaloView f73382w;

    /* renamed from: x */
    private final ActionEditText f73383x;

    /* renamed from: y */
    private boolean f73384y;

    /* renamed from: z */
    private final InterfaceC14282c f73385z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.FeedStickerSuggestView$a */
    /* loaded from: classes6.dex */
    public class C14280a implements C11815a.g {
        C14280a() {
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
            AbstractC23647d.m123906p("49180007");
            AbstractC23647d.m123893c();
            FeedStickerSuggestView.this.m79734f();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: d */
        public void mo56869d(C31902e9 c31902e9, int i11, int i12, int i13) {
            String str;
            int i14;
            if (c31902e9 != null) {
                try {
                    if (c31902e9.m153322n() == 0) {
                        String str2 = "";
                        if (FeedStickerSuggestView.this.f73376q != EnumC19450c.f96560w) {
                            str = "";
                            i14 = -1;
                        } else {
                            if (FeedStickerSuggestView.this.f73375p.m87269e() != null) {
                                str2 = FeedStickerSuggestView.this.f73375p.m87269e().m150661e();
                            }
                            str = str2;
                            i14 = 1;
                        }
                        FeedStickerSuggestView.this.m79740n(c31902e9.m153321m(), i14, str, -1, "");
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: e */
        public void mo56870e() {
            FeedStickerSuggestView.this.mo46587m();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: f */
        public void mo56871f(C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a) {
            try {
                int i14 = 1;
                FeedStickerSuggestView.this.f73379t.requestDisallowInterceptTouchEvent(true);
                if (c31902e9 != null && c31902e9.m153322n() == 0) {
                    AbstractC23647d.m123906p("49180004");
                    AbstractC23647d.m123893c();
                    if (FeedStickerSuggestView.this.f73376q != EnumC19450c.f96560w) {
                        i14 = -1;
                    }
                    FeedStickerSuggestView.this.f73385z.mo46585a(c31902e9.m153321m(), i14);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: i3 */
        public void mo56872i3(C31902e9 c31902e9) {
            C25630b m153321m;
            if (c31902e9 != null) {
                try {
                    if (c31902e9.m153322n() == 0 && (m153321m = c31902e9.m153321m()) != null && !m153321m.m132399G()) {
                        AbstractC20789d.m108472f(301, FeedStickerSuggestView.this.f73382w.m92649TI());
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedStickerSuggestView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14281b {
        /* renamed from: a */
        void mo79746a();
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedStickerSuggestView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC14282c {
        /* renamed from: a */
        void mo46585a(C25630b c25630b, int i11);

        /* renamed from: b */
        void mo46586b(C25630b c25630b, int i11, String str, int i12, String str2);
    }

    public FeedStickerSuggestView(Context context, ZaloView zaloView, ActionEditText actionEditText, InterfaceC14282c interfaceC14282c) {
        super(context);
        this.f73376q = EnumC19450c.f96553p;
        this.f73384y = false;
        this.f73382w = zaloView;
        this.f73375p = new C15472bf(this, C18953k.m99340R());
        this.f73383x = actionEditText;
        this.f73385z = interfaceC14282c;
    }

    /* renamed from: j */
    private void m79732j() {
        try {
            if (this.f73378s == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.f73378s = frameLayout;
                frameLayout.setId(AbstractC6918a0.search_inline_listview);
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
                this.f73377r = noPredictiveItemAnimLinearLayoutMngr;
                noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
                CustomRecyclerView customRecyclerView = new CustomRecyclerView(getContext());
                this.f73379t = customRecyclerView;
                customRecyclerView.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.suggest_sticker_bg_color));
                this.f73379t.setItemAnimator(null);
                this.f73379t.setLayoutAnimation(null);
                this.f73379t.setLayoutManager(this.f73377r);
                this.f73379t.setVisibility(0);
                this.f73379t.setOverScrollMode(2);
                C11815a c11815a = new C11815a(getContext(), 0, new C14280a(), C28020b3.f130648a.m141208y("SUGGEST_VIEW_", this.f73382w.m92676n2()));
                this.f73380u = c11815a;
                this.f73379t.setAdapter(c11815a);
                View view = new View(getContext());
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, 1));
                view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor));
                this.f73378s.addView(this.f73379t);
                this.f73378s.addView(view);
                addView(this.f73378s, new RelativeLayout.LayoutParams(-1, -2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m79733e() {
        if (this.f73375p.m87269e() != null && !this.f73375p.m87270g(getContext()) && !TextUtils.isEmpty(this.f73375p.m87269e().m150661e())) {
            m79734f();
        }
    }

    /* renamed from: f */
    public void m79734f() {
        try {
            m79735g();
            m79737i();
            this.f73375p.m87272j();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m79735g() {
        try {
            this.f73376q = EnumC19450c.f96553p;
            C11815a c11815a = this.f73380u;
            if (c11815a != null) {
                c11815a.m65705w0(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String getEdtCommentText() {
        Editable text = this.f73383x.getText();
        if (text != null) {
            return text.toString();
        }
        return "";
    }

    /* renamed from: h */
    public boolean m79736h() {
        C11815a c11815a;
        if (this.f73378s != null && (c11815a = this.f73380u) != null && c11815a.mo10003k() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m79737i() {
        try {
            FrameLayout frameLayout = this.f73378s;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            m79742q();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public boolean m79738k() {
        C11815a c11815a = this.f73380u;
        if (c11815a != null && c11815a.mo10003k() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m79739l() {
        if (this.f73382w.m92674mJ() && !this.f73382w.m92681pJ()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void mo46587m() {
    }

    /* renamed from: n */
    public void m79740n(C25630b c25630b, int i11, String str, int i12, String str2) {
        boolean z11;
        try {
            AbstractC23647d.m123906p("49180002");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            this.f73385z.mo46586b(c25630b, i11, str, i12, str2);
            if (this.f73375p.m87269e() != null && !TextUtils.isEmpty(this.f73375p.m87269e().m150662f())) {
                z11 = TextUtils.equals(this.f73375p.m87269e().m150662f().trim(), getEdtCommentText().trim());
            } else {
                z11 = false;
            }
            m79734f();
            if (z11) {
                AbstractC23647d.m123906p("49180003");
                AbstractC23647d.m123893c();
                this.f73383x.setText("");
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m79741p(String str, boolean z11) {
        try {
            if (!this.f73375p.m87270g(getContext())) {
                m79734f();
            } else if (!AbstractC23309i.m121455Tf() && C28652r.m143332M(str)) {
                m79734f();
            } else {
                this.f73375p.m87271i(EnumC19450c.f96560w, this.f73376q, str, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    void m79742q() {
        try {
            if (this.f73384y) {
                Editable editableText = this.f73383x.getEditableText();
                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editableText.getSpans(0, editableText.length(), ForegroundColorSpan.class);
                if (foregroundColorSpanArr != null) {
                    for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                        if (!(foregroundColorSpan instanceof MentionSpan)) {
                            editableText.removeSpan(foregroundColorSpan);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f73384y = false;
    }

    /* renamed from: r */
    void m79743r() {
        try {
            m79742q();
            if (this.f73375p.m87269e() != null && this.f73375p.m87269e().m150672o() >= 0 && this.f73375p.m87269e().m150671n() > 0) {
                this.f73383x.getEditableText().setSpan(new ForegroundColorSpan(getContext().getResources().getColor(AbstractC16801x.cLink1)), this.f73375p.m87269e().m150672o(), this.f73375p.m87269e().m150671n(), 33);
                this.f73384y = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: s */
    public void m79744s() {
        C11815a c11815a;
        try {
            if (this.f73378s != null && (c11815a = this.f73380u) != null && c11815a.mo10003k() > 0) {
                this.f73378s.setVisibility(0);
                if (this.f73376q == EnumC19450c.f96560w) {
                    m79743r();
                } else {
                    m79742q();
                }
                InterfaceC14281b interfaceC14281b = this.f73374A;
                if (interfaceC14281b != null) {
                    interfaceC14281b.mo79746a();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOwnerID(String str) {
        this.f73375p.f79922c = str;
    }

    public void setProcessStickerCallback(InterfaceC14281b interfaceC14281b) {
        this.f73374A = interfaceC14281b;
    }

    /* renamed from: u */
    public void m79745u(EnumC19450c enumC19450c, List list, boolean z11) {
        int i11;
        try {
            this.f73376q = enumC19450c;
            m79732j();
            C7240v6 c7240v6 = this.f73381v;
            if (c7240v6 != null) {
                this.f73379t.m9907x1(c7240v6);
            }
            if (z11) {
                this.f73377r.m9723C2(1);
                int min = Math.min(3, list.size());
                int i12 = C11815a.f61479C;
                int i13 = min * i12;
                if (list.size() > 3) {
                    i11 = i12 / 2;
                } else {
                    i11 = 0;
                }
                this.f73379t.setLayoutParams(new FrameLayout.LayoutParams(-1, i13 + i11));
            } else {
                this.f73377r.m9723C2(0);
                this.f73379t.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                if (this.f73381v == null) {
                    this.f73381v = new C7240v6();
                }
                this.f73381v.m36957l(0);
                this.f73379t.m9816A(this.f73381v);
            }
            this.f73377r.mo9756v1(0);
            this.f73380u.m65705w0(list);
            this.f73379t.setLayoutManager(this.f73377r);
            this.f73379t.requestLayout();
            m79744s();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
