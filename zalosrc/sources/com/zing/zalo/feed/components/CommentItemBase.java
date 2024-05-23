package com.zing.zalo.feed.components;

import ae.C0766k;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.CommentItemBase;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i40.AbstractC20276f;
import is.AbstractC20826v0;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l80.C22132g;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p489rn.C25849b;
import p542ub.InterfaceC27218a;
import p716zh.C31839a6;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28100j3;
import vg.C28203u6;

/* loaded from: classes4.dex */
public class CommentItemBase extends LinearLayout {

    /* renamed from: A */
    public TextView f44143A;

    /* renamed from: B */
    public TextView f44144B;

    /* renamed from: C */
    public TextView f44145C;

    /* renamed from: D */
    public View f44146D;

    /* renamed from: E */
    protected C23528a f44147E;

    /* renamed from: F */
    private Context f44148F;

    /* renamed from: G */
    Handler f44149G;

    /* renamed from: H */
    protected C25849b.a f44150H;

    /* renamed from: I */
    public InterfaceC27218a f44151I;

    /* renamed from: J */
    boolean f44152J;

    /* renamed from: K */
    boolean f44153K;

    /* renamed from: L */
    public String f44154L;

    /* renamed from: M */
    InterfaceC10867f f44155M;

    /* renamed from: N */
    boolean f44156N;

    /* renamed from: p */
    public TextView f44157p;

    /* renamed from: q */
    public TextView f44158q;

    /* renamed from: r */
    public TextView f44159r;

    /* renamed from: s */
    public GroupAvatarView f44160s;

    /* renamed from: t */
    public View f44161t;

    /* renamed from: u */
    public ImageView f44162u;

    /* renamed from: v */
    public View f44163v;

    /* renamed from: w */
    public TextView f44164w;

    /* renamed from: x */
    public C22132g f44165x;

    /* renamed from: y */
    public ModulesView f44166y;

    /* renamed from: z */
    public TextView f44167z;

    /* renamed from: com.zing.zalo.feed.components.CommentItemBase$a */
    /* loaded from: classes4.dex */
    class C8073a implements InterfaceC10867f {
        C8073a() {
        }

        @Override // com.zing.zalo.social.controls.InterfaceC10867f
        /* renamed from: Fj */
        public void mo43564Fj(String str, double d11, double d12) {
        }

        @Override // com.zing.zalo.social.controls.InterfaceC10867f
        /* renamed from: wo */
        public void mo43565wo(C10866e c10866e, String str) {
            C25849b.a aVar = CommentItemBase.this.f44150H;
            if (aVar != null) {
                aVar.mo46574f(c10866e);
            }
        }

        @Override // com.zing.zalo.social.controls.InterfaceC10861a
        /* renamed from: yf */
        public void mo43566yf(C28100j3 c28100j3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.CommentItemBase$b */
    /* loaded from: classes4.dex */
    public class C8074b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f44169a;

        /* renamed from: b */
        final /* synthetic */ boolean f44170b;

        /* renamed from: c */
        final /* synthetic */ int f44171c;

        C8074b(C10873l c10873l, boolean z11, int i11) {
            this.f44169a = c10873l;
            this.f44170b = z11;
            this.f44171c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m43569e(C10873l c10873l, boolean z11, int i11) {
            CommentItemBase.this.m43555N(c10873l);
            C25849b.a aVar = CommentItemBase.this.f44150H;
            if (aVar != null) {
                aVar.mo46576g(z11, i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m43570f(C10873l c10873l, C20096c c20096c) {
            int i11 = 1;
            boolean z11 = !c10873l.f54908X;
            c10873l.f54908X = z11;
            int i12 = c10873l.f54909Y;
            if (!z11) {
                i11 = -1;
            }
            c10873l.f54909Y = i12 + i11;
            CommentItemBase.this.m43555N(c10873l);
            C25849b.a aVar = CommentItemBase.this.f44150H;
            if (aVar != null) {
                aVar.mo46573e(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            CommentItemBase commentItemBase = CommentItemBase.this;
            commentItemBase.f44156N = false;
            Handler handler = commentItemBase.f44149G;
            final C10873l c10873l = this.f44169a;
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.d0
                @Override // java.lang.Runnable
                public final void run() {
                    CommentItemBase.C8074b.this.m43570f(c10873l, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            CommentItemBase commentItemBase = CommentItemBase.this;
            commentItemBase.f44156N = false;
            Handler handler = commentItemBase.f44149G;
            final C10873l c10873l = this.f44169a;
            final boolean z11 = this.f44170b;
            final int i11 = this.f44171c;
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.e0
                @Override // java.lang.Runnable
                public final void run() {
                    CommentItemBase.C8074b.this.m43569e(c10873l, z11, i11);
                }
            });
        }
    }

    public CommentItemBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44149G = new Handler(Looper.getMainLooper());
        this.f44154L = "";
        this.f44155M = new C8073a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m43521A(C10873l c10873l, View view) {
        C25849b.a aVar;
        try {
            if (c10873l.m56497w().length() > 0 && (aVar = this.f44150H) != null) {
                aVar.mo46579j(c10873l.m56497w());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ boolean m43522B(int i11, View view) {
        try {
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46582l(i11);
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m43523C(View view) {
        C25849b.a aVar = this.f44150H;
        if (aVar != null) {
            aVar.mo46569a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ boolean m43524D(int i11, View view) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (CustomMovementMethod.m56305e().m56310f()) {
            CustomMovementMethod.m56305e().m56312j();
            return true;
        }
        C25849b.a aVar = this.f44150H;
        if (aVar != null) {
            aVar.mo46582l(i11);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ boolean m43525E(int i11, View view) {
        try {
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46582l(i11);
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m43526F(View view) {
        C25849b.a aVar = this.f44150H;
        if (aVar != null) {
            aVar.mo46569a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m43527G(int i11, int i12, String str, View view) {
        if (i11 != 20 && i12 <= 0 && !TextUtils.isEmpty(str)) {
            AbstractC23647d.m123907q("18500", "");
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46578i(str);
            }
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m43528H(C10873l c10873l, View view) {
        try {
            if (c10873l.m56497w().length() > 0) {
                C25849b.a aVar = this.f44150H;
                if (aVar != null) {
                    aVar.mo46577h(c10873l);
                }
                AbstractC23647d.m123897g("186001");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m43529I(C10873l c10873l, View view) {
        if (c10873l.m56435C() == 2) {
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46581k0(c10873l);
            }
            AbstractC23647d.m123897g("18701");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m43530J(C10873l c10873l, int i11, View view) {
        AbstractC20276f.m105891d(view, 1.8f, 100L, true);
        m43561w(c10873l, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m43531K(C10873l c10873l, View view) {
        C25849b.a aVar = this.f44150H;
        if (aVar != null) {
            aVar.mo46580k(c10873l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m43532L(C10873l c10873l, View view) {
        C25849b.a aVar = this.f44150H;
        if (aVar != null) {
            aVar.mo46580k(c10873l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m43533M(C10873l c10873l) {
        try {
            c10873l.m56496v0(false);
            this.f44153K = false;
            this.f44154L = "";
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    private void m43534O(C10873l c10873l) {
        try {
            int i11 = 8;
            this.f44163v.setVisibility(8);
            this.f44144B.setVisibility(8);
            this.f44159r.setVisibility(8);
            this.f44143A.setVisibility(8);
            this.f44145C.setVisibility(8);
            this.f44167z.setVisibility(8);
            setAlpha(1.0f);
            boolean m56446L = c10873l.m56446L();
            if (m56446L) {
                int m56435C = c10873l.m56435C();
                if (m56435C != 1) {
                    if (m56435C != 2) {
                        if (m56435C != 3) {
                            if (m56435C != 4) {
                            }
                        } else {
                            this.f44159r.setVisibility(0);
                            TextView textView = this.f44143A;
                            if (!c10873l.m56497w().equals(CoreUtility.f89233i)) {
                                i11 = 0;
                            }
                            textView.setVisibility(i11);
                        }
                    } else {
                        this.f44145C.setVisibility(0);
                        this.f44167z.setVisibility(0);
                        setAlpha(0.5f);
                    }
                }
                this.f44163v.setVisibility(0);
                this.f44144B.setVisibility(0);
                setAlpha(0.5f);
            } else {
                this.f44159r.setVisibility(0);
                TextView textView2 = this.f44143A;
                if (!c10873l.m56497w().equals(CoreUtility.f89233i)) {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
            }
            this.f44162u.setEnabled(!m56446L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m43549p(final C10873l c10873l) {
        CharSequence m56431A;
        try {
            if (c10873l.m56447M()) {
                m56431A = c10873l.m56495v();
            } else {
                m56431A = c10873l.m56431A();
            }
            if (m56431A.length() > 0) {
                Iterator it = c10873l.m56477m().iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    c10866e.m56365I(this.f44151I);
                    c10866e.m56378V(new C10866e.a() { // from class: com.zing.zalo.feed.components.a0
                        @Override // com.zing.zalo.social.controls.C10866e.a
                        /* renamed from: a */
                        public final void mo44545a(int i11) {
                            CommentItemBase.this.m43554z(c10873l, i11);
                        }
                    });
                }
                if (AbstractC23309i.m121072J2() && c10873l.m56433B() != null) {
                    m56431A = C31839a6.m152970f(m56431A, c10873l.m56433B(), false, this.f44155M);
                }
                this.f44158q.setVisibility(0);
                this.f44158q.setMovementMethod(CustomMovementMethod.m56305e());
                this.f44158q.setText(m56431A);
                if (AbstractC26683d.f126393l) {
                    AbstractC28245z3.m142219b(m56431A, this.f44158q);
                    return;
                }
                return;
            }
            this.f44158q.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private void m43550q(final C10873l c10873l) {
        try {
            this.f44157p.setText(c10873l.m56485q());
            this.f44157p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentItemBase.this.m43521A(c10873l, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m43551r(C10873l c10873l, final int i11) {
        try {
            if (c10873l.m56493u().length() > 0 && !c10873l.m56493u().equals("0")) {
                setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43526F(view);
                    }
                });
                setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.q
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m43522B;
                        m43522B = CommentItemBase.this.m43522B(i11, view);
                        return m43522B;
                    }
                });
                this.f44158q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43523C(view);
                    }
                });
                this.f44158q.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.s
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m43524D;
                        m43524D = CommentItemBase.this.m43524D(i11, view);
                        return m43524D;
                    }
                });
                this.f44157p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.t
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m43525E;
                        m43525E = CommentItemBase.this.m43525E(i11, view);
                        return m43525E;
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    private void m43552u(C10873l c10873l) {
        this.f44159r.setText(c10873l.m56503z());
    }

    /* renamed from: v */
    private void m43553v(C10873l c10873l, boolean z11, final int i11, final int i12) {
        boolean z12;
        try {
            this.f44160s.setImageResource(AbstractC16803z.default_avatar);
            final String m56497w = c10873l.m56497w();
            String m56483p = c10873l.m56483p();
            this.f44160s.setStateLoadingStory(AbstractC22055v0.m115112B(m56497w));
            this.f44160s.m75736i(AbstractC22055v0.m115116F(m56497w, AbstractC21244b.m110054d(getContext())), AbstractC22055v0.m115115E(m56497w, AbstractC21244b.m110054d(getContext())));
            if (!m56483p.equals("")) {
                this.f44160s.m75731c(C28203u6.f131407a.m141809c(m56497w));
                this.f44160s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43527G(i12, i11, m56497w, view);
                    }
                });
            } else {
                this.f44160s.setOnClickListener(null);
            }
            if (this.f44161t != null) {
                int i13 = 0;
                if (!TextUtils.equals(CoreUtility.f89233i, m56497w) && c10873l.f54906V) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view = this.f44161t;
                if (!z12) {
                    i13 = 8;
                }
                view.setVisibility(i13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m43554z(C10873l c10873l, int i11) {
        C25849b.a aVar;
        if (i11 == 103 && (aVar = this.f44150H) != null) {
            aVar.mo46571c(c10873l.m56493u());
        }
    }

    /* renamed from: N */
    void m43555N(C10873l c10873l) {
        try {
            m43559S(c10873l.f54908X);
            m43560s(c10873l);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public void m43556P(C10873l c10873l) {
        try {
            m43552u(c10873l);
            m43534O(c10873l);
            m43560s(c10873l);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public void m43557Q(C10873l c10873l, boolean z11, int i11, int i12) {
        try {
            m43553v(c10873l, z11, i11, i12);
            m43550q(c10873l);
            m43549p(c10873l);
            m43559S(c10873l.f54908X);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public void m43558R(final C10873l c10873l) {
        try {
            if (!this.f44154L.equals(c10873l.m56493u())) {
                this.f44153K = false;
            }
            if (c10873l.m56450P()) {
                if (!this.f44153K) {
                    this.f44153K = true;
                    this.f44154L = c10873l.m56493u();
                    TransitionDrawable transitionDrawable = (TransitionDrawable) AbstractC1388a.m6964f(this.f44151I.getContext(), AbstractC16803z.bg_highlight_comment);
                    setBackground(transitionDrawable);
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(ZAbstractBase.ZVU_PROCESS_FLUSH);
                    postDelayed(new Runnable() { // from class: com.zing.zalo.feed.components.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommentItemBase.this.m43533M(c10873l);
                        }
                    }, 2000L);
                    return;
                }
                return;
            }
            setBackgroundResource(AbstractC16801x.transparent);
            this.f44153K = false;
            this.f44154L = "";
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    void m43559S(boolean z11) {
        int i11;
        if (this.f44152J) {
            ImageView imageView = this.f44162u;
            if (imageView != null) {
                if (z11) {
                    i11 = AbstractC16803z.icn_social_like_comment_active;
                } else {
                    i11 = AbstractC16803z.icn_social_like_comment;
                }
                imageView.setImageResource(i11);
            }
            AbstractC23136l9.m118744r1(this.f44162u, 0);
            TextView textView = this.f44158q;
            if (textView != null) {
                textView.setPadding(0, AbstractC23222t7.f112554d, 0, 0);
                return;
            }
            return;
        }
        AbstractC23136l9.m118744r1(this.f44162u, 8);
        TextView textView2 = this.f44158q;
        if (textView2 != null) {
            textView2.setPadding(0, AbstractC23222t7.f112554d, AbstractC23222t7.f112572m, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        TextView textView;
        try {
            super.onDetachedFromWindow();
            if (AbstractC26683d.f126393l && (textView = this.f44158q) != null) {
                AbstractC28245z3.m142218a(textView.getText(), this.f44158q);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    void m43560s(C10873l c10873l) {
        int i11;
        try {
            int i12 = 8;
            if (this.f44152J) {
                if (c10873l == null) {
                    AbstractC23136l9.m118744r1(this.f44164w, 8);
                    AbstractC23136l9.m118744r1(this.f44166y, 8);
                    return;
                }
                List m108792W0 = AbstractC20826v0.m108792W0(c10873l.f54910Z);
                if (m108792W0 != null) {
                    i11 = m108792W0.size();
                } else {
                    i11 = 0;
                }
                int i13 = i11 + c10873l.f54909Y;
                if (m108792W0 != null && !m108792W0.isEmpty()) {
                    C22132g c22132g = this.f44165x;
                    if (c22132g != null) {
                        c22132g.m115449r1(m108792W0, i13, false);
                    }
                    AbstractC23136l9.m118744r1(this.f44166y, 0);
                } else {
                    AbstractC23136l9.m118744r1(this.f44166y, 8);
                }
                TextView textView = this.f44164w;
                if (textView != null) {
                    if (i13 > 1) {
                        textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_comment_likes_count_plural, Integer.valueOf(i13)));
                    } else {
                        textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_comment_likes_count_singular, Integer.valueOf(i13)));
                    }
                }
                TextView textView2 = this.f44164w;
                if (i13 > 0) {
                    i12 = 0;
                }
                AbstractC23136l9.m118744r1(textView2, i12);
                return;
            }
            AbstractC23136l9.m118744r1(this.f44166y, 8);
            AbstractC23136l9.m118744r1(this.f44164w, 8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setActivity(InterfaceC27218a interfaceC27218a) {
        this.f44151I = interfaceC27218a;
    }

    public void setCommentListener(C25849b.a aVar) {
        this.f44150H = aVar;
    }

    public void setEnableCommentLike(boolean z11) {
        this.f44152J = z11;
    }

    /* renamed from: w */
    void m43561w(C10873l c10873l, int i11) {
        int i12;
        String str;
        try {
            if (!this.f44156N && c10873l != null && !c10873l.m56446L()) {
                boolean z11 = !c10873l.f54908X;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C8074b(c10873l, z11, i11));
                c10873l.f54908X = z11;
                int i13 = c10873l.f54909Y;
                if (z11) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                c10873l.f54909Y = i13 + i12;
                String str2 = "0";
                if (TextUtils.isEmpty(c10873l.m56487r())) {
                    str = "0";
                } else {
                    str = c10873l.m56487r();
                }
                if (!TextUtils.isEmpty(c10873l.m56491t())) {
                    str2 = c10873l.m56491t();
                }
                this.f44156N = true;
                m43555N(c10873l);
                c0766k.mo1455I9(c10873l.m56493u(), z11, str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public void mo43562x(final C10873l c10873l, final int i11) {
        try {
            TextView textView = this.f44143A;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43528H(c10873l, view);
                    }
                });
            }
            TextView textView2 = this.f44167z;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43529I(c10873l, view);
                    }
                });
            }
            ImageView imageView = this.f44162u;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43530J(c10873l, i11, view);
                    }
                });
            }
            ModulesView modulesView = this.f44166y;
            if (modulesView != null) {
                modulesView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43531K(c10873l, view);
                    }
                });
            }
            TextView textView3 = this.f44164w;
            if (textView3 != null) {
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentItemBase.this.m43532L(c10873l, view);
                    }
                });
            }
            m43551r(c10873l, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public void mo43563y(Context context) {
        GroupAvatarView groupAvatarView;
        this.f44148F = context;
        this.f44147E = new C23528a(context);
        this.f44157p = (TextView) findViewById(AbstractC6918a0.tvUserName);
        this.f44158q = (TextView) findViewById(AbstractC6918a0.tvMessage);
        this.f44160s = (GroupAvatarView) findViewById(AbstractC6918a0.imvAvatar);
        this.f44161t = findViewById(AbstractC6918a0.icn_avatar_online_status);
        this.f44162u = (ImageView) findViewById(AbstractC6918a0.imv_like_comment);
        this.f44159r = (TextView) findViewById(AbstractC6918a0.tvTime);
        this.f44163v = findViewById(AbstractC6918a0.pbUploadingComment);
        this.f44144B = (TextView) findViewById(AbstractC6918a0.tvLoading);
        this.f44143A = (TextView) findViewById(AbstractC6918a0.tvReply);
        this.f44145C = (TextView) findViewById(AbstractC6918a0.tvFailed);
        this.f44167z = (TextView) findViewById(AbstractC6918a0.btnRetry);
        this.f44164w = (TextView) findViewById(AbstractC6918a0.comment_likes_tv);
        this.f44166y = (ModulesView) findViewById(AbstractC6918a0.comment_likes_avt);
        if (this.f44165x == null) {
            C22132g c22132g = new C22132g(getContext(), AbstractC23222t7.f112590v, 3, AbstractC23222t7.f112556e);
            this.f44165x = c22132g;
            ModulesView modulesView = this.f44166y;
            if (modulesView != null) {
                modulesView.mo69681L(c22132g);
            }
        }
        if (this.f44161t != null && (groupAvatarView = this.f44160s) != null) {
            int strokeWidth = groupAvatarView.getStrokeWidth();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f44161t.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.setMargins(strokeWidth, strokeWidth, strokeWidth, strokeWidth);
            }
        }
        View findViewById = findViewById(AbstractC6918a0.imv_comment_unsupport);
        this.f44146D = findViewById;
        findViewById.setVisibility(8);
        this.f44160s.setStrokeDisableColor(AbstractC22055v0.m115162v(context));
    }
}
