package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.AbstractC1438d;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2500f;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.p072ui.view.SearchPageView;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18707e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import h20.InterfaceC19731o;
import i20.C20196i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.AbstractC21317c;
import k20.C21456b;
import m20.InterfaceC22759j1;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C24988b0;
import q10.C25022j2;
import q20.C25085h;
import q20.C25097t;
import qm0.AbstractC25361o0;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31159d0;
import z10.C31163f0;

/* loaded from: classes5.dex */
public final class SearchPageView extends AbstractC10623a implements InterfaceC22759j1, C21456b.c {
    public static final C10392b Companion = new C10392b(null);

    /* renamed from: B0 */
    private final InterfaceC19731o f53192B0;

    /* renamed from: C0 */
    private int f53193C0;

    /* renamed from: D0 */
    private C20196i f53194D0;

    /* renamed from: E0 */
    private C31163f0 f53195E0;

    /* renamed from: F0 */
    private C31159d0 f53196F0;

    /* renamed from: G0 */
    private C18707e f53197G0;

    /* renamed from: H0 */
    private int f53198H0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10391a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10391a f53199y = new C10391a();

        C10391a() {
            super(3, C25022j2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageSearchBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54824h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25022j2 m54824h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25022j2.m129861c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10392b {
        private C10392b() {
        }

        public /* synthetic */ C10392b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ SearchPageView m54825c(C10392b c10392b, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return c10392b.m54827b(str);
        }

        /* renamed from: a */
        public final Bundle m54826a(String str) {
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("KEYWORD", str));
        }

        /* renamed from: b */
        public final SearchPageView m54827b(String str) {
            SearchPageView searchPageView = new SearchPageView();
            searchPageView.mo60305zK(SearchPageView.Companion.m54826a(str));
            return searchPageView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$c */
    /* loaded from: classes5.dex */
    public static final class C10393c extends AbstractC19075u implements InterfaceC18494a {
        C10393c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54828a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54828a() {
            ListClickableRecyclerView listClickableRecyclerView;
            C25022j2 c25022j2 = (C25022j2) SearchPageView.this.m55556SK();
            if (c25022j2 != null && (listClickableRecyclerView = c25022j2.f120012x) != null) {
                listClickableRecyclerView.m9837K1(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$d */
    /* loaded from: classes5.dex */
    static final class C10394d extends AbstractC19075u implements InterfaceC18494a {
        C10394d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54829a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54829a() {
            ListClickableRecyclerView listClickableRecyclerView;
            C25022j2 c25022j2 = (C25022j2) SearchPageView.this.m55556SK();
            if (c25022j2 != null && (listClickableRecyclerView = c25022j2.f120013y) != null) {
                listClickableRecyclerView.m9837K1(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$e */
    /* loaded from: classes5.dex */
    static final class C10395e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ C25022j2 f53203p;

            a(C25022j2 c25022j2) {
                this.f53203p = c25022j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                EnterActionEditText enterActionEditText = this.f53203p.f120010v;
                AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
                if (!AbstractC26112n.m134427u0(enterActionEditText)) {
                    this.f53203p.f120010v.post(this);
                }
            }
        }

        C10395e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54830a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54830a() {
            C25022j2 c25022j2 = (C25022j2) SearchPageView.this.m55556SK();
            if (c25022j2 != null) {
                SearchPageView searchPageView = SearchPageView.this;
                if (searchPageView.f53193C0 == 2) {
                    searchPageView.m54823iL();
                }
                if (searchPageView.f53193C0 == 0 || searchPageView.f53193C0 == 1) {
                    c25022j2.f120010v.post(new a(c25022j2));
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$f */
    /* loaded from: classes5.dex */
    public static final class C10396f extends ViewPager.C6879n {

        /* renamed from: p */
        private int f53204p;

        /* renamed from: q */
        final /* synthetic */ SearchPageView f53205q;

        C10396f(ViewPager viewPager, SearchPageView searchPageView) {
            this.f53205q = searchPageView;
            this.f53204p = viewPager.getCurrentItem();
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            int i12;
            C19205a c19205a = C19205a.f95429a;
            SearchPageView searchPageView = this.f53205q;
            if (i11 == C18707e.e.f93987p.ordinal()) {
                i12 = AbstractC27413h.zch_action_key_search_all_tab;
            } else if (i11 == C18707e.e.f93988q.ordinal()) {
                i12 = AbstractC27413h.zch_action_key_search_video_tab;
            } else if (i11 == C18707e.e.f93989r.ordinal()) {
                i12 = AbstractC27413h.zch_action_key_search_channel_tab;
            } else if (i11 == C18707e.e.f93990s.ordinal()) {
                i12 = AbstractC27413h.zch_action_key_search_hashtag_tab;
            } else {
                throw new IllegalArgumentException();
            }
            String m92652XI = searchPageView.m92652XI(i12);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            C18707e c18707e = this.f53205q.f53197G0;
            if (c18707e != null) {
                c18707e.m98654C(this.f53204p);
            }
            C18707e c18707e2 = this.f53205q.f53197G0;
            if (c18707e2 != null) {
                c18707e2.m98652A(i11);
            }
            this.f53204p = i11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$g */
    /* loaded from: classes5.dex */
    public static final class C10397g extends PageBar.C10775i {

        /* renamed from: f */
        final /* synthetic */ PageBar f53206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10397g(PageBar pageBar, Context context) {
            super(context);
            this.f53206f = pageBar;
            AbstractC19074t.m100205c(context);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10775i, com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10771e
        /* renamed from: a */
        public void mo54597a(Canvas canvas, Rect rect, Rect rect2, Rect rect3, float f11) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC19074t.m100208f(rect, "bound");
            AbstractC19074t.m100208f(rect2, "lPage");
            AbstractC19074t.m100208f(rect3, "rPage");
            m56018d().set(rect);
            m56018d().top = rect.bottom - m56020f();
            RectF m56018d = m56018d();
            Paint m56019e = m56019e();
            m56019e.setColor(mo54598b());
            C24848g0 c24848g0 = C24848g0.f119245a;
            canvas.drawRect(m56018d, m56019e);
            m56018d().left = rect2.left + ((rect3.left - r0) * f11) + this.f53206f.getPagePaddingLeft();
            m56018d().right = (rect2.right + ((rect3.right - r6) * f11)) - this.f53206f.getPagePaddingRight();
            RectF m56018d2 = m56018d();
            Paint m56019e2 = m56019e();
            m56019e2.setColor(mo54599c());
            canvas.drawRect(m56018d2, m56019e2);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$h */
    /* loaded from: classes5.dex */
    static final class C10398h extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25022j2 f53207q;

        /* renamed from: r */
        final /* synthetic */ SearchPageView f53208r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10398h(C25022j2 c25022j2, SearchPageView searchPageView) {
            super(2);
            this.f53207q = c25022j2;
            this.f53208r = searchPageView;
        }

        /* renamed from: a */
        public final void m54831a(int i11, float f11) {
            List m151570O;
            boolean z11 = false;
            if (i11 > 0) {
                EllipsizedTextView ellipsizedTextView = this.f53207q.f120001F;
                AbstractC19074t.m100207e(ellipsizedTextView, "txtSearch");
                AbstractC26112n.m134367H(ellipsizedTextView);
                String obj = this.f53207q.f120010v.getText().toString();
                SearchPageView searchPageView = this.f53208r;
                C25022j2 c25022j2 = this.f53207q;
                if (obj.length() <= 0) {
                    C31163f0 c31163f0 = searchPageView.f53195E0;
                    if (c31163f0 != null && (m151570O = c31163f0.m151570O()) != null && m151570O.size() == 0) {
                        searchPageView.f53192B0.mo53441Y7();
                    }
                    searchPageView.m54815oL();
                } else {
                    if (searchPageView.f53193C0 >= 2) {
                        searchPageView.f53192B0.mo53444so();
                        searchPageView.f53192B0.mo53443m4(obj);
                        c25022j2.f120010v.setSelection(obj.length());
                        C18707e c18707e = searchPageView.f53197G0;
                        if (c18707e != null) {
                            int mo35335g = c18707e.mo35335g();
                            for (int i12 = 0; i12 < mo35335g; i12++) {
                                c18707e.m98653B(i12);
                            }
                        }
                    }
                    searchPageView.m54812lL();
                }
                this.f53207q.f120010v.setCursorVisible(true);
                return;
            }
            EnterActionEditText enterActionEditText = this.f53207q.f120010v;
            if (this.f53208r.f53193C0 < 2) {
                z11 = true;
            }
            enterActionEditText.setCursorVisible(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54831a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$i */
    /* loaded from: classes5.dex */
    static final class C10399i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25022j2 f53209q;

        /* renamed from: r */
        final /* synthetic */ SearchPageView f53210r;

        /* renamed from: s */
        final /* synthetic */ EnterActionEditText f53211s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10399i(C25022j2 c25022j2, SearchPageView searchPageView, EnterActionEditText enterActionEditText) {
            super(1);
            this.f53209q = c25022j2;
            this.f53210r = searchPageView;
            this.f53211s = enterActionEditText;
        }

        /* renamed from: a */
        public final void m54832a(Editable editable) {
            List m151570O;
            CharSequence m127168X0;
            boolean m127128x;
            if (this.f53209q.f120010v.getText().length() > this.f53210r.f53198H0) {
                EnterActionEditText enterActionEditText = this.f53209q.f120010v;
                enterActionEditText.setText(enterActionEditText.getText().subSequence(0, this.f53210r.f53198H0));
                EnterActionEditText enterActionEditText2 = this.f53209q.f120010v;
                enterActionEditText2.setSelection(enterActionEditText2.getText().length());
                C25097t.f120556a.m130153n(this.f53211s.getContext(), AbstractC27413h.zch_page_search_limit);
                return;
            }
            if (editable != null && editable.length() > 0) {
                m127128x = AbstractC24341v.m127128x(editable);
                if (m127128x) {
                    this.f53209q.f120010v.getText().clear();
                    return;
                }
            }
            if (editable != null && editable.length() != 0) {
                m127168X0 = AbstractC24342w.m127168X0(editable);
                String m127019g = new C24329j("\\s+").m127019g(m127168X0, " ");
                EllipsizedTextView ellipsizedTextView = this.f53209q.f120002G.f119760r;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53210r.m92652XI(AbstractC27413h.zch_page_search_see_all_results_for_xxx));
                EnterActionEditText enterActionEditText3 = this.f53211s;
                AbstractC19074t.m100205c(enterActionEditText3);
                spannableStringBuilder.append(m127019g, new ForegroundColorSpan(AbstractC26112n.m134426u(enterActionEditText3, AbstractC27406a.zch_text_accent_blue)), 17);
                ellipsizedTextView.setText(spannableStringBuilder);
                this.f53209q.f120002G.f119760r.requestLayout();
                this.f53210r.f53192B0.mo53443m4(m127019g);
                this.f53210r.m54812lL();
                PulseImageView pulseImageView = this.f53209q.f120008t;
                AbstractC19074t.m100207e(pulseImageView, "btnClear");
                AbstractC26112n.m134431w0(pulseImageView);
                return;
            }
            this.f53210r.f53192B0.mo53444so();
            this.f53210r.mo54819YE("", new ArrayList());
            C31163f0 c31163f0 = this.f53210r.f53195E0;
            if (c31163f0 != null && (m151570O = c31163f0.m151570O()) != null && m151570O.size() == 0) {
                this.f53210r.f53192B0.mo53441Y7();
            }
            this.f53210r.m54815oL();
            PulseImageView pulseImageView2 = this.f53209q.f120008t;
            AbstractC19074t.m100207e(pulseImageView2, "btnClear");
            AbstractC26112n.m134367H(pulseImageView2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54832a((Editable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$j */
    /* loaded from: classes5.dex */
    static final class C10400j extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25022j2 f53212q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10400j(C25022j2 c25022j2) {
            super(2);
            this.f53212q = c25022j2;
        }

        /* renamed from: a */
        public final void m54833a(TextView textView, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "<anonymous parameter 0>");
            this.f53212q.f120009u.callOnClick();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54833a((TextView) obj, (KeyEvent) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$k */
    /* loaded from: classes5.dex */
    public static final class C10401k extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C25022j2 f53213a;

        C10401k(C25022j2 c25022j2) {
            this.f53213a = c25022j2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                EnterActionEditText enterActionEditText = this.f53213a.f120010v;
                AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
                AbstractC26112n.m134369J(enterActionEditText);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$l */
    /* loaded from: classes5.dex */
    static final class C10402l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25022j2 f53214q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10402l(C25022j2 c25022j2) {
            super(0);
            this.f53214q = c25022j2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54834a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54834a() {
            EnterActionEditText enterActionEditText = this.f53214q.f120010v;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$m */
    /* loaded from: classes5.dex */
    public static final class C10403m implements C31163f0.b {
        C10403m() {
        }

        @Override // z10.C31163f0.b
        /* renamed from: a */
        public void mo54835a(String str) {
            SearchPageView.this.f53192B0.mo53446zl(str);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchPageView.this.m92652XI(AbstractC27413h.zch_action_key_search_history_clear);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // z10.C31163f0.b
        /* renamed from: b */
        public void mo54836b(String str, boolean z11) {
            int i11;
            Map m131401f;
            AbstractC19074t.m100208f(str, "keyword");
            SearchPageView.m54811kL(SearchPageView.this, str, 0, 2, null);
            C19205a c19205a = C19205a.f95429a;
            SearchPageView searchPageView = SearchPageView.this;
            if (z11) {
                i11 = AbstractC27413h.zch_action_key_search_history;
            } else {
                i11 = AbstractC27413h.zch_action_key_search_suggestion;
            }
            String m92652XI = searchPageView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", str));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$n */
    /* loaded from: classes5.dex */
    static final class C10404n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25022j2 f53217r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10404n(C25022j2 c25022j2) {
            super(1);
            this.f53217r = c25022j2;
        }

        /* renamed from: a */
        public final void m54837a(View view) {
            Map m131401f;
            AbstractC19074t.m100208f(view, "it");
            SearchPageView.m54811kL(SearchPageView.this, this.f53217r.f120010v.getText().toString(), 0, 2, null);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchPageView.this.m92652XI(AbstractC27413h.zch_action_key_search_keyword);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", this.f53217r.f120010v.getText().toString()));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54837a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$o */
    /* loaded from: classes5.dex */
    public static final class C10405o extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C25022j2 f53218a;

        C10405o(C25022j2 c25022j2) {
            this.f53218a = c25022j2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                EnterActionEditText enterActionEditText = this.f53218a.f120010v;
                AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
                AbstractC26112n.m134369J(enterActionEditText);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$p */
    /* loaded from: classes5.dex */
    static final class C10406p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25022j2 f53219q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10406p(C25022j2 c25022j2) {
            super(0);
            this.f53219q = c25022j2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54838a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54838a() {
            EnterActionEditText enterActionEditText = this.f53219q.f120010v;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchPageView$q */
    /* loaded from: classes5.dex */
    public static final class C10407q implements C31159d0.a {
        C10407q() {
        }

        @Override // z10.C31159d0.a
        /* renamed from: a */
        public void mo54839a(String str) {
            Map m131401f;
            AbstractC19074t.m100208f(str, "keyword");
            SearchPageView.m54811kL(SearchPageView.this, str, 0, 2, null);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = SearchPageView.this.m92652XI(AbstractC27413h.zch_action_key_search_completion);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", str));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    public SearchPageView() {
        super(C10391a.f53199y);
        this.f53192B0 = AbstractC28684a.Companion.m143671H();
        this.f53198H0 = 200;
    }

    /* renamed from: dL */
    private final void m54806dL() {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            LinearLayout linearLayout = c25022j2.f120000E;
            AbstractC19074t.m100207e(linearLayout, "lytSuggestion");
            AbstractC26112n.m134367H(linearLayout);
            LinearLayout linearLayout2 = c25022j2.f120014z;
            AbstractC19074t.m100207e(linearLayout2, "lytCompletion");
            AbstractC26112n.m134367H(linearLayout2);
            LinearLayout linearLayout3 = c25022j2.f119999D;
            AbstractC19074t.m100207e(linearLayout3, "lytResult");
            AbstractC26112n.m134367H(linearLayout3);
        }
    }

    /* renamed from: eL */
    public static final void m54807eL(SearchPageView searchPageView, C25022j2 c25022j2, View view) {
        AbstractC19074t.m100208f(searchPageView, "this$0");
        AbstractC19074t.m100208f(c25022j2, "$this_run");
        Bundle m92642L3 = searchPageView.m92642L3();
        if ((m92642L3 != null && m92642L3.containsKey("KEYWORD")) || searchPageView.f53193C0 == 0) {
            EnterActionEditText enterActionEditText = c25022j2.f120010v;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
            searchPageView.finish();
            return;
        }
        c25022j2.f120008t.callOnClick();
    }

    /* renamed from: fL */
    public static final void m54808fL(C25022j2 c25022j2, SearchPageView searchPageView, View view) {
        Map m131401f;
        List m151570O;
        Map m131401f2;
        AbstractC19074t.m100208f(c25022j2, "$this_run");
        AbstractC19074t.m100208f(searchPageView, "this$0");
        if (c25022j2.f120010v.getText().length() == 0) {
            C31163f0 c31163f0 = searchPageView.f53195E0;
            if (c31163f0 != null && (m151570O = c31163f0.m151570O()) != null && m151570O.size() > 0) {
                m54811kL(searchPageView, c25022j2.f120010v.getHint().toString(), 0, 2, null);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = searchPageView.m92652XI(AbstractC27413h.zch_action_key_search_keyword);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", c25022j2.f120010v.getHint().toString()));
                c19205a.m100713L(m92652XI, m131401f2);
                return;
            }
            return;
        }
        m54811kL(searchPageView, c25022j2.f120010v.getText().toString(), 0, 2, null);
        C19205a c19205a2 = C19205a.f95429a;
        String m92652XI2 = searchPageView.m92652XI(AbstractC27413h.zch_action_key_search_keyword);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", c25022j2.f120010v.getText().toString()));
        c19205a2.m100713L(m92652XI2, m131401f);
    }

    /* renamed from: gL */
    public static final void m54809gL(SearchPageView searchPageView, C25022j2 c25022j2, View view) {
        AbstractC19074t.m100208f(searchPageView, "this$0");
        AbstractC19074t.m100208f(c25022j2, "$this_run");
        if (searchPageView.f53193C0 >= 2) {
            searchPageView.f53192B0.mo53444so();
            C18707e c18707e = searchPageView.f53197G0;
            if (c18707e != null) {
                int mo35335g = c18707e.mo35335g();
                for (int i11 = 0; i11 < mo35335g; i11++) {
                    c18707e.m98653B(i11);
                }
            }
        }
        EllipsizedTextView ellipsizedTextView = c25022j2.f120001F;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtSearch");
        AbstractC26112n.m134367H(ellipsizedTextView);
        c25022j2.f120010v.getText().clear();
        EnterActionEditText enterActionEditText = c25022j2.f120010v;
        AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
        AbstractC26112n.m134427u0(enterActionEditText);
    }

    /* renamed from: jL */
    private final void m54810jL(String str, int i11) {
        CharSequence m127168X0;
        m127168X0 = AbstractC24342w.m127168X0(str);
        String m127019g = new C24329j("\\s+").m127019g(m127168X0.toString(), " ");
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            EnterActionEditText enterActionEditText = c25022j2.f120010v;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
            c25022j2.f120010v.setText(m127019g);
            EllipsizedTextView ellipsizedTextView = c25022j2.f120001F;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtSearch");
            AbstractC26112n.m134431w0(ellipsizedTextView);
            c25022j2.f120001F.setText(m127019g);
            this.f53192B0.mo53445y4(m127019g);
            m54813mL(i11);
            C18707e c18707e = this.f53197G0;
            if (c18707e != null) {
                int mo35335g = c18707e.mo35335g();
                for (int i12 = 0; i12 < mo35335g; i12++) {
                    c18707e.m98656E(i12, m127019g);
                }
            }
        }
    }

    /* renamed from: kL */
    static /* synthetic */ void m54811kL(SearchPageView searchPageView, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        searchPageView.m54810jL(str, i11);
    }

    /* renamed from: lL */
    public final void m54812lL() {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            m54806dL();
            BlinkTextView blinkTextView = c25022j2.f120009u;
            AbstractC19074t.m100207e(blinkTextView, "btnSearch");
            AbstractC26112n.m134431w0(blinkTextView);
            FrameLayout frameLayout = c25022j2.f120006r;
            AbstractC19074t.m100207e(frameLayout, "boxSearch");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = 0;
                frameLayout.setLayoutParams(layoutParams2);
                LinearLayout linearLayout = c25022j2.f120014z;
                AbstractC19074t.m100207e(linearLayout, "lytCompletion");
                AbstractC26112n.m134431w0(linearLayout);
                c25022j2.f120012x.m9837K1(0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        this.f53193C0 = 1;
    }

    /* renamed from: mL */
    private final void m54813mL(int i11) {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            m54806dL();
            BlinkTextView blinkTextView = c25022j2.f120009u;
            AbstractC19074t.m100207e(blinkTextView, "btnSearch");
            AbstractC26112n.m134367H(blinkTextView);
            FrameLayout frameLayout = c25022j2.f120006r;
            AbstractC19074t.m100207e(frameLayout, "boxSearch");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                FrameLayout root = c25022j2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.rightMargin = AbstractC26112n.m134433y(root, AbstractC27407b.zch_page_padding);
                frameLayout.setLayoutParams(layoutParams2);
                LinearLayout linearLayout = c25022j2.f119999D;
                AbstractC19074t.m100207e(linearLayout, "lytResult");
                AbstractC26112n.m134431w0(linearLayout);
                c25022j2.f120003H.setCurrentItem(i11, false);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        this.f53193C0 = 2;
    }

    /* renamed from: nL */
    static /* synthetic */ void m54814nL(SearchPageView searchPageView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        searchPageView.m54813mL(i11);
    }

    /* renamed from: oL */
    public final void m54815oL() {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            m54806dL();
            BlinkTextView blinkTextView = c25022j2.f120009u;
            AbstractC19074t.m100207e(blinkTextView, "btnSearch");
            AbstractC26112n.m134431w0(blinkTextView);
            FrameLayout frameLayout = c25022j2.f120006r;
            AbstractC19074t.m100207e(frameLayout, "boxSearch");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = 0;
                frameLayout.setLayoutParams(layoutParams2);
                LinearLayout linearLayout = c25022j2.f120000E;
                AbstractC19074t.m100207e(linearLayout, "lytSuggestion");
                AbstractC26112n.m134431w0(linearLayout);
                c25022j2.f120013y.m9837K1(0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.remove("KEYWORD");
        }
        this.f53193C0 = 0;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f53192B0);
        this.f53192B0.mo52965Lb(this);
        this.f53192B0.mo52970uo(m92642L3());
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: FF */
    public void mo54816FF(List list) {
        AbstractC19074t.m100208f(list, "suggestion");
        C31163f0 c31163f0 = this.f53195E0;
        if (c31163f0 != null) {
            c31163f0.m151576V(list);
            EnterActionEditText enterActionEditText = null;
            C31163f0.m151568Q(c31163f0, null, 1, null);
            if (!list.isEmpty()) {
                String str = (String) list.get(AbstractC21317c.f103810p.mo110373e(list.size()));
                C25022j2 c25022j2 = (C25022j2) m55556SK();
                if (c25022j2 != null) {
                    enterActionEditText = c25022j2.f120010v;
                }
                if (enterActionEditText != null) {
                    enterActionEditText.setHint(str);
                }
            }
        }
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: Hw */
    public void mo54817Hw(List list) {
        AbstractC19074t.m100208f(list, "history");
        C31163f0 c31163f0 = this.f53195E0;
        if (c31163f0 != null) {
            c31163f0.m151575U(list);
            c31163f0.m151571P(new C10394d());
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(SearchPageView.class, null);
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: Rq */
    public void mo54818Rq(String str, SearchAllResult searchAllResult) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        C18707e c18707e = this.f53197G0;
        if (c18707e != null) {
            int mo35335g = c18707e.mo35335g();
            for (int i11 = 0; i11 < mo35335g; i11++) {
                c18707e.m98657F(i11, str, searchAllResult);
            }
        }
        this.f53193C0 = 3;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C20196i c20196i = this.f53194D0;
        if (c20196i != null) {
            c20196i.m105320p(new C10395e());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            EnterActionEditText enterActionEditText = c25022j2.f120010v;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
        }
        C20196i c20196i = this.f53194D0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: YE */
    public void mo54819YE(String str, List list) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list, "completion");
        C31159d0 c31159d0 = this.f53196F0;
        if (c31159d0 != null) {
            c31159d0.m151539S(str);
            c31159d0.m151538R(list);
            c31159d0.m151534N(new C10393c());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String string;
        boolean m127128x;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            this.f53194D0 = new C20196i(this, false, new C10398h(c25022j2, this), 2, null);
            LinearLayout linearLayout = c25022j2.f119996A;
            AbstractC19074t.m100207e(linearLayout, "lytContainer");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout root = c25022j2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                linearLayout.setLayoutParams(layoutParams2);
                c25022j2.f120007s.setOnClickListener(new View.OnClickListener() { // from class: m20.k1

                    /* renamed from: q */
                    public final /* synthetic */ C25022j2 f111345q;

                    public /* synthetic */ ViewOnClickListenerC22763k1(C25022j2 c25022j22) {
                        r2 = c25022j22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchPageView.m54807eL(SearchPageView.this, r2, view2);
                    }
                });
                ImageView imageView = c25022j22.f120011w;
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                imageView.setImageDrawable(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_search_line_24, AbstractC27406a.zch_icon_tertiary));
                EnterActionEditText enterActionEditText = c25022j22.f120010v;
                AbstractC19074t.m100205c(enterActionEditText);
                AbstractC26112n.m134400h(enterActionEditText, new C10399i(c25022j22, this, enterActionEditText));
                AbstractC26112n.m134410m(enterActionEditText, new C10400j(c25022j22));
                c25022j22.f120009u.setOnClickListener(new View.OnClickListener() { // from class: m20.l1

                    /* renamed from: q */
                    public final /* synthetic */ SearchPageView f111351q;

                    public /* synthetic */ ViewOnClickListenerC22767l1(SearchPageView this) {
                        r2 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchPageView.m54808fL(C25022j2.this, r2, view2);
                    }
                });
                PulseImageView pulseImageView = c25022j22.f120008t;
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                pulseImageView.setImageDrawable(C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_close_circle_solid_16, AbstractC27406a.zch_icon_disabled));
                pulseImageView.setOnClickListener(new View.OnClickListener() { // from class: m20.m1

                    /* renamed from: q */
                    public final /* synthetic */ C25022j2 f111357q;

                    public /* synthetic */ ViewOnClickListenerC22771m1(C25022j2 c25022j22) {
                        r2 = c25022j22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchPageView.m54809gL(SearchPageView.this, r2, view2);
                    }
                });
                ListClickableRecyclerView listClickableRecyclerView = c25022j22.f120013y;
                Context context = listClickableRecyclerView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                listClickableRecyclerView.m9816A(new C2500f(context));
                listClickableRecyclerView.m9826E(new C10401k(c25022j22));
                listClickableRecyclerView.setOnListClickListener(new C10402l(c25022j22));
                Context context2 = listClickableRecyclerView.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                listClickableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context2, 0, false, false, 14, null));
                C31163f0 c31163f0 = new C31163f0(null, null, 3, null);
                listClickableRecyclerView.setAdapter(c31163f0);
                c31163f0.m151574T(new C10403m());
                this.f53195E0 = c31163f0;
                this.f53192B0.mo53442fl();
                this.f53192B0.mo53441Y7();
                C24988b0 c24988b0 = c25022j22.f120002G;
                c24988b0.f119759q.setImageDrawable(C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_icon_accent_gray_subtle, 0, 0, AbstractC23322a.zds_ic_search_line_16, AbstractC27406a.zch_icon_tertiary, AbstractC27407b.zch_page_search_completion_icon_inset, 6, null));
                EllipsizedTextView ellipsizedTextView = c24988b0.f119760r;
                Context context3 = c24988b0.getRoot().getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                ellipsizedTextView.setTypeface(C13718q1.m76694c(context3, 5));
                EllipsizedTextView ellipsizedTextView2 = c24988b0.f119760r;
                SpannableString spannableString = new SpannableString("…");
                LinearLayout root2 = c24988b0.getRoot();
                AbstractC19074t.m100207e(root2, "getRoot(...)");
                spannableString.setSpan(new ForegroundColorSpan(AbstractC26112n.m134426u(root2, AbstractC27406a.zch_text_accent_blue)), 0, spannableString.length(), 17);
                ellipsizedTextView2.setEllipsisText(spannableString);
                LinearLayout root3 = c24988b0.getRoot();
                AbstractC19074t.m100207e(root3, "getRoot(...)");
                AbstractC26112n.m134407k0(root3, new C10404n(c25022j22));
                ListClickableRecyclerView listClickableRecyclerView2 = c25022j22.f120012x;
                listClickableRecyclerView2.m9826E(new C10405o(c25022j22));
                listClickableRecyclerView2.setOnListClickListener(new C10406p(c25022j22));
                Context context4 = listClickableRecyclerView2.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                listClickableRecyclerView2.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context4, 0, false, false, 14, null));
                C31159d0 c31159d0 = new C31159d0(null, null, 3, null);
                listClickableRecyclerView2.setAdapter(c31159d0);
                c31159d0.m151537Q(new C10407q());
                this.f53196F0 = c31159d0;
                ViewPager viewPager = c25022j22.f120003H;
                AbstractC19074t.m100207e(viewPager, "viePager");
                C17487o0 m92649TI = m92649TI();
                AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
                C18707e c18707e = new C18707e(viewPager, m92649TI);
                this.f53197G0 = c18707e;
                viewPager.setAdapter(c18707e);
                C18707e c18707e2 = this.f53197G0;
                AbstractC19074t.m100205c(c18707e2);
                viewPager.setOffscreenPageLimit(c18707e2.mo35335g());
                viewPager.addOnPageChangeListener(new C10396f(viewPager, this));
                PageBar pageBar = c25022j22.f120005q;
                pageBar.setOnDrawIndicatorListener(new C10397g(pageBar, pageBar.getContext()));
                ViewPager viewPager2 = c25022j22.f120003H;
                AbstractC19074t.m100207e(viewPager2, "viePager");
                pageBar.setupWithViewPager(viewPager2);
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null && (string = m92642L3.getString("KEYWORD")) != null) {
                    m127128x = AbstractC24341v.m127128x(string);
                    if (!(!m127128x)) {
                        string = null;
                    }
                    if (string != null) {
                        c25022j22.f120010v.setText(string);
                        m54814nL(this, 0, 1, null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: ak */
    public void mo54820ak(String str, Throwable th2) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        C18707e c18707e = this.f53197G0;
        if (c18707e != null) {
            int mo35335g = c18707e.mo35335g();
            for (int i11 = 0; i11 < mo35335g; i11++) {
                c18707e.m98655D(i11, str, th2);
            }
        }
        this.f53193C0 = 4;
    }

    @Override // m20.InterfaceC22759j1
    /* renamed from: b */
    public void mo54821b(boolean z11) {
        List m151570O;
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null && z11) {
            C31163f0 c31163f0 = this.f53195E0;
            if (c31163f0 != null && (m151570O = c31163f0.m151570O()) != null && m151570O.size() == 0) {
                this.f53192B0.mo53441Y7();
            }
            if (this.f53193C0 == 1) {
                EnterActionEditText enterActionEditText = c25022j2.f120010v;
                enterActionEditText.setText(enterActionEditText.getText());
            }
            if (this.f53193C0 == 4) {
                m54823iL();
            }
        }
    }

    /* renamed from: hL */
    public final void m54822hL(int i11) {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null && c25022j2.f120003H.getCurrentItem() != i11) {
            c25022j2.f120003H.setCurrentItem(i11);
        }
    }

    /* renamed from: iL */
    public final void m54823iL() {
        C25022j2 c25022j2 = (C25022j2) m55556SK();
        if (c25022j2 != null) {
            m54810jL(c25022j2.f120010v.getText().toString(), c25022j2.f120003H.getCurrentItem());
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        Editable editable;
        EnterActionEditText enterActionEditText;
        AbstractC19074t.m100208f(bVar, "extras");
        if (m92642L3() != null) {
            C25022j2 c25022j2 = (C25022j2) m55556SK();
            if (c25022j2 != null && (enterActionEditText = c25022j2.f120010v) != null) {
                editable = enterActionEditText.getText();
            } else {
                editable = null;
            }
            bVar.m111023b(0, String.valueOf(editable));
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C25022j2 c25022j2 = (C25022j2) m55556SK();
            if (c25022j2 != null && (imageView = c25022j2.f120007s) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        String str;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Object m111022a = bVar.m111022a(0);
            if (m111022a instanceof String) {
                str = (String) m111022a;
            } else {
                str = null;
            }
            if (str != null) {
                m92642L3.putString("KEYWORD", str);
            }
        }
    }
}
