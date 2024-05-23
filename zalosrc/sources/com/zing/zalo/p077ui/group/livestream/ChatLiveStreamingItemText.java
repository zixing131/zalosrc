package com.zing.zalo.p077ui.group.livestream;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p588vw.C28652r;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28203u6;

/* loaded from: classes5.dex */
public class ChatLiveStreamingItemText extends RelativeLayout {

    /* renamed from: p */
    private CircleImage f62118p;

    /* renamed from: q */
    private RobotoTextView f62119q;

    /* renamed from: r */
    private Context f62120r;

    /* renamed from: s */
    private C23528a f62121s;

    /* renamed from: t */
    public int f62122t;

    /* renamed from: u */
    private CharSequence f62123u;

    public ChatLiveStreamingItemText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62122t = 1;
        this.f62123u = null;
    }

    /* renamed from: a */
    public void m66347a(Context context, int i11) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.chat_live_streaming_text_content, this);
        this.f62119q = (RobotoTextView) findViewById(AbstractC6918a0.tv_chat_msg);
        CircleImage circleImage = (CircleImage) findViewById(AbstractC6918a0.imvAvatar);
        this.f62118p = circleImage;
        circleImage.setStrokePadding(2);
        this.f62122t = i11;
        this.f62120r = context;
        this.f62121s = new C23528a(context);
    }

    /* renamed from: b */
    public void m66348b(C17945a0 c17945a0, boolean z11) {
        ContactProfile m141809c;
        String m94854B4;
        CharSequence charSequence;
        int i11;
        try {
            int m118742r = AbstractC23136l9.m118742r(6.0f);
            int m118742r2 = AbstractC23136l9.m118742r(3.0f);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            if (!z11) {
                m118742r = m118742r2;
            }
            layoutParams.setMargins(m118742r3, m118742r, 0, 0);
            setLayoutParams(layoutParams);
            if (this.f62122t == 0) {
                this.f62119q.setBackgroundResource(AbstractC16803z.live_chat_bubble_black_normal);
                this.f62119q.setTextSize(1, 12.0f);
                this.f62119q.setTextColor(AbstractC1388a.m6961c(this.f62120r, AbstractC16801x.white));
            } else {
                if (c17945a0.m95032V6()) {
                    if (z11) {
                        this.f62119q.setBackgroundResource(AbstractC16803z.live_chat_bubble_blue_normal);
                    } else {
                        this.f62119q.setBackgroundResource(AbstractC16803z.bg_buble_chat_mine_live_streaming);
                    }
                } else if (z11) {
                    this.f62119q.setBackgroundResource(AbstractC16803z.live_chat_bubble_white_normal);
                } else {
                    this.f62119q.setBackgroundResource(AbstractC16803z.bg_buble_chat_live_streaming);
                }
                this.f62119q.setTextSize(1, 12.0f);
                this.f62119q.setTextColor(AbstractC1388a.m6961c(this.f62120r, AbstractC16801x.cMtxt1));
            }
            int m118742r4 = AbstractC23136l9.m118742r(8.0f);
            int m118742r5 = AbstractC23136l9.m118742r(10.0f);
            this.f62119q.setPadding(m118742r5, m118742r4, m118742r5, m118742r4);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (z11) {
                m118742r2 = 0;
            }
            layoutParams2.setMargins(m118742r2, 0, 0, 0);
            layoutParams2.addRule(6, this.f62118p.getId());
            layoutParams2.addRule(1, this.f62118p.getId());
            this.f62119q.setLayoutParams(layoutParams2);
            this.f62119q.setMaxWidth(AbstractC23136l9.m118742r(240.0f));
            if (CoreUtility.f89233i.equals(c17945a0.m94862C4())) {
                m141809c = AbstractC23304d.f113368c0;
            } else {
                m141809c = C28203u6.f131407a.m141809c(c17945a0.m94862C4());
            }
            if (m141809c != null) {
                m94854B4 = m141809c.m40383Q(true, false);
                if (TextUtils.isEmpty(m94854B4)) {
                    m94854B4 = c17945a0.m94854B4();
                }
            } else {
                m94854B4 = c17945a0.m94854B4();
            }
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42446v) && !m141809c.f42446v.equalsIgnoreCase("null")) {
                if (C23302b.f113247a.m120523d(m141809c.f42446v)) {
                    this.f62118p.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m141809c.m40383Q(true, false)), C2343e.m12307a(m141809c.f42434r, false)));
                } else {
                    ((C23528a) this.f62121s.m123612r(this.f62118p)).m123619y(m141809c.f42446v, C23278z2.m120143n(), 10);
                }
            }
            CircleImage circleImage = this.f62118p;
            if (circleImage != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                circleImage.setVisibility(i11);
            }
            if (!TextUtils.isEmpty(c17945a0.m95019U3())) {
                this.f62123u = C28652r.m143349v().m143353D(c17945a0.m95019U3());
                SpannableString spannableString = new SpannableString(m94854B4 + ": ");
                spannableString.setSpan(new StyleSpan(1), 0, (m94854B4 + ": ").length(), 33);
                RobotoTextView robotoTextView = this.f62119q;
                if (z11) {
                    charSequence = TextUtils.concat(spannableString, this.f62123u);
                } else {
                    charSequence = this.f62123u;
                }
                robotoTextView.setText(charSequence);
                if (AbstractC26683d.f126393l) {
                    AbstractC28245z3.m142219b(this.f62119q.getText(), this.f62119q);
                    return;
                }
                return;
            }
            this.f62119q.setText("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        CharSequence charSequence;
        super.onAttachedToWindow();
        if (AbstractC26683d.f126393l && (charSequence = this.f62123u) != null) {
            AbstractC28245z3.m142219b(charSequence, this.f62119q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RobotoTextView robotoTextView;
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l && (robotoTextView = this.f62119q) != null) {
            AbstractC28245z3.m142218a(robotoTextView.getText(), this.f62119q);
        }
    }

    public void setType(int i11) {
        this.f62122t = i11;
    }
}
