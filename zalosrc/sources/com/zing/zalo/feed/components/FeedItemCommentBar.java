package com.zing.zalo.feed.components;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import au.C2343e;
import bo.C3000l0;
import bo.C3030r0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23999j;
import p588vw.C28652r;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemCommentBar extends RelativeLayout {

    /* renamed from: p */
    protected View f44342p;

    /* renamed from: q */
    protected CircleImage f44343q;

    /* renamed from: r */
    protected RobotoTextView f44344r;

    /* renamed from: s */
    protected RobotoTextView f44345s;

    /* renamed from: t */
    protected View f44346t;

    /* renamed from: u */
    protected C23528a f44347u;

    /* renamed from: v */
    protected int f44348v;

    /* renamed from: w */
    C3030r0 f44349w;

    public FeedItemCommentBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44349w = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m43715e(InterfaceC2259a interfaceC2259a, String str, View view) {
        if (interfaceC2259a != null) {
            try {
                interfaceC2259a.mo11969ta(str);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m43716f() {
        int i11;
        View view = this.f44346t;
        C3030r0 c3030r0 = this.f44349w;
        if (c3030r0 != null && c3030r0.f12215m) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m43717g() {
        AbstractC20789d.m108478l(this.f44349w);
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.b1
            @Override // java.lang.Runnable
            public final void run() {
                FeedItemCommentBar.this.m43716f();
            }
        });
    }

    /* renamed from: d */
    public void m43718d(Context context, int i11) {
        this.f44347u = new C23528a(context);
        this.f44348v = i11;
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_footer_comment_content, this);
            this.f44342p = findViewById(AbstractC6918a0.feed_item_comment_top_divider);
            this.f44343q = (CircleImage) findViewById(AbstractC6918a0.imvCommentAvatar);
            this.f44344r = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentUserName);
            this.f44345s = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentMessage);
            this.f44343q.m87724k(AbstractC23136l9.m118641B(context, AbstractC16801x.cLine1), 0, AbstractC23136l9.m118742r(4.0f));
            View findViewById = findViewById(AbstractC6918a0.icn_avatar_online_status);
            this.f44346t = findViewById;
            ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).setMargins(4, 4, 4, 4);
            setPadding(0, 0, 0, (int) getResources().getDimension(AbstractC16802y.feed_padding_bottom));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: h */
    public void m43719h(C3000l0 c3000l0, int i11, boolean z11, final InterfaceC2259a interfaceC2259a) {
        try {
            this.f44349w = null;
            if (c3000l0 != null && c3000l0.m14324b0(i11) != null) {
                this.f44349w = c3000l0.m14324b0(i11).m14533x();
            }
            View view = this.f44346t;
            int i12 = 8;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.f44349w != null && this.f44348v != 4) {
                this.f44342p.setVisibility(0);
                final String str = this.f44349w.f12209g;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.z0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FeedItemCommentBar.m43715e(InterfaceC2259a.this, str, view2);
                    }
                };
                this.f44343q.setVisibility(0);
                this.f44343q.setOnClickListener(onClickListener);
                ((C23528a) this.f44347u.m123612r(this.f44343q)).m123613s(AbstractC16803z.default_avatar);
                C3030r0 c3030r0 = this.f44349w;
                String m114542i = AbstractC21935u.m114542i(c3030r0.f12209g, c3030r0.f12205c);
                if (!TextUtils.isEmpty(this.f44349w.f12206d)) {
                    if (C23302b.f113247a.m120523d(this.f44349w.f12206d) && !CoreUtility.f89233i.equals(this.f44349w.f12209g)) {
                        int m12307a = C2343e.m12307a(this.f44349w.f12209g, false);
                        this.f44343q.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), m12307a));
                    } else if (!z11 || C23999j.m125696L2(this.f44349w.f12206d, C23278z2.m120143n())) {
                        ((C23528a) this.f44347u.m123612r(this.f44343q)).m123619y(this.f44349w.f12206d, C23278z2.m120143n(), 10);
                    }
                }
                C3030r0 c3030r02 = this.f44349w;
                this.f44344r.setText(AbstractC21935u.m114542i(c3030r02.f12209g, c3030r02.f12205c));
                this.f44344r.setVisibility(0);
                this.f44344r.setOnClickListener(onClickListener);
                this.f44345s.setVisibility(0);
                CharSequence m143353D = C28652r.m143349v().m143353D(this.f44349w.f12207e);
                this.f44345s.setText(m143353D);
                if (AbstractC26683d.f126393l) {
                    AbstractC28245z3.m142219b(m143353D, this.f44345s);
                }
                View view2 = this.f44346t;
                if (view2 != null) {
                    C3030r0 c3030r03 = this.f44349w;
                    if (c3030r03 != null && c3030r03.f12215m) {
                        i12 = 0;
                    }
                    view2.setVisibility(i12);
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.feed.components.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedItemCommentBar.this.m43717g();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RobotoTextView robotoTextView;
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l && (robotoTextView = this.f44345s) != null) {
            AbstractC28245z3.m142218a(robotoTextView.getText(), this.f44345s);
        }
    }
}
