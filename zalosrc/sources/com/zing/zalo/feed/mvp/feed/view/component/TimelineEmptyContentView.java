package com.zing.zalo.feed.mvp.feed.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.HorizontalAvatar;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p425po.C24894p;
import p425po.C24896r;
import p425po.InterfaceC24895q;
import p542ub.InterfaceC27218a;
import p649xl.C29943n7;
import qm0.AbstractC25370t;

/* loaded from: classes4.dex */
public final class TimelineEmptyContentView extends RelativeLayout {

    /* renamed from: p */
    private C29943n7 f46290p;

    /* renamed from: q */
    private final C23528a f46291q;

    /* renamed from: r */
    private InterfaceC8571a f46292r;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8571a {
        /* renamed from: vB */
        void mo45636vB(C24894p c24894p);
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView$b */
    /* loaded from: classes4.dex */
    public static final class C8572b extends C23999j {
        C8572b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (c3979l.m18849m()) {
                    interfaceC3968a.setImageInfo(c3979l);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public TimelineEmptyContentView(Context context) {
        super(context);
        this.f46291q = new C23528a(getContext());
        m45692g(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m45687c(TimelineEmptyContentView timelineEmptyContentView, C24894p c24894p, View view) {
        AbstractC19074t.m100208f(timelineEmptyContentView, "this$0");
        InterfaceC8571a interfaceC8571a = timelineEmptyContentView.f46292r;
        if (interfaceC8571a != null) {
            interfaceC8571a.mo45636vB(c24894p);
        }
    }

    /* renamed from: d */
    private final void m45688d(InterfaceC24895q interfaceC24895q) {
        int m131511r;
        C29943n7 c29943n7 = this.f46290p;
        C29943n7 c29943n72 = null;
        if (c29943n7 == null) {
            AbstractC19074t.m100223u("binding");
            c29943n7 = null;
        }
        c29943n7.f138770s.removeAllViews();
        if (interfaceC24895q instanceof C24896r) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            HorizontalAvatar horizontalAvatar = new HorizontalAvatar(context, null);
            C24896r c24896r = (C24896r) interfaceC24895q;
            List<ContactProfile> m129463a = c24896r.m129463a();
            m131511r = AbstractC25370t.m131511r(m129463a, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            for (ContactProfile contactProfile : m129463a) {
                arrayList.add(new C16948d(2, contactProfile.f42434r, contactProfile.f42427o1, contactProfile.f42446v));
            }
            horizontalAvatar.m90578d(arrayList, c24896r.m129463a().size());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(14);
            horizontalAvatar.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f));
            relativeLayout.setLayoutParams(layoutParams2);
            relativeLayout.addView(horizontalAvatar);
            C29943n7 c29943n73 = this.f46290p;
            if (c29943n73 == null) {
                AbstractC19074t.m100223u("binding");
                c29943n73 = null;
            }
            c29943n73.f138770s.addView(relativeLayout);
        }
        C29943n7 c29943n74 = this.f46290p;
        if (c29943n74 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29943n72 = c29943n74;
        }
        c29943n72.f138770s.setVisibility(0);
    }

    /* renamed from: e */
    private final int m45689e(boolean z11) {
        return z11 ? 0 : 8;
    }

    /* renamed from: f */
    private final void m45690f() {
        C29943n7 c29943n7 = this.f46290p;
        if (c29943n7 == null) {
            AbstractC19074t.m100223u("binding");
            c29943n7 = null;
        }
        c29943n7.f138770s.setVisibility(8);
    }

    private final void setActivityForCallbackSpanText(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return;
        }
        Object context = getContext();
        if ((charSequence instanceof SpannableString) && (context instanceof InterfaceC27218a)) {
            C10866e[] c10866eArr = (C10866e[]) ((SpannableString) charSequence).getSpans(0, charSequence.length(), C10866e.class);
            if (c10866eArr != null) {
                for (C10866e c10866e : c10866eArr) {
                    c10866e.m56365I((InterfaceC27218a) context);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m45691b(final C24894p c24894p) {
        boolean z11;
        if (c24894p == null) {
            return;
        }
        C29943n7 c29943n7 = this.f46290p;
        if (c29943n7 == null) {
            AbstractC19074t.m100223u("binding");
            c29943n7 = null;
        }
        boolean z12 = false;
        if (getLayoutParams() != null) {
            if (c24894p.m129453q()) {
                c29943n7.f138772u.setGravity(16);
                getLayoutParams().height = -1;
            } else {
                c29943n7.f138772u.setGravity(0);
                getLayoutParams().height = -2;
            }
        }
        c29943n7.f138772u.setVisibility(m45689e(c24894p.m129418C()));
        if (c24894p.m129455s()) {
            c29943n7.f138772u.setBackgroundColor(C23212s8.m119607o(getContext(), c24894p.m129439c()));
        }
        c29943n7.f138776y.setVisibility(m45689e(c24894p.m129417B()));
        c29943n7.f138776y.setMovementMethod(CustomMovementMethod.m56305e());
        setActivityForCallbackSpanText(c24894p.m129452p());
        c29943n7.f138776y.setText(c24894p.m129452p());
        c29943n7.f138775x.setVisibility(m45689e(c24894p.m129459w()));
        c29943n7.f138775x.setMovementMethod(CustomMovementMethod.m56305e());
        setActivityForCallbackSpanText(c24894p.m129444h());
        c29943n7.f138775x.setText(c24894p.m129444h());
        c29943n7.f138775x.setTextColor(C23212s8.m119607o(getContext(), c24894p.m129445i()));
        AspectRatioImageView aspectRatioImageView = c29943n7.f138771t;
        if (!c24894p.m129454r() && !c24894p.m129461y() && !c24894p.m129462z()) {
            z11 = false;
        } else {
            z11 = true;
        }
        aspectRatioImageView.setVisibility(m45689e(z11));
        if (c24894p.m129462z() && c24894p.m129448l().length() > 0) {
            C8572b c8572b = new C8572b();
            c8572b.m125762H1(AbstractC23006a0.f111912c);
            ((C23528a) this.f46291q.m123612r(c29943n7.f138771t)).m123583G(c24894p.m129448l(), C23278z2.m120086O().f116275p, C23278z2.m120086O().f116276q, 0, 0, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.im_empty_list), c8572b, C23278z2.m120086O().f116266g);
        } else if (c24894p.m129454r() && c24894p.m129449m() != 0) {
            c29943n7.f138771t.setImageResource(C23212s8.m119611s(getContext(), c24894p.m129449m()));
        } else if (c24894p.m129461y() && c24894p.m129447k() != 0) {
            c29943n7.f138771t.setImageDrawable(AbstractC23136l9.m118665N(getContext(), c24894p.m129447k()));
        }
        if (c24894p.m129416A()) {
            c29943n7.f138771t.getLayoutParams().width = c24894p.m129450n();
        } else {
            c29943n7.f138771t.getLayoutParams().width = -2;
        }
        if (c24894p.m129457u()) {
            c29943n7.f138768q.setSupportiveIcon(c24894p.m129442f());
        } else {
            c29943n7.f138768q.setSupportiveIcon((Drawable) null);
        }
        Button button = c29943n7.f138768q;
        if (c24894p.m129456t() && c24894p.m129440d().length() > 0) {
            z12 = true;
        }
        button.setVisibility(m45689e(z12));
        c29943n7.f138768q.setText(c24894p.m129440d());
        if (c24894p.m129456t()) {
            if (c29943n7.f138768q.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = c29943n7.f138768q.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c24894p.m129451o();
            }
            c29943n7.f138768q.setIdTracking(c24894p.m129441e());
            c29943n7.f138768q.setOnClickListener(new View.OnClickListener() { // from class: yo.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TimelineEmptyContentView.m45687c(TimelineEmptyContentView.this, c24894p, view);
                }
            });
        }
        if (c24894p.m129458v()) {
            c29943n7.f138768q.m90539c(c24894p.m129443g());
        }
        if (c24894p.m129460x()) {
            InterfaceC24895q m129446j = c24894p.m129446j();
            if (m129446j != null) {
                m45688d(m129446j);
                return;
            }
            return;
        }
        m45690f();
    }

    /* renamed from: g */
    public final void m45692g(Context context) {
        C29943n7 m148279c = C29943n7.m148279c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148279c, "inflate(...)");
        this.f46290p = m148279c;
    }

    public final InterfaceC8571a getEmptyContentListener() {
        return this.f46292r;
    }

    public final void setEmptyContentListener(InterfaceC8571a interfaceC8571a) {
        this.f46292r = interfaceC8571a;
    }

    public TimelineEmptyContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46291q = new C23528a(getContext());
        m45692g(context);
    }
}
