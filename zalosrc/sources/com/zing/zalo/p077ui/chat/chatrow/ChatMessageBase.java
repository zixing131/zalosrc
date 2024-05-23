package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import dj.C17945a0;
import me0.AbstractC23136l9;
import x50.C29383a;
import x50.C29384b;
import x50.C29385c;

/* loaded from: classes5.dex */
public class ChatMessageBase extends LinearLayout {

    /* renamed from: G */
    private static final int f57160G = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: H */
    protected static float f57161H = AbstractC23136l9.m118742r(20.0f);

    /* renamed from: A */
    private C29384b f57162A;

    /* renamed from: B */
    private boolean f57163B;

    /* renamed from: C */
    private C29383a f57164C;

    /* renamed from: D */
    protected int f57165D;

    /* renamed from: E */
    protected InterfaceC11530v f57166E;

    /* renamed from: F */
    ChatMessageBase f57167F;

    /* renamed from: p */
    private final String f57168p;

    /* renamed from: q */
    private int f57169q;

    /* renamed from: r */
    private int f57170r;

    /* renamed from: s */
    private boolean f57171s;

    /* renamed from: t */
    private int f57172t;

    /* renamed from: u */
    private boolean f57173u;

    /* renamed from: v */
    protected C29385c f57174v;

    /* renamed from: w */
    private String f57175w;

    /* renamed from: x */
    private boolean f57176x;

    /* renamed from: y */
    private boolean f57177y;

    /* renamed from: z */
    private C29384b f57178z;

    public ChatMessageBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57168p = ChatMessageBase.class.getSimpleName();
        this.f57171s = false;
        this.f57172t = 0;
        this.f57173u = false;
        this.f57163B = false;
        this.f57166E = null;
        this.f57167F = this;
    }

    /* renamed from: b */
    private void m60893b() {
        int i11 = f57160G;
        if (this.f57163B) {
            if (this.f57164C == null) {
                this.f57164C = new C29383a(this);
            }
            i11 += this.f57164C.m146523b();
        }
        if (this.f57176x) {
            m60894c();
            i11 += this.f57178z.m146531h();
        }
        if (this.f57177y) {
            m60895d();
            i11 += this.f57162A.m146531h();
        }
        if (this.f57173u) {
            C29385c c29385c = this.f57174v;
            if (c29385c == null) {
                this.f57174v = new C29385c(this.f57175w);
            } else {
                c29385c.m146547i(this.f57175w);
            }
            this.f57174v.m146546h(i11);
            i11 += this.f57174v.m146543e();
        }
        if (this.f57171s) {
            i11 += this.f57172t;
        }
        if (getPaddingTop() != i11) {
            setPadding(getPaddingLeft(), i11, getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: c */
    private void m60894c() {
        C29383a c29383a;
        if (this.f57178z == null) {
            C29384b c29384b = new C29384b(getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_marker_unread));
            this.f57178z = c29384b;
            c29384b.m146534k(this.f57169q);
            this.f57178z.m146535l(AbstractC23136l9.m118722k0() - this.f57170r);
        }
        if (this.f57163B && (c29383a = this.f57164C) != null) {
            this.f57178z.m146536m(c29383a.m146523b());
        }
    }

    /* renamed from: d */
    private void m60895d() {
        C29383a c29383a;
        if (this.f57162A == null) {
            C29384b c29384b = new C29384b(getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_marker_where_left));
            this.f57162A = c29384b;
            c29384b.m146534k(this.f57169q);
            this.f57162A.m146535l(AbstractC23136l9.m118722k0() - this.f57170r);
        }
        if (this.f57163B && (c29383a = this.f57164C) != null) {
            this.f57162A.m146536m(c29383a.m146523b());
        }
    }

    /* renamed from: a */
    public void m60896a(Context context) {
        setWillNotDraw(false);
        this.f57172t = AbstractC23136l9.m118712h(context, 9.0f);
        this.f57175w = context.getResources().getString(AbstractC8020f0.str_default_formattime);
        this.f57169q = AbstractC23136l9.m118712h(context, 12.0f);
        this.f57170r = AbstractC23136l9.m118712h(context, 12.0f);
        m60893b();
    }

    /* renamed from: e */
    public void m60897e(C17945a0 c17945a0) {
        if (this.f57166E.mo62079c4(c17945a0.m95029V3()).f133309e) {
            setShowDateTimeHeader(true);
            setDateTimeHeaderText(c17945a0.m94965O2());
        } else {
            setShowDateTimeHeader(false);
        }
        setShowUnreadSeparator(this.f57166E.mo62079c4(c17945a0.m95029V3()).f133316l);
        setShowWhereLeftSeparator(this.f57166E.mo62079c4(c17945a0.m95029V3()).f133317m);
        setShowLoadingMarker(this.f57166E.mo62079c4(c17945a0.m95029V3()).f133318n);
        setShowChatRowSpacing(this.f57166E.mo62079c4(c17945a0.m95029V3()).f133311g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        C29385c c29385c;
        C29384b c29384b;
        C29384b c29384b2;
        C29383a c29383a;
        super.onDraw(canvas);
        if (this.f57163B && (c29383a = this.f57164C) != null) {
            c29383a.m146522a(canvas);
            i11 = this.f57164C.m146523b();
        } else {
            i11 = 0;
        }
        if (this.f57176x && (c29384b2 = this.f57178z) != null) {
            c29384b2.m146530c(canvas);
            i11 += this.f57178z.m146531h();
        }
        if (this.f57177y && (c29384b = this.f57162A) != null) {
            c29384b.m146530c(canvas);
            i11 += this.f57162A.m146531h();
        }
        int i12 = i11;
        if (this.f57173u && (c29385c = this.f57174v) != null) {
            c29385c.m146545g(0, 0, getWidth(), getHeight(), i12);
            this.f57174v.m146542a(canvas);
        }
    }

    public void setDateTimeHeaderText(String str) {
        if (!this.f57175w.equals(str)) {
            this.f57175w = str;
            m60893b();
        }
    }

    public void setDelegate(InterfaceC11530v interfaceC11530v) {
        this.f57166E = interfaceC11530v;
    }

    public void setShowChatRowSpacing(boolean z11) {
        if (this.f57171s != z11) {
            this.f57171s = z11;
            m60893b();
        }
    }

    public void setShowDateTimeHeader(boolean z11) {
        if (this.f57173u != z11) {
            this.f57173u = z11;
            m60893b();
        }
    }

    public void setShowLoadingMarker(boolean z11) {
        if (this.f57163B != z11) {
            this.f57163B = z11;
            m60893b();
        }
    }

    public void setShowUnreadSeparator(boolean z11) {
        if (this.f57176x != z11) {
            this.f57176x = z11;
            m60893b();
        }
    }

    public void setShowWhereLeftSeparator(boolean z11) {
        if (this.f57177y != z11) {
            this.f57177y = z11;
            m60893b();
        }
    }

    public void setTagPosition(int i11) {
        this.f57165D = i11;
    }
}
