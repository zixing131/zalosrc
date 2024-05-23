package com.zing.zalo.feed.mvp.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bo.InterfaceC3045u2;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserSectionView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19074t;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p425po.AbstractC24884f;
import p425po.AbstractC24888j;
import p649xl.C29726b6;

/* loaded from: classes4.dex */
public final class MoveTabUserSectionView extends LinearLayout {

    /* renamed from: p */
    private C29726b6 f46270p;

    /* renamed from: q */
    private InterfaceC3045u2 f46271q;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserSectionView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8567a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46272a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46273b;

        static {
            int[] iArr = new int[AbstractC24888j.a.values().length];
            try {
                iArr[AbstractC24888j.a.f119418p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC24888j.a.f119419q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46272a = iArr;
            int[] iArr2 = new int[AbstractC24884f.c.values().length];
            try {
                iArr2[AbstractC24884f.c.f119395p.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AbstractC24884f.c.f119396q.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AbstractC24884f.c.f119397r.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f46273b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserSectionView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m45666h(context);
    }

    /* renamed from: d */
    private final void m45661d(C29726b6 c29726b6, final AbstractC24888j abstractC24888j) {
        if (abstractC24888j instanceof AbstractC24884f) {
            int i11 = C8567a.f46273b[((AbstractC24884f) abstractC24888j).mo129393e().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c29726b6.f137305q.setSupportiveIcon(AbstractC23322a.zds_ic_chevron_down_line_16);
                        c29726b6.f137305q.setVisibility(0);
                    }
                } else {
                    c29726b6.f137305q.setSupportiveIcon(AbstractC23322a.zds_ic_chevron_up_line_16);
                    c29726b6.f137305q.setVisibility(0);
                }
            } else {
                c29726b6.f137305q.setVisibility(8);
            }
            Button button = c29726b6.f137305q;
            AbstractC19074t.m100207e(button, "expandableIcon");
            C29726b6 c29726b62 = null;
            if (button.getVisibility() == 0) {
                C29726b6 c29726b63 = this.f46270p;
                if (c29726b63 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29726b63 = null;
                }
                c29726b63.f137305q.setOnClickListener(new View.OnClickListener() { // from class: xo.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoveTabUserSectionView.m45662e(MoveTabUserSectionView.this, abstractC24888j, view);
                    }
                });
                C29726b6 c29726b64 = this.f46270p;
                if (c29726b64 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29726b62 = c29726b64;
                }
                c29726b62.f137306r.setOnClickListener(new View.OnClickListener() { // from class: xo.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoveTabUserSectionView.m45663f(MoveTabUserSectionView.this, abstractC24888j, view);
                    }
                });
                return;
            }
            C29726b6 c29726b65 = this.f46270p;
            if (c29726b65 == null) {
                AbstractC19074t.m100223u("binding");
                c29726b65 = null;
            }
            c29726b65.f137305q.setOnClickListener(null);
            C29726b6 c29726b66 = this.f46270p;
            if (c29726b66 == null) {
                AbstractC19074t.m100223u("binding");
                c29726b66 = null;
            }
            c29726b66.f137306r.setOnClickListener(null);
            return;
        }
        c29726b6.f137305q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m45662e(MoveTabUserSectionView moveTabUserSectionView, AbstractC24888j abstractC24888j, View view) {
        AbstractC19074t.m100208f(moveTabUserSectionView, "this$0");
        AbstractC19074t.m100208f(abstractC24888j, "$data");
        InterfaceC3045u2 interfaceC3045u2 = moveTabUserSectionView.f46271q;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new AbstractC24884f.a((AbstractC24884f) abstractC24888j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m45663f(MoveTabUserSectionView moveTabUserSectionView, AbstractC24888j abstractC24888j, View view) {
        AbstractC19074t.m100208f(moveTabUserSectionView, "this$0");
        AbstractC19074t.m100208f(abstractC24888j, "$data");
        InterfaceC3045u2 interfaceC3045u2 = moveTabUserSectionView.f46271q;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new AbstractC24884f.b((AbstractC24884f) abstractC24888j));
        }
    }

    /* renamed from: g */
    private final void m45664g(C29726b6 c29726b6, AbstractC24888j abstractC24888j) {
        c29726b6.f137308t.setText(abstractC24888j.mo129410d());
        int i11 = C8567a.f46272a[abstractC24888j.mo129391b().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                c29726b6.f137308t.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
                c29726b6.f137308t.setTextStyleBold(true);
                c29726b6.f137307s.setVisibility(8);
                return;
            }
            return;
        }
        c29726b6.f137308t.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.section_label));
        c29726b6.f137308t.setTextStyleBold(true);
        if (abstractC24888j instanceof AbstractC24884f) {
            AbstractC24884f abstractC24884f = (AbstractC24884f) abstractC24888j;
            if (abstractC24884f.mo129394f().length() > 0) {
                c29726b6.f137307s.setVisibility(0);
                c29726b6.f137307s.setText(abstractC24884f.mo129394f());
                return;
            }
        }
        c29726b6.f137307s.setVisibility(8);
    }

    /* renamed from: c */
    public final void m45665c(AbstractC24888j abstractC24888j) {
        if (abstractC24888j == null) {
            return;
        }
        C29726b6 c29726b6 = this.f46270p;
        if (c29726b6 == null) {
            AbstractC19074t.m100223u("binding");
            c29726b6 = null;
        }
        m45664g(c29726b6, abstractC24888j);
        m45661d(c29726b6, abstractC24888j);
    }

    public final InterfaceC3045u2 getListener() {
        return this.f46271q;
    }

    /* renamed from: h */
    public final void m45666h(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C29726b6 m147762c = C29726b6.m147762c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147762c, "inflate(...)");
        this.f46270p = m147762c;
        if (m147762c == null) {
            AbstractC19074t.m100223u("binding");
            m147762c = null;
        }
        m147762c.f137305q.setIdTracking("timeline_manage_user_tab_other_section_row_expand_button");
    }

    public final void setListener(InterfaceC3045u2 interfaceC3045u2) {
        this.f46271q = interfaceC3045u2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m45666h(context);
    }
}
