package com.zing.zalo.feed.uicontrols.suggestcomment;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import org.json.JSONObject;
import p361nb.C23648e;

/* loaded from: classes4.dex */
public final class SuggestCommentView extends RelativeLayout {
    public static final C8889a Companion = new C8889a(null);

    /* renamed from: A */
    private int f47556A;

    /* renamed from: p */
    private final RelativeLayout f47557p;

    /* renamed from: q */
    private final LinearLayoutManager f47558q;

    /* renamed from: r */
    private final RelativeLayout f47559r;

    /* renamed from: s */
    private final RecyclerView f47560s;

    /* renamed from: t */
    private final C8890a f47561t;

    /* renamed from: u */
    private final View f47562u;

    /* renamed from: v */
    private final View f47563v;

    /* renamed from: w */
    private final View f47564w;

    /* renamed from: x */
    private boolean f47565x;

    /* renamed from: y */
    private InterfaceC2259a f47566y;

    /* renamed from: z */
    private boolean f47567z;

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView$a */
    /* loaded from: classes4.dex */
    public static final class C8889a {
        private C8889a() {
        }

        public /* synthetic */ C8889a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f47557p = relativeLayout;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
        this.f47558q = noPredictiveItemAnimLinearLayoutMngr;
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.f47559r = relativeLayout2;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f47560s = recyclerView;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C8890a c8890a = new C8890a(context2);
        this.f47561t = c8890a;
        View view = new View(getContext());
        this.f47562u = view;
        View view2 = new View(getContext());
        this.f47563v = view2;
        View view3 = new View(getContext());
        this.f47564w = view3;
        this.f47556A = 10;
        view.setBackground(AbstractC23136l9.m118665N(view.getContext(), AbstractC16803z.comment_preview_shadow));
        view.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC23136l9.m118736p(AbstractC16802y.preview_comment_shadow_height));
        layoutParams.addRule(10);
        addView(view, layoutParams);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutAnimation(null);
        recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        recyclerView.setOverScrollMode(2);
        recyclerView.m9816A(new C8891b(this));
        c8890a.m9999J(true);
        recyclerView.setAdapter(c8890a);
        relativeLayout2.addView(recyclerView, new RelativeLayout.LayoutParams(-1, AbstractC23136l9.m118736p(AbstractC16802y.suggest_comment_list_height)));
        int m119607o = C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor);
        int m119607o2 = C23212s8.m119607o(getContext(), AbstractC16781w.HeaderBottomLineColor);
        int gradientWidth = getGradientWidth();
        int gradientHeight = getGradientHeight();
        Drawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{m119607o, m119607o2});
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(gradientWidth, gradientHeight);
        layoutParams2.addRule(9);
        view2.setBackground(gradientDrawable);
        relativeLayout2.addView(view2, layoutParams2);
        Drawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{m119607o, m119607o2});
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(gradientWidth, gradientHeight);
        layoutParams3.addRule(11);
        view3.setBackground(gradientDrawable2);
        relativeLayout2.addView(view3, layoutParams3);
        relativeLayout.addView(relativeLayout2, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(3, view.getId());
        addView(relativeLayout, layoutParams4);
        recyclerView.m9826E(new C8892c(this));
    }

    /* renamed from: c */
    private final void m47440c() {
        this.f47562u.setVisibility(0);
    }

    /* renamed from: d */
    private final void m47441d() {
        this.f47562u.setVisibility(8);
        this.f47560s.getLayoutParams();
    }

    /* renamed from: g */
    private final void m47442g() {
        int i11 = this.f47556A;
        if (i11 == 10) {
            m47441d();
        } else if (i11 == 11) {
            m47440c();
        }
    }

    private final int getGradientHeight() {
        int i11;
        if (this.f47567z) {
            i11 = AbstractC16802y.feed_comment_input_box_height;
        } else {
            i11 = AbstractC16802y.suggest_comment_list_height;
        }
        return AbstractC23136l9.m118736p(i11);
    }

    private final int getGradientWidth() {
        if (this.f47567z) {
            return AbstractC23222t7.f112586t;
        }
        return AbstractC23136l9.m118736p(AbstractC16802y.suggest_comment_gradient_width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m47443h() {
        int m9745c2 = this.f47558q.m9745c2();
        int m47463X = this.f47561t.m47463X();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tc", m47463X);
        jSONObject.put("lvp", m9745c2 + 1);
        C0815e1.m2075D().m2100V(new C23648e(14, "", 1, "swipe_suggest_comment", jSONObject.toString()), false);
    }

    /* renamed from: e */
    public final void m47444e() {
        this.f47561t.m47458S();
    }

    /* renamed from: f */
    public final boolean m47445f() {
        return this.f47561t.m47464Y();
    }

    public final int getContentType() {
        return this.f47561t.m47459T();
    }

    public final InterfaceC2259a getFeedCallback() {
        return this.f47566y;
    }

    public final int getMode() {
        return this.f47556A;
    }

    /* renamed from: i */
    public final void m47446i() {
        this.f47561t.m10008p();
    }

    /* renamed from: j */
    public final void m47447j(List list, String str, boolean z11) {
        AbstractC19074t.m100208f(list, "listSuggestComment");
        AbstractC19074t.m100208f(str, "feedId");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.f47561t.m47468e0(arrayList, str, z11);
        this.f47561t.m10008p();
    }

    /* renamed from: k */
    public final void m47448k(List list, String str, boolean z11, C3020p0 c3020p0, C3000l0 c3000l0) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(list, "listSuggestComment");
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        int i13 = 0;
        this.f47557p.setVisibility(0);
        setVisibility(0);
        this.f47561t.m47469f0(arrayList, str, z11, c3020p0, c3000l0, this.f47567z);
        this.f47561t.m10008p();
        ViewGroup.LayoutParams layoutParams = this.f47560s.getLayoutParams();
        if (this.f47567z) {
            i11 = AbstractC23136l9.m118736p(AbstractC16802y.feed_comment_input_box_height);
        } else if (arrayList.size() > 0) {
            i11 = AbstractC23136l9.m118736p(AbstractC16802y.suggest_comment_list_height);
        } else {
            this.f47557p.setVisibility(8);
            setVisibility(8);
            i11 = 0;
        }
        layoutParams.height = i11;
        View view = this.f47563v;
        if (!arrayList.isEmpty()) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        view.setVisibility(i12);
        View view2 = this.f47564w;
        if (!(!arrayList.isEmpty())) {
            i13 = 4;
        }
        view2.setVisibility(i13);
        if (this.f47567z) {
            this.f47563v.setVisibility(8);
            this.f47564w.setVisibility(8);
        }
    }

    public final void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f47566y = interfaceC2259a;
        this.f47561t.m47470g0(interfaceC2259a);
    }

    public final void setMode(int i11) {
        this.f47556A = i11;
        m47442g();
    }

    public final void setOnSuggestCommentClickListener(C8890a.f fVar) {
        AbstractC19074t.m100208f(fVar, "listener");
        this.f47561t.m47471h0(fVar);
    }

    public final void setScrolling(boolean z11) {
        this.f47565x = z11;
        this.f47561t.m47472i0(z11);
    }

    public final void setShowInput(boolean z11) {
        this.f47567z = z11;
    }
}
