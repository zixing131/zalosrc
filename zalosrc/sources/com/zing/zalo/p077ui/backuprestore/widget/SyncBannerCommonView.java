package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import c50.C3295f;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p227i3.C20218v;

/* loaded from: classes5.dex */
public final class SyncBannerCommonView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: A */
    private ImageView f56106A;

    /* renamed from: B */
    private RobotoTextView f56107B;

    /* renamed from: C */
    private RobotoTextView f56108C;

    /* renamed from: D */
    private ImageView f56109D;

    /* renamed from: p */
    private int f56110p;

    /* renamed from: q */
    private CharSequence f56111q;

    /* renamed from: r */
    private boolean f56112r;

    /* renamed from: s */
    private boolean f56113s;

    /* renamed from: t */
    private int f56114t;

    /* renamed from: u */
    private int f56115u;

    /* renamed from: v */
    private int f56116v;

    /* renamed from: w */
    private int f56117w;

    /* renamed from: x */
    private InterfaceC11142a f56118x;

    /* renamed from: y */
    private boolean f56119y;

    /* renamed from: z */
    private LinearLayout f56120z;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncBannerCommonView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11142a {
        /* renamed from: Rf */
        void mo592Rf(View view);

        /* renamed from: x9 */
        void mo596x9(int i11, View view);
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncBannerCommonView$b */
    /* loaded from: classes5.dex */
    public static final class C11143b extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ C3295f f56122q;

        C11143b(C3295f c3295f) {
            this.f56122q = c3295f;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC11142a onSyncBannerListener = SyncBannerCommonView.this.getOnSyncBannerListener();
            if (onSyncBannerListener != null) {
                onSyncBannerListener.mo596x9(this.f56122q.m16719a(), SyncBannerCommonView.this);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setColor(C23212s8.m119607o(SyncBannerCommonView.this.getContext(), AbstractC16781w.AppPrimaryColor));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncBannerCommonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f56111q = "";
        this.f56115u = AbstractC23222t7.f112582r;
        m58392i(context);
    }

    /* renamed from: d */
    private final void m58388d() {
        ImageView imageView = this.f56109D;
        RobotoTextView robotoTextView = null;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconClose");
            imageView = null;
        }
        imageView.setOnClickListener(this);
        RobotoTextView robotoTextView2 = this.f56108C;
        if (robotoTextView2 == null) {
            AbstractC19074t.m100223u("tvAction");
        } else {
            robotoTextView = robotoTextView2;
        }
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: d50.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncBannerCommonView.m58389e(SyncBannerCommonView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m58389e(SyncBannerCommonView syncBannerCommonView, View view) {
        AbstractC19074t.m100208f(syncBannerCommonView, "this$0");
        ImageView imageView = syncBannerCommonView.f56109D;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconClose");
            imageView = null;
        }
        imageView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m58390g(SyncBannerCommonView syncBannerCommonView, View view) {
        AbstractC19074t.m100208f(syncBannerCommonView, "this$0");
        ImageView imageView = syncBannerCommonView.f56109D;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconClose");
            imageView = null;
        }
        imageView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m58391h(SyncBannerCommonView syncBannerCommonView, C3295f c3295f, View view) {
        AbstractC19074t.m100208f(syncBannerCommonView, "this$0");
        AbstractC19074t.m100208f(c3295f, "$it");
        InterfaceC11142a interfaceC11142a = syncBannerCommonView.f56118x;
        if (interfaceC11142a != null) {
            interfaceC11142a.mo596x9(c3295f.m16719a(), syncBannerCommonView);
        }
    }

    /* renamed from: i */
    private final void m58392i(Context context) {
        View.inflate(context, AbstractC7409c0.sync_banner_layout, this);
        setMinimumHeight(AbstractC23222t7.f112539R);
        setPadding(AbstractC23222t7.f112586t, 0, 0, 0);
        View findViewById = findViewById(AbstractC6918a0.icon_result);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f56106A = (ImageView) findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.tvAction);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f56108C = (RobotoTextView) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.txt_msg);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        RobotoTextView robotoTextView = (RobotoTextView) findViewById3;
        this.f56107B = robotoTextView;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("txtMsg");
            robotoTextView = null;
        }
        robotoTextView.setMovementMethod(CustomMovementMethod.m56305e());
        View findViewById4 = findViewById(AbstractC6918a0.icon_close);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f56109D = (ImageView) findViewById4;
        View findViewById5 = findViewById(AbstractC6918a0.containerMsg);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f56120z = (LinearLayout) findViewById5;
        m58388d();
    }

    /* renamed from: f */
    public final void m58393f(final C3295f c3295f) {
        CharSequence charSequence;
        boolean m127149O;
        String str;
        int i11;
        SpannableString spannableString;
        boolean m127149O2;
        String str2;
        int i12;
        SpannableString spannableString2;
        boolean m127149O3;
        String m127114D;
        String m127114D2;
        String m127114D3;
        AbstractC19074t.m100208f(c3295f, "syncTextSpanInfo");
        RobotoTextView robotoTextView = null;
        if (AbstractC3489d.m17501i() && !this.f56119y) {
            setHasIconClose(false);
            RobotoTextView robotoTextView2 = this.f56108C;
            if (robotoTextView2 == null) {
                AbstractC19074t.m100223u("tvAction");
                robotoTextView2 = null;
            }
            robotoTextView2.setVisibility(0);
            RobotoTextView robotoTextView3 = this.f56108C;
            if (robotoTextView3 == null) {
                AbstractC19074t.m100223u("tvAction");
                robotoTextView3 = null;
            }
            robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: d50.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SyncBannerCommonView.m58390g(SyncBannerCommonView.this, view);
                }
            });
        }
        this.f56117w = c3295f.m16719a();
        if (c3295f.m16723e().length() != 0 && c3295f.m16722d() >= 0 && c3295f.m16720b() <= c3295f.m16723e().length()) {
            SpannableString spannableString3 = new SpannableString(c3295f.m16723e());
            if (AbstractC3489d.m17501i() && !this.f56119y) {
                String string = getResources().getString(AbstractC8020f0.str_retry);
                AbstractC19074t.m100207e(string, "getString(...)");
                String string2 = getResources().getString(AbstractC8020f0.str_try_again_button);
                AbstractC19074t.m100207e(string2, "getString(...)");
                String string3 = getResources().getString(AbstractC8020f0.login_title);
                AbstractC19074t.m100207e(string3, "getString(...)");
                m127149O = AbstractC24342w.m127149O(c3295f.m16723e(), string, false, 2, null);
                if (m127149O) {
                    str = string3;
                    i11 = 2;
                    m127114D3 = AbstractC24341v.m127114D(c3295f.m16723e().toString(), string, "", false, 4, null);
                    SpannableString spannableString4 = new SpannableString(m127114D3);
                    RobotoTextView robotoTextView4 = this.f56108C;
                    if (robotoTextView4 == null) {
                        AbstractC19074t.m100223u("tvAction");
                        robotoTextView4 = null;
                    }
                    robotoTextView4.setText(string);
                    spannableString = spannableString4;
                } else {
                    str = string3;
                    i11 = 2;
                    spannableString = spannableString3;
                }
                m127149O2 = AbstractC24342w.m127149O(c3295f.m16723e(), string2, false, i11, null);
                if (m127149O2) {
                    str2 = str;
                    i12 = 2;
                    m127114D2 = AbstractC24341v.m127114D(c3295f.m16723e().toString(), string2, "", false, 4, null);
                    SpannableString spannableString5 = new SpannableString(m127114D2);
                    RobotoTextView robotoTextView5 = this.f56108C;
                    if (robotoTextView5 == null) {
                        AbstractC19074t.m100223u("tvAction");
                        robotoTextView5 = null;
                    }
                    robotoTextView5.setText(string2);
                    spannableString2 = spannableString5;
                } else {
                    str2 = str;
                    i12 = 2;
                    spannableString2 = spannableString;
                }
                m127149O3 = AbstractC24342w.m127149O(c3295f.m16723e(), str2, false, i12, null);
                SpannableString spannableString6 = spannableString2;
                if (m127149O3) {
                    m127114D = AbstractC24341v.m127114D(c3295f.m16723e().toString(), str2, "", false, 4, null);
                    SpannableString spannableString7 = new SpannableString(m127114D);
                    RobotoTextView robotoTextView6 = this.f56108C;
                    if (robotoTextView6 == null) {
                        AbstractC19074t.m100223u("tvAction");
                        robotoTextView6 = null;
                    }
                    robotoTextView6.setText(str2);
                    LinearLayout linearLayout = this.f56120z;
                    if (linearLayout == null) {
                        AbstractC19074t.m100223u("containerMsg");
                        linearLayout = null;
                    }
                    linearLayout.setPadding(0, 0, AbstractC23136l9.m118742r(24.0f), 0);
                    requestLayout();
                    invalidate();
                    spannableString6 = spannableString7;
                }
                RobotoTextView robotoTextView7 = this.f56108C;
                if (robotoTextView7 == null) {
                    AbstractC19074t.m100223u("tvAction");
                } else {
                    robotoTextView = robotoTextView7;
                }
                robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: d50.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SyncBannerCommonView.m58391h(SyncBannerCommonView.this, c3295f, view);
                    }
                });
                charSequence = spannableString6;
            } else {
                SpannableString spannableString8 = new SpannableString(c3295f.m16723e());
                spannableString8.setSpan(new C11143b(c3295f), c3295f.m16722d(), c3295f.m16720b(), 33);
                charSequence = spannableString8;
            }
        } else {
            RobotoTextView robotoTextView8 = this.f56108C;
            if (robotoTextView8 == null) {
                AbstractC19074t.m100223u("tvAction");
            } else {
                robotoTextView = robotoTextView8;
            }
            robotoTextView.setText(getResources().getString(AbstractC8020f0.str_close));
            charSequence = c3295f.m16723e();
        }
        setMsgSpanned(charSequence);
    }

    public final int getBackgroundColorRes() {
        return this.f56114t;
    }

    public final boolean getHasIconClose() {
        return this.f56113s;
    }

    public final boolean getHasIconResult() {
        return this.f56112r;
    }

    public final int getIconResultRes() {
        return this.f56110p;
    }

    public final CharSequence getMsgSpanned() {
        return this.f56111q;
    }

    public final InterfaceC11142a getOnSyncBannerListener() {
        return this.f56118x;
    }

    public final int getSyncCommonAction() {
        return this.f56117w;
    }

    public final int getTextColorMsgSpanned() {
        return this.f56116v;
    }

    public final int getTextSizeMsgSpanned() {
        return this.f56115u;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view.getId() == AbstractC6918a0.icon_close) {
            setVisibility(8);
            InterfaceC11142a interfaceC11142a = this.f56118x;
            if (interfaceC11142a != null) {
                interfaceC11142a.mo592Rf(this);
            }
        }
    }

    public final void setBackgroundColorRes(int i11) {
        if (this.f56114t == i11) {
            return;
        }
        this.f56114t = i11;
        setBackgroundColor(i11);
    }

    public final void setHasIconClose(boolean z11) {
        int i11;
        if (this.f56113s == z11) {
            return;
        }
        this.f56113s = z11;
        ImageView imageView = this.f56109D;
        RobotoTextView robotoTextView = null;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconClose");
            imageView = null;
        }
        if (this.f56113s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (AbstractC3489d.m17501i() && !this.f56119y) {
            ImageView imageView2 = this.f56109D;
            if (imageView2 == null) {
                AbstractC19074t.m100223u("iconClose");
                imageView2 = null;
            }
            imageView2.setVisibility(8);
            RobotoTextView robotoTextView2 = this.f56108C;
            if (robotoTextView2 == null) {
                AbstractC19074t.m100223u("tvAction");
            } else {
                robotoTextView = robotoTextView2;
            }
            robotoTextView.setVisibility(0);
            return;
        }
        RobotoTextView robotoTextView3 = this.f56108C;
        if (robotoTextView3 == null) {
            AbstractC19074t.m100223u("tvAction");
        } else {
            robotoTextView = robotoTextView3;
        }
        robotoTextView.setVisibility(8);
    }

    public final void setHasIconResult(boolean z11) {
        int i11;
        if (this.f56112r == z11) {
            return;
        }
        this.f56112r = z11;
        ImageView imageView = this.f56106A;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconResult");
            imageView = null;
        }
        if (this.f56112r) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public final void setIconResultRes(int i11) {
        if (this.f56110p == i11) {
            return;
        }
        this.f56110p = i11;
        ImageView imageView = this.f56106A;
        if (imageView == null) {
            AbstractC19074t.m100223u("iconResult");
            imageView = null;
        }
        imageView.setImageResource(i11);
    }

    public final void setMovementMethod(CustomMovementMethod customMovementMethod) {
        RobotoTextView robotoTextView = this.f56107B;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("txtMsg");
            robotoTextView = null;
        }
        robotoTextView.setMovementMethod(customMovementMethod);
    }

    public final void setMsgSpanned(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        if (AbstractC19074t.m100204b(this.f56111q, charSequence)) {
            return;
        }
        this.f56111q = charSequence;
        RobotoTextView robotoTextView = this.f56107B;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("txtMsg");
            robotoTextView = null;
        }
        robotoTextView.setText(this.f56111q);
    }

    public final void setOnSyncBannerListener(InterfaceC11142a interfaceC11142a) {
        this.f56118x = interfaceC11142a;
    }

    public final void setSyncCommonAction(int i11) {
        this.f56117w = i11;
    }

    public final void setTextColorMsgSpanned(int i11) {
        if (this.f56116v == i11) {
            return;
        }
        this.f56116v = i11;
        RobotoTextView robotoTextView = this.f56107B;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("txtMsg");
            robotoTextView = null;
        }
        robotoTextView.setTextColor(this.f56116v);
    }

    public final void setTextSizeMsgSpanned(int i11) {
        if (this.f56115u == i11) {
            return;
        }
        this.f56115u = i11;
        RobotoTextView robotoTextView = this.f56107B;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("txtMsg");
            robotoTextView = null;
        }
        robotoTextView.setTextSize(0, i11);
    }

    public final void setTransferMsg(boolean z11) {
        this.f56119y = z11;
    }
}
